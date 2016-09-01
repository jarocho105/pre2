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
import com.bydan.erp.tesoreria.util.TipoBancoFormaPagoConstantesFunciones;

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
public class TipoBancoFormaPagoDetalleFormJInternalFrame extends TipoBancoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoBancoFormaPago;
	
	protected JMenuBar jmenuBarDetalleTipoBancoFormaPago;
	
	protected JMenu jmenuDetalleTipoBancoFormaPago;
	protected JMenu jmenuDetalleArchivoTipoBancoFormaPago;
	protected JMenu jmenuDetalleAccionesTipoBancoFormaPago;
	protected JMenu jmenuDetalleDatosTipoBancoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoBancoFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoBancoFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoBancoFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean;
	
	

	public BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame=null;
	public BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBancoFormaPago=false;
	public BancoFormaPagoSessionBean bancoformapagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoBancoFormaPagoLogic tipobancoformapagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoBancoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoFormaPago;
	
	protected JPanel jPanelCamposTipoBancoFormaPago;    
	protected JPanel jPanelCamposOcultosTipoBancoFormaPago;    	
	protected JPanel jPanelAccionesTipoBancoFormaPago;
	protected JPanel jPanelAccionesFormularioTipoBancoFormaPago;
    
	
	
	protected Integer iXPanelCamposTipoBancoFormaPago=0;
	protected Integer iYPanelCamposTipoBancoFormaPago=0;
	
	protected Integer iXPanelCamposOcultosTipoBancoFormaPago=0;
	protected Integer iYPanelCamposOcultosTipoBancoFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoBancoFormaPago;
	public JButton jButtonModificarTipoBancoFormaPago;
	public JButton jButtonActualizarTipoBancoFormaPago;
    public JButton jButtonEliminarTipoBancoFormaPago;
	public JButton jButtonCancelarTipoBancoFormaPago;
    public JButton jButtonGuardarCambiosTipoBancoFormaPago;
	public JButton jButtonGuardarCambiosTablaTipoBancoFormaPago;
	protected JButton jButtonCerrarTipoBancoFormaPago;
	
	
	protected JButton jButtonProcesarInformacionTipoBancoFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoBancoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoBancoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoBancoFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoFormaPago;
	protected JButton jButtonModificarToolBarTipoBancoFormaPago;
	protected JButton jButtonActualizarToolBarTipoBancoFormaPago;
    protected JButton jButtonEliminarToolBarTipoBancoFormaPago;
	protected JButton jButtonCancelarToolBarTipoBancoFormaPago;
    protected JButton jButtonGuardarCambiosToolBarTipoBancoFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoFormaPago;
	protected JButton jButtonCerrarToolBarTipoBancoFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoBancoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoFormaPago;
	protected JMenuItem jMenuItemModificarTipoBancoFormaPago;
	protected JMenuItem jMenuItemActualizarTipoBancoFormaPago;
    protected JMenuItem jMenuItemEliminarTipoBancoFormaPago;
	protected JMenuItem jMenuItemCancelarTipoBancoFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoBancoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoBancoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoBancoFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoBancoFormaPago;
	public JLabel jLabelIdTipoBancoFormaPago;
	public JLabel jLabelidTipoBancoFormaPago;
	public JButton jButtonidTipoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoBancoFormaPago;
	public JLabel jLabelcodigoTipoBancoFormaPago;
	public JTextField jTextFieldcodigoTipoBancoFormaPago;
	public JButton jButtoncodigoTipoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoBancoFormaPago;
	public JLabel jLabelnombreTipoBancoFormaPago;
	public JTextArea jTextAreanombreTipoBancoFormaPago;
	public JScrollPane jscrollPanenombreTipoBancoFormaPago;
	public JButton jButtonnombreTipoBancoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoBancoFormaPago;
	public JLabel jLabelid_empresaTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoBancoFormaPago;
	public JButton jButtonid_empresaTipoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoBancoFormaPago;
	
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
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoBancoFormaPago=new JPanel();
				this.jPanelAccionesFormularioTipoBancoFormaPago=new JPanel();
				this.jmenuBarDetalleTipoBancoFormaPago=new JMenuBar();
				this.jTtoolBarDetalleTipoBancoFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoBancoFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoBancoFormaPago() {
		return this.jButtonActualizarToolBarTipoBancoFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoBancoFormaPago() {
		return this.jButtonEliminarToolBarTipoBancoFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoBancoFormaPago() {
		return this.jButtonCancelarToolBarTipoBancoFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoBancoFormaPago() {
		return this.jButtonProcesarInformacionTipoBancoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoFormaPago)	{
		this.jButtonProcesarInformacionTipoBancoFormaPago = jButtonProcesarInformacionTipoBancoFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoFormaPago() {
		return this.jComboBoxTiposAccionesTipoBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoBancoFormaPago) {
		this.jComboBoxTiposRelacionesTipoBancoFormaPago = jComboBoxTiposRelacionesTipoBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoBancoFormaPago) {
		this.jComboBoxTiposAccionesTipoBancoFormaPago = jComboBoxTiposAccionesTipoBancoFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoBancoFormaPago() {
		return this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoBancoFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoBancoFormaPago) {
		this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago = jComboBoxTiposAccionesFormularioTipoBancoFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		
		this.tipobancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoBancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoBancoFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoBancoFormaPago=new JButtonMe();
				this.jButtonModificarToolBarTipoBancoFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago,
							"actualizar","actualizar","Actualizar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago,
							"eliminar","eliminar","Eliminar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago,
							"cancelar","cancelar","Cancelar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoBancoFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoBancoFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoBancoFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoBancoFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoBancoFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoBancoFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoBancoFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoBancoFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoBancoFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoBancoFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoBancoFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoBancoFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoBancoFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoBancoFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoBancoFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoBancoFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoBancoFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoBancoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoBancoFormaPago.add(this.jMenuItemDetalleCerrarTipoBancoFormaPago);
		
		this.jmenuDetalleAccionesTipoBancoFormaPago.add(this.jMenuItemActualizarTipoBancoFormaPago);
		this.jmenuDetalleAccionesTipoBancoFormaPago.add(this.jMenuItemEliminarTipoBancoFormaPago);
		this.jmenuDetalleAccionesTipoBancoFormaPago.add(this.jMenuItemCancelarTipoBancoFormaPago);		
		
		//this.jmenuDetalleDatosTipoBancoFormaPago.add(this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago);				
		this.jmenuDetalleDatosTipoBancoFormaPago.add(this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago);				
				
		//this.jmenuDetalleAccionesTipoBancoFormaPago.add(this.jMenuItemGuardarCambiosTipoBancoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoBancoFormaPago.add(this.jmenuDetalleArchivoTipoBancoFormaPago);		
		this.jmenuBarDetalleTipoBancoFormaPago.add(this.jmenuDetalleAccionesTipoBancoFormaPago);		
		this.jmenuBarDetalleTipoBancoFormaPago.add(this.jmenuDetalleDatosTipoBancoFormaPago);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoBancoFormaPago.add(this.jmenuDetalleTipoBancoFormaPago);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoBancoFormaPago);				
	}
	
	
	public void inicializarElementosCamposTipoBancoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoBancoFormaPago = new JLabelMe();
		jLabelIdTipoBancoFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoBancoFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoBancoFormaPago.setToolTipText(TipoBancoFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoBancoFormaPago= new GridBagLayout();

		this.jPanelidTipoBancoFormaPago.setLayout(this.gridaBagLayoutTipoBancoFormaPago);

		jLabelidTipoBancoFormaPago = new JLabel();
		jLabelidTipoBancoFormaPago.setText("Id");

		jLabelidTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoBancoFormaPago = new JLabelMe();
		this.jLabelcodigoTipoBancoFormaPago.setText(""+TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoBancoFormaPago.setToolTipText("Codigo");
		this.jLabelcodigoTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoBancoFormaPago.setToolTipText(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoBancoFormaPago = new GridBagLayout();
		this.jPanelcodigoTipoBancoFormaPago.setLayout(this.gridaBagLayoutTipoBancoFormaPago);


		jTextFieldcodigoTipoBancoFormaPago= new JTextFieldMe();

		jTextFieldcodigoTipoBancoFormaPago.setEnabled(false);
		jTextFieldcodigoTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoBancoFormaPagoBusqueda.setText("U");
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoBancoFormaPagoBusqueda"));

		if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoBancoFormaPago = new JLabelMe();
		this.jLabelnombreTipoBancoFormaPago.setText(""+TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoBancoFormaPago.setToolTipText("Nombre");
		this.jLabelnombreTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoBancoFormaPago.setToolTipText(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoBancoFormaPago = new GridBagLayout();
		this.jPanelnombreTipoBancoFormaPago.setLayout(this.gridaBagLayoutTipoBancoFormaPago);


		jTextAreanombreTipoBancoFormaPago= new JTextAreaMe();
		jTextAreanombreTipoBancoFormaPago.setEnabled(false);
		jTextAreanombreTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBancoFormaPago.setLineWrap(true);
		jTextAreanombreTipoBancoFormaPago.setWrapStyleWord(true);
		jTextAreanombreTipoBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoBancoFormaPago.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoBancoFormaPago = new JScrollPane(jTextAreanombreTipoBancoFormaPago);
		jscrollPanenombreTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoBancoFormaPagoBusqueda.setText("U");
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoBancoFormaPagoBusqueda"));

		if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoBancoFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoBancoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoBancoFormaPago = new JLabelMe();
		this.jLabelid_empresaTipoBancoFormaPago.setText(""+TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoBancoFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoBancoFormaPago.setToolTipText(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoBancoFormaPago = new GridBagLayout();
		this.jPanelid_empresaTipoBancoFormaPago.setLayout(this.gridaBagLayoutTipoBancoFormaPago);


		jComboBoxid_empresaTipoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_empresaTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoBancoFormaPago.setEnabled(false);

		this.jButtonid_empresaTipoBancoFormaPago= new JButtonMe();
		this.jButtonid_empresaTipoBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBancoFormaPago.setText("Buscar");
		this.jButtonid_empresaTipoBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoFormaPago"));

		this.jButtonid_empresaTipoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoFormaPagoBusqueda"));

		if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoFormaPagoUpdate.setText("U");
		this.jButtonid_empresaTipoBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleTipoBancoFormaPago = new TipoBancoFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Banco Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoFormaPago= new GridBagLayout();
		

		
		String sToolTipTipoBancoFormaPago="";
		sToolTipTipoBancoFormaPago=TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoFormaPago+="(Tesoreria.TipoBancoFormaPago)";
		}
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoBancoFormaPago = new JButtonMe();
		this.jButtonModificarTipoBancoFormaPago = new JButtonMe();
        this.jButtonActualizarTipoBancoFormaPago = new JButtonMe();
        this.jButtonEliminarTipoBancoFormaPago = new JButtonMe();
        this.jButtonCancelarTipoBancoFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoBancoFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoBancoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoBancoFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoBancoFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Forma Pago";
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoBancoFormaPago.setName("jPanelCamposTipoBancoFormaPago"); 

		this.jPanelCamposOcultosTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoBancoFormaPago.setName("jPanelCamposOcultosTipoBancoFormaPago"); 

        this.jPanelAccionesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoBancoFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoBancoFormaPago.setText("Nuevo");
		this.jButtonModificarTipoBancoFormaPago.setText("Editar");
        this.jButtonActualizarTipoBancoFormaPago.setText("Actualizar");
        this.jButtonEliminarTipoBancoFormaPago.setText("Eliminar");
        this.jButtonCancelarTipoBancoFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoBancoFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoBancoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoFormaPago,"nuevo_button","Nuevo",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoBancoFormaPago,"modificar_button","Editar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoBancoFormaPago,"actualizar_button","Actualizar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoBancoFormaPago,"eliminar_button","Eliminar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoBancoFormaPago,"cancelar_button","Cancelar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoBancoFormaPago,"guardarcambios_button","Guardar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoFormaPago,"guardarcambiostabla_button","Guardar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoFormaPago,"cerrar_button","Salir",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoBancoFormaPago.setToolTipText("Nuevo"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoBancoFormaPago.setToolTipText("Editar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoBancoFormaPago.setToolTipText("Actualizar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoBancoFormaPago.setToolTipText("Eliminar)"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoBancoFormaPago.setToolTipText("Cancelar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoBancoFormaPago.setToolTipText("Guardar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setToolTipText("Guardar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoFormaPago.setToolTipText("Salir"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoFormaPago";
		inputMap = this.jButtonNuevoTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoBancoFormaPago";
		inputMap = this.jButtonActualizarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoBancoFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoBancoFormaPago";
		inputMap = this.jButtonEliminarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoBancoFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoBancoFormaPago";
		inputMap = this.jButtonCancelarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoBancoFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoFormaPago";
		inputMap = this.jButtonCerrarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoBancoFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoBancoFormaPago.setToolTipText("Nuevo TipoBancoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago.setToolTipText("Sin Cerrar Ventana TipoBancoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoBancoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoBancoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoBancoFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoBancoFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoBancoFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoBancoFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoBancoFormaPago = new GridBagLayout();
		
		this.jPanelCamposTipoBancoFormaPago.setLayout(gridaBagLayoutCamposTipoBancoFormaPago);
		this.jPanelCamposOcultosTipoBancoFormaPago.setLayout(gridaBagLayoutCamposOcultosTipoBancoFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoBancoFormaPago.add(jLabelIdTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoBancoFormaPago.add(jLabelidTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);


	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoBancoFormaPago.add(jLabelid_empresaTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBancoFormaPago.add(jButtonid_empresaTipoBancoFormaPagoBusqueda, this.gridBagConstraintsTipoBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBancoFormaPago.add(jButtonid_empresaTipoBancoFormaPagoUpdate, this.gridBagConstraintsTipoBancoFormaPago);
	}

	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoBancoFormaPago.add(jComboBoxid_empresaTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);


	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoBancoFormaPago.add(jLabelcodigoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoBancoFormaPago.add(jButtoncodigoTipoBancoFormaPagoBusqueda, this.gridBagConstraintsTipoBancoFormaPago);
	}

	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoBancoFormaPago.add(jTextFieldcodigoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);


	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoBancoFormaPago.add(jLabelnombreTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoBancoFormaPago.add(jButtonnombreTipoBancoFormaPagoBusqueda, this.gridBagConstraintsTipoBancoFormaPago);
	}

	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoBancoFormaPago.add(jscrollPanenombreTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = iYPanelCamposTipoBancoFormaPago;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = iXPanelCamposTipoBancoFormaPago++;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoFormaPago.add(this.jPanelidTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(iXPanelCamposTipoBancoFormaPago % 1==0) {
		iXPanelCamposTipoBancoFormaPago=0;
		iYPanelCamposTipoBancoFormaPago++;
	}
	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = iYPanelCamposTipoBancoFormaPago;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = iXPanelCamposTipoBancoFormaPago++;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoFormaPago.add(this.jPanelcodigoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(iXPanelCamposTipoBancoFormaPago % 1==0) {
		iXPanelCamposTipoBancoFormaPago=0;
		iYPanelCamposTipoBancoFormaPago++;
	}
	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = iYPanelCamposTipoBancoFormaPago;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = iXPanelCamposTipoBancoFormaPago++;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBancoFormaPago.add(this.jPanelnombreTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(iXPanelCamposTipoBancoFormaPago % 1==0) {
		iXPanelCamposTipoBancoFormaPago=0;
		iYPanelCamposTipoBancoFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBancoFormaPago.gridy = iYPanelCamposOcultosTipoBancoFormaPago;
	this.gridBagConstraintsTipoBancoFormaPago.gridx = iXPanelCamposOcultosTipoBancoFormaPago++;
	this.gridBagConstraintsTipoBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoBancoFormaPago.add(this.jPanelid_empresaTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);



	if(iXPanelCamposOcultosTipoBancoFormaPago % 1==0) {
		iXPanelCamposOcultosTipoBancoFormaPago=0;
		iYPanelCamposOcultosTipoBancoFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoBancoFormaPago.setLayout(gridaBagLayoutAccionesTipoBancoFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoBancoFormaPago.setLayout(gridaBagLayoutAccionesFormularioTipoBancoFormaPago);
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoFormaPago.add(this.jComboBoxTiposAccionesFormularioTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBancoFormaPago.add(this.jCheckBoxPostAccionNuevoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoFormaPago.add(this.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBancoFormaPago.add(this.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonModificarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);							

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonEliminarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonActualizarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);


		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonGuardarCambiosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);	
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonCancelarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoBancoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoFormaPago.gridx =0;
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoBancoFormaPago = new TipoBancoFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Banco Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Banco Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoBancoFormaPagoModel tipobancoformapagoModel=new TipoBancoFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoBancoFormaPagoModel.TipoBancoFormaPagoFocusTraversalPolicy tipobancoformapagoFocusTraversalPolicy = tipobancoformapagoModel.new TipoBancoFormaPagoFocusTraversalPolicy(this);
			
			//tipobancoformapagoFocusTraversalPolicy.settipobancoformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipobancoformapagoModel);
			
			
			this.jContentPaneDetalleTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoBancoFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoBancoFormaPago.setLayout(gridaBagLayoutDetalleTipoBancoFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoBancoFormaPago.add(jTtoolBarDetalleTipoBancoFormaPago, gridBagConstraintsTipoBancoFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoBancoFormaPago=   new JScrollPane(jContentPaneDetalleTipoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoBancoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoBancoFormaPago.add(jPanelCamposTipoBancoFormaPago, gridBagConstraintsTipoBancoFormaPago);
			
			
			
			
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
						&& tipobancoformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBancoFormaPago(this.puedeCargarPorParteBancoFormaPago,false,-1);
					
					if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoBancoFormaPago= new GridBagConstraints();
						this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
						this.jContentPaneDetalleTipoBancoFormaPago.add(this.jTabbedPaneRelacionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoBancoFormaPago.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBancoFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoBancoFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
					this.gridBagConstraintsTipoBancoFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoBancoFormaPago.add(jPanelCamposOcultosTipoBancoFormaPago, gridBagConstraintsTipoBancoFormaPago);
				
					this.jPanelCamposOcultosTipoBancoFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	        this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoBancoFormaPago.add(this.jPanelAccionesFormularioTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);							
			
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoBancoFormaPago.add(this.jPanelAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoBancoFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoBancoFormaPago=   new JScrollPane(this.jPanelCamposTipoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoBancoFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoBancoFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoBancoFormaPago;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBancoFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		this.bancoformapagoSessionBean.setConGuardarRelaciones(false);
		this.bancoformapagoSessionBean.setEsGuardarRelacionado(true);

		this.bancoformapagoBeanSwingJInternalFrame=null;//new BancoFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bancoformapagoBeanSwingJInternalFramePopup=new BancoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bancoformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {

				BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bancoformapagoSessionBean.setEsGuardarRelacionado(true);

				this.bancoformapagoBeanSwingJInternalFrame=new BancoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bancoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bancoformapagoBeanSwingJInternalFrame.setbancoformapagoSessionBean(this.bancoformapagoSessionBean);

				//this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoBancoFormaPago.add(this.bancoformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoBancoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoBancoFormaPago.add("Banco Forma Pagos",this.bancoformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoBancoFormaPago.setComponentAt(iIndexTab,this.bancoformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bancoformapagoSessionBean.setEsGuardarRelacionado(false);
				this.bancoformapagoBeanSwingJInternalFrame=null;//new BancoFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBancoFormaPago) {
					this.jTabbedPaneRelacionesTipoBancoFormaPago.add("Banco Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBancoFormaPagoBeanSwingJInternalFrame(List<TipoBancoFormaPago> tipobancoformapagos,TipoBancoFormaPago tipobancoformapago,BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bancoformapagoBeanSwingJInternalFrame=new BancoFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bancoformapagoBeanSwingJInternalFrame.getBancoFormaPagoLogic().setConnexion(this.tipobancoformapagoLogic.getConnexion());

					bancoformapagoBeanSwingJInternalFrame.settipobancoformapagosForeignKey(tipobancoformapagos);
					bancoformapagoBeanSwingJInternalFrame.settipobancoformapagoForeignKey(tipobancoformapago);
					bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoBancoFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setlidTipoBancoFormaPagoActual(tipobancoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bancoformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyBancoFormaPago(bancoformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					bancoformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoBancoFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bancoformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoBancoFormaPago");
					bancoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoBancoFormaPago");
					bancoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBancoFormaPago("n",bancoformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, bancoformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bancoformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					bancoformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bancoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsBancoFormaPago("relacionado");
					} else {
						bancoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsBancoFormaPago("no_relacionado");
					}

					bancoformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionBancoFormaPago().setVisible(false);

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
