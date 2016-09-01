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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.BodegaSucursalConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class BodegaSucursalDetalleFormJInternalFrame extends BodegaSucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBodegaSucursal;
	
	protected JMenuBar jmenuBarDetalleBodegaSucursal;
	
	protected JMenu jmenuDetalleBodegaSucursal;
	protected JMenu jmenuDetalleArchivoBodegaSucursal;
	protected JMenu jmenuDetalleAccionesBodegaSucursal;
	protected JMenu jmenuDetalleDatosBodegaSucursal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodegaSucursal;	
	protected GridBagConstraints gridBagConstraintsBodegaSucursal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BodegaSucursalBeanSwingJInternalFrameAdditional jInternalFrameDetalleBodegaSucursal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";
	
	public BodegaSucursalSessionBean bodegasucursalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;	
	
	public BodegaSucursalLogic bodegasucursalLogic;
	
	public JScrollPane jScrollPanelDatosBodegaSucursal;
	public JScrollPane jScrollPanelDatosEdicionBodegaSucursal;
	public JScrollPane jScrollPanelDatosGeneralBodegaSucursal;
	
	protected JPanel jPanelCamposBodegaSucursal;    
	protected JPanel jPanelCamposOcultosBodegaSucursal;    	
	protected JPanel jPanelAccionesBodegaSucursal;
	protected JPanel jPanelAccionesFormularioBodegaSucursal;
    
	
	
	protected Integer iXPanelCamposBodegaSucursal=0;
	protected Integer iYPanelCamposBodegaSucursal=0;
	
	protected Integer iXPanelCamposOcultosBodegaSucursal=0;
	protected Integer iYPanelCamposOcultosBodegaSucursal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBodegaSucursal;
	public JButton jButtonModificarBodegaSucursal;
	public JButton jButtonActualizarBodegaSucursal;
    public JButton jButtonEliminarBodegaSucursal;
	public JButton jButtonCancelarBodegaSucursal;
    public JButton jButtonGuardarCambiosBodegaSucursal;
	public JButton jButtonGuardarCambiosTablaBodegaSucursal;
	protected JButton jButtonCerrarBodegaSucursal;
	
	
	protected JButton jButtonProcesarInformacionBodegaSucursal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBodegaSucursal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBodegaSucursal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBodegaSucursal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodegaSucursal;
	protected JButton jButtonModificarToolBarBodegaSucursal;
	protected JButton jButtonActualizarToolBarBodegaSucursal;
    protected JButton jButtonEliminarToolBarBodegaSucursal;
	protected JButton jButtonCancelarToolBarBodegaSucursal;
    protected JButton jButtonGuardarCambiosToolBarBodegaSucursal;
	protected JButton jButtonGuardarCambiosTablaToolBarBodegaSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarBodegaSucursal;
	protected JButton jButtonCerrarToolBarBodegaSucursal;
	
	protected JButton jButtonProcesarInformacionToolBarBodegaSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodegaSucursal;
	protected JMenuItem jMenuItemModificarBodegaSucursal;
	protected JMenuItem jMenuItemActualizarBodegaSucursal;
    protected JMenuItem jMenuItemEliminarBodegaSucursal;
	protected JMenuItem jMenuItemCancelarBodegaSucursal;
    protected JMenuItem jMenuItemGuardarCambiosBodegaSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodegaSucursal;
	protected JMenuItem jMenuItemCerrarBodegaSucursal;
	protected JMenuItem jMenuItemDetalleCerrarBodegaSucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodegaSucursal;
	
	protected JMenuItem jMenuItemProcesarInformacionBodegaSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodegaSucursal;
	protected JMenuItem jMenuItemMostrarOcultarBodegaSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodegaSucursal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodegaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodegaSucursal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBodegaSucursal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBodegaSucursal;
	public JLabel jLabelIdBodegaSucursal;
	public JLabel jLabelidBodegaSucursal;
	public JButton jButtonidBodegaSucursalBusqueda= new JButtonMe();

	public JPanel jPanelsecuenciaBodegaSucursal;
	public JLabel jLabelsecuenciaBodegaSucursal;
	public JTextField jTextFieldsecuenciaBodegaSucursal;
	public JButton jButtonsecuenciaBodegaSucursalBusqueda= new JButtonMe();

	public JPanel jPaneltamanioBodegaSucursal;
	public JLabel jLabeltamanioBodegaSucursal;
	public JTextField jTextFieldtamanioBodegaSucursal;
	public JButton jButtontamanioBodegaSucursalBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionBodegaSucursal;
	public JLabel jLabeldescripcionBodegaSucursal;
	public JTextArea jTextAreadescripcionBodegaSucursal;
	public JScrollPane jscrollPanedescripcionBodegaSucursal;
	public JButton jButtondescripcionBodegaSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBodegaSucursal;
	public JLabel jLabelid_empresaBodegaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBodegaSucursal;
	public JButton jButtonid_empresaBodegaSucursal= new JButtonMe();
	public JButton jButtonid_empresaBodegaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_empresaBodegaSucursalBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBodegaSucursal;
	public JLabel jLabelid_sucursalBodegaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBodegaSucursal;
	public JButton jButtonid_sucursalBodegaSucursal= new JButtonMe();
	public JButton jButtonid_sucursalBodegaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBodegaSucursalBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaBodegaSucursal;
	public JLabel jLabelid_bodegaBodegaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBodegaSucursal;
	public JButton jButtonid_bodegaBodegaSucursal= new JButtonMe();
	public JButton jButtonid_bodegaBodegaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBodegaSucursalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBodegaSucursal;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BodegaSucursalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBodegaSucursal=new JPanel();
				this.jPanelAccionesFormularioBodegaSucursal=new JPanel();
				this.jmenuBarDetalleBodegaSucursal=new JMenuBar();
				this.jTtoolBarDetalleBodegaSucursal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BodegaSucursalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBodegaSucursal() {
		return this.jButtonActualizarToolBarBodegaSucursal;
	}
	
	public JButton getjButtonEliminarToolBarBodegaSucursal() {
		return this.jButtonEliminarToolBarBodegaSucursal;
	}
	
	public JButton getjButtonCancelarToolBarBodegaSucursal() {
		return this.jButtonCancelarToolBarBodegaSucursal;
	}		
	
	public JButton getjButtonProcesarInformacionBodegaSucursal() {
		return this.jButtonProcesarInformacionBodegaSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodegaSucursal)	{
		this.jButtonProcesarInformacionBodegaSucursal = jButtonProcesarInformacionBodegaSucursal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBodegaSucursal() {
		return this.jComboBoxTiposAccionesBodegaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBodegaSucursal(
			JComboBox jComboBoxTiposRelacionesBodegaSucursal) {
		this.jComboBoxTiposRelacionesBodegaSucursal = jComboBoxTiposRelacionesBodegaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBodegaSucursal(
			JComboBox jComboBoxTiposAccionesBodegaSucursal) {
		this.jComboBoxTiposAccionesBodegaSucursal = jComboBoxTiposAccionesBodegaSucursal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBodegaSucursal() {
		return this.jComboBoxTiposAccionesFormularioBodegaSucursal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBodegaSucursal(
			JComboBox jComboBoxTiposAccionesFormularioBodegaSucursal) {
		this.jComboBoxTiposAccionesFormularioBodegaSucursal = jComboBoxTiposAccionesFormularioBodegaSucursal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		
		this.bodegasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegasucursalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BodegaSucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bodega Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
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
	
		BodegaSucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBodegaSucursal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBodegaSucursal=new JButtonMe();
				this.jButtonModificarToolBarBodegaSucursal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal,
							"actualizar","actualizar","Actualizar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal,
							"eliminar","eliminar","Eliminar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal,
							"cancelar","cancelar","Cancelar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal,
							"guardarcambios","guardarcambios","Guardar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBodegaSucursal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBodegaSucursal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBodegaSucursal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBodegaSucursal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBodegaSucursal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodegaSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodegaSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodegaSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBodegaSucursal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBodegaSucursal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBodegaSucursal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBodegaSucursal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBodegaSucursal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBodegaSucursal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBodegaSucursal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBodegaSucursal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBodegaSucursal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBodegaSucursal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBodegaSucursal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBodegaSucursal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBodegaSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodegaSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodegaSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodegaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodegaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodegaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBodegaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBodegaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBodegaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodegaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodegaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodegaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodegaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodegaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodegaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBodegaSucursal.add(this.jMenuItemDetalleCerrarBodegaSucursal);
		
		this.jmenuDetalleAccionesBodegaSucursal.add(this.jMenuItemActualizarBodegaSucursal);
		this.jmenuDetalleAccionesBodegaSucursal.add(this.jMenuItemEliminarBodegaSucursal);
		this.jmenuDetalleAccionesBodegaSucursal.add(this.jMenuItemCancelarBodegaSucursal);		
		
		//this.jmenuDetalleDatosBodegaSucursal.add(this.jMenuItemDetalleAbrirOrderByBodegaSucursal);				
		this.jmenuDetalleDatosBodegaSucursal.add(this.jMenuItemDetalleMostarOcultarBodegaSucursal);				
				
		//this.jmenuDetalleAccionesBodegaSucursal.add(this.jMenuItemGuardarCambiosBodegaSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBodegaSucursal.add(this.jmenuDetalleArchivoBodegaSucursal);		
		this.jmenuBarDetalleBodegaSucursal.add(this.jmenuDetalleAccionesBodegaSucursal);		
		this.jmenuBarDetalleBodegaSucursal.add(this.jmenuDetalleDatosBodegaSucursal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBodegaSucursal);				
	}
	
	
	public void inicializarElementosCamposBodegaSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBodegaSucursal = new JLabelMe();
		jLabelIdBodegaSucursal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBodegaSucursal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBodegaSucursal= new GridBagLayout();

		this.jPanelidBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);

		jLabelidBodegaSucursal = new JLabel();
		jLabelidBodegaSucursal.setText("Id");

		jLabelidBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuenciaBodegaSucursal = new JLabelMe();
		this.jLabelsecuenciaBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_SECUENCIA+" : *");
		this.jLabelsecuenciaBodegaSucursal.setToolTipText("Secuencia");
		this.jLabelsecuenciaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuenciaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuenciaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuenciaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuenciaBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuenciaBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPanelsecuenciaBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jTextFieldsecuenciaBodegaSucursal= new JTextFieldMe();
		jTextFieldsecuenciaBodegaSucursal.setEnabled(false);
		jTextFieldsecuenciaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuenciaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuenciaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuenciaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuenciaBodegaSucursal.setText("0");

		this.jButtonsecuenciaBodegaSucursalBusqueda= new JButtonMe();
		this.jButtonsecuenciaBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuenciaBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuenciaBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuenciaBodegaSucursalBusqueda.setText("U");
		this.jButtonsecuenciaBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuenciaBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuenciaBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuenciaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuenciaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuenciaBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuenciaBodegaSucursalBusqueda.setVisible(false);		}


					
		this.jLabeltamanioBodegaSucursal = new JLabelMe();
		this.jLabeltamanioBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_TAMANIO+" : *");
		this.jLabeltamanioBodegaSucursal.setToolTipText("Tamanio");
		this.jLabeltamanioBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltamanioBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltamanioBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltamanioBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltamanioBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltamanioBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_TAMANIO);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPaneltamanioBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jTextFieldtamanioBodegaSucursal= new JTextFieldMe();
		jTextFieldtamanioBodegaSucursal.setEnabled(false);
		jTextFieldtamanioBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtamanioBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtamanioBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtamanioBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtamanioBodegaSucursal.setText("0");

		this.jButtontamanioBodegaSucursalBusqueda= new JButtonMe();
		this.jButtontamanioBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontamanioBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontamanioBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontamanioBodegaSucursalBusqueda.setText("U");
		this.jButtontamanioBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontamanioBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontamanioBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtamanioBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtamanioBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tamanioBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontamanioBodegaSucursalBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionBodegaSucursal = new JLabelMe();
		this.jLabeldescripcionBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionBodegaSucursal.setToolTipText("Descripcion");
		this.jLabeldescripcionBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPaneldescripcionBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jTextAreadescripcionBodegaSucursal= new JTextAreaMe();
		jTextAreadescripcionBodegaSucursal.setEnabled(false);
		jTextAreadescripcionBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaSucursal.setLineWrap(true);
		jTextAreadescripcionBodegaSucursal.setWrapStyleWord(true);
		jTextAreadescripcionBodegaSucursal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionBodegaSucursal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionBodegaSucursal = new JScrollPane(jTextAreadescripcionBodegaSucursal);
		jscrollPanedescripcionBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionBodegaSucursalBusqueda= new JButtonMe();
		this.jButtondescripcionBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionBodegaSucursalBusqueda.setText("U");
		this.jButtondescripcionBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionBodegaSucursalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBodegaSucursal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBodegaSucursal = new JLabelMe();
		this.jLabelid_empresaBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBodegaSucursal.setToolTipText("Empresa");
		this.jLabelid_empresaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPanelid_empresaBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jComboBoxid_empresaBodegaSucursal= new JComboBoxMe();
		jComboBoxid_empresaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBodegaSucursal.setEnabled(false);

		this.jButtonid_empresaBodegaSucursal= new JButtonMe();
		this.jButtonid_empresaBodegaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaSucursal.setText("Buscar");
		this.jButtonid_empresaBodegaSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBodegaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaSucursal"));

		this.jButtonid_empresaBodegaSucursalBusqueda= new JButtonMe();
		this.jButtonid_empresaBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaSucursalBusqueda.setText("U");
		this.jButtonid_empresaBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBodegaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_empresaBodegaSucursalUpdate= new JButtonMe();
		this.jButtonid_empresaBodegaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaSucursalUpdate.setText("U");
		this.jButtonid_empresaBodegaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBodegaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaSucursalUpdate"));



					
		this.jLabelid_sucursalBodegaSucursal = new JLabelMe();
		this.jLabelid_sucursalBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBodegaSucursal.setToolTipText("Sucursal");
		this.jLabelid_sucursalBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPanelid_sucursalBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jComboBoxid_sucursalBodegaSucursal= new JComboBoxMe();
		jComboBoxid_sucursalBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursalBodegaSucursal= new JButtonMe();
		this.jButtonid_sucursalBodegaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaSucursal.setText("Buscar");
		this.jButtonid_sucursalBodegaSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBodegaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaSucursal"));

		this.jButtonid_sucursalBodegaSucursalBusqueda= new JButtonMe();
		this.jButtonid_sucursalBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBodegaSucursalBusqueda.setText("U");
		this.jButtonid_sucursalBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBodegaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBodegaSucursalUpdate= new JButtonMe();
		this.jButtonid_sucursalBodegaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBodegaSucursalUpdate.setText("U");
		this.jButtonid_sucursalBodegaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBodegaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaSucursalUpdate"));



					
		this.jLabelid_bodegaBodegaSucursal = new JLabelMe();
		this.jLabelid_bodegaBodegaSucursal.setText(""+BodegaSucursalConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaBodegaSucursal.setToolTipText("Bodega");
		this.jLabelid_bodegaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaBodegaSucursal.setToolTipText(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutBodegaSucursal = new GridBagLayout();
		this.jPanelid_bodegaBodegaSucursal.setLayout(this.gridaBagLayoutBodegaSucursal);


		jComboBoxid_bodegaBodegaSucursal= new JComboBoxMe();
		jComboBoxid_bodegaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaBodegaSucursal= new JButtonMe();
		this.jButtonid_bodegaBodegaSucursal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaSucursal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaSucursal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaSucursal.setText("Buscar");
		this.jButtonid_bodegaBodegaSucursal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaBodegaSucursal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaSucursal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaSucursal"));

		this.jButtonid_bodegaBodegaSucursalBusqueda= new JButtonMe();
		this.jButtonid_bodegaBodegaSucursalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaSucursalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaSucursalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaBodegaSucursalBusqueda.setText("U");
		this.jButtonid_bodegaBodegaSucursalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaBodegaSucursalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaSucursalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaSucursalBusqueda"));

		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaBodegaSucursalBusqueda.setVisible(false);		}

		this.jButtonid_bodegaBodegaSucursalUpdate= new JButtonMe();
		this.jButtonid_bodegaBodegaSucursalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaSucursalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaSucursalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaBodegaSucursalUpdate.setText("U");
		this.jButtonid_bodegaBodegaSucursalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaBodegaSucursalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaSucursalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaSucursalUpdate"));



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
		//this.jInternalFrameDetalleBodegaSucursal = new BodegaSucursalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bodega Sucursal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodegaSucursal= new GridBagLayout();
		

		
		String sToolTipBodegaSucursal="";
		sToolTipBodegaSucursal=BodegaSucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodegaSucursal+="(Inventario.BodegaSucursal)";
		}
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodegaSucursal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBodegaSucursal = new JButtonMe();
		this.jButtonModificarBodegaSucursal = new JButtonMe();
        this.jButtonActualizarBodegaSucursal = new JButtonMe();
        this.jButtonEliminarBodegaSucursal = new JButtonMe();
        this.jButtonCancelarBodegaSucursal = new JButtonMe();
        this.jButtonGuardarCambiosBodegaSucursal = new JButtonMe();
		this.jButtonGuardarCambiosTablaBodegaSucursal = new JButtonMe();
		this.jButtonCerrarBodegaSucursal = new JButtonMe();
		
		this.jScrollPanelDatosBodegaSucursal = new JScrollPane();   
        this.jScrollPanelDatosEdicionBodegaSucursal = new JScrollPane();
		this.jScrollPanelDatosGeneralBodegaSucursal = new JScrollPane();
				
		
		
		this.jPanelCamposBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Bodega Sucursal";
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosBodegaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBodegaSucursal.setName("jPanelCamposBodegaSucursal"); 

		this.jPanelCamposOcultosBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBodegaSucursal.setName("jPanelCamposOcultosBodegaSucursal"); 

        this.jPanelAccionesBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodegaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesBodegaSucursal.setName("Acciones"); 

		this.jPanelAccionesFormularioBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBodegaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBodegaSucursal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBodegaSucursal.setText("Nuevo");
		this.jButtonModificarBodegaSucursal.setText("Editar");
        this.jButtonActualizarBodegaSucursal.setText("Actualizar");
        this.jButtonEliminarBodegaSucursal.setText("Eliminar");
        this.jButtonCancelarBodegaSucursal.setText("Cancelar");
        this.jButtonGuardarCambiosBodegaSucursal.setText("Guardar");
		this.jButtonGuardarCambiosTablaBodegaSucursal.setText("Guardar");
		this.jButtonCerrarBodegaSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodegaSucursal,"nuevo_button","Nuevo",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBodegaSucursal,"modificar_button","Editar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBodegaSucursal,"actualizar_button","Actualizar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBodegaSucursal,"eliminar_button","Eliminar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBodegaSucursal,"cancelar_button","Cancelar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBodegaSucursal,"guardarcambios_button","Guardar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodegaSucursal,"guardarcambiostabla_button","Guardar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodegaSucursal,"cerrar_button","Salir",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBodegaSucursal.setToolTipText("Nuevo"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBodegaSucursal.setToolTipText("Editar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBodegaSucursal.setToolTipText("Actualizar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBodegaSucursal.setToolTipText("Eliminar)"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBodegaSucursal.setToolTipText("Cancelar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBodegaSucursal.setToolTipText("Guardar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBodegaSucursal.setToolTipText("Guardar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBodegaSucursal.setToolTipText("Salir"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBodegaSucursal";
		inputMap = this.jButtonNuevoBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodegaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodegaSucursal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBodegaSucursal";
		inputMap = this.jButtonActualizarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBodegaSucursal"));
		
		//ELIMINAR
		sMapKey = "EliminarBodegaSucursal";
		inputMap = this.jButtonEliminarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBodegaSucursal"));
		
		//CANCELAR	
		sMapKey = "CancelarBodegaSucursal";
		inputMap = this.jButtonCancelarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBodegaSucursal"));
		
		//CERRAR		
		sMapKey = "CerrarBodegaSucursal";
		inputMap = this.jButtonCerrarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBodegaSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBodegaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBodegaSucursal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBodegaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBodegaSucursal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBodegaSucursal.setToolTipText("Nuevo BodegaSucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBodegaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBodegaSucursal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBodegaSucursal.setToolTipText("Sin Cerrar Ventana BodegaSucursal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBodegaSucursal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBodegaSucursal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBodegaSucursal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodegaSucursal.setText("Accion");
		this.jComboBoxTiposAccionesBodegaSucursal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBodegaSucursal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBodegaSucursal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBodegaSucursal = new JLabelMe();
		
		this.jLabelAccionesBodegaSucursal.setText("Acciones");		
		this.jLabelAccionesBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBodegaSucursal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBodegaSucursal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBodegaSucursal=new JTabbedPane();
		this.jTabbedPaneRelacionesBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBodegaSucursal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBodegaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBodegaSucursal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodegaSucursal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodegaSucursal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBodegaSucursal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBodegaSucursal = new GridBagLayout();
		
		this.jPanelCamposBodegaSucursal.setLayout(gridaBagLayoutCamposBodegaSucursal);
		this.jPanelCamposOcultosBodegaSucursal.setLayout(gridaBagLayoutCamposOcultosBodegaSucursal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBodegaSucursal.add(jLabelIdBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBodegaSucursal.add(jLabelidBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBodegaSucursal.add(jLabelid_empresaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodegaSucursal.add(jButtonid_empresaBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 3;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodegaSucursal.add(jButtonid_empresaBodegaSucursalUpdate, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBodegaSucursal.add(jComboBoxid_empresaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBodegaSucursal.add(jLabelid_sucursalBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBodegaSucursal.add(jButtonid_sucursalBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 3;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBodegaSucursal.add(jButtonid_sucursalBodegaSucursalUpdate, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBodegaSucursal.add(jComboBoxid_sucursalBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaBodegaSucursal.add(jLabelid_bodegaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaBodegaSucursal.add(jButtonid_bodegaBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 3;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaBodegaSucursal.add(jButtonid_bodegaBodegaSucursalUpdate, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaBodegaSucursal.add(jComboBoxid_bodegaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuenciaBodegaSucursal.add(jLabelsecuenciaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuenciaBodegaSucursal.add(jButtonsecuenciaBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuenciaBodegaSucursal.add(jTextFieldsecuenciaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltamanioBodegaSucursal.add(jLabeltamanioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltamanioBodegaSucursal.add(jButtontamanioBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltamanioBodegaSucursal.add(jTextFieldtamanioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 0;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionBodegaSucursal.add(jLabeldescripcionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 2;
		this.gridBagConstraintsBodegaSucursal.ipadx = 0;
		this.gridBagConstraintsBodegaSucursal.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionBodegaSucursal.add(jButtondescripcionBodegaSucursalBusqueda, this.gridBagConstraintsBodegaSucursal);
	}

	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaSucursal.gridy = 0;
	this.gridBagConstraintsBodegaSucursal.gridx = 1;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionBodegaSucursal.add(jscrollPanedescripcionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPanelidBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPanelid_sucursalBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPanelid_bodegaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPanelsecuenciaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPaneltamanioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBodegaSucursal.add(this.jPaneldescripcionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposBodegaSucursal % 1==0) {
		iXPanelCamposBodegaSucursal=0;
		iYPanelCamposBodegaSucursal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaSucursal.gridy = iYPanelCamposOcultosBodegaSucursal;
	this.gridBagConstraintsBodegaSucursal.gridx = iXPanelCamposOcultosBodegaSucursal++;
	this.gridBagConstraintsBodegaSucursal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaSucursal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBodegaSucursal.add(this.jPanelid_empresaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);



	if(iXPanelCamposOcultosBodegaSucursal % 1==0) {
		iXPanelCamposOcultosBodegaSucursal=0;
		iYPanelCamposOcultosBodegaSucursal++;
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
			
		GridBagLayout gridaBagLayoutAccionesBodegaSucursal= new GridBagLayout();
		this.jPanelAccionesBodegaSucursal.setLayout(gridaBagLayoutAccionesBodegaSucursal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBodegaSucursal= new GridBagLayout();
		this.jPanelAccionesFormularioBodegaSucursal.setLayout(gridaBagLayoutAccionesFormularioBodegaSucursal);
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodegaSucursal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodegaSucursal.add(this.jComboBoxTiposAccionesFormularioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodegaSucursal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodegaSucursal.add(this.jCheckBoxPostAccionNuevoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodegaSucursal.add(this.jCheckBoxPostAccionSinCerrarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodegaSucursal.add(this.jCheckBoxPostAccionSinMensajeBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccion++;
			
		this.jPanelAccionesBodegaSucursal.add(this.jButtonModificarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);							

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx =iPosXAccion++;
			
		this.jPanelAccionesBodegaSucursal.add(this.jButtonEliminarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = 0;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodegaSucursal.add(this.jButtonActualizarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);


		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = 0;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodegaSucursal.add(this.jButtonGuardarCambiosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);	
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = 0;		
		this.gridBagConstraintsBodegaSucursal.gridx =iPosXAccion++;
		
		this.jPanelAccionesBodegaSucursal.add(this.jButtonCancelarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBodegaSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBodegaSucursal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();						
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodegaSucursal.gridx = 0;		
			//this.gridBagConstraintsBodegaSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBodegaSucursal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodegaSucursal.gridx =0;
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodegaSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBodegaSucursal = new BodegaSucursalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bodega Sucursal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bodega Sucursal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bodega Sucursal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BodegaSucursalModel bodegasucursalModel=new BodegaSucursalModel(this);
			
			//SI USARA CLASE INTERNA
			//BodegaSucursalModel.BodegaSucursalFocusTraversalPolicy bodegasucursalFocusTraversalPolicy = bodegasucursalModel.new BodegaSucursalFocusTraversalPolicy(this);
			
			//bodegasucursalFocusTraversalPolicy.setbodegasucursalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bodegasucursalModel);
			
			
			this.jContentPaneDetalleBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBodegaSucursal = new GridBagLayout();	
			this.jContentPaneDetalleBodegaSucursal.setLayout(gridaBagLayoutDetalleBodegaSucursal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodegaSucursal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
				this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBodegaSucursal.gridx = 0;
					
				
				this.jContentPaneDetalleBodegaSucursal.add(jTtoolBarDetalleBodegaSucursal, gridBagConstraintsBodegaSucursal);								
				
}
			
			this.jScrollPanelDatosEdicionBodegaSucursal=   new JScrollPane(jContentPaneDetalleBodegaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodegaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBodegaSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodegaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBodegaSucursal.gridx = 0;
	        
			this.jContentPaneDetalleBodegaSucursal.add(jPanelCamposBodegaSucursal, gridBagConstraintsBodegaSucursal);
			
			
			
			
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
						&& bodegasucursalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBodegaSucursal= new GridBagConstraints();
						this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBodegaSucursal.gridx = 0;
						this.jContentPaneDetalleBodegaSucursal.add(this.jTabbedPaneRelacionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBodegaSucursal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBodegaSucursal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
					this.gridBagConstraintsBodegaSucursal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBodegaSucursal.gridx = 0;
					
				
					this.jContentPaneDetalleBodegaSucursal.add(jPanelCamposOcultosBodegaSucursal, gridBagConstraintsBodegaSucursal);
				
					this.jPanelCamposOcultosBodegaSucursal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBodegaSucursal.gridx = 0;
	        this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBodegaSucursal.add(this.jPanelAccionesFormularioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);							
			
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
	        this.gridBagConstraintsBodegaSucursal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBodegaSucursal.gridx = 0;
	        
			
			this.jContentPaneDetalleBodegaSucursal.add(this.jPanelAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBodegaSucursal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBodegaSucursal=   new JScrollPane(this.jPanelCamposBodegaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodegaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBodegaSucursal.gridx = 0;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBodegaSucursal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodegaSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodegaSucursal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBodegaSucursal;//jContentPane;
		
		return jScrollPanelDatosEdicionBodegaSucursal;
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
