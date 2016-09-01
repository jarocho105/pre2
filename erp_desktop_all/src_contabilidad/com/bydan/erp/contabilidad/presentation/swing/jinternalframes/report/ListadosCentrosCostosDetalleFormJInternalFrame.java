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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ListadosCentrosCostosConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ListadosCentrosCostosDetalleFormJInternalFrame extends ListadosCentrosCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadosCentrosCostos;
	
	protected JMenuBar jmenuBarDetalleListadosCentrosCostos;
	
	protected JMenu jmenuDetalleListadosCentrosCostos;
	protected JMenu jmenuDetalleArchivoListadosCentrosCostos;
	protected JMenu jmenuDetalleAccionesListadosCentrosCostos;
	protected JMenu jmenuDetalleDatosListadosCentrosCostos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosCentrosCostos;	
	protected GridBagConstraints gridBagConstraintsListadosCentrosCostos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadosCentrosCostosBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadosCentrosCostos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosCentrosCostosSessionBean listadoscentroscostosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadosCentrosCostosLogic listadoscentroscostosLogic;
	
	public JScrollPane jScrollPanelDatosListadosCentrosCostos;
	public JScrollPane jScrollPanelDatosEdicionListadosCentrosCostos;
	public JScrollPane jScrollPanelDatosGeneralListadosCentrosCostos;
	
	protected JPanel jPanelCamposListadosCentrosCostos;    
	protected JPanel jPanelCamposOcultosListadosCentrosCostos;    	
	protected JPanel jPanelAccionesListadosCentrosCostos;
	protected JPanel jPanelAccionesFormularioListadosCentrosCostos;
    
	
	
	protected Integer iXPanelCamposListadosCentrosCostos=0;
	protected Integer iYPanelCamposListadosCentrosCostos=0;
	
	protected Integer iXPanelCamposOcultosListadosCentrosCostos=0;
	protected Integer iYPanelCamposOcultosListadosCentrosCostos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadosCentrosCostos;
	public JButton jButtonModificarListadosCentrosCostos;
	public JButton jButtonActualizarListadosCentrosCostos;
    public JButton jButtonEliminarListadosCentrosCostos;
	public JButton jButtonCancelarListadosCentrosCostos;
    public JButton jButtonGuardarCambiosListadosCentrosCostos;
	public JButton jButtonGuardarCambiosTablaListadosCentrosCostos;
	protected JButton jButtonCerrarListadosCentrosCostos;
	
	
	protected JButton jButtonProcesarInformacionListadosCentrosCostos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadosCentrosCostos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadosCentrosCostos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadosCentrosCostos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosCentrosCostos;
	protected JButton jButtonModificarToolBarListadosCentrosCostos;
	protected JButton jButtonActualizarToolBarListadosCentrosCostos;
    protected JButton jButtonEliminarToolBarListadosCentrosCostos;
	protected JButton jButtonCancelarToolBarListadosCentrosCostos;
    protected JButton jButtonGuardarCambiosToolBarListadosCentrosCostos;
	protected JButton jButtonGuardarCambiosTablaToolBarListadosCentrosCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosCentrosCostos;
	protected JButton jButtonCerrarToolBarListadosCentrosCostos;
	
	protected JButton jButtonProcesarInformacionToolBarListadosCentrosCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosCentrosCostos;
	protected JMenuItem jMenuItemModificarListadosCentrosCostos;
	protected JMenuItem jMenuItemActualizarListadosCentrosCostos;
    protected JMenuItem jMenuItemEliminarListadosCentrosCostos;
	protected JMenuItem jMenuItemCancelarListadosCentrosCostos;
    protected JMenuItem jMenuItemGuardarCambiosListadosCentrosCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosCentrosCostos;
	protected JMenuItem jMenuItemCerrarListadosCentrosCostos;
	protected JMenuItem jMenuItemDetalleCerrarListadosCentrosCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosCentrosCostos;
	
	protected JMenuItem jMenuItemProcesarInformacionListadosCentrosCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosCentrosCostos;
	protected JMenuItem jMenuItemMostrarOcultarListadosCentrosCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosCentrosCostos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosCentrosCostos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadosCentrosCostos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadosCentrosCostos;
	public JLabel jLabelIdListadosCentrosCostos;
	public JLabel jLabelidListadosCentrosCostos;
	public JButton jButtonidListadosCentrosCostosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoListadosCentrosCostos;
	public JLabel jLabelcodigoListadosCentrosCostos;
	public JTextField jTextFieldcodigoListadosCentrosCostos;
	public JButton jButtoncodigoListadosCentrosCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombreListadosCentrosCostos;
	public JLabel jLabelnombreListadosCentrosCostos;
	public JTextArea jTextAreanombreListadosCentrosCostos;
	public JScrollPane jscrollPanenombreListadosCentrosCostos;
	public JButton jButtonnombreListadosCentrosCostosBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeListadosCentrosCostos;
	public JLabel jLabelporcentajeListadosCentrosCostos;
	public JTextField jTextFieldporcentajeListadosCentrosCostos;
	public JButton jButtonporcentajeListadosCentrosCostosBusqueda= new JButtonMe();

	public JPanel jPanelvalorListadosCentrosCostos;
	public JLabel jLabelvalorListadosCentrosCostos;
	public JTextField jTextFieldvalorListadosCentrosCostos;
	public JButton jButtonvalorListadosCentrosCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadosCentrosCostos;
	public JLabel jLabelid_empresaListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadosCentrosCostos;
	public JButton jButtonid_empresaListadosCentrosCostos= new JButtonMe();
	public JButton jButtonid_empresaListadosCentrosCostosUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadosCentrosCostosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadosCentrosCostos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadosCentrosCostosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadosCentrosCostos=new JPanel();
				this.jPanelAccionesFormularioListadosCentrosCostos=new JPanel();
				this.jmenuBarDetalleListadosCentrosCostos=new JMenuBar();
				this.jTtoolBarDetalleListadosCentrosCostos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadosCentrosCostosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadosCentrosCostos() {
		return this.jButtonActualizarToolBarListadosCentrosCostos;
	}
	
	public JButton getjButtonEliminarToolBarListadosCentrosCostos() {
		return this.jButtonEliminarToolBarListadosCentrosCostos;
	}
	
	public JButton getjButtonCancelarToolBarListadosCentrosCostos() {
		return this.jButtonCancelarToolBarListadosCentrosCostos;
	}		
	
	public JButton getjButtonProcesarInformacionListadosCentrosCostos() {
		return this.jButtonProcesarInformacionListadosCentrosCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosCentrosCostos)	{
		this.jButtonProcesarInformacionListadosCentrosCostos = jButtonProcesarInformacionListadosCentrosCostos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosCentrosCostos() {
		return this.jComboBoxTiposAccionesListadosCentrosCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosCentrosCostos(
			JComboBox jComboBoxTiposRelacionesListadosCentrosCostos) {
		this.jComboBoxTiposRelacionesListadosCentrosCostos = jComboBoxTiposRelacionesListadosCentrosCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosCentrosCostos(
			JComboBox jComboBoxTiposAccionesListadosCentrosCostos) {
		this.jComboBoxTiposAccionesListadosCentrosCostos = jComboBoxTiposAccionesListadosCentrosCostos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadosCentrosCostos() {
		return this.jComboBoxTiposAccionesFormularioListadosCentrosCostos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadosCentrosCostos(
			JComboBox jComboBoxTiposAccionesFormularioListadosCentrosCostos) {
		this.jComboBoxTiposAccionesFormularioListadosCentrosCostos = jComboBoxTiposAccionesFormularioListadosCentrosCostos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
		
		this.listadoscentroscostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentroscostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoscentroscostosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosCentrosCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Centros Costos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadosCentrosCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadosCentrosCostos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadosCentrosCostos=new JButtonMe();
				this.jButtonModificarToolBarListadosCentrosCostos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos,
							"actualizar","actualizar","Actualizar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos,
							"eliminar","eliminar","Eliminar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos,
							"cancelar","cancelar","Cancelar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadosCentrosCostos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadosCentrosCostos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadosCentrosCostos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadosCentrosCostos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadosCentrosCostos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosCentrosCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosCentrosCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosCentrosCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadosCentrosCostos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadosCentrosCostos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadosCentrosCostos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadosCentrosCostos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadosCentrosCostos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadosCentrosCostos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadosCentrosCostos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadosCentrosCostos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadosCentrosCostos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadosCentrosCostos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadosCentrosCostos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadosCentrosCostos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadosCentrosCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosCentrosCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosCentrosCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosCentrosCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosCentrosCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosCentrosCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadosCentrosCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadosCentrosCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadosCentrosCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosCentrosCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosCentrosCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosCentrosCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosCentrosCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosCentrosCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosCentrosCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadosCentrosCostos.add(this.jMenuItemDetalleCerrarListadosCentrosCostos);
		
		this.jmenuDetalleAccionesListadosCentrosCostos.add(this.jMenuItemActualizarListadosCentrosCostos);
		this.jmenuDetalleAccionesListadosCentrosCostos.add(this.jMenuItemEliminarListadosCentrosCostos);
		this.jmenuDetalleAccionesListadosCentrosCostos.add(this.jMenuItemCancelarListadosCentrosCostos);		
		
		//this.jmenuDetalleDatosListadosCentrosCostos.add(this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos);				
		this.jmenuDetalleDatosListadosCentrosCostos.add(this.jMenuItemDetalleMostarOcultarListadosCentrosCostos);				
				
		//this.jmenuDetalleAccionesListadosCentrosCostos.add(this.jMenuItemGuardarCambiosListadosCentrosCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadosCentrosCostos.add(this.jmenuDetalleArchivoListadosCentrosCostos);		
		this.jmenuBarDetalleListadosCentrosCostos.add(this.jmenuDetalleAccionesListadosCentrosCostos);		
		this.jmenuBarDetalleListadosCentrosCostos.add(this.jmenuDetalleDatosListadosCentrosCostos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadosCentrosCostos);				
	}
	
	
	public void inicializarElementosCamposListadosCentrosCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadosCentrosCostos = new JLabelMe();
		jLabelIdListadosCentrosCostos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadosCentrosCostos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadosCentrosCostos= new GridBagLayout();

		this.jPanelidListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);

		jLabelidListadosCentrosCostos = new JLabel();
		jLabelidListadosCentrosCostos.setText("Id");

		jLabelidListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoListadosCentrosCostos = new JLabelMe();
		this.jLabelcodigoListadosCentrosCostos.setText(""+ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoListadosCentrosCostos.setToolTipText("Codigo");
		this.jLabelcodigoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		this.jPanelcodigoListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);


		jTextFieldcodigoListadosCentrosCostos= new JTextFieldMe();

		jTextFieldcodigoListadosCentrosCostos.setEnabled(false);
		jTextFieldcodigoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoListadosCentrosCostosBusqueda= new JButtonMe();
		this.jButtoncodigoListadosCentrosCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosCentrosCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoListadosCentrosCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoListadosCentrosCostosBusqueda.setText("U");
		this.jButtoncodigoListadosCentrosCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoListadosCentrosCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoListadosCentrosCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoListadosCentrosCostosBusqueda"));

		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoListadosCentrosCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombreListadosCentrosCostos = new JLabelMe();
		this.jLabelnombreListadosCentrosCostos.setText(""+ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreListadosCentrosCostos.setToolTipText("Nombre");
		this.jLabelnombreListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		this.jPanelnombreListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);


		jTextAreanombreListadosCentrosCostos= new JTextAreaMe();
		jTextAreanombreListadosCentrosCostos.setEnabled(false);
		jTextAreanombreListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreListadosCentrosCostos.setLineWrap(true);
		jTextAreanombreListadosCentrosCostos.setWrapStyleWord(true);
		jTextAreanombreListadosCentrosCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreListadosCentrosCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreListadosCentrosCostos = new JScrollPane(jTextAreanombreListadosCentrosCostos);
		jscrollPanenombreListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreListadosCentrosCostosBusqueda= new JButtonMe();
		this.jButtonnombreListadosCentrosCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosCentrosCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreListadosCentrosCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreListadosCentrosCostosBusqueda.setText("U");
		this.jButtonnombreListadosCentrosCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreListadosCentrosCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreListadosCentrosCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreListadosCentrosCostosBusqueda"));

		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreListadosCentrosCostosBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeListadosCentrosCostos = new JLabelMe();
		this.jLabelporcentajeListadosCentrosCostos.setText(""+ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeListadosCentrosCostos.setToolTipText("Porcentaje");
		this.jLabelporcentajeListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		this.jPanelporcentajeListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);


		jTextFieldporcentajeListadosCentrosCostos= new JTextFieldMe();
		jTextFieldporcentajeListadosCentrosCostos.setEnabled(false);
		jTextFieldporcentajeListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeListadosCentrosCostos.setText("0.0");

		this.jButtonporcentajeListadosCentrosCostosBusqueda= new JButtonMe();
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeListadosCentrosCostosBusqueda.setText("U");
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeListadosCentrosCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeListadosCentrosCostosBusqueda"));

		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeListadosCentrosCostosBusqueda.setVisible(false);		}


					
		this.jLabelvalorListadosCentrosCostos = new JLabelMe();
		this.jLabelvalorListadosCentrosCostos.setText(""+ListadosCentrosCostosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorListadosCentrosCostos.setToolTipText("Valor");
		this.jLabelvalorListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		this.jPanelvalorListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);


		jTextFieldvalorListadosCentrosCostos= new JTextFieldMe();
		jTextFieldvalorListadosCentrosCostos.setEnabled(false);
		jTextFieldvalorListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorListadosCentrosCostos.setText("0.0");

		this.jButtonvalorListadosCentrosCostosBusqueda= new JButtonMe();
		this.jButtonvalorListadosCentrosCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosCentrosCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorListadosCentrosCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorListadosCentrosCostosBusqueda.setText("U");
		this.jButtonvalorListadosCentrosCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorListadosCentrosCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorListadosCentrosCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorListadosCentrosCostosBusqueda"));

		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorListadosCentrosCostosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadosCentrosCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadosCentrosCostos = new JLabelMe();
		this.jLabelid_empresaListadosCentrosCostos.setText(""+ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadosCentrosCostos.setToolTipText("Empresa");
		this.jLabelid_empresaListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadosCentrosCostos.setToolTipText(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		this.jPanelid_empresaListadosCentrosCostos.setLayout(this.gridaBagLayoutListadosCentrosCostos);


		jComboBoxid_empresaListadosCentrosCostos= new JComboBoxMe();
		jComboBoxid_empresaListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadosCentrosCostos.setEnabled(false);

		this.jButtonid_empresaListadosCentrosCostos= new JButtonMe();
		this.jButtonid_empresaListadosCentrosCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadosCentrosCostos.setText("Buscar");
		this.jButtonid_empresaListadosCentrosCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadosCentrosCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosCostos"));

		this.jButtonid_empresaListadosCentrosCostosBusqueda= new JButtonMe();
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosCentrosCostosBusqueda.setText("U");
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosCostosBusqueda"));

		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadosCentrosCostosBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadosCentrosCostosUpdate= new JButtonMe();
		this.jButtonid_empresaListadosCentrosCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadosCentrosCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadosCentrosCostosUpdate.setText("U");
		this.jButtonid_empresaListadosCentrosCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadosCentrosCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadosCentrosCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadosCentrosCostosUpdate"));



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
		//this.jInternalFrameDetalleListadosCentrosCostos = new ListadosCentrosCostosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listados Centros Costos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosCentrosCostos= new GridBagLayout();
		

		
		String sToolTipListadosCentrosCostos="";
		sToolTipListadosCentrosCostos=ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosCentrosCostos+="(Contabilidad.ListadosCentrosCostos)";
		}
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosCentrosCostos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadosCentrosCostos = new JButtonMe();
		this.jButtonModificarListadosCentrosCostos = new JButtonMe();
        this.jButtonActualizarListadosCentrosCostos = new JButtonMe();
        this.jButtonEliminarListadosCentrosCostos = new JButtonMe();
        this.jButtonCancelarListadosCentrosCostos = new JButtonMe();
        this.jButtonGuardarCambiosListadosCentrosCostos = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadosCentrosCostos = new JButtonMe();
		this.jButtonCerrarListadosCentrosCostos = new JButtonMe();
		
		this.jScrollPanelDatosListadosCentrosCostos = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadosCentrosCostos = new JScrollPane();
		this.jScrollPanelDatosGeneralListadosCentrosCostos = new JScrollPane();
				
		
		
		this.jPanelCamposListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Centros Costos";
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosCentrosCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadosCentrosCostos.setName("jPanelCamposListadosCentrosCostos"); 

		this.jPanelCamposOcultosListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadosCentrosCostos.setName("jPanelCamposOcultosListadosCentrosCostos"); 

        this.jPanelAccionesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosCentrosCostos.setToolTipText("Acciones");
        this.jPanelAccionesListadosCentrosCostos.setName("Acciones"); 

		this.jPanelAccionesFormularioListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadosCentrosCostos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadosCentrosCostos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadosCentrosCostos.setText("Nuevo");
		this.jButtonModificarListadosCentrosCostos.setText("Editar");
        this.jButtonActualizarListadosCentrosCostos.setText("Actualizar");
        this.jButtonEliminarListadosCentrosCostos.setText("Eliminar");
        this.jButtonCancelarListadosCentrosCostos.setText("Cancelar");
        this.jButtonGuardarCambiosListadosCentrosCostos.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.setText("Guardar");
		this.jButtonCerrarListadosCentrosCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosCentrosCostos,"nuevo_button","Nuevo",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadosCentrosCostos,"modificar_button","Editar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadosCentrosCostos,"actualizar_button","Actualizar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadosCentrosCostos,"eliminar_button","Eliminar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadosCentrosCostos,"cancelar_button","Cancelar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadosCentrosCostos,"guardarcambios_button","Guardar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosCentrosCostos,"guardarcambiostabla_button","Guardar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosCentrosCostos,"cerrar_button","Salir",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadosCentrosCostos.setToolTipText("Nuevo"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadosCentrosCostos.setToolTipText("Editar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadosCentrosCostos.setToolTipText("Actualizar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadosCentrosCostos.setToolTipText("Eliminar)"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadosCentrosCostos.setToolTipText("Cancelar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadosCentrosCostos.setToolTipText("Guardar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.setToolTipText("Guardar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosCentrosCostos.setToolTipText("Salir"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosCentrosCostos";
		inputMap = this.jButtonNuevoListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosCentrosCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosCentrosCostos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadosCentrosCostos";
		inputMap = this.jButtonActualizarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadosCentrosCostos"));
		
		//ELIMINAR
		sMapKey = "EliminarListadosCentrosCostos";
		inputMap = this.jButtonEliminarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadosCentrosCostos"));
		
		//CANCELAR	
		sMapKey = "CancelarListadosCentrosCostos";
		inputMap = this.jButtonCancelarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadosCentrosCostos"));
		
		//CERRAR		
		sMapKey = "CerrarListadosCentrosCostos";
		inputMap = this.jButtonCerrarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosCentrosCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosCentrosCostos";
		inputMap = this.jButtonGuardarCambiosTablaListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosCentrosCostos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadosCentrosCostos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadosCentrosCostos.setToolTipText("Nuevo ListadosCentrosCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadosCentrosCostos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadosCentrosCostos.setToolTipText("Sin Cerrar Ventana ListadosCentrosCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadosCentrosCostos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadosCentrosCostos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosCentrosCostos.setText("Accion");
		this.jComboBoxTiposAccionesListadosCentrosCostos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadosCentrosCostos = new JLabelMe();
		
		this.jLabelAccionesListadosCentrosCostos.setText("Acciones");		
		this.jLabelAccionesListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadosCentrosCostos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadosCentrosCostos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadosCentrosCostos=new JTabbedPane();
		this.jTabbedPaneRelacionesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadosCentrosCostos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadosCentrosCostos = new GridBagLayout();
		
		this.jPanelCamposListadosCentrosCostos.setLayout(gridaBagLayoutCamposListadosCentrosCostos);
		this.jPanelCamposOcultosListadosCentrosCostos.setLayout(gridaBagLayoutCamposOcultosListadosCentrosCostos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadosCentrosCostos.add(jLabelIdListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadosCentrosCostos.add(jLabelidListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadosCentrosCostos.add(jLabelid_empresaListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 2;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosCentrosCostos.add(jButtonid_empresaListadosCentrosCostosBusqueda, this.gridBagConstraintsListadosCentrosCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 3;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadosCentrosCostos.add(jButtonid_empresaListadosCentrosCostosUpdate, this.gridBagConstraintsListadosCentrosCostos);
	}

	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadosCentrosCostos.add(jComboBoxid_empresaListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoListadosCentrosCostos.add(jLabelcodigoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 2;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoListadosCentrosCostos.add(jButtoncodigoListadosCentrosCostosBusqueda, this.gridBagConstraintsListadosCentrosCostos);
	}

	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoListadosCentrosCostos.add(jTextFieldcodigoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreListadosCentrosCostos.add(jLabelnombreListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 2;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreListadosCentrosCostos.add(jButtonnombreListadosCentrosCostosBusqueda, this.gridBagConstraintsListadosCentrosCostos);
	}

	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreListadosCentrosCostos.add(jscrollPanenombreListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeListadosCentrosCostos.add(jLabelporcentajeListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 2;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeListadosCentrosCostos.add(jButtonporcentajeListadosCentrosCostosBusqueda, this.gridBagConstraintsListadosCentrosCostos);
	}

	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeListadosCentrosCostos.add(jTextFieldporcentajeListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorListadosCentrosCostos.add(jLabelvalorListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 2;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
		this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorListadosCentrosCostos.add(jButtonvalorListadosCentrosCostosBusqueda, this.gridBagConstraintsListadosCentrosCostos);
	}

	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
	this.gridBagConstraintsListadosCentrosCostos.gridx = 1;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorListadosCentrosCostos.add(jTextFieldvalorListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosCostos.add(this.jPanelidListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposListadosCentrosCostos % 1==0) {
		iXPanelCamposListadosCentrosCostos=0;
		iYPanelCamposListadosCentrosCostos++;
	}
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosCostos.add(this.jPanelcodigoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposListadosCentrosCostos % 1==0) {
		iXPanelCamposListadosCentrosCostos=0;
		iYPanelCamposListadosCentrosCostos++;
	}
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosCostos.add(this.jPanelnombreListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposListadosCentrosCostos % 1==0) {
		iXPanelCamposListadosCentrosCostos=0;
		iYPanelCamposListadosCentrosCostos++;
	}
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosCostos.add(this.jPanelporcentajeListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposListadosCentrosCostos % 1==0) {
		iXPanelCamposListadosCentrosCostos=0;
		iYPanelCamposListadosCentrosCostos++;
	}
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadosCentrosCostos.add(this.jPanelvalorListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposListadosCentrosCostos % 1==0) {
		iXPanelCamposListadosCentrosCostos=0;
		iYPanelCamposListadosCentrosCostos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadosCentrosCostos.gridy = iYPanelCamposOcultosListadosCentrosCostos;
	this.gridBagConstraintsListadosCentrosCostos.gridx = iXPanelCamposOcultosListadosCentrosCostos++;
	this.gridBagConstraintsListadosCentrosCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadosCentrosCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadosCentrosCostos.add(this.jPanelid_empresaListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);



	if(iXPanelCamposOcultosListadosCentrosCostos % 1==0) {
		iXPanelCamposOcultosListadosCentrosCostos=0;
		iYPanelCamposOcultosListadosCentrosCostos++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadosCentrosCostos= new GridBagLayout();
		this.jPanelAccionesListadosCentrosCostos.setLayout(gridaBagLayoutAccionesListadosCentrosCostos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadosCentrosCostos= new GridBagLayout();
		this.jPanelAccionesFormularioListadosCentrosCostos.setLayout(gridaBagLayoutAccionesFormularioListadosCentrosCostos);
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadosCentrosCostos.add(this.jComboBoxTiposAccionesFormularioListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonModificarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);							

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonEliminarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonActualizarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonGuardarCambiosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);	
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;		
		this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonCancelarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosCentrosCostos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();						
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;		
			//this.gridBagConstraintsListadosCentrosCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosCentrosCostos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosCostos.gridx =0;
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosCentrosCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadosCentrosCostos = new ListadosCentrosCostosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listados Centros Costos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listados Centros Costos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Centros Costos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadosCentrosCostosModel listadoscentroscostosModel=new ListadosCentrosCostosModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadosCentrosCostosModel.ListadosCentrosCostosFocusTraversalPolicy listadoscentroscostosFocusTraversalPolicy = listadoscentroscostosModel.new ListadosCentrosCostosFocusTraversalPolicy(this);
			
			//listadoscentroscostosFocusTraversalPolicy.setlistadoscentroscostosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadoscentroscostosModel);
			
			
			this.jContentPaneDetalleListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadosCentrosCostos = new GridBagLayout();	
			this.jContentPaneDetalleListadosCentrosCostos.setLayout(gridaBagLayoutDetalleListadosCentrosCostos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosCentrosCostos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
					
				
				this.jContentPaneDetalleListadosCentrosCostos.add(jTtoolBarDetalleListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);								
				
}
			
			this.jScrollPanelDatosEdicionListadosCentrosCostos=   new JScrollPane(jContentPaneDetalleListadosCentrosCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadosCentrosCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	        
			this.jContentPaneDetalleListadosCentrosCostos.add(jPanelCamposListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);
			
			
			
			
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
						//&& listadoscentroscostosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadosCentrosCostos= new GridBagConstraints();
						this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
						this.jContentPaneDetalleListadosCentrosCostos.add(this.jTabbedPaneRelacionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadosCentrosCostos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadosCentrosCostos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
					this.gridBagConstraintsListadosCentrosCostos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
					
				
					this.jContentPaneDetalleListadosCentrosCostos.add(jPanelCamposOcultosListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);
				
					this.jPanelCamposOcultosListadosCentrosCostos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	        this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadosCentrosCostos.add(this.jPanelAccionesFormularioListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);							
			
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
	        this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
	        
			
			this.jContentPaneDetalleListadosCentrosCostos.add(this.jPanelAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadosCentrosCostos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadosCentrosCostos=   new JScrollPane(this.jPanelCamposListadosCentrosCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadosCentrosCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadosCentrosCostos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadosCentrosCostos;//jContentPane;
		
		return jScrollPanelDatosEdicionListadosCentrosCostos;
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
