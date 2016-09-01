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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.RemesasTransitoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class RemesasTransitoDetalleFormJInternalFrame extends RemesasTransitoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRemesasTransito;
	
	protected JMenuBar jmenuBarDetalleRemesasTransito;
	
	protected JMenu jmenuDetalleRemesasTransito;
	protected JMenu jmenuDetalleArchivoRemesasTransito;
	protected JMenu jmenuDetalleAccionesRemesasTransito;
	protected JMenu jmenuDetalleDatosRemesasTransito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRemesasTransito;	
	protected GridBagConstraints gridBagConstraintsRemesasTransito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RemesasTransitoBeanSwingJInternalFrameAdditional jInternalFrameDetalleRemesasTransito;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RemesasTransitoSessionBean remesastransitoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public RemesasTransitoLogic remesastransitoLogic;
	
	public JScrollPane jScrollPanelDatosRemesasTransito;
	public JScrollPane jScrollPanelDatosEdicionRemesasTransito;
	public JScrollPane jScrollPanelDatosGeneralRemesasTransito;
	
	protected JPanel jPanelCamposRemesasTransito;    
	protected JPanel jPanelCamposOcultosRemesasTransito;    	
	protected JPanel jPanelAccionesRemesasTransito;
	protected JPanel jPanelAccionesFormularioRemesasTransito;
    
	
	
	protected Integer iXPanelCamposRemesasTransito=0;
	protected Integer iYPanelCamposRemesasTransito=0;
	
	protected Integer iXPanelCamposOcultosRemesasTransito=0;
	protected Integer iYPanelCamposOcultosRemesasTransito=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRemesasTransito;
	public JButton jButtonModificarRemesasTransito;
	public JButton jButtonActualizarRemesasTransito;
    public JButton jButtonEliminarRemesasTransito;
	public JButton jButtonCancelarRemesasTransito;
    public JButton jButtonGuardarCambiosRemesasTransito;
	public JButton jButtonGuardarCambiosTablaRemesasTransito;
	protected JButton jButtonCerrarRemesasTransito;
	
	
	protected JButton jButtonProcesarInformacionRemesasTransito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRemesasTransito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRemesasTransito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRemesasTransito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRemesasTransito;
	protected JButton jButtonModificarToolBarRemesasTransito;
	protected JButton jButtonActualizarToolBarRemesasTransito;
    protected JButton jButtonEliminarToolBarRemesasTransito;
	protected JButton jButtonCancelarToolBarRemesasTransito;
    protected JButton jButtonGuardarCambiosToolBarRemesasTransito;
	protected JButton jButtonGuardarCambiosTablaToolBarRemesasTransito;
	protected JButton jButtonMostrarOcultarTablaToolBarRemesasTransito;
	protected JButton jButtonCerrarToolBarRemesasTransito;
	
	protected JButton jButtonProcesarInformacionToolBarRemesasTransito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRemesasTransito;
	protected JMenuItem jMenuItemModificarRemesasTransito;
	protected JMenuItem jMenuItemActualizarRemesasTransito;
    protected JMenuItem jMenuItemEliminarRemesasTransito;
	protected JMenuItem jMenuItemCancelarRemesasTransito;
    protected JMenuItem jMenuItemGuardarCambiosRemesasTransito;
	protected JMenuItem jMenuItemGuardarCambiosTablaRemesasTransito;
	protected JMenuItem jMenuItemCerrarRemesasTransito;
	protected JMenuItem jMenuItemDetalleCerrarRemesasTransito;
	protected JMenuItem jMenuItemDetalleMostarOcultarRemesasTransito;
	
	protected JMenuItem jMenuItemProcesarInformacionRemesasTransito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRemesasTransito;
	protected JMenuItem jMenuItemMostrarOcultarRemesasTransito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRemesasTransito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRemesasTransito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRemesasTransito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRemesasTransito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRemesasTransito;
	public JLabel jLabelIdRemesasTransito;
	public JLabel jLabelidRemesasTransito;
	public JButton jButtonidRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoRemesasTransito;
	public JLabel jLabelnombre_bancoRemesasTransito;
	public JTextArea jTextAreanombre_bancoRemesasTransito;
	public JScrollPane jscrollPanenombre_bancoRemesasTransito;
	public JButton jButtonnombre_bancoRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_giradorRemesasTransito;
	public JLabel jLabelnombre_giradorRemesasTransito;
	public JTextArea jTextAreanombre_giradorRemesasTransito;
	public JScrollPane jscrollPanenombre_giradorRemesasTransito;
	public JButton jButtonnombre_giradorRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoRemesasTransito;
	public JLabel jLabelfecha_vencimientoRemesasTransito;
	//public JFormattedTextField jDateChooserfecha_vencimientoRemesasTransito;

	public JDateChooser jDateChooserfecha_vencimientoRemesasTransito;
	public JButton jButtonfecha_vencimientoRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaRemesasTransito;
	public JLabel jLabelnumero_cuentaRemesasTransito;
	public JTextField jTextFieldnumero_cuentaRemesasTransito;
	public JButton jButtonnumero_cuentaRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeRemesasTransito;
	public JLabel jLabelnumero_chequeRemesasTransito;
	public JTextField jTextFieldnumero_chequeRemesasTransito;
	public JButton jButtonnumero_chequeRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_montoRemesasTransito;
	public JLabel jLabelvalor_montoRemesasTransito;
	public JTextField jTextFieldvalor_montoRemesasTransito;
	public JButton jButtonvalor_montoRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelvalorRemesasTransito;
	public JLabel jLabelvalorRemesasTransito;
	public JTextField jTextFieldvalorRemesasTransito;
	public JButton jButtonvalorRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorRemesasTransito;
	public JLabel jLabelnumero_mayorRemesasTransito;
	public JTextArea jTextAreanumero_mayorRemesasTransito;
	public JScrollPane jscrollPanenumero_mayorRemesasTransito;
	public JButton jButtonnumero_mayorRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoRemesasTransito;
	public JLabel jLabelcodigoRemesasTransito;
	public JTextField jTextFieldcodigoRemesasTransito;
	public JButton jButtoncodigoRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_originalRemesasTransito;
	public JLabel jLabelfecha_vencimiento_originalRemesasTransito;
	//public JFormattedTextField jDateChooserfecha_vencimiento_originalRemesasTransito;

	public JDateChooser jDateChooserfecha_vencimiento_originalRemesasTransito;
	public JButton jButtonfecha_vencimiento_originalRemesasTransitoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cambioRemesasTransito;
	public JLabel jLabelnumero_cambioRemesasTransito;
	public JTextField jTextFieldnumero_cambioRemesasTransito;
	public JButton jButtonnumero_cambioRemesasTransitoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRemesasTransito;
	public JLabel jLabelid_empresaRemesasTransito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRemesasTransito;
	public JButton jButtonid_empresaRemesasTransito= new JButtonMe();
	public JButton jButtonid_empresaRemesasTransitoUpdate= new JButtonMe();
	public JButton jButtonid_empresaRemesasTransitoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRemesasTransito;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RemesasTransitoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRemesasTransito=new JPanel();
				this.jPanelAccionesFormularioRemesasTransito=new JPanel();
				this.jmenuBarDetalleRemesasTransito=new JMenuBar();
				this.jTtoolBarDetalleRemesasTransito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RemesasTransitoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RemesasTransitoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RemesasTransito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRemesasTransito() {
		return this.jButtonActualizarToolBarRemesasTransito;
	}
	
	public JButton getjButtonEliminarToolBarRemesasTransito() {
		return this.jButtonEliminarToolBarRemesasTransito;
	}
	
	public JButton getjButtonCancelarToolBarRemesasTransito() {
		return this.jButtonCancelarToolBarRemesasTransito;
	}		
	
	public JButton getjButtonProcesarInformacionRemesasTransito() {
		return this.jButtonProcesarInformacionRemesasTransito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRemesasTransito)	{
		this.jButtonProcesarInformacionRemesasTransito = jButtonProcesarInformacionRemesasTransito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRemesasTransito() {
		return this.jComboBoxTiposAccionesRemesasTransito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRemesasTransito(
			JComboBox jComboBoxTiposRelacionesRemesasTransito) {
		this.jComboBoxTiposRelacionesRemesasTransito = jComboBoxTiposRelacionesRemesasTransito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRemesasTransito(
			JComboBox jComboBoxTiposAccionesRemesasTransito) {
		this.jComboBoxTiposAccionesRemesasTransito = jComboBoxTiposAccionesRemesasTransito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRemesasTransito() {
		return this.jComboBoxTiposAccionesFormularioRemesasTransito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRemesasTransito(
			JComboBox jComboBoxTiposAccionesFormularioRemesasTransito) {
		this.jComboBoxTiposAccionesFormularioRemesasTransito = jComboBoxTiposAccionesFormularioRemesasTransito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
		
		this.remesastransitoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.remesastransitoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.remesastransitoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RemesasTransitoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RemesasTransitoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Remesas Transito MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
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
	
		RemesasTransitoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRemesasTransito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRemesasTransito=new JButtonMe();
				this.jButtonModificarToolBarRemesasTransito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito,
							"actualizar","actualizar","Actualizar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito,
							"eliminar","eliminar","Eliminar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito,
							"cancelar","cancelar","Cancelar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRemesasTransito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito,
							"guardarcambios","guardarcambios","Guardar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRemesasTransito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRemesasTransito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRemesasTransito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRemesasTransito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRemesasTransito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRemesasTransito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRemesasTransito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRemesasTransito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRemesasTransito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRemesasTransito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRemesasTransito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRemesasTransito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRemesasTransito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRemesasTransito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRemesasTransito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRemesasTransito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRemesasTransito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRemesasTransito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRemesasTransito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRemesasTransito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRemesasTransito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRemesasTransito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRemesasTransito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRemesasTransito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRemesasTransito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRemesasTransito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRemesasTransito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRemesasTransito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRemesasTransito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRemesasTransito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRemesasTransito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRemesasTransito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRemesasTransito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRemesasTransito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRemesasTransito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRemesasTransito.add(this.jMenuItemDetalleCerrarRemesasTransito);
		
		this.jmenuDetalleAccionesRemesasTransito.add(this.jMenuItemActualizarRemesasTransito);
		this.jmenuDetalleAccionesRemesasTransito.add(this.jMenuItemEliminarRemesasTransito);
		this.jmenuDetalleAccionesRemesasTransito.add(this.jMenuItemCancelarRemesasTransito);		
		
		//this.jmenuDetalleDatosRemesasTransito.add(this.jMenuItemDetalleAbrirOrderByRemesasTransito);				
		this.jmenuDetalleDatosRemesasTransito.add(this.jMenuItemDetalleMostarOcultarRemesasTransito);				
				
		//this.jmenuDetalleAccionesRemesasTransito.add(this.jMenuItemGuardarCambiosRemesasTransito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRemesasTransito.add(this.jmenuDetalleArchivoRemesasTransito);		
		this.jmenuBarDetalleRemesasTransito.add(this.jmenuDetalleAccionesRemesasTransito);		
		this.jmenuBarDetalleRemesasTransito.add(this.jmenuDetalleDatosRemesasTransito);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRemesasTransito);				
	}
	
	
	public void inicializarElementosCamposRemesasTransito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRemesasTransito = new JLabelMe();
		jLabelIdRemesasTransito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRemesasTransito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRemesasTransito= new GridBagLayout();

		this.jPanelidRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);

		jLabelidRemesasTransito = new JLabel();
		jLabelidRemesasTransito.setText("Id");

		jLabelidRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_bancoRemesasTransito = new JLabelMe();
		this.jLabelnombre_bancoRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoRemesasTransito.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnombre_bancoRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextAreanombre_bancoRemesasTransito= new JTextAreaMe();
		jTextAreanombre_bancoRemesasTransito.setEnabled(false);
		jTextAreanombre_bancoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRemesasTransito.setLineWrap(true);
		jTextAreanombre_bancoRemesasTransito.setWrapStyleWord(true);
		jTextAreanombre_bancoRemesasTransito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoRemesasTransito.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoRemesasTransito = new JScrollPane(jTextAreanombre_bancoRemesasTransito);
		jscrollPanenombre_bancoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_bancoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_bancoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_bancoRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoRemesasTransitoBusqueda.setText("U");
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_giradorRemesasTransito = new JLabelMe();
		this.jLabelnombre_giradorRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR+" : *");
		this.jLabelnombre_giradorRemesasTransito.setToolTipText("Nombre Girador");
		this.jLabelnombre_giradorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_giradorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_giradorRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_giradorRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnombre_giradorRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextAreanombre_giradorRemesasTransito= new JTextAreaMe();
		jTextAreanombre_giradorRemesasTransito.setEnabled(false);
		jTextAreanombre_giradorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRemesasTransito.setLineWrap(true);
		jTextAreanombre_giradorRemesasTransito.setWrapStyleWord(true);
		jTextAreanombre_giradorRemesasTransito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_giradorRemesasTransito.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_giradorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_giradorRemesasTransito = new JScrollPane(jTextAreanombre_giradorRemesasTransito);
		jscrollPanenombre_giradorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_giradorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_giradorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_giradorRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_giradorRemesasTransitoBusqueda.setText("U");
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_giradorRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_giradorRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_giradorRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_giradorRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_giradorRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoRemesasTransito = new JLabelMe();
		this.jLabelfecha_vencimientoRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoRemesasTransito.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelfecha_vencimientoRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		//jFormattedTextFieldfecha_vencimientoRemesasTransito= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoRemesasTransito= new JDateChooser();
		jDateChooserfecha_vencimientoRemesasTransito.setEnabled(false);
		jDateChooserfecha_vencimientoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoRemesasTransito.setDate(new Date());
		jDateChooserfecha_vencimientoRemesasTransito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoRemesasTransito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setText("U");
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaRemesasTransito = new JLabelMe();
		this.jLabelnumero_cuentaRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaRemesasTransito.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnumero_cuentaRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldnumero_cuentaRemesasTransito= new JTextFieldMe();

		jTextFieldnumero_cuentaRemesasTransito.setEnabled(false);
		jTextFieldnumero_cuentaRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaRemesasTransitoBusqueda.setText("U");
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeRemesasTransito = new JLabelMe();
		this.jLabelnumero_chequeRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeRemesasTransito.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnumero_chequeRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldnumero_chequeRemesasTransito= new JTextFieldMe();

		jTextFieldnumero_chequeRemesasTransito.setEnabled(false);
		jTextFieldnumero_chequeRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeRemesasTransitoBusqueda.setText("U");
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_montoRemesasTransito = new JLabelMe();
		this.jLabelvalor_montoRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_VALORMONTO+" : *");
		this.jLabelvalor_montoRemesasTransito.setToolTipText("Valor Monto");
		this.jLabelvalor_montoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_montoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_montoRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_montoRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelvalor_montoRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldvalor_montoRemesasTransito= new JTextFieldMe();
		jTextFieldvalor_montoRemesasTransito.setEnabled(false);
		jTextFieldvalor_montoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_montoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_montoRemesasTransito.setText("0.0");

		this.jButtonvalor_montoRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonvalor_montoRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_montoRemesasTransitoBusqueda.setText("U");
		this.jButtonvalor_montoRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_montoRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_montoRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_montoRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_montoRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_montoRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_montoRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelvalorRemesasTransito = new JLabelMe();
		this.jLabelvalorRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRemesasTransito.setToolTipText("Valor");
		this.jLabelvalorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelvalorRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldvalorRemesasTransito= new JTextFieldMe();
		jTextFieldvalorRemesasTransito.setEnabled(false);
		jTextFieldvalorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRemesasTransito.setText("0.0");

		this.jButtonvalorRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonvalorRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRemesasTransitoBusqueda.setText("U");
		this.jButtonvalorRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorRemesasTransito = new JLabelMe();
		this.jLabelnumero_mayorRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorRemesasTransito.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnumero_mayorRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextAreanumero_mayorRemesasTransito= new JTextAreaMe();
		jTextAreanumero_mayorRemesasTransito.setEnabled(false);
		jTextAreanumero_mayorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorRemesasTransito.setLineWrap(true);
		jTextAreanumero_mayorRemesasTransito.setWrapStyleWord(true);
		jTextAreanumero_mayorRemesasTransito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorRemesasTransito.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorRemesasTransito = new JScrollPane(jTextAreanumero_mayorRemesasTransito);
		jscrollPanenumero_mayorRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorRemesasTransitoBusqueda.setText("U");
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelcodigoRemesasTransito = new JLabelMe();
		this.jLabelcodigoRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoRemesasTransito.setToolTipText("Codigo");
		this.jLabelcodigoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelcodigoRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldcodigoRemesasTransito= new JTextFieldMe();

		jTextFieldcodigoRemesasTransito.setEnabled(false);
		jTextFieldcodigoRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoRemesasTransitoBusqueda= new JButtonMe();
		this.jButtoncodigoRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoRemesasTransitoBusqueda.setText("U");
		this.jButtoncodigoRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimiento_originalRemesasTransito = new JLabelMe();
		this.jLabelfecha_vencimiento_originalRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL+" : *");
		this.jLabelfecha_vencimiento_originalRemesasTransito.setToolTipText("Fecha Vencimiento Original");
		this.jLabelfecha_vencimiento_originalRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_originalRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_originalRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_originalRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelfecha_vencimiento_originalRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		//jFormattedTextFieldfecha_vencimiento_originalRemesasTransito= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_originalRemesasTransito= new JDateChooser();
		jDateChooserfecha_vencimiento_originalRemesasTransito.setEnabled(false);
		jDateChooserfecha_vencimiento_originalRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_originalRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_originalRemesasTransito.setDate(new Date());
		jDateChooserfecha_vencimiento_originalRemesasTransito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_originalRemesasTransito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setText("U");
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_originalRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_originalRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_originalRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cambioRemesasTransito = new JLabelMe();
		this.jLabelnumero_cambioRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO+" : *");
		this.jLabelnumero_cambioRemesasTransito.setToolTipText("Numero Cambio");
		this.jLabelnumero_cambioRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cambioRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cambioRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cambioRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cambioRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cambioRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelnumero_cambioRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jTextFieldnumero_cambioRemesasTransito= new JTextFieldMe();
		jTextFieldnumero_cambioRemesasTransito.setEnabled(false);
		jTextFieldnumero_cambioRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cambioRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cambioRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cambioRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cambioRemesasTransito.setText("0");

		this.jButtonnumero_cambioRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cambioRemesasTransitoBusqueda.setText("U");
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cambioRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cambioRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cambioRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cambioRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cambioRemesasTransitoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRemesasTransito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRemesasTransito = new JLabelMe();
		this.jLabelid_empresaRemesasTransito.setText(""+RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRemesasTransito.setToolTipText("Empresa");
		this.jLabelid_empresaRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRemesasTransito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRemesasTransito.setToolTipText(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRemesasTransito = new GridBagLayout();
		this.jPanelid_empresaRemesasTransito.setLayout(this.gridaBagLayoutRemesasTransito);


		jComboBoxid_empresaRemesasTransito= new JComboBoxMe();
		jComboBoxid_empresaRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRemesasTransito.setEnabled(false);

		this.jButtonid_empresaRemesasTransito= new JButtonMe();
		this.jButtonid_empresaRemesasTransito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRemesasTransito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRemesasTransito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRemesasTransito.setText("Buscar");
		this.jButtonid_empresaRemesasTransito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRemesasTransito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRemesasTransito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRemesasTransito"));

		this.jButtonid_empresaRemesasTransitoBusqueda= new JButtonMe();
		this.jButtonid_empresaRemesasTransitoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRemesasTransitoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRemesasTransitoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRemesasTransitoBusqueda.setText("U");
		this.jButtonid_empresaRemesasTransitoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRemesasTransitoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRemesasTransitoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRemesasTransitoBusqueda"));

		if(this.remesastransitoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRemesasTransitoBusqueda.setVisible(false);		}

		this.jButtonid_empresaRemesasTransitoUpdate= new JButtonMe();
		this.jButtonid_empresaRemesasTransitoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRemesasTransitoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRemesasTransitoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRemesasTransitoUpdate.setText("U");
		this.jButtonid_empresaRemesasTransitoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRemesasTransitoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRemesasTransitoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRemesasTransitoUpdate"));



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
		//this.jInternalFrameDetalleRemesasTransito = new RemesasTransitoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Remesas Transito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRemesasTransito= new GridBagLayout();
		

		
		String sToolTipRemesasTransito="";
		sToolTipRemesasTransito=RemesasTransitoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRemesasTransito+="(Tesoreria.RemesasTransito)";
		}
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRemesasTransito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRemesasTransito = new JButtonMe();
		this.jButtonModificarRemesasTransito = new JButtonMe();
        this.jButtonActualizarRemesasTransito = new JButtonMe();
        this.jButtonEliminarRemesasTransito = new JButtonMe();
        this.jButtonCancelarRemesasTransito = new JButtonMe();
        this.jButtonGuardarCambiosRemesasTransito = new JButtonMe();
		this.jButtonGuardarCambiosTablaRemesasTransito = new JButtonMe();
		this.jButtonCerrarRemesasTransito = new JButtonMe();
		
		this.jScrollPanelDatosRemesasTransito = new JScrollPane();   
        this.jScrollPanelDatosEdicionRemesasTransito = new JScrollPane();
		this.jScrollPanelDatosGeneralRemesasTransito = new JScrollPane();
				
		
		
		this.jPanelCamposRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Remesas Transito";
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Remesas Transitos" + this.sPath));
		} else {
			this.jScrollPanelDatosRemesasTransito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRemesasTransito.setName("jPanelCamposRemesasTransito"); 

		this.jPanelCamposOcultosRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRemesasTransito.setName("jPanelCamposOcultosRemesasTransito"); 

        this.jPanelAccionesRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRemesasTransito.setToolTipText("Acciones");
        this.jPanelAccionesRemesasTransito.setName("Acciones"); 

		this.jPanelAccionesFormularioRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRemesasTransito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRemesasTransito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRemesasTransito.setText("Nuevo");
		this.jButtonModificarRemesasTransito.setText("Editar");
        this.jButtonActualizarRemesasTransito.setText("Actualizar");
        this.jButtonEliminarRemesasTransito.setText("Eliminar");
        this.jButtonCancelarRemesasTransito.setText("Cancelar");
        this.jButtonGuardarCambiosRemesasTransito.setText("Guardar");
		this.jButtonGuardarCambiosTablaRemesasTransito.setText("Guardar");
		this.jButtonCerrarRemesasTransito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRemesasTransito,"nuevo_button","Nuevo",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRemesasTransito,"modificar_button","Editar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRemesasTransito,"actualizar_button","Actualizar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRemesasTransito,"eliminar_button","Eliminar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRemesasTransito,"cancelar_button","Cancelar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRemesasTransito,"guardarcambios_button","Guardar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRemesasTransito,"guardarcambiostabla_button","Guardar",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRemesasTransito,"cerrar_button","Salir",this.remesastransitoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRemesasTransito.setToolTipText("Nuevo"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRemesasTransito.setToolTipText("Editar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRemesasTransito.setToolTipText("Actualizar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRemesasTransito.setToolTipText("Eliminar)"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRemesasTransito.setToolTipText("Cancelar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRemesasTransito.setToolTipText("Guardar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRemesasTransito.setToolTipText("Guardar"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRemesasTransito.setToolTipText("Salir"+" "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRemesasTransito";
		inputMap = this.jButtonNuevoRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRemesasTransito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRemesasTransito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRemesasTransito";
		inputMap = this.jButtonActualizarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRemesasTransito"));
		
		//ELIMINAR
		sMapKey = "EliminarRemesasTransito";
		inputMap = this.jButtonEliminarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRemesasTransito"));
		
		//CANCELAR	
		sMapKey = "CancelarRemesasTransito";
		inputMap = this.jButtonCancelarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRemesasTransito"));
		
		//CERRAR		
		sMapKey = "CerrarRemesasTransito";
		inputMap = this.jButtonCerrarRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRemesasTransito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRemesasTransito";
		inputMap = this.jButtonGuardarCambiosTablaRemesasTransito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRemesasTransito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRemesasTransito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRemesasTransito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRemesasTransito.setToolTipText("Nuevo RemesasTransito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRemesasTransito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRemesasTransito.setToolTipText("Sin Cerrar Ventana RemesasTransito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRemesasTransito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRemesasTransito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRemesasTransito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRemesasTransito.setText("Accion");
		this.jComboBoxTiposAccionesRemesasTransito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRemesasTransito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRemesasTransito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRemesasTransito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRemesasTransito = new JLabelMe();
		
		this.jLabelAccionesRemesasTransito.setText("Acciones");		
		this.jLabelAccionesRemesasTransito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRemesasTransito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRemesasTransito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRemesasTransito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRemesasTransito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRemesasTransito=new JTabbedPane();
		this.jTabbedPaneRelacionesRemesasTransito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRemesasTransito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRemesasTransito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRemesasTransito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRemesasTransito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRemesasTransito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRemesasTransito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRemesasTransito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRemesasTransito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRemesasTransito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRemesasTransito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRemesasTransito = new GridBagLayout();
		
		this.jPanelCamposRemesasTransito.setLayout(gridaBagLayoutCamposRemesasTransito);
		this.jPanelCamposOcultosRemesasTransito.setLayout(gridaBagLayoutCamposOcultosRemesasTransito);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRemesasTransito.add(jLabelIdRemesasTransito, this.gridBagConstraintsRemesasTransito);



	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRemesasTransito.add(jLabelidRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRemesasTransito.add(jLabelid_empresaRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRemesasTransito.add(jButtonid_empresaRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 3;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRemesasTransito.add(jButtonid_empresaRemesasTransitoUpdate, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRemesasTransito.add(jComboBoxid_empresaRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoRemesasTransito.add(jLabelnombre_bancoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoRemesasTransito.add(jButtonnombre_bancoRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoRemesasTransito.add(jscrollPanenombre_bancoRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_giradorRemesasTransito.add(jLabelnombre_giradorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_giradorRemesasTransito.add(jButtonnombre_giradorRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_giradorRemesasTransito.add(jscrollPanenombre_giradorRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoRemesasTransito.add(jLabelfecha_vencimientoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoRemesasTransito.add(jButtonfecha_vencimientoRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoRemesasTransito.add(jDateChooserfecha_vencimientoRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaRemesasTransito.add(jLabelnumero_cuentaRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaRemesasTransito.add(jButtonnumero_cuentaRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaRemesasTransito.add(jTextFieldnumero_cuentaRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeRemesasTransito.add(jLabelnumero_chequeRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeRemesasTransito.add(jButtonnumero_chequeRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeRemesasTransito.add(jTextFieldnumero_chequeRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_montoRemesasTransito.add(jLabelvalor_montoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_montoRemesasTransito.add(jButtonvalor_montoRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_montoRemesasTransito.add(jTextFieldvalor_montoRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRemesasTransito.add(jLabelvalorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRemesasTransito.add(jButtonvalorRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRemesasTransito.add(jTextFieldvalorRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorRemesasTransito.add(jLabelnumero_mayorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorRemesasTransito.add(jButtonnumero_mayorRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorRemesasTransito.add(jscrollPanenumero_mayorRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoRemesasTransito.add(jLabelcodigoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoRemesasTransito.add(jButtoncodigoRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoRemesasTransito.add(jTextFieldcodigoRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_originalRemesasTransito.add(jLabelfecha_vencimiento_originalRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_originalRemesasTransito.add(jButtonfecha_vencimiento_originalRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_originalRemesasTransito.add(jDateChooserfecha_vencimiento_originalRemesasTransito, this.gridBagConstraintsRemesasTransito);


	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 0;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cambioRemesasTransito.add(jLabelnumero_cambioRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		//this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = 2;
		this.gridBagConstraintsRemesasTransito.ipadx = 0;
		this.gridBagConstraintsRemesasTransito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cambioRemesasTransito.add(jButtonnumero_cambioRemesasTransitoBusqueda, this.gridBagConstraintsRemesasTransito);
	}

	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRemesasTransito.gridy = 0;
	this.gridBagConstraintsRemesasTransito.gridx = 1;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cambioRemesasTransito.add(jTextFieldnumero_cambioRemesasTransito, this.gridBagConstraintsRemesasTransito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelidRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnombre_bancoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnombre_giradorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelfecha_vencimientoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnumero_cuentaRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnumero_chequeRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelvalor_montoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelvalorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnumero_mayorRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelcodigoRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelfecha_vencimiento_originalRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRemesasTransito.add(this.jPanelnumero_cambioRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposRemesasTransito % 2==0) {
		iXPanelCamposRemesasTransito=0;
		iYPanelCamposRemesasTransito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRemesasTransito.gridy = iYPanelCamposOcultosRemesasTransito;
	this.gridBagConstraintsRemesasTransito.gridx = iXPanelCamposOcultosRemesasTransito++;
	this.gridBagConstraintsRemesasTransito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRemesasTransito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRemesasTransito.add(this.jPanelid_empresaRemesasTransito, this.gridBagConstraintsRemesasTransito);



	if(iXPanelCamposOcultosRemesasTransito % 2==0) {
		iXPanelCamposOcultosRemesasTransito=0;
		iYPanelCamposOcultosRemesasTransito++;
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
			
		GridBagLayout gridaBagLayoutAccionesRemesasTransito= new GridBagLayout();
		this.jPanelAccionesRemesasTransito.setLayout(gridaBagLayoutAccionesRemesasTransito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRemesasTransito= new GridBagLayout();
		this.jPanelAccionesFormularioRemesasTransito.setLayout(gridaBagLayoutAccionesFormularioRemesasTransito);
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRemesasTransito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRemesasTransito.add(this.jComboBoxTiposAccionesFormularioRemesasTransito, this.gridBagConstraintsRemesasTransito);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx = iPosXAccion++;
			
		this.jPanelAccionesRemesasTransito.add(this.jButtonModificarRemesasTransito, this.gridBagConstraintsRemesasTransito);							

		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRemesasTransito.gridy = 0;
		this.gridBagConstraintsRemesasTransito.gridx =iPosXAccion++;
			
		this.jPanelAccionesRemesasTransito.add(this.jButtonEliminarRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = 0;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXAccion++;
		
		this.jPanelAccionesRemesasTransito.add(this.jButtonActualizarRemesasTransito, this.gridBagConstraintsRemesasTransito);


		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = 0;		
		this.gridBagConstraintsRemesasTransito.gridx = iPosXAccion++;
		
		this.jPanelAccionesRemesasTransito.add(this.jButtonGuardarCambiosRemesasTransito, this.gridBagConstraintsRemesasTransito);	
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = 0;		
		this.gridBagConstraintsRemesasTransito.gridx =iPosXAccion++;
		
		this.jPanelAccionesRemesasTransito.add(this.jButtonCancelarRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRemesasTransito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRemesasTransito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();						
			this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRemesasTransito.gridx = 0;		
			//this.gridBagConstraintsRemesasTransito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRemesasTransito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRemesasTransito.gridx =0;
		this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRemesasTransito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRemesasTransito, this.gridBagConstraintsRemesasTransito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRemesasTransito = new RemesasTransitoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Remesas Transito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Remesas Transito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Remesas Transito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RemesasTransitoModel remesastransitoModel=new RemesasTransitoModel(this);
			
			//SI USARA CLASE INTERNA
			//RemesasTransitoModel.RemesasTransitoFocusTraversalPolicy remesastransitoFocusTraversalPolicy = remesastransitoModel.new RemesasTransitoFocusTraversalPolicy(this);
			
			//remesastransitoFocusTraversalPolicy.setremesastransitoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(remesastransitoModel);
			
			
			this.jContentPaneDetalleRemesasTransito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRemesasTransito = new GridBagLayout();	
			this.jContentPaneDetalleRemesasTransito.setLayout(gridaBagLayoutDetalleRemesasTransito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRemesasTransito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
				this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRemesasTransito.gridx = 0;
					
				
				this.jContentPaneDetalleRemesasTransito.add(jTtoolBarDetalleRemesasTransito, gridBagConstraintsRemesasTransito);								
				
}
			
			this.jScrollPanelDatosEdicionRemesasTransito=   new JScrollPane(jContentPaneDetalleRemesasTransito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRemesasTransito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRemesasTransito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRemesasTransito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRemesasTransito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRemesasTransito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRemesasTransito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRemesasTransito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRemesasTransito.gridx = 0;
	        
			this.jContentPaneDetalleRemesasTransito.add(jPanelCamposRemesasTransito, gridBagConstraintsRemesasTransito);
			
			
			
			
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
						//&& remesastransitoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRemesasTransito= new GridBagConstraints();
						this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRemesasTransito.gridx = 0;
						this.jContentPaneDetalleRemesasTransito.add(this.jTabbedPaneRelacionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRemesasTransito.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRemesasTransito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
					this.gridBagConstraintsRemesasTransito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRemesasTransito.gridx = 0;
					
				
					this.jContentPaneDetalleRemesasTransito.add(jPanelCamposOcultosRemesasTransito, gridBagConstraintsRemesasTransito);
				
					this.jPanelCamposOcultosRemesasTransito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRemesasTransito.gridx = 0;
	        this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRemesasTransito.add(this.jPanelAccionesFormularioRemesasTransito, this.gridBagConstraintsRemesasTransito);							
			
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
	        this.gridBagConstraintsRemesasTransito.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRemesasTransito.gridx = 0;
	        
			
			this.jContentPaneDetalleRemesasTransito.add(this.jPanelAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRemesasTransito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRemesasTransito=   new JScrollPane(this.jPanelCamposRemesasTransito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRemesasTransito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRemesasTransito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRemesasTransito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRemesasTransito.gridx = 0;
			this.gridBagConstraintsRemesasTransito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRemesasTransito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRemesasTransito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRemesasTransito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRemesasTransito, this.gridBagConstraintsRemesasTransito);			
			
			this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
			this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRemesasTransito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRemesasTransito, this.gridBagConstraintsRemesasTransito);
			
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRemesasTransito, this.gridBagConstraintsRemesasTransito);
		
			
		this.gridBagConstraintsRemesasTransito = new GridBagConstraints();
		this.gridBagConstraintsRemesasTransito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRemesasTransito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRemesasTransito, this.gridBagConstraintsRemesasTransito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRemesasTransito;//jContentPane;
		
		return jScrollPanelDatosEdicionRemesasTransito;
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
