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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.cartera.util.DatoConstitucionConstantesFunciones;

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
public class DatoConstitucionDetalleFormJInternalFrame extends DatoConstitucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDatoConstitucion;
	
	protected JMenuBar jmenuBarDetalleDatoConstitucion;
	
	protected JMenu jmenuDetalleDatoConstitucion;
	protected JMenu jmenuDetalleArchivoDatoConstitucion;
	protected JMenu jmenuDetalleAccionesDatoConstitucion;
	protected JMenu jmenuDetalleDatosDatoConstitucion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoConstitucion;	
	protected GridBagConstraints gridBagConstraintsDatoConstitucion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DatoConstitucionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDatoConstitucion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoCompaniaBeanSwingJInternalFrame tipocompaniaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocompania="";
	
	public DatoConstitucionSessionBean datoconstitucionSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoCompaniaSessionBean tipocompaniaSessionBean;	
	
	public DatoConstitucionLogic datoconstitucionLogic;
	
	public JScrollPane jScrollPanelDatosDatoConstitucion;
	public JScrollPane jScrollPanelDatosEdicionDatoConstitucion;
	public JScrollPane jScrollPanelDatosGeneralDatoConstitucion;
	
	protected JPanel jPanelCamposDatoConstitucion;    
	protected JPanel jPanelCamposOcultosDatoConstitucion;    	
	protected JPanel jPanelAccionesDatoConstitucion;
	protected JPanel jPanelAccionesFormularioDatoConstitucion;
    
	
	
	protected Integer iXPanelCamposDatoConstitucion=0;
	protected Integer iYPanelCamposDatoConstitucion=0;
	
	protected Integer iXPanelCamposOcultosDatoConstitucion=0;
	protected Integer iYPanelCamposOcultosDatoConstitucion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDatoConstitucion;
	public JButton jButtonModificarDatoConstitucion;
	public JButton jButtonActualizarDatoConstitucion;
    public JButton jButtonEliminarDatoConstitucion;
	public JButton jButtonCancelarDatoConstitucion;
    public JButton jButtonGuardarCambiosDatoConstitucion;
	public JButton jButtonGuardarCambiosTablaDatoConstitucion;
	protected JButton jButtonCerrarDatoConstitucion;
	
	
	protected JButton jButtonProcesarInformacionDatoConstitucion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDatoConstitucion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDatoConstitucion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDatoConstitucion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoConstitucion;
	protected JButton jButtonModificarToolBarDatoConstitucion;
	protected JButton jButtonActualizarToolBarDatoConstitucion;
    protected JButton jButtonEliminarToolBarDatoConstitucion;
	protected JButton jButtonCancelarToolBarDatoConstitucion;
    protected JButton jButtonGuardarCambiosToolBarDatoConstitucion;
	protected JButton jButtonGuardarCambiosTablaToolBarDatoConstitucion;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoConstitucion;
	protected JButton jButtonCerrarToolBarDatoConstitucion;
	
	protected JButton jButtonProcesarInformacionToolBarDatoConstitucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoConstitucion;
	protected JMenuItem jMenuItemModificarDatoConstitucion;
	protected JMenuItem jMenuItemActualizarDatoConstitucion;
    protected JMenuItem jMenuItemEliminarDatoConstitucion;
	protected JMenuItem jMenuItemCancelarDatoConstitucion;
    protected JMenuItem jMenuItemGuardarCambiosDatoConstitucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoConstitucion;
	protected JMenuItem jMenuItemCerrarDatoConstitucion;
	protected JMenuItem jMenuItemDetalleCerrarDatoConstitucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoConstitucion;
	
	protected JMenuItem jMenuItemProcesarInformacionDatoConstitucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoConstitucion;
	protected JMenuItem jMenuItemMostrarOcultarDatoConstitucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoConstitucion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoConstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoConstitucion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDatoConstitucion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDatoConstitucion;
	public JLabel jLabelIdDatoConstitucion;
	public JLabel jLabelidDatoConstitucion;
	public JButton jButtonidDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPaneldireccionDatoConstitucion;
	public JLabel jLabeldireccionDatoConstitucion;
	public JTextArea jTextAreadireccionDatoConstitucion;
	public JScrollPane jscrollPanedireccionDatoConstitucion;
	public JButton jButtondireccionDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelfechaconstitucionDatoConstitucion;
	public JLabel jLabelfechaconstitucionDatoConstitucion;
	//public JFormattedTextField jDateChooserfechaconstitucionDatoConstitucion;

	public JDateChooser jDateChooserfechaconstitucionDatoConstitucion;
	public JButton jButtonfechaconstitucionDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelcapitalsuscritoDatoConstitucion;
	public JLabel jLabelcapitalsuscritoDatoConstitucion;
	public JTextField jTextFieldcapitalsuscritoDatoConstitucion;
	public JButton jButtoncapitalsuscritoDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelplazofiniquitoDatoConstitucion;
	public JLabel jLabelplazofiniquitoDatoConstitucion;
	public JTextField jTextFieldplazofiniquitoDatoConstitucion;
	public JButton jButtonplazofiniquitoDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelreservalegalDatoConstitucion;
	public JLabel jLabelreservalegalDatoConstitucion;
	public JTextField jTextFieldreservalegalDatoConstitucion;
	public JButton jButtonreservalegalDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelfechaestatutoDatoConstitucion;
	public JLabel jLabelfechaestatutoDatoConstitucion;
	//public JFormattedTextField jDateChooserfechaestatutoDatoConstitucion;

	public JDateChooser jDateChooserfechaestatutoDatoConstitucion;
	public JButton jButtonfechaestatutoDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelesactivoDatoConstitucion;
	public JLabel jLabelesactivoDatoConstitucion;
	public JCheckBox jCheckBoxesactivoDatoConstitucion;
	public JButton jButtonesactivoDatoConstitucionBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteDatoConstitucion;
	public JLabel jLabelidclienteDatoConstitucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteDatoConstitucion;
	public JButton jButtonidclienteDatoConstitucion= new JButtonMe();
	public JButton jButtonidclienteDatoConstitucionUpdate= new JButtonMe();
	public JButton jButtonidclienteDatoConstitucionBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientecompaniaDatoConstitucion;
	public JLabel jLabelidvalorclientecompaniaDatoConstitucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecompaniaDatoConstitucion;
	public JButton jButtonidvalorclientecompaniaDatoConstitucion= new JButtonMe();
	public JButton jButtonidvalorclientecompaniaDatoConstitucionUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecompaniaDatoConstitucionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDatoConstitucion;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DatoConstitucionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDatoConstitucion=new JPanel();
				this.jPanelAccionesFormularioDatoConstitucion=new JPanel();
				this.jmenuBarDetalleDatoConstitucion=new JMenuBar();
				this.jTtoolBarDetalleDatoConstitucion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DatoConstitucionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDatoConstitucion() {
		return this.jButtonActualizarToolBarDatoConstitucion;
	}
	
	public JButton getjButtonEliminarToolBarDatoConstitucion() {
		return this.jButtonEliminarToolBarDatoConstitucion;
	}
	
	public JButton getjButtonCancelarToolBarDatoConstitucion() {
		return this.jButtonCancelarToolBarDatoConstitucion;
	}		
	
	public JButton getjButtonProcesarInformacionDatoConstitucion() {
		return this.jButtonProcesarInformacionDatoConstitucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoConstitucion)	{
		this.jButtonProcesarInformacionDatoConstitucion = jButtonProcesarInformacionDatoConstitucion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoConstitucion() {
		return this.jComboBoxTiposAccionesDatoConstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoConstitucion(
			JComboBox jComboBoxTiposRelacionesDatoConstitucion) {
		this.jComboBoxTiposRelacionesDatoConstitucion = jComboBoxTiposRelacionesDatoConstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoConstitucion(
			JComboBox jComboBoxTiposAccionesDatoConstitucion) {
		this.jComboBoxTiposAccionesDatoConstitucion = jComboBoxTiposAccionesDatoConstitucion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDatoConstitucion() {
		return this.jComboBoxTiposAccionesFormularioDatoConstitucion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDatoConstitucion(
			JComboBox jComboBoxTiposAccionesFormularioDatoConstitucion) {
		this.jComboBoxTiposAccionesFormularioDatoConstitucion = jComboBoxTiposAccionesFormularioDatoConstitucion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		
		this.datoconstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoconstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoconstitucionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoConstitucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Constitucion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
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
	
		DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDatoConstitucion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDatoConstitucion=new JButtonMe();
				this.jButtonModificarToolBarDatoConstitucion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion,
							"actualizar","actualizar","Actualizar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion,
							"eliminar","eliminar","Eliminar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion,
							"cancelar","cancelar","Cancelar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion,
							"guardarcambios","guardarcambios","Guardar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDatoConstitucion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDatoConstitucion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDatoConstitucion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDatoConstitucion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDatoConstitucion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoConstitucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoConstitucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoConstitucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDatoConstitucion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDatoConstitucion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDatoConstitucion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDatoConstitucion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDatoConstitucion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDatoConstitucion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDatoConstitucion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDatoConstitucion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDatoConstitucion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDatoConstitucion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDatoConstitucion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDatoConstitucion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDatoConstitucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoConstitucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoConstitucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoConstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoConstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoConstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDatoConstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDatoConstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDatoConstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoConstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoConstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoConstitucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoConstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoConstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoConstitucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDatoConstitucion.add(this.jMenuItemDetalleCerrarDatoConstitucion);
		
		this.jmenuDetalleAccionesDatoConstitucion.add(this.jMenuItemActualizarDatoConstitucion);
		this.jmenuDetalleAccionesDatoConstitucion.add(this.jMenuItemEliminarDatoConstitucion);
		this.jmenuDetalleAccionesDatoConstitucion.add(this.jMenuItemCancelarDatoConstitucion);		
		
		//this.jmenuDetalleDatosDatoConstitucion.add(this.jMenuItemDetalleAbrirOrderByDatoConstitucion);				
		this.jmenuDetalleDatosDatoConstitucion.add(this.jMenuItemDetalleMostarOcultarDatoConstitucion);				
				
		//this.jmenuDetalleAccionesDatoConstitucion.add(this.jMenuItemGuardarCambiosDatoConstitucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDatoConstitucion.add(this.jmenuDetalleArchivoDatoConstitucion);		
		this.jmenuBarDetalleDatoConstitucion.add(this.jmenuDetalleAccionesDatoConstitucion);		
		this.jmenuBarDetalleDatoConstitucion.add(this.jmenuDetalleDatosDatoConstitucion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDatoConstitucion);				
	}
	
	
	public void inicializarElementosCamposDatoConstitucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDatoConstitucion = new JLabelMe();
		jLabelIdDatoConstitucion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDatoConstitucion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDatoConstitucion= new GridBagLayout();

		this.jPanelidDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);

		jLabelidDatoConstitucion = new JLabel();
		jLabelidDatoConstitucion.setText("Id");

		jLabelidDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldireccionDatoConstitucion = new JLabelMe();
		this.jLabeldireccionDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionDatoConstitucion.setToolTipText("Direccion");
		this.jLabeldireccionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPaneldireccionDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jTextAreadireccionDatoConstitucion= new JTextAreaMe();
		jTextAreadireccionDatoConstitucion.setEnabled(false);
		jTextAreadireccionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionDatoConstitucion.setLineWrap(true);
		jTextAreadireccionDatoConstitucion.setWrapStyleWord(true);
		jTextAreadireccionDatoConstitucion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionDatoConstitucion.setRows(12);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionDatoConstitucion = new JScrollPane(jTextAreadireccionDatoConstitucion);
		jscrollPanedireccionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionDatoConstitucionBusqueda= new JButtonMe();
		this.jButtondireccionDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionDatoConstitucionBusqueda.setText("U");
		this.jButtondireccionDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelfechaconstitucionDatoConstitucion = new JLabelMe();
		this.jLabelfechaconstitucionDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION+" : *");
		this.jLabelfechaconstitucionDatoConstitucion.setToolTipText("Fecha Constitucion");
		this.jLabelfechaconstitucionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfechaconstitucionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfechaconstitucionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaconstitucionDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaconstitucionDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaconstitucionDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelfechaconstitucionDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		//jFormattedTextFieldfechaconstitucionDatoConstitucion= new JFormattedTextFieldMe();

		jDateChooserfechaconstitucionDatoConstitucion= new JDateChooser();
		jDateChooserfechaconstitucionDatoConstitucion.setEnabled(false);
		jDateChooserfechaconstitucionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaconstitucionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaconstitucionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaconstitucionDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaconstitucionDatoConstitucion.setDate(new Date());
		jDateChooserfechaconstitucionDatoConstitucion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaconstitucionDatoConstitucion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaconstitucionDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaconstitucionDatoConstitucionBusqueda.setText("U");
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaconstitucionDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaconstitucionDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaconstitucionDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaconstitucionDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaconstitucionDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelcapitalsuscritoDatoConstitucion = new JLabelMe();
		this.jLabelcapitalsuscritoDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO+" : *");
		this.jLabelcapitalsuscritoDatoConstitucion.setToolTipText("Capital Suscrito");
		this.jLabelcapitalsuscritoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcapitalsuscritoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcapitalsuscritoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcapitalsuscritoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcapitalsuscritoDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcapitalsuscritoDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelcapitalsuscritoDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jTextFieldcapitalsuscritoDatoConstitucion= new JTextFieldMe();
		jTextFieldcapitalsuscritoDatoConstitucion.setEnabled(false);
		jTextFieldcapitalsuscritoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalsuscritoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcapitalsuscritoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcapitalsuscritoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcapitalsuscritoDatoConstitucion.setText("0.0");

		this.jButtoncapitalsuscritoDatoConstitucionBusqueda= new JButtonMe();
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setText("U");
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncapitalsuscritoDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcapitalsuscritoDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcapitalsuscritoDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"capitalsuscritoDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncapitalsuscritoDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelplazofiniquitoDatoConstitucion = new JLabelMe();
		this.jLabelplazofiniquitoDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO+" : *");
		this.jLabelplazofiniquitoDatoConstitucion.setToolTipText("Plazo Finiquito");
		this.jLabelplazofiniquitoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelplazofiniquitoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelplazofiniquitoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelplazofiniquitoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplazofiniquitoDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplazofiniquitoDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelplazofiniquitoDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jTextFieldplazofiniquitoDatoConstitucion= new JTextFieldMe();
		jTextFieldplazofiniquitoDatoConstitucion.setEnabled(false);
		jTextFieldplazofiniquitoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazofiniquitoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazofiniquitoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplazofiniquitoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldplazofiniquitoDatoConstitucion.setText("0");

		this.jButtonplazofiniquitoDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplazofiniquitoDatoConstitucionBusqueda.setText("U");
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplazofiniquitoDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplazofiniquitoDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplazofiniquitoDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"plazofiniquitoDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplazofiniquitoDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelreservalegalDatoConstitucion = new JLabelMe();
		this.jLabelreservalegalDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL+" : *");
		this.jLabelreservalegalDatoConstitucion.setToolTipText("Reserva Legal");
		this.jLabelreservalegalDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreservalegalDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreservalegalDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreservalegalDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreservalegalDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreservalegalDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelreservalegalDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jTextFieldreservalegalDatoConstitucion= new JTextFieldMe();
		jTextFieldreservalegalDatoConstitucion.setEnabled(false);
		jTextFieldreservalegalDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldreservalegalDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldreservalegalDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldreservalegalDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldreservalegalDatoConstitucion.setText("0.0");

		this.jButtonreservalegalDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonreservalegalDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreservalegalDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreservalegalDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreservalegalDatoConstitucionBusqueda.setText("U");
		this.jButtonreservalegalDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreservalegalDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreservalegalDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldreservalegalDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldreservalegalDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"reservalegalDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreservalegalDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelfechaestatutoDatoConstitucion = new JLabelMe();
		this.jLabelfechaestatutoDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO+" : *");
		this.jLabelfechaestatutoDatoConstitucion.setToolTipText("Fecha Estatuto");
		this.jLabelfechaestatutoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaestatutoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaestatutoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaestatutoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaestatutoDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaestatutoDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelfechaestatutoDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		//jFormattedTextFieldfechaestatutoDatoConstitucion= new JFormattedTextFieldMe();

		jDateChooserfechaestatutoDatoConstitucion= new JDateChooser();
		jDateChooserfechaestatutoDatoConstitucion.setEnabled(false);
		jDateChooserfechaestatutoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaestatutoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaestatutoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaestatutoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaestatutoDatoConstitucion.setDate(new Date());
		jDateChooserfechaestatutoDatoConstitucion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaestatutoDatoConstitucion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaestatutoDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaestatutoDatoConstitucionBusqueda.setText("U");
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaestatutoDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaestatutoDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaestatutoDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaestatutoDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaestatutoDatoConstitucionBusqueda.setVisible(false);		}


					
		this.jLabelesactivoDatoConstitucion = new JLabelMe();
		this.jLabelesactivoDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoDatoConstitucion.setToolTipText("Es Activo");
		this.jLabelesactivoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelesactivoDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jCheckBoxesactivoDatoConstitucion= new JCheckBoxMe();
		jCheckBoxesactivoDatoConstitucion.setEnabled(false);

		jCheckBoxesactivoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonesactivoDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoDatoConstitucionBusqueda.setText("U");
		this.jButtonesactivoDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoDatoConstitucionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDatoConstitucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidclienteDatoConstitucion = new JLabelMe();
		this.jLabelidclienteDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteDatoConstitucion.setToolTipText("Cliente");
		this.jLabelidclienteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelidclienteDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jComboBoxidclienteDatoConstitucion= new JComboBoxMe();
		jComboBoxidclienteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteDatoConstitucion= new JButtonMe();
		this.jButtonidclienteDatoConstitucion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteDatoConstitucion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteDatoConstitucion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteDatoConstitucion.setText("Buscar");
		this.jButtonidclienteDatoConstitucion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteDatoConstitucion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteDatoConstitucion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteDatoConstitucion"));

		this.jButtonidclienteDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonidclienteDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteDatoConstitucionBusqueda.setText("U");
		this.jButtonidclienteDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteDatoConstitucionBusqueda.setVisible(false);		}

		this.jButtonidclienteDatoConstitucionUpdate= new JButtonMe();
		this.jButtonidclienteDatoConstitucionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteDatoConstitucionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteDatoConstitucionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteDatoConstitucionUpdate.setText("U");
		this.jButtonidclienteDatoConstitucionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteDatoConstitucionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteDatoConstitucionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteDatoConstitucionUpdate"));



					
		this.jLabelidvalorclientecompaniaDatoConstitucion = new JLabelMe();
		this.jLabelidvalorclientecompaniaDatoConstitucion.setText(""+DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA+" : *");
		this.jLabelidvalorclientecompaniaDatoConstitucion.setToolTipText("Tipo Compania");
		this.jLabelidvalorclientecompaniaDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientecompaniaDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidvalorclientecompaniaDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecompaniaDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientecompaniaDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientecompaniaDatoConstitucion.setToolTipText(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA);
		this.gridaBagLayoutDatoConstitucion = new GridBagLayout();
		this.jPanelidvalorclientecompaniaDatoConstitucion.setLayout(this.gridaBagLayoutDatoConstitucion);


		jComboBoxidvalorclientecompaniaDatoConstitucion= new JComboBoxMe();
		jComboBoxidvalorclientecompaniaDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecompaniaDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecompaniaDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecompaniaDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientecompaniaDatoConstitucion= new JButtonMe();
		this.jButtonidvalorclientecompaniaDatoConstitucion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecompaniaDatoConstitucion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecompaniaDatoConstitucion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientecompaniaDatoConstitucion.setText("Buscar");
		this.jButtonidvalorclientecompaniaDatoConstitucion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientecompaniaDatoConstitucion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecompaniaDatoConstitucion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientecompaniaDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecompaniaDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecompaniaDatoConstitucion"));

		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda= new JButtonMe();
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setText("U");
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientecompaniaDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecompaniaDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecompaniaDatoConstitucionBusqueda"));

		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.setVisible(false);		}

		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate= new JButtonMe();
		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setText("U");
		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientecompaniaDatoConstitucionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientecompaniaDatoConstitucionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientecompaniaDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientecompaniaDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientecompaniaDatoConstitucionUpdate"));



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
		//this.jInternalFrameDetalleDatoConstitucion = new DatoConstitucionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dato Constitucion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoConstitucion= new GridBagLayout();
		

		
		String sToolTipDatoConstitucion="";
		sToolTipDatoConstitucion=DatoConstitucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoConstitucion+="(Cartera.DatoConstitucion)";
		}
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoConstitucion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDatoConstitucion = new JButtonMe();
		this.jButtonModificarDatoConstitucion = new JButtonMe();
        this.jButtonActualizarDatoConstitucion = new JButtonMe();
        this.jButtonEliminarDatoConstitucion = new JButtonMe();
        this.jButtonCancelarDatoConstitucion = new JButtonMe();
        this.jButtonGuardarCambiosDatoConstitucion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDatoConstitucion = new JButtonMe();
		this.jButtonCerrarDatoConstitucion = new JButtonMe();
		
		this.jScrollPanelDatosDatoConstitucion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDatoConstitucion = new JScrollPane();
		this.jScrollPanelDatosGeneralDatoConstitucion = new JScrollPane();
				
		
		
		this.jPanelCamposDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Constitucion";
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoConstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDatoConstitucion.setName("jPanelCamposDatoConstitucion"); 

		this.jPanelCamposOcultosDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDatoConstitucion.setName("jPanelCamposOcultosDatoConstitucion"); 

        this.jPanelAccionesDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoConstitucion.setToolTipText("Acciones");
        this.jPanelAccionesDatoConstitucion.setName("Acciones"); 

		this.jPanelAccionesFormularioDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDatoConstitucion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDatoConstitucion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDatoConstitucion.setText("Nuevo");
		this.jButtonModificarDatoConstitucion.setText("Editar");
        this.jButtonActualizarDatoConstitucion.setText("Actualizar");
        this.jButtonEliminarDatoConstitucion.setText("Eliminar");
        this.jButtonCancelarDatoConstitucion.setText("Cancelar");
        this.jButtonGuardarCambiosDatoConstitucion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDatoConstitucion.setText("Guardar");
		this.jButtonCerrarDatoConstitucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoConstitucion,"nuevo_button","Nuevo",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDatoConstitucion,"modificar_button","Editar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDatoConstitucion,"actualizar_button","Actualizar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDatoConstitucion,"eliminar_button","Eliminar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDatoConstitucion,"cancelar_button","Cancelar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDatoConstitucion,"guardarcambios_button","Guardar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoConstitucion,"guardarcambiostabla_button","Guardar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoConstitucion,"cerrar_button","Salir",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDatoConstitucion.setToolTipText("Nuevo"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDatoConstitucion.setToolTipText("Editar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDatoConstitucion.setToolTipText("Actualizar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDatoConstitucion.setToolTipText("Eliminar)"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDatoConstitucion.setToolTipText("Cancelar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDatoConstitucion.setToolTipText("Guardar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDatoConstitucion.setToolTipText("Guardar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoConstitucion.setToolTipText("Salir"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoConstitucion";
		inputMap = this.jButtonNuevoDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoConstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoConstitucion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDatoConstitucion";
		inputMap = this.jButtonActualizarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDatoConstitucion"));
		
		//ELIMINAR
		sMapKey = "EliminarDatoConstitucion";
		inputMap = this.jButtonEliminarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDatoConstitucion"));
		
		//CANCELAR	
		sMapKey = "CancelarDatoConstitucion";
		inputMap = this.jButtonCancelarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDatoConstitucion"));
		
		//CERRAR		
		sMapKey = "CerrarDatoConstitucion";
		inputMap = this.jButtonCerrarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoConstitucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoConstitucion";
		inputMap = this.jButtonGuardarCambiosTablaDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoConstitucion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDatoConstitucion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDatoConstitucion.setToolTipText("Nuevo DatoConstitucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDatoConstitucion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDatoConstitucion.setToolTipText("Sin Cerrar Ventana DatoConstitucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDatoConstitucion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDatoConstitucion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoConstitucion.setText("Accion");
		this.jComboBoxTiposAccionesDatoConstitucion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDatoConstitucion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDatoConstitucion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDatoConstitucion = new JLabelMe();
		
		this.jLabelAccionesDatoConstitucion.setText("Acciones");		
		this.jLabelAccionesDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDatoConstitucion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDatoConstitucion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDatoConstitucion=new JTabbedPane();
		this.jTabbedPaneRelacionesDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDatoConstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDatoConstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoConstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoConstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDatoConstitucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoConstitucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoConstitucion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDatoConstitucion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDatoConstitucion = new GridBagLayout();
		
		this.jPanelCamposDatoConstitucion.setLayout(gridaBagLayoutCamposDatoConstitucion);
		this.jPanelCamposOcultosDatoConstitucion.setLayout(gridaBagLayoutCamposOcultosDatoConstitucion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDatoConstitucion.add(jLabelIdDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDatoConstitucion.add(jLabelidDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteDatoConstitucion.add(jLabelidclienteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 2;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteDatoConstitucion.add(jButtonidclienteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 3;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteDatoConstitucion.add(jButtonidclienteDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 4;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteDatoConstitucion.add(jButtonidclienteDatoConstitucionUpdate, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteDatoConstitucion.add(jComboBoxidclienteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientecompaniaDatoConstitucion.add(jLabelidvalorclientecompaniaDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecompaniaDatoConstitucion.add(jButtonidvalorclientecompaniaDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 3;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientecompaniaDatoConstitucion.add(jButtonidvalorclientecompaniaDatoConstitucionUpdate, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientecompaniaDatoConstitucion.add(jComboBoxidvalorclientecompaniaDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionDatoConstitucion.add(jLabeldireccionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionDatoConstitucion.add(jButtondireccionDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionDatoConstitucion.add(jscrollPanedireccionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaconstitucionDatoConstitucion.add(jLabelfechaconstitucionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaconstitucionDatoConstitucion.add(jButtonfechaconstitucionDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaconstitucionDatoConstitucion.add(jDateChooserfechaconstitucionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcapitalsuscritoDatoConstitucion.add(jLabelcapitalsuscritoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcapitalsuscritoDatoConstitucion.add(jButtoncapitalsuscritoDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcapitalsuscritoDatoConstitucion.add(jTextFieldcapitalsuscritoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelplazofiniquitoDatoConstitucion.add(jLabelplazofiniquitoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelplazofiniquitoDatoConstitucion.add(jButtonplazofiniquitoDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelplazofiniquitoDatoConstitucion.add(jTextFieldplazofiniquitoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreservalegalDatoConstitucion.add(jLabelreservalegalDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelreservalegalDatoConstitucion.add(jButtonreservalegalDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreservalegalDatoConstitucion.add(jTextFieldreservalegalDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaestatutoDatoConstitucion.add(jLabelfechaestatutoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaestatutoDatoConstitucion.add(jButtonfechaestatutoDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaestatutoDatoConstitucion.add(jDateChooserfechaestatutoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 0;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoDatoConstitucion.add(jLabelesactivoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 2;
		this.gridBagConstraintsDatoConstitucion.ipadx = 0;
		this.gridBagConstraintsDatoConstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoDatoConstitucion.add(jButtonesactivoDatoConstitucionBusqueda, this.gridBagConstraintsDatoConstitucion);
	}

	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoConstitucion.gridy = 0;
	this.gridBagConstraintsDatoConstitucion.gridx = 1;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoDatoConstitucion.add(jCheckBoxesactivoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelidDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelidclienteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelidvalorclientecompaniaDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPaneldireccionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelfechaconstitucionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelcapitalsuscritoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelplazofiniquitoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelreservalegalDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelfechaestatutoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
	}
	this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoConstitucion.gridy = iYPanelCamposDatoConstitucion;
	this.gridBagConstraintsDatoConstitucion.gridx = iXPanelCamposDatoConstitucion++;
	this.gridBagConstraintsDatoConstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoConstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoConstitucion.add(this.jPanelesactivoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);



	if(iXPanelCamposDatoConstitucion % 1==0) {
		iXPanelCamposDatoConstitucion=0;
		iYPanelCamposDatoConstitucion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDatoConstitucion= new GridBagLayout();
		this.jPanelAccionesDatoConstitucion.setLayout(gridaBagLayoutAccionesDatoConstitucion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDatoConstitucion= new GridBagLayout();
		this.jPanelAccionesFormularioDatoConstitucion.setLayout(gridaBagLayoutAccionesFormularioDatoConstitucion);
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoConstitucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoConstitucion.add(this.jComboBoxTiposAccionesFormularioDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoConstitucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoConstitucion.add(this.jCheckBoxPostAccionNuevoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoConstitucion.add(this.jCheckBoxPostAccionSinCerrarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoConstitucion.add(this.jCheckBoxPostAccionSinMensajeDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDatoConstitucion.add(this.jButtonModificarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);							

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDatoConstitucion.add(this.jButtonEliminarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = 0;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoConstitucion.add(this.jButtonActualizarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = 0;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoConstitucion.add(this.jButtonGuardarCambiosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);	
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = 0;		
		this.gridBagConstraintsDatoConstitucion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDatoConstitucion.add(this.jButtonCancelarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoConstitucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoConstitucion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();						
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoConstitucion.gridx = 0;		
			//this.gridBagConstraintsDatoConstitucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoConstitucion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoConstitucion.gridx =0;
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoConstitucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDatoConstitucion = new DatoConstitucionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dato Constitucion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dato Constitucion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Constitucion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DatoConstitucionModel datoconstitucionModel=new DatoConstitucionModel(this);
			
			//SI USARA CLASE INTERNA
			//DatoConstitucionModel.DatoConstitucionFocusTraversalPolicy datoconstitucionFocusTraversalPolicy = datoconstitucionModel.new DatoConstitucionFocusTraversalPolicy(this);
			
			//datoconstitucionFocusTraversalPolicy.setdatoconstitucionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(datoconstitucionModel);
			
			
			this.jContentPaneDetalleDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDatoConstitucion = new GridBagLayout();	
			this.jContentPaneDetalleDatoConstitucion.setLayout(gridaBagLayoutDetalleDatoConstitucion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoConstitucion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
				this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDatoConstitucion.gridx = 0;
					
				
				this.jContentPaneDetalleDatoConstitucion.add(jTtoolBarDetalleDatoConstitucion, gridBagConstraintsDatoConstitucion);								
				
}
			
			this.jScrollPanelDatosEdicionDatoConstitucion=   new JScrollPane(jContentPaneDetalleDatoConstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoConstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoConstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoConstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDatoConstitucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoConstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoConstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoConstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDatoConstitucion.gridx = 0;
	        
			this.jContentPaneDetalleDatoConstitucion.add(jPanelCamposDatoConstitucion, gridBagConstraintsDatoConstitucion);
			
			
			
			
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
						&& datoconstitucionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDatoConstitucion= new GridBagConstraints();
						this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDatoConstitucion.gridx = 0;
						this.jContentPaneDetalleDatoConstitucion.add(this.jTabbedPaneRelacionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDatoConstitucion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDatoConstitucion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
					this.gridBagConstraintsDatoConstitucion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDatoConstitucion.gridx = 0;
					
				
					this.jContentPaneDetalleDatoConstitucion.add(jPanelCamposOcultosDatoConstitucion, gridBagConstraintsDatoConstitucion);
				
					this.jPanelCamposOcultosDatoConstitucion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDatoConstitucion.gridx = 0;
	        this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDatoConstitucion.add(this.jPanelAccionesFormularioDatoConstitucion, this.gridBagConstraintsDatoConstitucion);							
			
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
	        this.gridBagConstraintsDatoConstitucion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDatoConstitucion.gridx = 0;
	        
			
			this.jContentPaneDetalleDatoConstitucion.add(this.jPanelAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDatoConstitucion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDatoConstitucion=   new JScrollPane(this.jPanelCamposDatoConstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoConstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoConstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoConstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDatoConstitucion.gridx = 0;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDatoConstitucion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoConstitucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoConstitucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDatoConstitucion;//jContentPane;
		
		return jScrollPanelDatosEdicionDatoConstitucion;
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
