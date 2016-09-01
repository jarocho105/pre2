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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoNotaCreditoSoliConstantesFunciones;

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
public class TipoNotaCreditoSoliDetalleFormJInternalFrame extends TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoNotaCreditoSoli;
	
	protected JMenuBar jmenuBarDetalleTipoNotaCreditoSoli;
	
	protected JMenu jmenuDetalleTipoNotaCreditoSoli;
	protected JMenu jmenuDetalleArchivoTipoNotaCreditoSoli;
	protected JMenu jmenuDetalleAccionesTipoNotaCreditoSoli;
	protected JMenu jmenuDetalleDatosTipoNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsTipoNotaCreditoSoli;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoNotaCreditoSoli;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean;
	
	

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
	
		
	
	public TipoNotaCreditoSoliLogic tiponotacreditosoliLogic;
	
	public JScrollPane jScrollPanelDatosTipoNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionTipoNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralTipoNotaCreditoSoli;
	
	protected JPanel jPanelCamposTipoNotaCreditoSoli;    
	protected JPanel jPanelCamposOcultosTipoNotaCreditoSoli;    	
	protected JPanel jPanelAccionesTipoNotaCreditoSoli;
	protected JPanel jPanelAccionesFormularioTipoNotaCreditoSoli;
    
	
	
	protected Integer iXPanelCamposTipoNotaCreditoSoli=0;
	protected Integer iYPanelCamposTipoNotaCreditoSoli=0;
	
	protected Integer iXPanelCamposOcultosTipoNotaCreditoSoli=0;
	protected Integer iYPanelCamposOcultosTipoNotaCreditoSoli=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoNotaCreditoSoli;
	public JButton jButtonModificarTipoNotaCreditoSoli;
	public JButton jButtonActualizarTipoNotaCreditoSoli;
    public JButton jButtonEliminarTipoNotaCreditoSoli;
	public JButton jButtonCancelarTipoNotaCreditoSoli;
    public JButton jButtonGuardarCambiosTipoNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaTipoNotaCreditoSoli;
	protected JButton jButtonCerrarTipoNotaCreditoSoli;
	
	
	protected JButton jButtonProcesarInformacionTipoNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNotaCreditoSoli;
	protected JButton jButtonModificarToolBarTipoNotaCreditoSoli;
	protected JButton jButtonActualizarToolBarTipoNotaCreditoSoli;
    protected JButton jButtonEliminarToolBarTipoNotaCreditoSoli;
	protected JButton jButtonCancelarToolBarTipoNotaCreditoSoli;
    protected JButton jButtonGuardarCambiosToolBarTipoNotaCreditoSoli;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarTipoNotaCreditoSoli;
	
	protected JButton jButtonProcesarInformacionToolBarTipoNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemModificarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemActualizarTipoNotaCreditoSoli;
    protected JMenuItem jMenuItemEliminarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemCancelarTipoNotaCreditoSoli;
    protected JMenuItem jMenuItemGuardarCambiosTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarTipoNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNotaCreditoSoli;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNotaCreditoSoli;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoNotaCreditoSoli;
	public JLabel jLabelIdTipoNotaCreditoSoli;
	public JTextFieldMe jTextFieldidTipoNotaCreditoSoli;
	public JButton jButtonidTipoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoNotaCreditoSoli;
	public JLabel jLabelcodigoTipoNotaCreditoSoli;
	public JTextField jTextFieldcodigoTipoNotaCreditoSoli;
	public JButton jButtoncodigoTipoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoNotaCreditoSoli;
	public JLabel jLabelnombreTipoNotaCreditoSoli;
	public JTextArea jTextAreanombreTipoNotaCreditoSoli;
	public JScrollPane jscrollPanenombreTipoNotaCreditoSoli;
	public JButton jButtonnombreTipoNotaCreditoSoliBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoNotaCreditoSoli;
	
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
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoNotaCreditoSoli=new JPanel();
				this.jPanelAccionesFormularioTipoNotaCreditoSoli=new JPanel();
				this.jmenuBarDetalleTipoNotaCreditoSoli=new JMenuBar();
				this.jTtoolBarDetalleTipoNotaCreditoSoli=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoNotaCreditoSoliDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoNotaCreditoSoli() {
		return this.jButtonActualizarToolBarTipoNotaCreditoSoli;
	}
	
	public JButton getjButtonEliminarToolBarTipoNotaCreditoSoli() {
		return this.jButtonEliminarToolBarTipoNotaCreditoSoli;
	}
	
	public JButton getjButtonCancelarToolBarTipoNotaCreditoSoli() {
		return this.jButtonCancelarToolBarTipoNotaCreditoSoli;
	}		
	
	public JButton getjButtonProcesarInformacionTipoNotaCreditoSoli() {
		return this.jButtonProcesarInformacionTipoNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNotaCreditoSoli)	{
		this.jButtonProcesarInformacionTipoNotaCreditoSoli = jButtonProcesarInformacionTipoNotaCreditoSoli;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesTipoNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesTipoNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli = jComboBoxTiposRelacionesTipoNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesTipoNotaCreditoSoli) {
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli = jComboBoxTiposAccionesTipoNotaCreditoSoli;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli) {
		this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli = jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		
		this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Solicitud Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoNotaCreditoSoli= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoNotaCreditoSoli=new JButtonMe();
				this.jButtonModificarToolBarTipoNotaCreditoSoli=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli,
							"actualizar","actualizar","Actualizar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli,
							"eliminar","eliminar","Eliminar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli,
							"cancelar","cancelar","Cancelar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoNotaCreditoSoli,this.jTtoolBarDetalleTipoNotaCreditoSoli,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoNotaCreditoSoli=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoNotaCreditoSoli=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoNotaCreditoSoli=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoNotaCreditoSoli= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoNotaCreditoSoli.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoNotaCreditoSoli,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoNotaCreditoSoli= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoNotaCreditoSoli.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoNotaCreditoSoli,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoNotaCreditoSoli= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoNotaCreditoSoli.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoNotaCreditoSoli,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoNotaCreditoSoli= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoNotaCreditoSoli.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoNotaCreditoSoli,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoNotaCreditoSoli.add(this.jMenuItemDetalleCerrarTipoNotaCreditoSoli);
		
		this.jmenuDetalleAccionesTipoNotaCreditoSoli.add(this.jMenuItemActualizarTipoNotaCreditoSoli);
		this.jmenuDetalleAccionesTipoNotaCreditoSoli.add(this.jMenuItemEliminarTipoNotaCreditoSoli);
		this.jmenuDetalleAccionesTipoNotaCreditoSoli.add(this.jMenuItemCancelarTipoNotaCreditoSoli);		
		
		//this.jmenuDetalleDatosTipoNotaCreditoSoli.add(this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli);				
		this.jmenuDetalleDatosTipoNotaCreditoSoli.add(this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli);				
				
		//this.jmenuDetalleAccionesTipoNotaCreditoSoli.add(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoNotaCreditoSoli.add(this.jmenuDetalleArchivoTipoNotaCreditoSoli);		
		this.jmenuBarDetalleTipoNotaCreditoSoli.add(this.jmenuDetalleAccionesTipoNotaCreditoSoli);		
		this.jmenuBarDetalleTipoNotaCreditoSoli.add(this.jmenuDetalleDatosTipoNotaCreditoSoli);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoNotaCreditoSoli.add(this.jmenuDetalleTipoNotaCreditoSoli);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoNotaCreditoSoli);				
	}
	
	
	public void inicializarElementosCamposTipoNotaCreditoSoli() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoNotaCreditoSoli = new JLabelMe();
		jLabelIdTipoNotaCreditoSoli.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoNotaCreditoSoli = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoNotaCreditoSoli.setToolTipText(TipoNotaCreditoSoliConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoNotaCreditoSoli= new GridBagLayout();

		this.jPanelidTipoNotaCreditoSoli.setLayout(this.gridaBagLayoutTipoNotaCreditoSoli);

		jTextFieldidTipoNotaCreditoSoli = new JTextFieldMe();
		jTextFieldidTipoNotaCreditoSoli.setText("Id");

		jTextFieldidTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoNotaCreditoSoli = new JLabelMe();
		this.jLabelcodigoTipoNotaCreditoSoli.setText(""+TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoNotaCreditoSoli.setToolTipText("Codigo");
		this.jLabelcodigoTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoNotaCreditoSoli.setToolTipText(TipoNotaCreditoSoliConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoNotaCreditoSoli = new GridBagLayout();
		this.jPanelcodigoTipoNotaCreditoSoli.setLayout(this.gridaBagLayoutTipoNotaCreditoSoli);


		jTextFieldcodigoTipoNotaCreditoSoli= new JTextFieldMe();

		jTextFieldcodigoTipoNotaCreditoSoli.setEnabled(false);
		jTextFieldcodigoTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoNotaCreditoSoliBusqueda"));

		if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoNotaCreditoSoli = new JLabelMe();
		this.jLabelnombreTipoNotaCreditoSoli.setText(""+TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoNotaCreditoSoli.setToolTipText("Nombre");
		this.jLabelnombreTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoNotaCreditoSoli.setToolTipText(TipoNotaCreditoSoliConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoNotaCreditoSoli = new GridBagLayout();
		this.jPanelnombreTipoNotaCreditoSoli.setLayout(this.gridaBagLayoutTipoNotaCreditoSoli);


		jTextAreanombreTipoNotaCreditoSoli= new JTextAreaMe();
		jTextAreanombreTipoNotaCreditoSoli.setEnabled(false);
		jTextAreanombreTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNotaCreditoSoli.setLineWrap(true);
		jTextAreanombreTipoNotaCreditoSoli.setWrapStyleWord(true);
		jTextAreanombreTipoNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoNotaCreditoSoli.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoNotaCreditoSoli = new JScrollPane(jTextAreanombreTipoNotaCreditoSoli);
		jscrollPanenombreTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoNotaCreditoSoliBusqueda"));

		if(this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoNotaCreditoSoliBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoNotaCreditoSoli() {
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
		//this.jInternalFrameDetalleTipoNotaCreditoSoli = new TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Solicitud Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNotaCreditoSoli= new GridBagLayout();
		

		
		String sToolTipTipoNotaCreditoSoli="";
		sToolTipTipoNotaCreditoSoli=TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNotaCreditoSoli+="(Facturacion.TipoNotaCreditoSoli)";
		}
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonModificarTipoNotaCreditoSoli = new JButtonMe();
        this.jButtonActualizarTipoNotaCreditoSoli = new JButtonMe();
        this.jButtonEliminarTipoNotaCreditoSoli = new JButtonMe();
        this.jButtonCancelarTipoNotaCreditoSoli = new JButtonMe();
        this.jButtonGuardarCambiosTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarTipoNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosTipoNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoNotaCreditoSoli = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoNotaCreditoSoli = new JScrollPane();
				
		
		
		this.jPanelCamposTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Solicitud Nota Credito";
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoNotaCreditoSoli.setName("jPanelCamposTipoNotaCreditoSoli"); 

		this.jPanelCamposOcultosTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoNotaCreditoSoli.setName("jPanelCamposOcultosTipoNotaCreditoSoli"); 

        this.jPanelAccionesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesTipoNotaCreditoSoli.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoNotaCreditoSoli.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoNotaCreditoSoli.setText("Nuevo");
		this.jButtonModificarTipoNotaCreditoSoli.setText("Editar");
        this.jButtonActualizarTipoNotaCreditoSoli.setText("Actualizar");
        this.jButtonEliminarTipoNotaCreditoSoli.setText("Eliminar");
        this.jButtonCancelarTipoNotaCreditoSoli.setText("Cancelar");
        this.jButtonGuardarCambiosTipoNotaCreditoSoli.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarTipoNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNotaCreditoSoli,"nuevo_button","Nuevo",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoNotaCreditoSoli,"modificar_button","Editar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoNotaCreditoSoli,"actualizar_button","Actualizar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoNotaCreditoSoli,"eliminar_button","Eliminar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoNotaCreditoSoli,"cancelar_button","Cancelar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoNotaCreditoSoli,"guardarcambios_button","Guardar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNotaCreditoSoli,"cerrar_button","Salir",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoNotaCreditoSoli.setToolTipText("Nuevo"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoNotaCreditoSoli.setToolTipText("Editar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoNotaCreditoSoli.setToolTipText("Actualizar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoNotaCreditoSoli.setToolTipText("Eliminar)"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoNotaCreditoSoli.setToolTipText("Cancelar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoNotaCreditoSoli.setToolTipText("Guardar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setToolTipText("Guardar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNotaCreditoSoli.setToolTipText("Salir"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNotaCreditoSoli"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoNotaCreditoSoli";
		inputMap = this.jButtonActualizarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoNotaCreditoSoli"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoNotaCreditoSoli";
		inputMap = this.jButtonEliminarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoNotaCreditoSoli"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoNotaCreditoSoli";
		inputMap = this.jButtonCancelarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoNotaCreditoSoli"));
		
		//CERRAR		
		sMapKey = "CerrarTipoNotaCreditoSoli";
		inputMap = this.jButtonCerrarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNotaCreditoSoli"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli.setToolTipText("Nuevo TipoNotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli.setToolTipText("Sin Cerrar Ventana TipoNotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesTipoNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoNotaCreditoSoli();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoNotaCreditoSoli();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoNotaCreditoSoli=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoNotaCreditoSoli = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoNotaCreditoSoli = new GridBagLayout();
		
		this.jPanelCamposTipoNotaCreditoSoli.setLayout(gridaBagLayoutCamposTipoNotaCreditoSoli);
		this.jPanelCamposOcultosTipoNotaCreditoSoli.setLayout(gridaBagLayoutCamposOcultosTipoNotaCreditoSoli);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoNotaCreditoSoli.add(jLabelIdTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoNotaCreditoSoli.add(jTextFieldidTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);


	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoNotaCreditoSoli.add(jLabelcodigoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoNotaCreditoSoli.add(jButtoncodigoTipoNotaCreditoSoliBusqueda, this.gridBagConstraintsTipoNotaCreditoSoli);
	}

	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoNotaCreditoSoli.add(jTextFieldcodigoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);


	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoNotaCreditoSoli.add(jLabelnombreTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoNotaCreditoSoli.add(jButtonnombreTipoNotaCreditoSoliBusqueda, this.gridBagConstraintsTipoNotaCreditoSoli);
	}

	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoNotaCreditoSoli.add(jscrollPanenombreTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iYPanelCamposTipoNotaCreditoSoli;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iXPanelCamposTipoNotaCreditoSoli++;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNotaCreditoSoli.add(this.jPanelidTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	if(iXPanelCamposTipoNotaCreditoSoli % 1==0) {
		iXPanelCamposTipoNotaCreditoSoli=0;
		iYPanelCamposTipoNotaCreditoSoli++;
	}
	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iYPanelCamposTipoNotaCreditoSoli;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iXPanelCamposTipoNotaCreditoSoli++;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNotaCreditoSoli.add(this.jPanelcodigoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	if(iXPanelCamposTipoNotaCreditoSoli % 1==0) {
		iXPanelCamposTipoNotaCreditoSoli=0;
		iYPanelCamposTipoNotaCreditoSoli++;
	}
	this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iYPanelCamposTipoNotaCreditoSoli;
	this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iXPanelCamposTipoNotaCreditoSoli++;
	this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNotaCreditoSoli.add(this.jPanelnombreTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);



	if(iXPanelCamposTipoNotaCreditoSoli % 1==0) {
		iXPanelCamposTipoNotaCreditoSoli=0;
		iYPanelCamposTipoNotaCreditoSoli++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesTipoNotaCreditoSoli.setLayout(gridaBagLayoutAccionesTipoNotaCreditoSoli);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesFormularioTipoNotaCreditoSoli.setLayout(gridaBagLayoutAccionesFormularioTipoNotaCreditoSoli);
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNotaCreditoSoli.add(this.jComboBoxTiposAccionesFormularioTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);

		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNotaCreditoSoli.add(this.jCheckBoxPostAccionNuevoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNotaCreditoSoli.add(this.jCheckBoxPostAccionSinCerrarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiponotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNotaCreditoSoli.add(this.jCheckBoxPostAccionSinMensajeTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonModificarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);							

		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonEliminarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonActualizarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);


		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonGuardarCambiosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);	
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonCancelarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNotaCreditoSoli);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsTipoNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoNotaCreditoSoli = new TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Solicitud Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Solicitud Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Solicitud Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoNotaCreditoSoliModel tiponotacreditosoliModel=new TipoNotaCreditoSoliModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoNotaCreditoSoliModel.TipoNotaCreditoSoliFocusTraversalPolicy tiponotacreditosoliFocusTraversalPolicy = tiponotacreditosoliModel.new TipoNotaCreditoSoliFocusTraversalPolicy(this);
			
			//tiponotacreditosoliFocusTraversalPolicy.settiponotacreditosoliJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiponotacreditosoliModel);
			
			
			this.jContentPaneDetalleTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoNotaCreditoSoli = new GridBagLayout();	
			this.jContentPaneDetalleTipoNotaCreditoSoli.setLayout(gridaBagLayoutDetalleTipoNotaCreditoSoli);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNotaCreditoSoli = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
					
				
				this.jContentPaneDetalleTipoNotaCreditoSoli.add(jTtoolBarDetalleTipoNotaCreditoSoli, gridBagConstraintsTipoNotaCreditoSoli);								
				
}
			
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli=   new JScrollPane(jContentPaneDetalleTipoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	        
			this.jContentPaneDetalleTipoNotaCreditoSoli.add(jPanelCamposTipoNotaCreditoSoli, gridBagConstraintsTipoNotaCreditoSoli);
			
			
			
			
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
						&& tiponotacreditosoliSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					
					if(this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoNotaCreditoSoli= new GridBagConstraints();
						this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
						this.jContentPaneDetalleTipoNotaCreditoSoli.add(this.jTabbedPaneRelacionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoNotaCreditoSoli.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoNotaCreditoSoli.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
					this.gridBagConstraintsTipoNotaCreditoSoli.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
					
				
					this.jContentPaneDetalleTipoNotaCreditoSoli.add(jPanelCamposOcultosTipoNotaCreditoSoli, gridBagConstraintsTipoNotaCreditoSoli);
				
					this.jPanelCamposOcultosTipoNotaCreditoSoli.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	        this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoNotaCreditoSoli.add(this.jPanelAccionesFormularioTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);							
			
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
	        this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoNotaCreditoSoli.add(this.jPanelAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoNotaCreditoSoli);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli=   new JScrollPane(this.jPanelCamposTipoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoNotaCreditoSoli.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoNotaCreditoSoli;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoNotaCreditoSoli;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		this.notacreditosoliSessionBean.setConGuardarRelaciones(true);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
				//this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
				//this.jContentPaneDetalleTipoNotaCreditoSoli.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoNotaCreditoSoli);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoNotaCreditoSoli.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesTipoNotaCreditoSoli.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<TipoNotaCreditoSoli> tiponotacreditosolis,TipoNotaCreditoSoli tiponotacreditosoli,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.tiponotacreditosoliLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.settiponotacreditosolisForeignKey(tiponotacreditosolis);
					notacreditosoliBeanSwingJInternalFrame.settiponotacreditosoliForeignKey(tiponotacreditosoli);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionTipoNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidTipoNotaCreditoSoliActual(tiponotacreditosoli.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.setid_tipo_nota_credito_soliFK_IdTipoNotaCreditoSoli(tiponotacreditosoli.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoNotaCreditoSoliForeignKey(tiponotacreditosoli,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoNotaCreditoSoli");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoNotaCreditoSoli");
					notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoSoli("n",notacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("relacionado");
					} else {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");
					}

					notacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoSoli().setVisible(false);

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
