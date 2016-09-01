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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ListadoClientesConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ListadoClientesDetalleFormJInternalFrame extends ListadoClientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadoClientes;
	
	protected JMenuBar jmenuBarDetalleListadoClientes;
	
	protected JMenu jmenuDetalleListadoClientes;
	protected JMenu jmenuDetalleArchivoListadoClientes;
	protected JMenu jmenuDetalleAccionesListadoClientes;
	protected JMenu jmenuDetalleDatosListadoClientes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoClientes;	
	protected GridBagConstraints gridBagConstraintsListadoClientes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadoClientesBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadoClientes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoClientesSessionBean listadoclientesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadoClientesLogic listadoclientesLogic;
	
	public JScrollPane jScrollPanelDatosListadoClientes;
	public JScrollPane jScrollPanelDatosEdicionListadoClientes;
	public JScrollPane jScrollPanelDatosGeneralListadoClientes;
	
	protected JPanel jPanelCamposListadoClientes;    
	protected JPanel jPanelCamposOcultosListadoClientes;    	
	protected JPanel jPanelAccionesListadoClientes;
	protected JPanel jPanelAccionesFormularioListadoClientes;
    
	
	
	protected Integer iXPanelCamposListadoClientes=0;
	protected Integer iYPanelCamposListadoClientes=0;
	
	protected Integer iXPanelCamposOcultosListadoClientes=0;
	protected Integer iYPanelCamposOcultosListadoClientes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadoClientes;
	public JButton jButtonModificarListadoClientes;
	public JButton jButtonActualizarListadoClientes;
    public JButton jButtonEliminarListadoClientes;
	public JButton jButtonCancelarListadoClientes;
    public JButton jButtonGuardarCambiosListadoClientes;
	public JButton jButtonGuardarCambiosTablaListadoClientes;
	protected JButton jButtonCerrarListadoClientes;
	
	
	protected JButton jButtonProcesarInformacionListadoClientes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadoClientes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadoClientes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadoClientes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoClientes;
	protected JButton jButtonModificarToolBarListadoClientes;
	protected JButton jButtonActualizarToolBarListadoClientes;
    protected JButton jButtonEliminarToolBarListadoClientes;
	protected JButton jButtonCancelarToolBarListadoClientes;
    protected JButton jButtonGuardarCambiosToolBarListadoClientes;
	protected JButton jButtonGuardarCambiosTablaToolBarListadoClientes;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoClientes;
	protected JButton jButtonCerrarToolBarListadoClientes;
	
	protected JButton jButtonProcesarInformacionToolBarListadoClientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoClientes;
	protected JMenuItem jMenuItemModificarListadoClientes;
	protected JMenuItem jMenuItemActualizarListadoClientes;
    protected JMenuItem jMenuItemEliminarListadoClientes;
	protected JMenuItem jMenuItemCancelarListadoClientes;
    protected JMenuItem jMenuItemGuardarCambiosListadoClientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoClientes;
	protected JMenuItem jMenuItemCerrarListadoClientes;
	protected JMenuItem jMenuItemDetalleCerrarListadoClientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoClientes;
	
	protected JMenuItem jMenuItemProcesarInformacionListadoClientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoClientes;
	protected JMenuItem jMenuItemMostrarOcultarListadoClientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoClientes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoClientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoClientes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadoClientes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadoClientes;
	public JLabel jLabelIdListadoClientes;
	public JLabel jLabelidListadoClientes;
	public JButton jButtonidListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaListadoClientes;
	public JLabel jLabelnombre_zonaListadoClientes;
	public JTextField jTextFieldnombre_zonaListadoClientes;
	public JButton jButtonnombre_zonaListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadListadoClientes;
	public JLabel jLabelnombre_ciudadListadoClientes;
	public JTextArea jTextAreanombre_ciudadListadoClientes;
	public JScrollPane jscrollPanenombre_ciudadListadoClientes;
	public JButton jButtonnombre_ciudadListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteListadoClientes;
	public JLabel jLabelnombre_grupo_clienteListadoClientes;
	public JTextArea jTextAreanombre_grupo_clienteListadoClientes;
	public JScrollPane jscrollPanenombre_grupo_clienteListadoClientes;
	public JButton jButtonnombre_grupo_clienteListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadoClientes;
	public JLabel jLabelcodigoListadoClientes;
	public JTextField jTextFieldcodigoListadoClientes;
	public JButton jButtoncodigoListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelnombreListadoClientes;
	public JLabel jLabelnombreListadoClientes;
	public JTextArea jTextAreanombreListadoClientes;
	public JScrollPane jscrollPanenombreListadoClientes;
	public JButton jButtonnombreListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelapellidoListadoClientes;
	public JLabel jLabelapellidoListadoClientes;
	public JTextArea jTextAreaapellidoListadoClientes;
	public JScrollPane jscrollPaneapellidoListadoClientes;
	public JButton jButtonapellidoListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelrucListadoClientes;
	public JLabel jLabelrucListadoClientes;
	public JTextField jTextFieldrucListadoClientes;
	public JButton jButtonrucListadoClientesBusqueda= new JButtonMe();

	public JPanel jPaneltelefonosListadoClientes;
	public JLabel jLabeltelefonosListadoClientes;
	public JTextArea jTextAreatelefonosListadoClientes;
	public JScrollPane jscrollPanetelefonosListadoClientes;
	public JButton jButtontelefonosListadoClientesBusqueda= new JButtonMe();

	public JPanel jPaneldireccionesListadoClientes;
	public JLabel jLabeldireccionesListadoClientes;
	public JTextArea jTextAreadireccionesListadoClientes;
	public JScrollPane jscrollPanedireccionesListadoClientes;
	public JButton jButtondireccionesListadoClientesBusqueda= new JButtonMe();

	public JPanel jPanelemailsListadoClientes;
	public JLabel jLabelemailsListadoClientes;
	public JTextArea jTextAreaemailsListadoClientes;
	public JScrollPane jscrollPaneemailsListadoClientes;
	public JButton jButtonemailsListadoClientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadoClientes;
	public JLabel jLabelid_empresaListadoClientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadoClientes;
	public JButton jButtonid_empresaListadoClientes= new JButtonMe();
	public JButton jButtonid_empresaListadoClientesUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadoClientesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadoClientes;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=1474;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadoClientesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadoClientes=new JPanel();
				this.jPanelAccionesFormularioListadoClientes=new JPanel();
				this.jmenuBarDetalleListadoClientes=new JMenuBar();
				this.jTtoolBarDetalleListadoClientes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadoClientesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadoClientes() {
		return this.jButtonActualizarToolBarListadoClientes;
	}
	
	public JButton getjButtonEliminarToolBarListadoClientes() {
		return this.jButtonEliminarToolBarListadoClientes;
	}
	
	public JButton getjButtonCancelarToolBarListadoClientes() {
		return this.jButtonCancelarToolBarListadoClientes;
	}		
	
	public JButton getjButtonProcesarInformacionListadoClientes() {
		return this.jButtonProcesarInformacionListadoClientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoClientes)	{
		this.jButtonProcesarInformacionListadoClientes = jButtonProcesarInformacionListadoClientes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoClientes() {
		return this.jComboBoxTiposAccionesListadoClientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoClientes(
			JComboBox jComboBoxTiposRelacionesListadoClientes) {
		this.jComboBoxTiposRelacionesListadoClientes = jComboBoxTiposRelacionesListadoClientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoClientes(
			JComboBox jComboBoxTiposAccionesListadoClientes) {
		this.jComboBoxTiposAccionesListadoClientes = jComboBoxTiposAccionesListadoClientes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadoClientes() {
		return this.jComboBoxTiposAccionesFormularioListadoClientes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadoClientes(
			JComboBox jComboBoxTiposAccionesFormularioListadoClientes) {
		this.jComboBoxTiposAccionesFormularioListadoClientes = jComboBoxTiposAccionesFormularioListadoClientes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadoclientesSessionBean=new ListadoClientesSessionBean();
		
		this.listadoclientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoclientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoclientesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoClientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Clientes MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadoClientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadoClientes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadoClientes=new JButtonMe();
				this.jButtonModificarToolBarListadoClientes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadoClientes,this.jTtoolBarDetalleListadoClientes,
							"actualizar","actualizar","Actualizar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadoClientes,this.jTtoolBarDetalleListadoClientes,
							"eliminar","eliminar","Eliminar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadoClientes,this.jTtoolBarDetalleListadoClientes,
							"cancelar","cancelar","Cancelar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadoClientes,this.jTtoolBarDetalleListadoClientes,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadoClientes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadoClientes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadoClientes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadoClientes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadoClientes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoClientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoClientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoClientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadoClientes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadoClientes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadoClientes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadoClientes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadoClientes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadoClientes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadoClientes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadoClientes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadoClientes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadoClientes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadoClientes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadoClientes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadoClientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoClientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoClientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoClientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoClientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoClientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadoClientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadoClientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadoClientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoClientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoClientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoClientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoClientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoClientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoClientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadoClientes.add(this.jMenuItemDetalleCerrarListadoClientes);
		
		this.jmenuDetalleAccionesListadoClientes.add(this.jMenuItemActualizarListadoClientes);
		this.jmenuDetalleAccionesListadoClientes.add(this.jMenuItemEliminarListadoClientes);
		this.jmenuDetalleAccionesListadoClientes.add(this.jMenuItemCancelarListadoClientes);		
		
		//this.jmenuDetalleDatosListadoClientes.add(this.jMenuItemDetalleAbrirOrderByListadoClientes);				
		this.jmenuDetalleDatosListadoClientes.add(this.jMenuItemDetalleMostarOcultarListadoClientes);				
				
		//this.jmenuDetalleAccionesListadoClientes.add(this.jMenuItemGuardarCambiosListadoClientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadoClientes.add(this.jmenuDetalleArchivoListadoClientes);		
		this.jmenuBarDetalleListadoClientes.add(this.jmenuDetalleAccionesListadoClientes);		
		this.jmenuBarDetalleListadoClientes.add(this.jmenuDetalleDatosListadoClientes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadoClientes);				
	}
	
	
	public void inicializarElementosCamposListadoClientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadoClientes = new JLabelMe();
		jLabelIdListadoClientes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadoClientes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadoClientes= new GridBagLayout();

		this.jPanelidListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);

		jLabelidListadoClientes = new JLabel();
		jLabelidListadoClientes.setText("Id");

		jLabelidListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_zonaListadoClientes = new JLabelMe();
		this.jLabelnombre_zonaListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaListadoClientes.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelnombre_zonaListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextFieldnombre_zonaListadoClientes= new JTextFieldMe();

		jTextFieldnombre_zonaListadoClientes.setEnabled(false);
		jTextFieldnombre_zonaListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaListadoClientesBusqueda= new JButtonMe();
		this.jButtonnombre_zonaListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaListadoClientesBusqueda.setText("U");
		this.jButtonnombre_zonaListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadListadoClientes = new JLabelMe();
		this.jLabelnombre_ciudadListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadListadoClientes.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelnombre_ciudadListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreanombre_ciudadListadoClientes= new JTextAreaMe();
		jTextAreanombre_ciudadListadoClientes.setEnabled(false);
		jTextAreanombre_ciudadListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadListadoClientes.setLineWrap(true);
		jTextAreanombre_ciudadListadoClientes.setWrapStyleWord(true);
		jTextAreanombre_ciudadListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadListadoClientes.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadListadoClientes = new JScrollPane(jTextAreanombre_ciudadListadoClientes);
		jscrollPanenombre_ciudadListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadListadoClientesBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadListadoClientesBusqueda.setText("U");
		this.jButtonnombre_ciudadListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteListadoClientes = new JLabelMe();
		this.jLabelnombre_grupo_clienteListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteListadoClientes.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelnombre_grupo_clienteListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreanombre_grupo_clienteListadoClientes= new JTextAreaMe();
		jTextAreanombre_grupo_clienteListadoClientes.setEnabled(false);
		jTextAreanombre_grupo_clienteListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteListadoClientes.setLineWrap(true);
		jTextAreanombre_grupo_clienteListadoClientes.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteListadoClientes.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteListadoClientes = new JScrollPane(jTextAreanombre_grupo_clienteListadoClientes);
		jscrollPanenombre_grupo_clienteListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteListadoClientesBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoListadoClientes = new JLabelMe();
		this.jLabelcodigoListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadoClientes.setToolTipText("Codigo");
		this.jLabelcodigoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelcodigoListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextFieldcodigoListadoClientes= new JTextFieldMe();

		jTextFieldcodigoListadoClientes.setEnabled(false);
		jTextFieldcodigoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadoClientesBusqueda= new JButtonMe();
		this.jButtoncodigoListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadoClientesBusqueda.setText("U");
		this.jButtoncodigoListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelnombreListadoClientes = new JLabelMe();
		this.jLabelnombreListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreListadoClientes.setToolTipText("Nombre");
		this.jLabelnombreListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelnombreListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreanombreListadoClientes= new JTextAreaMe();
		jTextAreanombreListadoClientes.setEnabled(false);
		jTextAreanombreListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadoClientes.setLineWrap(true);
		jTextAreanombreListadoClientes.setWrapStyleWord(true);
		jTextAreanombreListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreListadoClientes.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreListadoClientes = new JScrollPane(jTextAreanombreListadoClientes);
		jscrollPanenombreListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreListadoClientesBusqueda= new JButtonMe();
		this.jButtonnombreListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreListadoClientesBusqueda.setText("U");
		this.jButtonnombreListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelapellidoListadoClientes = new JLabelMe();
		this.jLabelapellidoListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoListadoClientes.setToolTipText("Apello");
		this.jLabelapellidoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelapellidoListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreaapellidoListadoClientes= new JTextAreaMe();
		jTextAreaapellidoListadoClientes.setEnabled(false);
		jTextAreaapellidoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoListadoClientes.setLineWrap(true);
		jTextAreaapellidoListadoClientes.setWrapStyleWord(true);
		jTextAreaapellidoListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoListadoClientes.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoListadoClientes = new JScrollPane(jTextAreaapellidoListadoClientes);
		jscrollPaneapellidoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoListadoClientesBusqueda= new JButtonMe();
		this.jButtonapellidoListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoListadoClientesBusqueda.setText("U");
		this.jButtonapellidoListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelrucListadoClientes = new JLabelMe();
		this.jLabelrucListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucListadoClientes.setToolTipText("Ruc");
		this.jLabelrucListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelrucListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextFieldrucListadoClientes= new JTextFieldMe();

		jTextFieldrucListadoClientes.setEnabled(false);
		jTextFieldrucListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucListadoClientesBusqueda= new JButtonMe();
		this.jButtonrucListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucListadoClientesBusqueda.setText("U");
		this.jButtonrucListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabeltelefonosListadoClientes = new JLabelMe();
		this.jLabeltelefonosListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_TELEFONOS+" : *");
		this.jLabeltelefonosListadoClientes.setToolTipText("Telefonos");
		this.jLabeltelefonosListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonosListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonosListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonosListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonosListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonosListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_TELEFONOS);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPaneltelefonosListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreatelefonosListadoClientes= new JTextAreaMe();
		jTextAreatelefonosListadoClientes.setEnabled(false);
		jTextAreatelefonosListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosListadoClientes.setLineWrap(true);
		jTextAreatelefonosListadoClientes.setWrapStyleWord(true);
		jTextAreatelefonosListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonosListadoClientes.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonosListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonosListadoClientes = new JScrollPane(jTextAreatelefonosListadoClientes);
		jscrollPanetelefonosListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonosListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonosListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonosListadoClientesBusqueda= new JButtonMe();
		this.jButtontelefonosListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonosListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonosListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonosListadoClientesBusqueda.setText("U");
		this.jButtontelefonosListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonosListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonosListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonosListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonosListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonosListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonosListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabeldireccionesListadoClientes = new JLabelMe();
		this.jLabeldireccionesListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_DIRECCIONES+" : *");
		this.jLabeldireccionesListadoClientes.setToolTipText("Direcciones");
		this.jLabeldireccionesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionesListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionesListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionesListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_DIRECCIONES);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPaneldireccionesListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreadireccionesListadoClientes= new JTextAreaMe();
		jTextAreadireccionesListadoClientes.setEnabled(false);
		jTextAreadireccionesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesListadoClientes.setLineWrap(true);
		jTextAreadireccionesListadoClientes.setWrapStyleWord(true);
		jTextAreadireccionesListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionesListadoClientes.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionesListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionesListadoClientes = new JScrollPane(jTextAreadireccionesListadoClientes);
		jscrollPanedireccionesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionesListadoClientesBusqueda= new JButtonMe();
		this.jButtondireccionesListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionesListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionesListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionesListadoClientesBusqueda.setText("U");
		this.jButtondireccionesListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionesListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionesListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionesListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionesListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionesListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionesListadoClientesBusqueda.setVisible(false);		}


					
		this.jLabelemailsListadoClientes = new JLabelMe();
		this.jLabelemailsListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_EMAILS+" : *");
		this.jLabelemailsListadoClientes.setToolTipText("Emails");
		this.jLabelemailsListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailsListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailsListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailsListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailsListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailsListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_EMAILS);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelemailsListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jTextAreaemailsListadoClientes= new JTextAreaMe();
		jTextAreaemailsListadoClientes.setEnabled(false);
		jTextAreaemailsListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsListadoClientes.setLineWrap(true);
		jTextAreaemailsListadoClientes.setWrapStyleWord(true);
		jTextAreaemailsListadoClientes.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailsListadoClientes.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaemailsListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailsListadoClientes = new JScrollPane(jTextAreaemailsListadoClientes);
		jscrollPaneemailsListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailsListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailsListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonemailsListadoClientesBusqueda= new JButtonMe();
		this.jButtonemailsListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailsListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailsListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailsListadoClientesBusqueda.setText("U");
		this.jButtonemailsListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailsListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailsListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailsListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailsListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailsListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailsListadoClientesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadoClientes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadoClientes = new JLabelMe();
		this.jLabelid_empresaListadoClientes.setText(""+ListadoClientesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadoClientes.setToolTipText("Empresa");
		this.jLabelid_empresaListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadoClientes.setToolTipText(ListadoClientesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadoClientes = new GridBagLayout();
		this.jPanelid_empresaListadoClientes.setLayout(this.gridaBagLayoutListadoClientes);


		jComboBoxid_empresaListadoClientes= new JComboBoxMe();
		jComboBoxid_empresaListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadoClientes.setEnabled(false);

		this.jButtonid_empresaListadoClientes= new JButtonMe();
		this.jButtonid_empresaListadoClientes.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoClientes.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoClientes.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoClientes.setText("Buscar");
		this.jButtonid_empresaListadoClientes.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadoClientes.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoClientes,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoClientes"));

		this.jButtonid_empresaListadoClientesBusqueda= new JButtonMe();
		this.jButtonid_empresaListadoClientesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoClientesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoClientesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoClientesBusqueda.setText("U");
		this.jButtonid_empresaListadoClientesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadoClientesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoClientesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoClientesBusqueda"));

		if(this.listadoclientesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadoClientesBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadoClientesUpdate= new JButtonMe();
		this.jButtonid_empresaListadoClientesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoClientesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoClientesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoClientesUpdate.setText("U");
		this.jButtonid_empresaListadoClientesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadoClientesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoClientesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadoClientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoClientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoClientesUpdate"));



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
		//this.jInternalFrameDetalleListadoClientes = new ListadoClientesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listado Clientes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoClientes= new GridBagLayout();
		

		
		String sToolTipListadoClientes="";
		sToolTipListadoClientes=ListadoClientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoClientes+="(Cartera.ListadoClientes)";
		}
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoClientes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadoClientes = new JButtonMe();
		this.jButtonModificarListadoClientes = new JButtonMe();
        this.jButtonActualizarListadoClientes = new JButtonMe();
        this.jButtonEliminarListadoClientes = new JButtonMe();
        this.jButtonCancelarListadoClientes = new JButtonMe();
        this.jButtonGuardarCambiosListadoClientes = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadoClientes = new JButtonMe();
		this.jButtonCerrarListadoClientes = new JButtonMe();
		
		this.jScrollPanelDatosListadoClientes = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadoClientes = new JScrollPane();
		this.jScrollPanelDatosGeneralListadoClientes = new JScrollPane();
				
		
		
		this.jPanelCamposListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Clientes";
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoClientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadoClientes.setName("jPanelCamposListadoClientes"); 

		this.jPanelCamposOcultosListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadoClientes.setName("jPanelCamposOcultosListadoClientes"); 

        this.jPanelAccionesListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoClientes.setToolTipText("Acciones");
        this.jPanelAccionesListadoClientes.setName("Acciones"); 

		this.jPanelAccionesFormularioListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadoClientes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadoClientes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadoClientes.setText("Nuevo");
		this.jButtonModificarListadoClientes.setText("Editar");
        this.jButtonActualizarListadoClientes.setText("Actualizar");
        this.jButtonEliminarListadoClientes.setText("Eliminar");
        this.jButtonCancelarListadoClientes.setText("Cancelar");
        this.jButtonGuardarCambiosListadoClientes.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadoClientes.setText("Guardar");
		this.jButtonCerrarListadoClientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoClientes,"nuevo_button","Nuevo",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadoClientes,"modificar_button","Editar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadoClientes,"actualizar_button","Actualizar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadoClientes,"eliminar_button","Eliminar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadoClientes,"cancelar_button","Cancelar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadoClientes,"guardarcambios_button","Guardar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoClientes,"guardarcambiostabla_button","Guardar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoClientes,"cerrar_button","Salir",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadoClientes.setToolTipText("Nuevo"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadoClientes.setToolTipText("Editar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadoClientes.setToolTipText("Actualizar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadoClientes.setToolTipText("Eliminar)"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadoClientes.setToolTipText("Cancelar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadoClientes.setToolTipText("Guardar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadoClientes.setToolTipText("Guardar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoClientes.setToolTipText("Salir"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoClientes";
		inputMap = this.jButtonNuevoListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoClientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoClientes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadoClientes";
		inputMap = this.jButtonActualizarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadoClientes"));
		
		//ELIMINAR
		sMapKey = "EliminarListadoClientes";
		inputMap = this.jButtonEliminarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadoClientes"));
		
		//CANCELAR	
		sMapKey = "CancelarListadoClientes";
		inputMap = this.jButtonCancelarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadoClientes"));
		
		//CERRAR		
		sMapKey = "CerrarListadoClientes";
		inputMap = this.jButtonCerrarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoClientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoClientes";
		inputMap = this.jButtonGuardarCambiosTablaListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoClientes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadoClientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadoClientes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadoClientes.setToolTipText("Nuevo ListadoClientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadoClientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadoClientes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadoClientes.setToolTipText("Sin Cerrar Ventana ListadoClientes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadoClientes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadoClientes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadoClientes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoClientes.setText("Accion");
		this.jComboBoxTiposAccionesListadoClientes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadoClientes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadoClientes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadoClientes = new JLabelMe();
		
		this.jLabelAccionesListadoClientes.setText("Acciones");		
		this.jLabelAccionesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadoClientes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadoClientes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadoClientes=new JTabbedPane();
		this.jTabbedPaneRelacionesListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadoClientes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadoClientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoClientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoClientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadoClientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoClientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoClientes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadoClientes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadoClientes = new GridBagLayout();
		
		this.jPanelCamposListadoClientes.setLayout(gridaBagLayoutCamposListadoClientes);
		this.jPanelCamposOcultosListadoClientes.setLayout(gridaBagLayoutCamposOcultosListadoClientes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadoClientes.add(jLabelIdListadoClientes, this.gridBagConstraintsListadoClientes);



	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadoClientes.add(jLabelidListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadoClientes.add(jLabelid_empresaListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoClientes.add(jButtonid_empresaListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 3;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoClientes.add(jButtonid_empresaListadoClientesUpdate, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadoClientes.add(jComboBoxid_empresaListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaListadoClientes.add(jLabelnombre_zonaListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaListadoClientes.add(jButtonnombre_zonaListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaListadoClientes.add(jTextFieldnombre_zonaListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadListadoClientes.add(jLabelnombre_ciudadListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadListadoClientes.add(jButtonnombre_ciudadListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadListadoClientes.add(jscrollPanenombre_ciudadListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteListadoClientes.add(jLabelnombre_grupo_clienteListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteListadoClientes.add(jButtonnombre_grupo_clienteListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteListadoClientes.add(jscrollPanenombre_grupo_clienteListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadoClientes.add(jLabelcodigoListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadoClientes.add(jButtoncodigoListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadoClientes.add(jTextFieldcodigoListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreListadoClientes.add(jLabelnombreListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreListadoClientes.add(jButtonnombreListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreListadoClientes.add(jscrollPanenombreListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoListadoClientes.add(jLabelapellidoListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoListadoClientes.add(jButtonapellidoListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoListadoClientes.add(jscrollPaneapellidoListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucListadoClientes.add(jLabelrucListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucListadoClientes.add(jButtonrucListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucListadoClientes.add(jTextFieldrucListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonosListadoClientes.add(jLabeltelefonosListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonosListadoClientes.add(jButtontelefonosListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonosListadoClientes.add(jscrollPanetelefonosListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionesListadoClientes.add(jLabeldireccionesListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionesListadoClientes.add(jButtondireccionesListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionesListadoClientes.add(jscrollPanedireccionesListadoClientes, this.gridBagConstraintsListadoClientes);


	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 0;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailsListadoClientes.add(jLabelemailsListadoClientes, this.gridBagConstraintsListadoClientes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 2;
		this.gridBagConstraintsListadoClientes.ipadx = 0;
		this.gridBagConstraintsListadoClientes.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailsListadoClientes.add(jButtonemailsListadoClientesBusqueda, this.gridBagConstraintsListadoClientes);
	}

	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoClientes.gridy = 0;
	this.gridBagConstraintsListadoClientes.gridx = 1;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailsListadoClientes.add(jscrollPaneemailsListadoClientes, this.gridBagConstraintsListadoClientes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelidListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelnombre_zonaListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelnombre_ciudadListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelnombre_grupo_clienteListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelcodigoListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelnombreListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelapellidoListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelrucListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPaneltelefonosListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPaneldireccionesListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoClientes.add(this.jPanelemailsListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposListadoClientes % 1==0) {
		iXPanelCamposListadoClientes=0;
		iYPanelCamposListadoClientes++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoClientes.gridy = iYPanelCamposOcultosListadoClientes;
	this.gridBagConstraintsListadoClientes.gridx = iXPanelCamposOcultosListadoClientes++;
	this.gridBagConstraintsListadoClientes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoClientes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadoClientes.add(this.jPanelid_empresaListadoClientes, this.gridBagConstraintsListadoClientes);



	if(iXPanelCamposOcultosListadoClientes % 1==0) {
		iXPanelCamposOcultosListadoClientes=0;
		iYPanelCamposOcultosListadoClientes++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesListadoClientes= new GridBagLayout();
		this.jPanelAccionesListadoClientes.setLayout(gridaBagLayoutAccionesListadoClientes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadoClientes= new GridBagLayout();
		this.jPanelAccionesFormularioListadoClientes.setLayout(gridaBagLayoutAccionesFormularioListadoClientes);
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadoClientes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadoClientes.add(this.jComboBoxTiposAccionesFormularioListadoClientes, this.gridBagConstraintsListadoClientes);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadoClientes.add(this.jButtonModificarListadoClientes, this.gridBagConstraintsListadoClientes);							

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadoClientes.add(this.jButtonEliminarListadoClientes, this.gridBagConstraintsListadoClientes);
		
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = 0;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoClientes.add(this.jButtonActualizarListadoClientes, this.gridBagConstraintsListadoClientes);


		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = 0;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoClientes.add(this.jButtonGuardarCambiosListadoClientes, this.gridBagConstraintsListadoClientes);	
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = 0;		
		this.gridBagConstraintsListadoClientes.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadoClientes.add(this.jButtonCancelarListadoClientes, this.gridBagConstraintsListadoClientes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoClientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoClientes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();						
			this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoClientes.gridx = 0;		
			//this.gridBagConstraintsListadoClientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoClientes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoClientes.gridx =0;
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoClientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoClientes, this.gridBagConstraintsListadoClientes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadoClientes = new ListadoClientesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listado Clientes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listado Clientes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Clientes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadoClientesModel listadoclientesModel=new ListadoClientesModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadoClientesModel.ListadoClientesFocusTraversalPolicy listadoclientesFocusTraversalPolicy = listadoclientesModel.new ListadoClientesFocusTraversalPolicy(this);
			
			//listadoclientesFocusTraversalPolicy.setlistadoclientesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadoclientesModel);
			
			
			this.jContentPaneDetalleListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadoClientes = new GridBagLayout();	
			this.jContentPaneDetalleListadoClientes.setLayout(gridaBagLayoutDetalleListadoClientes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoClientes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadoClientes = new GridBagConstraints();
				this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadoClientes.gridx = 0;
					
				
				this.jContentPaneDetalleListadoClientes.add(jTtoolBarDetalleListadoClientes, gridBagConstraintsListadoClientes);								
				
}
			
			this.jScrollPanelDatosEdicionListadoClientes=   new JScrollPane(jContentPaneDetalleListadoClientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoClientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoClientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoClientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadoClientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoClientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoClientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoClientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadoClientes.gridx = 0;
	        
			this.jContentPaneDetalleListadoClientes.add(jPanelCamposListadoClientes, gridBagConstraintsListadoClientes);
			
			
			
			
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
						//&& listadoclientesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadoclientesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadoClientes= new GridBagConstraints();
						this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadoClientes.gridx = 0;
						this.jContentPaneDetalleListadoClientes.add(this.jTabbedPaneRelacionesListadoClientes, this.gridBagConstraintsListadoClientes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadoClientes.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadoClientes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadoClientes = new GridBagConstraints();
					this.gridBagConstraintsListadoClientes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadoClientes.gridx = 0;
					
				
					this.jContentPaneDetalleListadoClientes.add(jPanelCamposOcultosListadoClientes, gridBagConstraintsListadoClientes);
				
					this.jPanelCamposOcultosListadoClientes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadoClientes.gridx = 0;
	        this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadoClientes.add(this.jPanelAccionesFormularioListadoClientes, this.gridBagConstraintsListadoClientes);							
			
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
	        this.gridBagConstraintsListadoClientes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadoClientes.gridx = 0;
	        
			
			this.jContentPaneDetalleListadoClientes.add(this.jPanelAccionesListadoClientes, this.gridBagConstraintsListadoClientes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadoClientes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadoClientes=   new JScrollPane(this.jPanelCamposListadoClientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoClientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoClientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoClientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadoClientes.gridx = 0;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadoClientes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadoClientes, this.gridBagConstraintsListadoClientes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoClientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadoClientes, this.gridBagConstraintsListadoClientes);			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoClientes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadoClientes, this.gridBagConstraintsListadoClientes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoClientes, this.gridBagConstraintsListadoClientes);
			
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoClientes, this.gridBagConstraintsListadoClientes);
		
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoClientes, this.gridBagConstraintsListadoClientes);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadoClientes;//jContentPane;
		
		return jScrollPanelDatosEdicionListadoClientes;
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
