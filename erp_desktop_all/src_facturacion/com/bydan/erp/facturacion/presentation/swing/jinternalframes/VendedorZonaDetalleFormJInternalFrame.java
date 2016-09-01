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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.VendedorZonaConstantesFunciones;

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
public class VendedorZonaDetalleFormJInternalFrame extends VendedorZonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVendedorZona;
	
	protected JMenuBar jmenuBarDetalleVendedorZona;
	
	protected JMenu jmenuDetalleVendedorZona;
	protected JMenu jmenuDetalleArchivoVendedorZona;
	protected JMenu jmenuDetalleAccionesVendedorZona;
	protected JMenu jmenuDetalleDatosVendedorZona;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedorZona;	
	protected GridBagConstraints gridBagConstraintsVendedorZona;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VendedorZonaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVendedorZona;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public VendedorZonaSessionBean vendedorzonaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ZonaSessionBean zonaSessionBean;	
	
	public VendedorZonaLogic vendedorzonaLogic;
	
	public JScrollPane jScrollPanelDatosVendedorZona;
	public JScrollPane jScrollPanelDatosEdicionVendedorZona;
	public JScrollPane jScrollPanelDatosGeneralVendedorZona;
	
	protected JPanel jPanelCamposVendedorZona;    
	protected JPanel jPanelCamposOcultosVendedorZona;    	
	protected JPanel jPanelAccionesVendedorZona;
	protected JPanel jPanelAccionesFormularioVendedorZona;
    
	
	
	protected Integer iXPanelCamposVendedorZona=0;
	protected Integer iYPanelCamposVendedorZona=0;
	
	protected Integer iXPanelCamposOcultosVendedorZona=0;
	protected Integer iYPanelCamposOcultosVendedorZona=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVendedorZona;
	public JButton jButtonModificarVendedorZona;
	public JButton jButtonActualizarVendedorZona;
    public JButton jButtonEliminarVendedorZona;
	public JButton jButtonCancelarVendedorZona;
    public JButton jButtonGuardarCambiosVendedorZona;
	public JButton jButtonGuardarCambiosTablaVendedorZona;
	protected JButton jButtonCerrarVendedorZona;
	
	
	protected JButton jButtonProcesarInformacionVendedorZona;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVendedorZona;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVendedorZona;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVendedorZona;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedorZona;
	protected JButton jButtonModificarToolBarVendedorZona;
	protected JButton jButtonActualizarToolBarVendedorZona;
    protected JButton jButtonEliminarToolBarVendedorZona;
	protected JButton jButtonCancelarToolBarVendedorZona;
    protected JButton jButtonGuardarCambiosToolBarVendedorZona;
	protected JButton jButtonGuardarCambiosTablaToolBarVendedorZona;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedorZona;
	protected JButton jButtonCerrarToolBarVendedorZona;
	
	protected JButton jButtonProcesarInformacionToolBarVendedorZona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedorZona;
	protected JMenuItem jMenuItemModificarVendedorZona;
	protected JMenuItem jMenuItemActualizarVendedorZona;
    protected JMenuItem jMenuItemEliminarVendedorZona;
	protected JMenuItem jMenuItemCancelarVendedorZona;
    protected JMenuItem jMenuItemGuardarCambiosVendedorZona;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedorZona;
	protected JMenuItem jMenuItemCerrarVendedorZona;
	protected JMenuItem jMenuItemDetalleCerrarVendedorZona;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedorZona;
	
	protected JMenuItem jMenuItemProcesarInformacionVendedorZona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedorZona;
	protected JMenuItem jMenuItemMostrarOcultarVendedorZona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVendedorZona;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedorZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedorZona;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVendedorZona;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVendedorZona;
	public JLabel jLabelIdVendedorZona;
	public JLabel jLabelidVendedorZona;
	public JButton jButtonidVendedorZonaBusqueda= new JButtonMe();

	public JPanel jPanelobservacionVendedorZona;
	public JLabel jLabelobservacionVendedorZona;
	public JTextArea jTextAreaobservacionVendedorZona;
	public JScrollPane jscrollPaneobservacionVendedorZona;
	public JButton jButtonobservacionVendedorZonaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVendedorZona;
	public JLabel jLabelid_empresaVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVendedorZona;
	public JButton jButtonid_empresaVendedorZona= new JButtonMe();
	public JButton jButtonid_empresaVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVendedorZonaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVendedorZona;
	public JLabel jLabelid_sucursalVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVendedorZona;
	public JButton jButtonid_sucursalVendedorZona= new JButtonMe();
	public JButton jButtonid_sucursalVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVendedorZonaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorVendedorZona;
	public JLabel jLabelid_vendedorVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorVendedorZona;
	public JButton jButtonid_vendedorVendedorZona= new JButtonMe();
	public JButton jButtonid_vendedorVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorVendedorZonaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorVendedorZonaArbol= new JButtonMe();

	public JPanel jPanelid_zonaVendedorZona;
	public JLabel jLabelid_zonaVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaVendedorZona;
	public JButton jButtonid_zonaVendedorZona= new JButtonMe();
	public JButton jButtonid_zonaVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_zonaVendedorZonaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVendedorZona;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VendedorZonaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVendedorZona=new JPanel();
				this.jPanelAccionesFormularioVendedorZona=new JPanel();
				this.jmenuBarDetalleVendedorZona=new JMenuBar();
				this.jTtoolBarDetalleVendedorZona=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VendedorZonaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVendedorZona() {
		return this.jButtonActualizarToolBarVendedorZona;
	}
	
	public JButton getjButtonEliminarToolBarVendedorZona() {
		return this.jButtonEliminarToolBarVendedorZona;
	}
	
	public JButton getjButtonCancelarToolBarVendedorZona() {
		return this.jButtonCancelarToolBarVendedorZona;
	}		
	
	public JButton getjButtonProcesarInformacionVendedorZona() {
		return this.jButtonProcesarInformacionVendedorZona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedorZona)	{
		this.jButtonProcesarInformacionVendedorZona = jButtonProcesarInformacionVendedorZona;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedorZona() {
		return this.jComboBoxTiposAccionesVendedorZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedorZona(
			JComboBox jComboBoxTiposRelacionesVendedorZona) {
		this.jComboBoxTiposRelacionesVendedorZona = jComboBoxTiposRelacionesVendedorZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedorZona(
			JComboBox jComboBoxTiposAccionesVendedorZona) {
		this.jComboBoxTiposAccionesVendedorZona = jComboBoxTiposAccionesVendedorZona;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVendedorZona() {
		return this.jComboBoxTiposAccionesFormularioVendedorZona;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVendedorZona(
			JComboBox jComboBoxTiposAccionesFormularioVendedorZona) {
		this.jComboBoxTiposAccionesFormularioVendedorZona = jComboBoxTiposAccionesFormularioVendedorZona;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		
		this.vendedorzonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorzonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorzonaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorZonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor Zona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
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
	
		VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVendedorZona= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVendedorZona=new JButtonMe();
				this.jButtonModificarToolBarVendedorZona=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVendedorZona,this.jTtoolBarDetalleVendedorZona,
							"actualizar","actualizar","Actualizar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVendedorZona,this.jTtoolBarDetalleVendedorZona,
							"eliminar","eliminar","Eliminar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVendedorZona,this.jTtoolBarDetalleVendedorZona,
							"cancelar","cancelar","Cancelar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVendedorZona,this.jTtoolBarDetalleVendedorZona,
							"guardarcambios","guardarcambios","Guardar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVendedorZona=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVendedorZona=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVendedorZona=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVendedorZona=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVendedorZona=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedorZona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedorZona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedorZona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVendedorZona= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVendedorZona.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVendedorZona,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVendedorZona= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVendedorZona.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVendedorZona,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVendedorZona= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVendedorZona.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVendedorZona,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVendedorZona= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVendedorZona.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVendedorZona,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVendedorZona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedorZona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedorZona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedorZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedorZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedorZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVendedorZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVendedorZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVendedorZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedorZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedorZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedorZona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedorZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedorZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedorZona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVendedorZona.add(this.jMenuItemDetalleCerrarVendedorZona);
		
		this.jmenuDetalleAccionesVendedorZona.add(this.jMenuItemActualizarVendedorZona);
		this.jmenuDetalleAccionesVendedorZona.add(this.jMenuItemEliminarVendedorZona);
		this.jmenuDetalleAccionesVendedorZona.add(this.jMenuItemCancelarVendedorZona);		
		
		//this.jmenuDetalleDatosVendedorZona.add(this.jMenuItemDetalleAbrirOrderByVendedorZona);				
		this.jmenuDetalleDatosVendedorZona.add(this.jMenuItemDetalleMostarOcultarVendedorZona);				
				
		//this.jmenuDetalleAccionesVendedorZona.add(this.jMenuItemGuardarCambiosVendedorZona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVendedorZona.add(this.jmenuDetalleArchivoVendedorZona);		
		this.jmenuBarDetalleVendedorZona.add(this.jmenuDetalleAccionesVendedorZona);		
		this.jmenuBarDetalleVendedorZona.add(this.jmenuDetalleDatosVendedorZona);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVendedorZona);				
	}
	
	
	public void inicializarElementosCamposVendedorZona() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVendedorZona = new JLabelMe();
		jLabelIdVendedorZona.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVendedorZona = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVendedorZona= new GridBagLayout();

		this.jPanelidVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);

		jLabelidVendedorZona = new JLabel();
		jLabelidVendedorZona.setText("Id");

		jLabelidVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelobservacionVendedorZona = new JLabelMe();
		this.jLabelobservacionVendedorZona.setText(""+VendedorZonaConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionVendedorZona.setToolTipText("Observacion");
		this.jLabelobservacionVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutVendedorZona = new GridBagLayout();
		this.jPanelobservacionVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);


		jTextAreaobservacionVendedorZona= new JTextAreaMe();
		jTextAreaobservacionVendedorZona.setEnabled(false);
		jTextAreaobservacionVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionVendedorZona.setLineWrap(true);
		jTextAreaobservacionVendedorZona.setWrapStyleWord(true);
		jTextAreaobservacionVendedorZona.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionVendedorZona.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionVendedorZona = new JScrollPane(jTextAreaobservacionVendedorZona);
		jscrollPaneobservacionVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonobservacionVendedorZonaBusqueda= new JButtonMe();
		this.jButtonobservacionVendedorZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionVendedorZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionVendedorZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionVendedorZonaBusqueda.setText("U");
		this.jButtonobservacionVendedorZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionVendedorZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionVendedorZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionVendedorZonaBusqueda"));

		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionVendedorZonaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVendedorZona() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVendedorZona = new JLabelMe();
		this.jLabelid_empresaVendedorZona.setText(""+VendedorZonaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVendedorZona.setToolTipText("Empresa");
		this.jLabelid_empresaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVendedorZona = new GridBagLayout();
		this.jPanelid_empresaVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);


		jComboBoxid_empresaVendedorZona= new JComboBoxMe();
		jComboBoxid_empresaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVendedorZona.setEnabled(false);

		this.jButtonid_empresaVendedorZona= new JButtonMe();
		this.jButtonid_empresaVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorZona.setText("Buscar");
		this.jButtonid_empresaVendedorZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVendedorZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorZona"));

		this.jButtonid_empresaVendedorZonaBusqueda= new JButtonMe();
		this.jButtonid_empresaVendedorZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorZonaBusqueda.setText("U");
		this.jButtonid_empresaVendedorZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVendedorZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorZonaBusqueda"));

		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVendedorZonaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVendedorZonaUpdate= new JButtonMe();
		this.jButtonid_empresaVendedorZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorZonaUpdate.setText("U");
		this.jButtonid_empresaVendedorZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVendedorZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorZonaUpdate"));



					
		this.jLabelid_sucursalVendedorZona = new JLabelMe();
		this.jLabelid_sucursalVendedorZona.setText(""+VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVendedorZona.setToolTipText("Sucursal");
		this.jLabelid_sucursalVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVendedorZona = new GridBagLayout();
		this.jPanelid_sucursalVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);


		jComboBoxid_sucursalVendedorZona= new JComboBoxMe();
		jComboBoxid_sucursalVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVendedorZona.setEnabled(false);

		this.jButtonid_sucursalVendedorZona= new JButtonMe();
		this.jButtonid_sucursalVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedorZona.setText("Buscar");
		this.jButtonid_sucursalVendedorZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVendedorZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedorZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedorZona"));

		this.jButtonid_sucursalVendedorZonaBusqueda= new JButtonMe();
		this.jButtonid_sucursalVendedorZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVendedorZonaBusqueda.setText("U");
		this.jButtonid_sucursalVendedorZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVendedorZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedorZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedorZonaBusqueda"));

		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVendedorZonaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVendedorZonaUpdate= new JButtonMe();
		this.jButtonid_sucursalVendedorZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVendedorZonaUpdate.setText("U");
		this.jButtonid_sucursalVendedorZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVendedorZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedorZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedorZonaUpdate"));



					
		this.jLabelid_vendedorVendedorZona = new JLabelMe();
		this.jLabelid_vendedorVendedorZona.setText(""+VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorVendedorZona.setToolTipText("Vendedor");
		this.jLabelid_vendedorVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutVendedorZona = new GridBagLayout();
		this.jPanelid_vendedorVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);


		jComboBoxid_vendedorVendedorZona= new JComboBoxMe();
		jComboBoxid_vendedorVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorVendedorZona= new JButtonMe();
		this.jButtonid_vendedorVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorZona.setText("Buscar");
		this.jButtonid_vendedorVendedorZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorVendedorZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorZona"));

		this.jButtonid_vendedorVendedorZonaBusqueda= new JButtonMe();
		this.jButtonid_vendedorVendedorZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorZonaBusqueda.setText("U");
		this.jButtonid_vendedorVendedorZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorVendedorZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorZonaBusqueda"));

		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorVendedorZonaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorVendedorZonaUpdate= new JButtonMe();
		this.jButtonid_vendedorVendedorZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorZonaUpdate.setText("U");
		this.jButtonid_vendedorVendedorZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorVendedorZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorZonaUpdate"));


		jButtonid_vendedorVendedorZonaArbol= new JButtonMe();
		jButtonid_vendedorVendedorZonaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorZonaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorZonaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorZonaArbol.setText("Arbol");
		jButtonid_vendedorVendedorZonaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorVendedorZonaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorZonaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorZonaArbol"));



					
		this.jLabelid_zonaVendedorZona = new JLabelMe();
		this.jLabelid_zonaVendedorZona.setText(""+VendedorZonaConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaVendedorZona.setToolTipText("Zona");
		this.jLabelid_zonaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaVendedorZona.setToolTipText(VendedorZonaConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutVendedorZona = new GridBagLayout();
		this.jPanelid_zonaVendedorZona.setLayout(this.gridaBagLayoutVendedorZona);


		jComboBoxid_zonaVendedorZona= new JComboBoxMe();
		jComboBoxid_zonaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaVendedorZona= new JButtonMe();
		this.jButtonid_zonaVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedorZona.setText("Buscar");
		this.jButtonid_zonaVendedorZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaVendedorZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedorZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedorZona"));

		this.jButtonid_zonaVendedorZonaBusqueda= new JButtonMe();
		this.jButtonid_zonaVendedorZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaVendedorZonaBusqueda.setText("U");
		this.jButtonid_zonaVendedorZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaVendedorZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedorZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedorZonaBusqueda"));

		if(this.vendedorzonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaVendedorZonaBusqueda.setVisible(false);		}

		this.jButtonid_zonaVendedorZonaUpdate= new JButtonMe();
		this.jButtonid_zonaVendedorZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaVendedorZonaUpdate.setText("U");
		this.jButtonid_zonaVendedorZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaVendedorZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedorZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaVendedorZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedorZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedorZonaUpdate"));



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
		//this.jInternalFrameDetalleVendedorZona = new VendedorZonaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vendedor Zona DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedorZona= new GridBagLayout();
		

		
		String sToolTipVendedorZona="";
		sToolTipVendedorZona=VendedorZonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedorZona+="(Facturacion.VendedorZona)";
		}
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedorZona+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVendedorZona = new JButtonMe();
		this.jButtonModificarVendedorZona = new JButtonMe();
        this.jButtonActualizarVendedorZona = new JButtonMe();
        this.jButtonEliminarVendedorZona = new JButtonMe();
        this.jButtonCancelarVendedorZona = new JButtonMe();
        this.jButtonGuardarCambiosVendedorZona = new JButtonMe();
		this.jButtonGuardarCambiosTablaVendedorZona = new JButtonMe();
		this.jButtonCerrarVendedorZona = new JButtonMe();
		
		this.jScrollPanelDatosVendedorZona = new JScrollPane();   
        this.jScrollPanelDatosEdicionVendedorZona = new JScrollPane();
		this.jScrollPanelDatosGeneralVendedorZona = new JScrollPane();
				
		
		
		this.jPanelCamposVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vendedor Zona";
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedorZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVendedorZona.setName("jPanelCamposVendedorZona"); 

		this.jPanelCamposOcultosVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVendedorZona.setName("jPanelCamposOcultosVendedorZona"); 

        this.jPanelAccionesVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedorZona.setToolTipText("Acciones");
        this.jPanelAccionesVendedorZona.setName("Acciones"); 

		this.jPanelAccionesFormularioVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVendedorZona.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVendedorZona.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVendedorZona.setText("Nuevo");
		this.jButtonModificarVendedorZona.setText("Editar");
        this.jButtonActualizarVendedorZona.setText("Actualizar");
        this.jButtonEliminarVendedorZona.setText("Eliminar");
        this.jButtonCancelarVendedorZona.setText("Cancelar");
        this.jButtonGuardarCambiosVendedorZona.setText("Guardar");
		this.jButtonGuardarCambiosTablaVendedorZona.setText("Guardar");
		this.jButtonCerrarVendedorZona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedorZona,"nuevo_button","Nuevo",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVendedorZona,"modificar_button","Editar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVendedorZona,"actualizar_button","Actualizar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVendedorZona,"eliminar_button","Eliminar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVendedorZona,"cancelar_button","Cancelar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVendedorZona,"guardarcambios_button","Guardar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedorZona,"guardarcambiostabla_button","Guardar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedorZona,"cerrar_button","Salir",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVendedorZona.setToolTipText("Nuevo"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVendedorZona.setToolTipText("Editar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVendedorZona.setToolTipText("Actualizar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVendedorZona.setToolTipText("Eliminar)"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVendedorZona.setToolTipText("Cancelar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVendedorZona.setToolTipText("Guardar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVendedorZona.setToolTipText("Guardar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedorZona.setToolTipText("Salir"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedorZona";
		inputMap = this.jButtonNuevoVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedorZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedorZona"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVendedorZona";
		inputMap = this.jButtonActualizarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVendedorZona"));
		
		//ELIMINAR
		sMapKey = "EliminarVendedorZona";
		inputMap = this.jButtonEliminarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVendedorZona"));
		
		//CANCELAR	
		sMapKey = "CancelarVendedorZona";
		inputMap = this.jButtonCancelarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVendedorZona"));
		
		//CERRAR		
		sMapKey = "CerrarVendedorZona";
		inputMap = this.jButtonCerrarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedorZona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedorZona";
		inputMap = this.jButtonGuardarCambiosTablaVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedorZona"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVendedorZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVendedorZona.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVendedorZona.setToolTipText("Nuevo VendedorZona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVendedorZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVendedorZona.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVendedorZona.setToolTipText("Sin Cerrar Ventana VendedorZona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVendedorZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVendedorZona.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVendedorZona.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedorZona.setText("Accion");
		this.jComboBoxTiposAccionesVendedorZona.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVendedorZona.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVendedorZona.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVendedorZona = new JLabelMe();
		
		this.jLabelAccionesVendedorZona.setText("Acciones");		
		this.jLabelAccionesVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVendedorZona();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVendedorZona();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVendedorZona=new JTabbedPane();
		this.jTabbedPaneRelacionesVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVendedorZona,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVendedorZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVendedorZona.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedorZona.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedorZona.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVendedorZona = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVendedorZona = new GridBagLayout();
		
		this.jPanelCamposVendedorZona.setLayout(gridaBagLayoutCamposVendedorZona);
		this.jPanelCamposOcultosVendedorZona.setLayout(gridaBagLayoutCamposOcultosVendedorZona);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVendedorZona.add(jLabelIdVendedorZona, this.gridBagConstraintsVendedorZona);



	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVendedorZona.add(jLabelidVendedorZona, this.gridBagConstraintsVendedorZona);


	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVendedorZona.add(jLabelid_empresaVendedorZona, this.gridBagConstraintsVendedorZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 2;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedorZona.add(jButtonid_empresaVendedorZonaBusqueda, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 3;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedorZona.add(jButtonid_empresaVendedorZonaUpdate, this.gridBagConstraintsVendedorZona);
	}

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVendedorZona.add(jComboBoxid_empresaVendedorZona, this.gridBagConstraintsVendedorZona);


	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVendedorZona.add(jLabelid_sucursalVendedorZona, this.gridBagConstraintsVendedorZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 2;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVendedorZona.add(jButtonid_sucursalVendedorZonaBusqueda, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 3;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVendedorZona.add(jButtonid_sucursalVendedorZonaUpdate, this.gridBagConstraintsVendedorZona);
	}

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVendedorZona.add(jComboBoxid_sucursalVendedorZona, this.gridBagConstraintsVendedorZona);


	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorVendedorZona.add(jLabelid_vendedorVendedorZona, this.gridBagConstraintsVendedorZona);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 2;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorVendedorZona.add(jButtonid_vendedorVendedorZona, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 3;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorVendedorZona.add(jButtonid_vendedorVendedorZonaArbol, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 4;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedorZona.add(jButtonid_vendedorVendedorZonaBusqueda, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 5;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedorZona.add(jButtonid_vendedorVendedorZonaUpdate, this.gridBagConstraintsVendedorZona);
	}

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorVendedorZona.add(jComboBoxid_vendedorVendedorZona, this.gridBagConstraintsVendedorZona);


	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaVendedorZona.add(jLabelid_zonaVendedorZona, this.gridBagConstraintsVendedorZona);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 2;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_zonaVendedorZona.add(jButtonid_zonaVendedorZona, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 3;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaVendedorZona.add(jButtonid_zonaVendedorZonaBusqueda, this.gridBagConstraintsVendedorZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 4;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaVendedorZona.add(jButtonid_zonaVendedorZonaUpdate, this.gridBagConstraintsVendedorZona);
	}

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaVendedorZona.add(jComboBoxid_zonaVendedorZona, this.gridBagConstraintsVendedorZona);


	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 0;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionVendedorZona.add(jLabelobservacionVendedorZona, this.gridBagConstraintsVendedorZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 2;
		this.gridBagConstraintsVendedorZona.ipadx = 0;
		this.gridBagConstraintsVendedorZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionVendedorZona.add(jButtonobservacionVendedorZonaBusqueda, this.gridBagConstraintsVendedorZona);
	}

	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorZona.gridy = 0;
	this.gridBagConstraintsVendedorZona.gridx = 1;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionVendedorZona.add(jscrollPaneobservacionVendedorZona, this.gridBagConstraintsVendedorZona);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorZona.add(this.jPanelidVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposVendedorZona % 1==0) {
		iXPanelCamposVendedorZona=0;
		iYPanelCamposVendedorZona++;
	}
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorZona.add(this.jPanelid_vendedorVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposVendedorZona % 1==0) {
		iXPanelCamposVendedorZona=0;
		iYPanelCamposVendedorZona++;
	}
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorZona.add(this.jPanelid_zonaVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposVendedorZona % 1==0) {
		iXPanelCamposVendedorZona=0;
		iYPanelCamposVendedorZona++;
	}
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorZona.add(this.jPanelobservacionVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposVendedorZona % 1==0) {
		iXPanelCamposVendedorZona=0;
		iYPanelCamposVendedorZona++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposOcultosVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposOcultosVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedorZona.add(this.jPanelid_empresaVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposOcultosVendedorZona % 1==0) {
		iXPanelCamposOcultosVendedorZona=0;
		iYPanelCamposOcultosVendedorZona++;
	}
	this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorZona.gridy = iYPanelCamposOcultosVendedorZona;
	this.gridBagConstraintsVendedorZona.gridx = iXPanelCamposOcultosVendedorZona++;
	this.gridBagConstraintsVendedorZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedorZona.add(this.jPanelid_sucursalVendedorZona, this.gridBagConstraintsVendedorZona);



	if(iXPanelCamposOcultosVendedorZona % 1==0) {
		iXPanelCamposOcultosVendedorZona=0;
		iYPanelCamposOcultosVendedorZona++;
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
			
		GridBagLayout gridaBagLayoutAccionesVendedorZona= new GridBagLayout();
		this.jPanelAccionesVendedorZona.setLayout(gridaBagLayoutAccionesVendedorZona);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVendedorZona= new GridBagLayout();
		this.jPanelAccionesFormularioVendedorZona.setLayout(gridaBagLayoutAccionesFormularioVendedorZona);
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedorZona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedorZona.add(this.jComboBoxTiposAccionesFormularioVendedorZona, this.gridBagConstraintsVendedorZona);

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedorZona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedorZona.add(this.jCheckBoxPostAccionNuevoVendedorZona, this.gridBagConstraintsVendedorZona);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedorZona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedorZona.add(this.jCheckBoxPostAccionSinCerrarVendedorZona, this.gridBagConstraintsVendedorZona);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vendedorzonaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedorZona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedorZona.add(this.jCheckBoxPostAccionSinMensajeVendedorZona, this.gridBagConstraintsVendedorZona);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = iPosXAccion++;
			
		this.jPanelAccionesVendedorZona.add(this.jButtonModificarVendedorZona, this.gridBagConstraintsVendedorZona);							

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx =iPosXAccion++;
			
		this.jPanelAccionesVendedorZona.add(this.jButtonEliminarVendedorZona, this.gridBagConstraintsVendedorZona);
		
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = 0;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedorZona.add(this.jButtonActualizarVendedorZona, this.gridBagConstraintsVendedorZona);


		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = 0;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedorZona.add(this.jButtonGuardarCambiosVendedorZona, this.gridBagConstraintsVendedorZona);	
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = 0;		
		this.gridBagConstraintsVendedorZona.gridx =iPosXAccion++;
		
		this.jPanelAccionesVendedorZona.add(this.jButtonCancelarVendedorZona, this.gridBagConstraintsVendedorZona);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedorZona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedorZona);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();						
			this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorZona.gridx = 0;		
			//this.gridBagConstraintsVendedorZona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedorZona.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedorZona.gridx =0;
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedorZona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedorZona, this.gridBagConstraintsVendedorZona);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVendedorZona = new VendedorZonaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vendedor Zona DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vendedor Zona DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Zona Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VendedorZonaModel vendedorzonaModel=new VendedorZonaModel(this);
			
			//SI USARA CLASE INTERNA
			//VendedorZonaModel.VendedorZonaFocusTraversalPolicy vendedorzonaFocusTraversalPolicy = vendedorzonaModel.new VendedorZonaFocusTraversalPolicy(this);
			
			//vendedorzonaFocusTraversalPolicy.setvendedorzonaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vendedorzonaModel);
			
			
			this.jContentPaneDetalleVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVendedorZona = new GridBagLayout();	
			this.jContentPaneDetalleVendedorZona.setLayout(gridaBagLayoutDetalleVendedorZona);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedorZona = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVendedorZona = new GridBagConstraints();
				this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVendedorZona.gridx = 0;
					
				
				this.jContentPaneDetalleVendedorZona.add(jTtoolBarDetalleVendedorZona, gridBagConstraintsVendedorZona);								
				
}
			
			this.jScrollPanelDatosEdicionVendedorZona=   new JScrollPane(jContentPaneDetalleVendedorZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedorZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVendedorZona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedorZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVendedorZona.gridx = 0;
	        
			this.jContentPaneDetalleVendedorZona.add(jPanelCamposVendedorZona, gridBagConstraintsVendedorZona);
			
			
			
			
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
						&& vendedorzonaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.vendedorzonaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVendedorZona= new GridBagConstraints();
						this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVendedorZona.gridx = 0;
						this.jContentPaneDetalleVendedorZona.add(this.jTabbedPaneRelacionesVendedorZona, this.gridBagConstraintsVendedorZona);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVendedorZona.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVendedorZona.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVendedorZona = new GridBagConstraints();
					this.gridBagConstraintsVendedorZona.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVendedorZona.gridx = 0;
					
				
					this.jContentPaneDetalleVendedorZona.add(jPanelCamposOcultosVendedorZona, gridBagConstraintsVendedorZona);
				
					this.jPanelCamposOcultosVendedorZona.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVendedorZona.gridx = 0;
	        this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVendedorZona.add(this.jPanelAccionesFormularioVendedorZona, this.gridBagConstraintsVendedorZona);							
			
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
	        this.gridBagConstraintsVendedorZona.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVendedorZona.gridx = 0;
	        
			
			this.jContentPaneDetalleVendedorZona.add(this.jPanelAccionesVendedorZona, this.gridBagConstraintsVendedorZona);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVendedorZona);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVendedorZona=   new JScrollPane(this.jPanelCamposVendedorZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedorZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVendedorZona.gridx = 0;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVendedorZona.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVendedorZona, this.gridBagConstraintsVendedorZona);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedorZona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVendedorZona, this.gridBagConstraintsVendedorZona);			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedorZona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVendedorZona, this.gridBagConstraintsVendedorZona);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedorZona, this.gridBagConstraintsVendedorZona);
			
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedorZona, this.gridBagConstraintsVendedorZona);
		
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedorZona, this.gridBagConstraintsVendedorZona);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVendedorZona;//jContentPane;
		
		return jScrollPanelDatosEdicionVendedorZona;
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
