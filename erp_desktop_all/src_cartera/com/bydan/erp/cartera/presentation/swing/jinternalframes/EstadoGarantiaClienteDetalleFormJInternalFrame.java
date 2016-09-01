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
import com.bydan.erp.cartera.util.EstadoGarantiaClienteConstantesFunciones;

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
public class EstadoGarantiaClienteDetalleFormJInternalFrame extends EstadoGarantiaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoGarantiaCliente;
	
	protected JMenuBar jmenuBarDetalleEstadoGarantiaCliente;
	
	protected JMenu jmenuDetalleEstadoGarantiaCliente;
	protected JMenu jmenuDetalleArchivoEstadoGarantiaCliente;
	protected JMenu jmenuDetalleAccionesEstadoGarantiaCliente;
	protected JMenu jmenuDetalleDatosEstadoGarantiaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoGarantiaCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoGarantiaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoGarantiaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoGarantiaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean;
	
	

	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame=null;
	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGarantiaCliente=false;
	public GarantiaClienteSessionBean garantiaclienteSessionBean;
	
		
	
	public EstadoGarantiaClienteLogic estadogarantiaclienteLogic;
	
	public JScrollPane jScrollPanelDatosEstadoGarantiaCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoGarantiaCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoGarantiaCliente;
	
	protected JPanel jPanelCamposEstadoGarantiaCliente;    
	protected JPanel jPanelCamposOcultosEstadoGarantiaCliente;    	
	protected JPanel jPanelAccionesEstadoGarantiaCliente;
	protected JPanel jPanelAccionesFormularioEstadoGarantiaCliente;
    
	
	
	protected Integer iXPanelCamposEstadoGarantiaCliente=0;
	protected Integer iYPanelCamposEstadoGarantiaCliente=0;
	
	protected Integer iXPanelCamposOcultosEstadoGarantiaCliente=0;
	protected Integer iYPanelCamposOcultosEstadoGarantiaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoGarantiaCliente;
	public JButton jButtonModificarEstadoGarantiaCliente;
	public JButton jButtonActualizarEstadoGarantiaCliente;
    public JButton jButtonEliminarEstadoGarantiaCliente;
	public JButton jButtonCancelarEstadoGarantiaCliente;
    public JButton jButtonGuardarCambiosEstadoGarantiaCliente;
	public JButton jButtonGuardarCambiosTablaEstadoGarantiaCliente;
	protected JButton jButtonCerrarEstadoGarantiaCliente;
	
	
	protected JButton jButtonProcesarInformacionEstadoGarantiaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoGarantiaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoGarantiaCliente;
	protected JButton jButtonModificarToolBarEstadoGarantiaCliente;
	protected JButton jButtonActualizarToolBarEstadoGarantiaCliente;
    protected JButton jButtonEliminarToolBarEstadoGarantiaCliente;
	protected JButton jButtonCancelarToolBarEstadoGarantiaCliente;
    protected JButton jButtonGuardarCambiosToolBarEstadoGarantiaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoGarantiaCliente;
	protected JButton jButtonCerrarToolBarEstadoGarantiaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoGarantiaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoGarantiaCliente;
	protected JMenuItem jMenuItemModificarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemActualizarEstadoGarantiaCliente;
    protected JMenuItem jMenuItemEliminarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemCancelarEstadoGarantiaCliente;
    protected JMenuItem jMenuItemGuardarCambiosEstadoGarantiaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoGarantiaCliente;
	protected JMenuItem jMenuItemCerrarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoGarantiaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoGarantiaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoGarantiaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoGarantiaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoGarantiaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoGarantiaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoGarantiaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoGarantiaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoGarantiaCliente;
	public JLabel jLabelIdEstadoGarantiaCliente;
	public JTextFieldMe jTextFieldidEstadoGarantiaCliente;
	public JButton jButtonidEstadoGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoGarantiaCliente;
	public JLabel jLabelcodigoEstadoGarantiaCliente;
	public JTextField jTextFieldcodigoEstadoGarantiaCliente;
	public JButton jButtoncodigoEstadoGarantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoGarantiaCliente;
	public JLabel jLabelnombreEstadoGarantiaCliente;
	public JTextArea jTextAreanombreEstadoGarantiaCliente;
	public JScrollPane jscrollPanenombreEstadoGarantiaCliente;
	public JButton jButtonnombreEstadoGarantiaClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoGarantiaCliente;
	
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
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoGarantiaCliente=new JPanel();
				this.jPanelAccionesFormularioEstadoGarantiaCliente=new JPanel();
				this.jmenuBarDetalleEstadoGarantiaCliente=new JMenuBar();
				this.jTtoolBarDetalleEstadoGarantiaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoGarantiaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGarantiaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoGarantiaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoGarantiaCliente() {
		return this.jButtonActualizarToolBarEstadoGarantiaCliente;
	}
	
	public JButton getjButtonEliminarToolBarEstadoGarantiaCliente() {
		return this.jButtonEliminarToolBarEstadoGarantiaCliente;
	}
	
	public JButton getjButtonCancelarToolBarEstadoGarantiaCliente() {
		return this.jButtonCancelarToolBarEstadoGarantiaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoGarantiaCliente() {
		return this.jButtonProcesarInformacionEstadoGarantiaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoGarantiaCliente)	{
		this.jButtonProcesarInformacionEstadoGarantiaCliente = jButtonProcesarInformacionEstadoGarantiaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoGarantiaCliente() {
		return this.jComboBoxTiposAccionesEstadoGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposRelacionesEstadoGarantiaCliente) {
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente = jComboBoxTiposRelacionesEstadoGarantiaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoGarantiaCliente(
			JComboBox jComboBoxTiposAccionesEstadoGarantiaCliente) {
		this.jComboBoxTiposAccionesEstadoGarantiaCliente = jComboBoxTiposAccionesEstadoGarantiaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoGarantiaCliente() {
		return this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoGarantiaCliente(
			JComboBox jComboBoxTiposAccionesFormularioEstadoGarantiaCliente) {
		this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente = jComboBoxTiposAccionesFormularioEstadoGarantiaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		
		this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogarantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoGarantiaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Garantia Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoGarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoGarantiaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoGarantiaCliente=new JButtonMe();
				this.jButtonModificarToolBarEstadoGarantiaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente,
							"actualizar","actualizar","Actualizar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente,
							"eliminar","eliminar","Eliminar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente,
							"cancelar","cancelar","Cancelar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoGarantiaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoGarantiaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoGarantiaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoGarantiaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoGarantiaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoGarantiaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoGarantiaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoGarantiaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoGarantiaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoGarantiaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoGarantiaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoGarantiaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoGarantiaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoGarantiaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoGarantiaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoGarantiaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoGarantiaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoGarantiaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoGarantiaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoGarantiaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoGarantiaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoGarantiaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoGarantiaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoGarantiaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoGarantiaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoGarantiaCliente.add(this.jMenuItemDetalleCerrarEstadoGarantiaCliente);
		
		this.jmenuDetalleAccionesEstadoGarantiaCliente.add(this.jMenuItemActualizarEstadoGarantiaCliente);
		this.jmenuDetalleAccionesEstadoGarantiaCliente.add(this.jMenuItemEliminarEstadoGarantiaCliente);
		this.jmenuDetalleAccionesEstadoGarantiaCliente.add(this.jMenuItemCancelarEstadoGarantiaCliente);		
		
		//this.jmenuDetalleDatosEstadoGarantiaCliente.add(this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente);				
		this.jmenuDetalleDatosEstadoGarantiaCliente.add(this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente);				
				
		//this.jmenuDetalleAccionesEstadoGarantiaCliente.add(this.jMenuItemGuardarCambiosEstadoGarantiaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoGarantiaCliente.add(this.jmenuDetalleArchivoEstadoGarantiaCliente);		
		this.jmenuBarDetalleEstadoGarantiaCliente.add(this.jmenuDetalleAccionesEstadoGarantiaCliente);		
		this.jmenuBarDetalleEstadoGarantiaCliente.add(this.jmenuDetalleDatosEstadoGarantiaCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoGarantiaCliente.add(this.jmenuDetalleEstadoGarantiaCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoGarantiaCliente);				
	}
	
	
	public void inicializarElementosCamposEstadoGarantiaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoGarantiaCliente = new JLabelMe();
		jLabelIdEstadoGarantiaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoGarantiaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoGarantiaCliente.setToolTipText(EstadoGarantiaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoGarantiaCliente= new GridBagLayout();

		this.jPanelidEstadoGarantiaCliente.setLayout(this.gridaBagLayoutEstadoGarantiaCliente);

		jTextFieldidEstadoGarantiaCliente = new JTextFieldMe();
		jTextFieldidEstadoGarantiaCliente.setText("Id");

		jTextFieldidEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoGarantiaCliente = new JLabelMe();
		this.jLabelcodigoEstadoGarantiaCliente.setText(""+EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoGarantiaCliente.setToolTipText("Codigo");
		this.jLabelcodigoEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoGarantiaCliente.setToolTipText(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoGarantiaCliente = new GridBagLayout();
		this.jPanelcodigoEstadoGarantiaCliente.setLayout(this.gridaBagLayoutEstadoGarantiaCliente);


		jTextFieldcodigoEstadoGarantiaCliente= new JTextFieldMe();

		jTextFieldcodigoEstadoGarantiaCliente.setEnabled(false);
		jTextFieldcodigoEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoGarantiaClienteBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoGarantiaClienteBusqueda.setText("U");
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoGarantiaClienteBusqueda"));

		if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoGarantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoGarantiaCliente = new JLabelMe();
		this.jLabelnombreEstadoGarantiaCliente.setText(""+EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoGarantiaCliente.setToolTipText("Nombre");
		this.jLabelnombreEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoGarantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoGarantiaCliente.setToolTipText(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoGarantiaCliente = new GridBagLayout();
		this.jPanelnombreEstadoGarantiaCliente.setLayout(this.gridaBagLayoutEstadoGarantiaCliente);


		jTextAreanombreEstadoGarantiaCliente= new JTextAreaMe();
		jTextAreanombreEstadoGarantiaCliente.setEnabled(false);
		jTextAreanombreEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGarantiaCliente.setLineWrap(true);
		jTextAreanombreEstadoGarantiaCliente.setWrapStyleWord(true);
		jTextAreanombreEstadoGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoGarantiaCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoGarantiaCliente = new JScrollPane(jTextAreanombreEstadoGarantiaCliente);
		jscrollPanenombreEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoGarantiaClienteBusqueda= new JButtonMe();
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoGarantiaClienteBusqueda.setText("U");
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoGarantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoGarantiaClienteBusqueda"));

		if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoGarantiaClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoGarantiaCliente() {
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
		//this.jInternalFrameDetalleEstadoGarantiaCliente = new EstadoGarantiaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Garantia Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoGarantiaCliente= new GridBagLayout();
		

		
		String sToolTipEstadoGarantiaCliente="";
		sToolTipEstadoGarantiaCliente=EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoGarantiaCliente+="(Cartera.EstadoGarantiaCliente)";
		}
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoGarantiaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoGarantiaCliente = new JButtonMe();
		this.jButtonModificarEstadoGarantiaCliente = new JButtonMe();
        this.jButtonActualizarEstadoGarantiaCliente = new JButtonMe();
        this.jButtonEliminarEstadoGarantiaCliente = new JButtonMe();
        this.jButtonCancelarEstadoGarantiaCliente = new JButtonMe();
        this.jButtonGuardarCambiosEstadoGarantiaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente = new JButtonMe();
		this.jButtonCerrarEstadoGarantiaCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoGarantiaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoGarantiaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoGarantiaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Garantia Cliente";
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Garantia Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoGarantiaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoGarantiaCliente.setName("jPanelCamposEstadoGarantiaCliente"); 

		this.jPanelCamposOcultosEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoGarantiaCliente.setName("jPanelCamposOcultosEstadoGarantiaCliente"); 

        this.jPanelAccionesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoGarantiaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoGarantiaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoGarantiaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoGarantiaCliente.setText("Nuevo");
		this.jButtonModificarEstadoGarantiaCliente.setText("Editar");
        this.jButtonActualizarEstadoGarantiaCliente.setText("Actualizar");
        this.jButtonEliminarEstadoGarantiaCliente.setText("Eliminar");
        this.jButtonCancelarEstadoGarantiaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoGarantiaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setText("Guardar");
		this.jButtonCerrarEstadoGarantiaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoGarantiaCliente,"nuevo_button","Nuevo",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoGarantiaCliente,"modificar_button","Editar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoGarantiaCliente,"actualizar_button","Actualizar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoGarantiaCliente,"eliminar_button","Eliminar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoGarantiaCliente,"cancelar_button","Cancelar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoGarantiaCliente,"guardarcambios_button","Guardar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoGarantiaCliente,"guardarcambiostabla_button","Guardar",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoGarantiaCliente,"cerrar_button","Salir",this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoGarantiaCliente.setToolTipText("Nuevo"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoGarantiaCliente.setToolTipText("Editar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoGarantiaCliente.setToolTipText("Actualizar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoGarantiaCliente.setToolTipText("Eliminar)"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoGarantiaCliente.setToolTipText("Cancelar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoGarantiaCliente.setToolTipText("Guardar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setToolTipText("Guardar"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoGarantiaCliente.setToolTipText("Salir"+" "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoGarantiaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoGarantiaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoGarantiaCliente";
		inputMap = this.jButtonActualizarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoGarantiaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoGarantiaCliente";
		inputMap = this.jButtonEliminarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoGarantiaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoGarantiaCliente";
		inputMap = this.jButtonCancelarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoGarantiaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoGarantiaCliente";
		inputMap = this.jButtonCerrarEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoGarantiaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoGarantiaCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoGarantiaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoGarantiaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoGarantiaCliente.setToolTipText("Nuevo EstadoGarantiaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente.setToolTipText("Sin Cerrar Ventana EstadoGarantiaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoGarantiaCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoGarantiaCliente.setText("Acciones");		
		this.jLabelAccionesEstadoGarantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGarantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGarantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoGarantiaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoGarantiaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoGarantiaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoGarantiaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoGarantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoGarantiaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoGarantiaCliente = new GridBagLayout();
		
		this.jPanelCamposEstadoGarantiaCliente.setLayout(gridaBagLayoutCamposEstadoGarantiaCliente);
		this.jPanelCamposOcultosEstadoGarantiaCliente.setLayout(gridaBagLayoutCamposOcultosEstadoGarantiaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoGarantiaCliente.add(jLabelIdEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 1;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoGarantiaCliente.add(jTextFieldidEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);


	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoGarantiaCliente.add(jLabelcodigoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 2;
		this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoGarantiaCliente.add(jButtoncodigoEstadoGarantiaClienteBusqueda, this.gridBagConstraintsEstadoGarantiaCliente);
	}

	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 1;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoGarantiaCliente.add(jTextFieldcodigoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);


	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoGarantiaCliente.add(jLabelnombreEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 2;
		this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoGarantiaCliente.add(jButtonnombreEstadoGarantiaClienteBusqueda, this.gridBagConstraintsEstadoGarantiaCliente);
	}

	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = 1;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoGarantiaCliente.add(jscrollPanenombreEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = iYPanelCamposEstadoGarantiaCliente;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = iXPanelCamposEstadoGarantiaCliente++;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGarantiaCliente.add(this.jPanelidEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	if(iXPanelCamposEstadoGarantiaCliente % 1==0) {
		iXPanelCamposEstadoGarantiaCliente=0;
		iYPanelCamposEstadoGarantiaCliente++;
	}
	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = iYPanelCamposEstadoGarantiaCliente;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = iXPanelCamposEstadoGarantiaCliente++;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGarantiaCliente.add(this.jPanelcodigoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	if(iXPanelCamposEstadoGarantiaCliente % 1==0) {
		iXPanelCamposEstadoGarantiaCliente=0;
		iYPanelCamposEstadoGarantiaCliente++;
	}
	this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGarantiaCliente.gridy = iYPanelCamposEstadoGarantiaCliente;
	this.gridBagConstraintsEstadoGarantiaCliente.gridx = iXPanelCamposEstadoGarantiaCliente++;
	this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGarantiaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGarantiaCliente.add(this.jPanelnombreEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);



	if(iXPanelCamposEstadoGarantiaCliente % 1==0) {
		iXPanelCamposEstadoGarantiaCliente=0;
		iYPanelCamposEstadoGarantiaCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesEstadoGarantiaCliente.setLayout(gridaBagLayoutAccionesEstadoGarantiaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoGarantiaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoGarantiaCliente.setLayout(gridaBagLayoutAccionesFormularioEstadoGarantiaCliente);
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoGarantiaCliente.add(this.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);

		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoGarantiaCliente.add(this.jCheckBoxPostAccionNuevoEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoGarantiaCliente.add(this.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoGarantiaCliente.add(this.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonModificarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);							

		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonEliminarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonActualizarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);


		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonGuardarCambiosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);	
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = 0;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoGarantiaCliente.add(this.jButtonCancelarEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoGarantiaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoGarantiaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoGarantiaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoGarantiaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =0;
		this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoGarantiaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoGarantiaCliente = new EstadoGarantiaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Garantia Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Garantia Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Garantia Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoGarantiaClienteModel estadogarantiaclienteModel=new EstadoGarantiaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoGarantiaClienteModel.EstadoGarantiaClienteFocusTraversalPolicy estadogarantiaclienteFocusTraversalPolicy = estadogarantiaclienteModel.new EstadoGarantiaClienteFocusTraversalPolicy(this);
			
			//estadogarantiaclienteFocusTraversalPolicy.setestadogarantiaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadogarantiaclienteModel);
			
			
			this.jContentPaneDetalleEstadoGarantiaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoGarantiaCliente = new GridBagLayout();	
			this.jContentPaneDetalleEstadoGarantiaCliente.setLayout(gridaBagLayoutDetalleEstadoGarantiaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoGarantiaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoGarantiaCliente.add(jTtoolBarDetalleEstadoGarantiaCliente, gridBagConstraintsEstadoGarantiaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente=   new JScrollPane(jContentPaneDetalleEstadoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	        
			this.jContentPaneDetalleEstadoGarantiaCliente.add(jPanelCamposEstadoGarantiaCliente, gridBagConstraintsEstadoGarantiaCliente);
			
			
			
			
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
						&& estadogarantiaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(this.puedeCargarPorParteGarantiaCliente,false,-1);
					
					if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoGarantiaCliente= new GridBagConstraints();
						this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
						this.jContentPaneDetalleEstadoGarantiaCliente.add(this.jTabbedPaneRelacionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoGarantiaCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoGarantiaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
					this.gridBagConstraintsEstadoGarantiaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoGarantiaCliente.add(jPanelCamposOcultosEstadoGarantiaCliente, gridBagConstraintsEstadoGarantiaCliente);
				
					this.jPanelCamposOcultosEstadoGarantiaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	        this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoGarantiaCliente.add(this.jPanelAccionesFormularioEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);							
			
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
	        this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoGarantiaCliente.add(this.jPanelAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoGarantiaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente=   new JScrollPane(this.jPanelCamposEstadoGarantiaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
			this.gridBagConstraintsEstadoGarantiaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoGarantiaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoGarantiaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);			
			
			this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
			
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		
			
		this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoGarantiaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGarantiaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoGarantiaCliente, this.gridBagConstraintsEstadoGarantiaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoGarantiaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoGarantiaCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameGarantiaCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		this.garantiaclienteSessionBean.setConGuardarRelaciones(false);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

		this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.garantiaclienteBeanSwingJInternalFramePopup=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.garantiaclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {

				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoGarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

				this.garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.garantiaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.garantiaclienteBeanSwingJInternalFrame.setgarantiaclienteSessionBean(this.garantiaclienteSessionBean);

				//this.gridBagConstraintsEstadoGarantiaCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoGarantiaCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoGarantiaCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoGarantiaCliente.add(this.garantiaclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoGarantiaCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoGarantiaCliente.add("Garantia Clientes",this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoGarantiaCliente.setComponentAt(iIndexTab,this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				}

				//GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
				this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGarantiaCliente) {
					this.jTabbedPaneRelacionesEstadoGarantiaCliente.add("Garantia Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarGarantiaClienteBeanSwingJInternalFrame(List<EstadoGarantiaCliente> estadogarantiaclientes,EstadoGarantiaCliente estadogarantiacliente,GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					garantiaclienteBeanSwingJInternalFrame.getGarantiaClienteLogic().setConnexion(this.estadogarantiaclienteLogic.getConnexion());

					garantiaclienteBeanSwingJInternalFrame.setestadogarantiaclientesForeignKey(estadogarantiaclientes);
					garantiaclienteBeanSwingJInternalFrame.setestadogarantiaclienteForeignKey(estadogarantiacliente);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoGarantiaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setlidEstadoGarantiaClienteActual(estadogarantiacliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					garantiaclienteBeanSwingJInternalFrame.cargarCombosForeignKeyGarantiaCliente(garantiaclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					garantiaclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoGarantiaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.setid_estado_garantia_clienteFK_IdEstadoGarantiaCliente(estadogarantiacliente.getId());

					if(!this.conCargarFormDetalle) {
						garantiaclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					garantiaclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoGarantiaClienteForeignKey(estadogarantiacliente,1,false,true,true);
					garantiaclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					garantiaclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoGarantiaCliente");
					garantiaclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoGarantiaCliente");
					garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGarantiaCliente("n",garantiaclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, garantiaclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					garantiaclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					garantiaclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("relacionado");
					} else {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("no_relacionado");
					}

					garantiaclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionGarantiaCliente().setVisible(false);

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
