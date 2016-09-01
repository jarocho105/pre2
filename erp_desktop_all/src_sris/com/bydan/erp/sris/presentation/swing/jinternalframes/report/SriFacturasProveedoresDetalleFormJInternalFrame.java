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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriFacturasProveedoresConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriFacturasProveedoresDetalleFormJInternalFrame extends SriFacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSriFacturasProveedores;
	
	protected JMenuBar jmenuBarDetalleSriFacturasProveedores;
	
	protected JMenu jmenuDetalleSriFacturasProveedores;
	protected JMenu jmenuDetalleArchivoSriFacturasProveedores;
	protected JMenu jmenuDetalleAccionesSriFacturasProveedores;
	protected JMenu jmenuDetalleDatosSriFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsSriFacturasProveedores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriFacturasProveedoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleSriFacturasProveedores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public SriFacturasProveedoresSessionBean srifacturasproveedoresSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;	
	
	public SriFacturasProveedoresLogic srifacturasproveedoresLogic;
	
	public JScrollPane jScrollPanelDatosSriFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionSriFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralSriFacturasProveedores;
	
	protected JPanel jPanelCamposSriFacturasProveedores;    
	protected JPanel jPanelCamposOcultosSriFacturasProveedores;    	
	protected JPanel jPanelAccionesSriFacturasProveedores;
	protected JPanel jPanelAccionesFormularioSriFacturasProveedores;
    
	
	
	protected Integer iXPanelCamposSriFacturasProveedores=0;
	protected Integer iYPanelCamposSriFacturasProveedores=0;
	
	protected Integer iXPanelCamposOcultosSriFacturasProveedores=0;
	protected Integer iYPanelCamposOcultosSriFacturasProveedores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSriFacturasProveedores;
	public JButton jButtonModificarSriFacturasProveedores;
	public JButton jButtonActualizarSriFacturasProveedores;
    public JButton jButtonEliminarSriFacturasProveedores;
	public JButton jButtonCancelarSriFacturasProveedores;
    public JButton jButtonGuardarCambiosSriFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaSriFacturasProveedores;
	protected JButton jButtonCerrarSriFacturasProveedores;
	
	
	protected JButton jButtonProcesarInformacionSriFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSriFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSriFacturasProveedores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSriFacturasProveedores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriFacturasProveedores;
	protected JButton jButtonModificarToolBarSriFacturasProveedores;
	protected JButton jButtonActualizarToolBarSriFacturasProveedores;
    protected JButton jButtonEliminarToolBarSriFacturasProveedores;
	protected JButton jButtonCancelarToolBarSriFacturasProveedores;
    protected JButton jButtonGuardarCambiosToolBarSriFacturasProveedores;
	protected JButton jButtonGuardarCambiosTablaToolBarSriFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarSriFacturasProveedores;
	protected JButton jButtonCerrarToolBarSriFacturasProveedores;
	
	protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriFacturasProveedores;
	protected JMenuItem jMenuItemModificarSriFacturasProveedores;
	protected JMenuItem jMenuItemActualizarSriFacturasProveedores;
    protected JMenuItem jMenuItemEliminarSriFacturasProveedores;
	protected JMenuItem jMenuItemCancelarSriFacturasProveedores;
    protected JMenuItem jMenuItemGuardarCambiosSriFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriFacturasProveedores;
	protected JMenuItem jMenuItemCerrarSriFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarSriFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriFacturasProveedores;
	
	protected JMenuItem jMenuItemProcesarInformacionSriFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarSriFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriFacturasProveedores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriFacturasProveedores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSriFacturasProveedores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSriFacturasProveedores;
	public JLabel jLabelIdSriFacturasProveedores;
	public JLabel jLabelidSriFacturasProveedores;
	public JButton jButtonidSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeSriFacturasProveedores;
	public JLabel jLabelfecha_emision_desdeSriFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_desdeSriFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_desdeSriFacturasProveedores;
	public JButton jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaSriFacturasProveedores;
	public JLabel jLabelfecha_emision_hastaSriFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emision_hastaSriFacturasProveedores;

	public JDateChooser jDateChooserfecha_emision_hastaSriFacturasProveedores;
	public JButton jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionSriFacturasProveedores;
	public JLabel jLabelidentificacionSriFacturasProveedores;
	public JTextField jTextFieldidentificacionSriFacturasProveedores;
	public JButton jButtonidentificacionSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombreSriFacturasProveedores;
	public JLabel jLabelnombreSriFacturasProveedores;
	public JTextArea jTextAreanombreSriFacturasProveedores;
	public JScrollPane jscrollPanenombreSriFacturasProveedores;
	public JButton jButtonnombreSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelrucSriFacturasProveedores;
	public JLabel jLabelrucSriFacturasProveedores;
	public JTextField jTextFieldrucSriFacturasProveedores;
	public JButton jButtonrucSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_moduloSriFacturasProveedores;
	public JLabel jLabelnombre_moduloSriFacturasProveedores;
	public JTextArea jTextAreanombre_moduloSriFacturasProveedores;
	public JScrollPane jscrollPanenombre_moduloSriFacturasProveedores;
	public JButton jButtonnombre_moduloSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteSriFacturasProveedores;
	public JLabel jLabelnombre_completo_clienteSriFacturasProveedores;
	public JTextArea jTextAreanombre_completo_clienteSriFacturasProveedores;
	public JScrollPane jscrollPanenombre_completo_clienteSriFacturasProveedores;
	public JButton jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionSriFacturasProveedores;
	public JLabel jLabelnombre_transaccionSriFacturasProveedores;
	public JTextArea jTextAreanombre_transaccionSriFacturasProveedores;
	public JScrollPane jscrollPanenombre_transaccionSriFacturasProveedores;
	public JButton jButtonnombre_transaccionSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asiento_contableSriFacturasProveedores;
	public JLabel jLabelcodigo_asiento_contableSriFacturasProveedores;
	public JTextField jTextFieldcodigo_asiento_contableSriFacturasProveedores;
	public JButton jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSriFacturasProveedores;
	public JLabel jLabelfecha_emisionSriFacturasProveedores;
	//public JFormattedTextField jDateChooserfecha_emisionSriFacturasProveedores;

	public JDateChooser jDateChooserfecha_emisionSriFacturasProveedores;
	public JButton jButtonfecha_emisionSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaSriFacturasProveedores;
	public JLabel jLabelnumero_facturaSriFacturasProveedores;
	public JTextField jTextFieldnumero_facturaSriFacturasProveedores;
	public JButton jButtonnumero_facturaSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localSriFacturasProveedores;
	public JLabel jLabelcredito_mone_localSriFacturasProveedores;
	public JTextField jTextFieldcredito_mone_localSriFacturasProveedores;
	public JButton jButtoncredito_mone_localSriFacturasProveedoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSriFacturasProveedores;
	public JLabel jLabelid_empresaSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSriFacturasProveedores;
	public JButton jButtonid_empresaSriFacturasProveedores= new JButtonMe();
	public JButton jButtonid_empresaSriFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaSriFacturasProveedoresBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionSriFacturasProveedores;
	public JLabel jLabelid_transaccionSriFacturasProveedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionSriFacturasProveedores;
	public JButton jButtonid_transaccionSriFacturasProveedores= new JButtonMe();
	public JButton jButtonid_transaccionSriFacturasProveedoresUpdate= new JButtonMe();
	public JButton jButtonid_transaccionSriFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSriFacturasProveedores;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriFacturasProveedoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSriFacturasProveedores=new JPanel();
				this.jPanelAccionesFormularioSriFacturasProveedores=new JPanel();
				this.jmenuBarDetalleSriFacturasProveedores=new JMenuBar();
				this.jTtoolBarDetalleSriFacturasProveedores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriFacturasProveedoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSriFacturasProveedores() {
		return this.jButtonActualizarToolBarSriFacturasProveedores;
	}
	
	public JButton getjButtonEliminarToolBarSriFacturasProveedores() {
		return this.jButtonEliminarToolBarSriFacturasProveedores;
	}
	
	public JButton getjButtonCancelarToolBarSriFacturasProveedores() {
		return this.jButtonCancelarToolBarSriFacturasProveedores;
	}		
	
	public JButton getjButtonProcesarInformacionSriFacturasProveedores() {
		return this.jButtonProcesarInformacionSriFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriFacturasProveedores)	{
		this.jButtonProcesarInformacionSriFacturasProveedores = jButtonProcesarInformacionSriFacturasProveedores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriFacturasProveedores() {
		return this.jComboBoxTiposAccionesSriFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesSriFacturasProveedores) {
		this.jComboBoxTiposRelacionesSriFacturasProveedores = jComboBoxTiposRelacionesSriFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriFacturasProveedores(
			JComboBox jComboBoxTiposAccionesSriFacturasProveedores) {
		this.jComboBoxTiposAccionesSriFacturasProveedores = jComboBoxTiposAccionesSriFacturasProveedores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSriFacturasProveedores() {
		return this.jComboBoxTiposAccionesFormularioSriFacturasProveedores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSriFacturasProveedores(
			JComboBox jComboBoxTiposAccionesFormularioSriFacturasProveedores) {
		this.jComboBoxTiposAccionesFormularioSriFacturasProveedores = jComboBoxTiposAccionesFormularioSriFacturasProveedores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
		
		this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srifacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriFacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
	
		SriFacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSriFacturasProveedores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSriFacturasProveedores=new JButtonMe();
				this.jButtonModificarToolBarSriFacturasProveedores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores,
							"actualizar","actualizar","Actualizar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores,
							"eliminar","eliminar","Eliminar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores,
							"cancelar","cancelar","Cancelar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSriFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores,
							"guardarcambios","guardarcambios","Guardar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSriFacturasProveedores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSriFacturasProveedores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSriFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSriFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSriFacturasProveedores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSriFacturasProveedores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSriFacturasProveedores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSriFacturasProveedores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSriFacturasProveedores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSriFacturasProveedores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSriFacturasProveedores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSriFacturasProveedores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSriFacturasProveedores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSriFacturasProveedores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSriFacturasProveedores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSriFacturasProveedores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSriFacturasProveedores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSriFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSriFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSriFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSriFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSriFacturasProveedores.add(this.jMenuItemDetalleCerrarSriFacturasProveedores);
		
		this.jmenuDetalleAccionesSriFacturasProveedores.add(this.jMenuItemActualizarSriFacturasProveedores);
		this.jmenuDetalleAccionesSriFacturasProveedores.add(this.jMenuItemEliminarSriFacturasProveedores);
		this.jmenuDetalleAccionesSriFacturasProveedores.add(this.jMenuItemCancelarSriFacturasProveedores);		
		
		//this.jmenuDetalleDatosSriFacturasProveedores.add(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores);				
		this.jmenuDetalleDatosSriFacturasProveedores.add(this.jMenuItemDetalleMostarOcultarSriFacturasProveedores);				
				
		//this.jmenuDetalleAccionesSriFacturasProveedores.add(this.jMenuItemGuardarCambiosSriFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSriFacturasProveedores.add(this.jmenuDetalleArchivoSriFacturasProveedores);		
		this.jmenuBarDetalleSriFacturasProveedores.add(this.jmenuDetalleAccionesSriFacturasProveedores);		
		this.jmenuBarDetalleSriFacturasProveedores.add(this.jmenuDetalleDatosSriFacturasProveedores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSriFacturasProveedores);				
	}
	
	
	public void inicializarElementosCamposSriFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSriFacturasProveedores = new JLabelMe();
		jLabelIdSriFacturasProveedores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSriFacturasProveedores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSriFacturasProveedores= new GridBagLayout();

		this.jPanelidSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);

		jLabelidSriFacturasProveedores = new JLabel();
		jLabelidSriFacturasProveedores.setText("Id");

		jLabelidSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeSriFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emision_desdeSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeSriFacturasProveedores.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emision_desdeSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		//jFormattedTextFieldfecha_emision_desdeSriFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeSriFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_desdeSriFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeSriFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaSriFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emision_hastaSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaSriFacturasProveedores.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emision_hastaSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		//jFormattedTextFieldfecha_emision_hastaSriFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaSriFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emision_hastaSriFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaSriFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelidentificacionSriFacturasProveedores = new JLabelMe();
		this.jLabelidentificacionSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionSriFacturasProveedores.setToolTipText("Identificacion");
		this.jLabelidentificacionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelidentificacionSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextFieldidentificacionSriFacturasProveedores= new JTextFieldMe();

		jTextFieldidentificacionSriFacturasProveedores.setEnabled(false);
		jTextFieldidentificacionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombreSriFacturasProveedores = new JLabelMe();
		this.jLabelnombreSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSriFacturasProveedores.setToolTipText("Nombre");
		this.jLabelnombreSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelnombreSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextAreanombreSriFacturasProveedores= new JTextAreaMe();
		jTextAreanombreSriFacturasProveedores.setEnabled(false);
		jTextAreanombreSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSriFacturasProveedores.setLineWrap(true);
		jTextAreanombreSriFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombreSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSriFacturasProveedores.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSriFacturasProveedores = new JScrollPane(jTextAreanombreSriFacturasProveedores);
		jscrollPanenombreSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombreSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombreSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelrucSriFacturasProveedores = new JLabelMe();
		this.jLabelrucSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSriFacturasProveedores.setToolTipText("Ruc");
		this.jLabelrucSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelrucSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextFieldrucSriFacturasProveedores= new JTextFieldMe();

		jTextFieldrucSriFacturasProveedores.setEnabled(false);
		jTextFieldrucSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonrucSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonrucSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_moduloSriFacturasProveedores = new JLabelMe();
		this.jLabelnombre_moduloSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO+" : *");
		this.jLabelnombre_moduloSriFacturasProveedores.setToolTipText("Nombre Modulo");
		this.jLabelnombre_moduloSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_moduloSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_moduloSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_moduloSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelnombre_moduloSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextAreanombre_moduloSriFacturasProveedores= new JTextAreaMe();
		jTextAreanombre_moduloSriFacturasProveedores.setEnabled(false);
		jTextAreanombre_moduloSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriFacturasProveedores.setLineWrap(true);
		jTextAreanombre_moduloSriFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombre_moduloSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_moduloSriFacturasProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_moduloSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_moduloSriFacturasProveedores = new JScrollPane(jTextAreanombre_moduloSriFacturasProveedores);
		jscrollPanenombre_moduloSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_moduloSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_moduloSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_moduloSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_moduloSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_moduloSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteSriFacturasProveedores = new JLabelMe();
		this.jLabelnombre_completo_clienteSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteSriFacturasProveedores.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelnombre_completo_clienteSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextAreanombre_completo_clienteSriFacturasProveedores= new JTextAreaMe();
		jTextAreanombre_completo_clienteSriFacturasProveedores.setEnabled(false);
		jTextAreanombre_completo_clienteSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedores.setLineWrap(true);
		jTextAreanombre_completo_clienteSriFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteSriFacturasProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteSriFacturasProveedores = new JScrollPane(jTextAreanombre_completo_clienteSriFacturasProveedores);
		jscrollPanenombre_completo_clienteSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionSriFacturasProveedores = new JLabelMe();
		this.jLabelnombre_transaccionSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionSriFacturasProveedores.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelnombre_transaccionSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextAreanombre_transaccionSriFacturasProveedores= new JTextAreaMe();
		jTextAreanombre_transaccionSriFacturasProveedores.setEnabled(false);
		jTextAreanombre_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionSriFacturasProveedores.setLineWrap(true);
		jTextAreanombre_transaccionSriFacturasProveedores.setWrapStyleWord(true);
		jTextAreanombre_transaccionSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionSriFacturasProveedores.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionSriFacturasProveedores = new JScrollPane(jTextAreanombre_transaccionSriFacturasProveedores);
		jscrollPanenombre_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asiento_contableSriFacturasProveedores = new JLabelMe();
		this.jLabelcodigo_asiento_contableSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+" : *");
		this.jLabelcodigo_asiento_contableSriFacturasProveedores.setToolTipText("Codigo Asiento Contable");
		this.jLabelcodigo_asiento_contableSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asiento_contableSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asiento_contableSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asiento_contableSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelcodigo_asiento_contableSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextFieldcodigo_asiento_contableSriFacturasProveedores= new JTextFieldMe();

		jTextFieldcodigo_asiento_contableSriFacturasProveedores.setEnabled(false);
		jTextFieldcodigo_asiento_contableSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asiento_contableSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setText("U");
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asiento_contableSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asiento_contableSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asiento_contableSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSriFacturasProveedores = new JLabelMe();
		this.jLabelfecha_emisionSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSriFacturasProveedores.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelfecha_emisionSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		//jFormattedTextFieldfecha_emisionSriFacturasProveedores= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSriFacturasProveedores= new JDateChooser();
		jDateChooserfecha_emisionSriFacturasProveedores.setEnabled(false);
		jDateChooserfecha_emisionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSriFacturasProveedores.setDate(new Date());
		jDateChooserfecha_emisionSriFacturasProveedores.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSriFacturasProveedores.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaSriFacturasProveedores = new JLabelMe();
		this.jLabelnumero_facturaSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaSriFacturasProveedores.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelnumero_facturaSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextFieldnumero_facturaSriFacturasProveedores= new JTextFieldMe();

		jTextFieldnumero_facturaSriFacturasProveedores.setEnabled(false);
		jTextFieldnumero_facturaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaSriFacturasProveedoresBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localSriFacturasProveedores = new JLabelMe();
		this.jLabelcredito_mone_localSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localSriFacturasProveedores.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelcredito_mone_localSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jTextFieldcredito_mone_localSriFacturasProveedores= new JTextFieldMe();
		jTextFieldcredito_mone_localSriFacturasProveedores.setEnabled(false);
		jTextFieldcredito_mone_localSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localSriFacturasProveedores.setText("0.0");

		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setText("U");
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSriFacturasProveedores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSriFacturasProveedores = new JLabelMe();
		this.jLabelid_empresaSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSriFacturasProveedores.setToolTipText("Empresa");
		this.jLabelid_empresaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelid_empresaSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jComboBoxid_empresaSriFacturasProveedores= new JComboBoxMe();
		jComboBoxid_empresaSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSriFacturasProveedores.setEnabled(false);

		this.jButtonid_empresaSriFacturasProveedores= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedores.setText("Buscar");
		this.jButtonid_empresaSriFacturasProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSriFacturasProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedores"));

		this.jButtonid_empresaSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSriFacturasProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaSriFacturasProveedoresUpdate= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriFacturasProveedoresUpdate.setText("U");
		this.jButtonid_empresaSriFacturasProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSriFacturasProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedoresUpdate"));



					
		this.jLabelid_transaccionSriFacturasProveedores = new JLabelMe();
		this.jLabelid_transaccionSriFacturasProveedores.setText(""+SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionSriFacturasProveedores.setToolTipText("Transaccion");
		this.jLabelid_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionSriFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionSriFacturasProveedores.setToolTipText(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		this.jPanelid_transaccionSriFacturasProveedores.setLayout(this.gridaBagLayoutSriFacturasProveedores);


		jComboBoxid_transaccionSriFacturasProveedores= new JComboBoxMe();
		jComboBoxid_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionSriFacturasProveedores= new JButtonMe();
		this.jButtonid_transaccionSriFacturasProveedores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionSriFacturasProveedores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionSriFacturasProveedores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionSriFacturasProveedores.setText("Buscar");
		this.jButtonid_transaccionSriFacturasProveedores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionSriFacturasProveedores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionSriFacturasProveedores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionSriFacturasProveedores"));

		this.jButtonid_transaccionSriFacturasProveedoresBusqueda= new JButtonMe();
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setText("U");
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionSriFacturasProveedoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionSriFacturasProveedoresBusqueda"));

		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionSriFacturasProveedoresBusqueda.setVisible(false);		}

		this.jButtonid_transaccionSriFacturasProveedoresUpdate= new JButtonMe();
		this.jButtonid_transaccionSriFacturasProveedoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionSriFacturasProveedoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionSriFacturasProveedoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionSriFacturasProveedoresUpdate.setText("U");
		this.jButtonid_transaccionSriFacturasProveedoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionSriFacturasProveedoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionSriFacturasProveedoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionSriFacturasProveedoresUpdate"));



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
		//this.jInternalFrameDetalleSriFacturasProveedores = new SriFacturasProveedoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri Facturas Proveedores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriFacturasProveedores= new GridBagLayout();
		

		
		String sToolTipSriFacturasProveedores="";
		sToolTipSriFacturasProveedores=SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriFacturasProveedores+="(Sris.SriFacturasProveedores)";
		}
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriFacturasProveedores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSriFacturasProveedores = new JButtonMe();
		this.jButtonModificarSriFacturasProveedores = new JButtonMe();
        this.jButtonActualizarSriFacturasProveedores = new JButtonMe();
        this.jButtonEliminarSriFacturasProveedores = new JButtonMe();
        this.jButtonCancelarSriFacturasProveedores = new JButtonMe();
        this.jButtonGuardarCambiosSriFacturasProveedores = new JButtonMe();
		this.jButtonGuardarCambiosTablaSriFacturasProveedores = new JButtonMe();
		this.jButtonCerrarSriFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosSriFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosEdicionSriFacturasProveedores = new JScrollPane();
		this.jScrollPanelDatosGeneralSriFacturasProveedores = new JScrollPane();
				
		
		
		this.jPanelCamposSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Facturas Proveedores";
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosSriFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSriFacturasProveedores.setName("jPanelCamposSriFacturasProveedores"); 

		this.jPanelCamposOcultosSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSriFacturasProveedores.setName("jPanelCamposOcultosSriFacturasProveedores"); 

        this.jPanelAccionesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesSriFacturasProveedores.setName("Acciones"); 

		this.jPanelAccionesFormularioSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSriFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSriFacturasProveedores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSriFacturasProveedores.setText("Nuevo");
		this.jButtonModificarSriFacturasProveedores.setText("Editar");
        this.jButtonActualizarSriFacturasProveedores.setText("Actualizar");
        this.jButtonEliminarSriFacturasProveedores.setText("Eliminar");
        this.jButtonCancelarSriFacturasProveedores.setText("Cancelar");
        this.jButtonGuardarCambiosSriFacturasProveedores.setText("Guardar");
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.setText("Guardar");
		this.jButtonCerrarSriFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriFacturasProveedores,"nuevo_button","Nuevo",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSriFacturasProveedores,"modificar_button","Editar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSriFacturasProveedores,"actualizar_button","Actualizar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSriFacturasProveedores,"eliminar_button","Eliminar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSriFacturasProveedores,"cancelar_button","Cancelar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSriFacturasProveedores,"guardarcambios_button","Guardar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriFacturasProveedores,"guardarcambiostabla_button","Guardar",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriFacturasProveedores,"cerrar_button","Salir",this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSriFacturasProveedores.setToolTipText("Nuevo"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSriFacturasProveedores.setToolTipText("Editar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSriFacturasProveedores.setToolTipText("Actualizar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSriFacturasProveedores.setToolTipText("Eliminar)"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSriFacturasProveedores.setToolTipText("Cancelar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSriFacturasProveedores.setToolTipText("Guardar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.setToolTipText("Guardar"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriFacturasProveedores.setToolTipText("Salir"+" "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriFacturasProveedores";
		inputMap = this.jButtonNuevoSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriFacturasProveedores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSriFacturasProveedores";
		inputMap = this.jButtonActualizarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSriFacturasProveedores"));
		
		//ELIMINAR
		sMapKey = "EliminarSriFacturasProveedores";
		inputMap = this.jButtonEliminarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSriFacturasProveedores"));
		
		//CANCELAR	
		sMapKey = "CancelarSriFacturasProveedores";
		inputMap = this.jButtonCancelarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSriFacturasProveedores"));
		
		//CERRAR		
		sMapKey = "CerrarSriFacturasProveedores";
		inputMap = this.jButtonCerrarSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaSriFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriFacturasProveedores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSriFacturasProveedores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSriFacturasProveedores.setToolTipText("Nuevo SriFacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedores.setToolTipText("Sin Cerrar Ventana SriFacturasProveedores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesSriFacturasProveedores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSriFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSriFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesSriFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesSriFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSriFacturasProveedores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSriFacturasProveedores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSriFacturasProveedores=new JTabbedPane();
		this.jTabbedPaneRelacionesSriFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSriFacturasProveedores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSriFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSriFacturasProveedores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSriFacturasProveedores = new GridBagLayout();
		
		this.jPanelCamposSriFacturasProveedores.setLayout(gridaBagLayoutCamposSriFacturasProveedores);
		this.jPanelCamposOcultosSriFacturasProveedores.setLayout(gridaBagLayoutCamposOcultosSriFacturasProveedores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSriFacturasProveedores.add(jLabelIdSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSriFacturasProveedores.add(jLabelidSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSriFacturasProveedores.add(jLabelid_empresaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriFacturasProveedores.add(jButtonid_empresaSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriFacturasProveedores.add(jButtonid_empresaSriFacturasProveedoresUpdate, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSriFacturasProveedores.add(jComboBoxid_empresaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionSriFacturasProveedores.add(jLabelid_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionSriFacturasProveedores.add(jButtonid_transaccionSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionSriFacturasProveedores.add(jButtonid_transaccionSriFacturasProveedoresUpdate, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionSriFacturasProveedores.add(jComboBoxid_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeSriFacturasProveedores.add(jLabelfecha_emision_desdeSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeSriFacturasProveedores.add(jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeSriFacturasProveedores.add(jDateChooserfecha_emision_desdeSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaSriFacturasProveedores.add(jLabelfecha_emision_hastaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaSriFacturasProveedores.add(jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaSriFacturasProveedores.add(jDateChooserfecha_emision_hastaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionSriFacturasProveedores.add(jLabelidentificacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionSriFacturasProveedores.add(jButtonidentificacionSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionSriFacturasProveedores.add(jTextFieldidentificacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSriFacturasProveedores.add(jLabelnombreSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSriFacturasProveedores.add(jButtonnombreSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSriFacturasProveedores.add(jscrollPanenombreSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSriFacturasProveedores.add(jLabelrucSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSriFacturasProveedores.add(jButtonrucSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSriFacturasProveedores.add(jTextFieldrucSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_moduloSriFacturasProveedores.add(jLabelnombre_moduloSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_moduloSriFacturasProveedores.add(jButtonnombre_moduloSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_moduloSriFacturasProveedores.add(jscrollPanenombre_moduloSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteSriFacturasProveedores.add(jLabelnombre_completo_clienteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteSriFacturasProveedores.add(jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteSriFacturasProveedores.add(jscrollPanenombre_completo_clienteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionSriFacturasProveedores.add(jLabelnombre_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionSriFacturasProveedores.add(jButtonnombre_transaccionSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionSriFacturasProveedores.add(jscrollPanenombre_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asiento_contableSriFacturasProveedores.add(jLabelcodigo_asiento_contableSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asiento_contableSriFacturasProveedores.add(jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asiento_contableSriFacturasProveedores.add(jTextFieldcodigo_asiento_contableSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSriFacturasProveedores.add(jLabelfecha_emisionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSriFacturasProveedores.add(jButtonfecha_emisionSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSriFacturasProveedores.add(jDateChooserfecha_emisionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaSriFacturasProveedores.add(jLabelnumero_facturaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaSriFacturasProveedores.add(jButtonnumero_facturaSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaSriFacturasProveedores.add(jTextFieldnumero_facturaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localSriFacturasProveedores.add(jLabelcredito_mone_localSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localSriFacturasProveedores.add(jButtoncredito_mone_localSriFacturasProveedoresBusqueda, this.gridBagConstraintsSriFacturasProveedores);
	}

	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedores.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localSriFacturasProveedores.add(jTextFieldcredito_mone_localSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelidSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelid_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelfecha_emision_desdeSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelfecha_emision_hastaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelidentificacionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelnombreSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelrucSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelnombre_moduloSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelnombre_completo_clienteSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelnombre_transaccionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelcodigo_asiento_contableSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelfecha_emisionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelnumero_facturaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedores.add(this.jPanelcredito_mone_localSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposSriFacturasProveedores % 2==0) {
		iXPanelCamposSriFacturasProveedores=0;
		iYPanelCamposSriFacturasProveedores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedores.gridy = iYPanelCamposOcultosSriFacturasProveedores;
	this.gridBagConstraintsSriFacturasProveedores.gridx = iXPanelCamposOcultosSriFacturasProveedores++;
	this.gridBagConstraintsSriFacturasProveedores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSriFacturasProveedores.add(this.jPanelid_empresaSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);



	if(iXPanelCamposOcultosSriFacturasProveedores % 2==0) {
		iXPanelCamposOcultosSriFacturasProveedores=0;
		iYPanelCamposOcultosSriFacturasProveedores++;
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
			
		GridBagLayout gridaBagLayoutAccionesSriFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesSriFacturasProveedores.setLayout(gridaBagLayoutAccionesSriFacturasProveedores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSriFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesFormularioSriFacturasProveedores.setLayout(gridaBagLayoutAccionesFormularioSriFacturasProveedores);
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSriFacturasProveedores.add(this.jComboBoxTiposAccionesFormularioSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccion++;
			
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonModificarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);							

		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXAccion++;
			
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonEliminarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonActualizarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);


		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonGuardarCambiosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);	
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedores.gridx =iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedores.add(this.jButtonCancelarSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriFacturasProveedores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsSriFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriFacturasProveedores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedores.gridx =0;
		this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSriFacturasProveedores = new SriFacturasProveedoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri Facturas Proveedores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri Facturas Proveedores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Facturas Proveedores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriFacturasProveedoresModel srifacturasproveedoresModel=new SriFacturasProveedoresModel(this);
			
			//SI USARA CLASE INTERNA
			//SriFacturasProveedoresModel.SriFacturasProveedoresFocusTraversalPolicy srifacturasproveedoresFocusTraversalPolicy = srifacturasproveedoresModel.new SriFacturasProveedoresFocusTraversalPolicy(this);
			
			//srifacturasproveedoresFocusTraversalPolicy.setsrifacturasproveedoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(srifacturasproveedoresModel);
			
			
			this.jContentPaneDetalleSriFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSriFacturasProveedores = new GridBagLayout();	
			this.jContentPaneDetalleSriFacturasProveedores.setLayout(gridaBagLayoutDetalleSriFacturasProveedores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriFacturasProveedores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
					
				
				this.jContentPaneDetalleSriFacturasProveedores.add(jTtoolBarDetalleSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);								
				
}
			
			this.jScrollPanelDatosEdicionSriFacturasProveedores=   new JScrollPane(jContentPaneDetalleSriFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSriFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	        
			this.jContentPaneDetalleSriFacturasProveedores.add(jPanelCamposSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);
			
			
			
			
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
						//&& srifacturasproveedoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSriFacturasProveedores= new GridBagConstraints();
						this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
						this.jContentPaneDetalleSriFacturasProveedores.add(this.jTabbedPaneRelacionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSriFacturasProveedores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSriFacturasProveedores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
					this.gridBagConstraintsSriFacturasProveedores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
					
				
					this.jContentPaneDetalleSriFacturasProveedores.add(jPanelCamposOcultosSriFacturasProveedores, gridBagConstraintsSriFacturasProveedores);
				
					this.jPanelCamposOcultosSriFacturasProveedores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	        this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSriFacturasProveedores.add(this.jPanelAccionesFormularioSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);							
			
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
	        this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
	        
			
			this.jContentPaneDetalleSriFacturasProveedores.add(this.jPanelAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSriFacturasProveedores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSriFacturasProveedores=   new JScrollPane(this.jPanelCamposSriFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
			this.gridBagConstraintsSriFacturasProveedores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSriFacturasProveedores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSriFacturasProveedores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);			
			
			this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
			
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		
			
		this.gridBagConstraintsSriFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriFacturasProveedores, this.gridBagConstraintsSriFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSriFacturasProveedores;//jContentPane;
		
		return jScrollPanelDatosEdicionSriFacturasProveedores;
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
