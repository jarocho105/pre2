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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoCargoLaboConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoCargoLaboDetalleFormJInternalFrame extends TipoCargoLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCargoLabo;
	
	protected JMenuBar jmenuBarDetalleTipoCargoLabo;
	
	protected JMenu jmenuDetalleTipoCargoLabo;
	protected JMenu jmenuDetalleArchivoTipoCargoLabo;
	protected JMenu jmenuDetalleAccionesTipoCargoLabo;
	protected JMenu jmenuDetalleDatosTipoCargoLabo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCargoLabo;	
	protected GridBagConstraints gridBagConstraintsTipoCargoLabo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCargoLaboBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCargoLabo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCargoLaboLogic tipocargolaboLogic;
	
	public JScrollPane jScrollPanelDatosTipoCargoLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoCargoLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoCargoLabo;
	
	protected JPanel jPanelCamposTipoCargoLabo;    
	protected JPanel jPanelCamposOcultosTipoCargoLabo;    	
	protected JPanel jPanelAccionesTipoCargoLabo;
	protected JPanel jPanelAccionesFormularioTipoCargoLabo;
    
	
	
	protected Integer iXPanelCamposTipoCargoLabo=0;
	protected Integer iYPanelCamposTipoCargoLabo=0;
	
	protected Integer iXPanelCamposOcultosTipoCargoLabo=0;
	protected Integer iYPanelCamposOcultosTipoCargoLabo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCargoLabo;
	public JButton jButtonModificarTipoCargoLabo;
	public JButton jButtonActualizarTipoCargoLabo;
    public JButton jButtonEliminarTipoCargoLabo;
	public JButton jButtonCancelarTipoCargoLabo;
    public JButton jButtonGuardarCambiosTipoCargoLabo;
	public JButton jButtonGuardarCambiosTablaTipoCargoLabo;
	protected JButton jButtonCerrarTipoCargoLabo;
	
	
	protected JButton jButtonProcesarInformacionTipoCargoLabo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCargoLabo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCargoLabo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCargoLabo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCargoLabo;
	protected JButton jButtonModificarToolBarTipoCargoLabo;
	protected JButton jButtonActualizarToolBarTipoCargoLabo;
    protected JButton jButtonEliminarToolBarTipoCargoLabo;
	protected JButton jButtonCancelarToolBarTipoCargoLabo;
    protected JButton jButtonGuardarCambiosToolBarTipoCargoLabo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCargoLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCargoLabo;
	protected JButton jButtonCerrarToolBarTipoCargoLabo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCargoLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCargoLabo;
	protected JMenuItem jMenuItemModificarTipoCargoLabo;
	protected JMenuItem jMenuItemActualizarTipoCargoLabo;
    protected JMenuItem jMenuItemEliminarTipoCargoLabo;
	protected JMenuItem jMenuItemCancelarTipoCargoLabo;
    protected JMenuItem jMenuItemGuardarCambiosTipoCargoLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCargoLabo;
	protected JMenuItem jMenuItemCerrarTipoCargoLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCargoLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCargoLabo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCargoLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCargoLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCargoLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCargoLabo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCargoLabo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCargoLabo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCargoLabo;
	public JLabel jLabelIdTipoCargoLabo;
	public JLabel jLabelidTipoCargoLabo;
	public JButton jButtonidTipoCargoLaboBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCargoLabo;
	public JLabel jLabelcodigoTipoCargoLabo;
	public JTextField jTextFieldcodigoTipoCargoLabo;
	public JButton jButtoncodigoTipoCargoLaboBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCargoLabo;
	public JLabel jLabelnombreTipoCargoLabo;
	public JTextArea jTextAreanombreTipoCargoLabo;
	public JScrollPane jscrollPanenombreTipoCargoLabo;
	public JButton jButtonnombreTipoCargoLaboBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCargoLabo;
	public JLabel jLabelid_empresaTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCargoLabo;
	public JButton jButtonid_empresaTipoCargoLabo= new JButtonMe();
	public JButton jButtonid_empresaTipoCargoLaboUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCargoLaboBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCargoLabo;
	
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
	
	public TipoCargoLaboDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCargoLabo=new JPanel();
				this.jPanelAccionesFormularioTipoCargoLabo=new JPanel();
				this.jmenuBarDetalleTipoCargoLabo=new JMenuBar();
				this.jTtoolBarDetalleTipoCargoLabo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCargoLaboDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCargoLabo() {
		return this.jButtonActualizarToolBarTipoCargoLabo;
	}
	
	public JButton getjButtonEliminarToolBarTipoCargoLabo() {
		return this.jButtonEliminarToolBarTipoCargoLabo;
	}
	
	public JButton getjButtonCancelarToolBarTipoCargoLabo() {
		return this.jButtonCancelarToolBarTipoCargoLabo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCargoLabo() {
		return this.jButtonProcesarInformacionTipoCargoLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCargoLabo)	{
		this.jButtonProcesarInformacionTipoCargoLabo = jButtonProcesarInformacionTipoCargoLabo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCargoLabo() {
		return this.jComboBoxTiposAccionesTipoCargoLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCargoLabo(
			JComboBox jComboBoxTiposRelacionesTipoCargoLabo) {
		this.jComboBoxTiposRelacionesTipoCargoLabo = jComboBoxTiposRelacionesTipoCargoLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCargoLabo(
			JComboBox jComboBoxTiposAccionesTipoCargoLabo) {
		this.jComboBoxTiposAccionesTipoCargoLabo = jComboBoxTiposAccionesTipoCargoLabo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCargoLabo() {
		return this.jComboBoxTiposAccionesFormularioTipoCargoLabo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCargoLabo(
			JComboBox jComboBoxTiposAccionesFormularioTipoCargoLabo) {
		this.jComboBoxTiposAccionesFormularioTipoCargoLabo = jComboBoxTiposAccionesFormularioTipoCargoLabo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		
		this.tipocargolaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargolaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocargolaboSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCargoLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cargo Laboral MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCargoLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCargoLabo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCargoLabo=new JButtonMe();
				this.jButtonModificarToolBarTipoCargoLabo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo,
							"actualizar","actualizar","Actualizar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo,
							"eliminar","eliminar","Eliminar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo,
							"cancelar","cancelar","Cancelar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCargoLabo,this.jTtoolBarDetalleTipoCargoLabo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCargoLabo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCargoLabo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCargoLabo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCargoLabo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCargoLabo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCargoLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCargoLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCargoLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCargoLabo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCargoLabo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCargoLabo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCargoLabo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCargoLabo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCargoLabo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCargoLabo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCargoLabo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCargoLabo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCargoLabo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCargoLabo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCargoLabo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCargoLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCargoLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCargoLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCargoLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCargoLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCargoLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCargoLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCargoLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCargoLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCargoLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCargoLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCargoLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCargoLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCargoLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCargoLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCargoLabo.add(this.jMenuItemDetalleCerrarTipoCargoLabo);
		
		this.jmenuDetalleAccionesTipoCargoLabo.add(this.jMenuItemActualizarTipoCargoLabo);
		this.jmenuDetalleAccionesTipoCargoLabo.add(this.jMenuItemEliminarTipoCargoLabo);
		this.jmenuDetalleAccionesTipoCargoLabo.add(this.jMenuItemCancelarTipoCargoLabo);		
		
		//this.jmenuDetalleDatosTipoCargoLabo.add(this.jMenuItemDetalleAbrirOrderByTipoCargoLabo);				
		this.jmenuDetalleDatosTipoCargoLabo.add(this.jMenuItemDetalleMostarOcultarTipoCargoLabo);				
				
		//this.jmenuDetalleAccionesTipoCargoLabo.add(this.jMenuItemGuardarCambiosTipoCargoLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCargoLabo.add(this.jmenuDetalleArchivoTipoCargoLabo);		
		this.jmenuBarDetalleTipoCargoLabo.add(this.jmenuDetalleAccionesTipoCargoLabo);		
		this.jmenuBarDetalleTipoCargoLabo.add(this.jmenuDetalleDatosTipoCargoLabo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCargoLabo.add(this.jmenuDetalleTipoCargoLabo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCargoLabo);				
	}
	
	
	public void inicializarElementosCamposTipoCargoLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCargoLabo = new JLabelMe();
		jLabelIdTipoCargoLabo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCargoLabo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCargoLabo.setToolTipText(TipoCargoLaboConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCargoLabo= new GridBagLayout();

		this.jPanelidTipoCargoLabo.setLayout(this.gridaBagLayoutTipoCargoLabo);

		jLabelidTipoCargoLabo = new JLabel();
		jLabelidTipoCargoLabo.setText("Id");

		jLabelidTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCargoLabo = new JLabelMe();
		this.jLabelcodigoTipoCargoLabo.setText(""+TipoCargoLaboConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCargoLabo.setToolTipText("Codigo");
		this.jLabelcodigoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCargoLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCargoLabo.setToolTipText(TipoCargoLaboConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCargoLabo = new GridBagLayout();
		this.jPanelcodigoTipoCargoLabo.setLayout(this.gridaBagLayoutTipoCargoLabo);


		jTextFieldcodigoTipoCargoLabo= new JTextFieldMe();

		jTextFieldcodigoTipoCargoLabo.setEnabled(false);
		jTextFieldcodigoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCargoLaboBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCargoLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCargoLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCargoLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCargoLaboBusqueda.setText("U");
		this.jButtoncodigoTipoCargoLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCargoLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCargoLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCargoLaboBusqueda"));

		if(this.tipocargolaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCargoLaboBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCargoLabo = new JLabelMe();
		this.jLabelnombreTipoCargoLabo.setText(""+TipoCargoLaboConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCargoLabo.setToolTipText("Nombre");
		this.jLabelnombreTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCargoLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCargoLabo.setToolTipText(TipoCargoLaboConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCargoLabo = new GridBagLayout();
		this.jPanelnombreTipoCargoLabo.setLayout(this.gridaBagLayoutTipoCargoLabo);


		jTextAreanombreTipoCargoLabo= new JTextAreaMe();
		jTextAreanombreTipoCargoLabo.setEnabled(false);
		jTextAreanombreTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCargoLabo.setLineWrap(true);
		jTextAreanombreTipoCargoLabo.setWrapStyleWord(true);
		jTextAreanombreTipoCargoLabo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCargoLabo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCargoLabo = new JScrollPane(jTextAreanombreTipoCargoLabo);
		jscrollPanenombreTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCargoLaboBusqueda= new JButtonMe();
		this.jButtonnombreTipoCargoLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCargoLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCargoLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCargoLaboBusqueda.setText("U");
		this.jButtonnombreTipoCargoLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCargoLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCargoLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCargoLaboBusqueda"));

		if(this.tipocargolaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCargoLaboBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCargoLabo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCargoLabo = new JLabelMe();
		this.jLabelid_empresaTipoCargoLabo.setText(""+TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCargoLabo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCargoLabo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCargoLabo.setToolTipText(TipoCargoLaboConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCargoLabo = new GridBagLayout();
		this.jPanelid_empresaTipoCargoLabo.setLayout(this.gridaBagLayoutTipoCargoLabo);


		jComboBoxid_empresaTipoCargoLabo= new JComboBoxMe();
		jComboBoxid_empresaTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCargoLabo.setEnabled(false);

		this.jButtonid_empresaTipoCargoLabo= new JButtonMe();
		this.jButtonid_empresaTipoCargoLabo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCargoLabo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCargoLabo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCargoLabo.setText("Buscar");
		this.jButtonid_empresaTipoCargoLabo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCargoLabo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCargoLabo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCargoLabo"));

		this.jButtonid_empresaTipoCargoLaboBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCargoLaboBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCargoLaboBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCargoLaboBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCargoLaboBusqueda.setText("U");
		this.jButtonid_empresaTipoCargoLaboBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCargoLaboBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCargoLaboBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCargoLaboBusqueda"));

		if(this.tipocargolaboSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCargoLaboBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCargoLaboUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCargoLaboUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCargoLaboUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCargoLaboUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCargoLaboUpdate.setText("U");
		this.jButtonid_empresaTipoCargoLaboUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCargoLaboUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCargoLaboUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCargoLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCargoLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCargoLaboUpdate"));



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
		//this.jInternalFrameDetalleTipoCargoLabo = new TipoCargoLaboBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cargo Laboral DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCargoLabo= new GridBagLayout();
		

		
		String sToolTipTipoCargoLabo="";
		sToolTipTipoCargoLabo=TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCargoLabo+="(Cartera.TipoCargoLabo)";
		}
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCargoLabo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCargoLabo = new JButtonMe();
		this.jButtonModificarTipoCargoLabo = new JButtonMe();
        this.jButtonActualizarTipoCargoLabo = new JButtonMe();
        this.jButtonEliminarTipoCargoLabo = new JButtonMe();
        this.jButtonCancelarTipoCargoLabo = new JButtonMe();
        this.jButtonGuardarCambiosTipoCargoLabo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCargoLabo = new JButtonMe();
		this.jButtonCerrarTipoCargoLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCargoLabo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCargoLabo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCargoLabo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cargo Laboral";
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCargoLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCargoLabo.setName("jPanelCamposTipoCargoLabo"); 

		this.jPanelCamposOcultosTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCargoLabo.setName("jPanelCamposOcultosTipoCargoLabo"); 

        this.jPanelAccionesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCargoLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCargoLabo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCargoLabo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCargoLabo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCargoLabo.setText("Nuevo");
		this.jButtonModificarTipoCargoLabo.setText("Editar");
        this.jButtonActualizarTipoCargoLabo.setText("Actualizar");
        this.jButtonEliminarTipoCargoLabo.setText("Eliminar");
        this.jButtonCancelarTipoCargoLabo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCargoLabo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCargoLabo.setText("Guardar");
		this.jButtonCerrarTipoCargoLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCargoLabo,"nuevo_button","Nuevo",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCargoLabo,"modificar_button","Editar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCargoLabo,"actualizar_button","Actualizar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCargoLabo,"eliminar_button","Eliminar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCargoLabo,"cancelar_button","Cancelar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCargoLabo,"guardarcambios_button","Guardar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCargoLabo,"guardarcambiostabla_button","Guardar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCargoLabo,"cerrar_button","Salir",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCargoLabo.setToolTipText("Nuevo"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCargoLabo.setToolTipText("Editar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCargoLabo.setToolTipText("Actualizar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCargoLabo.setToolTipText("Eliminar)"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCargoLabo.setToolTipText("Cancelar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCargoLabo.setToolTipText("Guardar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCargoLabo.setToolTipText("Guardar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCargoLabo.setToolTipText("Salir"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCargoLabo";
		inputMap = this.jButtonNuevoTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCargoLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCargoLabo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCargoLabo";
		inputMap = this.jButtonActualizarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCargoLabo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCargoLabo";
		inputMap = this.jButtonEliminarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCargoLabo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCargoLabo";
		inputMap = this.jButtonCancelarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCargoLabo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCargoLabo";
		inputMap = this.jButtonCerrarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCargoLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCargoLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCargoLabo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCargoLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCargoLabo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCargoLabo.setToolTipText("Nuevo TipoCargoLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCargoLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCargoLabo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCargoLabo.setToolTipText("Sin Cerrar Ventana TipoCargoLabo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCargoLabo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCargoLabo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCargoLabo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCargoLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCargoLabo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCargoLabo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCargoLabo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCargoLabo = new JLabelMe();
		
		this.jLabelAccionesTipoCargoLabo.setText("Acciones");		
		this.jLabelAccionesTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCargoLabo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCargoLabo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCargoLabo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCargoLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargoLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargoLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCargoLabo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCargoLabo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCargoLabo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCargoLabo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCargoLabo = new GridBagLayout();
		
		this.jPanelCamposTipoCargoLabo.setLayout(gridaBagLayoutCamposTipoCargoLabo);
		this.jPanelCamposOcultosTipoCargoLabo.setLayout(gridaBagLayoutCamposOcultosTipoCargoLabo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCargoLabo.add(jLabelIdTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 1;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCargoLabo.add(jLabelidTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);


	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCargoLabo.add(jLabelid_empresaTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = 2;
		this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
		this.gridBagConstraintsTipoCargoLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCargoLabo.add(jButtonid_empresaTipoCargoLaboBusqueda, this.gridBagConstraintsTipoCargoLabo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = 3;
		this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
		this.gridBagConstraintsTipoCargoLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCargoLabo.add(jButtonid_empresaTipoCargoLaboUpdate, this.gridBagConstraintsTipoCargoLabo);
	}

	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 1;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCargoLabo.add(jComboBoxid_empresaTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);


	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCargoLabo.add(jLabelcodigoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = 2;
		this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
		this.gridBagConstraintsTipoCargoLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCargoLabo.add(jButtoncodigoTipoCargoLaboBusqueda, this.gridBagConstraintsTipoCargoLabo);
	}

	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 1;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCargoLabo.add(jTextFieldcodigoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);


	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCargoLabo.add(jLabelnombreTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = 2;
		this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
		this.gridBagConstraintsTipoCargoLabo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCargoLabo.add(jButtonnombreTipoCargoLaboBusqueda, this.gridBagConstraintsTipoCargoLabo);
	}

	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCargoLabo.gridy = 0;
	this.gridBagConstraintsTipoCargoLabo.gridx = 1;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCargoLabo.add(jscrollPanenombreTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargoLabo.gridy = iYPanelCamposTipoCargoLabo;
	this.gridBagConstraintsTipoCargoLabo.gridx = iXPanelCamposTipoCargoLabo++;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargoLabo.add(this.jPanelidTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(iXPanelCamposTipoCargoLabo % 1==0) {
		iXPanelCamposTipoCargoLabo=0;
		iYPanelCamposTipoCargoLabo++;
	}
	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargoLabo.gridy = iYPanelCamposTipoCargoLabo;
	this.gridBagConstraintsTipoCargoLabo.gridx = iXPanelCamposTipoCargoLabo++;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargoLabo.add(this.jPanelcodigoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(iXPanelCamposTipoCargoLabo % 1==0) {
		iXPanelCamposTipoCargoLabo=0;
		iYPanelCamposTipoCargoLabo++;
	}
	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargoLabo.gridy = iYPanelCamposTipoCargoLabo;
	this.gridBagConstraintsTipoCargoLabo.gridx = iXPanelCamposTipoCargoLabo++;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCargoLabo.add(this.jPanelnombreTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(iXPanelCamposTipoCargoLabo % 1==0) {
		iXPanelCamposTipoCargoLabo=0;
		iYPanelCamposTipoCargoLabo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCargoLabo.gridy = iYPanelCamposOcultosTipoCargoLabo;
	this.gridBagConstraintsTipoCargoLabo.gridx = iXPanelCamposOcultosTipoCargoLabo++;
	this.gridBagConstraintsTipoCargoLabo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCargoLabo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCargoLabo.add(this.jPanelid_empresaTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);



	if(iXPanelCamposOcultosTipoCargoLabo % 1==0) {
		iXPanelCamposOcultosTipoCargoLabo=0;
		iYPanelCamposOcultosTipoCargoLabo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCargoLabo= new GridBagLayout();
		this.jPanelAccionesTipoCargoLabo.setLayout(gridaBagLayoutAccionesTipoCargoLabo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCargoLabo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCargoLabo.setLayout(gridaBagLayoutAccionesFormularioTipoCargoLabo);
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCargoLabo.add(this.jComboBoxTiposAccionesFormularioTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCargoLabo.add(this.jCheckBoxPostAccionNuevoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCargoLabo.add(this.jCheckBoxPostAccionSinCerrarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocargolaboSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCargoLabo.add(this.jCheckBoxPostAccionSinMensajeTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonModificarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);							

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonEliminarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonActualizarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);


		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonGuardarCambiosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);	
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;		
		this.gridBagConstraintsTipoCargoLabo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonCancelarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCargoLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCargoLabo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;		
			//this.gridBagConstraintsTipoCargoLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCargoLabo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCargoLabo.gridx =0;
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCargoLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCargoLabo = new TipoCargoLaboBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cargo Laboral DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cargo Laboral DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cargo Laboral Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCargoLaboModel tipocargolaboModel=new TipoCargoLaboModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCargoLaboModel.TipoCargoLaboFocusTraversalPolicy tipocargolaboFocusTraversalPolicy = tipocargolaboModel.new TipoCargoLaboFocusTraversalPolicy(this);
			
			//tipocargolaboFocusTraversalPolicy.settipocargolaboJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocargolaboModel);
			
			
			this.jContentPaneDetalleTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCargoLabo = new GridBagLayout();	
			this.jContentPaneDetalleTipoCargoLabo.setLayout(gridaBagLayoutDetalleTipoCargoLabo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCargoLabo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCargoLabo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCargoLabo.add(jTtoolBarDetalleTipoCargoLabo, gridBagConstraintsTipoCargoLabo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCargoLabo=   new JScrollPane(jContentPaneDetalleTipoCargoLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCargoLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargoLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargoLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCargoLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCargoLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargoLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargoLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	        
			this.jContentPaneDetalleTipoCargoLabo.add(jPanelCamposTipoCargoLabo, gridBagConstraintsTipoCargoLabo);
			
			
			
			
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
						&& tipocargolaboSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					
					if(this.tipocargolaboSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCargoLabo= new GridBagConstraints();
						this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCargoLabo.gridx = 0;
						this.jContentPaneDetalleTipoCargoLabo.add(this.jTabbedPaneRelacionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCargoLabo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCargoLabo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
					this.gridBagConstraintsTipoCargoLabo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCargoLabo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCargoLabo.add(jPanelCamposOcultosTipoCargoLabo, gridBagConstraintsTipoCargoLabo);
				
					this.jPanelCamposOcultosTipoCargoLabo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	        this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCargoLabo.add(this.jPanelAccionesFormularioTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);							
			
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
	        this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCargoLabo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCargoLabo.add(this.jPanelAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCargoLabo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCargoLabo=   new JScrollPane(this.jPanelCamposTipoCargoLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCargoLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargoLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCargoLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCargoLabo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCargoLabo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCargoLabo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
				//this.gridBagConstraintsTipoCargoLabo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCargoLabo.gridx = 0;
				//this.jContentPaneDetalleTipoCargoLabo.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCargoLabo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCargoLabo.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCargoLabo.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoCargoLabo.add("Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TipoCargoLabo> tipocargolabos,TipoCargoLabo tipocargolabo,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipocargolaboLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipocargolabosForeignKey(tipocargolabos);
					clienteBeanSwingJInternalFrame.settipocargolaboForeignKey(tipocargolabo);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargoLabo(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoCargoLaboActual(tipocargolabo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCargoLabo(true);
					clienteBeanSwingJInternalFrame.setid_tipo_cargo_laboFK_IdTipoCargoLabo(tipocargolabo.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCargoLaboForeignKey(tipocargolabo,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCargoLabo");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCargoLabo");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

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
