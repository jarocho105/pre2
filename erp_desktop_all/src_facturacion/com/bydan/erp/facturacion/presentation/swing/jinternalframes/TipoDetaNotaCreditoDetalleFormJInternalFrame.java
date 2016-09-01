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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoDetaNotaCreditoConstantesFunciones;

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
public class TipoDetaNotaCreditoDetalleFormJInternalFrame extends TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDetaNotaCredito;
	
	protected JMenuBar jmenuBarDetalleTipoDetaNotaCredito;
	
	protected JMenu jmenuDetalleTipoDetaNotaCredito;
	protected JMenu jmenuDetalleArchivoTipoDetaNotaCredito;
	protected JMenu jmenuDetalleAccionesTipoDetaNotaCredito;
	protected JMenu jmenuDetalleDatosTipoDetaNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetaNotaCredito;	
	protected GridBagConstraints gridBagConstraintsTipoDetaNotaCredito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDetaNotaCredito;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDetaNotaCreditoLogic tipodetanotacreditoLogic;
	
	public JScrollPane jScrollPanelDatosTipoDetaNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionTipoDetaNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralTipoDetaNotaCredito;
	
	protected JPanel jPanelCamposTipoDetaNotaCredito;    
	protected JPanel jPanelCamposOcultosTipoDetaNotaCredito;    	
	protected JPanel jPanelAccionesTipoDetaNotaCredito;
	protected JPanel jPanelAccionesFormularioTipoDetaNotaCredito;
    
	
	
	protected Integer iXPanelCamposTipoDetaNotaCredito=0;
	protected Integer iYPanelCamposTipoDetaNotaCredito=0;
	
	protected Integer iXPanelCamposOcultosTipoDetaNotaCredito=0;
	protected Integer iYPanelCamposOcultosTipoDetaNotaCredito=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDetaNotaCredito;
	public JButton jButtonModificarTipoDetaNotaCredito;
	public JButton jButtonActualizarTipoDetaNotaCredito;
    public JButton jButtonEliminarTipoDetaNotaCredito;
	public JButton jButtonCancelarTipoDetaNotaCredito;
    public JButton jButtonGuardarCambiosTipoDetaNotaCredito;
	public JButton jButtonGuardarCambiosTablaTipoDetaNotaCredito;
	protected JButton jButtonCerrarTipoDetaNotaCredito;
	
	
	protected JButton jButtonProcesarInformacionTipoDetaNotaCredito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDetaNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetaNotaCredito;
	protected JButton jButtonModificarToolBarTipoDetaNotaCredito;
	protected JButton jButtonActualizarToolBarTipoDetaNotaCredito;
    protected JButton jButtonEliminarToolBarTipoDetaNotaCredito;
	protected JButton jButtonCancelarToolBarTipoDetaNotaCredito;
    protected JButton jButtonGuardarCambiosToolBarTipoDetaNotaCredito;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDetaNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetaNotaCredito;
	protected JButton jButtonCerrarToolBarTipoDetaNotaCredito;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDetaNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetaNotaCredito;
	protected JMenuItem jMenuItemModificarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemActualizarTipoDetaNotaCredito;
    protected JMenuItem jMenuItemEliminarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemCancelarTipoDetaNotaCredito;
    protected JMenuItem jMenuItemGuardarCambiosTipoDetaNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetaNotaCredito;
	protected JMenuItem jMenuItemCerrarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetaNotaCredito;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetaNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetaNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetaNotaCredito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetaNotaCredito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDetaNotaCredito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDetaNotaCredito;
	public JLabel jLabelIdTipoDetaNotaCredito;
	public JLabel jLabelidTipoDetaNotaCredito;
	public JButton jButtonidTipoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDetaNotaCredito;
	public JLabel jLabelcodigoTipoDetaNotaCredito;
	public JTextField jTextFieldcodigoTipoDetaNotaCredito;
	public JButton jButtoncodigoTipoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDetaNotaCredito;
	public JLabel jLabelnombreTipoDetaNotaCredito;
	public JTextArea jTextAreanombreTipoDetaNotaCredito;
	public JScrollPane jscrollPanenombreTipoDetaNotaCredito;
	public JButton jButtonnombreTipoDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDetaNotaCredito;
	public JLabel jLabelid_empresaTipoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDetaNotaCredito;
	public JButton jButtonid_empresaTipoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_empresaTipoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDetaNotaCreditoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDetaNotaCredito;
	
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
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDetaNotaCredito=new JPanel();
				this.jPanelAccionesFormularioTipoDetaNotaCredito=new JPanel();
				this.jmenuBarDetalleTipoDetaNotaCredito=new JMenuBar();
				this.jTtoolBarDetalleTipoDetaNotaCredito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDetaNotaCreditoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaNotaCreditoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDetaNotaCredito() {
		return this.jButtonActualizarToolBarTipoDetaNotaCredito;
	}
	
	public JButton getjButtonEliminarToolBarTipoDetaNotaCredito() {
		return this.jButtonEliminarToolBarTipoDetaNotaCredito;
	}
	
	public JButton getjButtonCancelarToolBarTipoDetaNotaCredito() {
		return this.jButtonCancelarToolBarTipoDetaNotaCredito;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDetaNotaCredito() {
		return this.jButtonProcesarInformacionTipoDetaNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetaNotaCredito)	{
		this.jButtonProcesarInformacionTipoDetaNotaCredito = jButtonProcesarInformacionTipoDetaNotaCredito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetaNotaCredito() {
		return this.jComboBoxTiposAccionesTipoDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposRelacionesTipoDetaNotaCredito) {
		this.jComboBoxTiposRelacionesTipoDetaNotaCredito = jComboBoxTiposRelacionesTipoDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesTipoDetaNotaCredito) {
		this.jComboBoxTiposAccionesTipoDetaNotaCredito = jComboBoxTiposAccionesTipoDetaNotaCredito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDetaNotaCredito() {
		return this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesFormularioTipoDetaNotaCredito) {
		this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito = jComboBoxTiposAccionesFormularioTipoDetaNotaCredito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodetanotacreditoSessionBean=new TipoDetaNotaCreditoSessionBean();
		
		this.tipodetanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetaNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDetaNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDetaNotaCredito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDetaNotaCredito=new JButtonMe();
				this.jButtonModificarToolBarTipoDetaNotaCredito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito,
							"actualizar","actualizar","Actualizar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito,
							"eliminar","eliminar","Eliminar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito,
							"cancelar","cancelar","Cancelar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDetaNotaCredito,this.jTtoolBarDetalleTipoDetaNotaCredito,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDetaNotaCredito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDetaNotaCredito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDetaNotaCredito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDetaNotaCredito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDetaNotaCredito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetaNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetaNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetaNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDetaNotaCredito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDetaNotaCredito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDetaNotaCredito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDetaNotaCredito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDetaNotaCredito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDetaNotaCredito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDetaNotaCredito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDetaNotaCredito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDetaNotaCredito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDetaNotaCredito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDetaNotaCredito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDetaNotaCredito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetaNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetaNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDetaNotaCredito.add(this.jMenuItemDetalleCerrarTipoDetaNotaCredito);
		
		this.jmenuDetalleAccionesTipoDetaNotaCredito.add(this.jMenuItemActualizarTipoDetaNotaCredito);
		this.jmenuDetalleAccionesTipoDetaNotaCredito.add(this.jMenuItemEliminarTipoDetaNotaCredito);
		this.jmenuDetalleAccionesTipoDetaNotaCredito.add(this.jMenuItemCancelarTipoDetaNotaCredito);		
		
		//this.jmenuDetalleDatosTipoDetaNotaCredito.add(this.jMenuItemDetalleAbrirOrderByTipoDetaNotaCredito);				
		this.jmenuDetalleDatosTipoDetaNotaCredito.add(this.jMenuItemDetalleMostarOcultarTipoDetaNotaCredito);				
				
		//this.jmenuDetalleAccionesTipoDetaNotaCredito.add(this.jMenuItemGuardarCambiosTipoDetaNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDetaNotaCredito.add(this.jmenuDetalleArchivoTipoDetaNotaCredito);		
		this.jmenuBarDetalleTipoDetaNotaCredito.add(this.jmenuDetalleAccionesTipoDetaNotaCredito);		
		this.jmenuBarDetalleTipoDetaNotaCredito.add(this.jmenuDetalleDatosTipoDetaNotaCredito);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDetaNotaCredito);				
	}
	
	
	public void inicializarElementosCamposTipoDetaNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDetaNotaCredito = new JLabelMe();
		jLabelIdTipoDetaNotaCredito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDetaNotaCredito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDetaNotaCredito.setToolTipText(TipoDetaNotaCreditoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDetaNotaCredito= new GridBagLayout();

		this.jPanelidTipoDetaNotaCredito.setLayout(this.gridaBagLayoutTipoDetaNotaCredito);

		jLabelidTipoDetaNotaCredito = new JLabel();
		jLabelidTipoDetaNotaCredito.setText("Id");

		jLabelidTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDetaNotaCredito = new JLabelMe();
		this.jLabelcodigoTipoDetaNotaCredito.setText(""+TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDetaNotaCredito.setToolTipText("Codigo");
		this.jLabelcodigoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDetaNotaCredito.setToolTipText(TipoDetaNotaCreditoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDetaNotaCredito = new GridBagLayout();
		this.jPanelcodigoTipoDetaNotaCredito.setLayout(this.gridaBagLayoutTipoDetaNotaCredito);


		jTextFieldcodigoTipoDetaNotaCredito= new JTextFieldMe();

		jTextFieldcodigoTipoDetaNotaCredito.setEnabled(false);
		jTextFieldcodigoTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setText("U");
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDetaNotaCreditoBusqueda"));

		if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDetaNotaCredito = new JLabelMe();
		this.jLabelnombreTipoDetaNotaCredito.setText(""+TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDetaNotaCredito.setToolTipText("Nombre");
		this.jLabelnombreTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDetaNotaCredito.setToolTipText(TipoDetaNotaCreditoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDetaNotaCredito = new GridBagLayout();
		this.jPanelnombreTipoDetaNotaCredito.setLayout(this.gridaBagLayoutTipoDetaNotaCredito);


		jTextAreanombreTipoDetaNotaCredito= new JTextAreaMe();
		jTextAreanombreTipoDetaNotaCredito.setEnabled(false);
		jTextAreanombreTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetaNotaCredito.setLineWrap(true);
		jTextAreanombreTipoDetaNotaCredito.setWrapStyleWord(true);
		jTextAreanombreTipoDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDetaNotaCredito.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDetaNotaCredito = new JScrollPane(jTextAreanombreTipoDetaNotaCredito);
		jscrollPanenombreTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDetaNotaCreditoBusqueda"));

		if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDetaNotaCreditoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDetaNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDetaNotaCredito = new JLabelMe();
		this.jLabelid_empresaTipoDetaNotaCredito.setText(""+TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDetaNotaCredito.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDetaNotaCredito.setToolTipText(TipoDetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDetaNotaCredito = new GridBagLayout();
		this.jPanelid_empresaTipoDetaNotaCredito.setLayout(this.gridaBagLayoutTipoDetaNotaCredito);


		jComboBoxid_empresaTipoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_empresaTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDetaNotaCredito.setEnabled(false);

		this.jButtonid_empresaTipoDetaNotaCredito= new JButtonMe();
		this.jButtonid_empresaTipoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetaNotaCredito.setText("Buscar");
		this.jButtonid_empresaTipoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaNotaCredito"));

		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaNotaCreditoBusqueda"));

		if(this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetaNotaCreditoUpdate"));



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
		//this.jInternalFrameDetalleTipoDetaNotaCredito = new TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Detalle Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetaNotaCredito= new GridBagLayout();
		

		
		String sToolTipTipoDetaNotaCredito="";
		sToolTipTipoDetaNotaCredito=TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetaNotaCredito+="(Facturacion.TipoDetaNotaCredito)";
		}
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetaNotaCredito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDetaNotaCredito = new JButtonMe();
		this.jButtonModificarTipoDetaNotaCredito = new JButtonMe();
        this.jButtonActualizarTipoDetaNotaCredito = new JButtonMe();
        this.jButtonEliminarTipoDetaNotaCredito = new JButtonMe();
        this.jButtonCancelarTipoDetaNotaCredito = new JButtonMe();
        this.jButtonGuardarCambiosTipoDetaNotaCredito = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarTipoDetaNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetaNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDetaNotaCredito = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDetaNotaCredito = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Nota Credito";
		
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDetaNotaCredito.setName("jPanelCamposTipoDetaNotaCredito"); 

		this.jPanelCamposOcultosTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDetaNotaCredito.setName("jPanelCamposOcultosTipoDetaNotaCredito"); 

        this.jPanelAccionesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetaNotaCredito.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDetaNotaCredito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDetaNotaCredito.setText("Nuevo");
		this.jButtonModificarTipoDetaNotaCredito.setText("Editar");
        this.jButtonActualizarTipoDetaNotaCredito.setText("Actualizar");
        this.jButtonEliminarTipoDetaNotaCredito.setText("Eliminar");
        this.jButtonCancelarTipoDetaNotaCredito.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDetaNotaCredito.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setText("Guardar");
		this.jButtonCerrarTipoDetaNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetaNotaCredito,"nuevo_button","Nuevo",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDetaNotaCredito,"modificar_button","Editar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDetaNotaCredito,"actualizar_button","Actualizar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDetaNotaCredito,"eliminar_button","Eliminar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDetaNotaCredito,"cancelar_button","Cancelar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDetaNotaCredito,"guardarcambios_button","Guardar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetaNotaCredito,"guardarcambiostabla_button","Guardar",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetaNotaCredito,"cerrar_button","Salir",this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDetaNotaCredito.setToolTipText("Nuevo"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDetaNotaCredito.setToolTipText("Editar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDetaNotaCredito.setToolTipText("Actualizar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDetaNotaCredito.setToolTipText("Eliminar)"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDetaNotaCredito.setToolTipText("Cancelar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDetaNotaCredito.setToolTipText("Guardar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.setToolTipText("Guardar"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetaNotaCredito.setToolTipText("Salir"+" "+TipoDetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetaNotaCredito";
		inputMap = this.jButtonNuevoTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetaNotaCredito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDetaNotaCredito";
		inputMap = this.jButtonActualizarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDetaNotaCredito"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDetaNotaCredito";
		inputMap = this.jButtonEliminarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDetaNotaCredito"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDetaNotaCredito";
		inputMap = this.jButtonCancelarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDetaNotaCredito"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDetaNotaCredito";
		inputMap = this.jButtonCerrarTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetaNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetaNotaCredito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDetaNotaCredito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDetaNotaCredito.setToolTipText("Nuevo TipoDetaNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito.setToolTipText("Sin Cerrar Ventana TipoDetaNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDetaNotaCredito = new JLabelMe();
		
		this.jLabelAccionesTipoDetaNotaCredito.setText("Acciones");		
		this.jLabelAccionesTipoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDetaNotaCredito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDetaNotaCredito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDetaNotaCredito=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDetaNotaCredito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDetaNotaCredito = new GridBagLayout();
		
		this.jPanelCamposTipoDetaNotaCredito.setLayout(gridaBagLayoutCamposTipoDetaNotaCredito);
		this.jPanelCamposOcultosTipoDetaNotaCredito.setLayout(gridaBagLayoutCamposOcultosTipoDetaNotaCredito);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDetaNotaCredito.add(jLabelIdTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDetaNotaCredito.add(jLabelidTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);


	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDetaNotaCredito.add(jLabelid_empresaTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetaNotaCredito.add(jButtonid_empresaTipoDetaNotaCreditoBusqueda, this.gridBagConstraintsTipoDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetaNotaCredito.add(jButtonid_empresaTipoDetaNotaCreditoUpdate, this.gridBagConstraintsTipoDetaNotaCredito);
	}

	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDetaNotaCredito.add(jComboBoxid_empresaTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);


	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDetaNotaCredito.add(jLabelcodigoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDetaNotaCredito.add(jButtoncodigoTipoDetaNotaCreditoBusqueda, this.gridBagConstraintsTipoDetaNotaCredito);
	}

	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDetaNotaCredito.add(jTextFieldcodigoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);


	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDetaNotaCredito.add(jLabelnombreTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDetaNotaCredito.add(jButtonnombreTipoDetaNotaCreditoBusqueda, this.gridBagConstraintsTipoDetaNotaCredito);
	}

	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDetaNotaCredito.add(jscrollPanenombreTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = iYPanelCamposTipoDetaNotaCredito;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = iXPanelCamposTipoDetaNotaCredito++;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaNotaCredito.add(this.jPanelidTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(iXPanelCamposTipoDetaNotaCredito % 1==0) {
		iXPanelCamposTipoDetaNotaCredito=0;
		iYPanelCamposTipoDetaNotaCredito++;
	}
	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = iYPanelCamposTipoDetaNotaCredito;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = iXPanelCamposTipoDetaNotaCredito++;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaNotaCredito.add(this.jPanelcodigoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(iXPanelCamposTipoDetaNotaCredito % 1==0) {
		iXPanelCamposTipoDetaNotaCredito=0;
		iYPanelCamposTipoDetaNotaCredito++;
	}
	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = iYPanelCamposTipoDetaNotaCredito;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = iXPanelCamposTipoDetaNotaCredito++;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetaNotaCredito.add(this.jPanelnombreTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(iXPanelCamposTipoDetaNotaCredito % 1==0) {
		iXPanelCamposTipoDetaNotaCredito=0;
		iYPanelCamposTipoDetaNotaCredito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetaNotaCredito.gridy = iYPanelCamposOcultosTipoDetaNotaCredito;
	this.gridBagConstraintsTipoDetaNotaCredito.gridx = iXPanelCamposOcultosTipoDetaNotaCredito++;
	this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDetaNotaCredito.add(this.jPanelid_empresaTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);



	if(iXPanelCamposOcultosTipoDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosTipoDetaNotaCredito=0;
		iYPanelCamposOcultosTipoDetaNotaCredito++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesTipoDetaNotaCredito.setLayout(gridaBagLayoutAccionesTipoDetaNotaCredito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDetaNotaCredito.setLayout(gridaBagLayoutAccionesFormularioTipoDetaNotaCredito);
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetaNotaCredito.add(this.jComboBoxTiposAccionesFormularioTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetaNotaCredito.add(this.jCheckBoxPostAccionNuevoTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetaNotaCredito.add(this.jCheckBoxPostAccionSinCerrarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodetanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetaNotaCredito.add(this.jCheckBoxPostAccionSinMensajeTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonModificarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);							

		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonEliminarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonActualizarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);


		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonGuardarCambiosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);	
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDetaNotaCredito.add(this.jButtonCancelarTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetaNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetaNotaCredito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetanotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;		
			//this.gridBagConstraintsTipoDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetaNotaCredito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =0;
		this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetaNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDetaNotaCredito = new TipoDetaNotaCreditoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Detalle Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Detalle Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDetaNotaCreditoModel tipodetanotacreditoModel=new TipoDetaNotaCreditoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDetaNotaCreditoModel.TipoDetaNotaCreditoFocusTraversalPolicy tipodetanotacreditoFocusTraversalPolicy = tipodetanotacreditoModel.new TipoDetaNotaCreditoFocusTraversalPolicy(this);
			
			//tipodetanotacreditoFocusTraversalPolicy.settipodetanotacreditoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodetanotacreditoModel);
			
			
			this.jContentPaneDetalleTipoDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDetaNotaCredito = new GridBagLayout();	
			this.jContentPaneDetalleTipoDetaNotaCredito.setLayout(gridaBagLayoutDetalleTipoDetaNotaCredito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetaNotaCredito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDetaNotaCredito.add(jTtoolBarDetalleTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito=   new JScrollPane(jContentPaneDetalleTipoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	        
			this.jContentPaneDetalleTipoDetaNotaCredito.add(jPanelCamposTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);
			
			
			
			
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
						&& tipodetanotacreditoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipodetanotacreditoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDetaNotaCredito= new GridBagConstraints();
						this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
						this.jContentPaneDetalleTipoDetaNotaCredito.add(this.jTabbedPaneRelacionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDetaNotaCredito.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDetaNotaCredito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
					this.gridBagConstraintsTipoDetaNotaCredito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDetaNotaCredito.add(jPanelCamposOcultosTipoDetaNotaCredito, gridBagConstraintsTipoDetaNotaCredito);
				
					this.jPanelCamposOcultosTipoDetaNotaCredito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	        this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDetaNotaCredito.add(this.jPanelAccionesFormularioTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);							
			
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
	        this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDetaNotaCredito.add(this.jPanelAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDetaNotaCredito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito=   new JScrollPane(this.jPanelCamposTipoDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
			this.gridBagConstraintsTipoDetaNotaCredito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDetaNotaCredito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDetaNotaCredito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);			
			
			this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
			
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		
			
		this.gridBagConstraintsTipoDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetaNotaCredito, this.gridBagConstraintsTipoDetaNotaCredito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDetaNotaCredito;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDetaNotaCredito;
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
