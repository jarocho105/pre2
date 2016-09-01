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
import com.bydan.erp.cartera.util.TituloClienteConstantesFunciones;

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
public class TituloClienteDetalleFormJInternalFrame extends TituloClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTituloCliente;
	
	protected JMenuBar jmenuBarDetalleTituloCliente;
	
	protected JMenu jmenuDetalleTituloCliente;
	protected JMenu jmenuDetalleArchivoTituloCliente;
	protected JMenu jmenuDetalleAccionesTituloCliente;
	protected JMenu jmenuDetalleDatosTituloCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTituloCliente;	
	protected GridBagConstraints gridBagConstraintsTituloCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TituloClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTituloCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TituloClienteSessionBean tituloclienteSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TituloClienteLogic tituloclienteLogic;
	
	public JScrollPane jScrollPanelDatosTituloCliente;
	public JScrollPane jScrollPanelDatosEdicionTituloCliente;
	public JScrollPane jScrollPanelDatosGeneralTituloCliente;
	
	protected JPanel jPanelCamposTituloCliente;    
	protected JPanel jPanelCamposOcultosTituloCliente;    	
	protected JPanel jPanelAccionesTituloCliente;
	protected JPanel jPanelAccionesFormularioTituloCliente;
    
	
	
	protected Integer iXPanelCamposTituloCliente=0;
	protected Integer iYPanelCamposTituloCliente=0;
	
	protected Integer iXPanelCamposOcultosTituloCliente=0;
	protected Integer iYPanelCamposOcultosTituloCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTituloCliente;
	public JButton jButtonModificarTituloCliente;
	public JButton jButtonActualizarTituloCliente;
    public JButton jButtonEliminarTituloCliente;
	public JButton jButtonCancelarTituloCliente;
    public JButton jButtonGuardarCambiosTituloCliente;
	public JButton jButtonGuardarCambiosTablaTituloCliente;
	protected JButton jButtonCerrarTituloCliente;
	
	
	protected JButton jButtonProcesarInformacionTituloCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTituloCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTituloCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTituloCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTituloCliente;
	protected JButton jButtonModificarToolBarTituloCliente;
	protected JButton jButtonActualizarToolBarTituloCliente;
    protected JButton jButtonEliminarToolBarTituloCliente;
	protected JButton jButtonCancelarToolBarTituloCliente;
    protected JButton jButtonGuardarCambiosToolBarTituloCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTituloCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTituloCliente;
	protected JButton jButtonCerrarToolBarTituloCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTituloCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTituloCliente;
	protected JMenuItem jMenuItemModificarTituloCliente;
	protected JMenuItem jMenuItemActualizarTituloCliente;
    protected JMenuItem jMenuItemEliminarTituloCliente;
	protected JMenuItem jMenuItemCancelarTituloCliente;
    protected JMenuItem jMenuItemGuardarCambiosTituloCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTituloCliente;
	protected JMenuItem jMenuItemCerrarTituloCliente;
	protected JMenuItem jMenuItemDetalleCerrarTituloCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTituloCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTituloCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTituloCliente;
	protected JMenuItem jMenuItemMostrarOcultarTituloCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTituloCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTituloCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTituloCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTituloCliente;
	public JLabel jLabelIdTituloCliente;
	public JLabel jLabelidTituloCliente;
	public JButton jButtonidTituloClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTituloCliente;
	public JLabel jLabelcodigoTituloCliente;
	public JTextField jTextFieldcodigoTituloCliente;
	public JButton jButtoncodigoTituloClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTituloCliente;
	public JLabel jLabelnombreTituloCliente;
	public JTextArea jTextAreanombreTituloCliente;
	public JScrollPane jscrollPanenombreTituloCliente;
	public JButton jButtonnombreTituloClienteBusqueda= new JButtonMe();

	public JPanel jPanelsiglasTituloCliente;
	public JLabel jLabelsiglasTituloCliente;
	public JTextField jTextFieldsiglasTituloCliente;
	public JButton jButtonsiglasTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTituloCliente;
	public JLabel jLabelid_empresaTituloCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTituloCliente;
	public JButton jButtonid_empresaTituloCliente= new JButtonMe();
	public JButton jButtonid_empresaTituloClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTituloClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTituloCliente;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TituloClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTituloCliente=new JPanel();
				this.jPanelAccionesFormularioTituloCliente=new JPanel();
				this.jmenuBarDetalleTituloCliente=new JMenuBar();
				this.jTtoolBarDetalleTituloCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TituloClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TituloClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTituloCliente() {
		return this.jButtonActualizarToolBarTituloCliente;
	}
	
	public JButton getjButtonEliminarToolBarTituloCliente() {
		return this.jButtonEliminarToolBarTituloCliente;
	}
	
	public JButton getjButtonCancelarToolBarTituloCliente() {
		return this.jButtonCancelarToolBarTituloCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTituloCliente() {
		return this.jButtonProcesarInformacionTituloCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTituloCliente)	{
		this.jButtonProcesarInformacionTituloCliente = jButtonProcesarInformacionTituloCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTituloCliente() {
		return this.jComboBoxTiposAccionesTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTituloCliente(
			JComboBox jComboBoxTiposRelacionesTituloCliente) {
		this.jComboBoxTiposRelacionesTituloCliente = jComboBoxTiposRelacionesTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTituloCliente(
			JComboBox jComboBoxTiposAccionesTituloCliente) {
		this.jComboBoxTiposAccionesTituloCliente = jComboBoxTiposAccionesTituloCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTituloCliente() {
		return this.jComboBoxTiposAccionesFormularioTituloCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTituloCliente(
			JComboBox jComboBoxTiposAccionesFormularioTituloCliente) {
		this.jComboBoxTiposAccionesFormularioTituloCliente = jComboBoxTiposAccionesFormularioTituloCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tituloclienteSessionBean=new TituloClienteSessionBean();
		
		this.tituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tituloclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TituloClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comercial Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TituloClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTituloCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTituloCliente=new JButtonMe();
				this.jButtonModificarToolBarTituloCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTituloCliente,this.jTtoolBarDetalleTituloCliente,
							"actualizar","actualizar","Actualizar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTituloCliente,this.jTtoolBarDetalleTituloCliente,
							"eliminar","eliminar","Eliminar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTituloCliente,this.jTtoolBarDetalleTituloCliente,
							"cancelar","cancelar","Cancelar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTituloCliente,this.jTtoolBarDetalleTituloCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTituloCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTituloCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTituloCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTituloCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTituloCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTituloCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTituloCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTituloCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTituloCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTituloCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTituloCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTituloCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTituloCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTituloCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTituloCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTituloCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTituloCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTituloCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTituloCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTituloCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTituloCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTituloCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTituloCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTituloCliente.add(this.jMenuItemDetalleCerrarTituloCliente);
		
		this.jmenuDetalleAccionesTituloCliente.add(this.jMenuItemActualizarTituloCliente);
		this.jmenuDetalleAccionesTituloCliente.add(this.jMenuItemEliminarTituloCliente);
		this.jmenuDetalleAccionesTituloCliente.add(this.jMenuItemCancelarTituloCliente);		
		
		//this.jmenuDetalleDatosTituloCliente.add(this.jMenuItemDetalleAbrirOrderByTituloCliente);				
		this.jmenuDetalleDatosTituloCliente.add(this.jMenuItemDetalleMostarOcultarTituloCliente);				
				
		//this.jmenuDetalleAccionesTituloCliente.add(this.jMenuItemGuardarCambiosTituloCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTituloCliente.add(this.jmenuDetalleArchivoTituloCliente);		
		this.jmenuBarDetalleTituloCliente.add(this.jmenuDetalleAccionesTituloCliente);		
		this.jmenuBarDetalleTituloCliente.add(this.jmenuDetalleDatosTituloCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTituloCliente.add(this.jmenuDetalleTituloCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTituloCliente);				
	}
	
	
	public void inicializarElementosCamposTituloCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTituloCliente = new JLabelMe();
		jLabelIdTituloCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTituloCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTituloCliente.setToolTipText(TituloClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTituloCliente= new GridBagLayout();

		this.jPanelidTituloCliente.setLayout(this.gridaBagLayoutTituloCliente);

		jLabelidTituloCliente = new JLabel();
		jLabelidTituloCliente.setText("Id");

		jLabelidTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTituloCliente = new JLabelMe();
		this.jLabelcodigoTituloCliente.setText(""+TituloClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTituloCliente.setToolTipText("Codigo");
		this.jLabelcodigoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTituloCliente.setToolTipText(TituloClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTituloCliente = new GridBagLayout();
		this.jPanelcodigoTituloCliente.setLayout(this.gridaBagLayoutTituloCliente);


		jTextFieldcodigoTituloCliente= new JTextFieldMe();

		jTextFieldcodigoTituloCliente.setEnabled(false);
		jTextFieldcodigoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTituloClienteBusqueda= new JButtonMe();
		this.jButtoncodigoTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTituloClienteBusqueda.setText("U");
		this.jButtoncodigoTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTituloClienteBusqueda"));

		if(this.tituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTituloClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreTituloCliente = new JLabelMe();
		this.jLabelnombreTituloCliente.setText(""+TituloClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTituloCliente.setToolTipText("Nombre");
		this.jLabelnombreTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTituloCliente.setToolTipText(TituloClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTituloCliente = new GridBagLayout();
		this.jPanelnombreTituloCliente.setLayout(this.gridaBagLayoutTituloCliente);


		jTextAreanombreTituloCliente= new JTextAreaMe();
		jTextAreanombreTituloCliente.setEnabled(false);
		jTextAreanombreTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTituloCliente.setLineWrap(true);
		jTextAreanombreTituloCliente.setWrapStyleWord(true);
		jTextAreanombreTituloCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTituloCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTituloCliente = new JScrollPane(jTextAreanombreTituloCliente);
		jscrollPanenombreTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTituloClienteBusqueda= new JButtonMe();
		this.jButtonnombreTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTituloClienteBusqueda.setText("U");
		this.jButtonnombreTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTituloClienteBusqueda"));

		if(this.tituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTituloClienteBusqueda.setVisible(false);		}


					
		this.jLabelsiglasTituloCliente = new JLabelMe();
		this.jLabelsiglasTituloCliente.setText(""+TituloClienteConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasTituloCliente.setToolTipText("Siglas");
		this.jLabelsiglasTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasTituloCliente.setToolTipText(TituloClienteConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutTituloCliente = new GridBagLayout();
		this.jPanelsiglasTituloCliente.setLayout(this.gridaBagLayoutTituloCliente);


		jTextFieldsiglasTituloCliente= new JTextFieldMe();

		jTextFieldsiglasTituloCliente.setEnabled(false);
		jTextFieldsiglasTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasTituloClienteBusqueda= new JButtonMe();
		this.jButtonsiglasTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasTituloClienteBusqueda.setText("U");
		this.jButtonsiglasTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasTituloClienteBusqueda"));

		if(this.tituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasTituloClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTituloCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTituloCliente = new JLabelMe();
		this.jLabelid_empresaTituloCliente.setText(""+TituloClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTituloCliente.setToolTipText("Empresa");
		this.jLabelid_empresaTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTituloCliente.setToolTipText(TituloClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTituloCliente = new GridBagLayout();
		this.jPanelid_empresaTituloCliente.setLayout(this.gridaBagLayoutTituloCliente);


		jComboBoxid_empresaTituloCliente= new JComboBoxMe();
		jComboBoxid_empresaTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTituloCliente.setEnabled(false);

		this.jButtonid_empresaTituloCliente= new JButtonMe();
		this.jButtonid_empresaTituloCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTituloCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTituloCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTituloCliente.setText("Buscar");
		this.jButtonid_empresaTituloCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTituloCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTituloCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTituloCliente"));

		this.jButtonid_empresaTituloClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTituloClienteBusqueda.setText("U");
		this.jButtonid_empresaTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTituloClienteBusqueda"));

		if(this.tituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTituloClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTituloClienteUpdate= new JButtonMe();
		this.jButtonid_empresaTituloClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTituloClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTituloClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTituloClienteUpdate.setText("U");
		this.jButtonid_empresaTituloClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTituloClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTituloClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTituloClienteUpdate"));



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
		//this.jInternalFrameDetalleTituloCliente = new TituloClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Comercial Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTituloCliente= new GridBagLayout();
		

		
		String sToolTipTituloCliente="";
		sToolTipTituloCliente=TituloClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTituloCliente+="(Cartera.TituloCliente)";
		}
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTituloCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTituloCliente = new JButtonMe();
		this.jButtonModificarTituloCliente = new JButtonMe();
        this.jButtonActualizarTituloCliente = new JButtonMe();
        this.jButtonEliminarTituloCliente = new JButtonMe();
        this.jButtonCancelarTituloCliente = new JButtonMe();
        this.jButtonGuardarCambiosTituloCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTituloCliente = new JButtonMe();
		this.jButtonCerrarTituloCliente = new JButtonMe();
		
		this.jScrollPanelDatosTituloCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTituloCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTituloCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comercial Cliente";
		
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comercial Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTituloCliente.setName("jPanelCamposTituloCliente"); 

		this.jPanelCamposOcultosTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTituloCliente.setName("jPanelCamposOcultosTituloCliente"); 

        this.jPanelAccionesTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesTituloCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTituloCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTituloCliente.setText("Nuevo");
		this.jButtonModificarTituloCliente.setText("Editar");
        this.jButtonActualizarTituloCliente.setText("Actualizar");
        this.jButtonEliminarTituloCliente.setText("Eliminar");
        this.jButtonCancelarTituloCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTituloCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTituloCliente.setText("Guardar");
		this.jButtonCerrarTituloCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTituloCliente,"nuevo_button","Nuevo",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTituloCliente,"modificar_button","Editar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTituloCliente,"actualizar_button","Actualizar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTituloCliente,"eliminar_button","Eliminar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTituloCliente,"cancelar_button","Cancelar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTituloCliente,"guardarcambios_button","Guardar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTituloCliente,"guardarcambiostabla_button","Guardar",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTituloCliente,"cerrar_button","Salir",this.tituloclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTituloCliente.setToolTipText("Nuevo"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTituloCliente.setToolTipText("Editar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTituloCliente.setToolTipText("Actualizar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTituloCliente.setToolTipText("Eliminar)"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTituloCliente.setToolTipText("Cancelar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTituloCliente.setToolTipText("Guardar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTituloCliente.setToolTipText("Guardar"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTituloCliente.setToolTipText("Salir"+" "+TituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTituloCliente";
		inputMap = this.jButtonNuevoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTituloCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTituloCliente";
		inputMap = this.jButtonActualizarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTituloCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTituloCliente";
		inputMap = this.jButtonEliminarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTituloCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTituloCliente";
		inputMap = this.jButtonCancelarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTituloCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTituloCliente";
		inputMap = this.jButtonCerrarTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTituloCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTituloCliente";
		inputMap = this.jButtonGuardarCambiosTablaTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTituloCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTituloCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTituloCliente.setToolTipText("Nuevo TituloCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTituloCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTituloCliente.setToolTipText("Sin Cerrar Ventana TituloCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTituloCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTituloCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTituloCliente.setText("Accion");
		this.jComboBoxTiposAccionesTituloCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTituloCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTituloCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTituloCliente = new JLabelMe();
		
		this.jLabelAccionesTituloCliente.setText("Acciones");		
		this.jLabelAccionesTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTituloCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTituloCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTituloCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTituloCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTituloCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTituloCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTituloCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTituloCliente = new GridBagLayout();
		
		this.jPanelCamposTituloCliente.setLayout(gridaBagLayoutCamposTituloCliente);
		this.jPanelCamposOcultosTituloCliente.setLayout(gridaBagLayoutCamposOcultosTituloCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 0;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTituloCliente.add(jLabelIdTituloCliente, this.gridBagConstraintsTituloCliente);



	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 1;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTituloCliente.add(jLabelidTituloCliente, this.gridBagConstraintsTituloCliente);


	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 0;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTituloCliente.add(jLabelid_empresaTituloCliente, this.gridBagConstraintsTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 2;
		this.gridBagConstraintsTituloCliente.ipadx = 0;
		this.gridBagConstraintsTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTituloCliente.add(jButtonid_empresaTituloClienteBusqueda, this.gridBagConstraintsTituloCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 3;
		this.gridBagConstraintsTituloCliente.ipadx = 0;
		this.gridBagConstraintsTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTituloCliente.add(jButtonid_empresaTituloClienteUpdate, this.gridBagConstraintsTituloCliente);
	}

	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 1;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTituloCliente.add(jComboBoxid_empresaTituloCliente, this.gridBagConstraintsTituloCliente);


	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 0;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTituloCliente.add(jLabelcodigoTituloCliente, this.gridBagConstraintsTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 2;
		this.gridBagConstraintsTituloCliente.ipadx = 0;
		this.gridBagConstraintsTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTituloCliente.add(jButtoncodigoTituloClienteBusqueda, this.gridBagConstraintsTituloCliente);
	}

	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 1;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTituloCliente.add(jTextFieldcodigoTituloCliente, this.gridBagConstraintsTituloCliente);


	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 0;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTituloCliente.add(jLabelnombreTituloCliente, this.gridBagConstraintsTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 2;
		this.gridBagConstraintsTituloCliente.ipadx = 0;
		this.gridBagConstraintsTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTituloCliente.add(jButtonnombreTituloClienteBusqueda, this.gridBagConstraintsTituloCliente);
	}

	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 1;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTituloCliente.add(jscrollPanenombreTituloCliente, this.gridBagConstraintsTituloCliente);


	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 0;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasTituloCliente.add(jLabelsiglasTituloCliente, this.gridBagConstraintsTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = 2;
		this.gridBagConstraintsTituloCliente.ipadx = 0;
		this.gridBagConstraintsTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasTituloCliente.add(jButtonsiglasTituloClienteBusqueda, this.gridBagConstraintsTituloCliente);
	}

	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTituloCliente.gridy = 0;
	this.gridBagConstraintsTituloCliente.gridx = 1;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasTituloCliente.add(jTextFieldsiglasTituloCliente, this.gridBagConstraintsTituloCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTituloCliente.gridy = iYPanelCamposTituloCliente;
	this.gridBagConstraintsTituloCliente.gridx = iXPanelCamposTituloCliente++;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTituloCliente.add(this.jPanelidTituloCliente, this.gridBagConstraintsTituloCliente);



	if(iXPanelCamposTituloCliente % 1==0) {
		iXPanelCamposTituloCliente=0;
		iYPanelCamposTituloCliente++;
	}
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTituloCliente.gridy = iYPanelCamposTituloCliente;
	this.gridBagConstraintsTituloCliente.gridx = iXPanelCamposTituloCliente++;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTituloCliente.add(this.jPanelcodigoTituloCliente, this.gridBagConstraintsTituloCliente);



	if(iXPanelCamposTituloCliente % 1==0) {
		iXPanelCamposTituloCliente=0;
		iYPanelCamposTituloCliente++;
	}
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTituloCliente.gridy = iYPanelCamposTituloCliente;
	this.gridBagConstraintsTituloCliente.gridx = iXPanelCamposTituloCliente++;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTituloCliente.add(this.jPanelnombreTituloCliente, this.gridBagConstraintsTituloCliente);



	if(iXPanelCamposTituloCliente % 1==0) {
		iXPanelCamposTituloCliente=0;
		iYPanelCamposTituloCliente++;
	}
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTituloCliente.gridy = iYPanelCamposTituloCliente;
	this.gridBagConstraintsTituloCliente.gridx = iXPanelCamposTituloCliente++;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTituloCliente.add(this.jPanelsiglasTituloCliente, this.gridBagConstraintsTituloCliente);



	if(iXPanelCamposTituloCliente % 1==0) {
		iXPanelCamposTituloCliente=0;
		iYPanelCamposTituloCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTituloCliente.gridy = iYPanelCamposOcultosTituloCliente;
	this.gridBagConstraintsTituloCliente.gridx = iXPanelCamposOcultosTituloCliente++;
	this.gridBagConstraintsTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTituloCliente.add(this.jPanelid_empresaTituloCliente, this.gridBagConstraintsTituloCliente);



	if(iXPanelCamposOcultosTituloCliente % 1==0) {
		iXPanelCamposOcultosTituloCliente=0;
		iYPanelCamposOcultosTituloCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTituloCliente= new GridBagLayout();
		this.jPanelAccionesTituloCliente.setLayout(gridaBagLayoutAccionesTituloCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTituloCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTituloCliente.setLayout(gridaBagLayoutAccionesFormularioTituloCliente);
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTituloCliente.add(this.jComboBoxTiposAccionesFormularioTituloCliente, this.gridBagConstraintsTituloCliente);

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTituloCliente.add(this.jCheckBoxPostAccionNuevoTituloCliente, this.gridBagConstraintsTituloCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTituloCliente.add(this.jCheckBoxPostAccionSinCerrarTituloCliente, this.gridBagConstraintsTituloCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tituloclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTituloCliente.add(this.jCheckBoxPostAccionSinMensajeTituloCliente, this.gridBagConstraintsTituloCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTituloCliente.add(this.jButtonModificarTituloCliente, this.gridBagConstraintsTituloCliente);							

		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTituloCliente.gridy = 0;
		this.gridBagConstraintsTituloCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTituloCliente.add(this.jButtonEliminarTituloCliente, this.gridBagConstraintsTituloCliente);
		
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = 0;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTituloCliente.add(this.jButtonActualizarTituloCliente, this.gridBagConstraintsTituloCliente);


		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = 0;		
		this.gridBagConstraintsTituloCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTituloCliente.add(this.jButtonGuardarCambiosTituloCliente, this.gridBagConstraintsTituloCliente);	
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = 0;		
		this.gridBagConstraintsTituloCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTituloCliente.add(this.jButtonCancelarTituloCliente, this.gridBagConstraintsTituloCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTituloCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTituloCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tituloclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();						
			this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTituloCliente.gridx = 0;		
			//this.gridBagConstraintsTituloCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTituloCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTituloCliente.gridx =0;
		this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTituloCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTituloCliente, this.gridBagConstraintsTituloCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TituloClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTituloCliente = new TituloClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Comercial Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Comercial Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comercial Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TituloClienteModel tituloclienteModel=new TituloClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TituloClienteModel.TituloClienteFocusTraversalPolicy tituloclienteFocusTraversalPolicy = tituloclienteModel.new TituloClienteFocusTraversalPolicy(this);
			
			//tituloclienteFocusTraversalPolicy.settituloclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tituloclienteModel);
			
			
			this.jContentPaneDetalleTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTituloCliente = new GridBagLayout();	
			this.jContentPaneDetalleTituloCliente.setLayout(gridaBagLayoutDetalleTituloCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTituloCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTituloCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTituloCliente.add(jTtoolBarDetalleTituloCliente, gridBagConstraintsTituloCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTituloCliente=   new JScrollPane(jContentPaneDetalleTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTituloCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTituloCliente.gridx = 0;
	        
			this.jContentPaneDetalleTituloCliente.add(jPanelCamposTituloCliente, gridBagConstraintsTituloCliente);
			
			
			
			
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
						&& tituloclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					
					if(this.tituloclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTituloCliente= new GridBagConstraints();
						this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTituloCliente.gridx = 0;
						this.jContentPaneDetalleTituloCliente.add(this.jTabbedPaneRelacionesTituloCliente, this.gridBagConstraintsTituloCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTituloCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTituloCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTituloCliente = new GridBagConstraints();
					this.gridBagConstraintsTituloCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTituloCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTituloCliente.add(jPanelCamposOcultosTituloCliente, gridBagConstraintsTituloCliente);
				
					this.jPanelCamposOcultosTituloCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTituloCliente.gridx = 0;
	        this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTituloCliente.add(this.jPanelAccionesFormularioTituloCliente, this.gridBagConstraintsTituloCliente);							
			
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
	        this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTituloCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTituloCliente.add(this.jPanelAccionesTituloCliente, this.gridBagConstraintsTituloCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTituloCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTituloCliente=   new JScrollPane(this.jPanelCamposTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTituloCliente.gridx = 0;
			this.gridBagConstraintsTituloCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTituloCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTituloCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTituloCliente, this.gridBagConstraintsTituloCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTituloCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTituloCliente, this.gridBagConstraintsTituloCliente);			
			
			this.gridBagConstraintsTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTituloCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTituloCliente, this.gridBagConstraintsTituloCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTituloCliente, this.gridBagConstraintsTituloCliente);
			
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTituloCliente, this.gridBagConstraintsTituloCliente);
		
			
		this.gridBagConstraintsTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTituloCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTituloCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTituloCliente, this.gridBagConstraintsTituloCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTituloCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTituloCliente;
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTituloCliente = new GridBagConstraints();
				//this.gridBagConstraintsTituloCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTituloCliente.gridx = 0;
				//this.jContentPaneDetalleTituloCliente.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTituloCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTituloCliente.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTituloCliente.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTituloCliente.add("Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TituloCliente> tituloclientes,TituloCliente titulocliente,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tituloclienteLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settituloclientesForeignKey(tituloclientes);
					clienteBeanSwingJInternalFrame.settituloclienteForeignKey(titulocliente);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTituloCliente(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTituloClienteActual(titulocliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTituloCliente(true);
					clienteBeanSwingJInternalFrame.setid_titulo_clienteFK_IdTituloCliente(titulocliente.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTituloClienteForeignKey(titulocliente,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTituloCliente");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTituloCliente");
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
