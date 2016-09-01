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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasResumidosVentasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasResumidosVentasDetalleFormJInternalFrame extends VentasResumidosVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasResumidosVentas;
	
	protected JMenuBar jmenuBarDetalleVentasResumidosVentas;
	
	protected JMenu jmenuDetalleVentasResumidosVentas;
	protected JMenu jmenuDetalleArchivoVentasResumidosVentas;
	protected JMenu jmenuDetalleAccionesVentasResumidosVentas;
	protected JMenu jmenuDetalleDatosVentasResumidosVentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidosVentas;	
	protected GridBagConstraints gridBagConstraintsVentasResumidosVentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasResumidosVentasBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasResumidosVentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VentasResumidosVentasSessionBean ventasresumidosventasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public VentasResumidosVentasLogic ventasresumidosventasLogic;
	
	public JScrollPane jScrollPanelDatosVentasResumidosVentas;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidosVentas;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidosVentas;
	
	protected JPanel jPanelCamposVentasResumidosVentas;    
	protected JPanel jPanelCamposOcultosVentasResumidosVentas;    	
	protected JPanel jPanelAccionesVentasResumidosVentas;
	protected JPanel jPanelAccionesFormularioVentasResumidosVentas;
    
	
	
	protected Integer iXPanelCamposVentasResumidosVentas=0;
	protected Integer iYPanelCamposVentasResumidosVentas=0;
	
	protected Integer iXPanelCamposOcultosVentasResumidosVentas=0;
	protected Integer iYPanelCamposOcultosVentasResumidosVentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasResumidosVentas;
	public JButton jButtonModificarVentasResumidosVentas;
	public JButton jButtonActualizarVentasResumidosVentas;
    public JButton jButtonEliminarVentasResumidosVentas;
	public JButton jButtonCancelarVentasResumidosVentas;
    public JButton jButtonGuardarCambiosVentasResumidosVentas;
	public JButton jButtonGuardarCambiosTablaVentasResumidosVentas;
	protected JButton jButtonCerrarVentasResumidosVentas;
	
	
	protected JButton jButtonProcesarInformacionVentasResumidosVentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasResumidosVentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasResumidosVentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasResumidosVentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidosVentas;
	protected JButton jButtonModificarToolBarVentasResumidosVentas;
	protected JButton jButtonActualizarToolBarVentasResumidosVentas;
    protected JButton jButtonEliminarToolBarVentasResumidosVentas;
	protected JButton jButtonCancelarToolBarVentasResumidosVentas;
    protected JButton jButtonGuardarCambiosToolBarVentasResumidosVentas;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasResumidosVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidosVentas;
	protected JButton jButtonCerrarToolBarVentasResumidosVentas;
	
	protected JButton jButtonProcesarInformacionToolBarVentasResumidosVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidosVentas;
	protected JMenuItem jMenuItemModificarVentasResumidosVentas;
	protected JMenuItem jMenuItemActualizarVentasResumidosVentas;
    protected JMenuItem jMenuItemEliminarVentasResumidosVentas;
	protected JMenuItem jMenuItemCancelarVentasResumidosVentas;
    protected JMenuItem jMenuItemGuardarCambiosVentasResumidosVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidosVentas;
	protected JMenuItem jMenuItemCerrarVentasResumidosVentas;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidosVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidosVentas;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidosVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidosVentas;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidosVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidosVentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidosVentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasResumidosVentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasResumidosVentas;
	public JLabel jLabelIdVentasResumidosVentas;
	public JLabel jLabelidVentasResumidosVentas;
	public JButton jButtonidVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasResumidosVentas;
	public JLabel jLabelfecha_emision_desdeVentasResumidosVentas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasResumidosVentas;

	public JDateChooser jDateChooserfecha_emision_desdeVentasResumidosVentas;
	public JButton jButtonfecha_emision_desdeVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasResumidosVentas;
	public JLabel jLabelfecha_emision_hastaVentasResumidosVentas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasResumidosVentas;

	public JDateChooser jDateChooserfecha_emision_hastaVentasResumidosVentas;
	public JButton jButtonfecha_emision_hastaVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPaneldiaVentasResumidosVentas;
	public JLabel jLabeldiaVentasResumidosVentas;
	public JTextField jTextFielddiaVentasResumidosVentas;
	public JButton jButtondiaVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaVentasResumidosVentas;
	public JLabel jLabeltotal_ivaVentasResumidosVentas;
	public JTextField jTextFieldtotal_ivaVentasResumidosVentas;
	public JButton jButtontotal_ivaVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaVentasResumidosVentas;
	public JLabel jLabeltotal_sin_ivaVentasResumidosVentas;
	public JTextField jTextFieldtotal_sin_ivaVentasResumidosVentas;
	public JButton jButtontotal_sin_ivaVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_fleteVentasResumidosVentas;
	public JLabel jLabeltotal_fleteVentasResumidosVentas;
	public JTextField jTextFieldtotal_fleteVentasResumidosVentas;
	public JButton jButtontotal_fleteVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPanelivaVentasResumidosVentas;
	public JLabel jLabelivaVentasResumidosVentas;
	public JTextField jTextFieldivaVentasResumidosVentas;
	public JButton jButtonivaVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_anioVentasResumidosVentas;
	public JLabel jLabelnombre_anioVentasResumidosVentas;
	public JTextField jTextFieldnombre_anioVentasResumidosVentas;
	public JButton jButtonnombre_anioVentasResumidosVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_mesVentasResumidosVentas;
	public JLabel jLabelnombre_mesVentasResumidosVentas;
	public JTextField jTextFieldnombre_mesVentasResumidosVentas;
	public JButton jButtonnombre_mesVentasResumidosVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasResumidosVentas;
	public JLabel jLabelid_empresaVentasResumidosVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasResumidosVentas;
	public JButton jButtonid_empresaVentasResumidosVentas= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidosVentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasResumidosVentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasResumidosVentas;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasResumidosVentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasResumidosVentas=new JPanel();
				this.jPanelAccionesFormularioVentasResumidosVentas=new JPanel();
				this.jmenuBarDetalleVentasResumidosVentas=new JMenuBar();
				this.jTtoolBarDetalleVentasResumidosVentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasResumidosVentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosVentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidosVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasResumidosVentas() {
		return this.jButtonActualizarToolBarVentasResumidosVentas;
	}
	
	public JButton getjButtonEliminarToolBarVentasResumidosVentas() {
		return this.jButtonEliminarToolBarVentasResumidosVentas;
	}
	
	public JButton getjButtonCancelarToolBarVentasResumidosVentas() {
		return this.jButtonCancelarToolBarVentasResumidosVentas;
	}		
	
	public JButton getjButtonProcesarInformacionVentasResumidosVentas() {
		return this.jButtonProcesarInformacionVentasResumidosVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidosVentas)	{
		this.jButtonProcesarInformacionVentasResumidosVentas = jButtonProcesarInformacionVentasResumidosVentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidosVentas() {
		return this.jComboBoxTiposAccionesVentasResumidosVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidosVentas(
			JComboBox jComboBoxTiposRelacionesVentasResumidosVentas) {
		this.jComboBoxTiposRelacionesVentasResumidosVentas = jComboBoxTiposRelacionesVentasResumidosVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidosVentas(
			JComboBox jComboBoxTiposAccionesVentasResumidosVentas) {
		this.jComboBoxTiposAccionesVentasResumidosVentas = jComboBoxTiposAccionesVentasResumidosVentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasResumidosVentas() {
		return this.jComboBoxTiposAccionesFormularioVentasResumidosVentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasResumidosVentas(
			JComboBox jComboBoxTiposAccionesFormularioVentasResumidosVentas) {
		this.jComboBoxTiposAccionesFormularioVentasResumidosVentas = jComboBoxTiposAccionesFormularioVentasResumidosVentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventasresumidosventasSessionBean=new VentasResumidosVentasSessionBean();
		
		this.ventasresumidosventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidosventasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidosVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidosVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidos Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasResumidosVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasResumidosVentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasResumidosVentas=new JButtonMe();
				this.jButtonModificarToolBarVentasResumidosVentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas,
							"actualizar","actualizar","Actualizar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas,
							"eliminar","eliminar","Eliminar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas,
							"cancelar","cancelar","Cancelar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasResumidosVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasResumidosVentas,this.jTtoolBarDetalleVentasResumidosVentas,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasResumidosVentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasResumidosVentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasResumidosVentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasResumidosVentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasResumidosVentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidosVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidosVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidosVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasResumidosVentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasResumidosVentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasResumidosVentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasResumidosVentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasResumidosVentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasResumidosVentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasResumidosVentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasResumidosVentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasResumidosVentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasResumidosVentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasResumidosVentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasResumidosVentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasResumidosVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidosVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidosVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidosVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidosVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidosVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasResumidosVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasResumidosVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasResumidosVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidosVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidosVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidosVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidosVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidosVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidosVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasResumidosVentas.add(this.jMenuItemDetalleCerrarVentasResumidosVentas);
		
		this.jmenuDetalleAccionesVentasResumidosVentas.add(this.jMenuItemActualizarVentasResumidosVentas);
		this.jmenuDetalleAccionesVentasResumidosVentas.add(this.jMenuItemEliminarVentasResumidosVentas);
		this.jmenuDetalleAccionesVentasResumidosVentas.add(this.jMenuItemCancelarVentasResumidosVentas);		
		
		//this.jmenuDetalleDatosVentasResumidosVentas.add(this.jMenuItemDetalleAbrirOrderByVentasResumidosVentas);				
		this.jmenuDetalleDatosVentasResumidosVentas.add(this.jMenuItemDetalleMostarOcultarVentasResumidosVentas);				
				
		//this.jmenuDetalleAccionesVentasResumidosVentas.add(this.jMenuItemGuardarCambiosVentasResumidosVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasResumidosVentas.add(this.jmenuDetalleArchivoVentasResumidosVentas);		
		this.jmenuBarDetalleVentasResumidosVentas.add(this.jmenuDetalleAccionesVentasResumidosVentas);		
		this.jmenuBarDetalleVentasResumidosVentas.add(this.jmenuDetalleDatosVentasResumidosVentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasResumidosVentas);				
	}
	
	
	public void inicializarElementosCamposVentasResumidosVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasResumidosVentas = new JLabelMe();
		jLabelIdVentasResumidosVentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasResumidosVentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasResumidosVentas= new GridBagLayout();

		this.jPanelidVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);

		jLabelidVentasResumidosVentas = new JLabel();
		jLabelidVentasResumidosVentas.setText("Id");

		jLabelidVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasResumidosVentas = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasResumidosVentas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		//jFormattedTextFieldfecha_emision_desdeVentasResumidosVentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasResumidosVentas= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasResumidosVentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasResumidosVentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasResumidosVentas = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasResumidosVentas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		//jFormattedTextFieldfecha_emision_hastaVentasResumidosVentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasResumidosVentas= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasResumidosVentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasResumidosVentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabeldiaVentasResumidosVentas = new JLabelMe();
		this.jLabeldiaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_DIA+" : *");
		this.jLabeldiaVentasResumidosVentas.setToolTipText("Dia");
		this.jLabeldiaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_DIA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPaneldiaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFielddiaVentasResumidosVentas= new JTextFieldMe();

		jTextFielddiaVentasResumidosVentas.setEnabled(false);
		jTextFielddiaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondiaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtondiaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiaVentasResumidosVentasBusqueda.setText("U");
		this.jButtondiaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiaVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaVentasResumidosVentas = new JLabelMe();
		this.jLabeltotal_ivaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaVentasResumidosVentas.setToolTipText("Total Iva");
		this.jLabeltotal_ivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPaneltotal_ivaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldtotal_ivaVentasResumidosVentas= new JTextFieldMe();
		jTextFieldtotal_ivaVentasResumidosVentas.setEnabled(false);
		jTextFieldtotal_ivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaVentasResumidosVentas.setText("0.0");

		this.jButtontotal_ivaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaVentasResumidosVentasBusqueda.setText("U");
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaVentasResumidosVentas = new JLabelMe();
		this.jLabeltotal_sin_ivaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaVentasResumidosVentas.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPaneltotal_sin_ivaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldtotal_sin_ivaVentasResumidosVentas= new JTextFieldMe();
		jTextFieldtotal_sin_ivaVentasResumidosVentas.setEnabled(false);
		jTextFieldtotal_sin_ivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaVentasResumidosVentas.setText("0.0");

		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setText("U");
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_fleteVentasResumidosVentas = new JLabelMe();
		this.jLabeltotal_fleteVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE+" : *");
		this.jLabeltotal_fleteVentasResumidosVentas.setToolTipText("Total Flete");
		this.jLabeltotal_fleteVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_fleteVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_fleteVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_fleteVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_fleteVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_fleteVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_TOTALFLETE);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPaneltotal_fleteVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldtotal_fleteVentasResumidosVentas= new JTextFieldMe();
		jTextFieldtotal_fleteVentasResumidosVentas.setEnabled(false);
		jTextFieldtotal_fleteVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_fleteVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_fleteVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_fleteVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_fleteVentasResumidosVentas.setText("0.0");

		this.jButtontotal_fleteVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_fleteVentasResumidosVentasBusqueda.setText("U");
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_fleteVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_fleteVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_fleteVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_fleteVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_fleteVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabelivaVentasResumidosVentas = new JLabelMe();
		this.jLabelivaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaVentasResumidosVentas.setToolTipText("Iva");
		this.jLabelivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelivaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldivaVentasResumidosVentas= new JTextFieldMe();
		jTextFieldivaVentasResumidosVentas.setEnabled(false);
		jTextFieldivaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaVentasResumidosVentas.setText("0.0");

		this.jButtonivaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonivaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaVentasResumidosVentasBusqueda.setText("U");
		this.jButtonivaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_anioVentasResumidosVentas = new JLabelMe();
		this.jLabelnombre_anioVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO+" : *");
		this.jLabelnombre_anioVentasResumidosVentas.setToolTipText("Nombre Anio");
		this.jLabelnombre_anioVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_anioVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_anioVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_anioVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_anioVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_anioVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREANIO);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelnombre_anioVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldnombre_anioVentasResumidosVentas= new JTextFieldMe();

		jTextFieldnombre_anioVentasResumidosVentas.setEnabled(false);
		jTextFieldnombre_anioVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_anioVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_anioVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_anioVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_anioVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_anioVentasResumidosVentasBusqueda.setText("U");
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_anioVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_anioVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_anioVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_anioVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_anioVentasResumidosVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_mesVentasResumidosVentas = new JLabelMe();
		this.jLabelnombre_mesVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES+" : *");
		this.jLabelnombre_mesVentasResumidosVentas.setToolTipText("Nombre Mes");
		this.jLabelnombre_mesVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_mesVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_mesVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_mesVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_mesVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_mesVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_NOMBREMES);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelnombre_mesVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jTextFieldnombre_mesVentasResumidosVentas= new JTextFieldMe();

		jTextFieldnombre_mesVentasResumidosVentas.setEnabled(false);
		jTextFieldnombre_mesVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_mesVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_mesVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_mesVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_mesVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_mesVentasResumidosVentasBusqueda.setText("U");
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_mesVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_mesVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_mesVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_mesVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_mesVentasResumidosVentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasResumidosVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasResumidosVentas = new JLabelMe();
		this.jLabelid_empresaVentasResumidosVentas.setText(""+VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasResumidosVentas.setToolTipText("Empresa");
		this.jLabelid_empresaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasResumidosVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasResumidosVentas.setToolTipText(VentasResumidosVentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		this.jPanelid_empresaVentasResumidosVentas.setLayout(this.gridaBagLayoutVentasResumidosVentas);


		jComboBoxid_empresaVentasResumidosVentas= new JComboBoxMe();
		jComboBoxid_empresaVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasResumidosVentas.setEnabled(false);

		this.jButtonid_empresaVentasResumidosVentas= new JButtonMe();
		this.jButtonid_empresaVentasResumidosVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidosVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidosVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasResumidosVentas.setText("Buscar");
		this.jButtonid_empresaVentasResumidosVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasResumidosVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidosVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidosVentas"));

		this.jButtonid_empresaVentasResumidosVentasBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidosVentasBusqueda.setText("U");
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidosVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidosVentasBusqueda"));

		if(this.ventasresumidosventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasResumidosVentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasResumidosVentasUpdate= new JButtonMe();
		this.jButtonid_empresaVentasResumidosVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasResumidosVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasResumidosVentasUpdate.setText("U");
		this.jButtonid_empresaVentasResumidosVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasResumidosVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasResumidosVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasResumidosVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasResumidosVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasResumidosVentasUpdate"));



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
		//this.jInternalFrameDetalleVentasResumidosVentas = new VentasResumidosVentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Resumidos Ventas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidosVentas= new GridBagLayout();
		

		
		String sToolTipVentasResumidosVentas="";
		sToolTipVentasResumidosVentas=VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidosVentas+="(Facturacion.VentasResumidosVentas)";
		}
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidosVentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasResumidosVentas = new JButtonMe();
		this.jButtonModificarVentasResumidosVentas = new JButtonMe();
        this.jButtonActualizarVentasResumidosVentas = new JButtonMe();
        this.jButtonEliminarVentasResumidosVentas = new JButtonMe();
        this.jButtonCancelarVentasResumidosVentas = new JButtonMe();
        this.jButtonGuardarCambiosVentasResumidosVentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasResumidosVentas = new JButtonMe();
		this.jButtonCerrarVentasResumidosVentas = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidosVentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasResumidosVentas = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasResumidosVentas = new JScrollPane();
				
		
		
		this.jPanelCamposVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidos Ventas";
		
		if(!this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidos Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidosVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasResumidosVentas.setName("jPanelCamposVentasResumidosVentas"); 

		this.jPanelCamposOcultosVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasResumidosVentas.setName("jPanelCamposOcultosVentasResumidosVentas"); 

        this.jPanelAccionesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidosVentas.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidosVentas.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasResumidosVentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasResumidosVentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasResumidosVentas.setText("Nuevo");
		this.jButtonModificarVentasResumidosVentas.setText("Editar");
        this.jButtonActualizarVentasResumidosVentas.setText("Actualizar");
        this.jButtonEliminarVentasResumidosVentas.setText("Eliminar");
        this.jButtonCancelarVentasResumidosVentas.setText("Cancelar");
        this.jButtonGuardarCambiosVentasResumidosVentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.setText("Guardar");
		this.jButtonCerrarVentasResumidosVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidosVentas,"nuevo_button","Nuevo",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasResumidosVentas,"modificar_button","Editar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasResumidosVentas,"actualizar_button","Actualizar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasResumidosVentas,"eliminar_button","Eliminar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasResumidosVentas,"cancelar_button","Cancelar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasResumidosVentas,"guardarcambios_button","Guardar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidosVentas,"guardarcambiostabla_button","Guardar",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidosVentas,"cerrar_button","Salir",this.ventasresumidosventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasResumidosVentas.setToolTipText("Nuevo"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasResumidosVentas.setToolTipText("Editar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasResumidosVentas.setToolTipText("Actualizar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasResumidosVentas.setToolTipText("Eliminar)"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasResumidosVentas.setToolTipText("Cancelar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasResumidosVentas.setToolTipText("Guardar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.setToolTipText("Guardar"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidosVentas.setToolTipText("Salir"+" "+VentasResumidosVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidosVentas";
		inputMap = this.jButtonNuevoVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidosVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidosVentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasResumidosVentas";
		inputMap = this.jButtonActualizarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasResumidosVentas"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasResumidosVentas";
		inputMap = this.jButtonEliminarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasResumidosVentas"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasResumidosVentas";
		inputMap = this.jButtonCancelarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasResumidosVentas"));
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidosVentas";
		inputMap = this.jButtonCerrarVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidosVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidosVentas";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidosVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidosVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidosVentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasResumidosVentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasResumidosVentas.setToolTipText("Nuevo VentasResumidosVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasResumidosVentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasResumidosVentas.setToolTipText("Sin Cerrar Ventana VentasResumidosVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasResumidosVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasResumidosVentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasResumidosVentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidosVentas.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidosVentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasResumidosVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasResumidosVentas = new JLabelMe();
		
		this.jLabelAccionesVentasResumidosVentas.setText("Acciones");		
		this.jLabelAccionesVentasResumidosVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidosVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidosVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasResumidosVentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasResumidosVentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasResumidosVentas=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasResumidosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasResumidosVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidosVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasResumidosVentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasResumidosVentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasResumidosVentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasResumidosVentas = new GridBagLayout();
		
		this.jPanelCamposVentasResumidosVentas.setLayout(gridaBagLayoutCamposVentasResumidosVentas);
		this.jPanelCamposOcultosVentasResumidosVentas.setLayout(gridaBagLayoutCamposOcultosVentasResumidosVentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasResumidosVentas.add(jLabelIdVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasResumidosVentas.add(jLabelidVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasResumidosVentas.add(jLabelid_empresaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidosVentas.add(jButtonid_empresaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 3;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasResumidosVentas.add(jButtonid_empresaVentasResumidosVentasUpdate, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasResumidosVentas.add(jComboBoxid_empresaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasResumidosVentas.add(jLabelfecha_emision_desdeVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasResumidosVentas.add(jButtonfecha_emision_desdeVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasResumidosVentas.add(jDateChooserfecha_emision_desdeVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasResumidosVentas.add(jLabelfecha_emision_hastaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasResumidosVentas.add(jButtonfecha_emision_hastaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasResumidosVentas.add(jDateChooserfecha_emision_hastaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiaVentasResumidosVentas.add(jLabeldiaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiaVentasResumidosVentas.add(jButtondiaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiaVentasResumidosVentas.add(jTextFielddiaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaVentasResumidosVentas.add(jLabeltotal_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaVentasResumidosVentas.add(jButtontotal_ivaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaVentasResumidosVentas.add(jTextFieldtotal_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaVentasResumidosVentas.add(jLabeltotal_sin_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaVentasResumidosVentas.add(jButtontotal_sin_ivaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaVentasResumidosVentas.add(jTextFieldtotal_sin_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_fleteVentasResumidosVentas.add(jLabeltotal_fleteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_fleteVentasResumidosVentas.add(jButtontotal_fleteVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_fleteVentasResumidosVentas.add(jTextFieldtotal_fleteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaVentasResumidosVentas.add(jLabelivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaVentasResumidosVentas.add(jButtonivaVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaVentasResumidosVentas.add(jTextFieldivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_anioVentasResumidosVentas.add(jLabelnombre_anioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_anioVentasResumidosVentas.add(jButtonnombre_anioVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_anioVentasResumidosVentas.add(jTextFieldnombre_anioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_mesVentasResumidosVentas.add(jLabelnombre_mesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = 2;
		this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
		this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_mesVentasResumidosVentas.add(jButtonnombre_mesVentasResumidosVentasBusqueda, this.gridBagConstraintsVentasResumidosVentas);
	}

	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
	this.gridBagConstraintsVentasResumidosVentas.gridx = 1;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_mesVentasResumidosVentas.add(jTextFieldnombre_mesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelidVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelfecha_emision_desdeVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelfecha_emision_hastaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPaneldiaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPaneltotal_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPaneltotal_sin_ivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPaneltotal_fleteVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelivaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelnombre_anioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasResumidosVentas.add(this.jPanelnombre_mesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposVentasResumidosVentas % 1==0) {
		iXPanelCamposVentasResumidosVentas=0;
		iYPanelCamposVentasResumidosVentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasResumidosVentas.gridy = iYPanelCamposOcultosVentasResumidosVentas;
	this.gridBagConstraintsVentasResumidosVentas.gridx = iXPanelCamposOcultosVentasResumidosVentas++;
	this.gridBagConstraintsVentasResumidosVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasResumidosVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasResumidosVentas.add(this.jPanelid_empresaVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);



	if(iXPanelCamposOcultosVentasResumidosVentas % 1==0) {
		iXPanelCamposOcultosVentasResumidosVentas=0;
		iYPanelCamposOcultosVentasResumidosVentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidosVentas= new GridBagLayout();
		this.jPanelAccionesVentasResumidosVentas.setLayout(gridaBagLayoutAccionesVentasResumidosVentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasResumidosVentas= new GridBagLayout();
		this.jPanelAccionesFormularioVentasResumidosVentas.setLayout(gridaBagLayoutAccionesFormularioVentasResumidosVentas);
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasResumidosVentas.add(this.jComboBoxTiposAccionesFormularioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonModificarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);							

		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;
		this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonEliminarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonActualizarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);


		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonGuardarCambiosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);	
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = 0;		
		this.gridBagConstraintsVentasResumidosVentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasResumidosVentas.add(this.jButtonCancelarVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidosVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidosVentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidosventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;		
			//this.gridBagConstraintsVentasResumidosVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidosVentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidosVentas.gridx =0;
		this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidosVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasResumidosVentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasResumidosVentas = new VentasResumidosVentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Resumidos Ventas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Resumidos Ventas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Resumidos Ventas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasResumidosVentasModel ventasresumidosventasModel=new VentasResumidosVentasModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasResumidosVentasModel.VentasResumidosVentasFocusTraversalPolicy ventasresumidosventasFocusTraversalPolicy = ventasresumidosventasModel.new VentasResumidosVentasFocusTraversalPolicy(this);
			
			//ventasresumidosventasFocusTraversalPolicy.setventasresumidosventasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventasresumidosventasModel);
			
			
			this.jContentPaneDetalleVentasResumidosVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasResumidosVentas = new GridBagLayout();	
			this.jContentPaneDetalleVentasResumidosVentas.setLayout(gridaBagLayoutDetalleVentasResumidosVentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidosVentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
					
				
				this.jContentPaneDetalleVentasResumidosVentas.add(jTtoolBarDetalleVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);								
				
}
			
			this.jScrollPanelDatosEdicionVentasResumidosVentas=   new JScrollPane(jContentPaneDetalleVentasResumidosVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasResumidosVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidosVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	        
			this.jContentPaneDetalleVentasResumidosVentas.add(jPanelCamposVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);
			
			
			
			
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
						//&& ventasresumidosventasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventasresumidosventasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasResumidosVentas= new GridBagConstraints();
						this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
						this.jContentPaneDetalleVentasResumidosVentas.add(this.jTabbedPaneRelacionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasResumidosVentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasResumidosVentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
					this.gridBagConstraintsVentasResumidosVentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
					
				
					this.jContentPaneDetalleVentasResumidosVentas.add(jPanelCamposOcultosVentasResumidosVentas, gridBagConstraintsVentasResumidosVentas);
				
					this.jPanelCamposOcultosVentasResumidosVentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	        this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasResumidosVentas.add(this.jPanelAccionesFormularioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);							
			
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
	        this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasResumidosVentas.add(this.jPanelAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasResumidosVentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasResumidosVentas=   new JScrollPane(this.jPanelCamposVentasResumidosVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasResumidosVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
			this.gridBagConstraintsVentasResumidosVentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasResumidosVentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasResumidosVentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);			
			
			this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
			
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		
			
		this.gridBagConstraintsVentasResumidosVentas = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidosVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidosVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidosVentas, this.gridBagConstraintsVentasResumidosVentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasResumidosVentas;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasResumidosVentas;
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
