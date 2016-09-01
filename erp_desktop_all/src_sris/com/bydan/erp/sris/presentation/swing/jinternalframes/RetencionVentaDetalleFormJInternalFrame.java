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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.RetencionVentaConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class RetencionVentaDetalleFormJInternalFrame extends RetencionVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRetencionVenta;
	
	protected JMenuBar jmenuBarDetalleRetencionVenta;
	
	protected JMenu jmenuDetalleRetencionVenta;
	protected JMenu jmenuDetalleArchivoRetencionVenta;
	protected JMenu jmenuDetalleAccionesRetencionVenta;
	protected JMenu jmenuDetalleDatosRetencionVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionVenta;	
	protected GridBagConstraints gridBagConstraintsRetencionVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RetencionVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleRetencionVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";
	
	public RetencionVentaSessionBean retencionventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;	
	
	public RetencionVentaLogic retencionventaLogic;
	
	public JScrollPane jScrollPanelDatosRetencionVenta;
	public JScrollPane jScrollPanelDatosEdicionRetencionVenta;
	public JScrollPane jScrollPanelDatosGeneralRetencionVenta;
	
	protected JPanel jPanelCamposRetencionVenta;    
	protected JPanel jPanelCamposOcultosRetencionVenta;    	
	protected JPanel jPanelAccionesRetencionVenta;
	protected JPanel jPanelAccionesFormularioRetencionVenta;
    
	
	
	protected Integer iXPanelCamposRetencionVenta=0;
	protected Integer iYPanelCamposRetencionVenta=0;
	
	protected Integer iXPanelCamposOcultosRetencionVenta=0;
	protected Integer iYPanelCamposOcultosRetencionVenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRetencionVenta;
	public JButton jButtonModificarRetencionVenta;
	public JButton jButtonActualizarRetencionVenta;
    public JButton jButtonEliminarRetencionVenta;
	public JButton jButtonCancelarRetencionVenta;
    public JButton jButtonGuardarCambiosRetencionVenta;
	public JButton jButtonGuardarCambiosTablaRetencionVenta;
	protected JButton jButtonCerrarRetencionVenta;
	
	
	protected JButton jButtonProcesarInformacionRetencionVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRetencionVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRetencionVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRetencionVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionVenta;
	protected JButton jButtonModificarToolBarRetencionVenta;
	protected JButton jButtonActualizarToolBarRetencionVenta;
    protected JButton jButtonEliminarToolBarRetencionVenta;
	protected JButton jButtonCancelarToolBarRetencionVenta;
    protected JButton jButtonGuardarCambiosToolBarRetencionVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarRetencionVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionVenta;
	protected JButton jButtonCerrarToolBarRetencionVenta;
	
	protected JButton jButtonProcesarInformacionToolBarRetencionVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionVenta;
	protected JMenuItem jMenuItemModificarRetencionVenta;
	protected JMenuItem jMenuItemActualizarRetencionVenta;
    protected JMenuItem jMenuItemEliminarRetencionVenta;
	protected JMenuItem jMenuItemCancelarRetencionVenta;
    protected JMenuItem jMenuItemGuardarCambiosRetencionVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionVenta;
	protected JMenuItem jMenuItemCerrarRetencionVenta;
	protected JMenuItem jMenuItemDetalleCerrarRetencionVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionRetencionVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionVenta;
	protected JMenuItem jMenuItemMostrarOcultarRetencionVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRetencionVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRetencionVenta;
	public JLabel jLabelIdRetencionVenta;
	public JLabel jLabelidRetencionVenta;
	public JButton jButtonidRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelrucRetencionVenta;
	public JLabel jLabelrucRetencionVenta;
	public JTextField jTextFieldrucRetencionVenta;
	public JButton jButtonrucRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionRetencionVenta;
	public JLabel jLabelnumero_retencionRetencionVenta;
	public JTextField jTextFieldnumero_retencionRetencionVenta;
	public JButton jButtonnumero_retencionRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleRetencionVenta;
	public JLabel jLabelbase_imponibleRetencionVenta;
	public JTextField jTextFieldbase_imponibleRetencionVenta;
	public JButton jButtonbase_imponibleRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeRetencionVenta;
	public JLabel jLabelporcentajeRetencionVenta;
	public JTextField jTextFieldporcentajeRetencionVenta;
	public JButton jButtonporcentajeRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalorRetencionVenta;
	public JLabel jLabelvalorRetencionVenta;
	public JTextField jTextFieldvalorRetencionVenta;
	public JButton jButtonvalorRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoRetencionVenta;
	public JLabel jLabeles_debitoRetencionVenta;
	public JCheckBox jCheckBoxes_debitoRetencionVenta;
	public JButton jButtones_debitoRetencionVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRetencionVenta;
	public JLabel jLabelid_empresaRetencionVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRetencionVenta;
	public JButton jButtonid_empresaRetencionVenta= new JButtonMe();
	public JButton jButtonid_empresaRetencionVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraRetencionVenta;
	public JLabel jLabelid_periodo_declaraRetencionVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraRetencionVenta;
	public JButton jButtonid_periodo_declaraRetencionVenta= new JButtonMe();
	public JButton jButtonid_periodo_declaraRetencionVentaUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraRetencionVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionRetencionVenta;
	public JLabel jLabelid_tipo_retencionRetencionVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionRetencionVenta;
	public JButton jButtonid_tipo_retencionRetencionVenta= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRetencionVenta;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RetencionVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRetencionVenta=new JPanel();
				this.jPanelAccionesFormularioRetencionVenta=new JPanel();
				this.jmenuBarDetalleRetencionVenta=new JMenuBar();
				this.jTtoolBarDetalleRetencionVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RetencionVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRetencionVenta() {
		return this.jButtonActualizarToolBarRetencionVenta;
	}
	
	public JButton getjButtonEliminarToolBarRetencionVenta() {
		return this.jButtonEliminarToolBarRetencionVenta;
	}
	
	public JButton getjButtonCancelarToolBarRetencionVenta() {
		return this.jButtonCancelarToolBarRetencionVenta;
	}		
	
	public JButton getjButtonProcesarInformacionRetencionVenta() {
		return this.jButtonProcesarInformacionRetencionVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionVenta)	{
		this.jButtonProcesarInformacionRetencionVenta = jButtonProcesarInformacionRetencionVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionVenta() {
		return this.jComboBoxTiposAccionesRetencionVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionVenta(
			JComboBox jComboBoxTiposRelacionesRetencionVenta) {
		this.jComboBoxTiposRelacionesRetencionVenta = jComboBoxTiposRelacionesRetencionVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionVenta(
			JComboBox jComboBoxTiposAccionesRetencionVenta) {
		this.jComboBoxTiposAccionesRetencionVenta = jComboBoxTiposAccionesRetencionVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRetencionVenta() {
		return this.jComboBoxTiposAccionesFormularioRetencionVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRetencionVenta(
			JComboBox jComboBoxTiposAccionesFormularioRetencionVenta) {
		this.jComboBoxTiposAccionesFormularioRetencionVenta = jComboBoxTiposAccionesFormularioRetencionVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencionventaSessionBean=new RetencionVentaSessionBean();
		
		this.retencionventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion Venta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
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
	
		RetencionVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencionVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRetencionVenta=new JButtonMe();
				this.jButtonModificarToolBarRetencionVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta,
							"actualizar","actualizar","Actualizar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta,
							"eliminar","eliminar","Eliminar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta,
							"cancelar","cancelar","Cancelar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRetencionVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRetencionVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRetencionVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRetencionVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRetencionVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRetencionVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRetencionVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRetencionVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRetencionVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRetencionVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRetencionVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRetencionVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRetencionVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRetencionVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRetencionVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRetencionVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRetencionVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRetencionVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRetencionVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRetencionVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRetencionVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRetencionVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRetencionVenta.add(this.jMenuItemDetalleCerrarRetencionVenta);
		
		this.jmenuDetalleAccionesRetencionVenta.add(this.jMenuItemActualizarRetencionVenta);
		this.jmenuDetalleAccionesRetencionVenta.add(this.jMenuItemEliminarRetencionVenta);
		this.jmenuDetalleAccionesRetencionVenta.add(this.jMenuItemCancelarRetencionVenta);		
		
		//this.jmenuDetalleDatosRetencionVenta.add(this.jMenuItemDetalleAbrirOrderByRetencionVenta);				
		this.jmenuDetalleDatosRetencionVenta.add(this.jMenuItemDetalleMostarOcultarRetencionVenta);				
				
		//this.jmenuDetalleAccionesRetencionVenta.add(this.jMenuItemGuardarCambiosRetencionVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRetencionVenta.add(this.jmenuDetalleArchivoRetencionVenta);		
		this.jmenuBarDetalleRetencionVenta.add(this.jmenuDetalleAccionesRetencionVenta);		
		this.jmenuBarDetalleRetencionVenta.add(this.jmenuDetalleDatosRetencionVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRetencionVenta);				
	}
	
	
	public void inicializarElementosCamposRetencionVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRetencionVenta = new JLabelMe();
		jLabelIdRetencionVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRetencionVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRetencionVenta= new GridBagLayout();

		this.jPanelidRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);

		jLabelidRetencionVenta = new JLabel();
		jLabelidRetencionVenta.setText("Id");

		jLabelidRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucRetencionVenta = new JLabelMe();
		this.jLabelrucRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucRetencionVenta.setToolTipText("Ruc");
		this.jLabelrucRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelrucRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jTextFieldrucRetencionVenta= new JTextFieldMe();

		jTextFieldrucRetencionVenta.setEnabled(false);
		jTextFieldrucRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucRetencionVentaBusqueda= new JButtonMe();
		this.jButtonrucRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucRetencionVentaBusqueda.setText("U");
		this.jButtonrucRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucRetencionVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionRetencionVenta = new JLabelMe();
		this.jLabelnumero_retencionRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionRetencionVenta.setToolTipText("Nro Retencion");
		this.jLabelnumero_retencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelnumero_retencionRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jTextFieldnumero_retencionRetencionVenta= new JTextFieldMe();

		jTextFieldnumero_retencionRetencionVenta.setEnabled(false);
		jTextFieldnumero_retencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionRetencionVentaBusqueda= new JButtonMe();
		this.jButtonnumero_retencionRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionRetencionVentaBusqueda.setText("U");
		this.jButtonnumero_retencionRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionRetencionVentaBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleRetencionVenta = new JLabelMe();
		this.jLabelbase_imponibleRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleRetencionVenta.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelbase_imponibleRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jTextFieldbase_imponibleRetencionVenta= new JTextFieldMe();
		jTextFieldbase_imponibleRetencionVenta.setEnabled(false);
		jTextFieldbase_imponibleRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleRetencionVenta.setText("0.0");

		this.jButtonbase_imponibleRetencionVentaBusqueda= new JButtonMe();
		this.jButtonbase_imponibleRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleRetencionVentaBusqueda.setText("U");
		this.jButtonbase_imponibleRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleRetencionVentaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeRetencionVenta = new JLabelMe();
		this.jLabelporcentajeRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeRetencionVenta.setToolTipText("Porcentaje");
		this.jLabelporcentajeRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelporcentajeRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jTextFieldporcentajeRetencionVenta= new JTextFieldMe();
		jTextFieldporcentajeRetencionVenta.setEnabled(false);
		jTextFieldporcentajeRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeRetencionVenta.setText("0.0");

		this.jButtonporcentajeRetencionVentaBusqueda= new JButtonMe();
		this.jButtonporcentajeRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeRetencionVentaBusqueda.setText("U");
		this.jButtonporcentajeRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeRetencionVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalorRetencionVenta = new JLabelMe();
		this.jLabelvalorRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRetencionVenta.setToolTipText("Valor");
		this.jLabelvalorRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelvalorRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jTextFieldvalorRetencionVenta= new JTextFieldMe();
		jTextFieldvalorRetencionVenta.setEnabled(false);
		jTextFieldvalorRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRetencionVenta.setText("0.0");

		this.jButtonvalorRetencionVentaBusqueda= new JButtonMe();
		this.jButtonvalorRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRetencionVentaBusqueda.setText("U");
		this.jButtonvalorRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRetencionVentaBusqueda.setVisible(false);		}


					
		this.jLabeles_debitoRetencionVenta = new JLabelMe();
		this.jLabeles_debitoRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoRetencionVenta.setToolTipText("Es Debito");
		this.jLabeles_debitoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPaneles_debitoRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jCheckBoxes_debitoRetencionVenta= new JCheckBoxMe();
		jCheckBoxes_debitoRetencionVenta.setEnabled(false);

		jCheckBoxes_debitoRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoRetencionVentaBusqueda= new JButtonMe();
		this.jButtones_debitoRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoRetencionVentaBusqueda.setText("U");
		this.jButtones_debitoRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoRetencionVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRetencionVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRetencionVenta = new JLabelMe();
		this.jLabelid_empresaRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRetencionVenta.setToolTipText("Empresa");
		this.jLabelid_empresaRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelid_empresaRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jComboBoxid_empresaRetencionVenta= new JComboBoxMe();
		jComboBoxid_empresaRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRetencionVenta.setEnabled(false);

		this.jButtonid_empresaRetencionVenta= new JButtonMe();
		this.jButtonid_empresaRetencionVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencionVenta.setText("Buscar");
		this.jButtonid_empresaRetencionVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRetencionVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionVenta"));

		this.jButtonid_empresaRetencionVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionVentaBusqueda.setText("U");
		this.jButtonid_empresaRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRetencionVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaRetencionVentaUpdate= new JButtonMe();
		this.jButtonid_empresaRetencionVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionVentaUpdate.setText("U");
		this.jButtonid_empresaRetencionVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRetencionVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionVentaUpdate"));



					
		this.jLabelid_periodo_declaraRetencionVenta = new JLabelMe();
		this.jLabelid_periodo_declaraRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraRetencionVenta.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelid_periodo_declaraRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jComboBoxid_periodo_declaraRetencionVenta= new JComboBoxMe();
		jComboBoxid_periodo_declaraRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraRetencionVenta= new JButtonMe();
		this.jButtonid_periodo_declaraRetencionVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraRetencionVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraRetencionVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraRetencionVenta.setText("Buscar");
		this.jButtonid_periodo_declaraRetencionVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraRetencionVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraRetencionVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraRetencionVenta"));

		this.jButtonid_periodo_declaraRetencionVentaBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraRetencionVentaBusqueda.setText("U");
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraRetencionVentaBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraRetencionVentaUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraRetencionVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraRetencionVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraRetencionVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraRetencionVentaUpdate.setText("U");
		this.jButtonid_periodo_declaraRetencionVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraRetencionVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraRetencionVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraRetencionVentaUpdate"));



					
		this.jLabelid_tipo_retencionRetencionVenta = new JLabelMe();
		this.jLabelid_tipo_retencionRetencionVenta.setText(""+RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionRetencionVenta.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionRetencionVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionRetencionVenta.setToolTipText(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutRetencionVenta = new GridBagLayout();
		this.jPanelid_tipo_retencionRetencionVenta.setLayout(this.gridaBagLayoutRetencionVenta);


		jComboBoxid_tipo_retencionRetencionVenta= new JComboBoxMe();
		jComboBoxid_tipo_retencionRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionRetencionVenta= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencionVenta.setText("Buscar");
		this.jButtonid_tipo_retencionRetencionVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionRetencionVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionVenta"));

		this.jButtonid_tipo_retencionRetencionVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionVentaBusqueda.setText("U");
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionVentaBusqueda"));

		if(this.retencionventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionRetencionVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionRetencionVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionVentaUpdate.setText("U");
		this.jButtonid_tipo_retencionRetencionVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionRetencionVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionVentaUpdate"));



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
		//this.jInternalFrameDetalleRetencionVenta = new RetencionVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retencion Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionVenta= new GridBagLayout();
		

		
		String sToolTipRetencionVenta="";
		sToolTipRetencionVenta=RetencionVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionVenta+="(Sris.RetencionVenta)";
		}
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRetencionVenta = new JButtonMe();
		this.jButtonModificarRetencionVenta = new JButtonMe();
        this.jButtonActualizarRetencionVenta = new JButtonMe();
        this.jButtonEliminarRetencionVenta = new JButtonMe();
        this.jButtonCancelarRetencionVenta = new JButtonMe();
        this.jButtonGuardarCambiosRetencionVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaRetencionVenta = new JButtonMe();
		this.jButtonCerrarRetencionVenta = new JButtonMe();
		
		this.jScrollPanelDatosRetencionVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionRetencionVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralRetencionVenta = new JScrollPane();
				
		
		
		this.jPanelCamposRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion Venta";
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRetencionVenta.setName("jPanelCamposRetencionVenta"); 

		this.jPanelCamposOcultosRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRetencionVenta.setName("jPanelCamposOcultosRetencionVenta"); 

        this.jPanelAccionesRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionVenta.setToolTipText("Acciones");
        this.jPanelAccionesRetencionVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRetencionVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRetencionVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRetencionVenta.setText("Nuevo");
		this.jButtonModificarRetencionVenta.setText("Editar");
        this.jButtonActualizarRetencionVenta.setText("Actualizar");
        this.jButtonEliminarRetencionVenta.setText("Eliminar");
        this.jButtonCancelarRetencionVenta.setText("Cancelar");
        this.jButtonGuardarCambiosRetencionVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaRetencionVenta.setText("Guardar");
		this.jButtonCerrarRetencionVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionVenta,"nuevo_button","Nuevo",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRetencionVenta,"modificar_button","Editar",this.retencionventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRetencionVenta,"actualizar_button","Actualizar",this.retencionventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRetencionVenta,"eliminar_button","Eliminar",this.retencionventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRetencionVenta,"cancelar_button","Cancelar",this.retencionventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRetencionVenta,"guardarcambios_button","Guardar",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionVenta,"guardarcambiostabla_button","Guardar",this.retencionventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionVenta,"cerrar_button","Salir",this.retencionventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRetencionVenta.setToolTipText("Nuevo"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRetencionVenta.setToolTipText("Editar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRetencionVenta.setToolTipText("Actualizar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRetencionVenta.setToolTipText("Eliminar)"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRetencionVenta.setToolTipText("Cancelar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRetencionVenta.setToolTipText("Guardar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRetencionVenta.setToolTipText("Guardar"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionVenta.setToolTipText("Salir"+" "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionVenta";
		inputMap = this.jButtonNuevoRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRetencionVenta";
		inputMap = this.jButtonActualizarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRetencionVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarRetencionVenta";
		inputMap = this.jButtonEliminarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRetencionVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarRetencionVenta";
		inputMap = this.jButtonCancelarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRetencionVenta"));
		
		//CERRAR		
		sMapKey = "CerrarRetencionVenta";
		inputMap = this.jButtonCerrarRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionVenta";
		inputMap = this.jButtonGuardarCambiosTablaRetencionVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRetencionVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRetencionVenta.setToolTipText("Nuevo RetencionVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRetencionVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRetencionVenta.setToolTipText("Sin Cerrar Ventana RetencionVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRetencionVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRetencionVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRetencionVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionVenta.setText("Accion");
		this.jComboBoxTiposAccionesRetencionVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRetencionVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRetencionVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRetencionVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRetencionVenta = new JLabelMe();
		
		this.jLabelAccionesRetencionVenta.setText("Acciones");		
		this.jLabelAccionesRetencionVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRetencionVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRetencionVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRetencionVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesRetencionVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRetencionVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRetencionVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRetencionVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencionVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRetencionVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRetencionVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRetencionVenta = new GridBagLayout();
		
		this.jPanelCamposRetencionVenta.setLayout(gridaBagLayoutCamposRetencionVenta);
		this.jPanelCamposOcultosRetencionVenta.setLayout(gridaBagLayoutCamposOcultosRetencionVenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRetencionVenta.add(jLabelIdRetencionVenta, this.gridBagConstraintsRetencionVenta);



	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRetencionVenta.add(jLabelidRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRetencionVenta.add(jLabelid_empresaRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionVenta.add(jButtonid_empresaRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 3;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencionVenta.add(jButtonid_empresaRetencionVentaUpdate, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRetencionVenta.add(jComboBoxid_empresaRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraRetencionVenta.add(jLabelid_periodo_declaraRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraRetencionVenta.add(jButtonid_periodo_declaraRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 3;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraRetencionVenta.add(jButtonid_periodo_declaraRetencionVentaUpdate, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraRetencionVenta.add(jComboBoxid_periodo_declaraRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionRetencionVenta.add(jLabelid_tipo_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionVenta.add(jButtonid_tipo_retencionRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 3;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencionVenta.add(jButtonid_tipo_retencionRetencionVentaUpdate, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionRetencionVenta.add(jComboBoxid_tipo_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucRetencionVenta.add(jLabelrucRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucRetencionVenta.add(jButtonrucRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucRetencionVenta.add(jTextFieldrucRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionRetencionVenta.add(jLabelnumero_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionRetencionVenta.add(jButtonnumero_retencionRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionRetencionVenta.add(jTextFieldnumero_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleRetencionVenta.add(jLabelbase_imponibleRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleRetencionVenta.add(jButtonbase_imponibleRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleRetencionVenta.add(jTextFieldbase_imponibleRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeRetencionVenta.add(jLabelporcentajeRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeRetencionVenta.add(jButtonporcentajeRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeRetencionVenta.add(jTextFieldporcentajeRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRetencionVenta.add(jLabelvalorRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRetencionVenta.add(jButtonvalorRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRetencionVenta.add(jTextFieldvalorRetencionVenta, this.gridBagConstraintsRetencionVenta);


	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 0;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoRetencionVenta.add(jLabeles_debitoRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		//this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = 2;
		this.gridBagConstraintsRetencionVenta.ipadx = 0;
		this.gridBagConstraintsRetencionVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoRetencionVenta.add(jButtones_debitoRetencionVentaBusqueda, this.gridBagConstraintsRetencionVenta);
	}

	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencionVenta.gridy = 0;
	this.gridBagConstraintsRetencionVenta.gridx = 1;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoRetencionVenta.add(jCheckBoxes_debitoRetencionVenta, this.gridBagConstraintsRetencionVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelidRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelid_periodo_declaraRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelid_tipo_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelrucRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelnumero_retencionRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelbase_imponibleRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelporcentajeRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPanelvalorRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRetencionVenta.add(this.jPaneles_debitoRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposRetencionVenta % 1==0) {
		iXPanelCamposRetencionVenta=0;
		iYPanelCamposRetencionVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencionVenta.gridy = iYPanelCamposOcultosRetencionVenta;
	this.gridBagConstraintsRetencionVenta.gridx = iXPanelCamposOcultosRetencionVenta++;
	this.gridBagConstraintsRetencionVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencionVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRetencionVenta.add(this.jPanelid_empresaRetencionVenta, this.gridBagConstraintsRetencionVenta);



	if(iXPanelCamposOcultosRetencionVenta % 1==0) {
		iXPanelCamposOcultosRetencionVenta=0;
		iYPanelCamposOcultosRetencionVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesRetencionVenta= new GridBagLayout();
		this.jPanelAccionesRetencionVenta.setLayout(gridaBagLayoutAccionesRetencionVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRetencionVenta= new GridBagLayout();
		this.jPanelAccionesFormularioRetencionVenta.setLayout(gridaBagLayoutAccionesFormularioRetencionVenta);
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionVenta.add(this.jComboBoxTiposAccionesFormularioRetencionVenta, this.gridBagConstraintsRetencionVenta);

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencionVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencionVenta.add(this.jCheckBoxPostAccionNuevoRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencionVenta.add(this.jCheckBoxPostAccionSinCerrarRetencionVenta, this.gridBagConstraintsRetencionVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencionVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencionVenta.add(this.jCheckBoxPostAccionSinMensajeRetencionVenta, this.gridBagConstraintsRetencionVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesRetencionVenta.add(this.jButtonModificarRetencionVenta, this.gridBagConstraintsRetencionVenta);							

		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionVenta.gridy = 0;
		this.gridBagConstraintsRetencionVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesRetencionVenta.add(this.jButtonEliminarRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = 0;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionVenta.add(this.jButtonActualizarRetencionVenta, this.gridBagConstraintsRetencionVenta);


		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = 0;		
		this.gridBagConstraintsRetencionVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencionVenta.add(this.jButtonGuardarCambiosRetencionVenta, this.gridBagConstraintsRetencionVenta);	
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = 0;		
		this.gridBagConstraintsRetencionVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesRetencionVenta.add(this.jButtonCancelarRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();						
			this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionVenta.gridx = 0;		
			//this.gridBagConstraintsRetencionVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionVenta.gridx =0;
		this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionVenta, this.gridBagConstraintsRetencionVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRetencionVenta = new RetencionVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retencion Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Retencion Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retencion Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RetencionVentaModel retencionventaModel=new RetencionVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//RetencionVentaModel.RetencionVentaFocusTraversalPolicy retencionventaFocusTraversalPolicy = retencionventaModel.new RetencionVentaFocusTraversalPolicy(this);
			
			//retencionventaFocusTraversalPolicy.setretencionventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(retencionventaModel);
			
			
			this.jContentPaneDetalleRetencionVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRetencionVenta = new GridBagLayout();	
			this.jContentPaneDetalleRetencionVenta.setLayout(gridaBagLayoutDetalleRetencionVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
				this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRetencionVenta.gridx = 0;
					
				
				this.jContentPaneDetalleRetencionVenta.add(jTtoolBarDetalleRetencionVenta, gridBagConstraintsRetencionVenta);								
				
}
			
			this.jScrollPanelDatosEdicionRetencionVenta=   new JScrollPane(jContentPaneDetalleRetencionVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRetencionVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRetencionVenta.gridx = 0;
	        
			this.jContentPaneDetalleRetencionVenta.add(jPanelCamposRetencionVenta, gridBagConstraintsRetencionVenta);
			
			
			
			
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
						&& retencionventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRetencionVenta= new GridBagConstraints();
						this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRetencionVenta.gridx = 0;
						this.jContentPaneDetalleRetencionVenta.add(this.jTabbedPaneRelacionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRetencionVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRetencionVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
					this.gridBagConstraintsRetencionVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRetencionVenta.gridx = 0;
					
				
					this.jContentPaneDetalleRetencionVenta.add(jPanelCamposOcultosRetencionVenta, gridBagConstraintsRetencionVenta);
				
					this.jPanelCamposOcultosRetencionVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRetencionVenta.gridx = 0;
	        this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRetencionVenta.add(this.jPanelAccionesFormularioRetencionVenta, this.gridBagConstraintsRetencionVenta);							
			
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
	        this.gridBagConstraintsRetencionVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRetencionVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleRetencionVenta.add(this.jPanelAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRetencionVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRetencionVenta=   new JScrollPane(this.jPanelCamposRetencionVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencionVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencionVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRetencionVenta.gridx = 0;
			this.gridBagConstraintsRetencionVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRetencionVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRetencionVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRetencionVenta, this.gridBagConstraintsRetencionVenta);			
			
			this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
			this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencionVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionVenta, this.gridBagConstraintsRetencionVenta);
			
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionVenta, this.gridBagConstraintsRetencionVenta);
		
			
		this.gridBagConstraintsRetencionVenta = new GridBagConstraints();
		this.gridBagConstraintsRetencionVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionVenta, this.gridBagConstraintsRetencionVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRetencionVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionRetencionVenta;
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
