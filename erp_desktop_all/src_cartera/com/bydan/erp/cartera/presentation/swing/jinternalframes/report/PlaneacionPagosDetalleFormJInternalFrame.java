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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.PlaneacionPagosConstantesFunciones;

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
public class PlaneacionPagosDetalleFormJInternalFrame extends PlaneacionPagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePlaneacionPagos;
	
	protected JMenuBar jmenuBarDetallePlaneacionPagos;
	
	protected JMenu jmenuDetallePlaneacionPagos;
	protected JMenu jmenuDetalleArchivoPlaneacionPagos;
	protected JMenu jmenuDetalleAccionesPlaneacionPagos;
	protected JMenu jmenuDetalleDatosPlaneacionPagos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaneacionPagos;	
	protected GridBagConstraints gridBagConstraintsPlaneacionPagos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PlaneacionPagosBeanSwingJInternalFrameAdditional jInternalFrameDetallePlaneacionPagos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public PlaneacionPagosSessionBean planeacionpagosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public PlaneacionPagosLogic planeacionpagosLogic;
	
	public JScrollPane jScrollPanelDatosPlaneacionPagos;
	public JScrollPane jScrollPanelDatosEdicionPlaneacionPagos;
	public JScrollPane jScrollPanelDatosGeneralPlaneacionPagos;
	
	protected JPanel jPanelCamposPlaneacionPagos;    
	protected JPanel jPanelCamposOcultosPlaneacionPagos;    	
	protected JPanel jPanelAccionesPlaneacionPagos;
	protected JPanel jPanelAccionesFormularioPlaneacionPagos;
    
	
	
	protected Integer iXPanelCamposPlaneacionPagos=0;
	protected Integer iYPanelCamposPlaneacionPagos=0;
	
	protected Integer iXPanelCamposOcultosPlaneacionPagos=0;
	protected Integer iYPanelCamposOcultosPlaneacionPagos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPlaneacionPagos;
	public JButton jButtonModificarPlaneacionPagos;
	public JButton jButtonActualizarPlaneacionPagos;
    public JButton jButtonEliminarPlaneacionPagos;
	public JButton jButtonCancelarPlaneacionPagos;
    public JButton jButtonGuardarCambiosPlaneacionPagos;
	public JButton jButtonGuardarCambiosTablaPlaneacionPagos;
	protected JButton jButtonCerrarPlaneacionPagos;
	
	
	protected JButton jButtonProcesarInformacionPlaneacionPagos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPlaneacionPagos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPlaneacionPagos;
	protected JCheckBox jCheckBoxPostAccionSinMensajePlaneacionPagos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaneacionPagos;
	protected JButton jButtonModificarToolBarPlaneacionPagos;
	protected JButton jButtonActualizarToolBarPlaneacionPagos;
    protected JButton jButtonEliminarToolBarPlaneacionPagos;
	protected JButton jButtonCancelarToolBarPlaneacionPagos;
    protected JButton jButtonGuardarCambiosToolBarPlaneacionPagos;
	protected JButton jButtonGuardarCambiosTablaToolBarPlaneacionPagos;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaneacionPagos;
	protected JButton jButtonCerrarToolBarPlaneacionPagos;
	
	protected JButton jButtonProcesarInformacionToolBarPlaneacionPagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaneacionPagos;
	protected JMenuItem jMenuItemModificarPlaneacionPagos;
	protected JMenuItem jMenuItemActualizarPlaneacionPagos;
    protected JMenuItem jMenuItemEliminarPlaneacionPagos;
	protected JMenuItem jMenuItemCancelarPlaneacionPagos;
    protected JMenuItem jMenuItemGuardarCambiosPlaneacionPagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaneacionPagos;
	protected JMenuItem jMenuItemCerrarPlaneacionPagos;
	protected JMenuItem jMenuItemDetalleCerrarPlaneacionPagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaneacionPagos;
	
	protected JMenuItem jMenuItemProcesarInformacionPlaneacionPagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaneacionPagos;
	protected JMenuItem jMenuItemMostrarOcultarPlaneacionPagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaneacionPagos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaneacionPagos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPlaneacionPagos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPlaneacionPagos;
	public JLabel jLabelIdPlaneacionPagos;
	public JLabel jLabelidPlaneacionPagos;
	public JButton jButtonidPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pago_inicioPlaneacionPagos;
	public JLabel jLabelfecha_pago_inicioPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_pago_inicioPlaneacionPagos;

	public JDateChooser jDateChooserfecha_pago_inicioPlaneacionPagos;
	public JButton jButtonfecha_pago_inicioPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pago_finPlaneacionPagos;
	public JLabel jLabelfecha_pago_finPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_pago_finPlaneacionPagos;

	public JDateChooser jDateChooserfecha_pago_finPlaneacionPagos;
	public JButton jButtonfecha_pago_finPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clientePlaneacionPagos;
	public JLabel jLabelnombre_clientePlaneacionPagos;
	public JTextArea jTextAreanombre_clientePlaneacionPagos;
	public JScrollPane jscrollPanenombre_clientePlaneacionPagos;
	public JButton jButtonnombre_clientePlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaPlaneacionPagos;
	public JLabel jLabelnumero_facturaPlaneacionPagos;
	public JTextField jTextFieldnumero_facturaPlaneacionPagos;
	public JButton jButtonnumero_facturaPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPlaneacionPagos;
	public JLabel jLabelfecha_emisionPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_emisionPlaneacionPagos;

	public JDateChooser jDateChooserfecha_emisionPlaneacionPagos;
	public JButton jButtonfecha_emisionPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaPlaneacionPagos;
	public JLabel jLabelfecha_ventaPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_ventaPlaneacionPagos;

	public JDateChooser jDateChooserfecha_ventaPlaneacionPagos;
	public JButton jButtonfecha_ventaPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoPlaneacionPagos;
	public JLabel jLabelfecha_pagoPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_pagoPlaneacionPagos;

	public JDateChooser jDateChooserfecha_pagoPlaneacionPagos;
	public JButton jButtonfecha_pagoPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelsaldoPlaneacionPagos;
	public JLabel jLabelsaldoPlaneacionPagos;
	public JTextField jTextFieldsaldoPlaneacionPagos;
	public JButton jButtonsaldoPlaneacionPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPlaneacionPagos;
	public JLabel jLabelid_empresaPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPlaneacionPagos;
	public JButton jButtonid_empresaPlaneacionPagos= new JButtonMe();
	public JButton jButtonid_empresaPlaneacionPagosUpdate= new JButtonMe();
	public JButton jButtonid_empresaPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clientePlaneacionPagos;
	public JLabel jLabelid_grupo_clientePlaneacionPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clientePlaneacionPagos;
	public JButton jButtonid_grupo_clientePlaneacionPagos= new JButtonMe();
	public JButton jButtonid_grupo_clientePlaneacionPagosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clientePlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaPlaneacionPagos;
	public JLabel jLabelid_facturaPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaPlaneacionPagos;
	public JButton jButtonid_facturaPlaneacionPagos= new JButtonMe();
	public JButton jButtonid_facturaPlaneacionPagosUpdate= new JButtonMe();
	public JButton jButtonid_facturaPlaneacionPagosBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePlaneacionPagos;
	public JLabel jLabelid_clientePlaneacionPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePlaneacionPagos;
	public JButton jButtonid_clientePlaneacionPagos= new JButtonMe();
	public JButton jButtonid_clientePlaneacionPagosUpdate= new JButtonMe();
	public JButton jButtonid_clientePlaneacionPagosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPlaneacionPagos;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PlaneacionPagosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPlaneacionPagos=new JPanel();
				this.jPanelAccionesFormularioPlaneacionPagos=new JPanel();
				this.jmenuBarDetallePlaneacionPagos=new JMenuBar();
				this.jTtoolBarDetallePlaneacionPagos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PlaneacionPagosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPlaneacionPagos() {
		return this.jButtonActualizarToolBarPlaneacionPagos;
	}
	
	public JButton getjButtonEliminarToolBarPlaneacionPagos() {
		return this.jButtonEliminarToolBarPlaneacionPagos;
	}
	
	public JButton getjButtonCancelarToolBarPlaneacionPagos() {
		return this.jButtonCancelarToolBarPlaneacionPagos;
	}		
	
	public JButton getjButtonProcesarInformacionPlaneacionPagos() {
		return this.jButtonProcesarInformacionPlaneacionPagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaneacionPagos)	{
		this.jButtonProcesarInformacionPlaneacionPagos = jButtonProcesarInformacionPlaneacionPagos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaneacionPagos() {
		return this.jComboBoxTiposAccionesPlaneacionPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaneacionPagos(
			JComboBox jComboBoxTiposRelacionesPlaneacionPagos) {
		this.jComboBoxTiposRelacionesPlaneacionPagos = jComboBoxTiposRelacionesPlaneacionPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaneacionPagos(
			JComboBox jComboBoxTiposAccionesPlaneacionPagos) {
		this.jComboBoxTiposAccionesPlaneacionPagos = jComboBoxTiposAccionesPlaneacionPagos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPlaneacionPagos() {
		return this.jComboBoxTiposAccionesFormularioPlaneacionPagos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPlaneacionPagos(
			JComboBox jComboBoxTiposAccionesFormularioPlaneacionPagos) {
		this.jComboBoxTiposAccionesFormularioPlaneacionPagos = jComboBoxTiposAccionesFormularioPlaneacionPagos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
		
		this.planeacionpagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacionpagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planeacionpagosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaneacionPagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeacion Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
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
	
		PlaneacionPagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlaneacionPagos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPlaneacionPagos=new JButtonMe();
				this.jButtonModificarToolBarPlaneacionPagos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos,
							"actualizar","actualizar","Actualizar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos,
							"eliminar","eliminar","Eliminar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos,
							"cancelar","cancelar","Cancelar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPlaneacionPagos,this.jTtoolBarDetallePlaneacionPagos,
							"guardarcambios","guardarcambios","Guardar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePlaneacionPagos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePlaneacionPagos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPlaneacionPagos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPlaneacionPagos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPlaneacionPagos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaneacionPagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaneacionPagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaneacionPagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPlaneacionPagos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPlaneacionPagos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPlaneacionPagos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPlaneacionPagos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPlaneacionPagos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPlaneacionPagos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPlaneacionPagos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPlaneacionPagos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPlaneacionPagos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPlaneacionPagos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPlaneacionPagos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPlaneacionPagos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPlaneacionPagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaneacionPagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaneacionPagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaneacionPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaneacionPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaneacionPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPlaneacionPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPlaneacionPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPlaneacionPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaneacionPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaneacionPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaneacionPagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaneacionPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaneacionPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaneacionPagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPlaneacionPagos.add(this.jMenuItemDetalleCerrarPlaneacionPagos);
		
		this.jmenuDetalleAccionesPlaneacionPagos.add(this.jMenuItemActualizarPlaneacionPagos);
		this.jmenuDetalleAccionesPlaneacionPagos.add(this.jMenuItemEliminarPlaneacionPagos);
		this.jmenuDetalleAccionesPlaneacionPagos.add(this.jMenuItemCancelarPlaneacionPagos);		
		
		//this.jmenuDetalleDatosPlaneacionPagos.add(this.jMenuItemDetalleAbrirOrderByPlaneacionPagos);				
		this.jmenuDetalleDatosPlaneacionPagos.add(this.jMenuItemDetalleMostarOcultarPlaneacionPagos);				
				
		//this.jmenuDetalleAccionesPlaneacionPagos.add(this.jMenuItemGuardarCambiosPlaneacionPagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePlaneacionPagos.add(this.jmenuDetalleArchivoPlaneacionPagos);		
		this.jmenuBarDetallePlaneacionPagos.add(this.jmenuDetalleAccionesPlaneacionPagos);		
		this.jmenuBarDetallePlaneacionPagos.add(this.jmenuDetalleDatosPlaneacionPagos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePlaneacionPagos);				
	}
	
	
	public void inicializarElementosCamposPlaneacionPagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPlaneacionPagos = new JLabelMe();
		jLabelIdPlaneacionPagos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPlaneacionPagos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPlaneacionPagos= new GridBagLayout();

		this.jPanelidPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);

		jLabelidPlaneacionPagos = new JLabel();
		jLabelidPlaneacionPagos.setText("Id");

		jLabelidPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_pago_inicioPlaneacionPagos = new JLabelMe();
		this.jLabelfecha_pago_inicioPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO+" : *");
		this.jLabelfecha_pago_inicioPlaneacionPagos.setToolTipText("Fecha Pago Inicio");
		this.jLabelfecha_pago_inicioPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_pago_inicioPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_pago_inicioPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pago_inicioPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pago_inicioPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pago_inicioPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOINICIO);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelfecha_pago_inicioPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		//jFormattedTextFieldfecha_pago_inicioPlaneacionPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_pago_inicioPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_pago_inicioPlaneacionPagos.setEnabled(false);
		jDateChooserfecha_pago_inicioPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_inicioPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_inicioPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pago_inicioPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pago_inicioPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_pago_inicioPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pago_inicioPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setText("U");
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pago_inicioPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pago_inicioPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pago_inicioPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pago_inicioPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pago_finPlaneacionPagos = new JLabelMe();
		this.jLabelfecha_pago_finPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN+" : *");
		this.jLabelfecha_pago_finPlaneacionPagos.setToolTipText("Fecha Pago Fin");
		this.jLabelfecha_pago_finPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pago_finPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pago_finPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pago_finPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pago_finPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pago_finPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGOFIN);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelfecha_pago_finPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		//jFormattedTextFieldfecha_pago_finPlaneacionPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_pago_finPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_pago_finPlaneacionPagos.setEnabled(false);
		jDateChooserfecha_pago_finPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_finPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_finPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pago_finPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pago_finPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_pago_finPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pago_finPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pago_finPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setText("U");
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pago_finPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pago_finPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pago_finPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pago_finPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pago_finPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clientePlaneacionPagos = new JLabelMe();
		this.jLabelnombre_clientePlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clientePlaneacionPagos.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clientePlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clientePlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelnombre_clientePlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jTextAreanombre_clientePlaneacionPagos= new JTextAreaMe();
		jTextAreanombre_clientePlaneacionPagos.setEnabled(false);
		jTextAreanombre_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePlaneacionPagos.setLineWrap(true);
		jTextAreanombre_clientePlaneacionPagos.setWrapStyleWord(true);
		jTextAreanombre_clientePlaneacionPagos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clientePlaneacionPagos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clientePlaneacionPagos = new JScrollPane(jTextAreanombre_clientePlaneacionPagos);
		jscrollPanenombre_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clientePlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clientePlaneacionPagosBusqueda.setText("U");
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clientePlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clientePlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clientePlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaPlaneacionPagos = new JLabelMe();
		this.jLabelnumero_facturaPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaPlaneacionPagos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelnumero_facturaPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jTextFieldnumero_facturaPlaneacionPagos= new JTextFieldMe();

		jTextFieldnumero_facturaPlaneacionPagos.setEnabled(false);
		jTextFieldnumero_facturaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaPlaneacionPagosBusqueda.setText("U");
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPlaneacionPagos = new JLabelMe();
		this.jLabelfecha_emisionPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPlaneacionPagos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelfecha_emisionPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		//jFormattedTextFieldfecha_emisionPlaneacionPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_emisionPlaneacionPagos.setEnabled(false);
		jDateChooserfecha_emisionPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_emisionPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPlaneacionPagosBusqueda.setText("U");
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ventaPlaneacionPagos = new JLabelMe();
		this.jLabelfecha_ventaPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaPlaneacionPagos.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelfecha_ventaPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		//jFormattedTextFieldfecha_ventaPlaneacionPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_ventaPlaneacionPagos.setEnabled(false);
		jDateChooserfecha_ventaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_ventaPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaPlaneacionPagosBusqueda.setText("U");
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoPlaneacionPagos = new JLabelMe();
		this.jLabelfecha_pagoPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoPlaneacionPagos.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelfecha_pagoPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		//jFormattedTextFieldfecha_pagoPlaneacionPagos= new JFormattedTextFieldMe();

		jDateChooserfecha_pagoPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_pagoPlaneacionPagos.setEnabled(false);
		jDateChooserfecha_pagoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pagoPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pagoPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_pagoPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pagoPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pagoPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoPlaneacionPagosBusqueda.setText("U");
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pagoPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pagoPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoPlaneacionPagosBusqueda.setVisible(false);		}


					
		this.jLabelsaldoPlaneacionPagos = new JLabelMe();
		this.jLabelsaldoPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoPlaneacionPagos.setToolTipText("Saldo");
		this.jLabelsaldoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelsaldoPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jTextFieldsaldoPlaneacionPagos= new JTextFieldMe();
		jTextFieldsaldoPlaneacionPagos.setEnabled(false);
		jTextFieldsaldoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoPlaneacionPagos.setText("0.0");

		this.jButtonsaldoPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonsaldoPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoPlaneacionPagosBusqueda.setText("U");
		this.jButtonsaldoPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoPlaneacionPagosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPlaneacionPagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPlaneacionPagos = new JLabelMe();
		this.jLabelid_empresaPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPlaneacionPagos.setToolTipText("Empresa");
		this.jLabelid_empresaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelid_empresaPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jComboBoxid_empresaPlaneacionPagos= new JComboBoxMe();
		jComboBoxid_empresaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPlaneacionPagos.setEnabled(false);

		this.jButtonid_empresaPlaneacionPagos= new JButtonMe();
		this.jButtonid_empresaPlaneacionPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaneacionPagos.setText("Buscar");
		this.jButtonid_empresaPlaneacionPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPlaneacionPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionPagos"));

		this.jButtonid_empresaPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonid_empresaPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaneacionPagosBusqueda.setText("U");
		this.jButtonid_empresaPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPlaneacionPagosBusqueda.setVisible(false);		}

		this.jButtonid_empresaPlaneacionPagosUpdate= new JButtonMe();
		this.jButtonid_empresaPlaneacionPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaneacionPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaneacionPagosUpdate.setText("U");
		this.jButtonid_empresaPlaneacionPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPlaneacionPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaneacionPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaneacionPagosUpdate"));



					
		this.jLabelid_grupo_clientePlaneacionPagos = new JLabelMe();
		this.jLabelid_grupo_clientePlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clientePlaneacionPagos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clientePlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clientePlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelid_grupo_clientePlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jComboBoxid_grupo_clientePlaneacionPagos= new JComboBoxMe();
		jComboBoxid_grupo_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clientePlaneacionPagos= new JButtonMe();
		this.jButtonid_grupo_clientePlaneacionPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePlaneacionPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePlaneacionPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePlaneacionPagos.setText("Buscar");
		this.jButtonid_grupo_clientePlaneacionPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clientePlaneacionPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePlaneacionPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePlaneacionPagos"));

		this.jButtonid_grupo_clientePlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setText("U");
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clientePlaneacionPagosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clientePlaneacionPagosUpdate= new JButtonMe();
		this.jButtonid_grupo_clientePlaneacionPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePlaneacionPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePlaneacionPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clientePlaneacionPagosUpdate.setText("U");
		this.jButtonid_grupo_clientePlaneacionPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clientePlaneacionPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePlaneacionPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePlaneacionPagosUpdate"));



					
		this.jLabelid_facturaPlaneacionPagos = new JLabelMe();
		this.jLabelid_facturaPlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaPlaneacionPagos.setToolTipText("Factura");
		this.jLabelid_facturaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaPlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelid_facturaPlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jComboBoxid_facturaPlaneacionPagos= new JComboBoxMe();
		jComboBoxid_facturaPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaPlaneacionPagos= new JButtonMe();
		this.jButtonid_facturaPlaneacionPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPlaneacionPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPlaneacionPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPlaneacionPagos.setText("Buscar");
		this.jButtonid_facturaPlaneacionPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaPlaneacionPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPlaneacionPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPlaneacionPagos"));

		this.jButtonid_facturaPlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonid_facturaPlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaPlaneacionPagosBusqueda.setText("U");
		this.jButtonid_facturaPlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaPlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaPlaneacionPagosBusqueda.setVisible(false);		}

		this.jButtonid_facturaPlaneacionPagosUpdate= new JButtonMe();
		this.jButtonid_facturaPlaneacionPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPlaneacionPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPlaneacionPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaPlaneacionPagosUpdate.setText("U");
		this.jButtonid_facturaPlaneacionPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaPlaneacionPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPlaneacionPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaPlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPlaneacionPagosUpdate"));



					
		this.jLabelid_clientePlaneacionPagos = new JLabelMe();
		this.jLabelid_clientePlaneacionPagos.setText(""+PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePlaneacionPagos.setToolTipText("Cliente");
		this.jLabelid_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePlaneacionPagos.setToolTipText(PlaneacionPagosConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		this.jPanelid_clientePlaneacionPagos.setLayout(this.gridaBagLayoutPlaneacionPagos);


		jComboBoxid_clientePlaneacionPagos= new JComboBoxMe();
		jComboBoxid_clientePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePlaneacionPagos= new JButtonMe();
		this.jButtonid_clientePlaneacionPagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePlaneacionPagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePlaneacionPagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePlaneacionPagos.setText("Buscar");
		this.jButtonid_clientePlaneacionPagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePlaneacionPagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePlaneacionPagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePlaneacionPagos"));

		this.jButtonid_clientePlaneacionPagosBusqueda= new JButtonMe();
		this.jButtonid_clientePlaneacionPagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePlaneacionPagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePlaneacionPagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePlaneacionPagosBusqueda.setText("U");
		this.jButtonid_clientePlaneacionPagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePlaneacionPagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePlaneacionPagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePlaneacionPagosBusqueda"));

		if(this.planeacionpagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePlaneacionPagosBusqueda.setVisible(false);		}

		this.jButtonid_clientePlaneacionPagosUpdate= new JButtonMe();
		this.jButtonid_clientePlaneacionPagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePlaneacionPagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePlaneacionPagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePlaneacionPagosUpdate.setText("U");
		this.jButtonid_clientePlaneacionPagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePlaneacionPagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePlaneacionPagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePlaneacionPagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePlaneacionPagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePlaneacionPagosUpdate"));



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
		//this.jInternalFrameDetallePlaneacionPagos = new PlaneacionPagosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Planeacion Pagos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaneacionPagos= new GridBagLayout();
		

		
		String sToolTipPlaneacionPagos="";
		sToolTipPlaneacionPagos=PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaneacionPagos+="(Cartera.PlaneacionPagos)";
		}
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaneacionPagos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPlaneacionPagos = new JButtonMe();
		this.jButtonModificarPlaneacionPagos = new JButtonMe();
        this.jButtonActualizarPlaneacionPagos = new JButtonMe();
        this.jButtonEliminarPlaneacionPagos = new JButtonMe();
        this.jButtonCancelarPlaneacionPagos = new JButtonMe();
        this.jButtonGuardarCambiosPlaneacionPagos = new JButtonMe();
		this.jButtonGuardarCambiosTablaPlaneacionPagos = new JButtonMe();
		this.jButtonCerrarPlaneacionPagos = new JButtonMe();
		
		this.jScrollPanelDatosPlaneacionPagos = new JScrollPane();   
        this.jScrollPanelDatosEdicionPlaneacionPagos = new JScrollPane();
		this.jScrollPanelDatosGeneralPlaneacionPagos = new JScrollPane();
				
		
		
		this.jPanelCamposPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Planeacion Pagos";
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaneacionPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPlaneacionPagos.setName("jPanelCamposPlaneacionPagos"); 

		this.jPanelCamposOcultosPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPlaneacionPagos.setName("jPanelCamposOcultosPlaneacionPagos"); 

        this.jPanelAccionesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaneacionPagos.setToolTipText("Acciones");
        this.jPanelAccionesPlaneacionPagos.setName("Acciones"); 

		this.jPanelAccionesFormularioPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPlaneacionPagos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPlaneacionPagos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPlaneacionPagos.setText("Nuevo");
		this.jButtonModificarPlaneacionPagos.setText("Editar");
        this.jButtonActualizarPlaneacionPagos.setText("Actualizar");
        this.jButtonEliminarPlaneacionPagos.setText("Eliminar");
        this.jButtonCancelarPlaneacionPagos.setText("Cancelar");
        this.jButtonGuardarCambiosPlaneacionPagos.setText("Guardar");
		this.jButtonGuardarCambiosTablaPlaneacionPagos.setText("Guardar");
		this.jButtonCerrarPlaneacionPagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaneacionPagos,"nuevo_button","Nuevo",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPlaneacionPagos,"modificar_button","Editar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPlaneacionPagos,"actualizar_button","Actualizar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPlaneacionPagos,"eliminar_button","Eliminar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPlaneacionPagos,"cancelar_button","Cancelar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPlaneacionPagos,"guardarcambios_button","Guardar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaneacionPagos,"guardarcambiostabla_button","Guardar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaneacionPagos,"cerrar_button","Salir",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPlaneacionPagos.setToolTipText("Nuevo"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPlaneacionPagos.setToolTipText("Editar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPlaneacionPagos.setToolTipText("Actualizar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPlaneacionPagos.setToolTipText("Eliminar)"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPlaneacionPagos.setToolTipText("Cancelar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPlaneacionPagos.setToolTipText("Guardar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPlaneacionPagos.setToolTipText("Guardar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaneacionPagos.setToolTipText("Salir"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaneacionPagos";
		inputMap = this.jButtonNuevoPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaneacionPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaneacionPagos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPlaneacionPagos";
		inputMap = this.jButtonActualizarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPlaneacionPagos"));
		
		//ELIMINAR
		sMapKey = "EliminarPlaneacionPagos";
		inputMap = this.jButtonEliminarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPlaneacionPagos"));
		
		//CANCELAR	
		sMapKey = "CancelarPlaneacionPagos";
		inputMap = this.jButtonCancelarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPlaneacionPagos"));
		
		//CERRAR		
		sMapKey = "CerrarPlaneacionPagos";
		inputMap = this.jButtonCerrarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaneacionPagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaneacionPagos";
		inputMap = this.jButtonGuardarCambiosTablaPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaneacionPagos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPlaneacionPagos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPlaneacionPagos.setToolTipText("Nuevo PlaneacionPagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPlaneacionPagos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPlaneacionPagos.setToolTipText("Sin Cerrar Ventana PlaneacionPagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePlaneacionPagos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePlaneacionPagos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaneacionPagos.setText("Accion");
		this.jComboBoxTiposAccionesPlaneacionPagos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPlaneacionPagos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPlaneacionPagos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPlaneacionPagos = new JLabelMe();
		
		this.jLabelAccionesPlaneacionPagos.setText("Acciones");		
		this.jLabelAccionesPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPlaneacionPagos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPlaneacionPagos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPlaneacionPagos=new JTabbedPane();
		this.jTabbedPaneRelacionesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPlaneacionPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPlaneacionPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaneacionPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaneacionPagos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPlaneacionPagos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPlaneacionPagos = new GridBagLayout();
		
		this.jPanelCamposPlaneacionPagos.setLayout(gridaBagLayoutCamposPlaneacionPagos);
		this.jPanelCamposOcultosPlaneacionPagos.setLayout(gridaBagLayoutCamposOcultosPlaneacionPagos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPlaneacionPagos.add(jLabelIdPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPlaneacionPagos.add(jLabelidPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPlaneacionPagos.add(jLabelid_empresaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaneacionPagos.add(jButtonid_empresaPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 3;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaneacionPagos.add(jButtonid_empresaPlaneacionPagosUpdate, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPlaneacionPagos.add(jComboBoxid_empresaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clientePlaneacionPagos.add(jLabelid_grupo_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clientePlaneacionPagos.add(jButtonid_grupo_clientePlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 3;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clientePlaneacionPagos.add(jButtonid_grupo_clientePlaneacionPagosUpdate, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clientePlaneacionPagos.add(jComboBoxid_grupo_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pago_inicioPlaneacionPagos.add(jLabelfecha_pago_inicioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pago_inicioPlaneacionPagos.add(jButtonfecha_pago_inicioPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pago_inicioPlaneacionPagos.add(jDateChooserfecha_pago_inicioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pago_finPlaneacionPagos.add(jLabelfecha_pago_finPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pago_finPlaneacionPagos.add(jButtonfecha_pago_finPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pago_finPlaneacionPagos.add(jDateChooserfecha_pago_finPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaPlaneacionPagos.add(jLabelid_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaPlaneacionPagos.add(jButtonid_facturaPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 3;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaPlaneacionPagos.add(jButtonid_facturaPlaneacionPagosUpdate, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaPlaneacionPagos.add(jComboBoxid_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePlaneacionPagos.add(jLabelid_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePlaneacionPagos.add(jButtonid_clientePlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 3;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePlaneacionPagos.add(jButtonid_clientePlaneacionPagosUpdate, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePlaneacionPagos.add(jComboBoxid_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clientePlaneacionPagos.add(jLabelnombre_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clientePlaneacionPagos.add(jButtonnombre_clientePlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clientePlaneacionPagos.add(jscrollPanenombre_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaPlaneacionPagos.add(jLabelnumero_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaPlaneacionPagos.add(jButtonnumero_facturaPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaPlaneacionPagos.add(jTextFieldnumero_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPlaneacionPagos.add(jLabelfecha_emisionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPlaneacionPagos.add(jButtonfecha_emisionPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPlaneacionPagos.add(jDateChooserfecha_emisionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaPlaneacionPagos.add(jLabelfecha_ventaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaPlaneacionPagos.add(jButtonfecha_ventaPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaPlaneacionPagos.add(jDateChooserfecha_ventaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoPlaneacionPagos.add(jLabelfecha_pagoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoPlaneacionPagos.add(jButtonfecha_pagoPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoPlaneacionPagos.add(jDateChooserfecha_pagoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoPlaneacionPagos.add(jLabelsaldoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 2;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
		this.gridBagConstraintsPlaneacionPagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoPlaneacionPagos.add(jButtonsaldoPlaneacionPagosBusqueda, this.gridBagConstraintsPlaneacionPagos);
	}

	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaneacionPagos.gridy = 0;
	this.gridBagConstraintsPlaneacionPagos.gridx = 1;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoPlaneacionPagos.add(jTextFieldsaldoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelidPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelid_grupo_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelfecha_pago_inicioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelfecha_pago_finPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelid_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelid_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelnombre_clientePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelnumero_facturaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelfecha_emisionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelfecha_ventaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelfecha_pagoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaneacionPagos.add(this.jPanelsaldoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposPlaneacionPagos % 2==0) {
		iXPanelCamposPlaneacionPagos=0;
		iYPanelCamposPlaneacionPagos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaneacionPagos.gridy = iYPanelCamposOcultosPlaneacionPagos;
	this.gridBagConstraintsPlaneacionPagos.gridx = iXPanelCamposOcultosPlaneacionPagos++;
	this.gridBagConstraintsPlaneacionPagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaneacionPagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaneacionPagos.add(this.jPanelid_empresaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);



	if(iXPanelCamposOcultosPlaneacionPagos % 2==0) {
		iXPanelCamposOcultosPlaneacionPagos=0;
		iYPanelCamposOcultosPlaneacionPagos++;
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
			
		GridBagLayout gridaBagLayoutAccionesPlaneacionPagos= new GridBagLayout();
		this.jPanelAccionesPlaneacionPagos.setLayout(gridaBagLayoutAccionesPlaneacionPagos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPlaneacionPagos= new GridBagLayout();
		this.jPanelAccionesFormularioPlaneacionPagos.setLayout(gridaBagLayoutAccionesFormularioPlaneacionPagos);
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlaneacionPagos.add(this.jComboBoxTiposAccionesFormularioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccion++;
			
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonModificarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);							

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx =iPosXAccion++;
			
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonEliminarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonActualizarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonGuardarCambiosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);	
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;		
		this.gridBagConstraintsPlaneacionPagos.gridx =iPosXAccion++;
		
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonCancelarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaneacionPagos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();						
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;		
			//this.gridBagConstraintsPlaneacionPagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaneacionPagos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionPagos.gridx =0;
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaneacionPagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePlaneacionPagos = new PlaneacionPagosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Planeacion Pagos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Planeacion Pagos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeacion Pagos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PlaneacionPagosModel planeacionpagosModel=new PlaneacionPagosModel(this);
			
			//SI USARA CLASE INTERNA
			//PlaneacionPagosModel.PlaneacionPagosFocusTraversalPolicy planeacionpagosFocusTraversalPolicy = planeacionpagosModel.new PlaneacionPagosFocusTraversalPolicy(this);
			
			//planeacionpagosFocusTraversalPolicy.setplaneacionpagosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(planeacionpagosModel);
			
			
			this.jContentPaneDetallePlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePlaneacionPagos = new GridBagLayout();	
			this.jContentPaneDetallePlaneacionPagos.setLayout(gridaBagLayoutDetallePlaneacionPagos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaneacionPagos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPlaneacionPagos.gridx = 0;
					
				
				this.jContentPaneDetallePlaneacionPagos.add(jTtoolBarDetallePlaneacionPagos, gridBagConstraintsPlaneacionPagos);								
				
}
			
			this.jScrollPanelDatosEdicionPlaneacionPagos=   new JScrollPane(jContentPaneDetallePlaneacionPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaneacionPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPlaneacionPagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaneacionPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	        
			this.jContentPaneDetallePlaneacionPagos.add(jPanelCamposPlaneacionPagos, gridBagConstraintsPlaneacionPagos);
			
			
			
			
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
						//&& planeacionpagosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.planeacionpagosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPlaneacionPagos= new GridBagConstraints();
						this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPlaneacionPagos.gridx = 0;
						this.jContentPaneDetallePlaneacionPagos.add(this.jTabbedPaneRelacionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPlaneacionPagos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPlaneacionPagos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
					this.gridBagConstraintsPlaneacionPagos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPlaneacionPagos.gridx = 0;
					
				
					this.jContentPaneDetallePlaneacionPagos.add(jPanelCamposOcultosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);
				
					this.jPanelCamposOcultosPlaneacionPagos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	        this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePlaneacionPagos.add(this.jPanelAccionesFormularioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);							
			
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
	        this.gridBagConstraintsPlaneacionPagos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPlaneacionPagos.gridx = 0;
	        
			
			this.jContentPaneDetallePlaneacionPagos.add(this.jPanelAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPlaneacionPagos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPlaneacionPagos=   new JScrollPane(this.jPanelCamposPlaneacionPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaneacionPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaneacionPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPlaneacionPagos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPlaneacionPagos;//jContentPane;
		
		return jScrollPanelDatosEdicionPlaneacionPagos;
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
