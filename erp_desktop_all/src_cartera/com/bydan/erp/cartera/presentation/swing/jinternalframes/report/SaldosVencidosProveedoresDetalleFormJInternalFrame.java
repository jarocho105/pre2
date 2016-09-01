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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.SaldosVencidosProveedoresConstantesFunciones;

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
public class SaldosVencidosProveedoresDetalleFormJInternalFrame extends SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSaldosVencidosProveedores;
	
	protected JMenuBar jmenuBarDetalleSaldosVencidosProveedores;
	
	protected JMenu jmenuDetalleSaldosVencidosProveedores;
	protected JMenu jmenuDetalleArchivoSaldosVencidosProveedores;
	protected JMenu jmenuDetalleAccionesSaldosVencidosProveedores;
	protected JMenu jmenuDetalleDatosSaldosVencidosProveedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosVencidosProveedores;	
	protected GridBagConstraints gridBagConstraintsSaldosVencidosProveedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleSaldosVencidosProveedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public SaldosVencidosProveedoresSessionBean saldosvencidosproveedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public SaldosVencidosProveedoresLogic saldosvencidosproveedoresLogic;
	
	public JScrollPane jScrollPanelDatosSaldosVencidosProveedores;
	public JScrollPane jScrollPanelDatosEdicionSaldosVencidosProveedores;
	public JScrollPane jScrollPanelDatosGeneralSaldosVencidosProveedores;
	
	protected JPanel jPanelCamposSaldosVencidosProveedores;    
	protected JPanel jPanelCamposOcultosSaldosVencidosProveedores;    	
	protected JPanel jPanelAccionesSaldosVencidosProveedores;
	protected JPanel jPanelAccionesFormularioSaldosVencidosProveedores;
    
	
	
	protected Integer iXPanelCamposSaldosVencidosProveedores=0;
	protected Integer iYPanelCamposSaldosVencidosProveedores=0;
	
	protected Integer iXPanelCamposOcultosSaldosVencidosProveedores=0;
	protected Integer iYPanelCamposOcultosSaldosVencidosProveedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSaldosVencidosProveedores;
	public JButton jButtonModificarSaldosVencidosProveedores;
	public JButton jButtonActualizarSaldosVencidosProveedores;
    public JButton jButtonEliminarSaldosVencidosProveedores;
	public JButton jButtonCancelarSaldosVencidosProveedores;
    public JButton jButtonGuardarCambiosSaldosVencidosProveedores;
	public JButton jButtonGuardarCambiosTablaSaldosVencidosProveedores;
	protected JButton jButtonCerrarSaldosVencidosProveedores;
	
	
	protected JButton jButtonProcesarInformacionSaldosVencidosProveedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSaldosVencidosProveedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosVencidosProveedores;
	protected JButton jButtonModificarToolBarSaldosVencidosProveedores;
	protected JButton jButtonActualizarToolBarSaldosVencidosProveedores;
    protected JButton jButtonEliminarToolBarSaldosVencidosProveedores;
	protected JButton jButtonCancelarToolBarSaldosVencidosProveedores;
    protected JButton jButtonGuardarCambiosToolBarSaldosVencidosProveedores;
	protected JButton jButtonGuardarCambiosTablaToolBarSaldosVencidosProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosVencidosProveedores;
	protected JButton jButtonCerrarToolBarSaldosVencidosProveedores;
	
	protected JButton jButtonProcesarInformacionToolBarSaldosVencidosProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosVencidosProveedores;
	protected JMenuItem jMenuItemModificarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemActualizarSaldosVencidosProveedores;
    protected JMenuItem jMenuItemEliminarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemCancelarSaldosVencidosProveedores;
    protected JMenuItem jMenuItemGuardarCambiosSaldosVencidosProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosVencidosProveedores;
	protected JMenuItem jMenuItemCerrarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemDetalleCerrarSaldosVencidosProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosVencidosProveedores;
	
	protected JMenuItem jMenuItemProcesarInformacionSaldosVencidosProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosVencidosProveedores;
	protected JMenuItem jMenuItemMostrarOcultarSaldosVencidosProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosVencidosProveedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosVencidosProveedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSaldosVencidosProveedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSaldosVencidosProveedores;
	public JLabel jLabelIdSaldosVencidosProveedores;
	public JLabel jLabelidSaldosVencidosProveedores;
	public JButton jButtonidSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaSaldosVencidosProveedores;
	public JLabel jLabelnumero_facturaSaldosVencidosProveedores;
	public JTextField jTextFieldnumero_facturaSaldosVencidosProveedores;
	public JButton jButtonnumero_facturaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSaldosVencidosProveedores;
	public JLabel jLabelfecha_emisionSaldosVencidosProveedores;
	//public JFormattedTextField jDateChooserfecha_emisionSaldosVencidosProveedores;

	public JDateChooser jDateChooserfecha_emisionSaldosVencidosProveedores;
	public JButton jButtonfecha_emisionSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaSaldosVencidosProveedores;
	public JLabel jLabelfecha_ventaSaldosVencidosProveedores;
	//public JFormattedTextField jDateChooserfecha_ventaSaldosVencidosProveedores;

	public JDateChooser jDateChooserfecha_ventaSaldosVencidosProveedores;
	public JButton jButtonfecha_ventaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_monedaSaldosVencidosProveedores;
	public JLabel jLabelnombre_monedaSaldosVencidosProveedores;
	public JTextField jTextFieldnombre_monedaSaldosVencidosProveedores;
	public JButton jButtonnombre_monedaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelsaldoSaldosVencidosProveedores;
	public JLabel jLabelsaldoSaldosVencidosProveedores;
	public JTextField jTextFieldsaldoSaldosVencidosProveedores;
	public JButton jButtonsaldoSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_extraSaldosVencidosProveedores;
	public JLabel jLabelsaldo_extraSaldosVencidosProveedores;
	public JTextField jTextFieldsaldo_extraSaldosVencidosProveedores;
	public JButton jButtonsaldo_extraSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteSaldosVencidosProveedores;
	public JLabel jLabelnombre_clienteSaldosVencidosProveedores;
	public JTextArea jTextAreanombre_clienteSaldosVencidosProveedores;
	public JScrollPane jscrollPanenombre_clienteSaldosVencidosProveedores;
	public JButton jButtonnombre_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteSaldosVencidosProveedores;
	public JLabel jLabelnombre_grupo_clienteSaldosVencidosProveedores;
	public JTextArea jTextAreanombre_grupo_clienteSaldosVencidosProveedores;
	public JScrollPane jscrollPanenombre_grupo_clienteSaldosVencidosProveedores;
	public JButton jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSaldosVencidosProveedores;
	public JLabel jLabelid_empresaSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSaldosVencidosProveedores;
	public JButton jButtonid_empresaSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_empresaSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteSaldosVencidosProveedores;
	public JLabel jLabelid_grupo_clienteSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteSaldosVencidosProveedores;
	public JButton jButtonid_grupo_clienteSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaSaldosVencidosProveedores;
	public JLabel jLabelid_facturaSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaSaldosVencidosProveedores;
	public JButton jButtonid_facturaSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_facturaSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_facturaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaSaldosVencidosProveedores;
	public JLabel jLabelid_monedaSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaSaldosVencidosProveedores;
	public JButton jButtonid_monedaSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_monedaSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_monedaSaldosVencidosProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteSaldosVencidosProveedores;
	public JLabel jLabelid_clienteSaldosVencidosProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteSaldosVencidosProveedores;
	public JButton jButtonid_clienteSaldosVencidosProveedores= new JButtonMe();
	public JButton jButtonid_clienteSaldosVencidosProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSaldosVencidosProveedores;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSaldosVencidosProveedores=new JPanel();
				this.jPanelAccionesFormularioSaldosVencidosProveedores=new JPanel();
				this.jmenuBarDetalleSaldosVencidosProveedores=new JMenuBar();
				this.jTtoolBarDetalleSaldosVencidosProveedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SaldosVencidosProveedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosVencidosProveedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosVencidosProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSaldosVencidosProveedores() {
		return this.jButtonActualizarToolBarSaldosVencidosProveedores;
	}
	
	public JButton getjButtonEliminarToolBarSaldosVencidosProveedores() {
		return this.jButtonEliminarToolBarSaldosVencidosProveedores;
	}
	
	public JButton getjButtonCancelarToolBarSaldosVencidosProveedores() {
		return this.jButtonCancelarToolBarSaldosVencidosProveedores;
	}		
	
	public JButton getjButtonProcesarInformacionSaldosVencidosProveedores() {
		return this.jButtonProcesarInformacionSaldosVencidosProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosVencidosProveedores)	{
		this.jButtonProcesarInformacionSaldosVencidosProveedores = jButtonProcesarInformacionSaldosVencidosProveedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosVencidosProveedores() {
		return this.jComboBoxTiposAccionesSaldosVencidosProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposRelacionesSaldosVencidosProveedores) {
		this.jComboBoxTiposRelacionesSaldosVencidosProveedores = jComboBoxTiposRelacionesSaldosVencidosProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosVencidosProveedores(
			JComboBox jComboBoxTiposAccionesSaldosVencidosProveedores) {
		this.jComboBoxTiposAccionesSaldosVencidosProveedores = jComboBoxTiposAccionesSaldosVencidosProveedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSaldosVencidosProveedores() {
		return this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSaldosVencidosProveedores(
			JComboBox jComboBoxTiposAccionesFormularioSaldosVencidosProveedores) {
		this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores = jComboBoxTiposAccionesFormularioSaldosVencidosProveedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.saldosvencidosproveedoresSessionBean=new SaldosVencidosProveedoresSessionBean();
		
		this.saldosvencidosproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosvencidosproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosVencidosProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosVencidosProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Vencidos Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		SaldosVencidosProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSaldosVencidosProveedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSaldosVencidosProveedores=new JButtonMe();
				this.jButtonModificarToolBarSaldosVencidosProveedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores,
							"actualizar","actualizar","Actualizar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores,
							"eliminar","eliminar","Eliminar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores,
							"cancelar","cancelar","Cancelar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSaldosVencidosProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSaldosVencidosProveedores,this.jTtoolBarDetalleSaldosVencidosProveedores,
							"guardarcambios","guardarcambios","Guardar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSaldosVencidosProveedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSaldosVencidosProveedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSaldosVencidosProveedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSaldosVencidosProveedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSaldosVencidosProveedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosVencidosProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosVencidosProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosVencidosProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSaldosVencidosProveedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSaldosVencidosProveedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSaldosVencidosProveedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSaldosVencidosProveedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSaldosVencidosProveedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSaldosVencidosProveedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSaldosVencidosProveedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSaldosVencidosProveedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSaldosVencidosProveedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSaldosVencidosProveedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSaldosVencidosProveedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSaldosVencidosProveedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosVencidosProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosVencidosProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosVencidosProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosVencidosProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosVencidosProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSaldosVencidosProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSaldosVencidosProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSaldosVencidosProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosVencidosProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosVencidosProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosVencidosProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSaldosVencidosProveedores.add(this.jMenuItemDetalleCerrarSaldosVencidosProveedores);
		
		this.jmenuDetalleAccionesSaldosVencidosProveedores.add(this.jMenuItemActualizarSaldosVencidosProveedores);
		this.jmenuDetalleAccionesSaldosVencidosProveedores.add(this.jMenuItemEliminarSaldosVencidosProveedores);
		this.jmenuDetalleAccionesSaldosVencidosProveedores.add(this.jMenuItemCancelarSaldosVencidosProveedores);		
		
		//this.jmenuDetalleDatosSaldosVencidosProveedores.add(this.jMenuItemDetalleAbrirOrderBySaldosVencidosProveedores);				
		this.jmenuDetalleDatosSaldosVencidosProveedores.add(this.jMenuItemDetalleMostarOcultarSaldosVencidosProveedores);				
				
		//this.jmenuDetalleAccionesSaldosVencidosProveedores.add(this.jMenuItemGuardarCambiosSaldosVencidosProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSaldosVencidosProveedores.add(this.jmenuDetalleArchivoSaldosVencidosProveedores);		
		this.jmenuBarDetalleSaldosVencidosProveedores.add(this.jmenuDetalleAccionesSaldosVencidosProveedores);		
		this.jmenuBarDetalleSaldosVencidosProveedores.add(this.jmenuDetalleDatosSaldosVencidosProveedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSaldosVencidosProveedores);				
	}
	
	
	public void inicializarElementosCamposSaldosVencidosProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSaldosVencidosProveedores = new JLabelMe();
		jLabelIdSaldosVencidosProveedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSaldosVencidosProveedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSaldosVencidosProveedores= new GridBagLayout();

		this.jPanelidSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);

		jLabelidSaldosVencidosProveedores = new JLabel();
		jLabelidSaldosVencidosProveedores.setText("Id");

		jLabelidSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelnumero_facturaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaSaldosVencidosProveedores.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelnumero_facturaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextFieldnumero_facturaSaldosVencidosProveedores= new JTextFieldMe();

		jTextFieldnumero_facturaSaldosVencidosProveedores.setEnabled(false);
		jTextFieldnumero_facturaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSaldosVencidosProveedores = new JLabelMe();
		this.jLabelfecha_emisionSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSaldosVencidosProveedores.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelfecha_emisionSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		//jFormattedTextFieldfecha_emisionSaldosVencidosProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSaldosVencidosProveedores= new JDateChooser();
		jDateChooserfecha_emisionSaldosVencidosProveedores.setEnabled(false);
		jDateChooserfecha_emisionSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSaldosVencidosProveedores.setDate(new Date());
		jDateChooserfecha_emisionSaldosVencidosProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSaldosVencidosProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ventaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelfecha_ventaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaSaldosVencidosProveedores.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelfecha_ventaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		//jFormattedTextFieldfecha_ventaSaldosVencidosProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaSaldosVencidosProveedores= new JDateChooser();
		jDateChooserfecha_ventaSaldosVencidosProveedores.setEnabled(false);
		jDateChooserfecha_ventaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaSaldosVencidosProveedores.setDate(new Date());
		jDateChooserfecha_ventaSaldosVencidosProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaSaldosVencidosProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_monedaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelnombre_monedaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA+" : *");
		this.jLabelnombre_monedaSaldosVencidosProveedores.setToolTipText("Nombre Moneda");
		this.jLabelnombre_monedaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_monedaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_monedaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_monedaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREMONEDA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelnombre_monedaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextFieldnombre_monedaSaldosVencidosProveedores= new JTextFieldMe();

		jTextFieldnombre_monedaSaldosVencidosProveedores.setEnabled(false);
		jTextFieldnombre_monedaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_monedaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_monedaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_monedaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_monedaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_monedaSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelsaldoSaldosVencidosProveedores = new JLabelMe();
		this.jLabelsaldoSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoSaldosVencidosProveedores.setToolTipText("Saldo");
		this.jLabelsaldoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelsaldoSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextFieldsaldoSaldosVencidosProveedores= new JTextFieldMe();
		jTextFieldsaldoSaldosVencidosProveedores.setEnabled(false);
		jTextFieldsaldoSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoSaldosVencidosProveedores.setText("0.0");

		this.jButtonsaldoSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_extraSaldosVencidosProveedores = new JLabelMe();
		this.jLabelsaldo_extraSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA+" : *");
		this.jLabelsaldo_extraSaldosVencidosProveedores.setToolTipText("Saldo Extra");
		this.jLabelsaldo_extraSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_extraSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_extraSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_extraSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_extraSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_extraSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_SALDOEXTRA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelsaldo_extraSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextFieldsaldo_extraSaldosVencidosProveedores= new JTextFieldMe();
		jTextFieldsaldo_extraSaldosVencidosProveedores.setEnabled(false);
		jTextFieldsaldo_extraSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_extraSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_extraSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_extraSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_extraSaldosVencidosProveedores.setText("0.0");

		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_extraSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_extraSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_extraSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_extraSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteSaldosVencidosProveedores = new JLabelMe();
		this.jLabelnombre_clienteSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteSaldosVencidosProveedores.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelnombre_clienteSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextAreanombre_clienteSaldosVencidosProveedores= new JTextAreaMe();
		jTextAreanombre_clienteSaldosVencidosProveedores.setEnabled(false);
		jTextAreanombre_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteSaldosVencidosProveedores.setLineWrap(true);
		jTextAreanombre_clienteSaldosVencidosProveedores.setWrapStyleWord(true);
		jTextAreanombre_clienteSaldosVencidosProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteSaldosVencidosProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteSaldosVencidosProveedores = new JScrollPane(jTextAreanombre_clienteSaldosVencidosProveedores);
		jscrollPanenombre_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteSaldosVencidosProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores = new JLabelMe();
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelnombre_grupo_clienteSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jTextAreanombre_grupo_clienteSaldosVencidosProveedores= new JTextAreaMe();
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setEnabled(false);
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setLineWrap(true);
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteSaldosVencidosProveedores = new JScrollPane(jTextAreanombre_grupo_clienteSaldosVencidosProveedores);
		jscrollPanenombre_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSaldosVencidosProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelid_empresaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSaldosVencidosProveedores.setToolTipText("Empresa");
		this.jLabelid_empresaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelid_empresaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jComboBoxid_empresaSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_empresaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSaldosVencidosProveedores.setEnabled(false);

		this.jButtonid_empresaSaldosVencidosProveedores= new JButtonMe();
		this.jButtonid_empresaSaldosVencidosProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosVencidosProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosVencidosProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosVencidosProveedores.setText("Buscar");
		this.jButtonid_empresaSaldosVencidosProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSaldosVencidosProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosVencidosProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosVencidosProveedores"));

		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSaldosVencidosProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaSaldosVencidosProveedoresUpdate= new JButtonMe();
		this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setText("U");
		this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSaldosVencidosProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosVencidosProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosVencidosProveedoresUpdate"));



					
		this.jLabelid_grupo_clienteSaldosVencidosProveedores = new JLabelMe();
		this.jLabelid_grupo_clienteSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteSaldosVencidosProveedores.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelid_grupo_clienteSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jComboBoxid_grupo_clienteSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteSaldosVencidosProveedores= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setText("Buscar");
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteSaldosVencidosProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosVencidosProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosVencidosProveedores"));

		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setText("U");
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosVencidosProveedoresUpdate"));



					
		this.jLabelid_facturaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelid_facturaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaSaldosVencidosProveedores.setToolTipText("Factura");
		this.jLabelid_facturaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelid_facturaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jComboBoxid_facturaSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_facturaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaSaldosVencidosProveedores= new JButtonMe();
		this.jButtonid_facturaSaldosVencidosProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaSaldosVencidosProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaSaldosVencidosProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaSaldosVencidosProveedores.setText("Buscar");
		this.jButtonid_facturaSaldosVencidosProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaSaldosVencidosProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaSaldosVencidosProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaSaldosVencidosProveedores"));

		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaSaldosVencidosProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_facturaSaldosVencidosProveedoresUpdate= new JButtonMe();
		this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setText("U");
		this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaSaldosVencidosProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaSaldosVencidosProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaSaldosVencidosProveedoresUpdate"));



					
		this.jLabelid_monedaSaldosVencidosProveedores = new JLabelMe();
		this.jLabelid_monedaSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaSaldosVencidosProveedores.setToolTipText("Moneda");
		this.jLabelid_monedaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelid_monedaSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jComboBoxid_monedaSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_monedaSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaSaldosVencidosProveedores= new JButtonMe();
		this.jButtonid_monedaSaldosVencidosProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaSaldosVencidosProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaSaldosVencidosProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaSaldosVencidosProveedores.setText("Buscar");
		this.jButtonid_monedaSaldosVencidosProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaSaldosVencidosProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaSaldosVencidosProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaSaldosVencidosProveedores"));

		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaSaldosVencidosProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_monedaSaldosVencidosProveedoresUpdate= new JButtonMe();
		this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setText("U");
		this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaSaldosVencidosProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaSaldosVencidosProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaSaldosVencidosProveedoresUpdate"));



					
		this.jLabelid_clienteSaldosVencidosProveedores = new JLabelMe();
		this.jLabelid_clienteSaldosVencidosProveedores.setText(""+SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteSaldosVencidosProveedores.setToolTipText("Cliente");
		this.jLabelid_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteSaldosVencidosProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteSaldosVencidosProveedores.setToolTipText(SaldosVencidosProveedoresConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		this.jPanelid_clienteSaldosVencidosProveedores.setLayout(this.gridaBagLayoutSaldosVencidosProveedores);


		jComboBoxid_clienteSaldosVencidosProveedores= new JComboBoxMe();
		jComboBoxid_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteSaldosVencidosProveedores= new JButtonMe();
		this.jButtonid_clienteSaldosVencidosProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosVencidosProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosVencidosProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosVencidosProveedores.setText("Buscar");
		this.jButtonid_clienteSaldosVencidosProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteSaldosVencidosProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosVencidosProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosVencidosProveedores"));

		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda= new JButtonMe();
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setText("U");
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosVencidosProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosVencidosProveedoresBusqueda"));

		if(this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteSaldosVencidosProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_clienteSaldosVencidosProveedoresUpdate= new JButtonMe();
		this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setText("U");
		this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteSaldosVencidosProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosVencidosProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteSaldosVencidosProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosVencidosProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosVencidosProveedoresUpdate"));



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
		//this.jInternalFrameDetalleSaldosVencidosProveedores = new SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Saldos Vencidos Proveedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosVencidosProveedores= new GridBagLayout();
		

		
		String sToolTipSaldosVencidosProveedores="";
		sToolTipSaldosVencidosProveedores=SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosVencidosProveedores+="(Cartera.SaldosVencidosProveedores)";
		}
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosVencidosProveedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSaldosVencidosProveedores = new JButtonMe();
		this.jButtonModificarSaldosVencidosProveedores = new JButtonMe();
        this.jButtonActualizarSaldosVencidosProveedores = new JButtonMe();
        this.jButtonEliminarSaldosVencidosProveedores = new JButtonMe();
        this.jButtonCancelarSaldosVencidosProveedores = new JButtonMe();
        this.jButtonGuardarCambiosSaldosVencidosProveedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores = new JButtonMe();
		this.jButtonCerrarSaldosVencidosProveedores = new JButtonMe();
		
		this.jScrollPanelDatosSaldosVencidosProveedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionSaldosVencidosProveedores = new JScrollPane();
		this.jScrollPanelDatosGeneralSaldosVencidosProveedores = new JScrollPane();
				
		
		
		this.jPanelCamposSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Vencidos Proveedores";
		
		if(!this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Vencidos Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosVencidosProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSaldosVencidosProveedores.setName("jPanelCamposSaldosVencidosProveedores"); 

		this.jPanelCamposOcultosSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSaldosVencidosProveedores.setName("jPanelCamposOcultosSaldosVencidosProveedores"); 

        this.jPanelAccionesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosVencidosProveedores.setToolTipText("Acciones");
        this.jPanelAccionesSaldosVencidosProveedores.setName("Acciones"); 

		this.jPanelAccionesFormularioSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSaldosVencidosProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSaldosVencidosProveedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSaldosVencidosProveedores.setText("Nuevo");
		this.jButtonModificarSaldosVencidosProveedores.setText("Editar");
        this.jButtonActualizarSaldosVencidosProveedores.setText("Actualizar");
        this.jButtonEliminarSaldosVencidosProveedores.setText("Eliminar");
        this.jButtonCancelarSaldosVencidosProveedores.setText("Cancelar");
        this.jButtonGuardarCambiosSaldosVencidosProveedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setText("Guardar");
		this.jButtonCerrarSaldosVencidosProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosVencidosProveedores,"nuevo_button","Nuevo",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSaldosVencidosProveedores,"modificar_button","Editar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSaldosVencidosProveedores,"actualizar_button","Actualizar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSaldosVencidosProveedores,"eliminar_button","Eliminar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSaldosVencidosProveedores,"cancelar_button","Cancelar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSaldosVencidosProveedores,"guardarcambios_button","Guardar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosVencidosProveedores,"guardarcambiostabla_button","Guardar",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosVencidosProveedores,"cerrar_button","Salir",this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSaldosVencidosProveedores.setToolTipText("Nuevo"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSaldosVencidosProveedores.setToolTipText("Editar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSaldosVencidosProveedores.setToolTipText("Actualizar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSaldosVencidosProveedores.setToolTipText("Eliminar)"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSaldosVencidosProveedores.setToolTipText("Cancelar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSaldosVencidosProveedores.setToolTipText("Guardar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.setToolTipText("Guardar"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosVencidosProveedores.setToolTipText("Salir"+" "+SaldosVencidosProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosVencidosProveedores";
		inputMap = this.jButtonNuevoSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosVencidosProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosVencidosProveedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSaldosVencidosProveedores";
		inputMap = this.jButtonActualizarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSaldosVencidosProveedores"));
		
		//ELIMINAR
		sMapKey = "EliminarSaldosVencidosProveedores";
		inputMap = this.jButtonEliminarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSaldosVencidosProveedores"));
		
		//CANCELAR	
		sMapKey = "CancelarSaldosVencidosProveedores";
		inputMap = this.jButtonCancelarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSaldosVencidosProveedores"));
		
		//CERRAR		
		sMapKey = "CerrarSaldosVencidosProveedores";
		inputMap = this.jButtonCerrarSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosVencidosProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosVencidosProveedores";
		inputMap = this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosVencidosProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosVencidosProveedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSaldosVencidosProveedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSaldosVencidosProveedores.setToolTipText("Nuevo SaldosVencidosProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores.setToolTipText("Sin Cerrar Ventana SaldosVencidosProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosVencidosProveedores.setText("Accion");
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSaldosVencidosProveedores = new JLabelMe();
		
		this.jLabelAccionesSaldosVencidosProveedores.setText("Acciones");		
		this.jLabelAccionesSaldosVencidosProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosVencidosProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosVencidosProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSaldosVencidosProveedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSaldosVencidosProveedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSaldosVencidosProveedores=new JTabbedPane();
		this.jTabbedPaneRelacionesSaldosVencidosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSaldosVencidosProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSaldosVencidosProveedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSaldosVencidosProveedores = new GridBagLayout();
		
		this.jPanelCamposSaldosVencidosProveedores.setLayout(gridaBagLayoutCamposSaldosVencidosProveedores);
		this.jPanelCamposOcultosSaldosVencidosProveedores.setLayout(gridaBagLayoutCamposOcultosSaldosVencidosProveedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSaldosVencidosProveedores.add(jLabelIdSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSaldosVencidosProveedores.add(jLabelidSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSaldosVencidosProveedores.add(jLabelid_empresaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosVencidosProveedores.add(jButtonid_empresaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 3;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosVencidosProveedores.add(jButtonid_empresaSaldosVencidosProveedoresUpdate, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSaldosVencidosProveedores.add(jComboBoxid_empresaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteSaldosVencidosProveedores.add(jLabelid_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteSaldosVencidosProveedores.add(jButtonid_grupo_clienteSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 3;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteSaldosVencidosProveedores.add(jButtonid_grupo_clienteSaldosVencidosProveedoresUpdate, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteSaldosVencidosProveedores.add(jComboBoxid_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaSaldosVencidosProveedores.add(jLabelid_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaSaldosVencidosProveedores.add(jButtonid_facturaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 3;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaSaldosVencidosProveedores.add(jButtonid_facturaSaldosVencidosProveedoresUpdate, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaSaldosVencidosProveedores.add(jComboBoxid_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaSaldosVencidosProveedores.add(jLabelid_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaSaldosVencidosProveedores.add(jButtonid_monedaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 3;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaSaldosVencidosProveedores.add(jButtonid_monedaSaldosVencidosProveedoresUpdate, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaSaldosVencidosProveedores.add(jComboBoxid_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteSaldosVencidosProveedores.add(jLabelid_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSaldosVencidosProveedores.add(jButtonid_clienteSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 3;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSaldosVencidosProveedores.add(jButtonid_clienteSaldosVencidosProveedoresUpdate, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteSaldosVencidosProveedores.add(jComboBoxid_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaSaldosVencidosProveedores.add(jLabelnumero_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaSaldosVencidosProveedores.add(jButtonnumero_facturaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaSaldosVencidosProveedores.add(jTextFieldnumero_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSaldosVencidosProveedores.add(jLabelfecha_emisionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSaldosVencidosProveedores.add(jButtonfecha_emisionSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSaldosVencidosProveedores.add(jDateChooserfecha_emisionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaSaldosVencidosProveedores.add(jLabelfecha_ventaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaSaldosVencidosProveedores.add(jButtonfecha_ventaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaSaldosVencidosProveedores.add(jDateChooserfecha_ventaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_monedaSaldosVencidosProveedores.add(jLabelnombre_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_monedaSaldosVencidosProveedores.add(jButtonnombre_monedaSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_monedaSaldosVencidosProveedores.add(jTextFieldnombre_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoSaldosVencidosProveedores.add(jLabelsaldoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoSaldosVencidosProveedores.add(jButtonsaldoSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoSaldosVencidosProveedores.add(jTextFieldsaldoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_extraSaldosVencidosProveedores.add(jLabelsaldo_extraSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_extraSaldosVencidosProveedores.add(jButtonsaldo_extraSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_extraSaldosVencidosProveedores.add(jTextFieldsaldo_extraSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteSaldosVencidosProveedores.add(jLabelnombre_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteSaldosVencidosProveedores.add(jButtonnombre_clienteSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteSaldosVencidosProveedores.add(jscrollPanenombre_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteSaldosVencidosProveedores.add(jLabelnombre_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 2;
		this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteSaldosVencidosProveedores.add(jButtonnombre_grupo_clienteSaldosVencidosProveedoresBusqueda, this.gridBagConstraintsSaldosVencidosProveedores);
	}

	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = 1;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteSaldosVencidosProveedores.add(jscrollPanenombre_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelidSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelid_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelid_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelid_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelid_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelnumero_facturaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelfecha_emisionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelfecha_ventaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelnombre_monedaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelsaldoSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelsaldo_extraSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelnombre_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosVencidosProveedores.add(this.jPanelnombre_grupo_clienteSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposSaldosVencidosProveedores % 2==0) {
		iXPanelCamposSaldosVencidosProveedores=0;
		iYPanelCamposSaldosVencidosProveedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosVencidosProveedores.gridy = iYPanelCamposOcultosSaldosVencidosProveedores;
	this.gridBagConstraintsSaldosVencidosProveedores.gridx = iXPanelCamposOcultosSaldosVencidosProveedores++;
	this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosVencidosProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosVencidosProveedores.add(this.jPanelid_empresaSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);



	if(iXPanelCamposOcultosSaldosVencidosProveedores % 2==0) {
		iXPanelCamposOcultosSaldosVencidosProveedores=0;
		iYPanelCamposOcultosSaldosVencidosProveedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesSaldosVencidosProveedores= new GridBagLayout();
		this.jPanelAccionesSaldosVencidosProveedores.setLayout(gridaBagLayoutAccionesSaldosVencidosProveedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSaldosVencidosProveedores= new GridBagLayout();
		this.jPanelAccionesFormularioSaldosVencidosProveedores.setLayout(gridaBagLayoutAccionesFormularioSaldosVencidosProveedores);
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldosVencidosProveedores.add(this.jComboBoxTiposAccionesFormularioSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonModificarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);							

		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonEliminarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonActualizarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);


		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonGuardarCambiosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);	
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = 0;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesSaldosVencidosProveedores.add(this.jButtonCancelarSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosVencidosProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosVencidosProveedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldosvencidosproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();						
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;		
			//this.gridBagConstraintsSaldosVencidosProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosVencidosProveedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =0;
		this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosVencidosProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SaldosVencidosProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSaldosVencidosProveedores = new SaldosVencidosProveedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Saldos Vencidos Proveedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Saldos Vencidos Proveedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Vencidos Proveedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SaldosVencidosProveedoresModel saldosvencidosproveedoresModel=new SaldosVencidosProveedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//SaldosVencidosProveedoresModel.SaldosVencidosProveedoresFocusTraversalPolicy saldosvencidosproveedoresFocusTraversalPolicy = saldosvencidosproveedoresModel.new SaldosVencidosProveedoresFocusTraversalPolicy(this);
			
			//saldosvencidosproveedoresFocusTraversalPolicy.setsaldosvencidosproveedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(saldosvencidosproveedoresModel);
			
			
			this.jContentPaneDetalleSaldosVencidosProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSaldosVencidosProveedores = new GridBagLayout();	
			this.jContentPaneDetalleSaldosVencidosProveedores.setLayout(gridaBagLayoutDetalleSaldosVencidosProveedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosVencidosProveedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
				this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
					
				
				this.jContentPaneDetalleSaldosVencidosProveedores.add(jTtoolBarDetalleSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);								
				
}
			
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores=   new JScrollPane(jContentPaneDetalleSaldosVencidosProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	        
			this.jContentPaneDetalleSaldosVencidosProveedores.add(jPanelCamposSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);
			
			
			
			
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
						//&& saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.saldosvencidosproveedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSaldosVencidosProveedores= new GridBagConstraints();
						this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
						this.jContentPaneDetalleSaldosVencidosProveedores.add(this.jTabbedPaneRelacionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSaldosVencidosProveedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSaldosVencidosProveedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
					this.gridBagConstraintsSaldosVencidosProveedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
					
				
					this.jContentPaneDetalleSaldosVencidosProveedores.add(jPanelCamposOcultosSaldosVencidosProveedores, gridBagConstraintsSaldosVencidosProveedores);
				
					this.jPanelCamposOcultosSaldosVencidosProveedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	        this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSaldosVencidosProveedores.add(this.jPanelAccionesFormularioSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);							
			
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
	        this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
	        
			
			this.jContentPaneDetalleSaldosVencidosProveedores.add(this.jPanelAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSaldosVencidosProveedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores=   new JScrollPane(this.jPanelCamposSaldosVencidosProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosVencidosProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
			this.gridBagConstraintsSaldosVencidosProveedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSaldosVencidosProveedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSaldosVencidosProveedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);			
			
			this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
			this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
			
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		
			
		this.gridBagConstraintsSaldosVencidosProveedores = new GridBagConstraints();
		this.gridBagConstraintsSaldosVencidosProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosVencidosProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosVencidosProveedores, this.gridBagConstraintsSaldosVencidosProveedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSaldosVencidosProveedores;//jContentPane;
		
		return jScrollPanelDatosEdicionSaldosVencidosProveedores;
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
