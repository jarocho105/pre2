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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.ParametroFacturacionDefectoConstantesFunciones;

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
public class ParametroFacturacionDefectoDetalleFormJInternalFrame extends ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFacturacionDefecto;
	
	protected JMenuBar jmenuBarDetalleParametroFacturacionDefecto;
	
	protected JMenu jmenuDetalleParametroFacturacionDefecto;
	protected JMenu jmenuDetalleArchivoParametroFacturacionDefecto;
	protected JMenu jmenuDetalleAccionesParametroFacturacionDefecto;
	protected JMenu jmenuDetalleDatosParametroFacturacionDefecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFacturacionDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroFacturacionDefecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFacturacionDefecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";
	
	public ParametroFacturacionDefectoSessionBean parametrofacturaciondefectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;	
	
	public ParametroFacturacionDefectoLogic parametrofacturaciondefectoLogic;
	
	public JScrollPane jScrollPanelDatosParametroFacturacionDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroFacturacionDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroFacturacionDefecto;
	
	protected JPanel jPanelCamposParametroFacturacionDefecto;    
	protected JPanel jPanelCamposOcultosParametroFacturacionDefecto;    	
	protected JPanel jPanelAccionesParametroFacturacionDefecto;
	protected JPanel jPanelAccionesFormularioParametroFacturacionDefecto;
    
	
	
	protected Integer iXPanelCamposParametroFacturacionDefecto=0;
	protected Integer iYPanelCamposParametroFacturacionDefecto=0;
	
	protected Integer iXPanelCamposOcultosParametroFacturacionDefecto=0;
	protected Integer iYPanelCamposOcultosParametroFacturacionDefecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFacturacionDefecto;
	public JButton jButtonModificarParametroFacturacionDefecto;
	public JButton jButtonActualizarParametroFacturacionDefecto;
    public JButton jButtonEliminarParametroFacturacionDefecto;
	public JButton jButtonCancelarParametroFacturacionDefecto;
    public JButton jButtonGuardarCambiosParametroFacturacionDefecto;
	public JButton jButtonGuardarCambiosTablaParametroFacturacionDefecto;
	protected JButton jButtonCerrarParametroFacturacionDefecto;
	
	
	protected JButton jButtonProcesarInformacionParametroFacturacionDefecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFacturacionDefecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFacturacionDefecto;
	protected JButton jButtonModificarToolBarParametroFacturacionDefecto;
	protected JButton jButtonActualizarToolBarParametroFacturacionDefecto;
    protected JButton jButtonEliminarToolBarParametroFacturacionDefecto;
	protected JButton jButtonCancelarToolBarParametroFacturacionDefecto;
    protected JButton jButtonGuardarCambiosToolBarParametroFacturacionDefecto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFacturacionDefecto;
	protected JButton jButtonCerrarToolBarParametroFacturacionDefecto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFacturacionDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFacturacionDefecto;
	protected JMenuItem jMenuItemModificarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemActualizarParametroFacturacionDefecto;
    protected JMenuItem jMenuItemEliminarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemCancelarParametroFacturacionDefecto;
    protected JMenuItem jMenuItemGuardarCambiosParametroFacturacionDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFacturacionDefecto;
	protected JMenuItem jMenuItemCerrarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroFacturacionDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFacturacionDefecto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFacturacionDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroFacturacionDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFacturacionDefecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFacturacionDefecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFacturacionDefecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFacturacionDefecto;
	public JLabel jLabelIdParametroFacturacionDefecto;
	public JLabel jLabelidParametroFacturacionDefecto;
	public JButton jButtonidParametroFacturacionDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFacturacionDefecto;
	public JLabel jLabelid_empresaParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFacturacionDefecto;
	public JButton jButtonid_empresaParametroFacturacionDefecto= new JButtonMe();
	public JButton jButtonid_empresaParametroFacturacionDefectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFacturacionDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFacturacionDefecto;
	public JLabel jLabelid_sucursalParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFacturacionDefecto;
	public JButton jButtonid_sucursalParametroFacturacionDefecto= new JButtonMe();
	public JButton jButtonid_sucursalParametroFacturacionDefectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFacturacionDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteParametroFacturacionDefecto;
	public JLabel jLabelid_tipo_via_transporteParametroFacturacionDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteParametroFacturacionDefecto;
	public JButton jButtonid_tipo_via_transporteParametroFacturacionDefecto= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFacturacionDefecto;
	
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
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFacturacionDefecto=new JPanel();
				this.jPanelAccionesFormularioParametroFacturacionDefecto=new JPanel();
				this.jmenuBarDetalleParametroFacturacionDefecto=new JMenuBar();
				this.jTtoolBarDetalleParametroFacturacionDefecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFacturacionDefectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFacturacionDefectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFacturacionDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFacturacionDefecto() {
		return this.jButtonActualizarToolBarParametroFacturacionDefecto;
	}
	
	public JButton getjButtonEliminarToolBarParametroFacturacionDefecto() {
		return this.jButtonEliminarToolBarParametroFacturacionDefecto;
	}
	
	public JButton getjButtonCancelarToolBarParametroFacturacionDefecto() {
		return this.jButtonCancelarToolBarParametroFacturacionDefecto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFacturacionDefecto() {
		return this.jButtonProcesarInformacionParametroFacturacionDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFacturacionDefecto)	{
		this.jButtonProcesarInformacionParametroFacturacionDefecto = jButtonProcesarInformacionParametroFacturacionDefecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFacturacionDefecto() {
		return this.jComboBoxTiposAccionesParametroFacturacionDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposRelacionesParametroFacturacionDefecto) {
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto = jComboBoxTiposRelacionesParametroFacturacionDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFacturacionDefecto(
			JComboBox jComboBoxTiposAccionesParametroFacturacionDefecto) {
		this.jComboBoxTiposAccionesParametroFacturacionDefecto = jComboBoxTiposAccionesParametroFacturacionDefecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFacturacionDefecto() {
		return this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFacturacionDefecto(
			JComboBox jComboBoxTiposAccionesFormularioParametroFacturacionDefecto) {
		this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto = jComboBoxTiposAccionesFormularioParametroFacturacionDefecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		
		this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofacturaciondefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFacturacionDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFacturacionDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Facturacion Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFacturacionDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFacturacionDefecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFacturacionDefecto=new JButtonMe();
				this.jButtonModificarToolBarParametroFacturacionDefecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto,
							"actualizar","actualizar","Actualizar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto,
							"eliminar","eliminar","Eliminar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto,
							"cancelar","cancelar","Cancelar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFacturacionDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFacturacionDefecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFacturacionDefecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFacturacionDefecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFacturacionDefecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFacturacionDefecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFacturacionDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFacturacionDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFacturacionDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFacturacionDefecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFacturacionDefecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFacturacionDefecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFacturacionDefecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFacturacionDefecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFacturacionDefecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFacturacionDefecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFacturacionDefecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFacturacionDefecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFacturacionDefecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFacturacionDefecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFacturacionDefecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFacturacionDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFacturacionDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFacturacionDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFacturacionDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFacturacionDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFacturacionDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFacturacionDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFacturacionDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFacturacionDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFacturacionDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFacturacionDefecto.add(this.jMenuItemDetalleCerrarParametroFacturacionDefecto);
		
		this.jmenuDetalleAccionesParametroFacturacionDefecto.add(this.jMenuItemActualizarParametroFacturacionDefecto);
		this.jmenuDetalleAccionesParametroFacturacionDefecto.add(this.jMenuItemEliminarParametroFacturacionDefecto);
		this.jmenuDetalleAccionesParametroFacturacionDefecto.add(this.jMenuItemCancelarParametroFacturacionDefecto);		
		
		//this.jmenuDetalleDatosParametroFacturacionDefecto.add(this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto);				
		this.jmenuDetalleDatosParametroFacturacionDefecto.add(this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto);				
				
		//this.jmenuDetalleAccionesParametroFacturacionDefecto.add(this.jMenuItemGuardarCambiosParametroFacturacionDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFacturacionDefecto.add(this.jmenuDetalleArchivoParametroFacturacionDefecto);		
		this.jmenuBarDetalleParametroFacturacionDefecto.add(this.jmenuDetalleAccionesParametroFacturacionDefecto);		
		this.jmenuBarDetalleParametroFacturacionDefecto.add(this.jmenuDetalleDatosParametroFacturacionDefecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFacturacionDefecto);				
	}
	
	
	public void inicializarElementosCamposParametroFacturacionDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFacturacionDefecto = new JLabelMe();
		jLabelIdParametroFacturacionDefecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFacturacionDefecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFacturacionDefecto.setToolTipText(ParametroFacturacionDefectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFacturacionDefecto= new GridBagLayout();

		this.jPanelidParametroFacturacionDefecto.setLayout(this.gridaBagLayoutParametroFacturacionDefecto);

		jLabelidParametroFacturacionDefecto = new JLabel();
		jLabelidParametroFacturacionDefecto.setText("Id");

		jLabelidParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroFacturacionDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFacturacionDefecto = new JLabelMe();
		this.jLabelid_empresaParametroFacturacionDefecto.setText(""+ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFacturacionDefecto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFacturacionDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFacturacionDefecto.setToolTipText(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFacturacionDefecto = new GridBagLayout();
		this.jPanelid_empresaParametroFacturacionDefecto.setLayout(this.gridaBagLayoutParametroFacturacionDefecto);


		jComboBoxid_empresaParametroFacturacionDefecto= new JComboBoxMe();
		jComboBoxid_empresaParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFacturacionDefecto.setEnabled(false);

		this.jButtonid_empresaParametroFacturacionDefecto= new JButtonMe();
		this.jButtonid_empresaParametroFacturacionDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFacturacionDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFacturacionDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFacturacionDefecto.setText("Buscar");
		this.jButtonid_empresaParametroFacturacionDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFacturacionDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFacturacionDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFacturacionDefecto"));

		this.jButtonid_empresaParametroFacturacionDefectoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setText("U");
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFacturacionDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFacturacionDefectoBusqueda"));

		if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFacturacionDefectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFacturacionDefectoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFacturacionDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFacturacionDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFacturacionDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFacturacionDefectoUpdate.setText("U");
		this.jButtonid_empresaParametroFacturacionDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFacturacionDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFacturacionDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFacturacionDefectoUpdate"));



					
		this.jLabelid_sucursalParametroFacturacionDefecto = new JLabelMe();
		this.jLabelid_sucursalParametroFacturacionDefecto.setText(""+ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFacturacionDefecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFacturacionDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFacturacionDefecto.setToolTipText(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFacturacionDefecto = new GridBagLayout();
		this.jPanelid_sucursalParametroFacturacionDefecto.setLayout(this.gridaBagLayoutParametroFacturacionDefecto);


		jComboBoxid_sucursalParametroFacturacionDefecto= new JComboBoxMe();
		jComboBoxid_sucursalParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroFacturacionDefecto.setEnabled(false);

		this.jButtonid_sucursalParametroFacturacionDefecto= new JButtonMe();
		this.jButtonid_sucursalParametroFacturacionDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFacturacionDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFacturacionDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFacturacionDefecto.setText("Buscar");
		this.jButtonid_sucursalParametroFacturacionDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFacturacionDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFacturacionDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFacturacionDefecto"));

		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setText("U");
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFacturacionDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFacturacionDefectoBusqueda"));

		if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFacturacionDefectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFacturacionDefectoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setText("U");
		this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFacturacionDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFacturacionDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFacturacionDefectoUpdate"));



					
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto = new JLabelMe();
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto.setText(""+ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto.setToolTipText("T. Via Transporte");
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteParametroFacturacionDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.setToolTipText(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutParametroFacturacionDefecto = new GridBagLayout();
		this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.setLayout(this.gridaBagLayoutParametroFacturacionDefecto);


		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setText("Buscar");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroFacturacionDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroFacturacionDefecto"));

		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroFacturacionDefectoBusqueda"));

		if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setText("U");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroFacturacionDefectoUpdate"));



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
		//this.jInternalFrameDetalleParametroFacturacionDefecto = new ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Facturacion Defecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFacturacionDefecto= new GridBagLayout();
		

		
		String sToolTipParametroFacturacionDefecto="";
		sToolTipParametroFacturacionDefecto=ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFacturacionDefecto+="(Facturacion.ParametroFacturacionDefecto)";
		}
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFacturacionDefecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFacturacionDefecto = new JButtonMe();
		this.jButtonModificarParametroFacturacionDefecto = new JButtonMe();
        this.jButtonActualizarParametroFacturacionDefecto = new JButtonMe();
        this.jButtonEliminarParametroFacturacionDefecto = new JButtonMe();
        this.jButtonCancelarParametroFacturacionDefecto = new JButtonMe();
        this.jButtonGuardarCambiosParametroFacturacionDefecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto = new JButtonMe();
		this.jButtonCerrarParametroFacturacionDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroFacturacionDefecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFacturacionDefecto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFacturacionDefecto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Facturacion Defecto";
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Facturacion Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFacturacionDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFacturacionDefecto.setName("jPanelCamposParametroFacturacionDefecto"); 

		this.jPanelCamposOcultosParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFacturacionDefecto.setName("jPanelCamposOcultosParametroFacturacionDefecto"); 

        this.jPanelAccionesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFacturacionDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroFacturacionDefecto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFacturacionDefecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFacturacionDefecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFacturacionDefecto.setText("Nuevo");
		this.jButtonModificarParametroFacturacionDefecto.setText("Editar");
        this.jButtonActualizarParametroFacturacionDefecto.setText("Actualizar");
        this.jButtonEliminarParametroFacturacionDefecto.setText("Eliminar");
        this.jButtonCancelarParametroFacturacionDefecto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFacturacionDefecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setText("Guardar");
		this.jButtonCerrarParametroFacturacionDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFacturacionDefecto,"nuevo_button","Nuevo",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFacturacionDefecto,"modificar_button","Editar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFacturacionDefecto,"actualizar_button","Actualizar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFacturacionDefecto,"eliminar_button","Eliminar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFacturacionDefecto,"cancelar_button","Cancelar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFacturacionDefecto,"guardarcambios_button","Guardar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFacturacionDefecto,"guardarcambiostabla_button","Guardar",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFacturacionDefecto,"cerrar_button","Salir",this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFacturacionDefecto.setToolTipText("Nuevo"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFacturacionDefecto.setToolTipText("Editar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFacturacionDefecto.setToolTipText("Actualizar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFacturacionDefecto.setToolTipText("Eliminar)"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFacturacionDefecto.setToolTipText("Cancelar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFacturacionDefecto.setToolTipText("Guardar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setToolTipText("Guardar"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFacturacionDefecto.setToolTipText("Salir"+" "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFacturacionDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFacturacionDefecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFacturacionDefecto";
		inputMap = this.jButtonActualizarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFacturacionDefecto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFacturacionDefecto";
		inputMap = this.jButtonEliminarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFacturacionDefecto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFacturacionDefecto";
		inputMap = this.jButtonCancelarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFacturacionDefecto"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFacturacionDefecto";
		inputMap = this.jButtonCerrarParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFacturacionDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFacturacionDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFacturacionDefecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFacturacionDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFacturacionDefecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFacturacionDefecto.setToolTipText("Nuevo ParametroFacturacionDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto.setToolTipText("Sin Cerrar Ventana ParametroFacturacionDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFacturacionDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroFacturacionDefecto.setText("Acciones");		
		this.jLabelAccionesParametroFacturacionDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFacturacionDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFacturacionDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFacturacionDefecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFacturacionDefecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFacturacionDefecto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFacturacionDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFacturacionDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFacturacionDefecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFacturacionDefecto = new GridBagLayout();
		
		this.jPanelCamposParametroFacturacionDefecto.setLayout(gridaBagLayoutCamposParametroFacturacionDefecto);
		this.jPanelCamposOcultosParametroFacturacionDefecto.setLayout(gridaBagLayoutCamposOcultosParametroFacturacionDefecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFacturacionDefecto.add(jLabelIdParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 1;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFacturacionDefecto.add(jLabelidParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);


	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFacturacionDefecto.add(jLabelid_empresaParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 2;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFacturacionDefecto.add(jButtonid_empresaParametroFacturacionDefectoBusqueda, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 3;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFacturacionDefecto.add(jButtonid_empresaParametroFacturacionDefectoUpdate, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 1;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFacturacionDefecto.add(jComboBoxid_empresaParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);


	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFacturacionDefecto.add(jLabelid_sucursalParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 2;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFacturacionDefecto.add(jButtonid_sucursalParametroFacturacionDefectoBusqueda, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 3;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFacturacionDefecto.add(jButtonid_sucursalParametroFacturacionDefectoUpdate, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 1;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFacturacionDefecto.add(jComboBoxid_sucursalParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);


	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.add(jLabelid_tipo_via_transporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 2;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.add(jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 3;
		this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.add(jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate, this.gridBagConstraintsParametroFacturacionDefecto);
	}

	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = 1;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transporteParametroFacturacionDefecto.add(jComboBoxid_tipo_via_transporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = iYPanelCamposParametroFacturacionDefecto;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = iXPanelCamposParametroFacturacionDefecto++;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFacturacionDefecto.add(this.jPanelidParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(iXPanelCamposParametroFacturacionDefecto % 1==0) {
		iXPanelCamposParametroFacturacionDefecto=0;
		iYPanelCamposParametroFacturacionDefecto++;
	}
	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = iYPanelCamposParametroFacturacionDefecto;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = iXPanelCamposParametroFacturacionDefecto++;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFacturacionDefecto.add(this.jPanelid_tipo_via_transporteParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(iXPanelCamposParametroFacturacionDefecto % 1==0) {
		iXPanelCamposParametroFacturacionDefecto=0;
		iYPanelCamposParametroFacturacionDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = iYPanelCamposOcultosParametroFacturacionDefecto;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = iXPanelCamposOcultosParametroFacturacionDefecto++;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFacturacionDefecto.add(this.jPanelid_empresaParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(iXPanelCamposOcultosParametroFacturacionDefecto % 1==0) {
		iXPanelCamposOcultosParametroFacturacionDefecto=0;
		iYPanelCamposOcultosParametroFacturacionDefecto++;
	}
	this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFacturacionDefecto.gridy = iYPanelCamposOcultosParametroFacturacionDefecto;
	this.gridBagConstraintsParametroFacturacionDefecto.gridx = iXPanelCamposOcultosParametroFacturacionDefecto++;
	this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFacturacionDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFacturacionDefecto.add(this.jPanelid_sucursalParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);



	if(iXPanelCamposOcultosParametroFacturacionDefecto % 1==0) {
		iXPanelCamposOcultosParametroFacturacionDefecto=0;
		iYPanelCamposOcultosParametroFacturacionDefecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFacturacionDefecto= new GridBagLayout();
		this.jPanelAccionesParametroFacturacionDefecto.setLayout(gridaBagLayoutAccionesParametroFacturacionDefecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFacturacionDefecto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFacturacionDefecto.setLayout(gridaBagLayoutAccionesFormularioParametroFacturacionDefecto);
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFacturacionDefecto.add(this.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFacturacionDefecto.add(this.jCheckBoxPostAccionNuevoParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFacturacionDefecto.add(this.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFacturacionDefecto.add(this.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonModificarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);							

		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonEliminarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonActualizarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);


		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonGuardarCambiosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);	
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = 0;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFacturacionDefecto.add(this.jButtonCancelarParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFacturacionDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFacturacionDefecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroFacturacionDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFacturacionDefecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =0;
		this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFacturacionDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFacturacionDefecto = new ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Facturacion Defecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Facturacion Defecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Facturacion Defecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFacturacionDefectoModel parametrofacturaciondefectoModel=new ParametroFacturacionDefectoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFacturacionDefectoModel.ParametroFacturacionDefectoFocusTraversalPolicy parametrofacturaciondefectoFocusTraversalPolicy = parametrofacturaciondefectoModel.new ParametroFacturacionDefectoFocusTraversalPolicy(this);
			
			//parametrofacturaciondefectoFocusTraversalPolicy.setparametrofacturaciondefectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofacturaciondefectoModel);
			
			
			this.jContentPaneDetalleParametroFacturacionDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFacturacionDefecto = new GridBagLayout();	
			this.jContentPaneDetalleParametroFacturacionDefecto.setLayout(gridaBagLayoutDetalleParametroFacturacionDefecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFacturacionDefecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFacturacionDefecto.add(jTtoolBarDetalleParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto=   new JScrollPane(jContentPaneDetalleParametroFacturacionDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	        
			this.jContentPaneDetalleParametroFacturacionDefecto.add(jPanelCamposParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);
			
			
			
			
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
						&& parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFacturacionDefecto= new GridBagConstraints();
						this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
						this.jContentPaneDetalleParametroFacturacionDefecto.add(this.jTabbedPaneRelacionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFacturacionDefecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFacturacionDefecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
					this.gridBagConstraintsParametroFacturacionDefecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFacturacionDefecto.add(jPanelCamposOcultosParametroFacturacionDefecto, gridBagConstraintsParametroFacturacionDefecto);
				
					this.jPanelCamposOcultosParametroFacturacionDefecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	        this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFacturacionDefecto.add(this.jPanelAccionesFormularioParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);							
			
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
	        this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFacturacionDefecto.add(this.jPanelAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFacturacionDefecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto=   new JScrollPane(this.jPanelCamposParametroFacturacionDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
			this.gridBagConstraintsParametroFacturacionDefecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFacturacionDefecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFacturacionDefecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);			
			
			this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
			
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		
			
		this.gridBagConstraintsParametroFacturacionDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroFacturacionDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFacturacionDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFacturacionDefecto, this.gridBagConstraintsParametroFacturacionDefecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFacturacionDefecto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFacturacionDefecto;
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
