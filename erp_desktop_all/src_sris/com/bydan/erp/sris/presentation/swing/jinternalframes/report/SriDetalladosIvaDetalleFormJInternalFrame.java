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


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.sris.util.report.SriDetalladosIvaConstantesFunciones;

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
public class SriDetalladosIvaDetalleFormJInternalFrame extends SriDetalladosIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSriDetalladosIva;
	
	protected JMenuBar jmenuBarDetalleSriDetalladosIva;
	
	protected JMenu jmenuDetalleSriDetalladosIva;
	protected JMenu jmenuDetalleArchivoSriDetalladosIva;
	protected JMenu jmenuDetalleAccionesSriDetalladosIva;
	protected JMenu jmenuDetalleDatosSriDetalladosIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriDetalladosIva;	
	protected GridBagConstraints gridBagConstraintsSriDetalladosIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriDetalladosIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleSriDetalladosIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriDetalladosIvaSessionBean sridetalladosivaSessionBean;
	
	
	
	
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;	
	
	public SriDetalladosIvaLogic sridetalladosivaLogic;
	
	public JScrollPane jScrollPanelDatosSriDetalladosIva;
	public JScrollPane jScrollPanelDatosEdicionSriDetalladosIva;
	public JScrollPane jScrollPanelDatosGeneralSriDetalladosIva;
	
	protected JPanel jPanelCamposSriDetalladosIva;    
	protected JPanel jPanelCamposOcultosSriDetalladosIva;    	
	protected JPanel jPanelAccionesSriDetalladosIva;
	protected JPanel jPanelAccionesFormularioSriDetalladosIva;
    
	
	
	protected Integer iXPanelCamposSriDetalladosIva=0;
	protected Integer iYPanelCamposSriDetalladosIva=0;
	
	protected Integer iXPanelCamposOcultosSriDetalladosIva=0;
	protected Integer iYPanelCamposOcultosSriDetalladosIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSriDetalladosIva;
	public JButton jButtonModificarSriDetalladosIva;
	public JButton jButtonActualizarSriDetalladosIva;
    public JButton jButtonEliminarSriDetalladosIva;
	public JButton jButtonCancelarSriDetalladosIva;
    public JButton jButtonGuardarCambiosSriDetalladosIva;
	public JButton jButtonGuardarCambiosTablaSriDetalladosIva;
	protected JButton jButtonCerrarSriDetalladosIva;
	
	
	protected JButton jButtonProcesarInformacionSriDetalladosIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSriDetalladosIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSriDetalladosIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSriDetalladosIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriDetalladosIva;
	protected JButton jButtonModificarToolBarSriDetalladosIva;
	protected JButton jButtonActualizarToolBarSriDetalladosIva;
    protected JButton jButtonEliminarToolBarSriDetalladosIva;
	protected JButton jButtonCancelarToolBarSriDetalladosIva;
    protected JButton jButtonGuardarCambiosToolBarSriDetalladosIva;
	protected JButton jButtonGuardarCambiosTablaToolBarSriDetalladosIva;
	protected JButton jButtonMostrarOcultarTablaToolBarSriDetalladosIva;
	protected JButton jButtonCerrarToolBarSriDetalladosIva;
	
	protected JButton jButtonProcesarInformacionToolBarSriDetalladosIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriDetalladosIva;
	protected JMenuItem jMenuItemModificarSriDetalladosIva;
	protected JMenuItem jMenuItemActualizarSriDetalladosIva;
    protected JMenuItem jMenuItemEliminarSriDetalladosIva;
	protected JMenuItem jMenuItemCancelarSriDetalladosIva;
    protected JMenuItem jMenuItemGuardarCambiosSriDetalladosIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriDetalladosIva;
	protected JMenuItem jMenuItemCerrarSriDetalladosIva;
	protected JMenuItem jMenuItemDetalleCerrarSriDetalladosIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriDetalladosIva;
	
	protected JMenuItem jMenuItemProcesarInformacionSriDetalladosIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriDetalladosIva;
	protected JMenuItem jMenuItemMostrarOcultarSriDetalladosIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriDetalladosIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriDetalladosIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSriDetalladosIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSriDetalladosIva;
	public JLabel jLabelIdSriDetalladosIva;
	public JLabel jLabelidSriDetalladosIva;
	public JButton jButtonidSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelrucSriDetalladosIva;
	public JLabel jLabelrucSriDetalladosIva;
	public JTextField jTextFieldrucSriDetalladosIva;
	public JButton jButtonrucSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_comprobanteSriDetalladosIva;
	public JLabel jLabelnombre_tipo_comprobanteSriDetalladosIva;
	public JTextArea jTextAreanombre_tipo_comprobanteSriDetalladosIva;
	public JScrollPane jscrollPanenombre_tipo_comprobanteSriDetalladosIva;
	public JButton jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelruc_datoSriDetalladosIva;
	public JLabel jLabelruc_datoSriDetalladosIva;
	public JTextField jTextFieldruc_datoSriDetalladosIva;
	public JButton jButtonruc_datoSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoSriDetalladosIva;
	public JLabel jLabelnumero_documentoSriDetalladosIva;
	public JTextField jTextFieldnumero_documentoSriDetalladosIva;
	public JButton jButtonnumero_documentoSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSriDetalladosIva;
	public JLabel jLabelfecha_emisionSriDetalladosIva;
	//public JFormattedTextField jDateChooserfecha_emisionSriDetalladosIva;

	public JDateChooser jDateChooserfecha_emisionSriDetalladosIva;
	public JButton jButtonfecha_emisionSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableSriDetalladosIva;
	public JLabel jLabelfecha_registro_contableSriDetalladosIva;
	//public JFormattedTextField jDateChooserfecha_registro_contableSriDetalladosIva;

	public JDateChooser jDateChooserfecha_registro_contableSriDetalladosIva;
	public JButton jButtonfecha_registro_contableSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieSriDetalladosIva;
	public JLabel jLabelnumero_serieSriDetalladosIva;
	public JTextField jTextFieldnumero_serieSriDetalladosIva;
	public JButton jButtonnumero_serieSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaSriDetalladosIva;
	public JLabel jLabeltotal_ivaSriDetalladosIva;
	public JTextField jTextFieldtotal_ivaSriDetalladosIva;
	public JButton jButtontotal_ivaSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaSriDetalladosIva;
	public JLabel jLabeltotal_sin_ivaSriDetalladosIva;
	public JTextField jTextFieldtotal_sin_ivaSriDetalladosIva;
	public JButton jButtontotal_sin_ivaSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenidoSriDetalladosIva;
	public JLabel jLabeltransfe_iva_retenidoSriDetalladosIva;
	public JTextField jTextFieldtransfe_iva_retenidoSriDetalladosIva;
	public JButton jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenidoSriDetalladosIva;
	public JLabel jLabelpresta_iva_retenidoSriDetalladosIva;
	public JTextField jTextFieldpresta_iva_retenidoSriDetalladosIva;
	public JButton jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodo_declaraSriDetalladosIva;
	public JLabel jLabelid_periodo_declaraSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraSriDetalladosIva;
	public JButton jButtonid_periodo_declaraSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobanteSriDetalladosIva;
	public JLabel jLabelid_tipo_comprobanteSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteSriDetalladosIva;
	public JButton jButtonid_tipo_comprobanteSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaSriDetalladosIva;
	public JLabel jLabelid_tipo_ivaSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaSriDetalladosIva;
	public JButton jButtonid_tipo_ivaSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_ivaSriDetalladosIva;
	public JLabel jLabelid_tipo_retencion_ivaSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaSriDetalladosIva;
	public JButton jButtonid_tipo_retencion_ivaSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_prestaSriDetalladosIva;
	public JLabel jLabelid_tipo_retencion_iva_prestaSriDetalladosIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva;
	public JButton jButtonid_tipo_retencion_iva_prestaSriDetalladosIva= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSriDetalladosIva;
	
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
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriDetalladosIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSriDetalladosIva=new JPanel();
				this.jPanelAccionesFormularioSriDetalladosIva=new JPanel();
				this.jmenuBarDetalleSriDetalladosIva=new JMenuBar();
				this.jTtoolBarDetalleSriDetalladosIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriDetalladosIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalladosIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriDetalladosIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSriDetalladosIva() {
		return this.jButtonActualizarToolBarSriDetalladosIva;
	}
	
	public JButton getjButtonEliminarToolBarSriDetalladosIva() {
		return this.jButtonEliminarToolBarSriDetalladosIva;
	}
	
	public JButton getjButtonCancelarToolBarSriDetalladosIva() {
		return this.jButtonCancelarToolBarSriDetalladosIva;
	}		
	
	public JButton getjButtonProcesarInformacionSriDetalladosIva() {
		return this.jButtonProcesarInformacionSriDetalladosIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriDetalladosIva)	{
		this.jButtonProcesarInformacionSriDetalladosIva = jButtonProcesarInformacionSriDetalladosIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriDetalladosIva() {
		return this.jComboBoxTiposAccionesSriDetalladosIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriDetalladosIva(
			JComboBox jComboBoxTiposRelacionesSriDetalladosIva) {
		this.jComboBoxTiposRelacionesSriDetalladosIva = jComboBoxTiposRelacionesSriDetalladosIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriDetalladosIva(
			JComboBox jComboBoxTiposAccionesSriDetalladosIva) {
		this.jComboBoxTiposAccionesSriDetalladosIva = jComboBoxTiposAccionesSriDetalladosIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSriDetalladosIva() {
		return this.jComboBoxTiposAccionesFormularioSriDetalladosIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSriDetalladosIva(
			JComboBox jComboBoxTiposAccionesFormularioSriDetalladosIva) {
		this.jComboBoxTiposAccionesFormularioSriDetalladosIva = jComboBoxTiposAccionesFormularioSriDetalladosIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
		
		this.sridetalladosivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sridetalladosivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sridetalladosivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriDetalladosIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriDetalladosIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Detallados Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
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
	
		SriDetalladosIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSriDetalladosIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSriDetalladosIva=new JButtonMe();
				this.jButtonModificarToolBarSriDetalladosIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva,
							"actualizar","actualizar","Actualizar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva,
							"eliminar","eliminar","Eliminar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva,
							"cancelar","cancelar","Cancelar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSriDetalladosIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva,
							"guardarcambios","guardarcambios","Guardar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSriDetalladosIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSriDetalladosIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSriDetalladosIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSriDetalladosIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSriDetalladosIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriDetalladosIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriDetalladosIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriDetalladosIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSriDetalladosIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSriDetalladosIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSriDetalladosIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSriDetalladosIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSriDetalladosIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSriDetalladosIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSriDetalladosIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSriDetalladosIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSriDetalladosIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSriDetalladosIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSriDetalladosIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSriDetalladosIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSriDetalladosIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriDetalladosIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriDetalladosIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriDetalladosIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriDetalladosIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriDetalladosIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSriDetalladosIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSriDetalladosIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSriDetalladosIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriDetalladosIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriDetalladosIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriDetalladosIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriDetalladosIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriDetalladosIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriDetalladosIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSriDetalladosIva.add(this.jMenuItemDetalleCerrarSriDetalladosIva);
		
		this.jmenuDetalleAccionesSriDetalladosIva.add(this.jMenuItemActualizarSriDetalladosIva);
		this.jmenuDetalleAccionesSriDetalladosIva.add(this.jMenuItemEliminarSriDetalladosIva);
		this.jmenuDetalleAccionesSriDetalladosIva.add(this.jMenuItemCancelarSriDetalladosIva);		
		
		//this.jmenuDetalleDatosSriDetalladosIva.add(this.jMenuItemDetalleAbrirOrderBySriDetalladosIva);				
		this.jmenuDetalleDatosSriDetalladosIva.add(this.jMenuItemDetalleMostarOcultarSriDetalladosIva);				
				
		//this.jmenuDetalleAccionesSriDetalladosIva.add(this.jMenuItemGuardarCambiosSriDetalladosIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSriDetalladosIva.add(this.jmenuDetalleArchivoSriDetalladosIva);		
		this.jmenuBarDetalleSriDetalladosIva.add(this.jmenuDetalleAccionesSriDetalladosIva);		
		this.jmenuBarDetalleSriDetalladosIva.add(this.jmenuDetalleDatosSriDetalladosIva);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSriDetalladosIva);				
	}
	
	
	public void inicializarElementosCamposSriDetalladosIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSriDetalladosIva = new JLabelMe();
		jLabelIdSriDetalladosIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSriDetalladosIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSriDetalladosIva= new GridBagLayout();

		this.jPanelidSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);

		jLabelidSriDetalladosIva = new JLabel();
		jLabelidSriDetalladosIva.setText("Id");

		jLabelidSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucSriDetalladosIva = new JLabelMe();
		this.jLabelrucSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSriDetalladosIva.setToolTipText("Ruc");
		this.jLabelrucSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelrucSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldrucSriDetalladosIva= new JTextFieldMe();

		jTextFieldrucSriDetalladosIva.setEnabled(false);
		jTextFieldrucSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonrucSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriDetalladosIvaBusqueda.setText("U");
		this.jButtonrucSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva = new JLabelMe();
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+" : *");
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva.setToolTipText("Nombre Tipo Comprobante");
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_comprobanteSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_comprobanteSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_comprobanteSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelnombre_tipo_comprobanteSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextAreanombre_tipo_comprobanteSriDetalladosIva= new JTextAreaMe();
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setEnabled(false);
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setLineWrap(true);
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setWrapStyleWord(true);
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_comprobanteSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_comprobanteSriDetalladosIva = new JScrollPane(jTextAreanombre_tipo_comprobanteSriDetalladosIva);
		jscrollPanenombre_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setText("U");
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_comprobanteSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_comprobanteSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelruc_datoSriDetalladosIva = new JLabelMe();
		this.jLabelruc_datoSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO+" : *");
		this.jLabelruc_datoSriDetalladosIva.setToolTipText("Ruc Dato");
		this.jLabelruc_datoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_datoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_datoSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_datoSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelruc_datoSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldruc_datoSriDetalladosIva= new JTextFieldMe();

		jTextFieldruc_datoSriDetalladosIva.setEnabled(false);
		jTextFieldruc_datoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_datoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_datoSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_datoSriDetalladosIvaBusqueda.setText("U");
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_datoSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_datoSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_datoSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_datoSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_datoSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoSriDetalladosIva = new JLabelMe();
		this.jLabelnumero_documentoSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoSriDetalladosIva.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelnumero_documentoSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldnumero_documentoSriDetalladosIva= new JTextFieldMe();

		jTextFieldnumero_documentoSriDetalladosIva.setEnabled(false);
		jTextFieldnumero_documentoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setText("U");
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSriDetalladosIva = new JLabelMe();
		this.jLabelfecha_emisionSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSriDetalladosIva.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelfecha_emisionSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		//jFormattedTextFieldfecha_emisionSriDetalladosIva= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSriDetalladosIva= new JDateChooser();
		jDateChooserfecha_emisionSriDetalladosIva.setEnabled(false);
		jDateChooserfecha_emisionSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSriDetalladosIva.setDate(new Date());
		jDateChooserfecha_emisionSriDetalladosIva.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSriDetalladosIva.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setText("U");
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableSriDetalladosIva = new JLabelMe();
		this.jLabelfecha_registro_contableSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableSriDetalladosIva.setToolTipText("Fecha Registro Contable");
		this.jLabelfecha_registro_contableSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelfecha_registro_contableSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		//jFormattedTextFieldfecha_registro_contableSriDetalladosIva= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableSriDetalladosIva= new JDateChooser();
		jDateChooserfecha_registro_contableSriDetalladosIva.setEnabled(false);
		jDateChooserfecha_registro_contableSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableSriDetalladosIva.setDate(new Date());
		jDateChooserfecha_registro_contableSriDetalladosIva.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableSriDetalladosIva.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setText("U");
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieSriDetalladosIva = new JLabelMe();
		this.jLabelnumero_serieSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieSriDetalladosIva.setToolTipText("Numero Serie");
		this.jLabelnumero_serieSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelnumero_serieSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldnumero_serieSriDetalladosIva= new JTextFieldMe();

		jTextFieldnumero_serieSriDetalladosIva.setEnabled(false);
		jTextFieldnumero_serieSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieSriDetalladosIvaBusqueda.setText("U");
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaSriDetalladosIva = new JLabelMe();
		this.jLabeltotal_ivaSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaSriDetalladosIva.setToolTipText("Total Iva");
		this.jLabeltotal_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPaneltotal_ivaSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldtotal_ivaSriDetalladosIva= new JTextFieldMe();
		jTextFieldtotal_ivaSriDetalladosIva.setEnabled(false);
		jTextFieldtotal_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaSriDetalladosIva.setText("0.0");

		this.jButtontotal_ivaSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaSriDetalladosIvaBusqueda.setText("U");
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaSriDetalladosIva = new JLabelMe();
		this.jLabeltotal_sin_ivaSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaSriDetalladosIva.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPaneltotal_sin_ivaSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldtotal_sin_ivaSriDetalladosIva= new JTextFieldMe();
		jTextFieldtotal_sin_ivaSriDetalladosIva.setEnabled(false);
		jTextFieldtotal_sin_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaSriDetalladosIva.setText("0.0");

		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setText("U");
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenidoSriDetalladosIva = new JLabelMe();
		this.jLabeltransfe_iva_retenidoSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO+" : *");
		this.jLabeltransfe_iva_retenidoSriDetalladosIva.setToolTipText("Transfe Iva Reteno");
		this.jLabeltransfe_iva_retenidoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenidoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenidoSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenidoSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPaneltransfe_iva_retenidoSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldtransfe_iva_retenidoSriDetalladosIva= new JTextFieldMe();
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.setEnabled(false);
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenidoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenidoSriDetalladosIva.setText("0.0");

		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setText("U");
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenidoSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenidoSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenidoSriDetalladosIva = new JLabelMe();
		this.jLabelpresta_iva_retenidoSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO+" : *");
		this.jLabelpresta_iva_retenidoSriDetalladosIva.setToolTipText("Presta Iva Reteno");
		this.jLabelpresta_iva_retenidoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenidoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenidoSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenidoSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelpresta_iva_retenidoSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jTextFieldpresta_iva_retenidoSriDetalladosIva= new JTextFieldMe();
		jTextFieldpresta_iva_retenidoSriDetalladosIva.setEnabled(false);
		jTextFieldpresta_iva_retenidoSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenidoSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenidoSriDetalladosIva.setText("0.0");

		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setText("U");
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenidoSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenidoSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenidoSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSriDetalladosIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_periodo_declaraSriDetalladosIva = new JLabelMe();
		this.jLabelid_periodo_declaraSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraSriDetalladosIva.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelid_periodo_declaraSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jComboBoxid_periodo_declaraSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_periodo_declaraSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraSriDetalladosIva= new JButtonMe();
		this.jButtonid_periodo_declaraSriDetalladosIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriDetalladosIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriDetalladosIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriDetalladosIva.setText("Buscar");
		this.jButtonid_periodo_declaraSriDetalladosIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraSriDetalladosIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriDetalladosIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriDetalladosIva"));

		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setText("U");
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setText("U");
		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraSriDetalladosIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriDetalladosIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriDetalladosIvaUpdate"));



					
		this.jLabelid_tipo_comprobanteSriDetalladosIva = new JLabelMe();
		this.jLabelid_tipo_comprobanteSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabelid_tipo_comprobanteSriDetalladosIva.setToolTipText("Tipo Comprobante");
		this.jLabelid_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobanteSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobanteSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelid_tipo_comprobanteSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jComboBoxid_tipo_comprobanteSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobanteSriDetalladosIva= new JButtonMe();
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setText("Buscar");
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobanteSriDetalladosIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteSriDetalladosIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteSriDetalladosIva"));

		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setText("U");
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setText("U");
		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteSriDetalladosIvaUpdate"));



					
		this.jLabelid_tipo_ivaSriDetalladosIva = new JLabelMe();
		this.jLabelid_tipo_ivaSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaSriDetalladosIva.setToolTipText("Tipo Iva");
		this.jLabelid_tipo_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelid_tipo_ivaSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jComboBoxid_tipo_ivaSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_tipo_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaSriDetalladosIva= new JButtonMe();
		this.jButtonid_tipo_ivaSriDetalladosIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriDetalladosIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriDetalladosIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriDetalladosIva.setText("Buscar");
		this.jButtonid_tipo_ivaSriDetalladosIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaSriDetalladosIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriDetalladosIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriDetalladosIva"));

		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setText("U");
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setText("U");
		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaSriDetalladosIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriDetalladosIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriDetalladosIvaUpdate"));



					
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva = new JLabelMe();
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA+" : *");
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva.setToolTipText("Tipo Retencion Iva");
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_ivaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_ivaSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelid_tipo_retencion_ivaSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jComboBoxid_tipo_retencion_ivaSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_ivaSriDetalladosIva= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setText("Buscar");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriDetalladosIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriDetalladosIva"));

		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setText("U");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriDetalladosIvaUpdate"));



					
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva.setText(""+SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA+" : *");
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva.setToolTipText("Tipo Retencion Iva Presta");
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_prestaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.setToolTipText(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		this.gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.setLayout(this.gridaBagLayoutSriDetalladosIva);


		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriDetalladosIva"));

		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda"));

		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate"));



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
		//this.jInternalFrameDetalleSriDetalladosIva = new SriDetalladosIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri Detallados Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriDetalladosIva= new GridBagLayout();
		

		
		String sToolTipSriDetalladosIva="";
		sToolTipSriDetalladosIva=SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriDetalladosIva+="(Sris.SriDetalladosIva)";
		}
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriDetalladosIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSriDetalladosIva = new JButtonMe();
		this.jButtonModificarSriDetalladosIva = new JButtonMe();
        this.jButtonActualizarSriDetalladosIva = new JButtonMe();
        this.jButtonEliminarSriDetalladosIva = new JButtonMe();
        this.jButtonCancelarSriDetalladosIva = new JButtonMe();
        this.jButtonGuardarCambiosSriDetalladosIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaSriDetalladosIva = new JButtonMe();
		this.jButtonCerrarSriDetalladosIva = new JButtonMe();
		
		this.jScrollPanelDatosSriDetalladosIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionSriDetalladosIva = new JScrollPane();
		this.jScrollPanelDatosGeneralSriDetalladosIva = new JScrollPane();
				
		
		
		this.jPanelCamposSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Detallados Iva";
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Detallados Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosSriDetalladosIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSriDetalladosIva.setName("jPanelCamposSriDetalladosIva"); 

		this.jPanelCamposOcultosSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSriDetalladosIva.setName("jPanelCamposOcultosSriDetalladosIva"); 

        this.jPanelAccionesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriDetalladosIva.setToolTipText("Acciones");
        this.jPanelAccionesSriDetalladosIva.setName("Acciones"); 

		this.jPanelAccionesFormularioSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSriDetalladosIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSriDetalladosIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSriDetalladosIva.setText("Nuevo");
		this.jButtonModificarSriDetalladosIva.setText("Editar");
        this.jButtonActualizarSriDetalladosIva.setText("Actualizar");
        this.jButtonEliminarSriDetalladosIva.setText("Eliminar");
        this.jButtonCancelarSriDetalladosIva.setText("Cancelar");
        this.jButtonGuardarCambiosSriDetalladosIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaSriDetalladosIva.setText("Guardar");
		this.jButtonCerrarSriDetalladosIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriDetalladosIva,"nuevo_button","Nuevo",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSriDetalladosIva,"modificar_button","Editar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSriDetalladosIva,"actualizar_button","Actualizar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSriDetalladosIva,"eliminar_button","Eliminar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSriDetalladosIva,"cancelar_button","Cancelar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSriDetalladosIva,"guardarcambios_button","Guardar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriDetalladosIva,"guardarcambiostabla_button","Guardar",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriDetalladosIva,"cerrar_button","Salir",this.sridetalladosivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSriDetalladosIva.setToolTipText("Nuevo"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSriDetalladosIva.setToolTipText("Editar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSriDetalladosIva.setToolTipText("Actualizar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSriDetalladosIva.setToolTipText("Eliminar)"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSriDetalladosIva.setToolTipText("Cancelar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSriDetalladosIva.setToolTipText("Guardar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSriDetalladosIva.setToolTipText("Guardar"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriDetalladosIva.setToolTipText("Salir"+" "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriDetalladosIva";
		inputMap = this.jButtonNuevoSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriDetalladosIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriDetalladosIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSriDetalladosIva";
		inputMap = this.jButtonActualizarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSriDetalladosIva"));
		
		//ELIMINAR
		sMapKey = "EliminarSriDetalladosIva";
		inputMap = this.jButtonEliminarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSriDetalladosIva"));
		
		//CANCELAR	
		sMapKey = "CancelarSriDetalladosIva";
		inputMap = this.jButtonCancelarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSriDetalladosIva"));
		
		//CERRAR		
		sMapKey = "CerrarSriDetalladosIva";
		inputMap = this.jButtonCerrarSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriDetalladosIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriDetalladosIva";
		inputMap = this.jButtonGuardarCambiosTablaSriDetalladosIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriDetalladosIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSriDetalladosIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSriDetalladosIva.setToolTipText("Nuevo SriDetalladosIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSriDetalladosIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSriDetalladosIva.setToolTipText("Sin Cerrar Ventana SriDetalladosIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSriDetalladosIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSriDetalladosIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSriDetalladosIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriDetalladosIva.setText("Accion");
		this.jComboBoxTiposAccionesSriDetalladosIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSriDetalladosIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSriDetalladosIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSriDetalladosIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSriDetalladosIva = new JLabelMe();
		
		this.jLabelAccionesSriDetalladosIva.setText("Acciones");		
		this.jLabelAccionesSriDetalladosIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriDetalladosIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriDetalladosIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSriDetalladosIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSriDetalladosIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSriDetalladosIva=new JTabbedPane();
		this.jTabbedPaneRelacionesSriDetalladosIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSriDetalladosIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSriDetalladosIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriDetalladosIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriDetalladosIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSriDetalladosIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriDetalladosIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriDetalladosIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSriDetalladosIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSriDetalladosIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSriDetalladosIva = new GridBagLayout();
		
		this.jPanelCamposSriDetalladosIva.setLayout(gridaBagLayoutCamposSriDetalladosIva);
		this.jPanelCamposOcultosSriDetalladosIva.setLayout(gridaBagLayoutCamposOcultosSriDetalladosIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSriDetalladosIva.add(jLabelIdSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSriDetalladosIva.add(jLabelidSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraSriDetalladosIva.add(jLabelid_periodo_declaraSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriDetalladosIva.add(jButtonid_periodo_declaraSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 3;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriDetalladosIva.add(jButtonid_periodo_declaraSriDetalladosIvaUpdate, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraSriDetalladosIva.add(jComboBoxid_periodo_declaraSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_comprobanteSriDetalladosIva.add(jLabelid_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteSriDetalladosIva.add(jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 3;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteSriDetalladosIva.add(jButtonid_tipo_comprobanteSriDetalladosIvaUpdate, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_comprobanteSriDetalladosIva.add(jComboBoxid_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSriDetalladosIva.add(jLabelrucSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSriDetalladosIva.add(jButtonrucSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSriDetalladosIva.add(jTextFieldrucSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_comprobanteSriDetalladosIva.add(jLabelnombre_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_comprobanteSriDetalladosIva.add(jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_comprobanteSriDetalladosIva.add(jscrollPanenombre_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_datoSriDetalladosIva.add(jLabelruc_datoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_datoSriDetalladosIva.add(jButtonruc_datoSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_datoSriDetalladosIva.add(jTextFieldruc_datoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoSriDetalladosIva.add(jLabelnumero_documentoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoSriDetalladosIva.add(jButtonnumero_documentoSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoSriDetalladosIva.add(jTextFieldnumero_documentoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSriDetalladosIva.add(jLabelfecha_emisionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSriDetalladosIva.add(jButtonfecha_emisionSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSriDetalladosIva.add(jDateChooserfecha_emisionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_registro_contableSriDetalladosIva.add(jLabelfecha_registro_contableSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableSriDetalladosIva.add(jButtonfecha_registro_contableSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_registro_contableSriDetalladosIva.add(jDateChooserfecha_registro_contableSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieSriDetalladosIva.add(jLabelnumero_serieSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieSriDetalladosIva.add(jButtonnumero_serieSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieSriDetalladosIva.add(jTextFieldnumero_serieSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaSriDetalladosIva.add(jLabeltotal_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaSriDetalladosIva.add(jButtontotal_ivaSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaSriDetalladosIva.add(jTextFieldtotal_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaSriDetalladosIva.add(jLabeltotal_sin_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaSriDetalladosIva.add(jButtontotal_sin_ivaSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaSriDetalladosIva.add(jTextFieldtotal_sin_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ivaSriDetalladosIva.add(jLabelid_tipo_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriDetalladosIva.add(jButtonid_tipo_ivaSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 3;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriDetalladosIva.add(jButtonid_tipo_ivaSriDetalladosIvaUpdate, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ivaSriDetalladosIva.add(jComboBoxid_tipo_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_ivaSriDetalladosIva.add(jLabelid_tipo_retencion_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriDetalladosIva.add(jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 3;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriDetalladosIva.add(jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_ivaSriDetalladosIva.add(jComboBoxid_tipo_retencion_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenidoSriDetalladosIva.add(jLabeltransfe_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenidoSriDetalladosIva.add(jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenidoSriDetalladosIva.add(jTextFieldtransfe_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.add(jLabelid_tipo_retencion_iva_prestaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.add(jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 3;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.add(jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.add(jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenidoSriDetalladosIva.add(jLabelpresta_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		//this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = 2;
		this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
		this.gridBagConstraintsSriDetalladosIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenidoSriDetalladosIva.add(jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda, this.gridBagConstraintsSriDetalladosIva);
	}

	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriDetalladosIva.gridy = 0;
	this.gridBagConstraintsSriDetalladosIva.gridx = 1;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenidoSriDetalladosIva.add(jTextFieldpresta_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelidSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelid_periodo_declaraSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelid_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelrucSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelnombre_tipo_comprobanteSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelruc_datoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelnumero_documentoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelfecha_emisionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelfecha_registro_contableSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelnumero_serieSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPaneltotal_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPaneltotal_sin_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelid_tipo_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelid_tipo_retencion_ivaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPaneltransfe_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
	}
	this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriDetalladosIva.gridy = iYPanelCamposSriDetalladosIva;
	this.gridBagConstraintsSriDetalladosIva.gridx = iXPanelCamposSriDetalladosIva++;
	this.gridBagConstraintsSriDetalladosIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriDetalladosIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriDetalladosIva.add(this.jPanelpresta_iva_retenidoSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);



	if(iXPanelCamposSriDetalladosIva % 2==0) {
		iXPanelCamposSriDetalladosIva=0;
		iYPanelCamposSriDetalladosIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesSriDetalladosIva= new GridBagLayout();
		this.jPanelAccionesSriDetalladosIva.setLayout(gridaBagLayoutAccionesSriDetalladosIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSriDetalladosIva= new GridBagLayout();
		this.jPanelAccionesFormularioSriDetalladosIva.setLayout(gridaBagLayoutAccionesFormularioSriDetalladosIva);
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSriDetalladosIva.add(this.jComboBoxTiposAccionesFormularioSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonModificarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);							

		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;
		this.gridBagConstraintsSriDetalladosIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonEliminarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonActualizarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);


		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;		
		this.gridBagConstraintsSriDetalladosIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonGuardarCambiosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);	
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = 0;		
		this.gridBagConstraintsSriDetalladosIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesSriDetalladosIva.add(this.jButtonCancelarSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriDetalladosIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriDetalladosIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();						
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;		
			//this.gridBagConstraintsSriDetalladosIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriDetalladosIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriDetalladosIva.gridx =0;
		this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriDetalladosIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSriDetalladosIva = new SriDetalladosIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri Detallados Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri Detallados Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Detallados Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriDetalladosIvaModel sridetalladosivaModel=new SriDetalladosIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//SriDetalladosIvaModel.SriDetalladosIvaFocusTraversalPolicy sridetalladosivaFocusTraversalPolicy = sridetalladosivaModel.new SriDetalladosIvaFocusTraversalPolicy(this);
			
			//sridetalladosivaFocusTraversalPolicy.setsridetalladosivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sridetalladosivaModel);
			
			
			this.jContentPaneDetalleSriDetalladosIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSriDetalladosIva = new GridBagLayout();	
			this.jContentPaneDetalleSriDetalladosIva.setLayout(gridaBagLayoutDetalleSriDetalladosIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriDetalladosIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
				this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSriDetalladosIva.gridx = 0;
					
				
				this.jContentPaneDetalleSriDetalladosIva.add(jTtoolBarDetalleSriDetalladosIva, gridBagConstraintsSriDetalladosIva);								
				
}
			
			this.jScrollPanelDatosEdicionSriDetalladosIva=   new JScrollPane(jContentPaneDetalleSriDetalladosIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriDetalladosIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriDetalladosIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriDetalladosIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSriDetalladosIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriDetalladosIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriDetalladosIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriDetalladosIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	        
			this.jContentPaneDetalleSriDetalladosIva.add(jPanelCamposSriDetalladosIva, gridBagConstraintsSriDetalladosIva);
			
			
			
			
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
						//&& sridetalladosivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSriDetalladosIva= new GridBagConstraints();
						this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSriDetalladosIva.gridx = 0;
						this.jContentPaneDetalleSriDetalladosIva.add(this.jTabbedPaneRelacionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSriDetalladosIva.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSriDetalladosIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
					this.gridBagConstraintsSriDetalladosIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSriDetalladosIva.gridx = 0;
					
				
					this.jContentPaneDetalleSriDetalladosIva.add(jPanelCamposOcultosSriDetalladosIva, gridBagConstraintsSriDetalladosIva);
				
					this.jPanelCamposOcultosSriDetalladosIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	        this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSriDetalladosIva.add(this.jPanelAccionesFormularioSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);							
			
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
	        this.gridBagConstraintsSriDetalladosIva.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSriDetalladosIva.gridx = 0;
	        
			
			this.jContentPaneDetalleSriDetalladosIva.add(this.jPanelAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSriDetalladosIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSriDetalladosIva=   new JScrollPane(this.jPanelCamposSriDetalladosIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriDetalladosIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriDetalladosIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriDetalladosIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;
			this.gridBagConstraintsSriDetalladosIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSriDetalladosIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSriDetalladosIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);			
			
			this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
			this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriDetalladosIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
			
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		
			
		this.gridBagConstraintsSriDetalladosIva = new GridBagConstraints();
		this.gridBagConstraintsSriDetalladosIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriDetalladosIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriDetalladosIva, this.gridBagConstraintsSriDetalladosIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSriDetalladosIva;//jContentPane;
		
		return jScrollPanelDatosEdicionSriDetalladosIva;
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
