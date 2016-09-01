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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.DetalleRecapConstantesFunciones;

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
public class DetalleRecapDetalleFormJInternalFrame extends DetalleRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleRecap;
	
	protected JMenuBar jmenuBarDetalleDetalleRecap;
	
	protected JMenu jmenuDetalleDetalleRecap;
	protected JMenu jmenuDetalleArchivoDetalleRecap;
	protected JMenu jmenuDetalleAccionesDetalleRecap;
	protected JMenu jmenuDetalleDatosDetalleRecap;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRecap;	
	protected GridBagConstraints gridBagConstraintsDetalleRecap;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleRecapBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleRecap;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RecapBeanSwingJInternalFrame recapBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_recap="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallecliente="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public DetalleRecapSessionBean detallerecapSessionBean;
	
	
	
	
	public RecapSessionBean recapSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public DetalleClienteSessionBean detalleclienteSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public DetalleRecapLogic detallerecapLogic;
	
	public JScrollPane jScrollPanelDatosDetalleRecap;
	public JScrollPane jScrollPanelDatosEdicionDetalleRecap;
	public JScrollPane jScrollPanelDatosGeneralDetalleRecap;
	
	protected JPanel jPanelCamposDetalleRecap;    
	protected JPanel jPanelCamposOcultosDetalleRecap;    	
	protected JPanel jPanelAccionesDetalleRecap;
	protected JPanel jPanelAccionesFormularioDetalleRecap;
    
	
	
	protected Integer iXPanelCamposDetalleRecap=0;
	protected Integer iYPanelCamposDetalleRecap=0;
	
	protected Integer iXPanelCamposOcultosDetalleRecap=0;
	protected Integer iYPanelCamposOcultosDetalleRecap=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleRecap;
	public JButton jButtonModificarDetalleRecap;
	public JButton jButtonActualizarDetalleRecap;
    public JButton jButtonEliminarDetalleRecap;
	public JButton jButtonCancelarDetalleRecap;
    public JButton jButtonGuardarCambiosDetalleRecap;
	public JButton jButtonGuardarCambiosTablaDetalleRecap;
	protected JButton jButtonCerrarDetalleRecap;
	
	
	protected JButton jButtonProcesarInformacionDetalleRecap;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleRecap;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleRecap;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleRecap;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRecap;
	protected JButton jButtonModificarToolBarDetalleRecap;
	protected JButton jButtonActualizarToolBarDetalleRecap;
    protected JButton jButtonEliminarToolBarDetalleRecap;
	protected JButton jButtonCancelarToolBarDetalleRecap;
    protected JButton jButtonGuardarCambiosToolBarDetalleRecap;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRecap;
	protected JButton jButtonCerrarToolBarDetalleRecap;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRecap;
	protected JMenuItem jMenuItemModificarDetalleRecap;
	protected JMenuItem jMenuItemActualizarDetalleRecap;
    protected JMenuItem jMenuItemEliminarDetalleRecap;
	protected JMenuItem jMenuItemCancelarDetalleRecap;
    protected JMenuItem jMenuItemGuardarCambiosDetalleRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRecap;
	protected JMenuItem jMenuItemCerrarDetalleRecap;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRecap;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRecap;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRecap;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRecap;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleRecap;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleRecap;
	public JLabel jLabelIdDetalleRecap;
	public JLabel jLabelidDetalleRecap;
	public JButton jButtonidDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleRecap;
	public JLabel jLabelvalorDetalleRecap;
	public JTextField jTextFieldvalorDetalleRecap;
	public JButton jButtonvalorDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPaneliva_porcentajeDetalleRecap;
	public JLabel jLabeliva_porcentajeDetalleRecap;
	public JTextField jTextFieldiva_porcentajeDetalleRecap;
	public JButton jButtoniva_porcentajeDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleRecap;
	public JLabel jLabeltotalDetalleRecap;
	public JTextField jTextFieldtotalDetalleRecap;
	public JButton jButtontotalDetalleRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelid_recapDetalleRecap;
	public JLabel jLabelid_recapDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_recapDetalleRecap;
	public JButton jButtonid_recapDetalleRecap= new JButtonMe();
	public JButton jButtonid_recapDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_recapDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleRecap;
	public JLabel jLabelid_empresaDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleRecap;
	public JButton jButtonid_empresaDetalleRecap= new JButtonMe();
	public JButton jButtonid_empresaDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleRecap;
	public JLabel jLabelid_sucursalDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleRecap;
	public JButton jButtonid_sucursalDetalleRecap= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleRecap;
	public JLabel jLabelid_ejercicioDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleRecap;
	public JButton jButtonid_ejercicioDetalleRecap= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_clienteDetalleRecap;
	public JLabel jLabelid_detalle_clienteDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_clienteDetalleRecap;
	public JButton jButtonid_detalle_clienteDetalleRecap= new JButtonMe();
	public JButton jButtonid_detalle_clienteDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_detalle_clienteDetalleRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleRecap;
	public JLabel jLabelid_clienteDetalleRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleRecap;
	public JButton jButtonid_clienteDetalleRecap= new JButtonMe();
	public JButton jButtonid_clienteDetalleRecapUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleRecapBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleRecap;
	
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
	
	public DetalleRecapDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleRecap=new JPanel();
				this.jPanelAccionesFormularioDetalleRecap=new JPanel();
				this.jmenuBarDetalleDetalleRecap=new JMenuBar();
				this.jTtoolBarDetalleDetalleRecap=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleRecapDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRecapDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleRecap() {
		return this.jButtonActualizarToolBarDetalleRecap;
	}
	
	public JButton getjButtonEliminarToolBarDetalleRecap() {
		return this.jButtonEliminarToolBarDetalleRecap;
	}
	
	public JButton getjButtonCancelarToolBarDetalleRecap() {
		return this.jButtonCancelarToolBarDetalleRecap;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleRecap() {
		return this.jButtonProcesarInformacionDetalleRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRecap)	{
		this.jButtonProcesarInformacionDetalleRecap = jButtonProcesarInformacionDetalleRecap;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRecap() {
		return this.jComboBoxTiposAccionesDetalleRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRecap(
			JComboBox jComboBoxTiposRelacionesDetalleRecap) {
		this.jComboBoxTiposRelacionesDetalleRecap = jComboBoxTiposRelacionesDetalleRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRecap(
			JComboBox jComboBoxTiposAccionesDetalleRecap) {
		this.jComboBoxTiposAccionesDetalleRecap = jComboBoxTiposAccionesDetalleRecap;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleRecap() {
		return this.jComboBoxTiposAccionesFormularioDetalleRecap;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleRecap(
			JComboBox jComboBoxTiposAccionesFormularioDetalleRecap) {
		this.jComboBoxTiposAccionesFormularioDetalleRecap = jComboBoxTiposAccionesFormularioDetalleRecap;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallerecapSessionBean=new DetalleRecapSessionBean();
		
		this.detallerecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerecapSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Recap MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleRecap= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleRecap=new JButtonMe();
				this.jButtonModificarToolBarDetalleRecap=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap,
							"actualizar","actualizar","Actualizar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap,
							"eliminar","eliminar","Eliminar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap,
							"cancelar","cancelar","Cancelar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleRecap,this.jTtoolBarDetalleDetalleRecap,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleRecap=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleRecap=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleRecap=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleRecap=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleRecap=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleRecap= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleRecap.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleRecap,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleRecap= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleRecap.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleRecap,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleRecap= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleRecap.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleRecap,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleRecap= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleRecap.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleRecap,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleRecap.add(this.jMenuItemDetalleCerrarDetalleRecap);
		
		this.jmenuDetalleAccionesDetalleRecap.add(this.jMenuItemActualizarDetalleRecap);
		this.jmenuDetalleAccionesDetalleRecap.add(this.jMenuItemEliminarDetalleRecap);
		this.jmenuDetalleAccionesDetalleRecap.add(this.jMenuItemCancelarDetalleRecap);		
		
		//this.jmenuDetalleDatosDetalleRecap.add(this.jMenuItemDetalleAbrirOrderByDetalleRecap);				
		this.jmenuDetalleDatosDetalleRecap.add(this.jMenuItemDetalleMostarOcultarDetalleRecap);				
				
		//this.jmenuDetalleAccionesDetalleRecap.add(this.jMenuItemGuardarCambiosDetalleRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleRecap.add(this.jmenuDetalleArchivoDetalleRecap);		
		this.jmenuBarDetalleDetalleRecap.add(this.jmenuDetalleAccionesDetalleRecap);		
		this.jmenuBarDetalleDetalleRecap.add(this.jmenuDetalleDatosDetalleRecap);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleRecap);				
	}
	
	
	public void inicializarElementosCamposDetalleRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleRecap = new JLabelMe();
		jLabelIdDetalleRecap.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleRecap = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleRecap= new GridBagLayout();

		this.jPanelidDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);

		jLabelidDetalleRecap = new JLabel();
		jLabelidDetalleRecap.setText("Id");

		jLabelidDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetalleRecap = new JLabelMe();
		this.jLabelvalorDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleRecap.setToolTipText("Valor");
		this.jLabelvalorDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelvalorDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jTextFieldvalorDetalleRecap= new JTextFieldMe();
		jTextFieldvalorDetalleRecap.setEnabled(false);
		jTextFieldvalorDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleRecap.setText("0.0");

		this.jButtonvalorDetalleRecapBusqueda= new JButtonMe();
		this.jButtonvalorDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleRecapBusqueda.setText("U");
		this.jButtonvalorDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleRecapBusqueda.setVisible(false);		}


					
		this.jLabeliva_porcentajeDetalleRecap = new JLabelMe();
		this.jLabeliva_porcentajeDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE+" : *");
		this.jLabeliva_porcentajeDetalleRecap.setToolTipText("Iva Porcentaje");
		this.jLabeliva_porcentajeDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_porcentajeDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_porcentajeDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_porcentajeDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IVAPORCENTAJE);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPaneliva_porcentajeDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jTextFieldiva_porcentajeDetalleRecap= new JTextFieldMe();
		jTextFieldiva_porcentajeDetalleRecap.setEnabled(false);
		jTextFieldiva_porcentajeDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_porcentajeDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_porcentajeDetalleRecap.setText("0.0");

		this.jButtoniva_porcentajeDetalleRecapBusqueda= new JButtonMe();
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_porcentajeDetalleRecapBusqueda.setText("U");
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_porcentajeDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_porcentajeDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_porcentajeDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_porcentajeDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_porcentajeDetalleRecapBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleRecap = new JLabelMe();
		this.jLabeltotalDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleRecap.setToolTipText("Total");
		this.jLabeltotalDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPaneltotalDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jTextFieldtotalDetalleRecap= new JTextFieldMe();
		jTextFieldtotalDetalleRecap.setEnabled(false);
		jTextFieldtotalDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleRecap.setText("0.0");

		this.jButtontotalDetalleRecapBusqueda= new JButtonMe();
		this.jButtontotalDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleRecapBusqueda.setText("U");
		this.jButtontotalDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleRecapBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_recapDetalleRecap = new JLabelMe();
		this.jLabelid_recapDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDRECAP+" : *");
		this.jLabelid_recapDetalleRecap.setToolTipText("Recap");
		this.jLabelid_recapDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_recapDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_recapDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_recapDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_recapDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_recapDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDRECAP);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_recapDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_recapDetalleRecap= new JComboBoxMe();
		jComboBoxid_recapDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_recapDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_recapDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_recapDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_recapDetalleRecap= new JButtonMe();
		this.jButtonid_recapDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_recapDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_recapDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_recapDetalleRecap.setText("Buscar");
		this.jButtonid_recapDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_recapDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_recapDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_recapDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_recapDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_recapDetalleRecap"));

		this.jButtonid_recapDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_recapDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_recapDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_recapDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_recapDetalleRecapBusqueda.setText("U");
		this.jButtonid_recapDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_recapDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_recapDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_recapDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_recapDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_recapDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_recapDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_recapDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_recapDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_recapDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_recapDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_recapDetalleRecapUpdate.setText("U");
		this.jButtonid_recapDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_recapDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_recapDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_recapDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_recapDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_recapDetalleRecapUpdate"));



					
		this.jLabelid_empresaDetalleRecap = new JLabelMe();
		this.jLabelid_empresaDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleRecap.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_empresaDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_empresaDetalleRecap= new JComboBoxMe();
		jComboBoxid_empresaDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleRecap.setEnabled(false);

		this.jButtonid_empresaDetalleRecap= new JButtonMe();
		this.jButtonid_empresaDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRecap.setText("Buscar");
		this.jButtonid_empresaDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRecap"));

		this.jButtonid_empresaDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRecapBusqueda.setText("U");
		this.jButtonid_empresaDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRecapUpdate.setText("U");
		this.jButtonid_empresaDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRecapUpdate"));



					
		this.jLabelid_sucursalDetalleRecap = new JLabelMe();
		this.jLabelid_sucursalDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleRecap.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_sucursalDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_sucursalDetalleRecap= new JComboBoxMe();
		jComboBoxid_sucursalDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleRecap.setEnabled(false);

		this.jButtonid_sucursalDetalleRecap= new JButtonMe();
		this.jButtonid_sucursalDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRecap.setText("Buscar");
		this.jButtonid_sucursalDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRecap"));

		this.jButtonid_sucursalDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRecapBusqueda.setText("U");
		this.jButtonid_sucursalDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRecapUpdate.setText("U");
		this.jButtonid_sucursalDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRecapUpdate"));



					
		this.jLabelid_ejercicioDetalleRecap = new JLabelMe();
		this.jLabelid_ejercicioDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleRecap.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_ejercicioDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_ejercicioDetalleRecap= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleRecap.setEnabled(false);

		this.jButtonid_ejercicioDetalleRecap= new JButtonMe();
		this.jButtonid_ejercicioDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRecap.setText("Buscar");
		this.jButtonid_ejercicioDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRecap"));

		this.jButtonid_ejercicioDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRecapBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRecapUpdate.setText("U");
		this.jButtonid_ejercicioDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRecapUpdate"));



					
		this.jLabelid_detalle_clienteDetalleRecap = new JLabelMe();
		this.jLabelid_detalle_clienteDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE+" : *");
		this.jLabelid_detalle_clienteDetalleRecap.setToolTipText("Detalle Cliente");
		this.jLabelid_detalle_clienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_clienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_clienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_clienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_clienteDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_clienteDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDDETALLECLIENTE);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_detalle_clienteDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_detalle_clienteDetalleRecap= new JComboBoxMe();
		jComboBoxid_detalle_clienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_clienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_clienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_clienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_clienteDetalleRecap= new JButtonMe();
		this.jButtonid_detalle_clienteDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_clienteDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_clienteDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_clienteDetalleRecap.setText("Buscar");
		this.jButtonid_detalle_clienteDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_clienteDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_clienteDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_clienteDetalleRecap"));

		this.jButtonid_detalle_clienteDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_clienteDetalleRecapBusqueda.setText("U");
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_clienteDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_clienteDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_clienteDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_detalle_clienteDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_detalle_clienteDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_clienteDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_clienteDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_clienteDetalleRecapUpdate.setText("U");
		this.jButtonid_detalle_clienteDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_clienteDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_clienteDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_clienteDetalleRecapUpdate"));



					
		this.jLabelid_clienteDetalleRecap = new JLabelMe();
		this.jLabelid_clienteDetalleRecap.setText(""+DetalleRecapConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleRecap.setToolTipText("Cliente");
		this.jLabelid_clienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleRecap.setToolTipText(DetalleRecapConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleRecap = new GridBagLayout();
		this.jPanelid_clienteDetalleRecap.setLayout(this.gridaBagLayoutDetalleRecap);


		jComboBoxid_clienteDetalleRecap= new JComboBoxMe();
		jComboBoxid_clienteDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleRecap= new JButtonMe();
		this.jButtonid_clienteDetalleRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleRecap.setText("Buscar");
		this.jButtonid_clienteDetalleRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleRecap"));

		this.jButtonid_clienteDetalleRecapBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleRecapBusqueda.setText("U");
		this.jButtonid_clienteDetalleRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleRecapBusqueda"));

		if(this.detallerecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleRecapBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleRecapUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleRecapUpdate.setText("U");
		this.jButtonid_clienteDetalleRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleRecapUpdate"));



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
		//this.jInternalFrameDetalleDetalleRecap = new DetalleRecapBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Recap DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRecap= new GridBagLayout();
		

		
		String sToolTipDetalleRecap="";
		sToolTipDetalleRecap=DetalleRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRecap+="(Cartera.DetalleRecap)";
		}
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRecap+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleRecap = new JButtonMe();
		this.jButtonModificarDetalleRecap = new JButtonMe();
        this.jButtonActualizarDetalleRecap = new JButtonMe();
        this.jButtonEliminarDetalleRecap = new JButtonMe();
        this.jButtonCancelarDetalleRecap = new JButtonMe();
        this.jButtonGuardarCambiosDetalleRecap = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleRecap = new JButtonMe();
		this.jButtonCerrarDetalleRecap = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRecap = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleRecap = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleRecap = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Recap";
		
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleRecap.setName("jPanelCamposDetalleRecap"); 

		this.jPanelCamposOcultosDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleRecap.setName("jPanelCamposOcultosDetalleRecap"); 

        this.jPanelAccionesDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRecap.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRecap.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleRecap.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleRecap.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleRecap.setText("Nuevo");
		this.jButtonModificarDetalleRecap.setText("Editar");
        this.jButtonActualizarDetalleRecap.setText("Actualizar");
        this.jButtonEliminarDetalleRecap.setText("Eliminar");
        this.jButtonCancelarDetalleRecap.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleRecap.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleRecap.setText("Guardar");
		this.jButtonCerrarDetalleRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRecap,"nuevo_button","Nuevo",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleRecap,"modificar_button","Editar",this.detallerecapSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleRecap,"actualizar_button","Actualizar",this.detallerecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleRecap,"eliminar_button","Eliminar",this.detallerecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleRecap,"cancelar_button","Cancelar",this.detallerecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleRecap,"guardarcambios_button","Guardar",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRecap,"guardarcambiostabla_button","Guardar",this.detallerecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRecap,"cerrar_button","Salir",this.detallerecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleRecap.setToolTipText("Nuevo"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleRecap.setToolTipText("Editar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleRecap.setToolTipText("Actualizar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleRecap.setToolTipText("Eliminar)"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleRecap.setToolTipText("Cancelar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleRecap.setToolTipText("Guardar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleRecap.setToolTipText("Guardar"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRecap.setToolTipText("Salir"+" "+DetalleRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRecap";
		inputMap = this.jButtonNuevoDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRecap"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleRecap";
		inputMap = this.jButtonActualizarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleRecap"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleRecap";
		inputMap = this.jButtonEliminarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleRecap"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleRecap";
		inputMap = this.jButtonCancelarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleRecap"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleRecap";
		inputMap = this.jButtonCerrarDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRecap";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRecap"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleRecap.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleRecap.setToolTipText("Nuevo DetalleRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleRecap.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleRecap.setToolTipText("Sin Cerrar Ventana DetalleRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleRecap.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleRecap.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRecap.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRecap.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleRecap.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleRecap.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleRecap = new JLabelMe();
		
		this.jLabelAccionesDetalleRecap.setText("Acciones");		
		this.jLabelAccionesDetalleRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleRecap();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleRecap();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleRecap=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRecap.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleRecap, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleRecap = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleRecap = new GridBagLayout();
		
		this.jPanelCamposDetalleRecap.setLayout(gridaBagLayoutCamposDetalleRecap);
		this.jPanelCamposOcultosDetalleRecap.setLayout(gridaBagLayoutCamposOcultosDetalleRecap);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleRecap.add(jLabelIdDetalleRecap, this.gridBagConstraintsDetalleRecap);



	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleRecap.add(jLabelidDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_recapDetalleRecap.add(jLabelid_recapDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_recapDetalleRecap.add(jButtonid_recapDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_recapDetalleRecap.add(jButtonid_recapDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_recapDetalleRecap.add(jComboBoxid_recapDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleRecap.add(jLabelid_empresaDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRecap.add(jButtonid_empresaDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRecap.add(jButtonid_empresaDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleRecap.add(jComboBoxid_empresaDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleRecap.add(jLabelid_sucursalDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRecap.add(jButtonid_sucursalDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRecap.add(jButtonid_sucursalDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleRecap.add(jComboBoxid_sucursalDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleRecap.add(jLabelid_ejercicioDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRecap.add(jButtonid_ejercicioDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRecap.add(jButtonid_ejercicioDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleRecap.add(jComboBoxid_ejercicioDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_clienteDetalleRecap.add(jLabelid_detalle_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_clienteDetalleRecap.add(jButtonid_detalle_clienteDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_clienteDetalleRecap.add(jButtonid_detalle_clienteDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_clienteDetalleRecap.add(jComboBoxid_detalle_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteDetalleRecap.add(jLabelid_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 2;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleRecap.add(jButtonid_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 3;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleRecap.add(jButtonid_clienteDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 4;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleRecap.add(jButtonid_clienteDetalleRecapUpdate, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteDetalleRecap.add(jComboBoxid_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleRecap.add(jLabelvalorDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleRecap.add(jButtonvalorDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleRecap.add(jTextFieldvalorDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_porcentajeDetalleRecap.add(jLabeliva_porcentajeDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_porcentajeDetalleRecap.add(jButtoniva_porcentajeDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_porcentajeDetalleRecap.add(jTextFieldiva_porcentajeDetalleRecap, this.gridBagConstraintsDetalleRecap);


	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 0;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleRecap.add(jLabeltotalDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = 2;
		this.gridBagConstraintsDetalleRecap.ipadx = 0;
		this.gridBagConstraintsDetalleRecap.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleRecap.add(jButtontotalDetalleRecapBusqueda, this.gridBagConstraintsDetalleRecap);
	}

	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRecap.gridy = 0;
	this.gridBagConstraintsDetalleRecap.gridx = 1;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleRecap.add(jTextFieldtotalDetalleRecap, this.gridBagConstraintsDetalleRecap);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPanelidDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPanelid_recapDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPanelid_detalle_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPanelid_clienteDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPanelvalorDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPaneliva_porcentajeDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRecap.add(this.jPaneltotalDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposDetalleRecap % 1==0) {
		iXPanelCamposDetalleRecap=0;
		iYPanelCamposDetalleRecap++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposOcultosDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposOcultosDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRecap.add(this.jPanelid_empresaDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposOcultosDetalleRecap % 1==0) {
		iXPanelCamposOcultosDetalleRecap=0;
		iYPanelCamposOcultosDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposOcultosDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposOcultosDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRecap.add(this.jPanelid_sucursalDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposOcultosDetalleRecap % 1==0) {
		iXPanelCamposOcultosDetalleRecap=0;
		iYPanelCamposOcultosDetalleRecap++;
	}
	this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRecap.gridy = iYPanelCamposOcultosDetalleRecap;
	this.gridBagConstraintsDetalleRecap.gridx = iXPanelCamposOcultosDetalleRecap++;
	this.gridBagConstraintsDetalleRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRecap.add(this.jPanelid_ejercicioDetalleRecap, this.gridBagConstraintsDetalleRecap);



	if(iXPanelCamposOcultosDetalleRecap % 1==0) {
		iXPanelCamposOcultosDetalleRecap=0;
		iYPanelCamposOcultosDetalleRecap++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleRecap= new GridBagLayout();
		this.jPanelAccionesDetalleRecap.setLayout(gridaBagLayoutAccionesDetalleRecap);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleRecap= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleRecap.setLayout(gridaBagLayoutAccionesFormularioDetalleRecap);
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRecap.add(this.jComboBoxTiposAccionesFormularioDetalleRecap, this.gridBagConstraintsDetalleRecap);

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRecap.add(this.jCheckBoxPostAccionNuevoDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRecap.add(this.jCheckBoxPostAccionSinCerrarDetalleRecap, this.gridBagConstraintsDetalleRecap);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallerecapSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallerecapSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRecap.add(this.jCheckBoxPostAccionSinMensajeDetalleRecap, this.gridBagConstraintsDetalleRecap);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleRecap.add(this.jButtonModificarDetalleRecap, this.gridBagConstraintsDetalleRecap);							

		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRecap.gridy = 0;
		this.gridBagConstraintsDetalleRecap.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleRecap.add(this.jButtonEliminarDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = 0;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRecap.add(this.jButtonActualizarDetalleRecap, this.gridBagConstraintsDetalleRecap);


		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = 0;		
		this.gridBagConstraintsDetalleRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRecap.add(this.jButtonGuardarCambiosDetalleRecap, this.gridBagConstraintsDetalleRecap);	
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = 0;		
		this.gridBagConstraintsDetalleRecap.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleRecap.add(this.jButtonCancelarDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRecap);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRecap.gridx = 0;		
			//this.gridBagConstraintsDetalleRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRecap.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRecap.gridx =0;
		this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRecap, this.gridBagConstraintsDetalleRecap);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleRecapJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleRecap = new DetalleRecapBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Recap DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Recap DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Recap Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleRecapModel detallerecapModel=new DetalleRecapModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleRecapModel.DetalleRecapFocusTraversalPolicy detallerecapFocusTraversalPolicy = detallerecapModel.new DetalleRecapFocusTraversalPolicy(this);
			
			//detallerecapFocusTraversalPolicy.setdetallerecapJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallerecapModel);
			
			
			this.jContentPaneDetalleDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleRecap = new GridBagLayout();	
			this.jContentPaneDetalleDetalleRecap.setLayout(gridaBagLayoutDetalleDetalleRecap);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRecap = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
				this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleRecap.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleRecap.add(jTtoolBarDetalleDetalleRecap, gridBagConstraintsDetalleRecap);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleRecap=   new JScrollPane(jContentPaneDetalleDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleRecap.gridx = 0;
	        
			this.jContentPaneDetalleDetalleRecap.add(jPanelCamposDetalleRecap, gridBagConstraintsDetalleRecap);
			
			
			
			
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
						&& detallerecapSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallerecapSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleRecap= new GridBagConstraints();
						this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleRecap.gridx = 0;
						this.jContentPaneDetalleDetalleRecap.add(this.jTabbedPaneRelacionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleRecap.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleRecap.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
					this.gridBagConstraintsDetalleRecap.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleRecap.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleRecap.add(jPanelCamposOcultosDetalleRecap, gridBagConstraintsDetalleRecap);
				
					this.jPanelCamposOcultosDetalleRecap.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleRecap.gridx = 0;
	        this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleRecap.add(this.jPanelAccionesFormularioDetalleRecap, this.gridBagConstraintsDetalleRecap);							
			
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
	        this.gridBagConstraintsDetalleRecap.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleRecap.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleRecap.add(this.jPanelAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleRecap);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleRecap=   new JScrollPane(this.jPanelCamposDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRecap.gridx = 0;
			this.gridBagConstraintsDetalleRecap.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleRecap.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleRecap.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleRecap, this.gridBagConstraintsDetalleRecap);			
			
			this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
			this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRecap, this.gridBagConstraintsDetalleRecap);
			
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRecap, this.gridBagConstraintsDetalleRecap);
		
			
		this.gridBagConstraintsDetalleRecap = new GridBagConstraints();
		this.gridBagConstraintsDetalleRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRecap, this.gridBagConstraintsDetalleRecap);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleRecap;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleRecap;
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
