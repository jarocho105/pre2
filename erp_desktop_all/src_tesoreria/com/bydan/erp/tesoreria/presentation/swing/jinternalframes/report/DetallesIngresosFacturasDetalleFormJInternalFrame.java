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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.DetallesIngresosFacturasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class DetallesIngresosFacturasDetalleFormJInternalFrame extends DetallesIngresosFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallesIngresosFacturas;
	
	protected JMenuBar jmenuBarDetalleDetallesIngresosFacturas;
	
	protected JMenu jmenuDetalleDetallesIngresosFacturas;
	protected JMenu jmenuDetalleArchivoDetallesIngresosFacturas;
	protected JMenu jmenuDetalleAccionesDetallesIngresosFacturas;
	protected JMenu jmenuDetalleDatosDetallesIngresosFacturas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallesIngresosFacturas;	
	protected GridBagConstraints gridBagConstraintsDetallesIngresosFacturas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallesIngresosFacturasBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallesIngresosFacturas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public DetallesIngresosFacturasSessionBean detallesingresosfacturasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public DetallesIngresosFacturasLogic detallesingresosfacturasLogic;
	
	public JScrollPane jScrollPanelDatosDetallesIngresosFacturas;
	public JScrollPane jScrollPanelDatosEdicionDetallesIngresosFacturas;
	public JScrollPane jScrollPanelDatosGeneralDetallesIngresosFacturas;
	
	protected JPanel jPanelCamposDetallesIngresosFacturas;    
	protected JPanel jPanelCamposOcultosDetallesIngresosFacturas;    	
	protected JPanel jPanelAccionesDetallesIngresosFacturas;
	protected JPanel jPanelAccionesFormularioDetallesIngresosFacturas;
    
	
	
	protected Integer iXPanelCamposDetallesIngresosFacturas=0;
	protected Integer iYPanelCamposDetallesIngresosFacturas=0;
	
	protected Integer iXPanelCamposOcultosDetallesIngresosFacturas=0;
	protected Integer iYPanelCamposOcultosDetallesIngresosFacturas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallesIngresosFacturas;
	public JButton jButtonModificarDetallesIngresosFacturas;
	public JButton jButtonActualizarDetallesIngresosFacturas;
    public JButton jButtonEliminarDetallesIngresosFacturas;
	public JButton jButtonCancelarDetallesIngresosFacturas;
    public JButton jButtonGuardarCambiosDetallesIngresosFacturas;
	public JButton jButtonGuardarCambiosTablaDetallesIngresosFacturas;
	protected JButton jButtonCerrarDetallesIngresosFacturas;
	
	
	protected JButton jButtonProcesarInformacionDetallesIngresosFacturas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallesIngresosFacturas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallesIngresosFacturas;
	protected JButton jButtonModificarToolBarDetallesIngresosFacturas;
	protected JButton jButtonActualizarToolBarDetallesIngresosFacturas;
    protected JButton jButtonEliminarToolBarDetallesIngresosFacturas;
	protected JButton jButtonCancelarToolBarDetallesIngresosFacturas;
    protected JButton jButtonGuardarCambiosToolBarDetallesIngresosFacturas;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallesIngresosFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallesIngresosFacturas;
	protected JButton jButtonCerrarToolBarDetallesIngresosFacturas;
	
	protected JButton jButtonProcesarInformacionToolBarDetallesIngresosFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallesIngresosFacturas;
	protected JMenuItem jMenuItemModificarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemActualizarDetallesIngresosFacturas;
    protected JMenuItem jMenuItemEliminarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemCancelarDetallesIngresosFacturas;
    protected JMenuItem jMenuItemGuardarCambiosDetallesIngresosFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallesIngresosFacturas;
	protected JMenuItem jMenuItemCerrarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDetalleCerrarDetallesIngresosFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallesIngresosFacturas;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallesIngresosFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallesIngresosFacturas;
	protected JMenuItem jMenuItemMostrarOcultarDetallesIngresosFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallesIngresosFacturas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallesIngresosFacturas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallesIngresosFacturas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallesIngresosFacturas;
	public JLabel jLabelIdDetallesIngresosFacturas;
	public JLabel jLabelidDetallesIngresosFacturas;
	public JButton jButtonidDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetallesIngresosFacturas;
	public JLabel jLabelfechaDetallesIngresosFacturas;
	//public JFormattedTextField jDateChooserfechaDetallesIngresosFacturas;

	public JDateChooser jDateChooserfechaDetallesIngresosFacturas;
	public JButton jButtonfechaDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoDetallesIngresosFacturas;
	public JLabel jLabeltipo_movimientoDetallesIngresosFacturas;
	public JTextArea jTextAreatipo_movimientoDetallesIngresosFacturas;
	public JScrollPane jscrollPanetipo_movimientoDetallesIngresosFacturas;
	public JButton jButtontipo_movimientoDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorDetallesIngresosFacturas;
	public JLabel jLabelnumero_mayorDetallesIngresosFacturas;
	public JTextArea jTextAreanumero_mayorDetallesIngresosFacturas;
	public JScrollPane jscrollPanenumero_mayorDetallesIngresosFacturas;
	public JButton jButtonnumero_mayorDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaDetallesIngresosFacturas;
	public JLabel jLabelnumero_facturaDetallesIngresosFacturas;
	public JTextField jTextFieldnumero_facturaDetallesIngresosFacturas;
	public JButton jButtonnumero_facturaDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteDetallesIngresosFacturas;
	public JLabel jLabelnombre_clienteDetallesIngresosFacturas;
	public JTextArea jTextAreanombre_clienteDetallesIngresosFacturas;
	public JScrollPane jscrollPanenombre_clienteDetallesIngresosFacturas;
	public JButton jButtonnombre_clienteDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelsiglas_pagoDetallesIngresosFacturas;
	public JLabel jLabelsiglas_pagoDetallesIngresosFacturas;
	public JTextField jTextFieldsiglas_pagoDetallesIngresosFacturas;
	public JButton jButtonsiglas_pagoDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_pagoDetallesIngresosFacturas;
	public JLabel jLabelnombre_pagoDetallesIngresosFacturas;
	public JTextArea jTextAreanombre_pagoDetallesIngresosFacturas;
	public JScrollPane jscrollPanenombre_pagoDetallesIngresosFacturas;
	public JButton jButtonnombre_pagoDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDetallesIngresosFacturas;
	public JLabel jLabelcodigoDetallesIngresosFacturas;
	public JTextField jTextFieldcodigoDetallesIngresosFacturas;
	public JButton jButtoncodigoDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localDetallesIngresosFacturas;
	public JLabel jLabelcredito_mone_localDetallesIngresosFacturas;
	public JTextField jTextFieldcredito_mone_localDetallesIngresosFacturas;
	public JButton jButtoncredito_mone_localDetallesIngresosFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallesIngresosFacturas;
	public JLabel jLabelid_empresaDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallesIngresosFacturas;
	public JButton jButtonid_empresaDetallesIngresosFacturas= new JButtonMe();
	public JButton jButtonid_empresaDetallesIngresosFacturasUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallesIngresosFacturas;
	public JLabel jLabelid_sucursalDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallesIngresosFacturas;
	public JButton jButtonid_sucursalDetallesIngresosFacturas= new JButtonMe();
	public JButton jButtonid_sucursalDetallesIngresosFacturasUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallesIngresosFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallesIngresosFacturas;
	public JLabel jLabelid_ejercicioDetallesIngresosFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallesIngresosFacturas;
	public JButton jButtonid_ejercicioDetallesIngresosFacturas= new JButtonMe();
	public JButton jButtonid_ejercicioDetallesIngresosFacturasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallesIngresosFacturasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallesIngresosFacturas;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallesIngresosFacturas=new JPanel();
				this.jPanelAccionesFormularioDetallesIngresosFacturas=new JPanel();
				this.jmenuBarDetalleDetallesIngresosFacturas=new JMenuBar();
				this.jTtoolBarDetalleDetallesIngresosFacturas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallesIngresosFacturasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallesIngresosFacturasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallesIngresosFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallesIngresosFacturas() {
		return this.jButtonActualizarToolBarDetallesIngresosFacturas;
	}
	
	public JButton getjButtonEliminarToolBarDetallesIngresosFacturas() {
		return this.jButtonEliminarToolBarDetallesIngresosFacturas;
	}
	
	public JButton getjButtonCancelarToolBarDetallesIngresosFacturas() {
		return this.jButtonCancelarToolBarDetallesIngresosFacturas;
	}		
	
	public JButton getjButtonProcesarInformacionDetallesIngresosFacturas() {
		return this.jButtonProcesarInformacionDetallesIngresosFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallesIngresosFacturas)	{
		this.jButtonProcesarInformacionDetallesIngresosFacturas = jButtonProcesarInformacionDetallesIngresosFacturas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallesIngresosFacturas() {
		return this.jComboBoxTiposAccionesDetallesIngresosFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposRelacionesDetallesIngresosFacturas) {
		this.jComboBoxTiposRelacionesDetallesIngresosFacturas = jComboBoxTiposRelacionesDetallesIngresosFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallesIngresosFacturas(
			JComboBox jComboBoxTiposAccionesDetallesIngresosFacturas) {
		this.jComboBoxTiposAccionesDetallesIngresosFacturas = jComboBoxTiposAccionesDetallesIngresosFacturas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallesIngresosFacturas() {
		return this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallesIngresosFacturas(
			JComboBox jComboBoxTiposAccionesFormularioDetallesIngresosFacturas) {
		this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas = jComboBoxTiposAccionesFormularioDetallesIngresosFacturas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallesingresosfacturasSessionBean=new DetallesIngresosFacturasSessionBean();
		
		this.detallesingresosfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallesingresosfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallesIngresosFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallesIngresosFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalles Ingresos Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallesIngresosFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallesIngresosFacturas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallesIngresosFacturas=new JButtonMe();
				this.jButtonModificarToolBarDetallesIngresosFacturas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas,
							"actualizar","actualizar","Actualizar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas,
							"eliminar","eliminar","Eliminar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas,
							"cancelar","cancelar","Cancelar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallesIngresosFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallesIngresosFacturas,this.jTtoolBarDetalleDetallesIngresosFacturas,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallesIngresosFacturas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallesIngresosFacturas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallesIngresosFacturas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallesIngresosFacturas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallesIngresosFacturas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallesIngresosFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallesIngresosFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallesIngresosFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallesIngresosFacturas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallesIngresosFacturas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallesIngresosFacturas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallesIngresosFacturas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallesIngresosFacturas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallesIngresosFacturas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallesIngresosFacturas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallesIngresosFacturas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallesIngresosFacturas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallesIngresosFacturas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallesIngresosFacturas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallesIngresosFacturas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallesIngresosFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallesIngresosFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallesIngresosFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallesIngresosFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallesIngresosFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallesIngresosFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallesIngresosFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallesIngresosFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallesIngresosFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallesIngresosFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallesIngresosFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallesIngresosFacturas.add(this.jMenuItemDetalleCerrarDetallesIngresosFacturas);
		
		this.jmenuDetalleAccionesDetallesIngresosFacturas.add(this.jMenuItemActualizarDetallesIngresosFacturas);
		this.jmenuDetalleAccionesDetallesIngresosFacturas.add(this.jMenuItemEliminarDetallesIngresosFacturas);
		this.jmenuDetalleAccionesDetallesIngresosFacturas.add(this.jMenuItemCancelarDetallesIngresosFacturas);		
		
		//this.jmenuDetalleDatosDetallesIngresosFacturas.add(this.jMenuItemDetalleAbrirOrderByDetallesIngresosFacturas);				
		this.jmenuDetalleDatosDetallesIngresosFacturas.add(this.jMenuItemDetalleMostarOcultarDetallesIngresosFacturas);				
				
		//this.jmenuDetalleAccionesDetallesIngresosFacturas.add(this.jMenuItemGuardarCambiosDetallesIngresosFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallesIngresosFacturas.add(this.jmenuDetalleArchivoDetallesIngresosFacturas);		
		this.jmenuBarDetalleDetallesIngresosFacturas.add(this.jmenuDetalleAccionesDetallesIngresosFacturas);		
		this.jmenuBarDetalleDetallesIngresosFacturas.add(this.jmenuDetalleDatosDetallesIngresosFacturas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallesIngresosFacturas);				
	}
	
	
	public void inicializarElementosCamposDetallesIngresosFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallesIngresosFacturas = new JLabelMe();
		jLabelIdDetallesIngresosFacturas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallesIngresosFacturas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallesIngresosFacturas= new GridBagLayout();

		this.jPanelidDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);

		jLabelidDetallesIngresosFacturas = new JLabel();
		jLabelidDetallesIngresosFacturas.setText("Id");

		jLabelidDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaDetallesIngresosFacturas = new JLabelMe();
		this.jLabelfechaDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetallesIngresosFacturas.setToolTipText("Fecha");
		this.jLabelfechaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelfechaDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		//jFormattedTextFieldfechaDetallesIngresosFacturas= new JFormattedTextFieldMe();

		jDateChooserfechaDetallesIngresosFacturas= new JDateChooser();
		jDateChooserfechaDetallesIngresosFacturas.setEnabled(false);
		jDateChooserfechaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetallesIngresosFacturas.setDate(new Date());
		jDateChooserfechaDetallesIngresosFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetallesIngresosFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoDetallesIngresosFacturas = new JLabelMe();
		this.jLabeltipo_movimientoDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoDetallesIngresosFacturas.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPaneltipo_movimientoDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextAreatipo_movimientoDetallesIngresosFacturas= new JTextAreaMe();
		jTextAreatipo_movimientoDetallesIngresosFacturas.setEnabled(false);
		jTextAreatipo_movimientoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoDetallesIngresosFacturas.setLineWrap(true);
		jTextAreatipo_movimientoDetallesIngresosFacturas.setWrapStyleWord(true);
		jTextAreatipo_movimientoDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoDetallesIngresosFacturas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoDetallesIngresosFacturas = new JScrollPane(jTextAreatipo_movimientoDetallesIngresosFacturas);
		jscrollPanetipo_movimientoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorDetallesIngresosFacturas = new JLabelMe();
		this.jLabelnumero_mayorDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorDetallesIngresosFacturas.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelnumero_mayorDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextAreanumero_mayorDetallesIngresosFacturas= new JTextAreaMe();
		jTextAreanumero_mayorDetallesIngresosFacturas.setEnabled(false);
		jTextAreanumero_mayorDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDetallesIngresosFacturas.setLineWrap(true);
		jTextAreanumero_mayorDetallesIngresosFacturas.setWrapStyleWord(true);
		jTextAreanumero_mayorDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorDetallesIngresosFacturas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorDetallesIngresosFacturas = new JScrollPane(jTextAreanumero_mayorDetallesIngresosFacturas);
		jscrollPanenumero_mayorDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaDetallesIngresosFacturas = new JLabelMe();
		this.jLabelnumero_facturaDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaDetallesIngresosFacturas.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelnumero_facturaDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextFieldnumero_facturaDetallesIngresosFacturas= new JTextFieldMe();

		jTextFieldnumero_facturaDetallesIngresosFacturas.setEnabled(false);
		jTextFieldnumero_facturaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteDetallesIngresosFacturas = new JLabelMe();
		this.jLabelnombre_clienteDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteDetallesIngresosFacturas.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelnombre_clienteDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextAreanombre_clienteDetallesIngresosFacturas= new JTextAreaMe();
		jTextAreanombre_clienteDetallesIngresosFacturas.setEnabled(false);
		jTextAreanombre_clienteDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallesIngresosFacturas.setLineWrap(true);
		jTextAreanombre_clienteDetallesIngresosFacturas.setWrapStyleWord(true);
		jTextAreanombre_clienteDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteDetallesIngresosFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteDetallesIngresosFacturas = new JScrollPane(jTextAreanombre_clienteDetallesIngresosFacturas);
		jscrollPanenombre_clienteDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelsiglas_pagoDetallesIngresosFacturas = new JLabelMe();
		this.jLabelsiglas_pagoDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO+" : *");
		this.jLabelsiglas_pagoDetallesIngresosFacturas.setToolTipText("Siglas Pago");
		this.jLabelsiglas_pagoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglas_pagoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglas_pagoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglas_pagoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglas_pagoDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglas_pagoDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_SIGLASPAGO);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelsiglas_pagoDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextFieldsiglas_pagoDetallesIngresosFacturas= new JTextFieldMe();

		jTextFieldsiglas_pagoDetallesIngresosFacturas.setEnabled(false);
		jTextFieldsiglas_pagoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglas_pagoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglas_pagoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglas_pagoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglas_pagoDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglas_pagoDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglas_pagoDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglas_pagoDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_pagoDetallesIngresosFacturas = new JLabelMe();
		this.jLabelnombre_pagoDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO+" : *");
		this.jLabelnombre_pagoDetallesIngresosFacturas.setToolTipText("Nombre Pago");
		this.jLabelnombre_pagoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_pagoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_pagoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_pagoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_pagoDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_pagoDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_NOMBREPAGO);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelnombre_pagoDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextAreanombre_pagoDetallesIngresosFacturas= new JTextAreaMe();
		jTextAreanombre_pagoDetallesIngresosFacturas.setEnabled(false);
		jTextAreanombre_pagoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_pagoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_pagoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_pagoDetallesIngresosFacturas.setLineWrap(true);
		jTextAreanombre_pagoDetallesIngresosFacturas.setWrapStyleWord(true);
		jTextAreanombre_pagoDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_pagoDetallesIngresosFacturas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_pagoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_pagoDetallesIngresosFacturas = new JScrollPane(jTextAreanombre_pagoDetallesIngresosFacturas);
		jscrollPanenombre_pagoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_pagoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_pagoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_pagoDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_pagoDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_pagoDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_pagoDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDetallesIngresosFacturas = new JLabelMe();
		this.jLabelcodigoDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDetallesIngresosFacturas.setToolTipText("Codigo");
		this.jLabelcodigoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelcodigoDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextFieldcodigoDetallesIngresosFacturas= new JTextFieldMe();

		jTextFieldcodigoDetallesIngresosFacturas.setEnabled(false);
		jTextFieldcodigoDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDetallesIngresosFacturasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localDetallesIngresosFacturas = new JLabelMe();
		this.jLabelcredito_mone_localDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localDetallesIngresosFacturas.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelcredito_mone_localDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jTextFieldcredito_mone_localDetallesIngresosFacturas= new JTextFieldMe();
		jTextFieldcredito_mone_localDetallesIngresosFacturas.setEnabled(false);
		jTextFieldcredito_mone_localDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localDetallesIngresosFacturas.setText("0.0");

		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localDetallesIngresosFacturasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallesIngresosFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallesIngresosFacturas = new JLabelMe();
		this.jLabelid_empresaDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallesIngresosFacturas.setToolTipText("Empresa");
		this.jLabelid_empresaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelid_empresaDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jComboBoxid_empresaDetallesIngresosFacturas= new JComboBoxMe();
		jComboBoxid_empresaDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallesIngresosFacturas.setEnabled(false);

		this.jButtonid_empresaDetallesIngresosFacturas= new JButtonMe();
		this.jButtonid_empresaDetallesIngresosFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallesIngresosFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallesIngresosFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallesIngresosFacturas.setText("Buscar");
		this.jButtonid_empresaDetallesIngresosFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallesIngresosFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallesIngresosFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallesIngresosFacturas"));

		this.jButtonid_empresaDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallesIngresosFacturasBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallesIngresosFacturasUpdate= new JButtonMe();
		this.jButtonid_empresaDetallesIngresosFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallesIngresosFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallesIngresosFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallesIngresosFacturasUpdate.setText("U");
		this.jButtonid_empresaDetallesIngresosFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallesIngresosFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallesIngresosFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallesIngresosFacturasUpdate"));



					
		this.jLabelid_sucursalDetallesIngresosFacturas = new JLabelMe();
		this.jLabelid_sucursalDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallesIngresosFacturas.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelid_sucursalDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jComboBoxid_sucursalDetallesIngresosFacturas= new JComboBoxMe();
		jComboBoxid_sucursalDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallesIngresosFacturas.setEnabled(false);

		this.jButtonid_sucursalDetallesIngresosFacturas= new JButtonMe();
		this.jButtonid_sucursalDetallesIngresosFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallesIngresosFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallesIngresosFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallesIngresosFacturas.setText("Buscar");
		this.jButtonid_sucursalDetallesIngresosFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallesIngresosFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallesIngresosFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallesIngresosFacturas"));

		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallesIngresosFacturasBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallesIngresosFacturasUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setText("U");
		this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallesIngresosFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallesIngresosFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallesIngresosFacturasUpdate"));



					
		this.jLabelid_ejercicioDetallesIngresosFacturas = new JLabelMe();
		this.jLabelid_ejercicioDetallesIngresosFacturas.setText(""+DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallesIngresosFacturas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallesIngresosFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallesIngresosFacturas.setToolTipText(DetallesIngresosFacturasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		this.jPanelid_ejercicioDetallesIngresosFacturas.setLayout(this.gridaBagLayoutDetallesIngresosFacturas);


		jComboBoxid_ejercicioDetallesIngresosFacturas= new JComboBoxMe();
		jComboBoxid_ejercicioDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallesIngresosFacturas.setEnabled(false);

		this.jButtonid_ejercicioDetallesIngresosFacturas= new JButtonMe();
		this.jButtonid_ejercicioDetallesIngresosFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallesIngresosFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallesIngresosFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallesIngresosFacturas.setText("Buscar");
		this.jButtonid_ejercicioDetallesIngresosFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallesIngresosFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallesIngresosFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallesIngresosFacturas"));

		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setText("U");
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallesIngresosFacturasBusqueda"));

		if(this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallesIngresosFacturasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setText("U");
		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallesIngresosFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallesIngresosFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallesIngresosFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallesIngresosFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallesIngresosFacturasUpdate"));



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
		//this.jInternalFrameDetalleDetallesIngresosFacturas = new DetallesIngresosFacturasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalles Ingresos Facturas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallesIngresosFacturas= new GridBagLayout();
		

		
		String sToolTipDetallesIngresosFacturas="";
		sToolTipDetallesIngresosFacturas=DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallesIngresosFacturas+="(Tesoreria.DetallesIngresosFacturas)";
		}
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallesIngresosFacturas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallesIngresosFacturas = new JButtonMe();
		this.jButtonModificarDetallesIngresosFacturas = new JButtonMe();
        this.jButtonActualizarDetallesIngresosFacturas = new JButtonMe();
        this.jButtonEliminarDetallesIngresosFacturas = new JButtonMe();
        this.jButtonCancelarDetallesIngresosFacturas = new JButtonMe();
        this.jButtonGuardarCambiosDetallesIngresosFacturas = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas = new JButtonMe();
		this.jButtonCerrarDetallesIngresosFacturas = new JButtonMe();
		
		this.jScrollPanelDatosDetallesIngresosFacturas = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallesIngresosFacturas = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallesIngresosFacturas = new JScrollPane();
				
		
		
		this.jPanelCamposDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalles Ingresos Facturas";
		
		if(!this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalles Ingresos Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallesIngresosFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallesIngresosFacturas.setName("jPanelCamposDetallesIngresosFacturas"); 

		this.jPanelCamposOcultosDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallesIngresosFacturas.setName("jPanelCamposOcultosDetallesIngresosFacturas"); 

        this.jPanelAccionesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallesIngresosFacturas.setToolTipText("Acciones");
        this.jPanelAccionesDetallesIngresosFacturas.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallesIngresosFacturas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallesIngresosFacturas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallesIngresosFacturas.setText("Nuevo");
		this.jButtonModificarDetallesIngresosFacturas.setText("Editar");
        this.jButtonActualizarDetallesIngresosFacturas.setText("Actualizar");
        this.jButtonEliminarDetallesIngresosFacturas.setText("Eliminar");
        this.jButtonCancelarDetallesIngresosFacturas.setText("Cancelar");
        this.jButtonGuardarCambiosDetallesIngresosFacturas.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setText("Guardar");
		this.jButtonCerrarDetallesIngresosFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallesIngresosFacturas,"nuevo_button","Nuevo",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallesIngresosFacturas,"modificar_button","Editar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallesIngresosFacturas,"actualizar_button","Actualizar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallesIngresosFacturas,"eliminar_button","Eliminar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallesIngresosFacturas,"cancelar_button","Cancelar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallesIngresosFacturas,"guardarcambios_button","Guardar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallesIngresosFacturas,"guardarcambiostabla_button","Guardar",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallesIngresosFacturas,"cerrar_button","Salir",this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallesIngresosFacturas.setToolTipText("Nuevo"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallesIngresosFacturas.setToolTipText("Editar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallesIngresosFacturas.setToolTipText("Actualizar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallesIngresosFacturas.setToolTipText("Eliminar)"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallesIngresosFacturas.setToolTipText("Cancelar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallesIngresosFacturas.setToolTipText("Guardar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.setToolTipText("Guardar"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallesIngresosFacturas.setToolTipText("Salir"+" "+DetallesIngresosFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallesIngresosFacturas";
		inputMap = this.jButtonNuevoDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallesIngresosFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallesIngresosFacturas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallesIngresosFacturas";
		inputMap = this.jButtonActualizarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallesIngresosFacturas"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallesIngresosFacturas";
		inputMap = this.jButtonEliminarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallesIngresosFacturas"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallesIngresosFacturas";
		inputMap = this.jButtonCancelarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallesIngresosFacturas"));
		
		//CERRAR		
		sMapKey = "CerrarDetallesIngresosFacturas";
		inputMap = this.jButtonCerrarDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallesIngresosFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallesIngresosFacturas";
		inputMap = this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallesIngresosFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallesIngresosFacturas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallesIngresosFacturas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallesIngresosFacturas.setToolTipText("Nuevo DetallesIngresosFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas.setToolTipText("Sin Cerrar Ventana DetallesIngresosFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallesIngresosFacturas.setText("Accion");
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallesIngresosFacturas = new JLabelMe();
		
		this.jLabelAccionesDetallesIngresosFacturas.setText("Acciones");		
		this.jLabelAccionesDetallesIngresosFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallesIngresosFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallesIngresosFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallesIngresosFacturas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallesIngresosFacturas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallesIngresosFacturas=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallesIngresosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallesIngresosFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallesIngresosFacturas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallesIngresosFacturas = new GridBagLayout();
		
		this.jPanelCamposDetallesIngresosFacturas.setLayout(gridaBagLayoutCamposDetallesIngresosFacturas);
		this.jPanelCamposOcultosDetallesIngresosFacturas.setLayout(gridaBagLayoutCamposOcultosDetallesIngresosFacturas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallesIngresosFacturas.add(jLabelIdDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallesIngresosFacturas.add(jLabelidDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallesIngresosFacturas.add(jLabelid_empresaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallesIngresosFacturas.add(jButtonid_empresaDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 3;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallesIngresosFacturas.add(jButtonid_empresaDetallesIngresosFacturasUpdate, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallesIngresosFacturas.add(jComboBoxid_empresaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallesIngresosFacturas.add(jLabelid_sucursalDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallesIngresosFacturas.add(jButtonid_sucursalDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 3;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallesIngresosFacturas.add(jButtonid_sucursalDetallesIngresosFacturasUpdate, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallesIngresosFacturas.add(jComboBoxid_sucursalDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallesIngresosFacturas.add(jLabelid_ejercicioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallesIngresosFacturas.add(jButtonid_ejercicioDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 3;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallesIngresosFacturas.add(jButtonid_ejercicioDetallesIngresosFacturasUpdate, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallesIngresosFacturas.add(jComboBoxid_ejercicioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetallesIngresosFacturas.add(jLabelfechaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetallesIngresosFacturas.add(jButtonfechaDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetallesIngresosFacturas.add(jDateChooserfechaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoDetallesIngresosFacturas.add(jLabeltipo_movimientoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoDetallesIngresosFacturas.add(jButtontipo_movimientoDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoDetallesIngresosFacturas.add(jscrollPanetipo_movimientoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorDetallesIngresosFacturas.add(jLabelnumero_mayorDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorDetallesIngresosFacturas.add(jButtonnumero_mayorDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorDetallesIngresosFacturas.add(jscrollPanenumero_mayorDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaDetallesIngresosFacturas.add(jLabelnumero_facturaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaDetallesIngresosFacturas.add(jButtonnumero_facturaDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaDetallesIngresosFacturas.add(jTextFieldnumero_facturaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteDetallesIngresosFacturas.add(jLabelnombre_clienteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteDetallesIngresosFacturas.add(jButtonnombre_clienteDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteDetallesIngresosFacturas.add(jscrollPanenombre_clienteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglas_pagoDetallesIngresosFacturas.add(jLabelsiglas_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglas_pagoDetallesIngresosFacturas.add(jButtonsiglas_pagoDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglas_pagoDetallesIngresosFacturas.add(jTextFieldsiglas_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_pagoDetallesIngresosFacturas.add(jLabelnombre_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_pagoDetallesIngresosFacturas.add(jButtonnombre_pagoDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_pagoDetallesIngresosFacturas.add(jscrollPanenombre_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDetallesIngresosFacturas.add(jLabelcodigoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDetallesIngresosFacturas.add(jButtoncodigoDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDetallesIngresosFacturas.add(jTextFieldcodigoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localDetallesIngresosFacturas.add(jLabelcredito_mone_localDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		//this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 2;
		this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localDetallesIngresosFacturas.add(jButtoncredito_mone_localDetallesIngresosFacturasBusqueda, this.gridBagConstraintsDetallesIngresosFacturas);
	}

	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = 1;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localDetallesIngresosFacturas.add(jTextFieldcredito_mone_localDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelidDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelfechaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPaneltipo_movimientoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelnumero_mayorDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelnumero_facturaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelnombre_clienteDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelsiglas_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelnombre_pagoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelcodigoDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallesIngresosFacturas.add(this.jPanelcredito_mone_localDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposDetallesIngresosFacturas % 2==0) {
		iXPanelCamposDetallesIngresosFacturas=0;
		iYPanelCamposDetallesIngresosFacturas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposOcultosDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposOcultosDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallesIngresosFacturas.add(this.jPanelid_empresaDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposOcultosDetallesIngresosFacturas % 2==0) {
		iXPanelCamposOcultosDetallesIngresosFacturas=0;
		iYPanelCamposOcultosDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposOcultosDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposOcultosDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallesIngresosFacturas.add(this.jPanelid_sucursalDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposOcultosDetallesIngresosFacturas % 2==0) {
		iXPanelCamposOcultosDetallesIngresosFacturas=0;
		iYPanelCamposOcultosDetallesIngresosFacturas++;
	}
	this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallesIngresosFacturas.gridy = iYPanelCamposOcultosDetallesIngresosFacturas;
	this.gridBagConstraintsDetallesIngresosFacturas.gridx = iXPanelCamposOcultosDetallesIngresosFacturas++;
	this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallesIngresosFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallesIngresosFacturas.add(this.jPanelid_ejercicioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);



	if(iXPanelCamposOcultosDetallesIngresosFacturas % 2==0) {
		iXPanelCamposOcultosDetallesIngresosFacturas=0;
		iYPanelCamposOcultosDetallesIngresosFacturas++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallesIngresosFacturas= new GridBagLayout();
		this.jPanelAccionesDetallesIngresosFacturas.setLayout(gridaBagLayoutAccionesDetallesIngresosFacturas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallesIngresosFacturas= new GridBagLayout();
		this.jPanelAccionesFormularioDetallesIngresosFacturas.setLayout(gridaBagLayoutAccionesFormularioDetallesIngresosFacturas);
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallesIngresosFacturas.add(this.jComboBoxTiposAccionesFormularioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonModificarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);							

		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonEliminarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonActualizarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);


		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonGuardarCambiosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);	
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = 0;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallesIngresosFacturas.add(this.jButtonCancelarDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallesIngresosFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallesIngresosFacturas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallesingresosfacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();						
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;		
			//this.gridBagConstraintsDetallesIngresosFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallesIngresosFacturas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =0;
		this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallesIngresosFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallesIngresosFacturasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallesIngresosFacturas = new DetallesIngresosFacturasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalles Ingresos Facturas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalles Ingresos Facturas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalles Ingresos Facturas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallesIngresosFacturasModel detallesingresosfacturasModel=new DetallesIngresosFacturasModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallesIngresosFacturasModel.DetallesIngresosFacturasFocusTraversalPolicy detallesingresosfacturasFocusTraversalPolicy = detallesingresosfacturasModel.new DetallesIngresosFacturasFocusTraversalPolicy(this);
			
			//detallesingresosfacturasFocusTraversalPolicy.setdetallesingresosfacturasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallesingresosfacturasModel);
			
			
			this.jContentPaneDetalleDetallesIngresosFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallesIngresosFacturas = new GridBagLayout();	
			this.jContentPaneDetalleDetallesIngresosFacturas.setLayout(gridaBagLayoutDetalleDetallesIngresosFacturas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallesIngresosFacturas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
				this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
					
				
				this.jContentPaneDetalleDetallesIngresosFacturas.add(jTtoolBarDetalleDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);								
				
}
			
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas=   new JScrollPane(jContentPaneDetalleDetallesIngresosFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	        
			this.jContentPaneDetalleDetallesIngresosFacturas.add(jPanelCamposDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);
			
			
			
			
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
						//&& detallesingresosfacturasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallesingresosfacturasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallesIngresosFacturas= new GridBagConstraints();
						this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
						this.jContentPaneDetalleDetallesIngresosFacturas.add(this.jTabbedPaneRelacionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallesIngresosFacturas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallesIngresosFacturas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
					this.gridBagConstraintsDetallesIngresosFacturas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
					
				
					this.jContentPaneDetalleDetallesIngresosFacturas.add(jPanelCamposOcultosDetallesIngresosFacturas, gridBagConstraintsDetallesIngresosFacturas);
				
					this.jPanelCamposOcultosDetallesIngresosFacturas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	        this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallesIngresosFacturas.add(this.jPanelAccionesFormularioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);							
			
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
	        this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallesIngresosFacturas.add(this.jPanelAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallesIngresosFacturas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas=   new JScrollPane(this.jPanelCamposDetallesIngresosFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallesIngresosFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
			this.gridBagConstraintsDetallesIngresosFacturas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallesIngresosFacturas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallesIngresosFacturas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);			
			
			this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
			this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
			
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		
			
		this.gridBagConstraintsDetallesIngresosFacturas = new GridBagConstraints();
		this.gridBagConstraintsDetallesIngresosFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallesIngresosFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallesIngresosFacturas, this.gridBagConstraintsDetallesIngresosFacturas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallesIngresosFacturas;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallesIngresosFacturas;
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
