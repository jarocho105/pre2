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
import com.bydan.erp.tesoreria.util.BancoTipoCuentaBancoGlobalConstantesFunciones;

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
public class BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame extends BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBancoTipoCuentaBancoGlobal;
	
	protected JMenuBar jmenuBarDetalleBancoTipoCuentaBancoGlobal;
	
	protected JMenu jmenuDetalleBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleArchivoBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleAccionesBancoTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleDatosBancoTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBancoTipoCuentaBancoGlobal;	
	protected GridBagConstraints gridBagConstraintsBancoTipoCuentaBancoGlobal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional jInternalFrameDetalleBancoTipoCuentaBancoGlobal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;	
	
	public BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic;
	
	public JScrollPane jScrollPanelDatosBancoTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal;
	
	protected JPanel jPanelCamposBancoTipoCuentaBancoGlobal;    
	protected JPanel jPanelCamposOcultosBancoTipoCuentaBancoGlobal;    	
	protected JPanel jPanelAccionesBancoTipoCuentaBancoGlobal;
	protected JPanel jPanelAccionesFormularioBancoTipoCuentaBancoGlobal;
    
	
	
	protected Integer iXPanelCamposBancoTipoCuentaBancoGlobal=0;
	protected Integer iYPanelCamposBancoTipoCuentaBancoGlobal=0;
	
	protected Integer iXPanelCamposOcultosBancoTipoCuentaBancoGlobal=0;
	protected Integer iYPanelCamposOcultosBancoTipoCuentaBancoGlobal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBancoTipoCuentaBancoGlobal;
	public JButton jButtonModificarBancoTipoCuentaBancoGlobal;
	public JButton jButtonActualizarBancoTipoCuentaBancoGlobal;
    public JButton jButtonEliminarBancoTipoCuentaBancoGlobal;
	public JButton jButtonCancelarBancoTipoCuentaBancoGlobal;
    public JButton jButtonGuardarCambiosBancoTipoCuentaBancoGlobal;
	public JButton jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarBancoTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonModificarToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonActualizarToolBarBancoTipoCuentaBancoGlobal;
    protected JButton jButtonEliminarToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCancelarToolBarBancoTipoCuentaBancoGlobal;
    protected JButton jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonGuardarCambiosTablaToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonMostrarOcultarTablaToolBarBancoTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarToolBarBancoTipoCuentaBancoGlobal;
	
	protected JButton jButtonProcesarInformacionToolBarBancoTipoCuentaBancoGlobal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemModificarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemActualizarBancoTipoCuentaBancoGlobal;
    protected JMenuItem jMenuItemEliminarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCancelarBancoTipoCuentaBancoGlobal;
    protected JMenuItem jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemGuardarCambiosTablaBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCerrarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal;
	
	protected JMenuItem jMenuItemProcesarInformacionBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBancoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBancoTipoCuentaBancoGlobal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBancoTipoCuentaBancoGlobal;
	public JLabel jLabelIdBancoTipoCuentaBancoGlobal;
	public JLabel jLabelidBancoTipoCuentaBancoGlobal;
	public JButton jButtonidBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBancoTipoCuentaBancoGlobal;
	public JLabel jLabelid_empresaBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBancoTipoCuentaBancoGlobal;
	public JButton jButtonid_empresaBancoTipoCuentaBancoGlobal= new JButtonMe();
	public JButton jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
	public JButton jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoBancoTipoCuentaBancoGlobal;
	public JLabel jLabelid_bancoBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoBancoTipoCuentaBancoGlobal;
	public JButton jButtonid_bancoBancoTipoCuentaBancoGlobal= new JButtonMe();
	public JButton jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
	public JButton jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal;
	public JLabel jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal;
	public JButton jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBancoTipoCuentaBancoGlobal=new JPanel();
				this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal=new JPanel();
				this.jmenuBarDetalleBancoTipoCuentaBancoGlobal=new JMenuBar();
				this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoTipoCuentaBancoGlobalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BancoTipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBancoTipoCuentaBancoGlobal() {
		return this.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonEliminarToolBarBancoTipoCuentaBancoGlobal() {
		return this.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonCancelarToolBarBancoTipoCuentaBancoGlobal() {
		return this.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal;
	}		
	
	public JButton getjButtonProcesarInformacionBancoTipoCuentaBancoGlobal() {
		return this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBancoTipoCuentaBancoGlobal)	{
		this.jButtonProcesarInformacionBancoTipoCuentaBancoGlobal = jButtonProcesarInformacionBancoTipoCuentaBancoGlobal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal = jComboBoxTiposRelacionesBancoTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal = jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal = jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		
		this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoTipoCuentaBancoGlobalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco Tipo Cuenta Banco Global MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
	
		BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBancoTipoCuentaBancoGlobal=new JButtonMe();
				this.jButtonModificarToolBarBancoTipoCuentaBancoGlobal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal,
							"actualizar","actualizar","Actualizar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal,
							"eliminar","eliminar","Eliminar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal,
							"cancelar","cancelar","Cancelar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBancoTipoCuentaBancoGlobal,this.jTtoolBarDetalleBancoTipoCuentaBancoGlobal,
							"guardarcambios","guardarcambios","Guardar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBancoTipoCuentaBancoGlobal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBancoTipoCuentaBancoGlobal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBancoTipoCuentaBancoGlobal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBancoTipoCuentaBancoGlobal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBancoTipoCuentaBancoGlobal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBancoTipoCuentaBancoGlobal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBancoTipoCuentaBancoGlobal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBancoTipoCuentaBancoGlobal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBancoTipoCuentaBancoGlobal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBancoTipoCuentaBancoGlobal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBancoTipoCuentaBancoGlobal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBancoTipoCuentaBancoGlobal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBancoTipoCuentaBancoGlobal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBancoTipoCuentaBancoGlobal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBancoTipoCuentaBancoGlobal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBancoTipoCuentaBancoGlobal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBancoTipoCuentaBancoGlobal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBancoTipoCuentaBancoGlobal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBancoTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBancoTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBancoTipoCuentaBancoGlobal.add(this.jMenuItemDetalleCerrarBancoTipoCuentaBancoGlobal);
		
		this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemActualizarBancoTipoCuentaBancoGlobal);
		this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemEliminarBancoTipoCuentaBancoGlobal);
		this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemCancelarBancoTipoCuentaBancoGlobal);		
		
		//this.jmenuDetalleDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemDetalleAbrirOrderByBancoTipoCuentaBancoGlobal);				
		this.jmenuDetalleDatosBancoTipoCuentaBancoGlobal.add(this.jMenuItemDetalleMostarOcultarBancoTipoCuentaBancoGlobal);				
				
		//this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosBancoTipoCuentaBancoGlobal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBancoTipoCuentaBancoGlobal.add(this.jmenuDetalleArchivoBancoTipoCuentaBancoGlobal);		
		this.jmenuBarDetalleBancoTipoCuentaBancoGlobal.add(this.jmenuDetalleAccionesBancoTipoCuentaBancoGlobal);		
		this.jmenuBarDetalleBancoTipoCuentaBancoGlobal.add(this.jmenuDetalleDatosBancoTipoCuentaBancoGlobal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBancoTipoCuentaBancoGlobal);				
	}
	
	
	public void inicializarElementosCamposBancoTipoCuentaBancoGlobal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBancoTipoCuentaBancoGlobal = new JLabelMe();
		jLabelIdBancoTipoCuentaBancoGlobal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBancoTipoCuentaBancoGlobal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBancoTipoCuentaBancoGlobal.setToolTipText(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal= new GridBagLayout();

		this.jPanelidBancoTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutBancoTipoCuentaBancoGlobal);

		jLabelidBancoTipoCuentaBancoGlobal = new JLabel();
		jLabelidBancoTipoCuentaBancoGlobal.setText("Id");

		jLabelidBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysBancoTipoCuentaBancoGlobal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal = new JLabelMe();
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal.setText(""+BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal.setToolTipText("Empresa");
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBancoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBancoTipoCuentaBancoGlobal.setToolTipText(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal = new GridBagLayout();
		this.jPanelid_empresaBancoTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutBancoTipoCuentaBancoGlobal);


		jComboBoxid_empresaBancoTipoCuentaBancoGlobal= new JComboBoxMe();
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.setEnabled(false);

		this.jButtonid_empresaBancoTipoCuentaBancoGlobal= new JButtonMe();
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setText("Buscar");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoTipoCuentaBancoGlobal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoTipoCuentaBancoGlobal"));

		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setText("U");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoTipoCuentaBancoGlobalBusqueda"));

		if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda.setVisible(false);		}

		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setText("U");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoTipoCuentaBancoGlobalUpdate"));



					
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal = new JLabelMe();
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal.setText(""+BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal.setToolTipText("Banco");
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoBancoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoBancoTipoCuentaBancoGlobal.setToolTipText(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal = new GridBagLayout();
		this.jPanelid_bancoBancoTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutBancoTipoCuentaBancoGlobal);


		jComboBoxid_bancoBancoTipoCuentaBancoGlobal= new JComboBoxMe();
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoBancoTipoCuentaBancoGlobal= new JButtonMe();
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setText("Buscar");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoBancoTipoCuentaBancoGlobal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoBancoTipoCuentaBancoGlobal"));

		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setText("U");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoBancoTipoCuentaBancoGlobalBusqueda"));

		if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda.setVisible(false);		}

		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setText("U");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoBancoTipoCuentaBancoGlobalUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setText(""+BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setToolTipText("Tipo Cuenta Banco Global");
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setToolTipText(BancoTipoCuentaBancoGlobalConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutBancoTipoCuentaBancoGlobal);


		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal"));

		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda"));

		if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate"));



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
		//this.jInternalFrameDetalleBancoTipoCuentaBancoGlobal = new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Banco Tipo Cuenta Banco Global DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBancoTipoCuentaBancoGlobal= new GridBagLayout();
		

		
		String sToolTipBancoTipoCuentaBancoGlobal="";
		sToolTipBancoTipoCuentaBancoGlobal=BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBancoTipoCuentaBancoGlobal+="(Tesoreria.BancoTipoCuentaBancoGlobal)";
		}
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			sToolTipBancoTipoCuentaBancoGlobal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonModificarBancoTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonActualizarBancoTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonEliminarBancoTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonCancelarBancoTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarBancoTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jScrollPanelDatosBancoTipoCuentaBancoGlobal = new JScrollPane();   
        this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal = new JScrollPane();
		this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal = new JScrollPane();
				
		
		
		this.jPanelCamposBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Banco Tipo Cuenta Banco Global";
		
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Tipo Cuenta Banco Globales" + this.sPath));
		} else {
			this.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBancoTipoCuentaBancoGlobal.setName("jPanelCamposBancoTipoCuentaBancoGlobal"); 

		this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.setName("jPanelCamposOcultosBancoTipoCuentaBancoGlobal"); 

        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesBancoTipoCuentaBancoGlobal.setName("Acciones"); 

		this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBancoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jButtonModificarBancoTipoCuentaBancoGlobal.setText("Editar");
        this.jButtonActualizarBancoTipoCuentaBancoGlobal.setText("Actualizar");
        this.jButtonEliminarBancoTipoCuentaBancoGlobal.setText("Eliminar");
        this.jButtonCancelarBancoTipoCuentaBancoGlobal.setText("Cancelar");
        this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBancoTipoCuentaBancoGlobal,"nuevo_button","Nuevo",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBancoTipoCuentaBancoGlobal,"modificar_button","Editar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBancoTipoCuentaBancoGlobal,"actualizar_button","Actualizar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBancoTipoCuentaBancoGlobal,"eliminar_button","Eliminar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBancoTipoCuentaBancoGlobal,"cancelar_button","Cancelar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal,"guardarcambios_button","Guardar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBancoTipoCuentaBancoGlobal,"cerrar_button","Salir",this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.setToolTipText("Nuevo"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBancoTipoCuentaBancoGlobal.setToolTipText("Editar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBancoTipoCuentaBancoGlobal.setToolTipText("Actualizar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBancoTipoCuentaBancoGlobal.setToolTipText("Eliminar)"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBancoTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.setToolTipText("Salir"+" "+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBancoTipoCuentaBancoGlobal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonActualizarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBancoTipoCuentaBancoGlobal"));
		
		//ELIMINAR
		sMapKey = "EliminarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonEliminarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBancoTipoCuentaBancoGlobal"));
		
		//CANCELAR	
		sMapKey = "CancelarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCancelarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBancoTipoCuentaBancoGlobal"));
		
		//CERRAR		
		sMapKey = "CerrarBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBancoTipoCuentaBancoGlobal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBancoTipoCuentaBancoGlobal";
		inputMap = this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBancoTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBancoTipoCuentaBancoGlobal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal.setToolTipText("Nuevo BancoTipoCuentaBancoGlobal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal.setToolTipText("Sin Cerrar Ventana BancoTipoCuentaBancoGlobal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBancoTipoCuentaBancoGlobal = new JLabelMe();
		
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setText("Acciones");		
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBancoTipoCuentaBancoGlobal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBancoTipoCuentaBancoGlobal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal=new JTabbedPane();
		this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBancoTipoCuentaBancoGlobal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBancoTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jPanelCamposBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutCamposBancoTipoCuentaBancoGlobal);
		this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutCamposOcultosBancoTipoCuentaBancoGlobal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBancoTipoCuentaBancoGlobal.add(jLabelIdBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBancoTipoCuentaBancoGlobal.add(jLabelidBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);


	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBancoTipoCuentaBancoGlobal.add(jLabelid_empresaBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 2;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBancoTipoCuentaBancoGlobal.add(jButtonid_empresaBancoTipoCuentaBancoGlobalBusqueda, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 3;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBancoTipoCuentaBancoGlobal.add(jButtonid_empresaBancoTipoCuentaBancoGlobalUpdate, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBancoTipoCuentaBancoGlobal.add(jComboBoxid_empresaBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);


	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoBancoTipoCuentaBancoGlobal.add(jLabelid_bancoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 2;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoBancoTipoCuentaBancoGlobal.add(jButtonid_bancoBancoTipoCuentaBancoGlobalBusqueda, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 3;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoBancoTipoCuentaBancoGlobal.add(jButtonid_bancoBancoTipoCuentaBancoGlobalUpdate, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoBancoTipoCuentaBancoGlobal.add(jComboBoxid_bancoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);


	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.add(jLabelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 2;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.add(jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalBusqueda, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 3;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.add(jButtonid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobalUpdate, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
	}

	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal.add(jComboBoxid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iYPanelCamposBancoTipoCuentaBancoGlobal;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iXPanelCamposBancoTipoCuentaBancoGlobal++;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoTipoCuentaBancoGlobal.add(this.jPanelidBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(iXPanelCamposBancoTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposBancoTipoCuentaBancoGlobal=0;
		iYPanelCamposBancoTipoCuentaBancoGlobal++;
	}
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iYPanelCamposBancoTipoCuentaBancoGlobal;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iXPanelCamposBancoTipoCuentaBancoGlobal++;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoTipoCuentaBancoGlobal.add(this.jPanelid_bancoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(iXPanelCamposBancoTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposBancoTipoCuentaBancoGlobal=0;
		iYPanelCamposBancoTipoCuentaBancoGlobal++;
	}
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iYPanelCamposBancoTipoCuentaBancoGlobal;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iXPanelCamposBancoTipoCuentaBancoGlobal++;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoTipoCuentaBancoGlobal.add(this.jPanelid_tipo_cuenta_banco_globalBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(iXPanelCamposBancoTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposBancoTipoCuentaBancoGlobal=0;
		iYPanelCamposBancoTipoCuentaBancoGlobal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iYPanelCamposOcultosBancoTipoCuentaBancoGlobal;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iXPanelCamposOcultosBancoTipoCuentaBancoGlobal++;
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.add(this.jPanelid_empresaBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);



	if(iXPanelCamposOcultosBancoTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposOcultosBancoTipoCuentaBancoGlobal=0;
		iYPanelCamposOcultosBancoTipoCuentaBancoGlobal++;
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
			
		GridBagLayout gridaBagLayoutAccionesBancoTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesBancoTipoCuentaBancoGlobal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBancoTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesFormularioBancoTipoCuentaBancoGlobal);
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.add(this.jComboBoxTiposAccionesFormularioBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionNuevoBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionSinCerrarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bancotipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionSinMensajeBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccion++;
			
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonModificarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);							

		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXAccion++;
			
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonEliminarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccion++;
		
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonActualizarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);


		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = iPosXAccion++;
		
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonGuardarCambiosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);	
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =iPosXAccion++;
		
		this.jPanelAccionesBancoTipoCuentaBancoGlobal.add(this.jButtonCancelarBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBancoTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBancoTipoCuentaBancoGlobal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();						
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;		
			//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =0;
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BancoTipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBancoTipoCuentaBancoGlobal = new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Banco Tipo Cuenta Banco Global DATOS");
			
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
			
	        //this.setTitle("[FOR] - Banco Tipo Cuenta Banco Global DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Tipo Cuenta Banco Global Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BancoTipoCuentaBancoGlobalModel bancotipocuentabancoglobalModel=new BancoTipoCuentaBancoGlobalModel(this);
			
			//SI USARA CLASE INTERNA
			//BancoTipoCuentaBancoGlobalModel.BancoTipoCuentaBancoGlobalFocusTraversalPolicy bancotipocuentabancoglobalFocusTraversalPolicy = bancotipocuentabancoglobalModel.new BancoTipoCuentaBancoGlobalFocusTraversalPolicy(this);
			
			//bancotipocuentabancoglobalFocusTraversalPolicy.setbancotipocuentabancoglobalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bancotipocuentabancoglobalModel);
			
			
			this.jContentPaneDetalleBancoTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBancoTipoCuentaBancoGlobal = new GridBagLayout();	
			this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.setLayout(gridaBagLayoutDetalleBancoTipoCuentaBancoGlobal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBancoTipoCuentaBancoGlobal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
					
				
				this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(jTtoolBarDetalleBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);								
				
}
			
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal=   new JScrollPane(jContentPaneDetalleBancoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	        
			this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(jPanelCamposBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			
			
			
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
						&& bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBancoTipoCuentaBancoGlobal= new GridBagConstraints();
						this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
						this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(this.jTabbedPaneRelacionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBancoTipoCuentaBancoGlobal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
					this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
					
				
					this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(jPanelCamposOcultosBancoTipoCuentaBancoGlobal, gridBagConstraintsBancoTipoCuentaBancoGlobal);
				
					this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);							
			
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
	        
			
			this.jContentPaneDetalleBancoTipoCuentaBancoGlobal.add(this.jPanelAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal=   new JScrollPane(this.jPanelCamposBancoTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);			
			
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
			
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBancoTipoCuentaBancoGlobal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBancoTipoCuentaBancoGlobal, this.gridBagConstraintsBancoTipoCuentaBancoGlobal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBancoTipoCuentaBancoGlobal;//jContentPane;
		
		return jScrollPanelDatosEdicionBancoTipoCuentaBancoGlobal;
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
