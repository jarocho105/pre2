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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ListadoMovimientosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ListadoMovimientosDetalleFormJInternalFrame extends ListadoMovimientosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleListadoMovimientos;
	
	protected JMenuBar jmenuBarDetalleListadoMovimientos;
	
	protected JMenu jmenuDetalleListadoMovimientos;
	protected JMenu jmenuDetalleArchivoListadoMovimientos;
	protected JMenu jmenuDetalleAccionesListadoMovimientos;
	protected JMenu jmenuDetalleDatosListadoMovimientos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoMovimientos;	
	protected GridBagConstraints gridBagConstraintsListadoMovimientos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ListadoMovimientosBeanSwingJInternalFrameAdditional jInternalFrameDetalleListadoMovimientos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoMovimientosSessionBean listadomovimientosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ListadoMovimientosLogic listadomovimientosLogic;
	
	public JScrollPane jScrollPanelDatosListadoMovimientos;
	public JScrollPane jScrollPanelDatosEdicionListadoMovimientos;
	public JScrollPane jScrollPanelDatosGeneralListadoMovimientos;
	
	protected JPanel jPanelCamposListadoMovimientos;    
	protected JPanel jPanelCamposOcultosListadoMovimientos;    	
	protected JPanel jPanelAccionesListadoMovimientos;
	protected JPanel jPanelAccionesFormularioListadoMovimientos;
    
	
	
	protected Integer iXPanelCamposListadoMovimientos=0;
	protected Integer iYPanelCamposListadoMovimientos=0;
	
	protected Integer iXPanelCamposOcultosListadoMovimientos=0;
	protected Integer iYPanelCamposOcultosListadoMovimientos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoListadoMovimientos;
	public JButton jButtonModificarListadoMovimientos;
	public JButton jButtonActualizarListadoMovimientos;
    public JButton jButtonEliminarListadoMovimientos;
	public JButton jButtonCancelarListadoMovimientos;
    public JButton jButtonGuardarCambiosListadoMovimientos;
	public JButton jButtonGuardarCambiosTablaListadoMovimientos;
	protected JButton jButtonCerrarListadoMovimientos;
	
	
	protected JButton jButtonProcesarInformacionListadoMovimientos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoListadoMovimientos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarListadoMovimientos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeListadoMovimientos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoMovimientos;
	protected JButton jButtonModificarToolBarListadoMovimientos;
	protected JButton jButtonActualizarToolBarListadoMovimientos;
    protected JButton jButtonEliminarToolBarListadoMovimientos;
	protected JButton jButtonCancelarToolBarListadoMovimientos;
    protected JButton jButtonGuardarCambiosToolBarListadoMovimientos;
	protected JButton jButtonGuardarCambiosTablaToolBarListadoMovimientos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoMovimientos;
	protected JButton jButtonCerrarToolBarListadoMovimientos;
	
	protected JButton jButtonProcesarInformacionToolBarListadoMovimientos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoMovimientos;
	protected JMenuItem jMenuItemModificarListadoMovimientos;
	protected JMenuItem jMenuItemActualizarListadoMovimientos;
    protected JMenuItem jMenuItemEliminarListadoMovimientos;
	protected JMenuItem jMenuItemCancelarListadoMovimientos;
    protected JMenuItem jMenuItemGuardarCambiosListadoMovimientos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoMovimientos;
	protected JMenuItem jMenuItemCerrarListadoMovimientos;
	protected JMenuItem jMenuItemDetalleCerrarListadoMovimientos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoMovimientos;
	
	protected JMenuItem jMenuItemProcesarInformacionListadoMovimientos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoMovimientos;
	protected JMenuItem jMenuItemMostrarOcultarListadoMovimientos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoMovimientos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoMovimientos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioListadoMovimientos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidListadoMovimientos;
	public JLabel jLabelIdListadoMovimientos;
	public JLabel jLabelidListadoMovimientos;
	public JButton jButtonidListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeListadoMovimientos;
	public JLabel jLabelfecha_emision_desdeListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeListadoMovimientos;

	public JDateChooser jDateChooserfecha_emision_desdeListadoMovimientos;
	public JButton jButtonfecha_emision_desdeListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaListadoMovimientos;
	public JLabel jLabelfecha_emision_hastaListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaListadoMovimientos;

	public JDateChooser jDateChooserfecha_emision_hastaListadoMovimientos;
	public JButton jButtonfecha_emision_hastaListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionListadoMovimientos;
	public JLabel jLabelnombre_transaccionListadoMovimientos;
	public JTextField jTextFieldnombre_transaccionListadoMovimientos;
	public JButton jButtonnombre_transaccionListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionListadoMovimientos;
	public JLabel jLabelfecha_emisionListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_emisionListadoMovimientos;

	public JDateChooser jDateChooserfecha_emisionListadoMovimientos;
	public JButton jButtonfecha_emisionListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaListadoMovimientos;
	public JLabel jLabelfecha_ventaListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_ventaListadoMovimientos;

	public JDateChooser jDateChooserfecha_ventaListadoMovimientos;
	public JButton jButtonfecha_ventaListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteListadoMovimientos;
	public JLabel jLabelnumero_comprobanteListadoMovimientos;
	public JTextField jTextFieldnumero_comprobanteListadoMovimientos;
	public JButton jButtonnumero_comprobanteListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteListadoMovimientos;
	public JLabel jLabelnombre_clienteListadoMovimientos;
	public JTextArea jTextAreanombre_clienteListadoMovimientos;
	public JScrollPane jscrollPanenombre_clienteListadoMovimientos;
	public JButton jButtonnombre_clienteListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localListadoMovimientos;
	public JLabel jLabeldebito_mone_localListadoMovimientos;
	public JTextField jTextFielddebito_mone_localListadoMovimientos;
	public JButton jButtondebito_mone_localListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localListadoMovimientos;
	public JLabel jLabelcredito_mone_localListadoMovimientos;
	public JTextField jTextFieldcredito_mone_localListadoMovimientos;
	public JButton jButtoncredito_mone_localListadoMovimientosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionListadoMovimientos;
	public JLabel jLabeldescripcionListadoMovimientos;
	public JTextArea jTextAreadescripcionListadoMovimientos;
	public JScrollPane jscrollPanedescripcionListadoMovimientos;
	public JButton jButtondescripcionListadoMovimientosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaListadoMovimientos;
	public JLabel jLabelid_empresaListadoMovimientos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaListadoMovimientos;
	public JButton jButtonid_empresaListadoMovimientos= new JButtonMe();
	public JButton jButtonid_empresaListadoMovimientosUpdate= new JButtonMe();
	public JButton jButtonid_empresaListadoMovimientosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesListadoMovimientos;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ListadoMovimientosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposListadoMovimientos=new JPanel();
				this.jPanelAccionesFormularioListadoMovimientos=new JPanel();
				this.jmenuBarDetalleListadoMovimientos=new JMenuBar();
				this.jTtoolBarDetalleListadoMovimientos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ListadoMovimientosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarListadoMovimientos() {
		return this.jButtonActualizarToolBarListadoMovimientos;
	}
	
	public JButton getjButtonEliminarToolBarListadoMovimientos() {
		return this.jButtonEliminarToolBarListadoMovimientos;
	}
	
	public JButton getjButtonCancelarToolBarListadoMovimientos() {
		return this.jButtonCancelarToolBarListadoMovimientos;
	}		
	
	public JButton getjButtonProcesarInformacionListadoMovimientos() {
		return this.jButtonProcesarInformacionListadoMovimientos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoMovimientos)	{
		this.jButtonProcesarInformacionListadoMovimientos = jButtonProcesarInformacionListadoMovimientos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoMovimientos() {
		return this.jComboBoxTiposAccionesListadoMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoMovimientos(
			JComboBox jComboBoxTiposRelacionesListadoMovimientos) {
		this.jComboBoxTiposRelacionesListadoMovimientos = jComboBoxTiposRelacionesListadoMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoMovimientos(
			JComboBox jComboBoxTiposAccionesListadoMovimientos) {
		this.jComboBoxTiposAccionesListadoMovimientos = jComboBoxTiposAccionesListadoMovimientos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioListadoMovimientos() {
		return this.jComboBoxTiposAccionesFormularioListadoMovimientos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioListadoMovimientos(
			JComboBox jComboBoxTiposAccionesFormularioListadoMovimientos) {
		this.jComboBoxTiposAccionesFormularioListadoMovimientos = jComboBoxTiposAccionesFormularioListadoMovimientos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
		
		this.listadomovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadomovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadomovimientosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoMovimientosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Movimientos MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
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
	
		ListadoMovimientosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleListadoMovimientos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarListadoMovimientos=new JButtonMe();
				this.jButtonModificarToolBarListadoMovimientos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos,
							"actualizar","actualizar","Actualizar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos,
							"eliminar","eliminar","Eliminar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos,
							"cancelar","cancelar","Cancelar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarListadoMovimientos,this.jTtoolBarDetalleListadoMovimientos,
							"guardarcambios","guardarcambios","Guardar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleListadoMovimientos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleListadoMovimientos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoListadoMovimientos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesListadoMovimientos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosListadoMovimientos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoMovimientos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoMovimientos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoMovimientos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarListadoMovimientos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarListadoMovimientos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarListadoMovimientos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarListadoMovimientos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarListadoMovimientos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarListadoMovimientos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarListadoMovimientos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarListadoMovimientos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarListadoMovimientos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarListadoMovimientos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarListadoMovimientos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarListadoMovimientos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosListadoMovimientos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoMovimientos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoMovimientos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarListadoMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarListadoMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarListadoMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoListadoMovimientos.add(this.jMenuItemDetalleCerrarListadoMovimientos);
		
		this.jmenuDetalleAccionesListadoMovimientos.add(this.jMenuItemActualizarListadoMovimientos);
		this.jmenuDetalleAccionesListadoMovimientos.add(this.jMenuItemEliminarListadoMovimientos);
		this.jmenuDetalleAccionesListadoMovimientos.add(this.jMenuItemCancelarListadoMovimientos);		
		
		//this.jmenuDetalleDatosListadoMovimientos.add(this.jMenuItemDetalleAbrirOrderByListadoMovimientos);				
		this.jmenuDetalleDatosListadoMovimientos.add(this.jMenuItemDetalleMostarOcultarListadoMovimientos);				
				
		//this.jmenuDetalleAccionesListadoMovimientos.add(this.jMenuItemGuardarCambiosListadoMovimientos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleListadoMovimientos.add(this.jmenuDetalleArchivoListadoMovimientos);		
		this.jmenuBarDetalleListadoMovimientos.add(this.jmenuDetalleAccionesListadoMovimientos);		
		this.jmenuBarDetalleListadoMovimientos.add(this.jmenuDetalleDatosListadoMovimientos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleListadoMovimientos);				
	}
	
	
	public void inicializarElementosCamposListadoMovimientos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdListadoMovimientos = new JLabelMe();
		jLabelIdListadoMovimientos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidListadoMovimientos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutListadoMovimientos= new GridBagLayout();

		this.jPanelidListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);

		jLabelidListadoMovimientos = new JLabel();
		jLabelidListadoMovimientos.setText("Id");

		jLabelidListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeListadoMovimientos = new JLabelMe();
		this.jLabelfecha_emision_desdeListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeListadoMovimientos.setToolTipText("Fecha Desde");
		this.jLabelfecha_emision_desdeListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emision_desdeListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emision_desdeListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelfecha_emision_desdeListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		//jFormattedTextFieldfecha_emision_desdeListadoMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeListadoMovimientos= new JDateChooser();
		jDateChooserfecha_emision_desdeListadoMovimientos.setEnabled(false);
		jDateChooserfecha_emision_desdeListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeListadoMovimientos.setDate(new Date());
		jDateChooserfecha_emision_desdeListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaListadoMovimientos = new JLabelMe();
		this.jLabelfecha_emision_hastaListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaListadoMovimientos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_emision_hastaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emision_hastaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emision_hastaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelfecha_emision_hastaListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		//jFormattedTextFieldfecha_emision_hastaListadoMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaListadoMovimientos= new JDateChooser();
		jDateChooserfecha_emision_hastaListadoMovimientos.setEnabled(false);
		jDateChooserfecha_emision_hastaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaListadoMovimientos.setDate(new Date());
		jDateChooserfecha_emision_hastaListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionListadoMovimientos = new JLabelMe();
		this.jLabelnombre_transaccionListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionListadoMovimientos.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelnombre_transaccionListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextFieldnombre_transaccionListadoMovimientos= new JTextFieldMe();

		jTextFieldnombre_transaccionListadoMovimientos.setEnabled(false);
		jTextFieldnombre_transaccionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_transaccionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_transaccionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_transaccionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_transaccionListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionListadoMovimientosBusqueda.setText("U");
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_transaccionListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_transaccionListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionListadoMovimientos = new JLabelMe();
		this.jLabelfecha_emisionListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionListadoMovimientos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelfecha_emisionListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		//jFormattedTextFieldfecha_emisionListadoMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionListadoMovimientos= new JDateChooser();
		jDateChooserfecha_emisionListadoMovimientos.setEnabled(false);
		jDateChooserfecha_emisionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionListadoMovimientos.setDate(new Date());
		jDateChooserfecha_emisionListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionListadoMovimientosBusqueda.setText("U");
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ventaListadoMovimientos = new JLabelMe();
		this.jLabelfecha_ventaListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaListadoMovimientos.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelfecha_ventaListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		//jFormattedTextFieldfecha_ventaListadoMovimientos= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaListadoMovimientos= new JDateChooser();
		jDateChooserfecha_ventaListadoMovimientos.setEnabled(false);
		jDateChooserfecha_ventaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaListadoMovimientos.setDate(new Date());
		jDateChooserfecha_ventaListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaListadoMovimientosBusqueda.setText("U");
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteListadoMovimientos = new JLabelMe();
		this.jLabelnumero_comprobanteListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteListadoMovimientos.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelnumero_comprobanteListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextFieldnumero_comprobanteListadoMovimientos= new JTextFieldMe();

		jTextFieldnumero_comprobanteListadoMovimientos.setEnabled(false);
		jTextFieldnumero_comprobanteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setText("U");
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteListadoMovimientos = new JLabelMe();
		this.jLabelnombre_clienteListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteListadoMovimientos.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelnombre_clienteListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextAreanombre_clienteListadoMovimientos= new JTextAreaMe();
		jTextAreanombre_clienteListadoMovimientos.setEnabled(false);
		jTextAreanombre_clienteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteListadoMovimientos.setLineWrap(true);
		jTextAreanombre_clienteListadoMovimientos.setWrapStyleWord(true);
		jTextAreanombre_clienteListadoMovimientos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteListadoMovimientos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteListadoMovimientos = new JScrollPane(jTextAreanombre_clienteListadoMovimientos);
		jscrollPanenombre_clienteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteListadoMovimientosBusqueda.setText("U");
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localListadoMovimientos = new JLabelMe();
		this.jLabeldebito_mone_localListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localListadoMovimientos.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPaneldebito_mone_localListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextFielddebito_mone_localListadoMovimientos= new JTextFieldMe();
		jTextFielddebito_mone_localListadoMovimientos.setEnabled(false);
		jTextFielddebito_mone_localListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localListadoMovimientos.setText("0.0");

		this.jButtondebito_mone_localListadoMovimientosBusqueda= new JButtonMe();
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localListadoMovimientosBusqueda.setText("U");
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localListadoMovimientos = new JLabelMe();
		this.jLabelcredito_mone_localListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localListadoMovimientos.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelcredito_mone_localListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextFieldcredito_mone_localListadoMovimientos= new JTextFieldMe();
		jTextFieldcredito_mone_localListadoMovimientos.setEnabled(false);
		jTextFieldcredito_mone_localListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localListadoMovimientos.setText("0.0");

		this.jButtoncredito_mone_localListadoMovimientosBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localListadoMovimientosBusqueda.setText("U");
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localListadoMovimientosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionListadoMovimientos = new JLabelMe();
		this.jLabeldescripcionListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionListadoMovimientos.setToolTipText("Descripcion");
		this.jLabeldescripcionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPaneldescripcionListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jTextAreadescripcionListadoMovimientos= new JTextAreaMe();
		jTextAreadescripcionListadoMovimientos.setEnabled(false);
		jTextAreadescripcionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionListadoMovimientos.setLineWrap(true);
		jTextAreadescripcionListadoMovimientos.setWrapStyleWord(true);
		jTextAreadescripcionListadoMovimientos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionListadoMovimientos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionListadoMovimientos = new JScrollPane(jTextAreadescripcionListadoMovimientos);
		jscrollPanedescripcionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionListadoMovimientosBusqueda= new JButtonMe();
		this.jButtondescripcionListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionListadoMovimientosBusqueda.setText("U");
		this.jButtondescripcionListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionListadoMovimientosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysListadoMovimientos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaListadoMovimientos = new JLabelMe();
		this.jLabelid_empresaListadoMovimientos.setText(""+ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaListadoMovimientos.setToolTipText("Empresa");
		this.jLabelid_empresaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaListadoMovimientos.setToolTipText(ListadoMovimientosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutListadoMovimientos = new GridBagLayout();
		this.jPanelid_empresaListadoMovimientos.setLayout(this.gridaBagLayoutListadoMovimientos);


		jComboBoxid_empresaListadoMovimientos= new JComboBoxMe();
		jComboBoxid_empresaListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaListadoMovimientos.setEnabled(false);

		this.jButtonid_empresaListadoMovimientos= new JButtonMe();
		this.jButtonid_empresaListadoMovimientos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoMovimientos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoMovimientos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaListadoMovimientos.setText("Buscar");
		this.jButtonid_empresaListadoMovimientos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaListadoMovimientos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoMovimientos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoMovimientos"));

		this.jButtonid_empresaListadoMovimientosBusqueda= new JButtonMe();
		this.jButtonid_empresaListadoMovimientosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoMovimientosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoMovimientosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoMovimientosBusqueda.setText("U");
		this.jButtonid_empresaListadoMovimientosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaListadoMovimientosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoMovimientosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoMovimientosBusqueda"));

		if(this.listadomovimientosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaListadoMovimientosBusqueda.setVisible(false);		}

		this.jButtonid_empresaListadoMovimientosUpdate= new JButtonMe();
		this.jButtonid_empresaListadoMovimientosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoMovimientosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaListadoMovimientosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaListadoMovimientosUpdate.setText("U");
		this.jButtonid_empresaListadoMovimientosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaListadoMovimientosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaListadoMovimientosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaListadoMovimientos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaListadoMovimientos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaListadoMovimientosUpdate"));



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
		//this.jInternalFrameDetalleListadoMovimientos = new ListadoMovimientosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Listado Movimientos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoMovimientos= new GridBagLayout();
		

		
		String sToolTipListadoMovimientos="";
		sToolTipListadoMovimientos=ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoMovimientos+="(Cartera.ListadoMovimientos)";
		}
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoMovimientos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoListadoMovimientos = new JButtonMe();
		this.jButtonModificarListadoMovimientos = new JButtonMe();
        this.jButtonActualizarListadoMovimientos = new JButtonMe();
        this.jButtonEliminarListadoMovimientos = new JButtonMe();
        this.jButtonCancelarListadoMovimientos = new JButtonMe();
        this.jButtonGuardarCambiosListadoMovimientos = new JButtonMe();
		this.jButtonGuardarCambiosTablaListadoMovimientos = new JButtonMe();
		this.jButtonCerrarListadoMovimientos = new JButtonMe();
		
		this.jScrollPanelDatosListadoMovimientos = new JScrollPane();   
        this.jScrollPanelDatosEdicionListadoMovimientos = new JScrollPane();
		this.jScrollPanelDatosGeneralListadoMovimientos = new JScrollPane();
				
		
		
		this.jPanelCamposListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Movimientos";
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposListadoMovimientos.setName("jPanelCamposListadoMovimientos"); 

		this.jPanelCamposOcultosListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosListadoMovimientos.setName("jPanelCamposOcultosListadoMovimientos"); 

        this.jPanelAccionesListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesListadoMovimientos.setName("Acciones"); 

		this.jPanelAccionesFormularioListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioListadoMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioListadoMovimientos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoListadoMovimientos.setText("Nuevo");
		this.jButtonModificarListadoMovimientos.setText("Editar");
        this.jButtonActualizarListadoMovimientos.setText("Actualizar");
        this.jButtonEliminarListadoMovimientos.setText("Eliminar");
        this.jButtonCancelarListadoMovimientos.setText("Cancelar");
        this.jButtonGuardarCambiosListadoMovimientos.setText("Guardar");
		this.jButtonGuardarCambiosTablaListadoMovimientos.setText("Guardar");
		this.jButtonCerrarListadoMovimientos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoMovimientos,"nuevo_button","Nuevo",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarListadoMovimientos,"modificar_button","Editar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarListadoMovimientos,"actualizar_button","Actualizar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarListadoMovimientos,"eliminar_button","Eliminar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarListadoMovimientos,"cancelar_button","Cancelar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosListadoMovimientos,"guardarcambios_button","Guardar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoMovimientos,"guardarcambiostabla_button","Guardar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoMovimientos,"cerrar_button","Salir",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoListadoMovimientos.setToolTipText("Nuevo"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarListadoMovimientos.setToolTipText("Editar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarListadoMovimientos.setToolTipText("Actualizar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarListadoMovimientos.setToolTipText("Eliminar)"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarListadoMovimientos.setToolTipText("Cancelar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosListadoMovimientos.setToolTipText("Guardar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaListadoMovimientos.setToolTipText("Guardar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoMovimientos.setToolTipText("Salir"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoMovimientos";
		inputMap = this.jButtonNuevoListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoMovimientos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarListadoMovimientos";
		inputMap = this.jButtonActualizarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarListadoMovimientos"));
		
		//ELIMINAR
		sMapKey = "EliminarListadoMovimientos";
		inputMap = this.jButtonEliminarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarListadoMovimientos"));
		
		//CANCELAR	
		sMapKey = "CancelarListadoMovimientos";
		inputMap = this.jButtonCancelarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarListadoMovimientos"));
		
		//CERRAR		
		sMapKey = "CerrarListadoMovimientos";
		inputMap = this.jButtonCerrarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoMovimientos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoMovimientos";
		inputMap = this.jButtonGuardarCambiosTablaListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoMovimientos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoListadoMovimientos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoListadoMovimientos.setToolTipText("Nuevo ListadoMovimientos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarListadoMovimientos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarListadoMovimientos.setToolTipText("Sin Cerrar Ventana ListadoMovimientos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeListadoMovimientos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeListadoMovimientos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoMovimientos.setText("Accion");
		this.jComboBoxTiposAccionesListadoMovimientos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioListadoMovimientos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioListadoMovimientos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesListadoMovimientos = new JLabelMe();
		
		this.jLabelAccionesListadoMovimientos.setText("Acciones");		
		this.jLabelAccionesListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposListadoMovimientos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysListadoMovimientos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesListadoMovimientos=new JTabbedPane();
		this.jTabbedPaneRelacionesListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesListadoMovimientos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesListadoMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioListadoMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioListadoMovimientos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposListadoMovimientos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosListadoMovimientos = new GridBagLayout();
		
		this.jPanelCamposListadoMovimientos.setLayout(gridaBagLayoutCamposListadoMovimientos);
		this.jPanelCamposOcultosListadoMovimientos.setLayout(gridaBagLayoutCamposOcultosListadoMovimientos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidListadoMovimientos.add(jLabelIdListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidListadoMovimientos.add(jLabelidListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaListadoMovimientos.add(jLabelid_empresaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoMovimientos.add(jButtonid_empresaListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 3;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaListadoMovimientos.add(jButtonid_empresaListadoMovimientosUpdate, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaListadoMovimientos.add(jComboBoxid_empresaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeListadoMovimientos.add(jLabelfecha_emision_desdeListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeListadoMovimientos.add(jButtonfecha_emision_desdeListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeListadoMovimientos.add(jDateChooserfecha_emision_desdeListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaListadoMovimientos.add(jLabelfecha_emision_hastaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaListadoMovimientos.add(jButtonfecha_emision_hastaListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaListadoMovimientos.add(jDateChooserfecha_emision_hastaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionListadoMovimientos.add(jLabelnombre_transaccionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionListadoMovimientos.add(jButtonnombre_transaccionListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionListadoMovimientos.add(jTextFieldnombre_transaccionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionListadoMovimientos.add(jLabelfecha_emisionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionListadoMovimientos.add(jButtonfecha_emisionListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionListadoMovimientos.add(jDateChooserfecha_emisionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaListadoMovimientos.add(jLabelfecha_ventaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaListadoMovimientos.add(jButtonfecha_ventaListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaListadoMovimientos.add(jDateChooserfecha_ventaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteListadoMovimientos.add(jLabelnumero_comprobanteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteListadoMovimientos.add(jButtonnumero_comprobanteListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteListadoMovimientos.add(jTextFieldnumero_comprobanteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteListadoMovimientos.add(jLabelnombre_clienteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteListadoMovimientos.add(jButtonnombre_clienteListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteListadoMovimientos.add(jscrollPanenombre_clienteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localListadoMovimientos.add(jLabeldebito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localListadoMovimientos.add(jButtondebito_mone_localListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localListadoMovimientos.add(jTextFielddebito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localListadoMovimientos.add(jLabelcredito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localListadoMovimientos.add(jButtoncredito_mone_localListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localListadoMovimientos.add(jTextFieldcredito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 0;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionListadoMovimientos.add(jLabeldescripcionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 2;
		this.gridBagConstraintsListadoMovimientos.ipadx = 0;
		this.gridBagConstraintsListadoMovimientos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionListadoMovimientos.add(jButtondescripcionListadoMovimientosBusqueda, this.gridBagConstraintsListadoMovimientos);
	}

	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsListadoMovimientos.gridy = 0;
	this.gridBagConstraintsListadoMovimientos.gridx = 1;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionListadoMovimientos.add(jscrollPanedescripcionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelidListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelfecha_emision_desdeListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelfecha_emision_hastaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelnombre_transaccionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelfecha_emisionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelfecha_ventaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelnumero_comprobanteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelnombre_clienteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPaneldebito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPanelcredito_mone_localListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposListadoMovimientos.add(this.jPaneldescripcionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposListadoMovimientos % 1==0) {
		iXPanelCamposListadoMovimientos=0;
		iYPanelCamposListadoMovimientos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsListadoMovimientos.gridy = iYPanelCamposOcultosListadoMovimientos;
	this.gridBagConstraintsListadoMovimientos.gridx = iXPanelCamposOcultosListadoMovimientos++;
	this.gridBagConstraintsListadoMovimientos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsListadoMovimientos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosListadoMovimientos.add(this.jPanelid_empresaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);



	if(iXPanelCamposOcultosListadoMovimientos % 1==0) {
		iXPanelCamposOcultosListadoMovimientos=0;
		iYPanelCamposOcultosListadoMovimientos++;
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
			
		GridBagLayout gridaBagLayoutAccionesListadoMovimientos= new GridBagLayout();
		this.jPanelAccionesListadoMovimientos.setLayout(gridaBagLayoutAccionesListadoMovimientos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioListadoMovimientos= new GridBagLayout();
		this.jPanelAccionesFormularioListadoMovimientos.setLayout(gridaBagLayoutAccionesFormularioListadoMovimientos);
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsListadoMovimientos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioListadoMovimientos.add(this.jComboBoxTiposAccionesFormularioListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccion++;
			
		this.jPanelAccionesListadoMovimientos.add(this.jButtonModificarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);							

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx =iPosXAccion++;
			
		this.jPanelAccionesListadoMovimientos.add(this.jButtonEliminarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = 0;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoMovimientos.add(this.jButtonActualizarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = 0;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccion++;
		
		this.jPanelAccionesListadoMovimientos.add(this.jButtonGuardarCambiosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);	
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = 0;		
		this.gridBagConstraintsListadoMovimientos.gridx =iPosXAccion++;
		
		this.jPanelAccionesListadoMovimientos.add(this.jButtonCancelarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoMovimientos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoMovimientos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();						
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoMovimientos.gridx = 0;		
			//this.gridBagConstraintsListadoMovimientos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoMovimientos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoMovimientos.gridx =0;
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoMovimientos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleListadoMovimientos = new ListadoMovimientosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Listado Movimientos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Listado Movimientos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Movimientos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ListadoMovimientosModel listadomovimientosModel=new ListadoMovimientosModel(this);
			
			//SI USARA CLASE INTERNA
			//ListadoMovimientosModel.ListadoMovimientosFocusTraversalPolicy listadomovimientosFocusTraversalPolicy = listadomovimientosModel.new ListadoMovimientosFocusTraversalPolicy(this);
			
			//listadomovimientosFocusTraversalPolicy.setlistadomovimientosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(listadomovimientosModel);
			
			
			this.jContentPaneDetalleListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleListadoMovimientos = new GridBagLayout();	
			this.jContentPaneDetalleListadoMovimientos.setLayout(gridaBagLayoutDetalleListadoMovimientos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoMovimientos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
				this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsListadoMovimientos.gridx = 0;
					
				
				this.jContentPaneDetalleListadoMovimientos.add(jTtoolBarDetalleListadoMovimientos, gridBagConstraintsListadoMovimientos);								
				
}
			
			this.jScrollPanelDatosEdicionListadoMovimientos=   new JScrollPane(jContentPaneDetalleListadoMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralListadoMovimientos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsListadoMovimientos.gridx = 0;
	        
			this.jContentPaneDetalleListadoMovimientos.add(jPanelCamposListadoMovimientos, gridBagConstraintsListadoMovimientos);
			
			
			
			
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
						//&& listadomovimientosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.listadomovimientosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsListadoMovimientos= new GridBagConstraints();
						this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsListadoMovimientos.gridx = 0;
						this.jContentPaneDetalleListadoMovimientos.add(this.jTabbedPaneRelacionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesListadoMovimientos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosListadoMovimientos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
					this.gridBagConstraintsListadoMovimientos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsListadoMovimientos.gridx = 0;
					
				
					this.jContentPaneDetalleListadoMovimientos.add(jPanelCamposOcultosListadoMovimientos, gridBagConstraintsListadoMovimientos);
				
					this.jPanelCamposOcultosListadoMovimientos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsListadoMovimientos.gridx = 0;
	        this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleListadoMovimientos.add(this.jPanelAccionesFormularioListadoMovimientos, this.gridBagConstraintsListadoMovimientos);							
			
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
	        this.gridBagConstraintsListadoMovimientos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsListadoMovimientos.gridx = 0;
	        
			
			this.jContentPaneDetalleListadoMovimientos.add(this.jPanelAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionListadoMovimientos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionListadoMovimientos=   new JScrollPane(this.jPanelCamposListadoMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionListadoMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionListadoMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsListadoMovimientos.gridx = 0;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsListadoMovimientos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoMovimientos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsListadoMovimientos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralListadoMovimientos;//jContentPane;
		
		return jScrollPanelDatosEdicionListadoMovimientos;
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
