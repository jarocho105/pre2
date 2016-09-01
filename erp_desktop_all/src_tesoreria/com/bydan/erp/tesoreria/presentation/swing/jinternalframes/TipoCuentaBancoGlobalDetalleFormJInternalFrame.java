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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGlobalConstantesFunciones;

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
public class TipoCuentaBancoGlobalDetalleFormJInternalFrame extends TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCuentaBancoGlobal;
	
	protected JMenuBar jmenuBarDetalleTipoCuentaBancoGlobal;
	
	protected JMenu jmenuDetalleTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleArchivoTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleAccionesTipoCuentaBancoGlobal;
	protected JMenu jmenuDetalleDatosTipoCuentaBancoGlobal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBancoGlobal;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBancoGlobal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCuentaBancoGlobal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	
	

	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame bancotipocuentabancoglobalBeanSwingJInternalFrame=null;
	public BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame bancotipocuentabancoglobalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBancoTipoCuentaBancoGlobal=false;
	public BancoTipoCuentaBancoGlobalSessionBean bancotipocuentabancoglobalSessionBean;

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	public ParametroTesoreriaDefectoBeanSwingJInternalFrame parametrotesoreriadefectoBeanSwingJInternalFrame=null;
	public ParametroTesoreriaDefectoBeanSwingJInternalFrame parametrotesoreriadefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroTesoreriaDefecto=false;
	public ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean;
	
		
	
	public TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic;
	
	public JScrollPane jScrollPanelDatosTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGlobal;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBancoGlobal;
	
	protected JPanel jPanelCamposTipoCuentaBancoGlobal;    
	protected JPanel jPanelCamposOcultosTipoCuentaBancoGlobal;    	
	protected JPanel jPanelAccionesTipoCuentaBancoGlobal;
	protected JPanel jPanelAccionesFormularioTipoCuentaBancoGlobal;
    
	
	
	protected Integer iXPanelCamposTipoCuentaBancoGlobal=0;
	protected Integer iYPanelCamposTipoCuentaBancoGlobal=0;
	
	protected Integer iXPanelCamposOcultosTipoCuentaBancoGlobal=0;
	protected Integer iYPanelCamposOcultosTipoCuentaBancoGlobal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCuentaBancoGlobal;
	public JButton jButtonModificarTipoCuentaBancoGlobal;
	public JButton jButtonActualizarTipoCuentaBancoGlobal;
    public JButton jButtonEliminarTipoCuentaBancoGlobal;
	public JButton jButtonCancelarTipoCuentaBancoGlobal;
    public JButton jButtonGuardarCambiosTipoCuentaBancoGlobal;
	public JButton jButtonGuardarCambiosTablaTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarTipoCuentaBancoGlobal;
	
	
	protected JButton jButtonProcesarInformacionTipoCuentaBancoGlobal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonModificarToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonActualizarToolBarTipoCuentaBancoGlobal;
    protected JButton jButtonEliminarToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonCancelarToolBarTipoCuentaBancoGlobal;
    protected JButton jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGlobal;
	protected JButton jButtonCerrarToolBarTipoCuentaBancoGlobal;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBancoGlobal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemModificarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemActualizarTipoCuentaBancoGlobal;
    protected JMenuItem jMenuItemEliminarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCancelarTipoCuentaBancoGlobal;
    protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemCerrarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBancoGlobal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBancoGlobal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGlobal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCuentaBancoGlobal;
	public JLabel jLabelIdTipoCuentaBancoGlobal;
	public JTextFieldMe jTextFieldidTipoCuentaBancoGlobal;
	public JButton jButtonidTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCuentaBancoGlobal;
	public JLabel jLabelcodigoTipoCuentaBancoGlobal;
	public JTextField jTextFieldcodigoTipoCuentaBancoGlobal;
	public JButton jButtoncodigoTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCuentaBancoGlobal;
	public JLabel jLabelnombreTipoCuentaBancoGlobal;
	public JTextArea jTextAreanombreTipoCuentaBancoGlobal;
	public JScrollPane jscrollPanenombreTipoCuentaBancoGlobal;
	public JButton jButtonnombreTipoCuentaBancoGlobalBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCuentaBancoGlobal;
	
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
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCuentaBancoGlobal=new JPanel();
				this.jPanelAccionesFormularioTipoCuentaBancoGlobal=new JPanel();
				this.jmenuBarDetalleTipoCuentaBancoGlobal=new JMenuBar();
				this.jTtoolBarDetalleTipoCuentaBancoGlobal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoGlobalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBancoGlobal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCuentaBancoGlobal() {
		return this.jButtonActualizarToolBarTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonEliminarToolBarTipoCuentaBancoGlobal() {
		return this.jButtonEliminarToolBarTipoCuentaBancoGlobal;
	}
	
	public JButton getjButtonCancelarToolBarTipoCuentaBancoGlobal() {
		return this.jButtonCancelarToolBarTipoCuentaBancoGlobal;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCuentaBancoGlobal() {
		return this.jButtonProcesarInformacionTipoCuentaBancoGlobal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBancoGlobal)	{
		this.jButtonProcesarInformacionTipoCuentaBancoGlobal = jButtonProcesarInformacionTipoCuentaBancoGlobal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal = jComboBoxTiposRelacionesTipoCuentaBancoGlobal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal = jComboBoxTiposAccionesTipoCuentaBancoGlobal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal() {
		return this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal(
			JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal) {
		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal = jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		
		this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoGlobalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco Global MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCuentaBancoGlobal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCuentaBancoGlobal=new JButtonMe();
				this.jButtonModificarToolBarTipoCuentaBancoGlobal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal,
							"actualizar","actualizar","Actualizar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal,
							"eliminar","eliminar","Eliminar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal,
							"cancelar","cancelar","Cancelar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCuentaBancoGlobal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCuentaBancoGlobal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCuentaBancoGlobal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCuentaBancoGlobal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCuentaBancoGlobal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBancoGlobal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBancoGlobal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBancoGlobal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCuentaBancoGlobal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCuentaBancoGlobal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCuentaBancoGlobal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCuentaBancoGlobal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCuentaBancoGlobal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCuentaBancoGlobal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCuentaBancoGlobal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCuentaBancoGlobal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCuentaBancoGlobal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCuentaBancoGlobal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCuentaBancoGlobal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCuentaBancoGlobal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCuentaBancoGlobal.add(this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal);
		
		this.jmenuDetalleAccionesTipoCuentaBancoGlobal.add(this.jMenuItemActualizarTipoCuentaBancoGlobal);
		this.jmenuDetalleAccionesTipoCuentaBancoGlobal.add(this.jMenuItemEliminarTipoCuentaBancoGlobal);
		this.jmenuDetalleAccionesTipoCuentaBancoGlobal.add(this.jMenuItemCancelarTipoCuentaBancoGlobal);		
		
		//this.jmenuDetalleDatosTipoCuentaBancoGlobal.add(this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal);				
		this.jmenuDetalleDatosTipoCuentaBancoGlobal.add(this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal);				
				
		//this.jmenuDetalleAccionesTipoCuentaBancoGlobal.add(this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCuentaBancoGlobal.add(this.jmenuDetalleArchivoTipoCuentaBancoGlobal);		
		this.jmenuBarDetalleTipoCuentaBancoGlobal.add(this.jmenuDetalleAccionesTipoCuentaBancoGlobal);		
		this.jmenuBarDetalleTipoCuentaBancoGlobal.add(this.jmenuDetalleDatosTipoCuentaBancoGlobal);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCuentaBancoGlobal.add(this.jmenuDetalleTipoCuentaBancoGlobal);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCuentaBancoGlobal);				
	}
	
	
	public void inicializarElementosCamposTipoCuentaBancoGlobal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCuentaBancoGlobal = new JLabelMe();
		jLabelIdTipoCuentaBancoGlobal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCuentaBancoGlobal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCuentaBancoGlobal.setToolTipText(TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCuentaBancoGlobal= new GridBagLayout();

		this.jPanelidTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutTipoCuentaBancoGlobal);

		jTextFieldidTipoCuentaBancoGlobal = new JTextFieldMe();
		jTextFieldidTipoCuentaBancoGlobal.setText("Id");

		jTextFieldidTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCuentaBancoGlobal = new JLabelMe();
		this.jLabelcodigoTipoCuentaBancoGlobal.setText(""+TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCuentaBancoGlobal.setToolTipText("Codigo");
		this.jLabelcodigoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCuentaBancoGlobal.setToolTipText(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCuentaBancoGlobal = new GridBagLayout();
		this.jPanelcodigoTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutTipoCuentaBancoGlobal);


		jTextFieldcodigoTipoCuentaBancoGlobal= new JTextFieldMe();

		jTextFieldcodigoTipoCuentaBancoGlobal.setEnabled(false);
		jTextFieldcodigoTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setText("U");
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCuentaBancoGlobalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCuentaBancoGlobalBusqueda"));

		if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCuentaBancoGlobalBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCuentaBancoGlobal = new JLabelMe();
		this.jLabelnombreTipoCuentaBancoGlobal.setText(""+TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCuentaBancoGlobal.setToolTipText("Nombre");
		this.jLabelnombreTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCuentaBancoGlobal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCuentaBancoGlobal.setToolTipText(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCuentaBancoGlobal = new GridBagLayout();
		this.jPanelnombreTipoCuentaBancoGlobal.setLayout(this.gridaBagLayoutTipoCuentaBancoGlobal);


		jTextAreanombreTipoCuentaBancoGlobal= new JTextAreaMe();
		jTextAreanombreTipoCuentaBancoGlobal.setEnabled(false);
		jTextAreanombreTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBancoGlobal.setLineWrap(true);
		jTextAreanombreTipoCuentaBancoGlobal.setWrapStyleWord(true);
		jTextAreanombreTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCuentaBancoGlobal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCuentaBancoGlobal = new JScrollPane(jTextAreanombreTipoCuentaBancoGlobal);
		jscrollPanenombreTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCuentaBancoGlobalBusqueda= new JButtonMe();
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setText("U");
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCuentaBancoGlobalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCuentaBancoGlobalBusqueda"));

		if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCuentaBancoGlobalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCuentaBancoGlobal() {
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
		//this.jInternalFrameDetalleTipoCuentaBancoGlobal = new TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco Global DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBancoGlobal= new GridBagLayout();
		

		
		String sToolTipTipoCuentaBancoGlobal="";
		sToolTipTipoCuentaBancoGlobal=TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBancoGlobal+="(Tesoreria.TipoCuentaBancoGlobal)";
		}
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBancoGlobal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonModificarTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonActualizarTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonEliminarTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonCancelarTipoCuentaBancoGlobal = new JButtonMe();
        this.jButtonGuardarCambiosTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal = new JButtonMe();
		this.jButtonCerrarTipoCuentaBancoGlobal = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBancoGlobal = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco Global";
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Banco Globals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBancoGlobal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCuentaBancoGlobal.setName("jPanelCamposTipoCuentaBancoGlobal"); 

		this.jPanelCamposOcultosTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCuentaBancoGlobal.setName("jPanelCamposOcultosTipoCuentaBancoGlobal"); 

        this.jPanelAccionesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBancoGlobal.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCuentaBancoGlobal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCuentaBancoGlobal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jButtonModificarTipoCuentaBancoGlobal.setText("Editar");
        this.jButtonActualizarTipoCuentaBancoGlobal.setText("Actualizar");
        this.jButtonEliminarTipoCuentaBancoGlobal.setText("Eliminar");
        this.jButtonCancelarTipoCuentaBancoGlobal.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setText("Guardar");
		this.jButtonCerrarTipoCuentaBancoGlobal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBancoGlobal,"nuevo_button","Nuevo",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCuentaBancoGlobal,"modificar_button","Editar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCuentaBancoGlobal,"actualizar_button","Actualizar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCuentaBancoGlobal,"eliminar_button","Eliminar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCuentaBancoGlobal,"cancelar_button","Cancelar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCuentaBancoGlobal,"guardarcambios_button","Guardar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal,"guardarcambiostabla_button","Guardar",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBancoGlobal,"cerrar_button","Salir",this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCuentaBancoGlobal.setToolTipText("Nuevo"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCuentaBancoGlobal.setToolTipText("Editar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCuentaBancoGlobal.setToolTipText("Actualizar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCuentaBancoGlobal.setToolTipText("Eliminar)"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCuentaBancoGlobal.setToolTipText("Cancelar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setToolTipText("Guardar"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBancoGlobal.setToolTipText("Salir"+" "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBancoGlobal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCuentaBancoGlobal";
		inputMap = this.jButtonActualizarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCuentaBancoGlobal"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCuentaBancoGlobal";
		inputMap = this.jButtonEliminarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCuentaBancoGlobal"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCancelarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCuentaBancoGlobal"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBancoGlobal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBancoGlobal";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBancoGlobal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal.setToolTipText("Nuevo TipoCuentaBancoGlobal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal.setToolTipText("Sin Cerrar Ventana TipoCuentaBancoGlobal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCuentaBancoGlobal = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBancoGlobal.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCuentaBancoGlobal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCuentaBancoGlobal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCuentaBancoGlobal=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCuentaBancoGlobal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCuentaBancoGlobal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jPanelCamposTipoCuentaBancoGlobal.setLayout(gridaBagLayoutCamposTipoCuentaBancoGlobal);
		this.jPanelCamposOcultosTipoCuentaBancoGlobal.setLayout(gridaBagLayoutCamposOcultosTipoCuentaBancoGlobal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCuentaBancoGlobal.add(jLabelIdTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCuentaBancoGlobal.add(jTextFieldidTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);


	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCuentaBancoGlobal.add(jLabelcodigoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCuentaBancoGlobal.add(jButtoncodigoTipoCuentaBancoGlobalBusqueda, this.gridBagConstraintsTipoCuentaBancoGlobal);
	}

	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCuentaBancoGlobal.add(jTextFieldcodigoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);


	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCuentaBancoGlobal.add(jLabelnombreTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 2;
		this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCuentaBancoGlobal.add(jButtonnombreTipoCuentaBancoGlobalBusqueda, this.gridBagConstraintsTipoCuentaBancoGlobal);
	}

	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 1;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCuentaBancoGlobal.add(jscrollPanenombreTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iYPanelCamposTipoCuentaBancoGlobal;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iXPanelCamposTipoCuentaBancoGlobal++;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGlobal.add(this.jPanelidTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	if(iXPanelCamposTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposTipoCuentaBancoGlobal=0;
		iYPanelCamposTipoCuentaBancoGlobal++;
	}
	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iYPanelCamposTipoCuentaBancoGlobal;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iXPanelCamposTipoCuentaBancoGlobal++;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGlobal.add(this.jPanelcodigoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	if(iXPanelCamposTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposTipoCuentaBancoGlobal=0;
		iYPanelCamposTipoCuentaBancoGlobal++;
	}
	this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iYPanelCamposTipoCuentaBancoGlobal;
	this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iXPanelCamposTipoCuentaBancoGlobal++;
	this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBancoGlobal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBancoGlobal.add(this.jPanelnombreTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);



	if(iXPanelCamposTipoCuentaBancoGlobal % 1==0) {
		iXPanelCamposTipoCuentaBancoGlobal=0;
		iYPanelCamposTipoCuentaBancoGlobal++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesTipoCuentaBancoGlobal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCuentaBancoGlobal= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCuentaBancoGlobal.setLayout(gridaBagLayoutAccionesFormularioTipoCuentaBancoGlobal);
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBancoGlobal.add(this.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);

		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBancoGlobal.add(this.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonModificarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);							

		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonEliminarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonActualizarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);


		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonGuardarCambiosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);	
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBancoGlobal.add(this.jButtonCancelarTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBancoGlobal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBancoGlobal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBancoGlobal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBancoGlobal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =0;
		this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBancoGlobal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCuentaBancoGlobal = new TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuenta Banco Global DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuenta Banco Global DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco Global Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCuentaBancoGlobalModel tipocuentabancoglobalModel=new TipoCuentaBancoGlobalModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCuentaBancoGlobalModel.TipoCuentaBancoGlobalFocusTraversalPolicy tipocuentabancoglobalFocusTraversalPolicy = tipocuentabancoglobalModel.new TipoCuentaBancoGlobalFocusTraversalPolicy(this);
			
			//tipocuentabancoglobalFocusTraversalPolicy.settipocuentabancoglobalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocuentabancoglobalModel);
			
			
			this.jContentPaneDetalleTipoCuentaBancoGlobal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCuentaBancoGlobal = new GridBagLayout();	
			this.jContentPaneDetalleTipoCuentaBancoGlobal.setLayout(gridaBagLayoutDetalleTipoCuentaBancoGlobal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBancoGlobal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCuentaBancoGlobal.add(jTtoolBarDetalleTipoCuentaBancoGlobal, gridBagConstraintsTipoCuentaBancoGlobal);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal=   new JScrollPane(jContentPaneDetalleTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	        
			this.jContentPaneDetalleTipoCuentaBancoGlobal.add(jPanelCamposTipoCuentaBancoGlobal, gridBagConstraintsTipoCuentaBancoGlobal);
			
			
			
			
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
						&& tipocuentabancoglobalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBancoTipoCuentaBancoGlobal(this.puedeCargarPorParteBancoTipoCuentaBancoGlobal,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroTesoreriaDefecto(this.puedeCargarPorParteParametroTesoreriaDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					
					if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCuentaBancoGlobal= new GridBagConstraints();
						this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
						this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.jTabbedPaneRelacionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBancoTipoCuentaBancoGlobal(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroTesoreriaDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCuentaBancoGlobal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
					this.gridBagConstraintsTipoCuentaBancoGlobal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCuentaBancoGlobal.add(jPanelCamposOcultosTipoCuentaBancoGlobal, gridBagConstraintsTipoCuentaBancoGlobal);
				
					this.jPanelCamposOcultosTipoCuentaBancoGlobal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	        this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.jPanelAccionesFormularioTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);							
			
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
	        this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.jPanelAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCuentaBancoGlobal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal=   new JScrollPane(this.jPanelCamposTipoCuentaBancoGlobal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
			this.gridBagConstraintsTipoCuentaBancoGlobal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCuentaBancoGlobal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCuentaBancoGlobal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);			
			
			this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
			
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		
			
		this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBancoGlobal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBancoGlobal, this.gridBagConstraintsTipoCuentaBancoGlobal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCuentaBancoGlobal;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCuentaBancoGlobal;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBancoTipoCuentaBancoGlobal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
		this.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(false);
		this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(true);

		this.bancotipocuentabancoglobalBeanSwingJInternalFrame=null;//new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bancotipocuentabancoglobalBeanSwingJInternalFramePopup=new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bancotipocuentabancoglobalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {

				BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
				BancoTipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(true);

				this.bancotipocuentabancoglobalBeanSwingJInternalFrame=new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bancotipocuentabancoglobalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bancotipocuentabancoglobalBeanSwingJInternalFrame.setbancotipocuentabancoglobalSessionBean(this.bancotipocuentabancoglobalSessionBean);

				//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBancoGlobal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Banco Tipo Cuenta Banco Globales",this.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setComponentAt(iIndexTab,this.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane());
				}

				//BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(false);
				this.bancotipocuentabancoglobalBeanSwingJInternalFrame=null;//new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBancoTipoCuentaBancoGlobal) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Banco Tipo Cuenta Banco Globales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBancoGlobal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBancoGlobal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroTesoreriaDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrotesoreriadefectoBeanSwingJInternalFrame=null;//new ParametroTesoreriaDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrotesoreriadefectoBeanSwingJInternalFramePopup=new ParametroTesoreriaDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrotesoreriadefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrotesoreriadefectoBeanSwingJInternalFrame=new ParametroTesoreriaDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrotesoreriadefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrotesoreriadefectoBeanSwingJInternalFrame.setparametrotesoreriadefectoSessionBean(this.parametrotesoreriadefectoSessionBean);

				//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBancoGlobal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Parametro Tesoreria Defectos",this.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setComponentAt(iIndexTab,this.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrotesoreriadefectoBeanSwingJInternalFrame=null;//new ParametroTesoreriaDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroTesoreriaDefecto) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Parametro Tesoreria Defectos",new JPanel());
				}
			}
		}
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

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoGlobalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsTipoCuentaBancoGlobal = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBancoGlobal.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBancoGlobal.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBancoGlobal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,TipoCuentaBancoGlobal tipocuentabancoglobal,BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame bancotipocuentabancoglobalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bancotipocuentabancoglobalBeanSwingJInternalFrame=new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bancotipocuentabancoglobalBeanSwingJInternalFrame.getBancoTipoCuentaBancoGlobalLogic().setConnexion(this.tipocuentabancoglobalLogic.getConnexion());

					bancotipocuentabancoglobalBeanSwingJInternalFrame.settipocuentabancoglobalsForeignKey(tipocuentabancoglobals);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.settipocuentabancoglobalForeignKey(tipocuentabancoglobal);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setlidTipoCuentaBancoGlobalActual(tipocuentabancoglobal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bancotipocuentabancoglobalBeanSwingJInternalFrame.cargarCombosForeignKeyBancoTipoCuentaBancoGlobal(bancotipocuentabancoglobalBeanSwingJInternalFrame.isCargarCombosDependencia);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(tipocuentabancoglobal.getId());

					if(!this.conCargarFormDetalle) {
						bancotipocuentabancoglobalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bancotipocuentabancoglobalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobal,1,false,true,true);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bancotipocuentabancoglobalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBancoGlobal");
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBancoGlobal");
					bancotipocuentabancoglobalBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(true);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBancoTipoCuentaBancoGlobal("n",bancotipocuentabancoglobalBeanSwingJInternalFrame.isGuardarCambiosEnLote, bancotipocuentabancoglobalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setAutoscrolls(true);
					bancotipocuentabancoglobalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bancotipocuentabancoglobalBeanSwingJInternalFrame.actualizarEstadoPanelsBancoTipoCuentaBancoGlobal("relacionado");
					} else {
						bancotipocuentabancoglobalBeanSwingJInternalFrame.actualizarEstadoPanelsBancoTipoCuentaBancoGlobal("no_relacionado");
					}

					bancotipocuentabancoglobalBeanSwingJInternalFrame.getjButtonRecargarInformacionBancoTipoCuentaBancoGlobal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,TipoCuentaBancoGlobal tipocuentabancoglobal,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tipocuentabancoglobalLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settipocuentabancoglobalsForeignKey(tipocuentabancoglobals);
					datogeneralempleadoBeanSwingJInternalFrame.settipocuentabancoglobalForeignKey(tipocuentabancoglobal);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoCuentaBancoGlobalActual(tipocuentabancoglobal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(tipocuentabancoglobal.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobal,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBancoGlobal");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBancoGlobal");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,TipoCuentaBancoGlobal tipocuentabancoglobal,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.tipocuentabancoglobalLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.settipocuentabancoglobalsForeignKey(tipocuentabancoglobals);
					politicasclienteBeanSwingJInternalFrame.settipocuentabancoglobalForeignKey(tipocuentabancoglobal);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidTipoCuentaBancoGlobalActual(tipocuentabancoglobal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
					politicasclienteBeanSwingJInternalFrame.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(tipocuentabancoglobal.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobal,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBancoGlobal");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBancoGlobal");
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

		public void cargarEmpleadoBeanSwingJInternalFrame(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,TipoCuentaBancoGlobal tipocuentabancoglobal,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tipocuentabancoglobalLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.settipocuentabancoglobalsForeignKey(tipocuentabancoglobals);
					empleadoBeanSwingJInternalFrame.settipocuentabancoglobalForeignKey(tipocuentabancoglobal);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidTipoCuentaBancoGlobalActual(tipocuentabancoglobal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
					empleadoBeanSwingJInternalFrame.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(tipocuentabancoglobal.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobal,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBancoGlobal");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBancoGlobal");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroTesoreriaDefectoBeanSwingJInternalFrame(List<TipoCuentaBancoGlobal> tipocuentabancoglobals,TipoCuentaBancoGlobal tipocuentabancoglobal,ParametroTesoreriaDefectoBeanSwingJInternalFrame parametrotesoreriadefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrotesoreriadefectoBeanSwingJInternalFrame=new ParametroTesoreriaDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrotesoreriadefectoBeanSwingJInternalFrame.getParametroTesoreriaDefectoLogic().setConnexion(this.tipocuentabancoglobalLogic.getConnexion());

					parametrotesoreriadefectoBeanSwingJInternalFrame.settipocuentabancoglobalsForeignKey(tipocuentabancoglobals);
					parametrotesoreriadefectoBeanSwingJInternalFrame.settipocuentabancoglobalForeignKey(tipocuentabancoglobal);
					parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
					parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setlidTipoCuentaBancoGlobalActual(tipocuentabancoglobal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrotesoreriadefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroTesoreriaDefecto(parametrotesoreriadefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrotesoreriadefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBancoGlobal(true);
					parametrotesoreriadefectoBeanSwingJInternalFrame.setid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobal(tipocuentabancoglobal.getId());

					if(!this.conCargarFormDetalle) {
						parametrotesoreriadefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrotesoreriadefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoGlobalForeignKey(tipocuentabancoglobal,1,false,true,true);
					parametrotesoreriadefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrotesoreriadefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBancoGlobal");
					parametrotesoreriadefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBancoGlobal");
					parametrotesoreriadefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroTesoreriaDefecto(true);
					parametrotesoreriadefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroTesoreriaDefecto("n",parametrotesoreriadefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrotesoreriadefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrotesoreriadefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrotesoreriadefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrotesoreriadefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroTesoreriaDefecto("relacionado");
					} else {
						parametrotesoreriadefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroTesoreriaDefecto("no_relacionado");
					}

					parametrotesoreriadefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroTesoreriaDefecto().setVisible(false);

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
