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
import com.bydan.erp.cartera.util.EstadoClienteConstantesFunciones;

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
public class EstadoClienteDetalleFormJInternalFrame extends EstadoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoCliente;
	
	protected JMenuBar jmenuBarDetalleEstadoCliente;
	
	protected JMenu jmenuDetalleEstadoCliente;
	protected JMenu jmenuDetalleArchivoEstadoCliente;
	protected JMenu jmenuDetalleAccionesEstadoCliente;
	protected JMenu jmenuDetalleDatosEstadoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoClienteSessionBean estadoclienteSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;
	
		
	
	public EstadoClienteLogic estadoclienteLogic;
	
	public JScrollPane jScrollPanelDatosEstadoCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoCliente;
	
	protected JPanel jPanelCamposEstadoCliente;    
	protected JPanel jPanelCamposOcultosEstadoCliente;    	
	protected JPanel jPanelAccionesEstadoCliente;
	protected JPanel jPanelAccionesFormularioEstadoCliente;
    
	
	
	protected Integer iXPanelCamposEstadoCliente=0;
	protected Integer iYPanelCamposEstadoCliente=0;
	
	protected Integer iXPanelCamposOcultosEstadoCliente=0;
	protected Integer iYPanelCamposOcultosEstadoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoCliente;
	public JButton jButtonModificarEstadoCliente;
	public JButton jButtonActualizarEstadoCliente;
    public JButton jButtonEliminarEstadoCliente;
	public JButton jButtonCancelarEstadoCliente;
    public JButton jButtonGuardarCambiosEstadoCliente;
	public JButton jButtonGuardarCambiosTablaEstadoCliente;
	protected JButton jButtonCerrarEstadoCliente;
	
	
	protected JButton jButtonProcesarInformacionEstadoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCliente;
	protected JButton jButtonModificarToolBarEstadoCliente;
	protected JButton jButtonActualizarToolBarEstadoCliente;
    protected JButton jButtonEliminarToolBarEstadoCliente;
	protected JButton jButtonCancelarToolBarEstadoCliente;
    protected JButton jButtonGuardarCambiosToolBarEstadoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCliente;
	protected JButton jButtonCerrarToolBarEstadoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCliente;
	protected JMenuItem jMenuItemModificarEstadoCliente;
	protected JMenuItem jMenuItemActualizarEstadoCliente;
    protected JMenuItem jMenuItemEliminarEstadoCliente;
	protected JMenuItem jMenuItemCancelarEstadoCliente;
    protected JMenuItem jMenuItemGuardarCambiosEstadoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCliente;
	protected JMenuItem jMenuItemCerrarEstadoCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoCliente;
	public JLabel jLabelIdEstadoCliente;
	public JTextFieldMe jTextFieldidEstadoCliente;
	public JButton jButtonidEstadoClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoCliente;
	public JLabel jLabelcodigoEstadoCliente;
	public JTextField jTextFieldcodigoEstadoCliente;
	public JButton jButtoncodigoEstadoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoCliente;
	public JLabel jLabelnombreEstadoCliente;
	public JTextArea jTextAreanombreEstadoCliente;
	public JScrollPane jscrollPanenombreEstadoCliente;
	public JButton jButtonnombreEstadoClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoEstadoCliente;
	public JLabel jLabeles_defectoEstadoCliente;
	public JCheckBox jCheckBoxes_defectoEstadoCliente;
	public JButton jButtones_defectoEstadoClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoCliente;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoCliente=new JPanel();
				this.jPanelAccionesFormularioEstadoCliente=new JPanel();
				this.jmenuBarDetalleEstadoCliente=new JMenuBar();
				this.jTtoolBarDetalleEstadoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoCliente() {
		return this.jButtonActualizarToolBarEstadoCliente;
	}
	
	public JButton getjButtonEliminarToolBarEstadoCliente() {
		return this.jButtonEliminarToolBarEstadoCliente;
	}
	
	public JButton getjButtonCancelarToolBarEstadoCliente() {
		return this.jButtonCancelarToolBarEstadoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoCliente() {
		return this.jButtonProcesarInformacionEstadoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCliente)	{
		this.jButtonProcesarInformacionEstadoCliente = jButtonProcesarInformacionEstadoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCliente() {
		return this.jComboBoxTiposAccionesEstadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCliente(
			JComboBox jComboBoxTiposRelacionesEstadoCliente) {
		this.jComboBoxTiposRelacionesEstadoCliente = jComboBoxTiposRelacionesEstadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCliente(
			JComboBox jComboBoxTiposAccionesEstadoCliente) {
		this.jComboBoxTiposAccionesEstadoCliente = jComboBoxTiposAccionesEstadoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoCliente() {
		return this.jComboBoxTiposAccionesFormularioEstadoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoCliente(
			JComboBox jComboBoxTiposAccionesFormularioEstadoCliente) {
		this.jComboBoxTiposAccionesFormularioEstadoCliente = jComboBoxTiposAccionesFormularioEstadoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoclienteSessionBean=new EstadoClienteSessionBean();
		
		this.estadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoCliente=new JButtonMe();
				this.jButtonModificarToolBarEstadoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente,
							"actualizar","actualizar","Actualizar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente,
							"eliminar","eliminar","Eliminar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente,
							"cancelar","cancelar","Cancelar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoCliente.add(this.jMenuItemDetalleCerrarEstadoCliente);
		
		this.jmenuDetalleAccionesEstadoCliente.add(this.jMenuItemActualizarEstadoCliente);
		this.jmenuDetalleAccionesEstadoCliente.add(this.jMenuItemEliminarEstadoCliente);
		this.jmenuDetalleAccionesEstadoCliente.add(this.jMenuItemCancelarEstadoCliente);		
		
		//this.jmenuDetalleDatosEstadoCliente.add(this.jMenuItemDetalleAbrirOrderByEstadoCliente);				
		this.jmenuDetalleDatosEstadoCliente.add(this.jMenuItemDetalleMostarOcultarEstadoCliente);				
				
		//this.jmenuDetalleAccionesEstadoCliente.add(this.jMenuItemGuardarCambiosEstadoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoCliente.add(this.jmenuDetalleArchivoEstadoCliente);		
		this.jmenuBarDetalleEstadoCliente.add(this.jmenuDetalleAccionesEstadoCliente);		
		this.jmenuBarDetalleEstadoCliente.add(this.jmenuDetalleDatosEstadoCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoCliente.add(this.jmenuDetalleEstadoCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoCliente);				
	}
	
	
	public void inicializarElementosCamposEstadoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoCliente = new JLabelMe();
		jLabelIdEstadoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoCliente.setToolTipText(EstadoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoCliente= new GridBagLayout();

		this.jPanelidEstadoCliente.setLayout(this.gridaBagLayoutEstadoCliente);

		jTextFieldidEstadoCliente = new JTextFieldMe();
		jTextFieldidEstadoCliente.setText("Id");

		jTextFieldidEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoCliente = new JLabelMe();
		this.jLabelcodigoEstadoCliente.setText(""+EstadoClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoCliente.setToolTipText("Codigo");
		this.jLabelcodigoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoCliente.setToolTipText(EstadoClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoCliente = new GridBagLayout();
		this.jPanelcodigoEstadoCliente.setLayout(this.gridaBagLayoutEstadoCliente);


		jTextFieldcodigoEstadoCliente= new JTextFieldMe();

		jTextFieldcodigoEstadoCliente.setEnabled(false);
		jTextFieldcodigoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoClienteBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoClienteBusqueda.setText("U");
		this.jButtoncodigoEstadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoClienteBusqueda"));

		if(this.estadoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoCliente = new JLabelMe();
		this.jLabelnombreEstadoCliente.setText(""+EstadoClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoCliente.setToolTipText("Nombre");
		this.jLabelnombreEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoCliente.setToolTipText(EstadoClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoCliente = new GridBagLayout();
		this.jPanelnombreEstadoCliente.setLayout(this.gridaBagLayoutEstadoCliente);


		jTextAreanombreEstadoCliente= new JTextAreaMe();
		jTextAreanombreEstadoCliente.setEnabled(false);
		jTextAreanombreEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCliente.setLineWrap(true);
		jTextAreanombreEstadoCliente.setWrapStyleWord(true);
		jTextAreanombreEstadoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoCliente = new JScrollPane(jTextAreanombreEstadoCliente);
		jscrollPanenombreEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoClienteBusqueda= new JButtonMe();
		this.jButtonnombreEstadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoClienteBusqueda.setText("U");
		this.jButtonnombreEstadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoClienteBusqueda"));

		if(this.estadoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoEstadoCliente = new JLabelMe();
		this.jLabeles_defectoEstadoCliente.setText(""+EstadoClienteConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoEstadoCliente.setToolTipText("Es Defecto");
		this.jLabeles_defectoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoEstadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoEstadoCliente.setToolTipText(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutEstadoCliente = new GridBagLayout();
		this.jPaneles_defectoEstadoCliente.setLayout(this.gridaBagLayoutEstadoCliente);


		jCheckBoxes_defectoEstadoCliente= new JCheckBoxMe();
		jCheckBoxes_defectoEstadoCliente.setEnabled(false);

		jCheckBoxes_defectoEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoEstadoClienteBusqueda= new JButtonMe();
		this.jButtones_defectoEstadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoEstadoClienteBusqueda.setText("U");
		this.jButtones_defectoEstadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoEstadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoEstadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoEstadoClienteBusqueda"));

		if(this.estadoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoEstadoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoCliente() {
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
		//this.jInternalFrameDetalleEstadoCliente = new EstadoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCliente= new GridBagLayout();
		

		
		String sToolTipEstadoCliente="";
		sToolTipEstadoCliente=EstadoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCliente+="(Cartera.EstadoCliente)";
		}
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoCliente = new JButtonMe();
		this.jButtonModificarEstadoCliente = new JButtonMe();
        this.jButtonActualizarEstadoCliente = new JButtonMe();
        this.jButtonEliminarEstadoCliente = new JButtonMe();
        this.jButtonCancelarEstadoCliente = new JButtonMe();
        this.jButtonGuardarCambiosEstadoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoCliente = new JButtonMe();
		this.jButtonCerrarEstadoCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cliente";
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoCliente.setName("jPanelCamposEstadoCliente"); 

		this.jPanelCamposOcultosEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoCliente.setName("jPanelCamposOcultosEstadoCliente"); 

        this.jPanelAccionesEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoCliente.setText("Nuevo");
		this.jButtonModificarEstadoCliente.setText("Editar");
        this.jButtonActualizarEstadoCliente.setText("Actualizar");
        this.jButtonEliminarEstadoCliente.setText("Eliminar");
        this.jButtonCancelarEstadoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoCliente.setText("Guardar");
		this.jButtonCerrarEstadoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCliente,"nuevo_button","Nuevo",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoCliente,"modificar_button","Editar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoCliente,"actualizar_button","Actualizar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoCliente,"eliminar_button","Eliminar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoCliente,"cancelar_button","Cancelar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoCliente,"guardarcambios_button","Guardar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCliente,"guardarcambiostabla_button","Guardar",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCliente,"cerrar_button","Salir",this.estadoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoCliente.setToolTipText("Nuevo"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoCliente.setToolTipText("Editar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoCliente.setToolTipText("Actualizar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoCliente.setToolTipText("Eliminar)"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoCliente.setToolTipText("Cancelar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoCliente.setToolTipText("Guardar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoCliente.setToolTipText("Guardar"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCliente.setToolTipText("Salir"+" "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCliente";
		inputMap = this.jButtonNuevoEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoCliente";
		inputMap = this.jButtonActualizarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoCliente";
		inputMap = this.jButtonEliminarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoCliente";
		inputMap = this.jButtonCancelarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoCliente";
		inputMap = this.jButtonCerrarEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoCliente.setToolTipText("Nuevo EstadoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoCliente.setToolTipText("Sin Cerrar Ventana EstadoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoCliente.setText("Acciones");		
		this.jLabelAccionesEstadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoCliente = new GridBagLayout();
		
		this.jPanelCamposEstadoCliente.setLayout(gridaBagLayoutCamposEstadoCliente);
		this.jPanelCamposOcultosEstadoCliente.setLayout(gridaBagLayoutCamposOcultosEstadoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 0;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoCliente.add(jLabelIdEstadoCliente, this.gridBagConstraintsEstadoCliente);



	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 1;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoCliente.add(jTextFieldidEstadoCliente, this.gridBagConstraintsEstadoCliente);


	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 0;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoCliente.add(jLabelcodigoEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx = 2;
		this.gridBagConstraintsEstadoCliente.ipadx = 0;
		this.gridBagConstraintsEstadoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoCliente.add(jButtoncodigoEstadoClienteBusqueda, this.gridBagConstraintsEstadoCliente);
	}

	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 1;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoCliente.add(jTextFieldcodigoEstadoCliente, this.gridBagConstraintsEstadoCliente);


	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 0;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoCliente.add(jLabelnombreEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx = 2;
		this.gridBagConstraintsEstadoCliente.ipadx = 0;
		this.gridBagConstraintsEstadoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoCliente.add(jButtonnombreEstadoClienteBusqueda, this.gridBagConstraintsEstadoCliente);
	}

	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 1;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoCliente.add(jscrollPanenombreEstadoCliente, this.gridBagConstraintsEstadoCliente);


	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 0;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoEstadoCliente.add(jLabeles_defectoEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx = 2;
		this.gridBagConstraintsEstadoCliente.ipadx = 0;
		this.gridBagConstraintsEstadoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoEstadoCliente.add(jButtones_defectoEstadoClienteBusqueda, this.gridBagConstraintsEstadoCliente);
	}

	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCliente.gridy = 0;
	this.gridBagConstraintsEstadoCliente.gridx = 1;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoEstadoCliente.add(jCheckBoxes_defectoEstadoCliente, this.gridBagConstraintsEstadoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCliente.gridy = iYPanelCamposEstadoCliente;
	this.gridBagConstraintsEstadoCliente.gridx = iXPanelCamposEstadoCliente++;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCliente.add(this.jPanelidEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(iXPanelCamposEstadoCliente % 1==0) {
		iXPanelCamposEstadoCliente=0;
		iYPanelCamposEstadoCliente++;
	}
	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCliente.gridy = iYPanelCamposEstadoCliente;
	this.gridBagConstraintsEstadoCliente.gridx = iXPanelCamposEstadoCliente++;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCliente.add(this.jPanelcodigoEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(iXPanelCamposEstadoCliente % 1==0) {
		iXPanelCamposEstadoCliente=0;
		iYPanelCamposEstadoCliente++;
	}
	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCliente.gridy = iYPanelCamposEstadoCliente;
	this.gridBagConstraintsEstadoCliente.gridx = iXPanelCamposEstadoCliente++;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCliente.add(this.jPanelnombreEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(iXPanelCamposEstadoCliente % 1==0) {
		iXPanelCamposEstadoCliente=0;
		iYPanelCamposEstadoCliente++;
	}
	this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCliente.gridy = iYPanelCamposEstadoCliente;
	this.gridBagConstraintsEstadoCliente.gridx = iXPanelCamposEstadoCliente++;
	this.gridBagConstraintsEstadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCliente.add(this.jPaneles_defectoEstadoCliente, this.gridBagConstraintsEstadoCliente);



	if(iXPanelCamposEstadoCliente % 1==0) {
		iXPanelCamposEstadoCliente=0;
		iYPanelCamposEstadoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoCliente= new GridBagLayout();
		this.jPanelAccionesEstadoCliente.setLayout(gridaBagLayoutAccionesEstadoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoCliente.setLayout(gridaBagLayoutAccionesFormularioEstadoCliente);
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCliente.add(this.jComboBoxTiposAccionesFormularioEstadoCliente, this.gridBagConstraintsEstadoCliente);

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCliente.add(this.jCheckBoxPostAccionNuevoEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCliente.add(this.jCheckBoxPostAccionSinCerrarEstadoCliente, this.gridBagConstraintsEstadoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCliente.add(this.jCheckBoxPostAccionSinMensajeEstadoCliente, this.gridBagConstraintsEstadoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoCliente.add(this.jButtonModificarEstadoCliente, this.gridBagConstraintsEstadoCliente);							

		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCliente.gridy = 0;
		this.gridBagConstraintsEstadoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoCliente.add(this.jButtonEliminarEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = 0;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCliente.add(this.jButtonActualizarEstadoCliente, this.gridBagConstraintsEstadoCliente);


		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = 0;		
		this.gridBagConstraintsEstadoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCliente.add(this.jButtonGuardarCambiosEstadoCliente, this.gridBagConstraintsEstadoCliente);	
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = 0;		
		this.gridBagConstraintsEstadoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoCliente.add(this.jButtonCancelarEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCliente.gridx =0;
		this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCliente, this.gridBagConstraintsEstadoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoCliente = new EstadoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoClienteModel estadoclienteModel=new EstadoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoClienteModel.EstadoClienteFocusTraversalPolicy estadoclienteFocusTraversalPolicy = estadoclienteModel.new EstadoClienteFocusTraversalPolicy(this);
			
			//estadoclienteFocusTraversalPolicy.setestadoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoclienteModel);
			
			
			this.jContentPaneDetalleEstadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoCliente = new GridBagLayout();	
			this.jContentPaneDetalleEstadoCliente.setLayout(gridaBagLayoutDetalleEstadoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoCliente.add(jTtoolBarDetalleEstadoCliente, gridBagConstraintsEstadoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoCliente=   new JScrollPane(jContentPaneDetalleEstadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoCliente.gridx = 0;
	        
			this.jContentPaneDetalleEstadoCliente.add(jPanelCamposEstadoCliente, gridBagConstraintsEstadoCliente);
			
			
			
			
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
						&& estadoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					
					if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoCliente= new GridBagConstraints();
						this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoCliente.gridx = 0;
						this.jContentPaneDetalleEstadoCliente.add(this.jTabbedPaneRelacionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
					this.gridBagConstraintsEstadoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoCliente.add(jPanelCamposOcultosEstadoCliente, gridBagConstraintsEstadoCliente);
				
					this.jPanelCamposOcultosEstadoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoCliente.gridx = 0;
	        this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoCliente.add(this.jPanelAccionesFormularioEstadoCliente, this.gridBagConstraintsEstadoCliente);							
			
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
	        this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoCliente.add(this.jPanelAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoCliente=   new JScrollPane(this.jPanelCamposEstadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCliente.gridx = 0;
			this.gridBagConstraintsEstadoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoCliente, this.gridBagConstraintsEstadoCliente);			
			
			this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCliente, this.gridBagConstraintsEstadoCliente);
			
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCliente, this.gridBagConstraintsEstadoCliente);
		
			
		this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCliente, this.gridBagConstraintsEstadoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoCliente;
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsEstadoCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoCliente.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCliente.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCliente.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesEstadoCliente.add("Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<EstadoCliente> estadoclientes,EstadoCliente estadocliente,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.estadoclienteLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setestadoclientesForeignKey(estadoclientes);
					clienteBeanSwingJInternalFrame.setestadoclienteForeignKey(estadocliente);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCliente(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidEstadoClienteActual(estadocliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCliente(true);
					clienteBeanSwingJInternalFrame.setid_estado_clienteFK_IdEstadoCliente(estadocliente.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoClienteForeignKey(estadocliente,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCliente");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCliente");
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
