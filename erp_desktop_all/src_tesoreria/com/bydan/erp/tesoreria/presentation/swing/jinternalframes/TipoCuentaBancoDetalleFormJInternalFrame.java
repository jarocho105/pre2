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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.TipoCuentaBancoConstantesFunciones;

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
public class TipoCuentaBancoDetalleFormJInternalFrame extends TipoCuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCuentaBanco;
	
	protected JMenuBar jmenuBarDetalleTipoCuentaBanco;
	
	protected JMenu jmenuDetalleTipoCuentaBanco;
	protected JMenu jmenuDetalleArchivoTipoCuentaBanco;
	protected JMenu jmenuDetalleAccionesTipoCuentaBanco;
	protected JMenu jmenuDetalleDatosTipoCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCuentaBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCuentaBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCuentaBancoSessionBean tipocuentabancoSessionBean;
	
	

	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;
	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaBancaria=false;
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;

	public TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame=null;
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoCuentaBancoGeneral=false;
	public TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCuentaBancoLogic tipocuentabancoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaBanco;
	
	protected JPanel jPanelCamposTipoCuentaBanco;    
	protected JPanel jPanelCamposOcultosTipoCuentaBanco;    	
	protected JPanel jPanelAccionesTipoCuentaBanco;
	protected JPanel jPanelAccionesFormularioTipoCuentaBanco;
    
	
	
	protected Integer iXPanelCamposTipoCuentaBanco=0;
	protected Integer iYPanelCamposTipoCuentaBanco=0;
	
	protected Integer iXPanelCamposOcultosTipoCuentaBanco=0;
	protected Integer iYPanelCamposOcultosTipoCuentaBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCuentaBanco;
	public JButton jButtonModificarTipoCuentaBanco;
	public JButton jButtonActualizarTipoCuentaBanco;
    public JButton jButtonEliminarTipoCuentaBanco;
	public JButton jButtonCancelarTipoCuentaBanco;
    public JButton jButtonGuardarCambiosTipoCuentaBanco;
	public JButton jButtonGuardarCambiosTablaTipoCuentaBanco;
	protected JButton jButtonCerrarTipoCuentaBanco;
	
	
	protected JButton jButtonProcesarInformacionTipoCuentaBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCuentaBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaBanco;
	protected JButton jButtonModificarToolBarTipoCuentaBanco;
	protected JButton jButtonActualizarToolBarTipoCuentaBanco;
    protected JButton jButtonEliminarToolBarTipoCuentaBanco;
	protected JButton jButtonCancelarToolBarTipoCuentaBanco;
    protected JButton jButtonGuardarCambiosToolBarTipoCuentaBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaBanco;
	protected JButton jButtonCerrarToolBarTipoCuentaBanco;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaBanco;
	protected JMenuItem jMenuItemModificarTipoCuentaBanco;
	protected JMenuItem jMenuItemActualizarTipoCuentaBanco;
    protected JMenuItem jMenuItemEliminarTipoCuentaBanco;
	protected JMenuItem jMenuItemCancelarTipoCuentaBanco;
    protected JMenuItem jMenuItemGuardarCambiosTipoCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaBanco;
	protected JMenuItem jMenuItemCerrarTipoCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCuentaBanco;
	public JLabel jLabelIdTipoCuentaBanco;
	public JLabel jLabelidTipoCuentaBanco;
	public JButton jButtonidTipoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCuentaBanco;
	public JLabel jLabelcodigoTipoCuentaBanco;
	public JTextField jTextFieldcodigoTipoCuentaBanco;
	public JButton jButtoncodigoTipoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCuentaBanco;
	public JLabel jLabelnombreTipoCuentaBanco;
	public JTextArea jTextAreanombreTipoCuentaBanco;
	public JScrollPane jscrollPanenombreTipoCuentaBanco;
	public JButton jButtonnombreTipoCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCuentaBanco;
	public JLabel jLabelid_empresaTipoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCuentaBanco;
	public JButton jButtonid_empresaTipoCuentaBanco= new JButtonMe();
	public JButton jButtonid_empresaTipoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCuentaBancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCuentaBanco;
	
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
	
	public TipoCuentaBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCuentaBanco=new JPanel();
				this.jPanelAccionesFormularioTipoCuentaBanco=new JPanel();
				this.jmenuBarDetalleTipoCuentaBanco=new JMenuBar();
				this.jTtoolBarDetalleTipoCuentaBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCuentaBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCuentaBanco() {
		return this.jButtonActualizarToolBarTipoCuentaBanco;
	}
	
	public JButton getjButtonEliminarToolBarTipoCuentaBanco() {
		return this.jButtonEliminarToolBarTipoCuentaBanco;
	}
	
	public JButton getjButtonCancelarToolBarTipoCuentaBanco() {
		return this.jButtonCancelarToolBarTipoCuentaBanco;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCuentaBanco() {
		return this.jButtonProcesarInformacionTipoCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaBanco)	{
		this.jButtonProcesarInformacionTipoCuentaBanco = jButtonProcesarInformacionTipoCuentaBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaBanco() {
		return this.jComboBoxTiposAccionesTipoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaBanco(
			JComboBox jComboBoxTiposRelacionesTipoCuentaBanco) {
		this.jComboBoxTiposRelacionesTipoCuentaBanco = jComboBoxTiposRelacionesTipoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaBanco(
			JComboBox jComboBoxTiposAccionesTipoCuentaBanco) {
		this.jComboBoxTiposAccionesTipoCuentaBanco = jComboBoxTiposAccionesTipoCuentaBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCuentaBanco() {
		return this.jComboBoxTiposAccionesFormularioTipoCuentaBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCuentaBanco(
			JComboBox jComboBoxTiposAccionesFormularioTipoCuentaBanco) {
		this.jComboBoxTiposAccionesFormularioTipoCuentaBanco = jComboBoxTiposAccionesFormularioTipoCuentaBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		
		this.tipocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentabancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		//this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCuentaBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCuentaBanco=new JButtonMe();
				this.jButtonModificarToolBarTipoCuentaBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco,
							"actualizar","actualizar","Actualizar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco,
							"eliminar","eliminar","Eliminar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco,
							"cancelar","cancelar","Cancelar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCuentaBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCuentaBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCuentaBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCuentaBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCuentaBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCuentaBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCuentaBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCuentaBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCuentaBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCuentaBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCuentaBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCuentaBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCuentaBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCuentaBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCuentaBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCuentaBanco.add(this.jMenuItemDetalleCerrarTipoCuentaBanco);
		
		this.jmenuDetalleAccionesTipoCuentaBanco.add(this.jMenuItemActualizarTipoCuentaBanco);
		this.jmenuDetalleAccionesTipoCuentaBanco.add(this.jMenuItemEliminarTipoCuentaBanco);
		this.jmenuDetalleAccionesTipoCuentaBanco.add(this.jMenuItemCancelarTipoCuentaBanco);		
		
		//this.jmenuDetalleDatosTipoCuentaBanco.add(this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco);				
		this.jmenuDetalleDatosTipoCuentaBanco.add(this.jMenuItemDetalleMostarOcultarTipoCuentaBanco);				
				
		//this.jmenuDetalleAccionesTipoCuentaBanco.add(this.jMenuItemGuardarCambiosTipoCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCuentaBanco.add(this.jmenuDetalleArchivoTipoCuentaBanco);		
		this.jmenuBarDetalleTipoCuentaBanco.add(this.jmenuDetalleAccionesTipoCuentaBanco);		
		this.jmenuBarDetalleTipoCuentaBanco.add(this.jmenuDetalleDatosTipoCuentaBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCuentaBanco.add(this.jmenuDetalleTipoCuentaBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCuentaBanco);				
	}
	
	
	public void inicializarElementosCamposTipoCuentaBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCuentaBanco = new JLabelMe();
		jLabelIdTipoCuentaBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCuentaBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCuentaBanco.setToolTipText(TipoCuentaBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCuentaBanco= new GridBagLayout();

		this.jPanelidTipoCuentaBanco.setLayout(this.gridaBagLayoutTipoCuentaBanco);

		jLabelidTipoCuentaBanco = new JLabel();
		jLabelidTipoCuentaBanco.setText("Id");

		jLabelidTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCuentaBanco = new JLabelMe();
		this.jLabelcodigoTipoCuentaBanco.setText(""+TipoCuentaBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCuentaBanco.setToolTipText("Codigo");
		this.jLabelcodigoTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCuentaBanco.setToolTipText(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCuentaBanco = new GridBagLayout();
		this.jPanelcodigoTipoCuentaBanco.setLayout(this.gridaBagLayoutTipoCuentaBanco);


		jTextFieldcodigoTipoCuentaBanco= new JTextFieldMe();

		jTextFieldcodigoTipoCuentaBanco.setEnabled(false);
		jTextFieldcodigoTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCuentaBancoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCuentaBancoBusqueda.setText("U");
		this.jButtoncodigoTipoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCuentaBancoBusqueda"));

		if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCuentaBanco = new JLabelMe();
		this.jLabelnombreTipoCuentaBanco.setText(""+TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCuentaBanco.setToolTipText("Nombre");
		this.jLabelnombreTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCuentaBanco.setToolTipText(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCuentaBanco = new GridBagLayout();
		this.jPanelnombreTipoCuentaBanco.setLayout(this.gridaBagLayoutTipoCuentaBanco);


		jTextAreanombreTipoCuentaBanco= new JTextAreaMe();
		jTextAreanombreTipoCuentaBanco.setEnabled(false);
		jTextAreanombreTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaBanco.setLineWrap(true);
		jTextAreanombreTipoCuentaBanco.setWrapStyleWord(true);
		jTextAreanombreTipoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCuentaBanco.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCuentaBanco = new JScrollPane(jTextAreanombreTipoCuentaBanco);
		jscrollPanenombreTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCuentaBancoBusqueda.setText("U");
		this.jButtonnombreTipoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCuentaBancoBusqueda"));

		if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCuentaBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCuentaBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCuentaBanco = new JLabelMe();
		this.jLabelid_empresaTipoCuentaBanco.setText(""+TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCuentaBanco.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCuentaBanco.setToolTipText(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCuentaBanco = new GridBagLayout();
		this.jPanelid_empresaTipoCuentaBanco.setLayout(this.gridaBagLayoutTipoCuentaBanco);


		jComboBoxid_empresaTipoCuentaBanco= new JComboBoxMe();
		jComboBoxid_empresaTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCuentaBanco.setEnabled(false);

		this.jButtonid_empresaTipoCuentaBanco= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuentaBanco.setText("Buscar");
		this.jButtonid_empresaTipoCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBanco"));

		this.jButtonid_empresaTipoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuentaBancoBusqueda.setText("U");
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBancoBusqueda"));

		if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuentaBancoUpdate.setText("U");
		this.jButtonid_empresaTipoCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuentaBancoUpdate"));



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
		//this.jInternalFrameDetalleTipoCuentaBanco = new TipoCuentaBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuenta Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaBanco= new GridBagLayout();
		

		
		String sToolTipTipoCuentaBanco="";
		sToolTipTipoCuentaBanco=TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaBanco+="(Tesoreria.TipoCuentaBanco)";
		}
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCuentaBanco = new JButtonMe();
		this.jButtonModificarTipoCuentaBanco = new JButtonMe();
        this.jButtonActualizarTipoCuentaBanco = new JButtonMe();
        this.jButtonEliminarTipoCuentaBanco = new JButtonMe();
        this.jButtonCancelarTipoCuentaBanco = new JButtonMe();
        this.jButtonGuardarCambiosTipoCuentaBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCuentaBanco = new JButtonMe();
		this.jButtonCerrarTipoCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCuentaBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCuentaBanco = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Banco";
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCuentaBanco.setName("jPanelCamposTipoCuentaBanco"); 

		this.jPanelCamposOcultosTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCuentaBanco.setName("jPanelCamposOcultosTipoCuentaBanco"); 

        this.jPanelAccionesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCuentaBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCuentaBanco.setText("Nuevo");
		this.jButtonModificarTipoCuentaBanco.setText("Editar");
        this.jButtonActualizarTipoCuentaBanco.setText("Actualizar");
        this.jButtonEliminarTipoCuentaBanco.setText("Eliminar");
        this.jButtonCancelarTipoCuentaBanco.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCuentaBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.setText("Guardar");
		this.jButtonCerrarTipoCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaBanco,"nuevo_button","Nuevo",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCuentaBanco,"modificar_button","Editar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCuentaBanco,"actualizar_button","Actualizar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCuentaBanco,"eliminar_button","Eliminar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCuentaBanco,"cancelar_button","Cancelar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCuentaBanco,"guardarcambios_button","Guardar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaBanco,"guardarcambiostabla_button","Guardar",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaBanco,"cerrar_button","Salir",this.tipocuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCuentaBanco.setToolTipText("Nuevo"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCuentaBanco.setToolTipText("Editar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCuentaBanco.setToolTipText("Actualizar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCuentaBanco.setToolTipText("Eliminar)"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCuentaBanco.setToolTipText("Cancelar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCuentaBanco.setToolTipText("Guardar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.setToolTipText("Guardar"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaBanco.setToolTipText("Salir"+" "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaBanco";
		inputMap = this.jButtonNuevoTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCuentaBanco";
		inputMap = this.jButtonActualizarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCuentaBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCuentaBanco";
		inputMap = this.jButtonEliminarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCuentaBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCuentaBanco";
		inputMap = this.jButtonCancelarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCuentaBanco"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaBanco";
		inputMap = this.jButtonCerrarTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCuentaBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCuentaBanco.setToolTipText("Nuevo TipoCuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCuentaBanco.setToolTipText("Sin Cerrar Ventana TipoCuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCuentaBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaBanco.setText("Acciones");		
		this.jLabelAccionesTipoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCuentaBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCuentaBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCuentaBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCuentaBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCuentaBanco = new GridBagLayout();
		
		this.jPanelCamposTipoCuentaBanco.setLayout(gridaBagLayoutCamposTipoCuentaBanco);
		this.jPanelCamposOcultosTipoCuentaBanco.setLayout(gridaBagLayoutCamposOcultosTipoCuentaBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCuentaBanco.add(jLabelIdTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 1;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCuentaBanco.add(jLabelidTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);


	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCuentaBanco.add(jLabelid_empresaTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 2;
		this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuentaBanco.add(jButtonid_empresaTipoCuentaBancoBusqueda, this.gridBagConstraintsTipoCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 3;
		this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuentaBanco.add(jButtonid_empresaTipoCuentaBancoUpdate, this.gridBagConstraintsTipoCuentaBanco);
	}

	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 1;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCuentaBanco.add(jComboBoxid_empresaTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);


	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCuentaBanco.add(jLabelcodigoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 2;
		this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCuentaBanco.add(jButtoncodigoTipoCuentaBancoBusqueda, this.gridBagConstraintsTipoCuentaBanco);
	}

	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 1;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCuentaBanco.add(jTextFieldcodigoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);


	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCuentaBanco.add(jLabelnombreTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = 2;
		this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCuentaBanco.add(jButtonnombreTipoCuentaBancoBusqueda, this.gridBagConstraintsTipoCuentaBanco);
	}

	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
	this.gridBagConstraintsTipoCuentaBanco.gridx = 1;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCuentaBanco.add(jscrollPanenombreTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBanco.gridy = iYPanelCamposTipoCuentaBanco;
	this.gridBagConstraintsTipoCuentaBanco.gridx = iXPanelCamposTipoCuentaBanco++;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBanco.add(this.jPanelidTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(iXPanelCamposTipoCuentaBanco % 1==0) {
		iXPanelCamposTipoCuentaBanco=0;
		iYPanelCamposTipoCuentaBanco++;
	}
	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBanco.gridy = iYPanelCamposTipoCuentaBanco;
	this.gridBagConstraintsTipoCuentaBanco.gridx = iXPanelCamposTipoCuentaBanco++;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBanco.add(this.jPanelcodigoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(iXPanelCamposTipoCuentaBanco % 1==0) {
		iXPanelCamposTipoCuentaBanco=0;
		iYPanelCamposTipoCuentaBanco++;
	}
	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBanco.gridy = iYPanelCamposTipoCuentaBanco;
	this.gridBagConstraintsTipoCuentaBanco.gridx = iXPanelCamposTipoCuentaBanco++;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaBanco.add(this.jPanelnombreTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(iXPanelCamposTipoCuentaBanco % 1==0) {
		iXPanelCamposTipoCuentaBanco=0;
		iYPanelCamposTipoCuentaBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaBanco.gridy = iYPanelCamposOcultosTipoCuentaBanco;
	this.gridBagConstraintsTipoCuentaBanco.gridx = iXPanelCamposOcultosTipoCuentaBanco++;
	this.gridBagConstraintsTipoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCuentaBanco.add(this.jPanelid_empresaTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);



	if(iXPanelCamposOcultosTipoCuentaBanco % 1==0) {
		iXPanelCamposOcultosTipoCuentaBanco=0;
		iYPanelCamposOcultosTipoCuentaBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesTipoCuentaBanco.setLayout(gridaBagLayoutAccionesTipoCuentaBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCuentaBanco.setLayout(gridaBagLayoutAccionesFormularioTipoCuentaBanco);
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBanco.add(this.jComboBoxTiposAccionesFormularioTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaBanco.add(this.jCheckBoxPostAccionNuevoTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBanco.add(this.jCheckBoxPostAccionSinCerrarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaBanco.add(this.jCheckBoxPostAccionSinMensajeTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonModificarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);							

		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;
		this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonEliminarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonActualizarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);


		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonGuardarCambiosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);	
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsTipoCuentaBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaBanco.add(this.jButtonCancelarTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaBanco.gridx =0;
		this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCuentaBanco = new TipoCuentaBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuenta Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuenta Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCuentaBancoModel tipocuentabancoModel=new TipoCuentaBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCuentaBancoModel.TipoCuentaBancoFocusTraversalPolicy tipocuentabancoFocusTraversalPolicy = tipocuentabancoModel.new TipoCuentaBancoFocusTraversalPolicy(this);
			
			//tipocuentabancoFocusTraversalPolicy.settipocuentabancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocuentabancoModel);
			
			
			this.jContentPaneDetalleTipoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCuentaBanco = new GridBagLayout();	
			this.jContentPaneDetalleTipoCuentaBanco.setLayout(gridaBagLayoutDetalleTipoCuentaBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCuentaBanco.add(jTtoolBarDetalleTipoCuentaBanco, gridBagConstraintsTipoCuentaBanco);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCuentaBanco=   new JScrollPane(jContentPaneDetalleTipoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	        
			this.jContentPaneDetalleTipoCuentaBanco.add(jPanelCamposTipoCuentaBanco, gridBagConstraintsTipoCuentaBanco);
			
			
			
			
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
						&& tipocuentabancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(this.puedeCargarPorParteReferenciaBancaria,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(this.puedeCargarPorParteTipoCuentaBancoGeneral,false,-1);
					
					if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCuentaBanco= new GridBagConstraints();
						this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
						this.jContentPaneDetalleTipoCuentaBanco.add(this.jTabbedPaneRelacionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCuentaBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCuentaBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
					this.gridBagConstraintsTipoCuentaBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCuentaBanco.add(jPanelCamposOcultosTipoCuentaBanco, gridBagConstraintsTipoCuentaBanco);
				
					this.jPanelCamposOcultosTipoCuentaBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	        this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCuentaBanco.add(this.jPanelAccionesFormularioTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);							
			
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
	        this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCuentaBanco.add(this.jPanelAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCuentaBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCuentaBanco=   new JScrollPane(this.jPanelCamposTipoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
			this.gridBagConstraintsTipoCuentaBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCuentaBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCuentaBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);			
			
			this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
			
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		
			
		this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaBanco, this.gridBagConstraintsTipoCuentaBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCuentaBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCuentaBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		this.referenciabancariaSessionBean.setConGuardarRelaciones(false);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

		this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciabancariaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

				this.referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciabancariaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciabancariaBeanSwingJInternalFrame.setreferenciabancariaSessionBean(this.referenciabancariaSessionBean);

				//this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBanco.add(this.referenciabancariaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBanco.add("Referencia Bancarias",this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBanco.setComponentAt(iIndexTab,this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaBancaria) {
					this.jTabbedPaneRelacionesTipoCuentaBanco.add("Referencia Bancarias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(false);
		this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);

		this.tipocuentabancogeneralBeanSwingJInternalFrame=null;//new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipocuentabancogeneralBeanSwingJInternalFramePopup=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipocuentabancogeneralBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {

				TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoCuentaBancoGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);

				this.tipocuentabancogeneralBeanSwingJInternalFrame=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipocuentabancogeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipocuentabancogeneralBeanSwingJInternalFrame.settipocuentabancogeneralSessionBean(this.tipocuentabancogeneralSessionBean);

				//this.gridBagConstraintsTipoCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaBanco.add(this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaBanco.add("Tipo Cuenta Banco Generales",this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaBanco.setComponentAt(iIndexTab,this.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
				}

				//TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
				this.tipocuentabancogeneralBeanSwingJInternalFrame=null;//new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoCuentaBancoGeneral) {
					this.jTabbedPaneRelacionesTipoCuentaBanco.add("Tipo Cuenta Banco Generales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaBancariaBeanSwingJInternalFrame(List<TipoCuentaBanco> tipocuentabancos,TipoCuentaBanco tipocuentabanco,ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciabancariaBeanSwingJInternalFrame.getReferenciaBancariaLogic().setConnexion(this.tipocuentabancoLogic.getConnexion());

					referenciabancariaBeanSwingJInternalFrame.settipocuentabancosForeignKey(tipocuentabancos);
					referenciabancariaBeanSwingJInternalFrame.settipocuentabancoForeignKey(tipocuentabanco);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(true);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setlidTipoCuentaBancoActual(tipocuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciabancariaBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaBancaria(referenciabancariaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciabancariaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBanco(true);
					referenciabancariaBeanSwingJInternalFrame.setidvalorclientecuentabancoFK_IdTipoCuentaBanco(tipocuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						referenciabancariaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciabancariaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoForeignKey(tipocuentabanco,1,false,true,true);
					referenciabancariaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciabancariaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBanco");
					referenciabancariaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBanco");
					referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(true);
					referenciabancariaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaBancaria("n",referenciabancariaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciabancariaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciabancariaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciabancariaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("relacionado");
					} else {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");
					}

					referenciabancariaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaBancaria().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTipoCuentaBancoGeneralBeanSwingJInternalFrame(List<TipoCuentaBanco> tipocuentabancos,TipoCuentaBanco tipocuentabanco,TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipocuentabancogeneralBeanSwingJInternalFrame=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipocuentabancogeneralBeanSwingJInternalFrame.getTipoCuentaBancoGeneralLogic().setConnexion(this.tipocuentabancoLogic.getConnexion());

					tipocuentabancogeneralBeanSwingJInternalFrame.settipocuentabancosForeignKey(tipocuentabancos);
					tipocuentabancogeneralBeanSwingJInternalFrame.settipocuentabancoForeignKey(tipocuentabanco);
					tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setlidTipoCuentaBancoActual(tipocuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipocuentabancogeneralBeanSwingJInternalFrame.cargarCombosForeignKeyTipoCuentaBancoGeneral(tipocuentabancogeneralBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipocuentabancogeneralBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaBanco(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setid_tipo_cuenta_bancoFK_IdTipoCuentaBanco(tipocuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						tipocuentabancogeneralBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tipocuentabancogeneralBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaBancoForeignKey(tipocuentabanco,1,false,true,true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipocuentabancogeneralBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaBanco");
					tipocuentabancogeneralBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaBanco");
					tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n",tipocuentabancogeneralBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipocuentabancogeneralBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipocuentabancogeneralBeanSwingJInternalFrame.setAutoscrolls(true);
					tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("relacionado");
					} else {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("no_relacionado");
					}

					tipocuentabancogeneralBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoCuentaBancoGeneral().setVisible(false);

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
