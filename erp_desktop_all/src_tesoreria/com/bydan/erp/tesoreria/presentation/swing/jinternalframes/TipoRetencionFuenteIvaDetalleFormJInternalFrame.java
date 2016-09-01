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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoRetencionFuenteIvaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoRetencionFuenteIvaDetalleFormJInternalFrame extends TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRetencionFuenteIva;
	
	protected JMenuBar jmenuBarDetalleTipoRetencionFuenteIva;
	
	protected JMenu jmenuDetalleTipoRetencionFuenteIva;
	protected JMenu jmenuDetalleArchivoTipoRetencionFuenteIva;
	protected JMenu jmenuDetalleAccionesTipoRetencionFuenteIva;
	protected JMenu jmenuDetalleDatosTipoRetencionFuenteIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencionFuenteIva;	
	protected GridBagConstraints gridBagConstraintsTipoRetencionFuenteIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRetencionFuenteIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoRetencionFuenteIvaSessionBean tiporetencionfuenteivaSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public TipoRetencionFuenteIvaLogic tiporetencionfuenteivaLogic;
	
	public JScrollPane jScrollPanelDatosTipoRetencionFuenteIva;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencionFuenteIva;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencionFuenteIva;
	
	protected JPanel jPanelCamposTipoRetencionFuenteIva;    
	protected JPanel jPanelCamposOcultosTipoRetencionFuenteIva;    	
	protected JPanel jPanelAccionesTipoRetencionFuenteIva;
	protected JPanel jPanelAccionesFormularioTipoRetencionFuenteIva;
    
	
	
	protected Integer iXPanelCamposTipoRetencionFuenteIva=0;
	protected Integer iYPanelCamposTipoRetencionFuenteIva=0;
	
	protected Integer iXPanelCamposOcultosTipoRetencionFuenteIva=0;
	protected Integer iYPanelCamposOcultosTipoRetencionFuenteIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRetencionFuenteIva;
	public JButton jButtonModificarTipoRetencionFuenteIva;
	public JButton jButtonActualizarTipoRetencionFuenteIva;
    public JButton jButtonEliminarTipoRetencionFuenteIva;
	public JButton jButtonCancelarTipoRetencionFuenteIva;
    public JButton jButtonGuardarCambiosTipoRetencionFuenteIva;
	public JButton jButtonGuardarCambiosTablaTipoRetencionFuenteIva;
	protected JButton jButtonCerrarTipoRetencionFuenteIva;
	
	
	protected JButton jButtonProcesarInformacionTipoRetencionFuenteIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRetencionFuenteIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencionFuenteIva;
	protected JButton jButtonModificarToolBarTipoRetencionFuenteIva;
	protected JButton jButtonActualizarToolBarTipoRetencionFuenteIva;
    protected JButton jButtonEliminarToolBarTipoRetencionFuenteIva;
	protected JButton jButtonCancelarToolBarTipoRetencionFuenteIva;
    protected JButton jButtonGuardarCambiosToolBarTipoRetencionFuenteIva;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencionFuenteIva;
	protected JButton jButtonCerrarToolBarTipoRetencionFuenteIva;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRetencionFuenteIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemModificarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemActualizarTipoRetencionFuenteIva;
    protected JMenuItem jMenuItemEliminarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemCancelarTipoRetencionFuenteIva;
    protected JMenuItem jMenuItemGuardarCambiosTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemCerrarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencionFuenteIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencionFuenteIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencionFuenteIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRetencionFuenteIva;
	public JLabel jLabelIdTipoRetencionFuenteIva;
	public JTextFieldMe jTextFieldidTipoRetencionFuenteIva;
	public JButton jButtonidTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRetencionFuenteIva;
	public JLabel jLabelcodigoTipoRetencionFuenteIva;
	public JTextField jTextFieldcodigoTipoRetencionFuenteIva;
	public JButton jButtoncodigoTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRetencionFuenteIva;
	public JLabel jLabelnombreTipoRetencionFuenteIva;
	public JTextArea jTextAreanombreTipoRetencionFuenteIva;
	public JScrollPane jscrollPanenombreTipoRetencionFuenteIva;
	public JButton jButtonnombreTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeTipoRetencionFuenteIva;
	public JLabel jLabelporcentajeTipoRetencionFuenteIva;
	public JTextField jTextFieldporcentajeTipoRetencionFuenteIva;
	public JButton jButtonporcentajeTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimoTipoRetencionFuenteIva;
	public JLabel jLabelmonto_minimoTipoRetencionFuenteIva;
	public JTextField jTextFieldmonto_minimoTipoRetencionFuenteIva;
	public JButton jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_retencion_ivaTipoRetencionFuenteIva;
	public JLabel jLabeles_retencion_ivaTipoRetencionFuenteIva;
	public JCheckBox jCheckBoxes_retencion_ivaTipoRetencionFuenteIva;
	public JButton jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_debitoTipoRetencionFuenteIva;
	public JLabel jLabeles_debitoTipoRetencionFuenteIva;
	public JCheckBox jCheckBoxes_debitoTipoRetencionFuenteIva;
	public JButton jButtones_debitoTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_con_iva_facturaTipoRetencionFuenteIva;
	public JLabel jLabeles_con_iva_facturaTipoRetencionFuenteIva;
	public JCheckBox jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva;
	public JButton jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_con_sub_total_facturaTipoRetencionFuenteIva;
	public JLabel jLabeles_con_sub_total_facturaTipoRetencionFuenteIva;
	public JCheckBox jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva;
	public JButton jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_con_secuencialTipoRetencionFuenteIva;
	public JLabel jLabeles_con_secuencialTipoRetencionFuenteIva;
	public JCheckBox jCheckBoxes_con_secuencialTipoRetencionFuenteIva;
	public JButton jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoRetencionFuenteIva;
	public JLabel jLabelid_paisTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoRetencionFuenteIva;
	public JButton jButtonid_paisTipoRetencionFuenteIva= new JButtonMe();
	public JButton jButtonid_paisTipoRetencionFuenteIvaUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTipoRetencionFuenteIva;
	public JLabel jLabelid_cuenta_contableTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTipoRetencionFuenteIva;
	public JButton jButtonid_cuenta_contableTipoRetencionFuenteIva= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva;
	public JLabel jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva;
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRetencionFuenteIva;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRetencionFuenteIva=new JPanel();
				this.jPanelAccionesFormularioTipoRetencionFuenteIva=new JPanel();
				this.jmenuBarDetalleTipoRetencionFuenteIva=new JMenuBar();
				this.jTtoolBarDetalleTipoRetencionFuenteIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRetencionFuenteIva() {
		return this.jButtonActualizarToolBarTipoRetencionFuenteIva;
	}
	
	public JButton getjButtonEliminarToolBarTipoRetencionFuenteIva() {
		return this.jButtonEliminarToolBarTipoRetencionFuenteIva;
	}
	
	public JButton getjButtonCancelarToolBarTipoRetencionFuenteIva() {
		return this.jButtonCancelarToolBarTipoRetencionFuenteIva;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRetencionFuenteIva() {
		return this.jButtonProcesarInformacionTipoRetencionFuenteIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencionFuenteIva)	{
		this.jButtonProcesarInformacionTipoRetencionFuenteIva = jButtonProcesarInformacionTipoRetencionFuenteIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposAccionesTipoRetencionFuenteIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposRelacionesTipoRetencionFuenteIva) {
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva = jComboBoxTiposRelacionesTipoRetencionFuenteIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposAccionesTipoRetencionFuenteIva) {
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva = jComboBoxTiposAccionesTipoRetencionFuenteIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRetencionFuenteIva() {
		return this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva) {
		this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva = jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		
		this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionfuenteivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionFuenteIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion Fuente Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRetencionFuenteIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRetencionFuenteIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRetencionFuenteIva=new JButtonMe();
				this.jButtonModificarToolBarTipoRetencionFuenteIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva,
							"actualizar","actualizar","Actualizar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva,
							"eliminar","eliminar","Eliminar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva,
							"cancelar","cancelar","Cancelar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRetencionFuenteIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRetencionFuenteIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRetencionFuenteIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRetencionFuenteIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRetencionFuenteIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencionFuenteIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencionFuenteIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencionFuenteIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRetencionFuenteIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRetencionFuenteIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRetencionFuenteIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRetencionFuenteIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRetencionFuenteIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRetencionFuenteIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRetencionFuenteIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRetencionFuenteIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRetencionFuenteIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRetencionFuenteIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRetencionFuenteIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRetencionFuenteIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencionFuenteIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencionFuenteIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencionFuenteIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRetencionFuenteIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRetencionFuenteIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRetencionFuenteIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencionFuenteIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencionFuenteIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencionFuenteIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRetencionFuenteIva.add(this.jMenuItemDetalleCerrarTipoRetencionFuenteIva);
		
		this.jmenuDetalleAccionesTipoRetencionFuenteIva.add(this.jMenuItemActualizarTipoRetencionFuenteIva);
		this.jmenuDetalleAccionesTipoRetencionFuenteIva.add(this.jMenuItemEliminarTipoRetencionFuenteIva);
		this.jmenuDetalleAccionesTipoRetencionFuenteIva.add(this.jMenuItemCancelarTipoRetencionFuenteIva);		
		
		//this.jmenuDetalleDatosTipoRetencionFuenteIva.add(this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva);				
		this.jmenuDetalleDatosTipoRetencionFuenteIva.add(this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva);				
				
		//this.jmenuDetalleAccionesTipoRetencionFuenteIva.add(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRetencionFuenteIva.add(this.jmenuDetalleArchivoTipoRetencionFuenteIva);		
		this.jmenuBarDetalleTipoRetencionFuenteIva.add(this.jmenuDetalleAccionesTipoRetencionFuenteIva);		
		this.jmenuBarDetalleTipoRetencionFuenteIva.add(this.jmenuDetalleDatosTipoRetencionFuenteIva);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRetencionFuenteIva);				
	}
	
	
	public void inicializarElementosCamposTipoRetencionFuenteIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRetencionFuenteIva = new JLabelMe();
		jLabelIdTipoRetencionFuenteIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRetencionFuenteIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRetencionFuenteIva= new GridBagLayout();

		this.jPanelidTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);

		jTextFieldidTipoRetencionFuenteIva = new JTextFieldMe();
		jTextFieldidTipoRetencionFuenteIva.setText("Id");

		jTextFieldidTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelcodigoTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRetencionFuenteIva.setToolTipText("Codigo");
		this.jLabelcodigoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelcodigoTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jTextFieldcodigoTipoRetencionFuenteIva= new JTextFieldMe();

		jTextFieldcodigoTipoRetencionFuenteIva.setEnabled(false);
		jTextFieldcodigoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelnombreTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRetencionFuenteIva.setToolTipText("Nombre");
		this.jLabelnombreTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelnombreTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jTextAreanombreTipoRetencionFuenteIva= new JTextAreaMe();
		jTextAreanombreTipoRetencionFuenteIva.setEnabled(false);
		jTextAreanombreTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionFuenteIva.setLineWrap(true);
		jTextAreanombreTipoRetencionFuenteIva.setWrapStyleWord(true);
		jTextAreanombreTipoRetencionFuenteIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRetencionFuenteIva.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRetencionFuenteIva = new JScrollPane(jTextAreanombreTipoRetencionFuenteIva);
		jscrollPanenombreTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelporcentajeTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeTipoRetencionFuenteIva.setToolTipText("Porcentaje");
		this.jLabelporcentajeTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelporcentajeTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jTextFieldporcentajeTipoRetencionFuenteIva= new JTextFieldMe();
		jTextFieldporcentajeTipoRetencionFuenteIva.setEnabled(false);
		jTextFieldporcentajeTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeTipoRetencionFuenteIva.setText("0.0");

		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimoTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelmonto_minimoTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO+" : *");
		this.jLabelmonto_minimoTipoRetencionFuenteIva.setToolTipText("Monto Minimo");
		this.jLabelmonto_minimoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimoTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimoTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelmonto_minimoTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jTextFieldmonto_minimoTipoRetencionFuenteIva= new JTextFieldMe();
		jTextFieldmonto_minimoTipoRetencionFuenteIva.setEnabled(false);
		jTextFieldmonto_minimoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimoTipoRetencionFuenteIva.setText("0.0");

		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimoTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva = new JLabelMe();
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA+" : *");
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva.setToolTipText("Es Retencion Iva");
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_ivaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencion_ivaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencion_ivaTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencion_ivaTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPaneles_retencion_ivaTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva= new JCheckBoxMe();
		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setEnabled(false);

		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencion_ivaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencion_ivaTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_debitoTipoRetencionFuenteIva = new JLabelMe();
		this.jLabeles_debitoTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO+" : *");
		this.jLabeles_debitoTipoRetencionFuenteIva.setToolTipText("Es Debito");
		this.jLabeles_debitoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_debitoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_debitoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_debitoTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_debitoTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPaneles_debitoTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jCheckBoxes_debitoTipoRetencionFuenteIva= new JCheckBoxMe();
		jCheckBoxes_debitoTipoRetencionFuenteIva.setEnabled(false);

		jCheckBoxes_debitoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_debitoTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_debitoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_debitoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_debitoTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_debitoTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva = new JLabelMe();
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA+" : *");
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva.setToolTipText("Con Iva Factura");
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_con_iva_facturaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_iva_facturaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_iva_facturaTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_iva_facturaTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPaneles_con_iva_facturaTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva= new JCheckBoxMe();
		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setEnabled(false);

		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_iva_facturaTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva = new JLabelMe();
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA+" : *");
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva.setToolTipText("Con Sub Total Factura");
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_sub_total_facturaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva= new JCheckBoxMe();
		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setEnabled(false);

		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_con_secuencialTipoRetencionFuenteIva = new JLabelMe();
		this.jLabeles_con_secuencialTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL+" : *");
		this.jLabeles_con_secuencialTipoRetencionFuenteIva.setToolTipText("Con Secuencial");
		this.jLabeles_con_secuencialTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_con_secuencialTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_con_secuencialTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_con_secuencialTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_con_secuencialTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_con_secuencialTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPaneles_con_secuencialTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jCheckBoxes_con_secuencialTipoRetencionFuenteIva= new JCheckBoxMe();
		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setEnabled(false);

		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_con_secuencialTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_con_secuencialTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_con_secuencialTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRetencionFuenteIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelid_paisTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoRetencionFuenteIva.setToolTipText("Pais");
		this.jLabelid_paisTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelid_paisTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jComboBoxid_paisTipoRetencionFuenteIva= new JComboBoxMe();
		jComboBoxid_paisTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonid_paisTipoRetencionFuenteIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoRetencionFuenteIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoRetencionFuenteIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonid_paisTipoRetencionFuenteIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoRetencionFuenteIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoRetencionFuenteIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoRetencionFuenteIva"));

		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoRetencionFuenteIvaBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoRetencionFuenteIvaUpdate= new JButtonMe();
		this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setText("U");
		this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoRetencionFuenteIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoRetencionFuenteIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoRetencionFuenteIvaUpdate"));



					
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelid_cuenta_contableTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jComboBoxid_cuenta_contableTipoRetencionFuenteIva= new JComboBoxMe();
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionFuenteIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionFuenteIva"));

		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setText("U");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionFuenteIvaUpdate"));


		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol= new JButtonMe();
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setText("Arbol");
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoRetencionFuenteIvaArbol"));



					
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva.setText(""+TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.setToolTipText(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.setLayout(this.gridaBagLayoutTipoRetencionFuenteIva);


		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionFuenteIva"));

		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda"));

		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate"));


		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol"));



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
		//this.jInternalFrameDetalleTipoRetencionFuenteIva = new TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Retencion Fuente Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencionFuenteIva= new GridBagLayout();
		

		
		String sToolTipTipoRetencionFuenteIva="";
		sToolTipTipoRetencionFuenteIva=TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencionFuenteIva+="(Tesoreria.TipoRetencionFuenteIva)";
		}
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencionFuenteIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonModificarTipoRetencionFuenteIva = new JButtonMe();
        this.jButtonActualizarTipoRetencionFuenteIva = new JButtonMe();
        this.jButtonEliminarTipoRetencionFuenteIva = new JButtonMe();
        this.jButtonCancelarTipoRetencionFuenteIva = new JButtonMe();
        this.jButtonGuardarCambiosTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonCerrarTipoRetencionFuenteIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencionFuenteIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRetencionFuenteIva = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRetencionFuenteIva = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion Fuente Iva";
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencionFuenteIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRetencionFuenteIva.setName("jPanelCamposTipoRetencionFuenteIva"); 

		this.jPanelCamposOcultosTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRetencionFuenteIva.setName("jPanelCamposOcultosTipoRetencionFuenteIva"); 

        this.jPanelAccionesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencionFuenteIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencionFuenteIva.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRetencionFuenteIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRetencionFuenteIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRetencionFuenteIva.setText("Nuevo");
		this.jButtonModificarTipoRetencionFuenteIva.setText("Editar");
        this.jButtonActualizarTipoRetencionFuenteIva.setText("Actualizar");
        this.jButtonEliminarTipoRetencionFuenteIva.setText("Eliminar");
        this.jButtonCancelarTipoRetencionFuenteIva.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRetencionFuenteIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setText("Guardar");
		this.jButtonCerrarTipoRetencionFuenteIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencionFuenteIva,"nuevo_button","Nuevo",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRetencionFuenteIva,"modificar_button","Editar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRetencionFuenteIva,"actualizar_button","Actualizar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRetencionFuenteIva,"eliminar_button","Eliminar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRetencionFuenteIva,"cancelar_button","Cancelar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRetencionFuenteIva,"guardarcambios_button","Guardar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva,"guardarcambiostabla_button","Guardar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencionFuenteIva,"cerrar_button","Salir",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRetencionFuenteIva.setToolTipText("Nuevo"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRetencionFuenteIva.setToolTipText("Editar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRetencionFuenteIva.setToolTipText("Actualizar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRetencionFuenteIva.setToolTipText("Eliminar)"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRetencionFuenteIva.setToolTipText("Cancelar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRetencionFuenteIva.setToolTipText("Guardar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setToolTipText("Guardar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencionFuenteIva.setToolTipText("Salir"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencionFuenteIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencionFuenteIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRetencionFuenteIva";
		inputMap = this.jButtonActualizarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRetencionFuenteIva"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRetencionFuenteIva";
		inputMap = this.jButtonEliminarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRetencionFuenteIva"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRetencionFuenteIva";
		inputMap = this.jButtonCancelarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRetencionFuenteIva"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencionFuenteIva";
		inputMap = this.jButtonCerrarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencionFuenteIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencionFuenteIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencionFuenteIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva.setToolTipText("Nuevo TipoRetencionFuenteIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva.setToolTipText("Sin Cerrar Ventana TipoRetencionFuenteIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRetencionFuenteIva = new JLabelMe();
		
		this.jLabelAccionesTipoRetencionFuenteIva.setText("Acciones");		
		this.jLabelAccionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRetencionFuenteIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRetencionFuenteIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRetencionFuenteIva=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRetencionFuenteIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRetencionFuenteIva = new GridBagLayout();
		
		this.jPanelCamposTipoRetencionFuenteIva.setLayout(gridaBagLayoutCamposTipoRetencionFuenteIva);
		this.jPanelCamposOcultosTipoRetencionFuenteIva.setLayout(gridaBagLayoutCamposOcultosTipoRetencionFuenteIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRetencionFuenteIva.add(jLabelIdTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRetencionFuenteIva.add(jTextFieldidTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoRetencionFuenteIva.add(jLabelid_paisTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoRetencionFuenteIva.add(jButtonid_paisTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 3;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoRetencionFuenteIva.add(jButtonid_paisTipoRetencionFuenteIvaUpdate, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoRetencionFuenteIva.add(jComboBoxid_paisTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRetencionFuenteIva.add(jLabelcodigoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRetencionFuenteIva.add(jButtoncodigoTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRetencionFuenteIva.add(jTextFieldcodigoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRetencionFuenteIva.add(jLabelnombreTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRetencionFuenteIva.add(jButtonnombreTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRetencionFuenteIva.add(jscrollPanenombreTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeTipoRetencionFuenteIva.add(jLabelporcentajeTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeTipoRetencionFuenteIva.add(jButtonporcentajeTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeTipoRetencionFuenteIva.add(jTextFieldporcentajeTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimoTipoRetencionFuenteIva.add(jLabelmonto_minimoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimoTipoRetencionFuenteIva.add(jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimoTipoRetencionFuenteIva.add(jTextFieldmonto_minimoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jLabelid_cuenta_contableTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jButtonid_cuenta_contableTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 3;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 4;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 5;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTipoRetencionFuenteIva.add(jComboBoxid_cuenta_contableTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 3;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 4;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 5;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.add(jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_retencion_ivaTipoRetencionFuenteIva.add(jLabeles_retencion_ivaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencion_ivaTipoRetencionFuenteIva.add(jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_retencion_ivaTipoRetencionFuenteIva.add(jCheckBoxes_retencion_ivaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_debitoTipoRetencionFuenteIva.add(jLabeles_debitoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_debitoTipoRetencionFuenteIva.add(jButtones_debitoTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_debitoTipoRetencionFuenteIva.add(jCheckBoxes_debitoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_iva_facturaTipoRetencionFuenteIva.add(jLabeles_con_iva_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_iva_facturaTipoRetencionFuenteIva.add(jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_iva_facturaTipoRetencionFuenteIva.add(jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.add(jLabeles_con_sub_total_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.add(jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.add(jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_con_secuencialTipoRetencionFuenteIva.add(jLabeles_con_secuencialTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_con_secuencialTipoRetencionFuenteIva.add(jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda, this.gridBagConstraintsTipoRetencionFuenteIva);
	}

	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_con_secuencialTipoRetencionFuenteIva.add(jCheckBoxes_con_secuencialTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelidTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelid_paisTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelcodigoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelnombreTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelporcentajeTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelmonto_minimoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelid_cuenta_contableTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPaneles_retencion_ivaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPaneles_debitoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPaneles_con_iva_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
	}
	this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iYPanelCamposTipoRetencionFuenteIva;
	this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iXPanelCamposTipoRetencionFuenteIva++;
	this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionFuenteIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionFuenteIva.add(this.jPaneles_con_secuencialTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);



	if(iXPanelCamposTipoRetencionFuenteIva % 1==0) {
		iXPanelCamposTipoRetencionFuenteIva=0;
		iYPanelCamposTipoRetencionFuenteIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencionFuenteIva= new GridBagLayout();
		this.jPanelAccionesTipoRetencionFuenteIva.setLayout(gridaBagLayoutAccionesTipoRetencionFuenteIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRetencionFuenteIva= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRetencionFuenteIva.setLayout(gridaBagLayoutAccionesFormularioTipoRetencionFuenteIva);
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencionFuenteIva.add(this.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencionFuenteIva.add(this.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencionFuenteIva.add(this.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencionFuenteIva.add(this.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonModificarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);							

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonEliminarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonActualizarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonGuardarCambiosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);	
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonCancelarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencionFuenteIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;		
			//this.gridBagConstraintsTipoRetencionFuenteIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =0;
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencionFuenteIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRetencionFuenteIva = new TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Retencion Fuente Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Retencion Fuente Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion Fuente Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRetencionFuenteIvaModel tiporetencionfuenteivaModel=new TipoRetencionFuenteIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRetencionFuenteIvaModel.TipoRetencionFuenteIvaFocusTraversalPolicy tiporetencionfuenteivaFocusTraversalPolicy = tiporetencionfuenteivaModel.new TipoRetencionFuenteIvaFocusTraversalPolicy(this);
			
			//tiporetencionfuenteivaFocusTraversalPolicy.settiporetencionfuenteivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporetencionfuenteivaModel);
			
			
			this.jContentPaneDetalleTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRetencionFuenteIva = new GridBagLayout();	
			this.jContentPaneDetalleTipoRetencionFuenteIva.setLayout(gridaBagLayoutDetalleTipoRetencionFuenteIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencionFuenteIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRetencionFuenteIva.add(jTtoolBarDetalleTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva=   new JScrollPane(jContentPaneDetalleTipoRetencionFuenteIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	        
			this.jContentPaneDetalleTipoRetencionFuenteIva.add(jPanelCamposTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRetencionFuenteIva= new GridBagConstraints();
						this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
						this.jContentPaneDetalleTipoRetencionFuenteIva.add(this.jTabbedPaneRelacionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRetencionFuenteIva.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRetencionFuenteIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
					this.gridBagConstraintsTipoRetencionFuenteIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRetencionFuenteIva.add(jPanelCamposOcultosTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);
				
					this.jPanelCamposOcultosTipoRetencionFuenteIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	        this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRetencionFuenteIva.add(this.jPanelAccionesFormularioTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);							
			
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
	        this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRetencionFuenteIva.add(this.jPanelAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRetencionFuenteIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva=   new JScrollPane(this.jPanelCamposTipoRetencionFuenteIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRetencionFuenteIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRetencionFuenteIva;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRetencionFuenteIva;
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
