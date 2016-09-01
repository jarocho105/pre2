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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGeneralConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoCuentaBancoGeneralDetalleFormJInternalFrame extends TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCuentaBancoGeneral;
	
	protected JMenuBar jmenuBarDetalleTipoCuentaBancoGeneral;
	
	protected JMenu jmenuDetalleTipoCuentaBancoGeneral;
	protected JMenu jmenuDetalleArchivoTipoCuentaBancoGeneral;
	protected JMenu jmenuDetalleAccionesTipoCuentaBancoGeneral;
	protected JMenu jmenuDetalleDatosTipoCuentaBancoGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBancoGeneral;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBancoGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCuentaBancoGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabanco="";
	
	public TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;	
	
	public TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic;
	
	public JScrollPane jScrollPanelDatosTipoCuentaBancoGeneral;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGeneral;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBancoGeneral;
	
	protected JPanel jPanelCamposTipoCuentaBancoGeneral;    
	protected JPanel jPanelCamposOcultosTipoCuentaBancoGeneral;    	
	protected JPanel jPanelAccionesTipoCuentaBancoGeneral;
	protected JPanel jPanelAccionesFormularioTipoCuentaBancoGeneral;
    
	
	
	protected Integer iXPanelCamposTipoCuentaBancoGeneral=0;
	protected Integer iYPanelCamposTipoCuentaBancoGeneral=0;
	
	protected Integer iXPanelCamposOcultosTipoCuentaBancoGeneral=0;
	protected Integer iYPanelCamposOcultosTipoCuentaBancoGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCuentaBancoGeneral;
	public JButton jButtonModificarTipoCuentaBancoGeneral;
	public JButton jButtonActualizarTipoCuentaBancoGeneral;
    public JButton jButtonEliminarTipoCuentaBancoGeneral;
	public JButton jButtonCancelarTipoCuentaBancoGeneral;
    public JButton jButtonGuardarCambiosTipoCuentaBancoGeneral;
	public JButton jButtonGuardarCambiosTablaTipoCuentaBancoGeneral;
	protected JButton jButtonCerrarTipoCuentaBancoGeneral;
	
	
	protected JButton jButtonProcesarInformacionTipoCuentaBancoGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonModificarToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonActualizarToolBarTipoCuentaBancoGeneral;
    protected JButton jButtonEliminarToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonCancelarToolBarTipoCuentaBancoGeneral;
    protected JButton jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGeneral;
	protected JButton jButtonCerrarToolBarTipoCuentaBancoGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemModificarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemActualizarTipoCuentaBancoGeneral;
    protected JMenuItem jMenuItemEliminarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemCancelarTipoCuentaBancoGeneral;
    protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemCerrarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBancoGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBancoGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCuentaBancoGeneral;
	public JLabel jLabelIdTipoCuentaBancoGeneral;
	public JLabel jLabelidTipoCuentaBancoGeneral;
	public JButton jButtonidTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCuentaBancoGeneral;
	public JLabel jLabelcodigoTipoCuentaBancoGeneral;
	public JTextField jTextFieldcodigoTipoCuentaBancoGeneral;
	public JButton jButtoncodigoTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCuentaBancoGeneral;
	public JLabel jLabelid_empresaTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCuentaBancoGeneral;
	public JButton jButtonid_empresaTipoCuentaBancoGeneral= new JButtonMe();
	public JButton jButtonid_empresaTipoCuentaBancoGeneralUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoTipoCuentaBancoGeneral;
	public JLabel jLabelid_bancoTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoTipoCuentaBancoGeneral;
	public JButton jButtonid_bancoTipoCuentaBancoGeneral= new JButtonMe();
	public JButton jButtonid_bancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
	public JButton jButtonid_bancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral;
	public JLabel jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral;
	public JButton jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCuentaBancoGeneral;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCuentaBancoGeneral=new JPanel();
				this.jPanelAccionesFormularioTipoCuentaBancoGeneral=new JPanel();
				this.jmenuBarDetalleTipoCuentaBancoGeneral=new JMenuBar();
				this.jTtoolBarDetalleTipoCuentaBancoGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBancoGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCuentaBancoGeneral() {
		return this.jButtonActualizarToolBarTipoCuentaBancoGeneral;
	}
	
	public JButton getjButtonEliminarToolBarTipoCuentaBancoGeneral() {
		return this.jButtonEliminarToolBarTipoCuentaBancoGeneral;
	}
	
	public JButton getjButtonCancelarToolBarTipoCuentaBancoGeneral() {
		return this.jButtonCancelarToolBarTipoCuentaBancoGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCuentaBancoGeneral() {
		return this.jButtonProcesarInformacionTipoCuentaBancoGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBancoGeneral)	{
		this.jButtonProcesarInformacionTipoCuentaBancoGeneral = jButtonProcesarInformacionTipoCuentaBancoGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral = jComboBoxTiposRelacionesTipoCuentaBancoGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposAccionesTipoCuentaBancoGeneral) {
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral = jComboBoxTiposAccionesTipoCuentaBancoGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral() {
		return this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral(
			JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral) {
		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral = jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		
		this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco General MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCuentaBancoGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCuentaBancoGeneral=new JButtonMe();
				this.jButtonModificarToolBarTipoCuentaBancoGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral,
							"actualizar","actualizar","Actualizar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral,
							"eliminar","eliminar","Eliminar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral,
							"cancelar","cancelar","Cancelar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCuentaBancoGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCuentaBancoGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCuentaBancoGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCuentaBancoGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCuentaBancoGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBancoGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBancoGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBancoGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCuentaBancoGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCuentaBancoGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCuentaBancoGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCuentaBancoGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCuentaBancoGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCuentaBancoGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCuentaBancoGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCuentaBancoGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCuentaBancoGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCuentaBancoGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCuentaBancoGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCuentaBancoGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBancoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBancoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBancoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCuentaBancoGeneral.add(this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral);
		
		this.jmenuDetalleAccionesTipoCuentaBancoGeneral.add(this.jMenuItemActualizarTipoCuentaBancoGeneral);
		this.jmenuDetalleAccionesTipoCuentaBancoGeneral.add(this.jMenuItemEliminarTipoCuentaBancoGeneral);
		this.jmenuDetalleAccionesTipoCuentaBancoGeneral.add(this.jMenuItemCancelarTipoCuentaBancoGeneral);		
		
		//this.jmenuDetalleDatosTipoCuentaBancoGeneral.add(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral);				
		this.jmenuDetalleDatosTipoCuentaBancoGeneral.add(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral);				
				
		//this.jmenuDetalleAccionesTipoCuentaBancoGeneral.add(this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCuentaBancoGeneral.add(this.jmenuDetalleArchivoTipoCuentaBancoGeneral);		
		this.jmenuBarDetalleTipoCuentaBancoGeneral.add(this.jmenuDetalleAccionesTipoCuentaBancoGeneral);		
		this.jmenuBarDetalleTipoCuentaBancoGeneral.add(this.jmenuDetalleDatosTipoCuentaBancoGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCuentaBancoGeneral);				
	}
	
	
	public void inicializarElementosCamposTipoCuentaBancoGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCuentaBancoGeneral = new JLabelMe();
		jLabelIdTipoCuentaBancoGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCuentaBancoGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCuentaBancoGeneral.setToolTipText(TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCuentaBancoGeneral= new GridBagLayout();

		this.jPanelidTipoCuentaBancoGeneral.setLayout(this.gridaBagLayoutTipoCuentaBancoGeneral);

		jLabelidTipoCuentaBancoGeneral = new JLabel();
		jLabelidTipoCuentaBancoGeneral.setText("Id");

		jLabelidTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCuentaBancoGeneral = new JLabelMe();
		this.jLabelcodigoTipoCuentaBancoGeneral.setText(""+TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCuentaBancoGeneral.setToolTipText("Codigo");
		this.jLabelcodigoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCuentaBancoGeneral.setToolTipText(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		this.jPanelcodigoTipoCuentaBancoGeneral.setLayout(this.gridaBagLayoutTipoCuentaBancoGeneral);


		jTextFieldcodigoTipoCuentaBancoGeneral= new JTextFieldMe();

		jTextFieldcodigoTipoCuentaBancoGeneral.setEnabled(false);
		jTextFieldcodigoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setText("U");
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCuentaBancoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCuentaBancoGeneralBusqueda"));

		if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCuentaBancoGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCuentaBancoGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCuentaBancoGeneral = new JLabelMe();
		this.jLabelid_empresaTipoCuentaBancoGeneral.setText(""+TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCuentaBancoGeneral.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCuentaBancoGeneral.setToolTipText(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		this.jPanelid_empresaTipoCuentaBancoGeneral.setLayout(this.gridaBagLayoutTipoCuentaBancoGeneral);


		jComboBoxid_empresaTipoCuentaBancoGeneral= new JComboBoxMe();
		jComboBoxid_empresaTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCuentaBancoGeneral.setEnabled(false);

		this.jButtonid_empresaTipoCuentaBancoGeneral= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBancoGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBancoGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBancoGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBancoGeneral.setText("Buscar");
		this.jButtonid_empresaTipoCuentaBancoGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCuentaBancoGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBancoGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBancoGeneral"));

		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setText("U");
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBancoGeneralBusqueda"));

		if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setText("U");
		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCuentaBancoGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBancoGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBancoGeneralUpdate"));



					
		this.jLabelid_bancoTipoCuentaBancoGeneral = new JLabelMe();
		this.jLabelid_bancoTipoCuentaBancoGeneral.setText(""+TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoTipoCuentaBancoGeneral.setToolTipText("Banco");
		this.jLabelid_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoTipoCuentaBancoGeneral.setToolTipText(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		this.jPanelid_bancoTipoCuentaBancoGeneral.setLayout(this.gridaBagLayoutTipoCuentaBancoGeneral);


		jComboBoxid_bancoTipoCuentaBancoGeneral= new JComboBoxMe();
		jComboBoxid_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoTipoCuentaBancoGeneral= new JButtonMe();
		this.jButtonid_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTipoCuentaBancoGeneral.setText("Buscar");
		this.jButtonid_bancoTipoCuentaBancoGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoTipoCuentaBancoGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTipoCuentaBancoGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTipoCuentaBancoGeneral"));

		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setText("U");
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTipoCuentaBancoGeneralBusqueda"));

		if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.setVisible(false);		}

		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setText("U");
		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoTipoCuentaBancoGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTipoCuentaBancoGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTipoCuentaBancoGeneralUpdate"));



					
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral = new JLabelMe();
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setText(""+TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO+" : *");
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setToolTipText("Tipo Cuenta Banco");
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setToolTipText(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
		this.gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setLayout(this.gridaBagLayoutTipoCuentaBancoGeneral);


		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral= new JButtonMe();
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setText("Buscar");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneral"));

		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda"));

		if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setText("U");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate"));



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
		//this.jInternalFrameDetalleTipoCuentaBancoGeneral = new TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBancoGeneral= new GridBagLayout();
		

		
		String sToolTipTipoCuentaBancoGeneral="";
		sToolTipTipoCuentaBancoGeneral=TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBancoGeneral+="(Tesoreria.TipoCuentaBancoGeneral)";
		}
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBancoGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonModificarTipoCuentaBancoGeneral = new JButtonMe();
        this.jButtonActualizarTipoCuentaBancoGeneral = new JButtonMe();
        this.jButtonEliminarTipoCuentaBancoGeneral = new JButtonMe();
        this.jButtonCancelarTipoCuentaBancoGeneral = new JButtonMe();
        this.jButtonGuardarCambiosTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral = new JButtonMe();
		this.jButtonCerrarTipoCuentaBancoGeneral = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBancoGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco General";
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBancoGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCuentaBancoGeneral.setName("jPanelCamposTipoCuentaBancoGeneral"); 

		this.jPanelCamposOcultosTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCuentaBancoGeneral.setName("jPanelCamposOcultosTipoCuentaBancoGeneral"); 

        this.jPanelAccionesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBancoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBancoGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCuentaBancoGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCuentaBancoGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCuentaBancoGeneral.setText("Nuevo");
		this.jButtonModificarTipoCuentaBancoGeneral.setText("Editar");
        this.jButtonActualizarTipoCuentaBancoGeneral.setText("Actualizar");
        this.jButtonEliminarTipoCuentaBancoGeneral.setText("Eliminar");
        this.jButtonCancelarTipoCuentaBancoGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCuentaBancoGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setText("Guardar");
		this.jButtonCerrarTipoCuentaBancoGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBancoGeneral,"nuevo_button","Nuevo",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCuentaBancoGeneral,"modificar_button","Editar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCuentaBancoGeneral,"actualizar_button","Actualizar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCuentaBancoGeneral,"eliminar_button","Eliminar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCuentaBancoGeneral,"cancelar_button","Cancelar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCuentaBancoGeneral,"guardarcambios_button","Guardar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral,"guardarcambiostabla_button","Guardar",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBancoGeneral,"cerrar_button","Salir",this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCuentaBancoGeneral.setToolTipText("Nuevo"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCuentaBancoGeneral.setToolTipText("Editar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCuentaBancoGeneral.setToolTipText("Actualizar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCuentaBancoGeneral.setToolTipText("Eliminar)"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCuentaBancoGeneral.setToolTipText("Cancelar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCuentaBancoGeneral.setToolTipText("Guardar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setToolTipText("Guardar"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBancoGeneral.setToolTipText("Salir"+" "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBancoGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCuentaBancoGeneral";
		inputMap = this.jButtonActualizarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCuentaBancoGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCuentaBancoGeneral";
		inputMap = this.jButtonEliminarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCuentaBancoGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCancelarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCuentaBancoGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCerrarTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBancoGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBancoGeneral";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBancoGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral.setToolTipText("Nuevo TipoCuentaBancoGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral.setToolTipText("Sin Cerrar Ventana TipoCuentaBancoGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCuentaBancoGeneral = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBancoGeneral.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCuentaBancoGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCuentaBancoGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCuentaBancoGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCuentaBancoGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCuentaBancoGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCuentaBancoGeneral = new GridBagLayout();
		
		this.jPanelCamposTipoCuentaBancoGeneral.setLayout(gridaBagLayoutCamposTipoCuentaBancoGeneral);
		this.jPanelCamposOcultosTipoCuentaBancoGeneral.setLayout(gridaBagLayoutCamposOcultosTipoCuentaBancoGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCuentaBancoGeneral.add(jLabelIdTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCuentaBancoGeneral.add(jLabelidTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCuentaBancoGeneral.add(jLabelid_empresaTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuentaBancoGeneral.add(jButtonid_empresaTipoCuentaBancoGeneralBusqueda, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 3;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuentaBancoGeneral.add(jButtonid_empresaTipoCuentaBancoGeneralUpdate, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCuentaBancoGeneral.add(jComboBoxid_empresaTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoTipoCuentaBancoGeneral.add(jLabelid_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoTipoCuentaBancoGeneral.add(jButtonid_bancoTipoCuentaBancoGeneralBusqueda, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 3;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoTipoCuentaBancoGeneral.add(jButtonid_bancoTipoCuentaBancoGeneralUpdate, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoTipoCuentaBancoGeneral.add(jComboBoxid_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.add(jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.add(jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 3;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.add(jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.add(jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCuentaBancoGeneral.add(jLabelcodigoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCuentaBancoGeneral.add(jButtoncodigoTipoCuentaBancoGeneralBusqueda, this.gridBagConstraintsTipoCuentaBancoGeneral);
	}

	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCuentaBancoGeneral.add(jTextFieldcodigoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iYPanelCamposTipoCuentaBancoGeneral;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iXPanelCamposTipoCuentaBancoGeneral++;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGeneral.add(this.jPanelidTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(iXPanelCamposTipoCuentaBancoGeneral % 1==0) {
		iXPanelCamposTipoCuentaBancoGeneral=0;
		iYPanelCamposTipoCuentaBancoGeneral++;
	}
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iYPanelCamposTipoCuentaBancoGeneral;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iXPanelCamposTipoCuentaBancoGeneral++;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGeneral.add(this.jPanelid_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(iXPanelCamposTipoCuentaBancoGeneral % 1==0) {
		iXPanelCamposTipoCuentaBancoGeneral=0;
		iYPanelCamposTipoCuentaBancoGeneral++;
	}
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iYPanelCamposTipoCuentaBancoGeneral;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iXPanelCamposTipoCuentaBancoGeneral++;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGeneral.add(this.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(iXPanelCamposTipoCuentaBancoGeneral % 1==0) {
		iXPanelCamposTipoCuentaBancoGeneral=0;
		iYPanelCamposTipoCuentaBancoGeneral++;
	}
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iYPanelCamposTipoCuentaBancoGeneral;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iXPanelCamposTipoCuentaBancoGeneral++;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGeneral.add(this.jPanelcodigoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(iXPanelCamposTipoCuentaBancoGeneral % 1==0) {
		iXPanelCamposTipoCuentaBancoGeneral=0;
		iYPanelCamposTipoCuentaBancoGeneral++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iYPanelCamposOcultosTipoCuentaBancoGeneral;
	this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iXPanelCamposOcultosTipoCuentaBancoGeneral++;
	this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCuentaBancoGeneral.add(this.jPanelid_empresaTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);



	if(iXPanelCamposOcultosTipoCuentaBancoGeneral % 1==0) {
		iXPanelCamposOcultosTipoCuentaBancoGeneral=0;
		iYPanelCamposOcultosTipoCuentaBancoGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBancoGeneral= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBancoGeneral.setLayout(gridaBagLayoutAccionesTipoCuentaBancoGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCuentaBancoGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCuentaBancoGeneral.setLayout(gridaBagLayoutAccionesFormularioTipoCuentaBancoGeneral);
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBancoGeneral.add(this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBancoGeneral.add(this.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBancoGeneral.add(this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBancoGeneral.add(this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonModificarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);							

		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonEliminarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonActualizarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);


		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonGuardarCambiosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);	
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGeneral.add(this.jButtonCancelarTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBancoGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBancoGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBancoGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBancoGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =0;
		this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBancoGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCuentaBancoGeneral = new TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuenta Banco General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuenta Banco General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCuentaBancoGeneralModel tipocuentabancogeneralModel=new TipoCuentaBancoGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCuentaBancoGeneralModel.TipoCuentaBancoGeneralFocusTraversalPolicy tipocuentabancogeneralFocusTraversalPolicy = tipocuentabancogeneralModel.new TipoCuentaBancoGeneralFocusTraversalPolicy(this);
			
			//tipocuentabancogeneralFocusTraversalPolicy.settipocuentabancogeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocuentabancogeneralModel);
			
			
			this.jContentPaneDetalleTipoCuentaBancoGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCuentaBancoGeneral = new GridBagLayout();	
			this.jContentPaneDetalleTipoCuentaBancoGeneral.setLayout(gridaBagLayoutDetalleTipoCuentaBancoGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBancoGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCuentaBancoGeneral.add(jTtoolBarDetalleTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral=   new JScrollPane(jContentPaneDetalleTipoCuentaBancoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	        
			this.jContentPaneDetalleTipoCuentaBancoGeneral.add(jPanelCamposTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);
			
			
			
			
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
						&& tipocuentabancogeneralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCuentaBancoGeneral= new GridBagConstraints();
						this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
						this.jContentPaneDetalleTipoCuentaBancoGeneral.add(this.jTabbedPaneRelacionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCuentaBancoGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
					this.gridBagConstraintsTipoCuentaBancoGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCuentaBancoGeneral.add(jPanelCamposOcultosTipoCuentaBancoGeneral, gridBagConstraintsTipoCuentaBancoGeneral);
				
					this.jPanelCamposOcultosTipoCuentaBancoGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	        this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCuentaBancoGeneral.add(this.jPanelAccionesFormularioTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);							
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
	        this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCuentaBancoGeneral.add(this.jPanelAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCuentaBancoGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral=   new JScrollPane(this.jPanelCamposTipoCuentaBancoGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
			this.gridBagConstraintsTipoCuentaBancoGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCuentaBancoGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCuentaBancoGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);			
			
			this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
			
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		
			
		this.gridBagConstraintsTipoCuentaBancoGeneral = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGeneral, this.gridBagConstraintsTipoCuentaBancoGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCuentaBancoGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCuentaBancoGeneral;
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
