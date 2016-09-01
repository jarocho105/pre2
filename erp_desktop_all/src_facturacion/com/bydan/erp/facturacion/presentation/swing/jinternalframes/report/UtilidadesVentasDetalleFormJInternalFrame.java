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
import com.bydan.erp.facturacion.util.report.UtilidadesVentasConstantesFunciones;

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
public class UtilidadesVentasDetalleFormJInternalFrame extends UtilidadesVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUtilidadesVentas;
	
	protected JMenuBar jmenuBarDetalleUtilidadesVentas;
	
	protected JMenu jmenuDetalleUtilidadesVentas;
	protected JMenu jmenuDetalleArchivoUtilidadesVentas;
	protected JMenu jmenuDetalleAccionesUtilidadesVentas;
	protected JMenu jmenuDetalleDatosUtilidadesVentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadesVentas;	
	protected GridBagConstraints gridBagConstraintsUtilidadesVentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UtilidadesVentasBeanSwingJInternalFrameAdditional jInternalFrameDetalleUtilidadesVentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public UtilidadesVentasSessionBean utilidadesventasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public UtilidadesVentasLogic utilidadesventasLogic;
	
	public JScrollPane jScrollPanelDatosUtilidadesVentas;
	public JScrollPane jScrollPanelDatosEdicionUtilidadesVentas;
	public JScrollPane jScrollPanelDatosGeneralUtilidadesVentas;
	
	protected JPanel jPanelCamposUtilidadesVentas;    
	protected JPanel jPanelCamposOcultosUtilidadesVentas;    	
	protected JPanel jPanelAccionesUtilidadesVentas;
	protected JPanel jPanelAccionesFormularioUtilidadesVentas;
    
	
	
	protected Integer iXPanelCamposUtilidadesVentas=0;
	protected Integer iYPanelCamposUtilidadesVentas=0;
	
	protected Integer iXPanelCamposOcultosUtilidadesVentas=0;
	protected Integer iYPanelCamposOcultosUtilidadesVentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUtilidadesVentas;
	public JButton jButtonModificarUtilidadesVentas;
	public JButton jButtonActualizarUtilidadesVentas;
    public JButton jButtonEliminarUtilidadesVentas;
	public JButton jButtonCancelarUtilidadesVentas;
    public JButton jButtonGuardarCambiosUtilidadesVentas;
	public JButton jButtonGuardarCambiosTablaUtilidadesVentas;
	protected JButton jButtonCerrarUtilidadesVentas;
	
	
	protected JButton jButtonProcesarInformacionUtilidadesVentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUtilidadesVentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUtilidadesVentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUtilidadesVentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadesVentas;
	protected JButton jButtonModificarToolBarUtilidadesVentas;
	protected JButton jButtonActualizarToolBarUtilidadesVentas;
    protected JButton jButtonEliminarToolBarUtilidadesVentas;
	protected JButton jButtonCancelarToolBarUtilidadesVentas;
    protected JButton jButtonGuardarCambiosToolBarUtilidadesVentas;
	protected JButton jButtonGuardarCambiosTablaToolBarUtilidadesVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadesVentas;
	protected JButton jButtonCerrarToolBarUtilidadesVentas;
	
	protected JButton jButtonProcesarInformacionToolBarUtilidadesVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadesVentas;
	protected JMenuItem jMenuItemModificarUtilidadesVentas;
	protected JMenuItem jMenuItemActualizarUtilidadesVentas;
    protected JMenuItem jMenuItemEliminarUtilidadesVentas;
	protected JMenuItem jMenuItemCancelarUtilidadesVentas;
    protected JMenuItem jMenuItemGuardarCambiosUtilidadesVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadesVentas;
	protected JMenuItem jMenuItemCerrarUtilidadesVentas;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadesVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadesVentas;
	
	protected JMenuItem jMenuItemProcesarInformacionUtilidadesVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadesVentas;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadesVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadesVentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadesVentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUtilidadesVentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUtilidadesVentas;
	public JLabel jLabelIdUtilidadesVentas;
	public JLabel jLabelidUtilidadesVentas;
	public JButton jButtonidUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeUtilidadesVentas;
	public JLabel jLabelfecha_emision_desdeUtilidadesVentas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeUtilidadesVentas;

	public JDateChooser jDateChooserfecha_emision_desdeUtilidadesVentas;
	public JButton jButtonfecha_emision_desdeUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaUtilidadesVentas;
	public JLabel jLabelfecha_emision_hastaUtilidadesVentas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaUtilidadesVentas;

	public JDateChooser jDateChooserfecha_emision_hastaUtilidadesVentas;
	public JButton jButtonfecha_emision_hastaUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteUtilidadesVentas;
	public JLabel jLabelnombre_completo_clienteUtilidadesVentas;
	public JTextArea jTextAreanombre_completo_clienteUtilidadesVentas;
	public JScrollPane jscrollPanenombre_completo_clienteUtilidadesVentas;
	public JButton jButtonnombre_completo_clienteUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_facturaUtilidadesVentas;
	public JLabel jLabelnombre_tipo_facturaUtilidadesVentas;
	public JTextArea jTextAreanombre_tipo_facturaUtilidadesVentas;
	public JScrollPane jscrollPanenombre_tipo_facturaUtilidadesVentas;
	public JButton jButtonnombre_tipo_facturaUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionUtilidadesVentas;
	public JLabel jLabelfecha_emisionUtilidadesVentas;
	//public JFormattedTextField jDateChooserfecha_emisionUtilidadesVentas;

	public JDateChooser jDateChooserfecha_emisionUtilidadesVentas;
	public JButton jButtonfecha_emisionUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoUtilidadesVentas;
	public JLabel jLabelnumero_documentoUtilidadesVentas;
	public JTextField jTextFieldnumero_documentoUtilidadesVentas;
	public JButton jButtonnumero_documentoUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPaneltipoUtilidadesVentas;
	public JLabel jLabeltipoUtilidadesVentas;
	public JTextField jTextFieldtipoUtilidadesVentas;
	public JButton jButtontipoUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelventaUtilidadesVentas;
	public JLabel jLabelventaUtilidadesVentas;
	public JTextField jTextFieldventaUtilidadesVentas;
	public JButton jButtonventaUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelcostoUtilidadesVentas;
	public JLabel jLabelcostoUtilidadesVentas;
	public JTextField jTextFieldcostoUtilidadesVentas;
	public JButton jButtoncostoUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelutilidadUtilidadesVentas;
	public JLabel jLabelutilidadUtilidadesVentas;
	public JTextField jTextFieldutilidadUtilidadesVentas;
	public JButton jButtonutilidadUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeUtilidadesVentas;
	public JLabel jLabelporcentajeUtilidadesVentas;
	public JTextField jTextFieldporcentajeUtilidadesVentas;
	public JButton jButtonporcentajeUtilidadesVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUtilidadesVentas;
	public JLabel jLabelid_empresaUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUtilidadesVentas;
	public JButton jButtonid_empresaUtilidadesVentas= new JButtonMe();
	public JButton jButtonid_empresaUtilidadesVentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaUtilidadesVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalUtilidadesVentas;
	public JLabel jLabelid_sucursalUtilidadesVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalUtilidadesVentas;
	public JButton jButtonid_sucursalUtilidadesVentas= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadesVentasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadesVentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUtilidadesVentas;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UtilidadesVentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUtilidadesVentas=new JPanel();
				this.jPanelAccionesFormularioUtilidadesVentas=new JPanel();
				this.jmenuBarDetalleUtilidadesVentas=new JMenuBar();
				this.jTtoolBarDetalleUtilidadesVentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UtilidadesVentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadesVentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadesVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUtilidadesVentas() {
		return this.jButtonActualizarToolBarUtilidadesVentas;
	}
	
	public JButton getjButtonEliminarToolBarUtilidadesVentas() {
		return this.jButtonEliminarToolBarUtilidadesVentas;
	}
	
	public JButton getjButtonCancelarToolBarUtilidadesVentas() {
		return this.jButtonCancelarToolBarUtilidadesVentas;
	}		
	
	public JButton getjButtonProcesarInformacionUtilidadesVentas() {
		return this.jButtonProcesarInformacionUtilidadesVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadesVentas)	{
		this.jButtonProcesarInformacionUtilidadesVentas = jButtonProcesarInformacionUtilidadesVentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadesVentas() {
		return this.jComboBoxTiposAccionesUtilidadesVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadesVentas(
			JComboBox jComboBoxTiposRelacionesUtilidadesVentas) {
		this.jComboBoxTiposRelacionesUtilidadesVentas = jComboBoxTiposRelacionesUtilidadesVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadesVentas(
			JComboBox jComboBoxTiposAccionesUtilidadesVentas) {
		this.jComboBoxTiposAccionesUtilidadesVentas = jComboBoxTiposAccionesUtilidadesVentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUtilidadesVentas() {
		return this.jComboBoxTiposAccionesFormularioUtilidadesVentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUtilidadesVentas(
			JComboBox jComboBoxTiposAccionesFormularioUtilidadesVentas) {
		this.jComboBoxTiposAccionesFormularioUtilidadesVentas = jComboBoxTiposAccionesFormularioUtilidadesVentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
		
		this.utilidadesventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadesventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadesventasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadesVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadesVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidades Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
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
	
		UtilidadesVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUtilidadesVentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUtilidadesVentas=new JButtonMe();
				this.jButtonModificarToolBarUtilidadesVentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas,
							"actualizar","actualizar","Actualizar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas,
							"eliminar","eliminar","Eliminar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas,
							"cancelar","cancelar","Cancelar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUtilidadesVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas,
							"guardarcambios","guardarcambios","Guardar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUtilidadesVentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUtilidadesVentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUtilidadesVentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUtilidadesVentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUtilidadesVentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadesVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadesVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadesVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUtilidadesVentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUtilidadesVentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUtilidadesVentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUtilidadesVentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUtilidadesVentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUtilidadesVentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUtilidadesVentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUtilidadesVentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUtilidadesVentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUtilidadesVentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUtilidadesVentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUtilidadesVentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUtilidadesVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadesVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadesVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadesVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadesVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadesVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUtilidadesVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUtilidadesVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUtilidadesVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadesVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadesVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadesVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadesVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadesVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadesVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUtilidadesVentas.add(this.jMenuItemDetalleCerrarUtilidadesVentas);
		
		this.jmenuDetalleAccionesUtilidadesVentas.add(this.jMenuItemActualizarUtilidadesVentas);
		this.jmenuDetalleAccionesUtilidadesVentas.add(this.jMenuItemEliminarUtilidadesVentas);
		this.jmenuDetalleAccionesUtilidadesVentas.add(this.jMenuItemCancelarUtilidadesVentas);		
		
		//this.jmenuDetalleDatosUtilidadesVentas.add(this.jMenuItemDetalleAbrirOrderByUtilidadesVentas);				
		this.jmenuDetalleDatosUtilidadesVentas.add(this.jMenuItemDetalleMostarOcultarUtilidadesVentas);				
				
		//this.jmenuDetalleAccionesUtilidadesVentas.add(this.jMenuItemGuardarCambiosUtilidadesVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUtilidadesVentas.add(this.jmenuDetalleArchivoUtilidadesVentas);		
		this.jmenuBarDetalleUtilidadesVentas.add(this.jmenuDetalleAccionesUtilidadesVentas);		
		this.jmenuBarDetalleUtilidadesVentas.add(this.jmenuDetalleDatosUtilidadesVentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUtilidadesVentas);				
	}
	
	
	public void inicializarElementosCamposUtilidadesVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUtilidadesVentas = new JLabelMe();
		jLabelIdUtilidadesVentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUtilidadesVentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUtilidadesVentas= new GridBagLayout();

		this.jPanelidUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);

		jLabelidUtilidadesVentas = new JLabel();
		jLabelidUtilidadesVentas.setText("Id");

		jLabelidUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeUtilidadesVentas = new JLabelMe();
		this.jLabelfecha_emision_desdeUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeUtilidadesVentas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelfecha_emision_desdeUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		//jFormattedTextFieldfecha_emision_desdeUtilidadesVentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeUtilidadesVentas= new JDateChooser();
		jDateChooserfecha_emision_desdeUtilidadesVentas.setEnabled(false);
		jDateChooserfecha_emision_desdeUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeUtilidadesVentas.setDate(new Date());
		jDateChooserfecha_emision_desdeUtilidadesVentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeUtilidadesVentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaUtilidadesVentas = new JLabelMe();
		this.jLabelfecha_emision_hastaUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaUtilidadesVentas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelfecha_emision_hastaUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		//jFormattedTextFieldfecha_emision_hastaUtilidadesVentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaUtilidadesVentas= new JDateChooser();
		jDateChooserfecha_emision_hastaUtilidadesVentas.setEnabled(false);
		jDateChooserfecha_emision_hastaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaUtilidadesVentas.setDate(new Date());
		jDateChooserfecha_emision_hastaUtilidadesVentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaUtilidadesVentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteUtilidadesVentas = new JLabelMe();
		this.jLabelnombre_completo_clienteUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteUtilidadesVentas.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelnombre_completo_clienteUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextAreanombre_completo_clienteUtilidadesVentas= new JTextAreaMe();
		jTextAreanombre_completo_clienteUtilidadesVentas.setEnabled(false);
		jTextAreanombre_completo_clienteUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteUtilidadesVentas.setLineWrap(true);
		jTextAreanombre_completo_clienteUtilidadesVentas.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteUtilidadesVentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteUtilidadesVentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteUtilidadesVentas = new JScrollPane(jTextAreanombre_completo_clienteUtilidadesVentas);
		jscrollPanenombre_completo_clienteUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setText("U");
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_facturaUtilidadesVentas = new JLabelMe();
		this.jLabelnombre_tipo_facturaUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA+" : *");
		this.jLabelnombre_tipo_facturaUtilidadesVentas.setToolTipText("Nombre Tipo Factura");
		this.jLabelnombre_tipo_facturaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tipo_facturaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_facturaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_facturaUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_facturaUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelnombre_tipo_facturaUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextAreanombre_tipo_facturaUtilidadesVentas= new JTextAreaMe();
		jTextAreanombre_tipo_facturaUtilidadesVentas.setEnabled(false);
		jTextAreanombre_tipo_facturaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_facturaUtilidadesVentas.setLineWrap(true);
		jTextAreanombre_tipo_facturaUtilidadesVentas.setWrapStyleWord(true);
		jTextAreanombre_tipo_facturaUtilidadesVentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_facturaUtilidadesVentas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_facturaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_facturaUtilidadesVentas = new JScrollPane(jTextAreanombre_tipo_facturaUtilidadesVentas);
		jscrollPanenombre_tipo_facturaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_facturaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setText("U");
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_facturaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_facturaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_facturaUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionUtilidadesVentas = new JLabelMe();
		this.jLabelfecha_emisionUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionUtilidadesVentas.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelfecha_emisionUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		//jFormattedTextFieldfecha_emisionUtilidadesVentas= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionUtilidadesVentas= new JDateChooser();
		jDateChooserfecha_emisionUtilidadesVentas.setEnabled(false);
		jDateChooserfecha_emisionUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionUtilidadesVentas.setDate(new Date());
		jDateChooserfecha_emisionUtilidadesVentas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionUtilidadesVentas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionUtilidadesVentasBusqueda.setText("U");
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoUtilidadesVentas = new JLabelMe();
		this.jLabelnumero_documentoUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoUtilidadesVentas.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelnumero_documentoUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldnumero_documentoUtilidadesVentas= new JTextFieldMe();

		jTextFieldnumero_documentoUtilidadesVentas.setEnabled(false);
		jTextFieldnumero_documentoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoUtilidadesVentasBusqueda.setText("U");
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabeltipoUtilidadesVentas = new JLabelMe();
		this.jLabeltipoUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoUtilidadesVentas.setToolTipText("Tipo");
		this.jLabeltipoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPaneltipoUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldtipoUtilidadesVentas= new JTextFieldMe();

		jTextFieldtipoUtilidadesVentas.setEnabled(false);
		jTextFieldtipoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtontipoUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoUtilidadesVentasBusqueda.setText("U");
		this.jButtontipoUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelventaUtilidadesVentas = new JLabelMe();
		this.jLabelventaUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_VENTA+" : *");
		this.jLabelventaUtilidadesVentas.setToolTipText("Venta");
		this.jLabelventaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelventaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelventaUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelventaUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_VENTA);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelventaUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldventaUtilidadesVentas= new JTextFieldMe();
		jTextFieldventaUtilidadesVentas.setEnabled(false);
		jTextFieldventaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldventaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldventaUtilidadesVentas.setText("0.0");

		this.jButtonventaUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonventaUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventaUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventaUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonventaUtilidadesVentasBusqueda.setText("U");
		this.jButtonventaUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonventaUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonventaUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldventaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldventaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ventaUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonventaUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelcostoUtilidadesVentas = new JLabelMe();
		this.jLabelcostoUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoUtilidadesVentas.setToolTipText("Costo");
		this.jLabelcostoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelcostoUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldcostoUtilidadesVentas= new JTextFieldMe();
		jTextFieldcostoUtilidadesVentas.setEnabled(false);
		jTextFieldcostoUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoUtilidadesVentas.setText("0.0");

		this.jButtoncostoUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtoncostoUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoUtilidadesVentasBusqueda.setText("U");
		this.jButtoncostoUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelutilidadUtilidadesVentas = new JLabelMe();
		this.jLabelutilidadUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD+" : *");
		this.jLabelutilidadUtilidadesVentas.setToolTipText("Utilad");
		this.jLabelutilidadUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelutilidadUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelutilidadUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelutilidadUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelutilidadUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelutilidadUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldutilidadUtilidadesVentas= new JTextFieldMe();
		jTextFieldutilidadUtilidadesVentas.setEnabled(false);
		jTextFieldutilidadUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldutilidadUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldutilidadUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldutilidadUtilidadesVentas.setText("0.0");

		this.jButtonutilidadUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonutilidadUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonutilidadUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonutilidadUtilidadesVentasBusqueda.setText("U");
		this.jButtonutilidadUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonutilidadUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonutilidadUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldutilidadUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldutilidadUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"utilidadUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonutilidadUtilidadesVentasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeUtilidadesVentas = new JLabelMe();
		this.jLabelporcentajeUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeUtilidadesVentas.setToolTipText("Porcentaje");
		this.jLabelporcentajeUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelporcentajeUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jTextFieldporcentajeUtilidadesVentas= new JTextFieldMe();
		jTextFieldporcentajeUtilidadesVentas.setEnabled(false);
		jTextFieldporcentajeUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeUtilidadesVentas.setText("0.0");

		this.jButtonporcentajeUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonporcentajeUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeUtilidadesVentasBusqueda.setText("U");
		this.jButtonporcentajeUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeUtilidadesVentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUtilidadesVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUtilidadesVentas = new JLabelMe();
		this.jLabelid_empresaUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUtilidadesVentas.setToolTipText("Empresa");
		this.jLabelid_empresaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelid_empresaUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jComboBoxid_empresaUtilidadesVentas= new JComboBoxMe();
		jComboBoxid_empresaUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUtilidadesVentas.setEnabled(false);

		this.jButtonid_empresaUtilidadesVentas= new JButtonMe();
		this.jButtonid_empresaUtilidadesVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadesVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadesVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadesVentas.setText("Buscar");
		this.jButtonid_empresaUtilidadesVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUtilidadesVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadesVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadesVentas"));

		this.jButtonid_empresaUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonid_empresaUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadesVentasBusqueda.setText("U");
		this.jButtonid_empresaUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUtilidadesVentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaUtilidadesVentasUpdate= new JButtonMe();
		this.jButtonid_empresaUtilidadesVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadesVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadesVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadesVentasUpdate.setText("U");
		this.jButtonid_empresaUtilidadesVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUtilidadesVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadesVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadesVentasUpdate"));



					
		this.jLabelid_sucursalUtilidadesVentas = new JLabelMe();
		this.jLabelid_sucursalUtilidadesVentas.setText(""+UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalUtilidadesVentas.setToolTipText("Sucursal");
		this.jLabelid_sucursalUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalUtilidadesVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalUtilidadesVentas.setToolTipText(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		this.jPanelid_sucursalUtilidadesVentas.setLayout(this.gridaBagLayoutUtilidadesVentas);


		jComboBoxid_sucursalUtilidadesVentas= new JComboBoxMe();
		jComboBoxid_sucursalUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalUtilidadesVentas.setEnabled(false);

		this.jButtonid_sucursalUtilidadesVentas= new JButtonMe();
		this.jButtonid_sucursalUtilidadesVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadesVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadesVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadesVentas.setText("Buscar");
		this.jButtonid_sucursalUtilidadesVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalUtilidadesVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadesVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadesVentas"));

		this.jButtonid_sucursalUtilidadesVentasBusqueda= new JButtonMe();
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadesVentasBusqueda.setText("U");
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadesVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadesVentasBusqueda"));

		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalUtilidadesVentasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalUtilidadesVentasUpdate= new JButtonMe();
		this.jButtonid_sucursalUtilidadesVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadesVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadesVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadesVentasUpdate.setText("U");
		this.jButtonid_sucursalUtilidadesVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalUtilidadesVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadesVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadesVentasUpdate"));



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
		//this.jInternalFrameDetalleUtilidadesVentas = new UtilidadesVentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Utilidades Ventas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadesVentas= new GridBagLayout();
		

		
		String sToolTipUtilidadesVentas="";
		sToolTipUtilidadesVentas=UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadesVentas+="(Facturacion.UtilidadesVentas)";
		}
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadesVentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUtilidadesVentas = new JButtonMe();
		this.jButtonModificarUtilidadesVentas = new JButtonMe();
        this.jButtonActualizarUtilidadesVentas = new JButtonMe();
        this.jButtonEliminarUtilidadesVentas = new JButtonMe();
        this.jButtonCancelarUtilidadesVentas = new JButtonMe();
        this.jButtonGuardarCambiosUtilidadesVentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaUtilidadesVentas = new JButtonMe();
		this.jButtonCerrarUtilidadesVentas = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadesVentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionUtilidadesVentas = new JScrollPane();
		this.jScrollPanelDatosGeneralUtilidadesVentas = new JScrollPane();
				
		
		
		this.jPanelCamposUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidades Ventas";
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidades Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadesVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUtilidadesVentas.setName("jPanelCamposUtilidadesVentas"); 

		this.jPanelCamposOcultosUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUtilidadesVentas.setName("jPanelCamposOcultosUtilidadesVentas"); 

        this.jPanelAccionesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadesVentas.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadesVentas.setName("Acciones"); 

		this.jPanelAccionesFormularioUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUtilidadesVentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUtilidadesVentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUtilidadesVentas.setText("Nuevo");
		this.jButtonModificarUtilidadesVentas.setText("Editar");
        this.jButtonActualizarUtilidadesVentas.setText("Actualizar");
        this.jButtonEliminarUtilidadesVentas.setText("Eliminar");
        this.jButtonCancelarUtilidadesVentas.setText("Cancelar");
        this.jButtonGuardarCambiosUtilidadesVentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaUtilidadesVentas.setText("Guardar");
		this.jButtonCerrarUtilidadesVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadesVentas,"nuevo_button","Nuevo",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUtilidadesVentas,"modificar_button","Editar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUtilidadesVentas,"actualizar_button","Actualizar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUtilidadesVentas,"eliminar_button","Eliminar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUtilidadesVentas,"cancelar_button","Cancelar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUtilidadesVentas,"guardarcambios_button","Guardar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadesVentas,"guardarcambiostabla_button","Guardar",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadesVentas,"cerrar_button","Salir",this.utilidadesventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUtilidadesVentas.setToolTipText("Nuevo"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUtilidadesVentas.setToolTipText("Editar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUtilidadesVentas.setToolTipText("Actualizar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUtilidadesVentas.setToolTipText("Eliminar)"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUtilidadesVentas.setToolTipText("Cancelar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUtilidadesVentas.setToolTipText("Guardar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUtilidadesVentas.setToolTipText("Guardar"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadesVentas.setToolTipText("Salir"+" "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadesVentas";
		inputMap = this.jButtonNuevoUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadesVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadesVentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUtilidadesVentas";
		inputMap = this.jButtonActualizarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUtilidadesVentas"));
		
		//ELIMINAR
		sMapKey = "EliminarUtilidadesVentas";
		inputMap = this.jButtonEliminarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUtilidadesVentas"));
		
		//CANCELAR	
		sMapKey = "CancelarUtilidadesVentas";
		inputMap = this.jButtonCancelarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUtilidadesVentas"));
		
		//CERRAR		
		sMapKey = "CerrarUtilidadesVentas";
		inputMap = this.jButtonCerrarUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadesVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadesVentas";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadesVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadesVentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUtilidadesVentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUtilidadesVentas.setToolTipText("Nuevo UtilidadesVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUtilidadesVentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUtilidadesVentas.setToolTipText("Sin Cerrar Ventana UtilidadesVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUtilidadesVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUtilidadesVentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUtilidadesVentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadesVentas.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadesVentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUtilidadesVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUtilidadesVentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUtilidadesVentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUtilidadesVentas = new JLabelMe();
		
		this.jLabelAccionesUtilidadesVentas.setText("Acciones");		
		this.jLabelAccionesUtilidadesVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadesVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadesVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUtilidadesVentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUtilidadesVentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUtilidadesVentas=new JTabbedPane();
		this.jTabbedPaneRelacionesUtilidadesVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUtilidadesVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUtilidadesVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadesVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadesVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUtilidadesVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadesVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadesVentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUtilidadesVentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUtilidadesVentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUtilidadesVentas = new GridBagLayout();
		
		this.jPanelCamposUtilidadesVentas.setLayout(gridaBagLayoutCamposUtilidadesVentas);
		this.jPanelCamposOcultosUtilidadesVentas.setLayout(gridaBagLayoutCamposOcultosUtilidadesVentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUtilidadesVentas.add(jLabelIdUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUtilidadesVentas.add(jLabelidUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUtilidadesVentas.add(jLabelid_empresaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadesVentas.add(jButtonid_empresaUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 3;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadesVentas.add(jButtonid_empresaUtilidadesVentasUpdate, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUtilidadesVentas.add(jComboBoxid_empresaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalUtilidadesVentas.add(jLabelid_sucursalUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadesVentas.add(jButtonid_sucursalUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 3;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadesVentas.add(jButtonid_sucursalUtilidadesVentasUpdate, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalUtilidadesVentas.add(jComboBoxid_sucursalUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeUtilidadesVentas.add(jLabelfecha_emision_desdeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeUtilidadesVentas.add(jButtonfecha_emision_desdeUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeUtilidadesVentas.add(jDateChooserfecha_emision_desdeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaUtilidadesVentas.add(jLabelfecha_emision_hastaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaUtilidadesVentas.add(jButtonfecha_emision_hastaUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaUtilidadesVentas.add(jDateChooserfecha_emision_hastaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteUtilidadesVentas.add(jLabelnombre_completo_clienteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteUtilidadesVentas.add(jButtonnombre_completo_clienteUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteUtilidadesVentas.add(jscrollPanenombre_completo_clienteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_facturaUtilidadesVentas.add(jLabelnombre_tipo_facturaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_facturaUtilidadesVentas.add(jButtonnombre_tipo_facturaUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_facturaUtilidadesVentas.add(jscrollPanenombre_tipo_facturaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionUtilidadesVentas.add(jLabelfecha_emisionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionUtilidadesVentas.add(jButtonfecha_emisionUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionUtilidadesVentas.add(jDateChooserfecha_emisionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoUtilidadesVentas.add(jLabelnumero_documentoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoUtilidadesVentas.add(jButtonnumero_documentoUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoUtilidadesVentas.add(jTextFieldnumero_documentoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoUtilidadesVentas.add(jLabeltipoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoUtilidadesVentas.add(jButtontipoUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoUtilidadesVentas.add(jTextFieldtipoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelventaUtilidadesVentas.add(jLabelventaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelventaUtilidadesVentas.add(jButtonventaUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelventaUtilidadesVentas.add(jTextFieldventaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoUtilidadesVentas.add(jLabelcostoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoUtilidadesVentas.add(jButtoncostoUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoUtilidadesVentas.add(jTextFieldcostoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelutilidadUtilidadesVentas.add(jLabelutilidadUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelutilidadUtilidadesVentas.add(jButtonutilidadUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelutilidadUtilidadesVentas.add(jTextFieldutilidadUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeUtilidadesVentas.add(jLabelporcentajeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = 2;
		this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
		this.gridBagConstraintsUtilidadesVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeUtilidadesVentas.add(jButtonporcentajeUtilidadesVentasBusqueda, this.gridBagConstraintsUtilidadesVentas);
	}

	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadesVentas.gridy = 0;
	this.gridBagConstraintsUtilidadesVentas.gridx = 1;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeUtilidadesVentas.add(jTextFieldporcentajeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelidUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelfecha_emision_desdeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelfecha_emision_hastaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelnombre_completo_clienteUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelnombre_tipo_facturaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelfecha_emisionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelnumero_documentoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPaneltipoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelventaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelcostoUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelutilidadUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadesVentas.add(this.jPanelporcentajeUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposUtilidadesVentas % 2==0) {
		iXPanelCamposUtilidadesVentas=0;
		iYPanelCamposUtilidadesVentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposOcultosUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposOcultosUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadesVentas.add(this.jPanelid_empresaUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposOcultosUtilidadesVentas % 2==0) {
		iXPanelCamposOcultosUtilidadesVentas=0;
		iYPanelCamposOcultosUtilidadesVentas++;
	}
	this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadesVentas.gridy = iYPanelCamposOcultosUtilidadesVentas;
	this.gridBagConstraintsUtilidadesVentas.gridx = iXPanelCamposOcultosUtilidadesVentas++;
	this.gridBagConstraintsUtilidadesVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadesVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadesVentas.add(this.jPanelid_sucursalUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);



	if(iXPanelCamposOcultosUtilidadesVentas % 2==0) {
		iXPanelCamposOcultosUtilidadesVentas=0;
		iYPanelCamposOcultosUtilidadesVentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesUtilidadesVentas= new GridBagLayout();
		this.jPanelAccionesUtilidadesVentas.setLayout(gridaBagLayoutAccionesUtilidadesVentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUtilidadesVentas= new GridBagLayout();
		this.jPanelAccionesFormularioUtilidadesVentas.setLayout(gridaBagLayoutAccionesFormularioUtilidadesVentas);
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadesVentas.add(this.jComboBoxTiposAccionesFormularioUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonModificarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);							

		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;
		this.gridBagConstraintsUtilidadesVentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonEliminarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonActualizarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);


		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;		
		this.gridBagConstraintsUtilidadesVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonGuardarCambiosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);	
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = 0;		
		this.gridBagConstraintsUtilidadesVentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesUtilidadesVentas.add(this.jButtonCancelarUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadesVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadesVentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;		
			//this.gridBagConstraintsUtilidadesVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadesVentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadesVentas.gridx =0;
		this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadesVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUtilidadesVentas = new UtilidadesVentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Utilidades Ventas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Utilidades Ventas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidades Ventas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UtilidadesVentasModel utilidadesventasModel=new UtilidadesVentasModel(this);
			
			//SI USARA CLASE INTERNA
			//UtilidadesVentasModel.UtilidadesVentasFocusTraversalPolicy utilidadesventasFocusTraversalPolicy = utilidadesventasModel.new UtilidadesVentasFocusTraversalPolicy(this);
			
			//utilidadesventasFocusTraversalPolicy.setutilidadesventasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(utilidadesventasModel);
			
			
			this.jContentPaneDetalleUtilidadesVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUtilidadesVentas = new GridBagLayout();	
			this.jContentPaneDetalleUtilidadesVentas.setLayout(gridaBagLayoutDetalleUtilidadesVentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadesVentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
				this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUtilidadesVentas.gridx = 0;
					
				
				this.jContentPaneDetalleUtilidadesVentas.add(jTtoolBarDetalleUtilidadesVentas, gridBagConstraintsUtilidadesVentas);								
				
}
			
			this.jScrollPanelDatosEdicionUtilidadesVentas=   new JScrollPane(jContentPaneDetalleUtilidadesVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadesVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadesVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadesVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUtilidadesVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadesVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadesVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadesVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	        
			this.jContentPaneDetalleUtilidadesVentas.add(jPanelCamposUtilidadesVentas, gridBagConstraintsUtilidadesVentas);
			
			
			
			
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
						//&& utilidadesventasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUtilidadesVentas= new GridBagConstraints();
						this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUtilidadesVentas.gridx = 0;
						this.jContentPaneDetalleUtilidadesVentas.add(this.jTabbedPaneRelacionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUtilidadesVentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUtilidadesVentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
					this.gridBagConstraintsUtilidadesVentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUtilidadesVentas.gridx = 0;
					
				
					this.jContentPaneDetalleUtilidadesVentas.add(jPanelCamposOcultosUtilidadesVentas, gridBagConstraintsUtilidadesVentas);
				
					this.jPanelCamposOcultosUtilidadesVentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	        this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUtilidadesVentas.add(this.jPanelAccionesFormularioUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);							
			
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
	        this.gridBagConstraintsUtilidadesVentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUtilidadesVentas.gridx = 0;
	        
			
			this.jContentPaneDetalleUtilidadesVentas.add(this.jPanelAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUtilidadesVentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUtilidadesVentas=   new JScrollPane(this.jPanelCamposUtilidadesVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadesVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadesVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadesVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;
			this.gridBagConstraintsUtilidadesVentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUtilidadesVentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUtilidadesVentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);			
			
			this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
			this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadesVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
			
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		
			
		this.gridBagConstraintsUtilidadesVentas = new GridBagConstraints();
		this.gridBagConstraintsUtilidadesVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadesVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadesVentas, this.gridBagConstraintsUtilidadesVentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUtilidadesVentas;//jContentPane;
		
		return jScrollPanelDatosEdicionUtilidadesVentas;
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
