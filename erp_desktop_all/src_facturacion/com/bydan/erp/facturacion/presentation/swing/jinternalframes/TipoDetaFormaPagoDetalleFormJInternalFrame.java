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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoDetaFormaPagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoDetaFormaPagoDetalleFormJInternalFrame extends TipoDetaFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDetaFormaPago;
	
	protected JMenuBar jmenuBarDetalleTipoDetaFormaPago;
	
	protected JMenu jmenuDetalleTipoDetaFormaPago;
	protected JMenu jmenuDetalleArchivoTipoDetaFormaPago;
	protected JMenu jmenuDetalleAccionesTipoDetaFormaPago;
	protected JMenu jmenuDetalleDatosTipoDetaFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetaFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoDetaFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDetaFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDetaFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDetaFormaPagoLogic tipodetaformapagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoDetaFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoDetaFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoDetaFormaPago;
	
	protected JPanel jPanelCamposTipoDetaFormaPago;    
	protected JPanel jPanelCamposOcultosTipoDetaFormaPago;    	
	protected JPanel jPanelAccionesTipoDetaFormaPago;
	protected JPanel jPanelAccionesFormularioTipoDetaFormaPago;
    
	
	
	protected Integer iXPanelCamposTipoDetaFormaPago=0;
	protected Integer iYPanelCamposTipoDetaFormaPago=0;
	
	protected Integer iXPanelCamposOcultosTipoDetaFormaPago=0;
	protected Integer iYPanelCamposOcultosTipoDetaFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDetaFormaPago;
	public JButton jButtonModificarTipoDetaFormaPago;
	public JButton jButtonActualizarTipoDetaFormaPago;
    public JButton jButtonEliminarTipoDetaFormaPago;
	public JButton jButtonCancelarTipoDetaFormaPago;
    public JButton jButtonGuardarCambiosTipoDetaFormaPago;
	public JButton jButtonGuardarCambiosTablaTipoDetaFormaPago;
	protected JButton jButtonCerrarTipoDetaFormaPago;
	
	
	protected JButton jButtonProcesarInformacionTipoDetaFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDetaFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDetaFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDetaFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetaFormaPago;
	protected JButton jButtonModificarToolBarTipoDetaFormaPago;
	protected JButton jButtonActualizarToolBarTipoDetaFormaPago;
    protected JButton jButtonEliminarToolBarTipoDetaFormaPago;
	protected JButton jButtonCancelarToolBarTipoDetaFormaPago;
    protected JButton jButtonGuardarCambiosToolBarTipoDetaFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetaFormaPago;
	protected JButton jButtonCerrarToolBarTipoDetaFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDetaFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetaFormaPago;
	protected JMenuItem jMenuItemModificarTipoDetaFormaPago;
	protected JMenuItem jMenuItemActualizarTipoDetaFormaPago;
    protected JMenuItem jMenuItemEliminarTipoDetaFormaPago;
	protected JMenuItem jMenuItemCancelarTipoDetaFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoDetaFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetaFormaPago;
	protected JMenuItem jMenuItemCerrarTipoDetaFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetaFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetaFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDetaFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetaFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetaFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetaFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetaFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDetaFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDetaFormaPago;
	public JLabel jLabelIdTipoDetaFormaPago;
	public JLabel jLabelidTipoDetaFormaPago;
	public JButton jButtonidTipoDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDetaFormaPago;
	public JLabel jLabelcodigoTipoDetaFormaPago;
	public JTextField jTextFieldcodigoTipoDetaFormaPago;
	public JButton jButtoncodigoTipoDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDetaFormaPago;
	public JLabel jLabelnombreTipoDetaFormaPago;
	public JTextArea jTextAreanombreTipoDetaFormaPago;
	public JScrollPane jscrollPanenombreTipoDetaFormaPago;
	public JButton jButtonnombreTipoDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDetaFormaPago;
	public JLabel jLabelid_empresaTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDetaFormaPago;
	public JButton jButtonid_empresaTipoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_empresaTipoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDetaFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDetaFormaPago;
	
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
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDetaFormaPago=new JPanel();
				this.jPanelAccionesFormularioTipoDetaFormaPago=new JPanel();
				this.jmenuBarDetalleTipoDetaFormaPago=new JMenuBar();
				this.jTtoolBarDetalleTipoDetaFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDetaFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDetaFormaPago() {
		return this.jButtonActualizarToolBarTipoDetaFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoDetaFormaPago() {
		return this.jButtonEliminarToolBarTipoDetaFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoDetaFormaPago() {
		return this.jButtonCancelarToolBarTipoDetaFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDetaFormaPago() {
		return this.jButtonProcesarInformacionTipoDetaFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetaFormaPago)	{
		this.jButtonProcesarInformacionTipoDetaFormaPago = jButtonProcesarInformacionTipoDetaFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetaFormaPago() {
		return this.jComboBoxTiposAccionesTipoDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetaFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoDetaFormaPago) {
		this.jComboBoxTiposRelacionesTipoDetaFormaPago = jComboBoxTiposRelacionesTipoDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetaFormaPago(
			JComboBox jComboBoxTiposAccionesTipoDetaFormaPago) {
		this.jComboBoxTiposAccionesTipoDetaFormaPago = jComboBoxTiposAccionesTipoDetaFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDetaFormaPago() {
		return this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDetaFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoDetaFormaPago) {
		this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago = jComboBoxTiposAccionesFormularioTipoDetaFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		
		this.tipodetaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetaformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetaFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDetaFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDetaFormaPago=new JButtonMe();
				this.jButtonModificarToolBarTipoDetaFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago,
							"actualizar","actualizar","Actualizar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago,
							"eliminar","eliminar","Eliminar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago,
							"cancelar","cancelar","Cancelar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDetaFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDetaFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDetaFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDetaFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDetaFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetaFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetaFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetaFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDetaFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDetaFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDetaFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDetaFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDetaFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDetaFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDetaFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDetaFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDetaFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDetaFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDetaFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDetaFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDetaFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetaFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetaFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDetaFormaPago.add(this.jMenuItemDetalleCerrarTipoDetaFormaPago);
		
		this.jmenuDetalleAccionesTipoDetaFormaPago.add(this.jMenuItemActualizarTipoDetaFormaPago);
		this.jmenuDetalleAccionesTipoDetaFormaPago.add(this.jMenuItemEliminarTipoDetaFormaPago);
		this.jmenuDetalleAccionesTipoDetaFormaPago.add(this.jMenuItemCancelarTipoDetaFormaPago);		
		
		//this.jmenuDetalleDatosTipoDetaFormaPago.add(this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago);				
		this.jmenuDetalleDatosTipoDetaFormaPago.add(this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago);				
				
		//this.jmenuDetalleAccionesTipoDetaFormaPago.add(this.jMenuItemGuardarCambiosTipoDetaFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDetaFormaPago.add(this.jmenuDetalleArchivoTipoDetaFormaPago);		
		this.jmenuBarDetalleTipoDetaFormaPago.add(this.jmenuDetalleAccionesTipoDetaFormaPago);		
		this.jmenuBarDetalleTipoDetaFormaPago.add(this.jmenuDetalleDatosTipoDetaFormaPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDetaFormaPago);				
	}
	
	
	public void inicializarElementosCamposTipoDetaFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDetaFormaPago = new JLabelMe();
		jLabelIdTipoDetaFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDetaFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDetaFormaPago.setToolTipText(TipoDetaFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDetaFormaPago= new GridBagLayout();

		this.jPanelidTipoDetaFormaPago.setLayout(this.gridaBagLayoutTipoDetaFormaPago);

		jLabelidTipoDetaFormaPago = new JLabel();
		jLabelidTipoDetaFormaPago.setText("Id");

		jLabelidTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDetaFormaPago = new JLabelMe();
		this.jLabelcodigoTipoDetaFormaPago.setText(""+TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDetaFormaPago.setToolTipText("Codigo");
		this.jLabelcodigoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDetaFormaPago.setToolTipText(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDetaFormaPago = new GridBagLayout();
		this.jPanelcodigoTipoDetaFormaPago.setLayout(this.gridaBagLayoutTipoDetaFormaPago);


		jTextFieldcodigoTipoDetaFormaPago= new JTextFieldMe();

		jTextFieldcodigoTipoDetaFormaPago.setEnabled(false);
		jTextFieldcodigoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDetaFormaPagoBusqueda.setText("U");
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDetaFormaPagoBusqueda"));

		if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDetaFormaPago = new JLabelMe();
		this.jLabelnombreTipoDetaFormaPago.setText(""+TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDetaFormaPago.setToolTipText("Nombre");
		this.jLabelnombreTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDetaFormaPago.setToolTipText(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDetaFormaPago = new GridBagLayout();
		this.jPanelnombreTipoDetaFormaPago.setLayout(this.gridaBagLayoutTipoDetaFormaPago);


		jTextAreanombreTipoDetaFormaPago= new JTextAreaMe();
		jTextAreanombreTipoDetaFormaPago.setEnabled(false);
		jTextAreanombreTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaFormaPago.setLineWrap(true);
		jTextAreanombreTipoDetaFormaPago.setWrapStyleWord(true);
		jTextAreanombreTipoDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDetaFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDetaFormaPago = new JScrollPane(jTextAreanombreTipoDetaFormaPago);
		jscrollPanenombreTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDetaFormaPagoBusqueda.setText("U");
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDetaFormaPagoBusqueda"));

		if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDetaFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDetaFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDetaFormaPago = new JLabelMe();
		this.jLabelid_empresaTipoDetaFormaPago.setText(""+TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDetaFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDetaFormaPago.setToolTipText(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDetaFormaPago = new GridBagLayout();
		this.jPanelid_empresaTipoDetaFormaPago.setLayout(this.gridaBagLayoutTipoDetaFormaPago);


		jComboBoxid_empresaTipoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_empresaTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDetaFormaPago.setEnabled(false);

		this.jButtonid_empresaTipoDetaFormaPago= new JButtonMe();
		this.jButtonid_empresaTipoDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaFormaPago.setText("Buscar");
		this.jButtonid_empresaTipoDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaFormaPago"));

		this.jButtonid_empresaTipoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaFormaPagoBusqueda"));

		if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetaFormaPagoUpdate.setText("U");
		this.jButtonid_empresaTipoDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleTipoDetaFormaPago = new TipoDetaFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Detalle Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetaFormaPago= new GridBagLayout();
		

		
		String sToolTipTipoDetaFormaPago="";
		sToolTipTipoDetaFormaPago=TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetaFormaPago+="(Facturacion.TipoDetaFormaPago)";
		}
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetaFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDetaFormaPago = new JButtonMe();
		this.jButtonModificarTipoDetaFormaPago = new JButtonMe();
        this.jButtonActualizarTipoDetaFormaPago = new JButtonMe();
        this.jButtonEliminarTipoDetaFormaPago = new JButtonMe();
        this.jButtonCancelarTipoDetaFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoDetaFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago = new JButtonMe();
		this.jButtonCerrarTipoDetaFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetaFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDetaFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDetaFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Forma Pago";
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDetaFormaPago.setName("jPanelCamposTipoDetaFormaPago"); 

		this.jPanelCamposOcultosTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDetaFormaPago.setName("jPanelCamposOcultosTipoDetaFormaPago"); 

        this.jPanelAccionesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetaFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDetaFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDetaFormaPago.setText("Nuevo");
		this.jButtonModificarTipoDetaFormaPago.setText("Editar");
        this.jButtonActualizarTipoDetaFormaPago.setText("Actualizar");
        this.jButtonEliminarTipoDetaFormaPago.setText("Eliminar");
        this.jButtonCancelarTipoDetaFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDetaFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setText("Guardar");
		this.jButtonCerrarTipoDetaFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetaFormaPago,"nuevo_button","Nuevo",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDetaFormaPago,"modificar_button","Editar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDetaFormaPago,"actualizar_button","Actualizar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDetaFormaPago,"eliminar_button","Eliminar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDetaFormaPago,"cancelar_button","Cancelar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDetaFormaPago,"guardarcambios_button","Guardar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetaFormaPago,"guardarcambiostabla_button","Guardar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetaFormaPago,"cerrar_button","Salir",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDetaFormaPago.setToolTipText("Nuevo"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDetaFormaPago.setToolTipText("Editar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDetaFormaPago.setToolTipText("Actualizar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDetaFormaPago.setToolTipText("Eliminar)"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDetaFormaPago.setToolTipText("Cancelar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDetaFormaPago.setToolTipText("Guardar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setToolTipText("Guardar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetaFormaPago.setToolTipText("Salir"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetaFormaPago";
		inputMap = this.jButtonNuevoTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetaFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDetaFormaPago";
		inputMap = this.jButtonActualizarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDetaFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDetaFormaPago";
		inputMap = this.jButtonEliminarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDetaFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDetaFormaPago";
		inputMap = this.jButtonCancelarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDetaFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDetaFormaPago";
		inputMap = this.jButtonCerrarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetaFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetaFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDetaFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDetaFormaPago.setToolTipText("Nuevo TipoDetaFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago.setToolTipText("Sin Cerrar Ventana TipoDetaFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetaFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDetaFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoDetaFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDetaFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDetaFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDetaFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDetaFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDetaFormaPago = new GridBagLayout();
		
		this.jPanelCamposTipoDetaFormaPago.setLayout(gridaBagLayoutCamposTipoDetaFormaPago);
		this.jPanelCamposOcultosTipoDetaFormaPago.setLayout(gridaBagLayoutCamposOcultosTipoDetaFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDetaFormaPago.add(jLabelIdTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 1;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDetaFormaPago.add(jLabelidTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);


	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDetaFormaPago.add(jLabelid_empresaTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 2;
		this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetaFormaPago.add(jButtonid_empresaTipoDetaFormaPagoBusqueda, this.gridBagConstraintsTipoDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 3;
		this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetaFormaPago.add(jButtonid_empresaTipoDetaFormaPagoUpdate, this.gridBagConstraintsTipoDetaFormaPago);
	}

	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 1;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDetaFormaPago.add(jComboBoxid_empresaTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);


	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDetaFormaPago.add(jLabelcodigoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 2;
		this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDetaFormaPago.add(jButtoncodigoTipoDetaFormaPagoBusqueda, this.gridBagConstraintsTipoDetaFormaPago);
	}

	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 1;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDetaFormaPago.add(jTextFieldcodigoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);


	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDetaFormaPago.add(jLabelnombreTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 2;
		this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDetaFormaPago.add(jButtonnombreTipoDetaFormaPagoBusqueda, this.gridBagConstraintsTipoDetaFormaPago);
	}

	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = 1;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDetaFormaPago.add(jscrollPanenombreTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = iYPanelCamposTipoDetaFormaPago;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = iXPanelCamposTipoDetaFormaPago++;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaFormaPago.add(this.jPanelidTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(iXPanelCamposTipoDetaFormaPago % 1==0) {
		iXPanelCamposTipoDetaFormaPago=0;
		iYPanelCamposTipoDetaFormaPago++;
	}
	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = iYPanelCamposTipoDetaFormaPago;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = iXPanelCamposTipoDetaFormaPago++;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaFormaPago.add(this.jPanelcodigoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(iXPanelCamposTipoDetaFormaPago % 1==0) {
		iXPanelCamposTipoDetaFormaPago=0;
		iYPanelCamposTipoDetaFormaPago++;
	}
	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = iYPanelCamposTipoDetaFormaPago;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = iXPanelCamposTipoDetaFormaPago++;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaFormaPago.add(this.jPanelnombreTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(iXPanelCamposTipoDetaFormaPago % 1==0) {
		iXPanelCamposTipoDetaFormaPago=0;
		iYPanelCamposTipoDetaFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaFormaPago.gridy = iYPanelCamposOcultosTipoDetaFormaPago;
	this.gridBagConstraintsTipoDetaFormaPago.gridx = iXPanelCamposOcultosTipoDetaFormaPago++;
	this.gridBagConstraintsTipoDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDetaFormaPago.add(this.jPanelid_empresaTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);



	if(iXPanelCamposOcultosTipoDetaFormaPago % 1==0) {
		iXPanelCamposOcultosTipoDetaFormaPago=0;
		iYPanelCamposOcultosTipoDetaFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoDetaFormaPago.setLayout(gridaBagLayoutAccionesTipoDetaFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDetaFormaPago.setLayout(gridaBagLayoutAccionesFormularioTipoDetaFormaPago);
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetaFormaPago.add(this.jComboBoxTiposAccionesFormularioTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetaFormaPago.add(this.jCheckBoxPostAccionNuevoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetaFormaPago.add(this.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetaFormaPago.add(this.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonModificarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);							

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonEliminarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonActualizarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);


		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonGuardarCambiosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);	
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonCancelarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetaFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetaFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoDetaFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetaFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaFormaPago.gridx =0;
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetaFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDetaFormaPago = new TipoDetaFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Detalle Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Detalle Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDetaFormaPagoModel tipodetaformapagoModel=new TipoDetaFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDetaFormaPagoModel.TipoDetaFormaPagoFocusTraversalPolicy tipodetaformapagoFocusTraversalPolicy = tipodetaformapagoModel.new TipoDetaFormaPagoFocusTraversalPolicy(this);
			
			//tipodetaformapagoFocusTraversalPolicy.settipodetaformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodetaformapagoModel);
			
			
			this.jContentPaneDetalleTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDetaFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoDetaFormaPago.setLayout(gridaBagLayoutDetalleTipoDetaFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetaFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDetaFormaPago.add(jTtoolBarDetalleTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDetaFormaPago=   new JScrollPane(jContentPaneDetalleTipoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDetaFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoDetaFormaPago.add(jPanelCamposTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);
			
			
			
			
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
						&& tipodetaformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDetaFormaPago= new GridBagConstraints();
						this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
						this.jContentPaneDetalleTipoDetaFormaPago.add(this.jTabbedPaneRelacionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDetaFormaPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDetaFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
					this.gridBagConstraintsTipoDetaFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDetaFormaPago.add(jPanelCamposOcultosTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);
				
					this.jPanelCamposOcultosTipoDetaFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	        this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDetaFormaPago.add(this.jPanelAccionesFormularioTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);							
			
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDetaFormaPago.add(this.jPanelAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDetaFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDetaFormaPago=   new JScrollPane(this.jPanelCamposTipoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDetaFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDetaFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDetaFormaPago;
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
