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
import com.bydan.erp.cartera.util.report.ControlProveedoresConstantesFunciones;

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
public class ControlProveedoresDetalleFormJInternalFrame extends ControlProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleControlProveedores;
	
	protected JMenuBar jmenuBarDetalleControlProveedores;
	
	protected JMenu jmenuDetalleControlProveedores;
	protected JMenu jmenuDetalleArchivoControlProveedores;
	protected JMenu jmenuDetalleAccionesControlProveedores;
	protected JMenu jmenuDetalleDatosControlProveedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutControlProveedores;	
	protected GridBagConstraints gridBagConstraintsControlProveedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ControlProveedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleControlProveedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ControlProveedoresSessionBean controlproveedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ControlProveedoresLogic controlproveedoresLogic;
	
	public JScrollPane jScrollPanelDatosControlProveedores;
	public JScrollPane jScrollPanelDatosEdicionControlProveedores;
	public JScrollPane jScrollPanelDatosGeneralControlProveedores;
	
	protected JPanel jPanelCamposControlProveedores;    
	protected JPanel jPanelCamposOcultosControlProveedores;    	
	protected JPanel jPanelAccionesControlProveedores;
	protected JPanel jPanelAccionesFormularioControlProveedores;
    
	
	
	protected Integer iXPanelCamposControlProveedores=0;
	protected Integer iYPanelCamposControlProveedores=0;
	
	protected Integer iXPanelCamposOcultosControlProveedores=0;
	protected Integer iYPanelCamposOcultosControlProveedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoControlProveedores;
	public JButton jButtonModificarControlProveedores;
	public JButton jButtonActualizarControlProveedores;
    public JButton jButtonEliminarControlProveedores;
	public JButton jButtonCancelarControlProveedores;
    public JButton jButtonGuardarCambiosControlProveedores;
	public JButton jButtonGuardarCambiosTablaControlProveedores;
	protected JButton jButtonCerrarControlProveedores;
	
	
	protected JButton jButtonProcesarInformacionControlProveedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoControlProveedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarControlProveedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeControlProveedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarControlProveedores;
	protected JButton jButtonModificarToolBarControlProveedores;
	protected JButton jButtonActualizarToolBarControlProveedores;
    protected JButton jButtonEliminarToolBarControlProveedores;
	protected JButton jButtonCancelarToolBarControlProveedores;
    protected JButton jButtonGuardarCambiosToolBarControlProveedores;
	protected JButton jButtonGuardarCambiosTablaToolBarControlProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarControlProveedores;
	protected JButton jButtonCerrarToolBarControlProveedores;
	
	protected JButton jButtonProcesarInformacionToolBarControlProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoControlProveedores;
	protected JMenuItem jMenuItemModificarControlProveedores;
	protected JMenuItem jMenuItemActualizarControlProveedores;
    protected JMenuItem jMenuItemEliminarControlProveedores;
	protected JMenuItem jMenuItemCancelarControlProveedores;
    protected JMenuItem jMenuItemGuardarCambiosControlProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaControlProveedores;
	protected JMenuItem jMenuItemCerrarControlProveedores;
	protected JMenuItem jMenuItemDetalleCerrarControlProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarControlProveedores;
	
	protected JMenuItem jMenuItemProcesarInformacionControlProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosControlProveedores;
	protected JMenuItem jMenuItemMostrarOcultarControlProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesControlProveedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesControlProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesControlProveedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioControlProveedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidControlProveedores;
	public JLabel jLabelIdControlProveedores;
	public JLabel jLabelidControlProveedores;
	public JButton jButtonidControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaControlProveedores;
	public JLabel jLabelfecha_emision_hastaControlProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_hastaControlProveedores;

	public JDateChooser jDateChooserfecha_emision_hastaControlProveedores;
	public JButton jButtonfecha_emision_hastaControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaControlProveedores;
	public JLabel jLabelnombre_zonaControlProveedores;
	public JTextField jTextFieldnombre_zonaControlProveedores;
	public JButton jButtonnombre_zonaControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadControlProveedores;
	public JLabel jLabelnombre_ciudadControlProveedores;
	public JTextArea jTextAreanombre_ciudadControlProveedores;
	public JScrollPane jscrollPanenombre_ciudadControlProveedores;
	public JButton jButtonnombre_ciudadControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteControlProveedores;
	public JLabel jLabelnombre_grupo_clienteControlProveedores;
	public JTextArea jTextAreanombre_grupo_clienteControlProveedores;
	public JScrollPane jscrollPanenombre_grupo_clienteControlProveedores;
	public JButton jButtonnombre_grupo_clienteControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigoControlProveedores;
	public JLabel jLabelcodigoControlProveedores;
	public JTextField jTextFieldcodigoControlProveedores;
	public JButton jButtoncodigoControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteControlProveedores;
	public JLabel jLabelnombre_clienteControlProveedores;
	public JTextArea jTextAreanombre_clienteControlProveedores;
	public JScrollPane jscrollPanenombre_clienteControlProveedores;
	public JButton jButtonnombre_clienteControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelrucControlProveedores;
	public JLabel jLabelrucControlProveedores;
	public JTextField jTextFieldrucControlProveedores;
	public JButton jButtonrucControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPaneltelefonosControlProveedores;
	public JLabel jLabeltelefonosControlProveedores;
	public JTextArea jTextAreatelefonosControlProveedores;
	public JScrollPane jscrollPanetelefonosControlProveedores;
	public JButton jButtontelefonosControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPaneldireccionesControlProveedores;
	public JLabel jLabeldireccionesControlProveedores;
	public JTextArea jTextAreadireccionesControlProveedores;
	public JScrollPane jscrollPanedireccionesControlProveedores;
	public JButton jButtondireccionesControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelemailsControlProveedores;
	public JLabel jLabelemailsControlProveedores;
	public JTextArea jTextAreaemailsControlProveedores;
	public JScrollPane jscrollPaneemailsControlProveedores;
	public JButton jButtonemailsControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaControlProveedores;
	public JLabel jLabelnumero_facturaControlProveedores;
	public JTextField jTextFieldnumero_facturaControlProveedores;
	public JButton jButtonnumero_facturaControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionControlProveedores;
	public JLabel jLabelfecha_emisionControlProveedores;
	//public JFormattedTextField jDateChooserfecha_emisionControlProveedores;

	public JDateChooser jDateChooserfecha_emisionControlProveedores;
	public JButton jButtonfecha_emisionControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaControlProveedores;
	public JLabel jLabelfecha_ventaControlProveedores;
	//public JFormattedTextField jDateChooserfecha_ventaControlProveedores;

	public JDateChooser jDateChooserfecha_ventaControlProveedores;
	public JButton jButtonfecha_ventaControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelsaldoControlProveedores;
	public JLabel jLabelsaldoControlProveedores;
	public JTextField jTextFieldsaldoControlProveedores;
	public JButton jButtonsaldoControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localControlProveedores;
	public JLabel jLabeldebito_mone_localControlProveedores;
	public JTextField jTextFielddebito_mone_localControlProveedores;
	public JButton jButtondebito_mone_localControlProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localControlProveedores;
	public JLabel jLabelcredito_mone_localControlProveedores;
	public JTextField jTextFieldcredito_mone_localControlProveedores;
	public JButton jButtoncredito_mone_localControlProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaControlProveedores;
	public JLabel jLabelid_empresaControlProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaControlProveedores;
	public JButton jButtonid_empresaControlProveedores= new JButtonMe();
	public JButton jButtonid_empresaControlProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaControlProveedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesControlProveedores;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ControlProveedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposControlProveedores=new JPanel();
				this.jPanelAccionesFormularioControlProveedores=new JPanel();
				this.jmenuBarDetalleControlProveedores=new JMenuBar();
				this.jTtoolBarDetalleControlProveedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ControlProveedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlProveedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ControlProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarControlProveedores() {
		return this.jButtonActualizarToolBarControlProveedores;
	}
	
	public JButton getjButtonEliminarToolBarControlProveedores() {
		return this.jButtonEliminarToolBarControlProveedores;
	}
	
	public JButton getjButtonCancelarToolBarControlProveedores() {
		return this.jButtonCancelarToolBarControlProveedores;
	}		
	
	public JButton getjButtonProcesarInformacionControlProveedores() {
		return this.jButtonProcesarInformacionControlProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionControlProveedores)	{
		this.jButtonProcesarInformacionControlProveedores = jButtonProcesarInformacionControlProveedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesControlProveedores() {
		return this.jComboBoxTiposAccionesControlProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesControlProveedores(
			JComboBox jComboBoxTiposRelacionesControlProveedores) {
		this.jComboBoxTiposRelacionesControlProveedores = jComboBoxTiposRelacionesControlProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesControlProveedores(
			JComboBox jComboBoxTiposAccionesControlProveedores) {
		this.jComboBoxTiposAccionesControlProveedores = jComboBoxTiposAccionesControlProveedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioControlProveedores() {
		return this.jComboBoxTiposAccionesFormularioControlProveedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioControlProveedores(
			JComboBox jComboBoxTiposAccionesFormularioControlProveedores) {
		this.jComboBoxTiposAccionesFormularioControlProveedores = jComboBoxTiposAccionesFormularioControlProveedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
		
		this.controlproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.controlproveedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ControlProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ControlProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Control Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		ControlProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleControlProveedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarControlProveedores=new JButtonMe();
				this.jButtonModificarToolBarControlProveedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarControlProveedores,this.jTtoolBarDetalleControlProveedores,
							"actualizar","actualizar","Actualizar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarControlProveedores,this.jTtoolBarDetalleControlProveedores,
							"eliminar","eliminar","Eliminar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarControlProveedores,this.jTtoolBarDetalleControlProveedores,
							"cancelar","cancelar","Cancelar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarControlProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarControlProveedores,this.jTtoolBarDetalleControlProveedores,
							"guardarcambios","guardarcambios","Guardar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleControlProveedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleControlProveedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoControlProveedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesControlProveedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosControlProveedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoControlProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoControlProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoControlProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarControlProveedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarControlProveedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarControlProveedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarControlProveedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarControlProveedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarControlProveedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarControlProveedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarControlProveedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarControlProveedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarControlProveedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarControlProveedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarControlProveedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosControlProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosControlProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosControlProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarControlProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarControlProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarControlProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarControlProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarControlProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarControlProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarControlProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarControlProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarControlProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarControlProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarControlProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarControlProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoControlProveedores.add(this.jMenuItemDetalleCerrarControlProveedores);
		
		this.jmenuDetalleAccionesControlProveedores.add(this.jMenuItemActualizarControlProveedores);
		this.jmenuDetalleAccionesControlProveedores.add(this.jMenuItemEliminarControlProveedores);
		this.jmenuDetalleAccionesControlProveedores.add(this.jMenuItemCancelarControlProveedores);		
		
		//this.jmenuDetalleDatosControlProveedores.add(this.jMenuItemDetalleAbrirOrderByControlProveedores);				
		this.jmenuDetalleDatosControlProveedores.add(this.jMenuItemDetalleMostarOcultarControlProveedores);				
				
		//this.jmenuDetalleAccionesControlProveedores.add(this.jMenuItemGuardarCambiosControlProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleControlProveedores.add(this.jmenuDetalleArchivoControlProveedores);		
		this.jmenuBarDetalleControlProveedores.add(this.jmenuDetalleAccionesControlProveedores);		
		this.jmenuBarDetalleControlProveedores.add(this.jmenuDetalleDatosControlProveedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleControlProveedores);				
	}
	
	
	public void inicializarElementosCamposControlProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdControlProveedores = new JLabelMe();
		jLabelIdControlProveedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidControlProveedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutControlProveedores= new GridBagLayout();

		this.jPanelidControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);

		jLabelidControlProveedores = new JLabel();
		jLabelidControlProveedores.setText("Id");

		jLabelidControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaControlProveedores = new JLabelMe();
		this.jLabelfecha_emision_hastaControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaControlProveedores.setToolTipText("Fecha  Emisionhasta");
		this.jLabelfecha_emision_hastaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelfecha_emision_hastaControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		//jFormattedTextFieldfecha_emision_hastaControlProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaControlProveedores= new JDateChooser();
		jDateChooserfecha_emision_hastaControlProveedores.setEnabled(false);
		jDateChooserfecha_emision_hastaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaControlProveedores.setDate(new Date());
		jDateChooserfecha_emision_hastaControlProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaControlProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaControlProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setText("U");
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaControlProveedores = new JLabelMe();
		this.jLabelnombre_zonaControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaControlProveedores.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelnombre_zonaControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldnombre_zonaControlProveedores= new JTextFieldMe();

		jTextFieldnombre_zonaControlProveedores.setEnabled(false);
		jTextFieldnombre_zonaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaControlProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_zonaControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaControlProveedoresBusqueda.setText("U");
		this.jButtonnombre_zonaControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadControlProveedores = new JLabelMe();
		this.jLabelnombre_ciudadControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadControlProveedores.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelnombre_ciudadControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreanombre_ciudadControlProveedores= new JTextAreaMe();
		jTextAreanombre_ciudadControlProveedores.setEnabled(false);
		jTextAreanombre_ciudadControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadControlProveedores.setLineWrap(true);
		jTextAreanombre_ciudadControlProveedores.setWrapStyleWord(true);
		jTextAreanombre_ciudadControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadControlProveedores.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadControlProveedores = new JScrollPane(jTextAreanombre_ciudadControlProveedores);
		jscrollPanenombre_ciudadControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadControlProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadControlProveedoresBusqueda.setText("U");
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteControlProveedores = new JLabelMe();
		this.jLabelnombre_grupo_clienteControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteControlProveedores.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelnombre_grupo_clienteControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreanombre_grupo_clienteControlProveedores= new JTextAreaMe();
		jTextAreanombre_grupo_clienteControlProveedores.setEnabled(false);
		jTextAreanombre_grupo_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteControlProveedores.setLineWrap(true);
		jTextAreanombre_grupo_clienteControlProveedores.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteControlProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteControlProveedores = new JScrollPane(jTextAreanombre_grupo_clienteControlProveedores);
		jscrollPanenombre_grupo_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigoControlProveedores = new JLabelMe();
		this.jLabelcodigoControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoControlProveedores.setToolTipText("Codigo");
		this.jLabelcodigoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelcodigoControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldcodigoControlProveedores= new JTextFieldMe();

		jTextFieldcodigoControlProveedores.setEnabled(false);
		jTextFieldcodigoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoControlProveedoresBusqueda= new JButtonMe();
		this.jButtoncodigoControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoControlProveedoresBusqueda.setText("U");
		this.jButtoncodigoControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteControlProveedores = new JLabelMe();
		this.jLabelnombre_clienteControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteControlProveedores.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelnombre_clienteControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreanombre_clienteControlProveedores= new JTextAreaMe();
		jTextAreanombre_clienteControlProveedores.setEnabled(false);
		jTextAreanombre_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteControlProveedores.setLineWrap(true);
		jTextAreanombre_clienteControlProveedores.setWrapStyleWord(true);
		jTextAreanombre_clienteControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteControlProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteControlProveedores = new JScrollPane(jTextAreanombre_clienteControlProveedores);
		jscrollPanenombre_clienteControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteControlProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_clienteControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteControlProveedoresBusqueda.setText("U");
		this.jButtonnombre_clienteControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelrucControlProveedores = new JLabelMe();
		this.jLabelrucControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucControlProveedores.setToolTipText("Ruc");
		this.jLabelrucControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelrucControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldrucControlProveedores= new JTextFieldMe();

		jTextFieldrucControlProveedores.setEnabled(false);
		jTextFieldrucControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucControlProveedoresBusqueda= new JButtonMe();
		this.jButtonrucControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucControlProveedoresBusqueda.setText("U");
		this.jButtonrucControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabeltelefonosControlProveedores = new JLabelMe();
		this.jLabeltelefonosControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_TELEFONOS+" : *");
		this.jLabeltelefonosControlProveedores.setToolTipText("Telefonos");
		this.jLabeltelefonosControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonosControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonosControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonosControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonosControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonosControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPaneltelefonosControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreatelefonosControlProveedores= new JTextAreaMe();
		jTextAreatelefonosControlProveedores.setEnabled(false);
		jTextAreatelefonosControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonosControlProveedores.setLineWrap(true);
		jTextAreatelefonosControlProveedores.setWrapStyleWord(true);
		jTextAreatelefonosControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonosControlProveedores.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonosControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonosControlProveedores = new JScrollPane(jTextAreatelefonosControlProveedores);
		jscrollPanetelefonosControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonosControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonosControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonosControlProveedoresBusqueda= new JButtonMe();
		this.jButtontelefonosControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonosControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonosControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonosControlProveedoresBusqueda.setText("U");
		this.jButtontelefonosControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonosControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonosControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonosControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonosControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonosControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonosControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabeldireccionesControlProveedores = new JLabelMe();
		this.jLabeldireccionesControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES+" : *");
		this.jLabeldireccionesControlProveedores.setToolTipText("Direcciones");
		this.jLabeldireccionesControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionesControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionesControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionesControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionesControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionesControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPaneldireccionesControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreadireccionesControlProveedores= new JTextAreaMe();
		jTextAreadireccionesControlProveedores.setEnabled(false);
		jTextAreadireccionesControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionesControlProveedores.setLineWrap(true);
		jTextAreadireccionesControlProveedores.setWrapStyleWord(true);
		jTextAreadireccionesControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionesControlProveedores.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionesControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionesControlProveedores = new JScrollPane(jTextAreadireccionesControlProveedores);
		jscrollPanedireccionesControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionesControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionesControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionesControlProveedoresBusqueda= new JButtonMe();
		this.jButtondireccionesControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionesControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionesControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionesControlProveedoresBusqueda.setText("U");
		this.jButtondireccionesControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionesControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionesControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionesControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionesControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionesControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionesControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelemailsControlProveedores = new JLabelMe();
		this.jLabelemailsControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_EMAILS+" : *");
		this.jLabelemailsControlProveedores.setToolTipText("Emails");
		this.jLabelemailsControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailsControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailsControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailsControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailsControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailsControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_EMAILS);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelemailsControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextAreaemailsControlProveedores= new JTextAreaMe();
		jTextAreaemailsControlProveedores.setEnabled(false);
		jTextAreaemailsControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailsControlProveedores.setLineWrap(true);
		jTextAreaemailsControlProveedores.setWrapStyleWord(true);
		jTextAreaemailsControlProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailsControlProveedores.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaemailsControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailsControlProveedores = new JScrollPane(jTextAreaemailsControlProveedores);
		jscrollPaneemailsControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailsControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailsControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonemailsControlProveedoresBusqueda= new JButtonMe();
		this.jButtonemailsControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailsControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailsControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailsControlProveedoresBusqueda.setText("U");
		this.jButtonemailsControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailsControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailsControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailsControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailsControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailsControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailsControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaControlProveedores = new JLabelMe();
		this.jLabelnumero_facturaControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaControlProveedores.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelnumero_facturaControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldnumero_facturaControlProveedores= new JTextFieldMe();

		jTextFieldnumero_facturaControlProveedores.setEnabled(false);
		jTextFieldnumero_facturaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaControlProveedoresBusqueda= new JButtonMe();
		this.jButtonnumero_facturaControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaControlProveedoresBusqueda.setText("U");
		this.jButtonnumero_facturaControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionControlProveedores = new JLabelMe();
		this.jLabelfecha_emisionControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionControlProveedores.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelfecha_emisionControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		//jFormattedTextFieldfecha_emisionControlProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionControlProveedores= new JDateChooser();
		jDateChooserfecha_emisionControlProveedores.setEnabled(false);
		jDateChooserfecha_emisionControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionControlProveedores.setDate(new Date());
		jDateChooserfecha_emisionControlProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionControlProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionControlProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emisionControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionControlProveedoresBusqueda.setText("U");
		this.jButtonfecha_emisionControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ventaControlProveedores = new JLabelMe();
		this.jLabelfecha_ventaControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaControlProveedores.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelfecha_ventaControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		//jFormattedTextFieldfecha_ventaControlProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaControlProveedores= new JDateChooser();
		jDateChooserfecha_ventaControlProveedores.setEnabled(false);
		jDateChooserfecha_ventaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaControlProveedores.setDate(new Date());
		jDateChooserfecha_ventaControlProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaControlProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaControlProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_ventaControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaControlProveedoresBusqueda.setText("U");
		this.jButtonfecha_ventaControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelsaldoControlProveedores = new JLabelMe();
		this.jLabelsaldoControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoControlProveedores.setToolTipText("Saldo");
		this.jLabelsaldoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelsaldoControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldsaldoControlProveedores= new JTextFieldMe();
		jTextFieldsaldoControlProveedores.setEnabled(false);
		jTextFieldsaldoControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoControlProveedores.setText("0.0");

		this.jButtonsaldoControlProveedoresBusqueda= new JButtonMe();
		this.jButtonsaldoControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoControlProveedoresBusqueda.setText("U");
		this.jButtonsaldoControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localControlProveedores = new JLabelMe();
		this.jLabeldebito_mone_localControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localControlProveedores.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPaneldebito_mone_localControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFielddebito_mone_localControlProveedores= new JTextFieldMe();
		jTextFielddebito_mone_localControlProveedores.setEnabled(false);
		jTextFielddebito_mone_localControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localControlProveedores.setText("0.0");

		this.jButtondebito_mone_localControlProveedoresBusqueda= new JButtonMe();
		this.jButtondebito_mone_localControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localControlProveedoresBusqueda.setText("U");
		this.jButtondebito_mone_localControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localControlProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localControlProveedores = new JLabelMe();
		this.jLabelcredito_mone_localControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localControlProveedores.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelcredito_mone_localControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jTextFieldcredito_mone_localControlProveedores= new JTextFieldMe();
		jTextFieldcredito_mone_localControlProveedores.setEnabled(false);
		jTextFieldcredito_mone_localControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localControlProveedores.setText("0.0");

		this.jButtoncredito_mone_localControlProveedoresBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localControlProveedoresBusqueda.setText("U");
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localControlProveedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysControlProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaControlProveedores = new JLabelMe();
		this.jLabelid_empresaControlProveedores.setText(""+ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaControlProveedores.setToolTipText("Empresa");
		this.jLabelid_empresaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaControlProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaControlProveedores.setToolTipText(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutControlProveedores = new GridBagLayout();
		this.jPanelid_empresaControlProveedores.setLayout(this.gridaBagLayoutControlProveedores);


		jComboBoxid_empresaControlProveedores= new JComboBoxMe();
		jComboBoxid_empresaControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaControlProveedores.setEnabled(false);

		this.jButtonid_empresaControlProveedores= new JButtonMe();
		this.jButtonid_empresaControlProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlProveedores.setText("Buscar");
		this.jButtonid_empresaControlProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaControlProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlProveedores"));

		this.jButtonid_empresaControlProveedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaControlProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaControlProveedoresBusqueda.setText("U");
		this.jButtonid_empresaControlProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaControlProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlProveedoresBusqueda"));

		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaControlProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaControlProveedoresUpdate= new JButtonMe();
		this.jButtonid_empresaControlProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaControlProveedoresUpdate.setText("U");
		this.jButtonid_empresaControlProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaControlProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlProveedoresUpdate"));



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
		//this.jInternalFrameDetalleControlProveedores = new ControlProveedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Control Proveedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutControlProveedores= new GridBagLayout();
		

		
		String sToolTipControlProveedores="";
		sToolTipControlProveedores=ControlProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipControlProveedores+="(Cartera.ControlProveedores)";
		}
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipControlProveedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoControlProveedores = new JButtonMe();
		this.jButtonModificarControlProveedores = new JButtonMe();
        this.jButtonActualizarControlProveedores = new JButtonMe();
        this.jButtonEliminarControlProveedores = new JButtonMe();
        this.jButtonCancelarControlProveedores = new JButtonMe();
        this.jButtonGuardarCambiosControlProveedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaControlProveedores = new JButtonMe();
		this.jButtonCerrarControlProveedores = new JButtonMe();
		
		this.jScrollPanelDatosControlProveedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionControlProveedores = new JScrollPane();
		this.jScrollPanelDatosGeneralControlProveedores = new JScrollPane();
				
		
		
		this.jPanelCamposControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Control Proveedores";
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosControlProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposControlProveedores.setName("jPanelCamposControlProveedores"); 

		this.jPanelCamposOcultosControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosControlProveedores.setName("jPanelCamposOcultosControlProveedores"); 

        this.jPanelAccionesControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesControlProveedores.setToolTipText("Acciones");
        this.jPanelAccionesControlProveedores.setName("Acciones"); 

		this.jPanelAccionesFormularioControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioControlProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioControlProveedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoControlProveedores.setText("Nuevo");
		this.jButtonModificarControlProveedores.setText("Editar");
        this.jButtonActualizarControlProveedores.setText("Actualizar");
        this.jButtonEliminarControlProveedores.setText("Eliminar");
        this.jButtonCancelarControlProveedores.setText("Cancelar");
        this.jButtonGuardarCambiosControlProveedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaControlProveedores.setText("Guardar");
		this.jButtonCerrarControlProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoControlProveedores,"nuevo_button","Nuevo",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarControlProveedores,"modificar_button","Editar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarControlProveedores,"actualizar_button","Actualizar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarControlProveedores,"eliminar_button","Eliminar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarControlProveedores,"cancelar_button","Cancelar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosControlProveedores,"guardarcambios_button","Guardar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaControlProveedores,"guardarcambiostabla_button","Guardar",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarControlProveedores,"cerrar_button","Salir",this.controlproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoControlProveedores.setToolTipText("Nuevo"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarControlProveedores.setToolTipText("Editar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarControlProveedores.setToolTipText("Actualizar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarControlProveedores.setToolTipText("Eliminar)"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarControlProveedores.setToolTipText("Cancelar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosControlProveedores.setToolTipText("Guardar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaControlProveedores.setToolTipText("Guardar"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarControlProveedores.setToolTipText("Salir"+" "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoControlProveedores";
		inputMap = this.jButtonNuevoControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoControlProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoControlProveedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarControlProveedores";
		inputMap = this.jButtonActualizarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarControlProveedores"));
		
		//ELIMINAR
		sMapKey = "EliminarControlProveedores";
		inputMap = this.jButtonEliminarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarControlProveedores"));
		
		//CANCELAR	
		sMapKey = "CancelarControlProveedores";
		inputMap = this.jButtonCancelarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarControlProveedores"));
		
		//CERRAR		
		sMapKey = "CerrarControlProveedores";
		inputMap = this.jButtonCerrarControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarControlProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaControlProveedores";
		inputMap = this.jButtonGuardarCambiosTablaControlProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaControlProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaControlProveedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoControlProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoControlProveedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoControlProveedores.setToolTipText("Nuevo ControlProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarControlProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarControlProveedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarControlProveedores.setToolTipText("Sin Cerrar Ventana ControlProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeControlProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeControlProveedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeControlProveedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesControlProveedores.setText("Accion");
		this.jComboBoxTiposAccionesControlProveedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioControlProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioControlProveedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioControlProveedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesControlProveedores = new JLabelMe();
		
		this.jLabelAccionesControlProveedores.setText("Acciones");		
		this.jLabelAccionesControlProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposControlProveedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysControlProveedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesControlProveedores=new JTabbedPane();
		this.jTabbedPaneRelacionesControlProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesControlProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesControlProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesControlProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioControlProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioControlProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioControlProveedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioControlProveedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposControlProveedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosControlProveedores = new GridBagLayout();
		
		this.jPanelCamposControlProveedores.setLayout(gridaBagLayoutCamposControlProveedores);
		this.jPanelCamposOcultosControlProveedores.setLayout(gridaBagLayoutCamposOcultosControlProveedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidControlProveedores.add(jLabelIdControlProveedores, this.gridBagConstraintsControlProveedores);



	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidControlProveedores.add(jLabelidControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaControlProveedores.add(jLabelid_empresaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaControlProveedores.add(jButtonid_empresaControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 3;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaControlProveedores.add(jButtonid_empresaControlProveedoresUpdate, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaControlProveedores.add(jComboBoxid_empresaControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaControlProveedores.add(jLabelfecha_emision_hastaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaControlProveedores.add(jButtonfecha_emision_hastaControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaControlProveedores.add(jDateChooserfecha_emision_hastaControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaControlProveedores.add(jLabelnombre_zonaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaControlProveedores.add(jButtonnombre_zonaControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaControlProveedores.add(jTextFieldnombre_zonaControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadControlProveedores.add(jLabelnombre_ciudadControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadControlProveedores.add(jButtonnombre_ciudadControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadControlProveedores.add(jscrollPanenombre_ciudadControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteControlProveedores.add(jLabelnombre_grupo_clienteControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteControlProveedores.add(jButtonnombre_grupo_clienteControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteControlProveedores.add(jscrollPanenombre_grupo_clienteControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoControlProveedores.add(jLabelcodigoControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoControlProveedores.add(jButtoncodigoControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoControlProveedores.add(jTextFieldcodigoControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteControlProveedores.add(jLabelnombre_clienteControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteControlProveedores.add(jButtonnombre_clienteControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteControlProveedores.add(jscrollPanenombre_clienteControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucControlProveedores.add(jLabelrucControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucControlProveedores.add(jButtonrucControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucControlProveedores.add(jTextFieldrucControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonosControlProveedores.add(jLabeltelefonosControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonosControlProveedores.add(jButtontelefonosControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonosControlProveedores.add(jscrollPanetelefonosControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionesControlProveedores.add(jLabeldireccionesControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionesControlProveedores.add(jButtondireccionesControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionesControlProveedores.add(jscrollPanedireccionesControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailsControlProveedores.add(jLabelemailsControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailsControlProveedores.add(jButtonemailsControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailsControlProveedores.add(jscrollPaneemailsControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaControlProveedores.add(jLabelnumero_facturaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaControlProveedores.add(jButtonnumero_facturaControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaControlProveedores.add(jTextFieldnumero_facturaControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionControlProveedores.add(jLabelfecha_emisionControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionControlProveedores.add(jButtonfecha_emisionControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionControlProveedores.add(jDateChooserfecha_emisionControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaControlProveedores.add(jLabelfecha_ventaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaControlProveedores.add(jButtonfecha_ventaControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaControlProveedores.add(jDateChooserfecha_ventaControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoControlProveedores.add(jLabelsaldoControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoControlProveedores.add(jButtonsaldoControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoControlProveedores.add(jTextFieldsaldoControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localControlProveedores.add(jLabeldebito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localControlProveedores.add(jButtondebito_mone_localControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localControlProveedores.add(jTextFielddebito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);


	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 0;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localControlProveedores.add(jLabelcredito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		//this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = 2;
		this.gridBagConstraintsControlProveedores.ipadx = 0;
		this.gridBagConstraintsControlProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localControlProveedores.add(jButtoncredito_mone_localControlProveedoresBusqueda, this.gridBagConstraintsControlProveedores);
	}

	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlProveedores.gridy = 0;
	this.gridBagConstraintsControlProveedores.gridx = 1;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localControlProveedores.add(jTextFieldcredito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelidControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelfecha_emision_hastaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelnombre_zonaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelnombre_ciudadControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelnombre_grupo_clienteControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelcodigoControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelnombre_clienteControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelrucControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPaneltelefonosControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPaneldireccionesControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelemailsControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelnumero_facturaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelfecha_emisionControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelfecha_ventaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelsaldoControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPaneldebito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlProveedores.add(this.jPanelcredito_mone_localControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposControlProveedores % 2==0) {
		iXPanelCamposControlProveedores=0;
		iYPanelCamposControlProveedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlProveedores.gridy = iYPanelCamposOcultosControlProveedores;
	this.gridBagConstraintsControlProveedores.gridx = iXPanelCamposOcultosControlProveedores++;
	this.gridBagConstraintsControlProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosControlProveedores.add(this.jPanelid_empresaControlProveedores, this.gridBagConstraintsControlProveedores);



	if(iXPanelCamposOcultosControlProveedores % 2==0) {
		iXPanelCamposOcultosControlProveedores=0;
		iYPanelCamposOcultosControlProveedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesControlProveedores= new GridBagLayout();
		this.jPanelAccionesControlProveedores.setLayout(gridaBagLayoutAccionesControlProveedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioControlProveedores= new GridBagLayout();
		this.jPanelAccionesFormularioControlProveedores.setLayout(gridaBagLayoutAccionesFormularioControlProveedores);
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsControlProveedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioControlProveedores.add(this.jComboBoxTiposAccionesFormularioControlProveedores, this.gridBagConstraintsControlProveedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesControlProveedores.add(this.jButtonModificarControlProveedores, this.gridBagConstraintsControlProveedores);							

		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlProveedores.gridy = 0;
		this.gridBagConstraintsControlProveedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesControlProveedores.add(this.jButtonEliminarControlProveedores, this.gridBagConstraintsControlProveedores);
		
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = 0;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesControlProveedores.add(this.jButtonActualizarControlProveedores, this.gridBagConstraintsControlProveedores);


		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = 0;		
		this.gridBagConstraintsControlProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesControlProveedores.add(this.jButtonGuardarCambiosControlProveedores, this.gridBagConstraintsControlProveedores);	
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = 0;		
		this.gridBagConstraintsControlProveedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesControlProveedores.add(this.jButtonCancelarControlProveedores, this.gridBagConstraintsControlProveedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutControlProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutControlProveedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();						
			this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlProveedores.gridx = 0;		
			//this.gridBagConstraintsControlProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsControlProveedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsControlProveedores.gridx =0;
		this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsControlProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosControlProveedores, this.gridBagConstraintsControlProveedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleControlProveedores = new ControlProveedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Control Proveedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Control Proveedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Control Proveedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ControlProveedoresModel controlproveedoresModel=new ControlProveedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//ControlProveedoresModel.ControlProveedoresFocusTraversalPolicy controlproveedoresFocusTraversalPolicy = controlproveedoresModel.new ControlProveedoresFocusTraversalPolicy(this);
			
			//controlproveedoresFocusTraversalPolicy.setcontrolproveedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(controlproveedoresModel);
			
			
			this.jContentPaneDetalleControlProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleControlProveedores = new GridBagLayout();	
			this.jContentPaneDetalleControlProveedores.setLayout(gridaBagLayoutDetalleControlProveedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosControlProveedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsControlProveedores = new GridBagConstraints();
				this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsControlProveedores.gridx = 0;
					
				
				this.jContentPaneDetalleControlProveedores.add(jTtoolBarDetalleControlProveedores, gridBagConstraintsControlProveedores);								
				
}
			
			this.jScrollPanelDatosEdicionControlProveedores=   new JScrollPane(jContentPaneDetalleControlProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionControlProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralControlProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralControlProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsControlProveedores.gridx = 0;
	        
			this.jContentPaneDetalleControlProveedores.add(jPanelCamposControlProveedores, gridBagConstraintsControlProveedores);
			
			
			
			
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
						//&& controlproveedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsControlProveedores= new GridBagConstraints();
						this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsControlProveedores.gridx = 0;
						this.jContentPaneDetalleControlProveedores.add(this.jTabbedPaneRelacionesControlProveedores, this.gridBagConstraintsControlProveedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesControlProveedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosControlProveedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsControlProveedores = new GridBagConstraints();
					this.gridBagConstraintsControlProveedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsControlProveedores.gridx = 0;
					
				
					this.jContentPaneDetalleControlProveedores.add(jPanelCamposOcultosControlProveedores, gridBagConstraintsControlProveedores);
				
					this.jPanelCamposOcultosControlProveedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsControlProveedores.gridx = 0;
	        this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleControlProveedores.add(this.jPanelAccionesFormularioControlProveedores, this.gridBagConstraintsControlProveedores);							
			
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
	        this.gridBagConstraintsControlProveedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsControlProveedores.gridx = 0;
	        
			
			this.jContentPaneDetalleControlProveedores.add(this.jPanelAccionesControlProveedores, this.gridBagConstraintsControlProveedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionControlProveedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionControlProveedores=   new JScrollPane(this.jPanelCamposControlProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionControlProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsControlProveedores.gridx = 0;
			this.gridBagConstraintsControlProveedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsControlProveedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsControlProveedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionControlProveedores, this.gridBagConstraintsControlProveedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsControlProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioControlProveedores, this.gridBagConstraintsControlProveedores);			
			
			this.gridBagConstraintsControlProveedores = new GridBagConstraints();
			this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsControlProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesControlProveedores, this.gridBagConstraintsControlProveedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposControlProveedores, this.gridBagConstraintsControlProveedores);
			
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosControlProveedores, this.gridBagConstraintsControlProveedores);
		
			
		this.gridBagConstraintsControlProveedores = new GridBagConstraints();
		this.gridBagConstraintsControlProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsControlProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesControlProveedores, this.gridBagConstraintsControlProveedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralControlProveedores;//jContentPane;
		
		return jScrollPanelDatosEdicionControlProveedores;
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
