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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.EstadoDetalleClienteConstantesFunciones;

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
public class EstadoDetalleClienteDetalleFormJInternalFrame extends EstadoDetalleClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleCliente;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleCliente;
	
	protected JMenu jmenuDetalleEstadoDetalleCliente;
	protected JMenu jmenuDetalleArchivoEstadoDetalleCliente;
	protected JMenu jmenuDetalleAccionesEstadoDetalleCliente;
	protected JMenu jmenuDetalleDatosEstadoDetalleCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
	
	

	public DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame=null;
	public DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleProve=false;
	public DetalleProveSessionBean detalleproveSessionBean;

	public DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFrame=null;
	public DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMoviClienProve=false;
	public DetalleMoviClienProveSessionBean detallemoviclienproveSessionBean;

	public DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame=null;
	public DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCliente=false;
	public DetalleClienteSessionBean detalleclienteSessionBean;
	
		
	
	public EstadoDetalleClienteLogic estadodetalleclienteLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleCliente;
	
	protected JPanel jPanelCamposEstadoDetalleCliente;    
	protected JPanel jPanelCamposOcultosEstadoDetalleCliente;    	
	protected JPanel jPanelAccionesEstadoDetalleCliente;
	protected JPanel jPanelAccionesFormularioEstadoDetalleCliente;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleCliente=0;
	protected Integer iYPanelCamposEstadoDetalleCliente=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleCliente=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleCliente;
	public JButton jButtonModificarEstadoDetalleCliente;
	public JButton jButtonActualizarEstadoDetalleCliente;
    public JButton jButtonEliminarEstadoDetalleCliente;
	public JButton jButtonCancelarEstadoDetalleCliente;
    public JButton jButtonGuardarCambiosEstadoDetalleCliente;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleCliente;
	protected JButton jButtonCerrarEstadoDetalleCliente;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleCliente;
	protected JButton jButtonModificarToolBarEstadoDetalleCliente;
	protected JButton jButtonActualizarToolBarEstadoDetalleCliente;
    protected JButton jButtonEliminarToolBarEstadoDetalleCliente;
	protected JButton jButtonCancelarToolBarEstadoDetalleCliente;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleCliente;
	protected JButton jButtonCerrarToolBarEstadoDetalleCliente;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleCliente;
	protected JMenuItem jMenuItemModificarEstadoDetalleCliente;
	protected JMenuItem jMenuItemActualizarEstadoDetalleCliente;
    protected JMenuItem jMenuItemEliminarEstadoDetalleCliente;
	protected JMenuItem jMenuItemCancelarEstadoDetalleCliente;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleCliente;
	protected JMenuItem jMenuItemCerrarEstadoDetalleCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleCliente;
	public JLabel jLabelIdEstadoDetalleCliente;
	public JLabel jLabelidEstadoDetalleCliente;
	public JButton jButtonidEstadoDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleCliente;
	public JLabel jLabelcodigoEstadoDetalleCliente;
	public JTextField jTextFieldcodigoEstadoDetalleCliente;
	public JButton jButtoncodigoEstadoDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleCliente;
	public JLabel jLabelnombreEstadoDetalleCliente;
	public JTextArea jTextAreanombreEstadoDetalleCliente;
	public JScrollPane jscrollPanenombreEstadoDetalleCliente;
	public JButton jButtonnombreEstadoDetalleClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleCliente;
	
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
	
	public EstadoDetalleClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleCliente=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleCliente=new JPanel();
				this.jmenuBarDetalleEstadoDetalleCliente=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleCliente() {
		return this.jButtonActualizarToolBarEstadoDetalleCliente;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleCliente() {
		return this.jButtonEliminarToolBarEstadoDetalleCliente;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleCliente() {
		return this.jButtonCancelarToolBarEstadoDetalleCliente;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleCliente() {
		return this.jButtonProcesarInformacionEstadoDetalleCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleCliente)	{
		this.jButtonProcesarInformacionEstadoDetalleCliente = jButtonProcesarInformacionEstadoDetalleCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleCliente() {
		return this.jComboBoxTiposAccionesEstadoDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleCliente(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleCliente) {
		this.jComboBoxTiposRelacionesEstadoDetalleCliente = jComboBoxTiposRelacionesEstadoDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleCliente(
			JComboBox jComboBoxTiposAccionesEstadoDetalleCliente) {
		this.jComboBoxTiposAccionesEstadoDetalleCliente = jComboBoxTiposAccionesEstadoDetalleCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleCliente() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleCliente(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleCliente) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente = jComboBoxTiposAccionesFormularioEstadoDetalleCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		
		this.estadodetalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleproveSessionBean=new DetalleProveSessionBean();
		//this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		//this.detalleclienteSessionBean=new DetalleClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleCliente=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleCliente.add(this.jMenuItemDetalleCerrarEstadoDetalleCliente);
		
		this.jmenuDetalleAccionesEstadoDetalleCliente.add(this.jMenuItemActualizarEstadoDetalleCliente);
		this.jmenuDetalleAccionesEstadoDetalleCliente.add(this.jMenuItemEliminarEstadoDetalleCliente);
		this.jmenuDetalleAccionesEstadoDetalleCliente.add(this.jMenuItemCancelarEstadoDetalleCliente);		
		
		//this.jmenuDetalleDatosEstadoDetalleCliente.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente);				
		this.jmenuDetalleDatosEstadoDetalleCliente.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente);				
				
		//this.jmenuDetalleAccionesEstadoDetalleCliente.add(this.jMenuItemGuardarCambiosEstadoDetalleCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleCliente.add(this.jmenuDetalleArchivoEstadoDetalleCliente);		
		this.jmenuBarDetalleEstadoDetalleCliente.add(this.jmenuDetalleAccionesEstadoDetalleCliente);		
		this.jmenuBarDetalleEstadoDetalleCliente.add(this.jmenuDetalleDatosEstadoDetalleCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetalleCliente.add(this.jmenuDetalleEstadoDetalleCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleCliente);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleCliente = new JLabelMe();
		jLabelIdEstadoDetalleCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleCliente.setToolTipText(EstadoDetalleClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleCliente= new GridBagLayout();

		this.jPanelidEstadoDetalleCliente.setLayout(this.gridaBagLayoutEstadoDetalleCliente);

		jLabelidEstadoDetalleCliente = new JLabel();
		jLabelidEstadoDetalleCliente.setText("Id");

		jLabelidEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleCliente = new JLabelMe();
		this.jLabelcodigoEstadoDetalleCliente.setText(""+EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleCliente.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleCliente.setToolTipText(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleCliente = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleCliente.setLayout(this.gridaBagLayoutEstadoDetalleCliente);


		jTextFieldcodigoEstadoDetalleCliente= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleCliente.setEnabled(false);
		jTextFieldcodigoEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleClienteBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleClienteBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleClienteBusqueda"));

		if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleCliente = new JLabelMe();
		this.jLabelnombreEstadoDetalleCliente.setText(""+EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleCliente.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleCliente.setToolTipText(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleCliente = new GridBagLayout();
		this.jPanelnombreEstadoDetalleCliente.setLayout(this.gridaBagLayoutEstadoDetalleCliente);


		jTextAreanombreEstadoDetalleCliente= new JTextAreaMe();
		jTextAreanombreEstadoDetalleCliente.setEnabled(false);
		jTextAreanombreEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleCliente.setLineWrap(true);
		jTextAreanombreEstadoDetalleCliente.setWrapStyleWord(true);
		jTextAreanombreEstadoDetalleCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetalleCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetalleCliente = new JScrollPane(jTextAreanombreEstadoDetalleCliente);
		jscrollPanenombreEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetalleClienteBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleClienteBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleClienteBusqueda"));

		if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleCliente() {
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
		//this.jInternalFrameDetalleEstadoDetalleCliente = new EstadoDetalleClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleCliente= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleCliente="";
		sToolTipEstadoDetalleCliente=EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleCliente+="(Cartera.EstadoDetalleCliente)";
		}
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleCliente = new JButtonMe();
		this.jButtonModificarEstadoDetalleCliente = new JButtonMe();
        this.jButtonActualizarEstadoDetalleCliente = new JButtonMe();
        this.jButtonEliminarEstadoDetalleCliente = new JButtonMe();
        this.jButtonCancelarEstadoDetalleCliente = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente = new JButtonMe();
		this.jButtonCerrarEstadoDetalleCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleCliente = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Cliente";
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleCliente.setName("jPanelCamposEstadoDetalleCliente"); 

		this.jPanelCamposOcultosEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleCliente.setName("jPanelCamposOcultosEstadoDetalleCliente"); 

        this.jPanelAccionesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleCliente.setText("Nuevo");
		this.jButtonModificarEstadoDetalleCliente.setText("Editar");
        this.jButtonActualizarEstadoDetalleCliente.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleCliente.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleCliente.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setText("Guardar");
		this.jButtonCerrarEstadoDetalleCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleCliente,"nuevo_button","Nuevo",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleCliente,"modificar_button","Editar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleCliente,"actualizar_button","Actualizar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleCliente,"eliminar_button","Eliminar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleCliente,"cancelar_button","Cancelar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleCliente,"guardarcambios_button","Guardar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleCliente,"guardarcambiostabla_button","Guardar",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleCliente,"cerrar_button","Salir",this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleCliente.setToolTipText("Nuevo"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleCliente.setToolTipText("Editar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleCliente.setToolTipText("Actualizar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleCliente.setToolTipText("Eliminar)"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleCliente.setToolTipText("Cancelar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleCliente.setToolTipText("Guardar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setToolTipText("Guardar"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleCliente.setToolTipText("Salir"+" "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleCliente";
		inputMap = this.jButtonNuevoEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleCliente";
		inputMap = this.jButtonActualizarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleCliente";
		inputMap = this.jButtonEliminarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleCliente";
		inputMap = this.jButtonCancelarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleCliente"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleCliente";
		inputMap = this.jButtonCerrarEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleCliente.setToolTipText("Nuevo EstadoDetalleCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente.setToolTipText("Sin Cerrar Ventana EstadoDetalleCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleCliente.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleCliente = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleCliente.setLayout(gridaBagLayoutCamposEstadoDetalleCliente);
		this.jPanelCamposOcultosEstadoDetalleCliente.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleCliente.add(jLabelIdEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 1;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleCliente.add(jLabelidEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);


	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleCliente.add(jLabelcodigoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 2;
		this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleCliente.add(jButtoncodigoEstadoDetalleClienteBusqueda, this.gridBagConstraintsEstadoDetalleCliente);
	}

	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 1;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleCliente.add(jTextFieldcodigoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);


	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleCliente.add(jLabelnombreEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 2;
		this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleCliente.add(jButtonnombreEstadoDetalleClienteBusqueda, this.gridBagConstraintsEstadoDetalleCliente);
	}

	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = 1;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleCliente.add(jscrollPanenombreEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = iYPanelCamposEstadoDetalleCliente;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = iXPanelCamposEstadoDetalleCliente++;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleCliente.add(this.jPanelidEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	if(iXPanelCamposEstadoDetalleCliente % 1==0) {
		iXPanelCamposEstadoDetalleCliente=0;
		iYPanelCamposEstadoDetalleCliente++;
	}
	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = iYPanelCamposEstadoDetalleCliente;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = iXPanelCamposEstadoDetalleCliente++;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleCliente.add(this.jPanelcodigoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	if(iXPanelCamposEstadoDetalleCliente % 1==0) {
		iXPanelCamposEstadoDetalleCliente=0;
		iYPanelCamposEstadoDetalleCliente++;
	}
	this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleCliente.gridy = iYPanelCamposEstadoDetalleCliente;
	this.gridBagConstraintsEstadoDetalleCliente.gridx = iXPanelCamposEstadoDetalleCliente++;
	this.gridBagConstraintsEstadoDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleCliente.add(this.jPanelnombreEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);



	if(iXPanelCamposEstadoDetalleCliente % 1==0) {
		iXPanelCamposEstadoDetalleCliente=0;
		iYPanelCamposEstadoDetalleCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleCliente= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleCliente.setLayout(gridaBagLayoutAccionesEstadoDetalleCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleCliente= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleCliente.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleCliente);
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleCliente.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);

		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleCliente.add(this.jCheckBoxPostAccionNuevoEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleCliente.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleCliente.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonModificarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);							

		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;
		this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonEliminarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonActualizarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);


		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonGuardarCambiosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);	
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleCliente.add(this.jButtonCancelarEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleCliente.gridx =0;
		this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleCliente = new EstadoDetalleClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleClienteModel estadodetalleclienteModel=new EstadoDetalleClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleClienteModel.EstadoDetalleClienteFocusTraversalPolicy estadodetalleclienteFocusTraversalPolicy = estadodetalleclienteModel.new EstadoDetalleClienteFocusTraversalPolicy(this);
			
			//estadodetalleclienteFocusTraversalPolicy.setestadodetalleclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetalleclienteModel);
			
			
			this.jContentPaneDetalleEstadoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleCliente = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleCliente.setLayout(gridaBagLayoutDetalleEstadoDetalleCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleCliente.add(jTtoolBarDetalleEstadoDetalleCliente, gridBagConstraintsEstadoDetalleCliente);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleCliente=   new JScrollPane(jContentPaneDetalleEstadoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleCliente.add(jPanelCamposEstadoDetalleCliente, gridBagConstraintsEstadoDetalleCliente);
			
			
			
			
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
						&& estadodetalleclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleCliente(this.puedeCargarPorParteDetalleCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(this.puedeCargarPorParteDetalleMoviClienProve,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleProve(this.puedeCargarPorParteDetalleProve,false,-1);
					
					if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleCliente= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleCliente.add(this.jTabbedPaneRelacionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleProve(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleCliente.add(jPanelCamposOcultosEstadoDetalleCliente, gridBagConstraintsEstadoDetalleCliente);
				
					this.jPanelCamposOcultosEstadoDetalleCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleCliente.add(this.jPanelAccionesFormularioEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);							
			
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleCliente.add(this.jPanelAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleCliente=   new JScrollPane(this.jPanelCamposEstadoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
			this.gridBagConstraintsEstadoDetalleCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);			
			
			this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
			
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		
			
		this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleCliente, this.gridBagConstraintsEstadoDetalleCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleclienteSessionBean=new DetalleClienteSessionBean();
		this.detalleclienteSessionBean.setConGuardarRelaciones(false);
		this.detalleclienteSessionBean.setEsGuardarRelacionado(true);

		this.detalleclienteBeanSwingJInternalFrame=null;//new DetalleClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleclienteBeanSwingJInternalFramePopup=new DetalleClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleclienteSessionBean.getEsGuardarRelacionado()) {

				DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleclienteSessionBean.setEsGuardarRelacionado(true);

				this.detalleclienteBeanSwingJInternalFrame=new DetalleClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleclienteBeanSwingJInternalFrame.setdetalleclienteSessionBean(this.detalleclienteSessionBean);

				//this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleCliente.add(this.detalleclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Clientes",this.detalleclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.setComponentAt(iIndexTab,this.detalleclienteBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleclienteSessionBean.setEsGuardarRelacionado(false);
				this.detalleclienteBeanSwingJInternalFrame=null;//new DetalleClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCliente) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		this.detallemoviclienproveSessionBean.setConGuardarRelaciones(false);
		this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(true);

		this.detallemoviclienproveBeanSwingJInternalFrame=null;//new DetalleMoviClienProveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemoviclienproveBeanSwingJInternalFramePopup=new DetalleMoviClienProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemoviclienproveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {

				DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(true);

				this.detallemoviclienproveBeanSwingJInternalFrame=new DetalleMoviClienProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemoviclienproveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemoviclienproveBeanSwingJInternalFrame.setdetallemoviclienproveSessionBean(this.detallemoviclienproveSessionBean);

				//this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleCliente.add(this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Clientes",this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.setComponentAt(iIndexTab,this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(false);
				this.detallemoviclienproveBeanSwingJInternalFrame=null;//new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMoviClienProve) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleProve(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleproveSessionBean=new DetalleProveSessionBean();
		this.detalleproveSessionBean.setConGuardarRelaciones(false);
		this.detalleproveSessionBean.setEsGuardarRelacionado(true);

		this.detalleproveBeanSwingJInternalFrame=null;//new DetalleProveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleproveBeanSwingJInternalFramePopup=new DetalleProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleproveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleproveSessionBean.getEsGuardarRelacionado()) {

				DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleproveSessionBean.setEsGuardarRelacionado(true);

				this.detalleproveBeanSwingJInternalFrame=new DetalleProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleproveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleproveBeanSwingJInternalFrame.setdetalleproveSessionBean(this.detalleproveSessionBean);

				//this.gridBagConstraintsEstadoDetalleCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleCliente.add(this.detalleproveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Proves",this.detalleproveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.setComponentAt(iIndexTab,this.detalleproveBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleproveSessionBean.setEsGuardarRelacionado(false);
				this.detalleproveBeanSwingJInternalFrame=null;//new DetalleProveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleproveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleProve) {
					this.jTabbedPaneRelacionesEstadoDetalleCliente.add("Detalle Proves",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleProveBeanSwingJInternalFrame(List<EstadoDetalleCliente> estadodetalleclientes,EstadoDetalleCliente estadodetallecliente,DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleproveBeanSwingJInternalFrame=new DetalleProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleproveBeanSwingJInternalFrame.getDetalleProveLogic().setConnexion(this.estadodetalleclienteLogic.getConnexion());

					detalleproveBeanSwingJInternalFrame.setestadodetalleclientesForeignKey(estadodetalleclientes);
					detalleproveBeanSwingJInternalFrame.setestadodetalleclienteForeignKey(estadodetallecliente);
					detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
					detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setlidEstadoDetalleClienteActual(estadodetallecliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleproveBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleProve(detalleproveBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleproveBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleCliente(true);
					detalleproveBeanSwingJInternalFrame.setid_estado_detalle_clienteFK_IdEstadoDetalleCliente(estadodetallecliente.getId());

					if(!this.conCargarFormDetalle) {
						detalleproveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleproveBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleClienteForeignKey(estadodetallecliente,1,false,true,true);
					detalleproveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleproveBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleCliente");
					detalleproveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleCliente");
					detalleproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProve(true);
					detalleproveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleProve("n",detalleproveBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleproveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleproveBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleproveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProve("relacionado");
					} else {
						detalleproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProve("no_relacionado");
					}

					detalleproveBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleProve().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleMoviClienProveBeanSwingJInternalFrame(List<EstadoDetalleCliente> estadodetalleclientes,EstadoDetalleCliente estadodetallecliente,DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemoviclienproveBeanSwingJInternalFrame=new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemoviclienproveBeanSwingJInternalFrame.getDetalleMoviClienProveLogic().setConnexion(this.estadodetalleclienteLogic.getConnexion());

					detallemoviclienproveBeanSwingJInternalFrame.setestadodetalleclientesForeignKey(estadodetalleclientes);
					detallemoviclienproveBeanSwingJInternalFrame.setestadodetalleclienteForeignKey(estadodetallecliente);
					detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
					detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setlidEstadoDetalleClienteActual(estadodetallecliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemoviclienproveBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMoviClienProve(detallemoviclienproveBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemoviclienproveBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleCliente(true);
					detallemoviclienproveBeanSwingJInternalFrame.setid_estado_detalle_clienteFK_IdEstadoDetalleCliente(estadodetallecliente.getId());

					if(!this.conCargarFormDetalle) {
						detallemoviclienproveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemoviclienproveBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleClienteForeignKey(estadodetallecliente,1,false,true,true);
					detallemoviclienproveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemoviclienproveBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleCliente");
					detallemoviclienproveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleCliente");
					detallemoviclienproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMoviClienProve(true);
					detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMoviClienProve("n",detallemoviclienproveBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemoviclienproveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemoviclienproveBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemoviclienproveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMoviClienProve("relacionado");
					} else {
						detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMoviClienProve("no_relacionado");
					}

					detallemoviclienproveBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMoviClienProve().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleClienteBeanSwingJInternalFrame(List<EstadoDetalleCliente> estadodetalleclientes,EstadoDetalleCliente estadodetallecliente,DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleclienteBeanSwingJInternalFrame=new DetalleClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleclienteBeanSwingJInternalFrame.getDetalleClienteLogic().setConnexion(this.estadodetalleclienteLogic.getConnexion());

					detalleclienteBeanSwingJInternalFrame.setestadodetalleclientesForeignKey(estadodetalleclientes);
					detalleclienteBeanSwingJInternalFrame.setestadodetalleclienteForeignKey(estadodetallecliente);
					detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
					detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setlidEstadoDetalleClienteActual(estadodetallecliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleclienteBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCliente(detalleclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleCliente(true);
					detalleclienteBeanSwingJInternalFrame.setid_estado_detalle_clienteFK_IdEstadoDetalleCliente(estadodetallecliente.getId());

					if(!this.conCargarFormDetalle) {
						detalleclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleClienteForeignKey(estadodetallecliente,1,false,true,true);
					detalleclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleCliente");
					detalleclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleCliente");
					detalleclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCliente(true);
					detalleclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCliente("n",detalleclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleclienteBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCliente("relacionado");
					} else {
						detalleclienteBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCliente("no_relacionado");
					}

					detalleclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCliente().setVisible(false);

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
