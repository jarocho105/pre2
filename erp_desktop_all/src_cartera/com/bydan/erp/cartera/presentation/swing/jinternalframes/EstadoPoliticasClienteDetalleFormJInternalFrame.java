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
import com.bydan.erp.cartera.util.EstadoPoliticasClienteConstantesFunciones;

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
public class EstadoPoliticasClienteDetalleFormJInternalFrame extends EstadoPoliticasClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPoliticasCliente;
	
	protected JMenuBar jmenuBarDetalleEstadoPoliticasCliente;
	
	protected JMenu jmenuDetalleEstadoPoliticasCliente;
	protected JMenu jmenuDetalleArchivoEstadoPoliticasCliente;
	protected JMenu jmenuDetalleAccionesEstadoPoliticasCliente;
	protected JMenu jmenuDetalleDatosEstadoPoliticasCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPoliticasCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoPoliticasCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPoliticasClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPoliticasCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean;
	
	

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;
	
		
	
	public EstadoPoliticasClienteLogic estadopoliticasclienteLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPoliticasCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoPoliticasCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoPoliticasCliente;
	
	protected JPanel jPanelCamposEstadoPoliticasCliente;    
	protected JPanel jPanelCamposOcultosEstadoPoliticasCliente;    	
	protected JPanel jPanelAccionesEstadoPoliticasCliente;
	protected JPanel jPanelAccionesFormularioEstadoPoliticasCliente;
    
	
	
	protected Integer iXPanelCamposEstadoPoliticasCliente=0;
	protected Integer iYPanelCamposEstadoPoliticasCliente=0;
	
	protected Integer iXPanelCamposOcultosEstadoPoliticasCliente=0;
	protected Integer iYPanelCamposOcultosEstadoPoliticasCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPoliticasCliente;
	public JButton jButtonModificarEstadoPoliticasCliente;
	public JButton jButtonActualizarEstadoPoliticasCliente;
    public JButton jButtonEliminarEstadoPoliticasCliente;
	public JButton jButtonCancelarEstadoPoliticasCliente;
    public JButton jButtonGuardarCambiosEstadoPoliticasCliente;
	public JButton jButtonGuardarCambiosTablaEstadoPoliticasCliente;
	protected JButton jButtonCerrarEstadoPoliticasCliente;
	
	
	protected JButton jButtonProcesarInformacionEstadoPoliticasCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPoliticasCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPoliticasCliente;
	protected JButton jButtonModificarToolBarEstadoPoliticasCliente;
	protected JButton jButtonActualizarToolBarEstadoPoliticasCliente;
    protected JButton jButtonEliminarToolBarEstadoPoliticasCliente;
	protected JButton jButtonCancelarToolBarEstadoPoliticasCliente;
    protected JButton jButtonGuardarCambiosToolBarEstadoPoliticasCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPoliticasCliente;
	protected JButton jButtonCerrarToolBarEstadoPoliticasCliente;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPoliticasCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPoliticasCliente;
	protected JMenuItem jMenuItemModificarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemActualizarEstadoPoliticasCliente;
    protected JMenuItem jMenuItemEliminarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemCancelarEstadoPoliticasCliente;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPoliticasCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPoliticasCliente;
	protected JMenuItem jMenuItemCerrarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPoliticasCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPoliticasCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPoliticasCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPoliticasCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPoliticasCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPoliticasCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPoliticasCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPoliticasCliente;
	public JLabel jLabelIdEstadoPoliticasCliente;
	public JTextFieldMe jTextFieldidEstadoPoliticasCliente;
	public JButton jButtonidEstadoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoPoliticasCliente;
	public JLabel jLabelcodigoEstadoPoliticasCliente;
	public JTextField jTextFieldcodigoEstadoPoliticasCliente;
	public JButton jButtoncodigoEstadoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPoliticasCliente;
	public JLabel jLabelnombreEstadoPoliticasCliente;
	public JTextArea jTextAreanombreEstadoPoliticasCliente;
	public JScrollPane jscrollPanenombreEstadoPoliticasCliente;
	public JButton jButtonnombreEstadoPoliticasClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPoliticasCliente;
	
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
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPoliticasCliente=new JPanel();
				this.jPanelAccionesFormularioEstadoPoliticasCliente=new JPanel();
				this.jmenuBarDetalleEstadoPoliticasCliente=new JMenuBar();
				this.jTtoolBarDetalleEstadoPoliticasCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPoliticasClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPoliticasClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPoliticasCliente() {
		return this.jButtonActualizarToolBarEstadoPoliticasCliente;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPoliticasCliente() {
		return this.jButtonEliminarToolBarEstadoPoliticasCliente;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPoliticasCliente() {
		return this.jButtonCancelarToolBarEstadoPoliticasCliente;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPoliticasCliente() {
		return this.jButtonProcesarInformacionEstadoPoliticasCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPoliticasCliente)	{
		this.jButtonProcesarInformacionEstadoPoliticasCliente = jButtonProcesarInformacionEstadoPoliticasCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPoliticasCliente() {
		return this.jComboBoxTiposAccionesEstadoPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposRelacionesEstadoPoliticasCliente) {
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente = jComboBoxTiposRelacionesEstadoPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPoliticasCliente(
			JComboBox jComboBoxTiposAccionesEstadoPoliticasCliente) {
		this.jComboBoxTiposAccionesEstadoPoliticasCliente = jComboBoxTiposAccionesEstadoPoliticasCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPoliticasCliente() {
		return this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPoliticasCliente(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPoliticasCliente) {
		this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente = jComboBoxTiposAccionesFormularioEstadoPoliticasCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		
		this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopoliticasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPoliticasClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Politicas Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPoliticasCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPoliticasCliente=new JButtonMe();
				this.jButtonModificarToolBarEstadoPoliticasCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente,
							"actualizar","actualizar","Actualizar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente,
							"eliminar","eliminar","Eliminar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente,
							"cancelar","cancelar","Cancelar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPoliticasCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPoliticasCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPoliticasCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPoliticasCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPoliticasCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPoliticasCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPoliticasCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPoliticasCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPoliticasCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPoliticasCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPoliticasCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPoliticasCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPoliticasCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPoliticasCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPoliticasCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPoliticasCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPoliticasCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPoliticasCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPoliticasCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPoliticasCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPoliticasCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPoliticasCliente.add(this.jMenuItemDetalleCerrarEstadoPoliticasCliente);
		
		this.jmenuDetalleAccionesEstadoPoliticasCliente.add(this.jMenuItemActualizarEstadoPoliticasCliente);
		this.jmenuDetalleAccionesEstadoPoliticasCliente.add(this.jMenuItemEliminarEstadoPoliticasCliente);
		this.jmenuDetalleAccionesEstadoPoliticasCliente.add(this.jMenuItemCancelarEstadoPoliticasCliente);		
		
		//this.jmenuDetalleDatosEstadoPoliticasCliente.add(this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente);				
		this.jmenuDetalleDatosEstadoPoliticasCliente.add(this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente);				
				
		//this.jmenuDetalleAccionesEstadoPoliticasCliente.add(this.jMenuItemGuardarCambiosEstadoPoliticasCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPoliticasCliente.add(this.jmenuDetalleArchivoEstadoPoliticasCliente);		
		this.jmenuBarDetalleEstadoPoliticasCliente.add(this.jmenuDetalleAccionesEstadoPoliticasCliente);		
		this.jmenuBarDetalleEstadoPoliticasCliente.add(this.jmenuDetalleDatosEstadoPoliticasCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoPoliticasCliente.add(this.jmenuDetalleEstadoPoliticasCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPoliticasCliente);				
	}
	
	
	public void inicializarElementosCamposEstadoPoliticasCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPoliticasCliente = new JLabelMe();
		jLabelIdEstadoPoliticasCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPoliticasCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPoliticasCliente.setToolTipText(EstadoPoliticasClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPoliticasCliente= new GridBagLayout();

		this.jPanelidEstadoPoliticasCliente.setLayout(this.gridaBagLayoutEstadoPoliticasCliente);

		jTextFieldidEstadoPoliticasCliente = new JTextFieldMe();
		jTextFieldidEstadoPoliticasCliente.setText("Id");

		jTextFieldidEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoPoliticasCliente = new JLabelMe();
		this.jLabelcodigoEstadoPoliticasCliente.setText(""+EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoPoliticasCliente.setToolTipText("Codigo");
		this.jLabelcodigoEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoPoliticasCliente.setToolTipText(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoPoliticasCliente = new GridBagLayout();
		this.jPanelcodigoEstadoPoliticasCliente.setLayout(this.gridaBagLayoutEstadoPoliticasCliente);


		jTextFieldcodigoEstadoPoliticasCliente= new JTextFieldMe();

		jTextFieldcodigoEstadoPoliticasCliente.setEnabled(false);
		jTextFieldcodigoEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoPoliticasClienteBusqueda.setText("U");
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoPoliticasClienteBusqueda"));

		if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoPoliticasCliente = new JLabelMe();
		this.jLabelnombreEstadoPoliticasCliente.setText(""+EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPoliticasCliente.setToolTipText("Nombre");
		this.jLabelnombreEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPoliticasCliente.setToolTipText(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPoliticasCliente = new GridBagLayout();
		this.jPanelnombreEstadoPoliticasCliente.setLayout(this.gridaBagLayoutEstadoPoliticasCliente);


		jTextAreanombreEstadoPoliticasCliente= new JTextAreaMe();
		jTextAreanombreEstadoPoliticasCliente.setEnabled(false);
		jTextAreanombreEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPoliticasCliente.setLineWrap(true);
		jTextAreanombreEstadoPoliticasCliente.setWrapStyleWord(true);
		jTextAreanombreEstadoPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPoliticasCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPoliticasCliente = new JScrollPane(jTextAreanombreEstadoPoliticasCliente);
		jscrollPanenombreEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPoliticasClienteBusqueda.setText("U");
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPoliticasClienteBusqueda"));

		if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPoliticasClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPoliticasCliente() {
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
		//this.jInternalFrameDetalleEstadoPoliticasCliente = new EstadoPoliticasClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Politicas Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPoliticasCliente= new GridBagLayout();
		

		
		String sToolTipEstadoPoliticasCliente="";
		sToolTipEstadoPoliticasCliente=EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPoliticasCliente+="(Cartera.EstadoPoliticasCliente)";
		}
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPoliticasCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPoliticasCliente = new JButtonMe();
		this.jButtonModificarEstadoPoliticasCliente = new JButtonMe();
        this.jButtonActualizarEstadoPoliticasCliente = new JButtonMe();
        this.jButtonEliminarEstadoPoliticasCliente = new JButtonMe();
        this.jButtonCancelarEstadoPoliticasCliente = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPoliticasCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente = new JButtonMe();
		this.jButtonCerrarEstadoPoliticasCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPoliticasCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPoliticasCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPoliticasCliente = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Politicas Cliente";
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Politicas Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPoliticasCliente.setName("jPanelCamposEstadoPoliticasCliente"); 

		this.jPanelCamposOcultosEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPoliticasCliente.setName("jPanelCamposOcultosEstadoPoliticasCliente"); 

        this.jPanelAccionesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPoliticasCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPoliticasCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPoliticasCliente.setText("Nuevo");
		this.jButtonModificarEstadoPoliticasCliente.setText("Editar");
        this.jButtonActualizarEstadoPoliticasCliente.setText("Actualizar");
        this.jButtonEliminarEstadoPoliticasCliente.setText("Eliminar");
        this.jButtonCancelarEstadoPoliticasCliente.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPoliticasCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setText("Guardar");
		this.jButtonCerrarEstadoPoliticasCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPoliticasCliente,"nuevo_button","Nuevo",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPoliticasCliente,"modificar_button","Editar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPoliticasCliente,"actualizar_button","Actualizar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPoliticasCliente,"eliminar_button","Eliminar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPoliticasCliente,"cancelar_button","Cancelar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPoliticasCliente,"guardarcambios_button","Guardar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPoliticasCliente,"guardarcambiostabla_button","Guardar",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPoliticasCliente,"cerrar_button","Salir",this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPoliticasCliente.setToolTipText("Nuevo"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPoliticasCliente.setToolTipText("Editar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPoliticasCliente.setToolTipText("Actualizar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPoliticasCliente.setToolTipText("Eliminar)"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPoliticasCliente.setToolTipText("Cancelar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPoliticasCliente.setToolTipText("Guardar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setToolTipText("Guardar"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPoliticasCliente.setToolTipText("Salir"+" "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPoliticasCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPoliticasCliente";
		inputMap = this.jButtonActualizarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPoliticasCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPoliticasCliente";
		inputMap = this.jButtonEliminarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPoliticasCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPoliticasCliente";
		inputMap = this.jButtonCancelarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPoliticasCliente"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPoliticasCliente";
		inputMap = this.jButtonCerrarEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPoliticasCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPoliticasCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPoliticasCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPoliticasCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPoliticasCliente.setToolTipText("Nuevo EstadoPoliticasCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente.setToolTipText("Sin Cerrar Ventana EstadoPoliticasCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPoliticasCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoPoliticasCliente.setText("Acciones");		
		this.jLabelAccionesEstadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPoliticasCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPoliticasCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPoliticasCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPoliticasCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPoliticasCliente = new GridBagLayout();
		
		this.jPanelCamposEstadoPoliticasCliente.setLayout(gridaBagLayoutCamposEstadoPoliticasCliente);
		this.jPanelCamposOcultosEstadoPoliticasCliente.setLayout(gridaBagLayoutCamposOcultosEstadoPoliticasCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPoliticasCliente.add(jLabelIdEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 1;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPoliticasCliente.add(jTextFieldidEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);


	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoPoliticasCliente.add(jLabelcodigoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 2;
		this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoPoliticasCliente.add(jButtoncodigoEstadoPoliticasClienteBusqueda, this.gridBagConstraintsEstadoPoliticasCliente);
	}

	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 1;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoPoliticasCliente.add(jTextFieldcodigoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);


	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPoliticasCliente.add(jLabelnombreEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 2;
		this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPoliticasCliente.add(jButtonnombreEstadoPoliticasClienteBusqueda, this.gridBagConstraintsEstadoPoliticasCliente);
	}

	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = 1;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPoliticasCliente.add(jscrollPanenombreEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = iYPanelCamposEstadoPoliticasCliente;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = iXPanelCamposEstadoPoliticasCliente++;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPoliticasCliente.add(this.jPanelidEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	if(iXPanelCamposEstadoPoliticasCliente % 1==0) {
		iXPanelCamposEstadoPoliticasCliente=0;
		iYPanelCamposEstadoPoliticasCliente++;
	}
	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = iYPanelCamposEstadoPoliticasCliente;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = iXPanelCamposEstadoPoliticasCliente++;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPoliticasCliente.add(this.jPanelcodigoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	if(iXPanelCamposEstadoPoliticasCliente % 1==0) {
		iXPanelCamposEstadoPoliticasCliente=0;
		iYPanelCamposEstadoPoliticasCliente++;
	}
	this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPoliticasCliente.gridy = iYPanelCamposEstadoPoliticasCliente;
	this.gridBagConstraintsEstadoPoliticasCliente.gridx = iXPanelCamposEstadoPoliticasCliente++;
	this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPoliticasCliente.add(this.jPanelnombreEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);



	if(iXPanelCamposEstadoPoliticasCliente % 1==0) {
		iXPanelCamposEstadoPoliticasCliente=0;
		iYPanelCamposEstadoPoliticasCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesEstadoPoliticasCliente.setLayout(gridaBagLayoutAccionesEstadoPoliticasCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPoliticasCliente.setLayout(gridaBagLayoutAccionesFormularioEstadoPoliticasCliente);
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPoliticasCliente.add(this.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);

		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPoliticasCliente.add(this.jCheckBoxPostAccionNuevoEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPoliticasCliente.add(this.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPoliticasCliente.add(this.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonModificarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);							

		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonEliminarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonActualizarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);


		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonGuardarCambiosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);	
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPoliticasCliente.add(this.jButtonCancelarEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPoliticasCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPoliticasCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoPoliticasCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPoliticasCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =0;
		this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPoliticasCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPoliticasCliente = new EstadoPoliticasClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Politicas Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Politicas Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Politicas Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPoliticasClienteModel estadopoliticasclienteModel=new EstadoPoliticasClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPoliticasClienteModel.EstadoPoliticasClienteFocusTraversalPolicy estadopoliticasclienteFocusTraversalPolicy = estadopoliticasclienteModel.new EstadoPoliticasClienteFocusTraversalPolicy(this);
			
			//estadopoliticasclienteFocusTraversalPolicy.setestadopoliticasclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadopoliticasclienteModel);
			
			
			this.jContentPaneDetalleEstadoPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPoliticasCliente = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPoliticasCliente.setLayout(gridaBagLayoutDetalleEstadoPoliticasCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPoliticasCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPoliticasCliente.add(jTtoolBarDetalleEstadoPoliticasCliente, gridBagConstraintsEstadoPoliticasCliente);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente=   new JScrollPane(jContentPaneDetalleEstadoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPoliticasCliente.add(jPanelCamposEstadoPoliticasCliente, gridBagConstraintsEstadoPoliticasCliente);
			
			
			
			
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
						&& estadopoliticasclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					
					if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPoliticasCliente= new GridBagConstraints();
						this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
						this.jContentPaneDetalleEstadoPoliticasCliente.add(this.jTabbedPaneRelacionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPoliticasCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPoliticasCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
					this.gridBagConstraintsEstadoPoliticasCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPoliticasCliente.add(jPanelCamposOcultosEstadoPoliticasCliente, gridBagConstraintsEstadoPoliticasCliente);
				
					this.jPanelCamposOcultosEstadoPoliticasCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	        this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPoliticasCliente.add(this.jPanelAccionesFormularioEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);							
			
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPoliticasCliente.add(this.jPanelAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPoliticasCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente=   new JScrollPane(this.jPanelCamposEstadoPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
			this.gridBagConstraintsEstadoPoliticasCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPoliticasCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPoliticasCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);			
			
			this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
			
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		
			
		this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoPoliticasCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPoliticasCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPoliticasCliente, this.gridBagConstraintsEstadoPoliticasCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPoliticasCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPoliticasCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePoliticasCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		this.politicasclienteSessionBean.setConGuardarRelaciones(false);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicasclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsEstadoPoliticasCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPoliticasCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPoliticasCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoPoliticasCliente.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPoliticasCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPoliticasCliente.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPoliticasCliente.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesEstadoPoliticasCliente.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<EstadoPoliticasCliente> estadopoliticasclientes,EstadoPoliticasCliente estadopoliticascliente,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.estadopoliticasclienteLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.setestadopoliticasclientesForeignKey(estadopoliticasclientes);
					politicasclienteBeanSwingJInternalFrame.setestadopoliticasclienteForeignKey(estadopoliticascliente);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidEstadoPoliticasClienteActual(estadopoliticascliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.setid_estado_politicas_clienteFK_IdEstadoPoliticasCliente(estadopoliticascliente.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPoliticasClienteForeignKey(estadopoliticascliente,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPoliticasCliente");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPoliticasCliente");
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticasCliente("n",politicasclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicasclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingPoliticasCliente(false);
					politicasclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicasclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("relacionado");
					} else {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");
					}

					politicasclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticasCliente().setVisible(false);

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
