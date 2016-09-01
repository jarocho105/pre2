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
import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaConstantesFunciones;

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
public class CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame extends CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarEstadosCuentasPorFactura;
	
	protected JMenuBar jmenuBarDetalleCobrarEstadosCuentasPorFactura;
	
	protected JMenu jmenuDetalleCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuDetalleArchivoCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuDetalleAccionesCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuDetalleDatosCobrarEstadosCuentasPorFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarEstadosCuentasPorFactura;	
	protected GridBagConstraints gridBagConstraintsCobrarEstadosCuentasPorFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarEstadosCuentasPorFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarEstadosCuentasPorFacturaSessionBean cobrarestadoscuentasporfacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarEstadosCuentasPorFacturaLogic cobrarestadoscuentasporfacturaLogic;
	
	public JScrollPane jScrollPanelDatosCobrarEstadosCuentasPorFactura;
	public JScrollPane jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura;
	public JScrollPane jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura;
	
	protected JPanel jPanelCamposCobrarEstadosCuentasPorFactura;    
	protected JPanel jPanelCamposOcultosCobrarEstadosCuentasPorFactura;    	
	protected JPanel jPanelAccionesCobrarEstadosCuentasPorFactura;
	protected JPanel jPanelAccionesFormularioCobrarEstadosCuentasPorFactura;
    
	
	
	protected Integer iXPanelCamposCobrarEstadosCuentasPorFactura=0;
	protected Integer iYPanelCamposCobrarEstadosCuentasPorFactura=0;
	
	protected Integer iXPanelCamposOcultosCobrarEstadosCuentasPorFactura=0;
	protected Integer iYPanelCamposOcultosCobrarEstadosCuentasPorFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarEstadosCuentasPorFactura;
	public JButton jButtonModificarCobrarEstadosCuentasPorFactura;
	public JButton jButtonActualizarCobrarEstadosCuentasPorFactura;
    public JButton jButtonEliminarCobrarEstadosCuentasPorFactura;
	public JButton jButtonCancelarCobrarEstadosCuentasPorFactura;
    public JButton jButtonGuardarCambiosCobrarEstadosCuentasPorFactura;
	public JButton jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCerrarCobrarEstadosCuentasPorFactura;
	
	
	protected JButton jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonModificarToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonActualizarToolBarCobrarEstadosCuentasPorFactura;
    protected JButton jButtonEliminarToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCancelarToolBarCobrarEstadosCuentasPorFactura;
    protected JButton jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCerrarToolBarCobrarEstadosCuentasPorFactura;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarEstadosCuentasPorFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemModificarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemActualizarCobrarEstadosCuentasPorFactura;
    protected JMenuItem jMenuItemEliminarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemCancelarCobrarEstadosCuentasPorFactura;
    protected JMenuItem jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemCerrarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarEstadosCuentasPorFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarEstadosCuentasPorFactura;
	public JLabel jLabelIdCobrarEstadosCuentasPorFactura;
	public JLabel jLabelidCobrarEstadosCuentasPorFactura;
	public JButton jButtonidCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura;
	public JButton jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnombre_ciudadCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura;
	public JButton jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnombre_zonaCobrarEstadosCuentasPorFactura;
	public JTextField jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura;
	public JButton jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnombre_completoCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreanombre_completoCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanenombre_completoCobrarEstadosCuentasPorFactura;
	public JButton jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelrucCobrarEstadosCuentasPorFactura;
	public JLabel jLabelrucCobrarEstadosCuentasPorFactura;
	public JTextField jTextFieldrucCobrarEstadosCuentasPorFactura;
	public JButton jButtonrucCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelrepresentanteCobrarEstadosCuentasPorFactura;
	public JLabel jLabelrepresentanteCobrarEstadosCuentasPorFactura;
	public JTextArea jTextArearepresentanteCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanerepresentanteCobrarEstadosCuentasPorFactura;
	public JButton jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldia_pagoCobrarEstadosCuentasPorFactura;
	public JLabel jLabeldia_pagoCobrarEstadosCuentasPorFactura;
	public JTextField jTextFielddia_pagoCobrarEstadosCuentasPorFactura;
	public JButton jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelhora_pagoCobrarEstadosCuentasPorFactura;
	public JLabel jLabelhora_pagoCobrarEstadosCuentasPorFactura;
	public JSpinner jSpinnerhora_pagoCobrarEstadosCuentasPorFactura= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelobservacionCobrarEstadosCuentasPorFactura;
	public JLabel jLabelobservacionCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreaobservacionCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPaneobservacionCobrarEstadosCuentasPorFactura;
	public JButton jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_transaccionCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnombre_transaccionCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura;
	public JButton jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_venceCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_venceCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_venceCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_emisionCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura;
	public JTextField jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura;
	public JButton jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelnumero_facturaCobrarEstadosCuentasPorFactura;
	public JTextField jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura;
	public JButton jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localCobrarEstadosCuentasPorFactura;
	public JLabel jLabeldebito_mone_localCobrarEstadosCuentasPorFactura;
	public JTextField jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura;
	public JButton jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localCobrarEstadosCuentasPorFactura;
	public JLabel jLabelcredito_mone_localCobrarEstadosCuentasPorFactura;
	public JTextField jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura;
	public JButton jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarEstadosCuentasPorFactura;
	public JLabel jLabeldireccion_direccionCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura;
	public JButton jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura;
	public JLabel jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura;
	public JTextArea jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura;
	public JScrollPane jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura;
	public JButton jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelid_empresaCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarEstadosCuentasPorFactura;
	public JButton jButtonid_empresaCobrarEstadosCuentasPorFactura= new JButtonMe();
	public JButton jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=799;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarEstadosCuentasPorFactura=new JPanel();
				this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura=new JPanel();
				this.jmenuBarDetalleCobrarEstadosCuentasPorFactura=new JMenuBar();
				this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarEstadosCuentasPorFactura() {
		return this.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura;
	}
	
	public JButton getjButtonEliminarToolBarCobrarEstadosCuentasPorFactura() {
		return this.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura;
	}
	
	public JButton getjButtonCancelarToolBarCobrarEstadosCuentasPorFactura() {
		return this.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarEstadosCuentasPorFactura() {
		return this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarEstadosCuentasPorFactura)	{
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura = jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura = jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura = jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura = jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
		
		this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarestadoscuentasporfacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarEstadosCuentasPorFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Estados Cuentas Por Factura MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarEstadosCuentasPorFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarEstadosCuentasPorFactura=new JButtonMe();
				this.jButtonModificarToolBarCobrarEstadosCuentasPorFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura,
							"actualizar","actualizar","Actualizar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura,
							"eliminar","eliminar","Eliminar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura,
							"cancelar","cancelar","Cancelar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarDetalleCobrarEstadosCuentasPorFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarEstadosCuentasPorFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarEstadosCuentasPorFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarEstadosCuentasPorFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarEstadosCuentasPorFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarEstadosCuentasPorFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarEstadosCuentasPorFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarEstadosCuentasPorFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarEstadosCuentasPorFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarEstadosCuentasPorFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarEstadosCuentasPorFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarEstadosCuentasPorFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarEstadosCuentasPorFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarEstadosCuentasPorFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarEstadosCuentasPorFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarEstadosCuentasPorFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarEstadosCuentasPorFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarEstadosCuentasPorFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarEstadosCuentasPorFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarEstadosCuentasPorFactura.add(this.jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura);
		
		this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemActualizarCobrarEstadosCuentasPorFactura);
		this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemEliminarCobrarEstadosCuentasPorFactura);
		this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemCancelarCobrarEstadosCuentasPorFactura);		
		
		//this.jmenuDetalleDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura);				
		this.jmenuDetalleDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura);				
				
		//this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarEstadosCuentasPorFactura.add(this.jmenuDetalleArchivoCobrarEstadosCuentasPorFactura);		
		this.jmenuBarDetalleCobrarEstadosCuentasPorFactura.add(this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura);		
		this.jmenuBarDetalleCobrarEstadosCuentasPorFactura.add(this.jmenuDetalleDatosCobrarEstadosCuentasPorFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarEstadosCuentasPorFactura);				
	}
	
	
	public void inicializarElementosCamposCobrarEstadosCuentasPorFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarEstadosCuentasPorFactura = new JLabelMe();
		jLabelIdCobrarEstadosCuentasPorFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarEstadosCuentasPorFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura= new GridBagLayout();

		this.jPanelidCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);

		jLabelidCobrarEstadosCuentasPorFactura = new JLabel();
		jLabelidCobrarEstadosCuentasPorFactura.setText("Id");

		jLabelidCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_emision_desdeCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_emision_hastaCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE+" : *");
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Vence Desde");
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEDESDE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_vence_desdeCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vence_desdeCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA+" : *");
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Vence Hasta");
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCEHASTA);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_vence_hastaCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vence_hastaCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura);
		jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura);
		jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura= new JTextFieldMe();

		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnombre_completoCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreanombre_completoCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreanombre_completoCobrarEstadosCuentasPorFactura);
		jscrollPanenombre_completoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelrucCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelrucCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucCobrarEstadosCuentasPorFactura.setToolTipText("Ruc");
		this.jLabelrucCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelrucCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFieldrucCobrarEstadosCuentasPorFactura= new JTextFieldMe();

		jTextFieldrucCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFieldrucCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE+" : *");
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura.setToolTipText("Representante");
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentanteCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentanteCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentanteCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_REPRESENTANTE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelrepresentanteCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextArearepresentanteCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearepresentanteCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentanteCobrarEstadosCuentasPorFactura = new JScrollPane(jTextArearepresentanteCobrarEstadosCuentasPorFactura);
		jscrollPanerepresentanteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanerepresentanteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanerepresentanteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentanteCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representanteCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO+" : *");
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura.setToolTipText("Dia Pago");
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_pagoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_pagoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_pagoCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_pagoCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIAPAGO);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPaneldia_pagoCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFielddia_pagoCobrarEstadosCuentasPorFactura= new JTextFieldMe();
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_pagoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.setText("0");

		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_pagoCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_pagoCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO+" : *");
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura.setToolTipText("Hora Pago");
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_pagoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_pagoCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_pagoCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_HORAPAGO);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelhora_pagoCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldhora_pagoCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_pagoCobrarEstadosCuentasPorFactura = new JSpinner.DateEditor(jSpinnerhora_pagoCobrarEstadosCuentasPorFactura, "HH:mm:ss");

		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setEditor(timeEditorhora_pagoCobrarEstadosCuentasPorFactura);

		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setValue(new Date());

		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_pagoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setValue(new Date());
		//jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_pagoCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_pagoCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_pagoCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelobservacionCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelobservacionCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionCobrarEstadosCuentasPorFactura.setToolTipText("Observacion");
		this.jLabelobservacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelobservacionCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreaobservacionCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreaobservacionCobrarEstadosCuentasPorFactura);
		jscrollPaneobservacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPaneobservacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPaneobservacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION+" : *");
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura.setToolTipText("Nombre Transaccion");
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_transaccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_transaccionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NOMBRETRANSACCION);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura);
		jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_transaccionCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_venceCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_venceCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		//jFormattedTextFieldfecha_emisionCobrarEstadosCuentasPorFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setEnabled(false);
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura= new JTextFieldMe();

		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura= new JTextFieldMe();

		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura= new JTextFieldMe();
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.setText("0.0");

		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura= new JTextFieldMe();
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.setText("0.0");

		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura);
		jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setEnabled(false);
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura = new JScrollPane(jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura);
		jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarEstadosCuentasPorFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura = new JLabelMe();
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura.setText(""+CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarEstadosCuentasPorFactura.setToolTipText(CobrarEstadosCuentasPorFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		this.jPanelid_empresaCobrarEstadosCuentasPorFactura.setLayout(this.gridaBagLayoutCobrarEstadosCuentasPorFactura);


		jComboBoxid_empresaCobrarEstadosCuentasPorFactura= new JComboBoxMe();
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.setEnabled(false);

		this.jButtonid_empresaCobrarEstadosCuentasPorFactura= new JButtonMe();
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setText("Buscar");
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarEstadosCuentasPorFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarEstadosCuentasPorFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarEstadosCuentasPorFactura"));

		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setText("U");
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarEstadosCuentasPorFacturaBusqueda"));

		if(this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setText("U");
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarEstadosCuentasPorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarEstadosCuentasPorFacturaUpdate"));



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
		//this.jInternalFrameDetalleCobrarEstadosCuentasPorFactura = new CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Estados Cuentas Por Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura= new GridBagLayout();
		

		
		String sToolTipCobrarEstadosCuentasPorFactura="";
		sToolTipCobrarEstadosCuentasPorFactura=CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarEstadosCuentasPorFactura+="(Cartera.CobrarEstadosCuentasPorFactura)";
		}
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarEstadosCuentasPorFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonModificarCobrarEstadosCuentasPorFactura = new JButtonMe();
        this.jButtonActualizarCobrarEstadosCuentasPorFactura = new JButtonMe();
        this.jButtonEliminarCobrarEstadosCuentasPorFactura = new JButtonMe();
        this.jButtonCancelarCobrarEstadosCuentasPorFactura = new JButtonMe();
        this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonCerrarCobrarEstadosCuentasPorFactura = new JButtonMe();
		
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Estados Cuentas Por Factura";
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarEstadosCuentasPorFactura.setName("jPanelCamposCobrarEstadosCuentasPorFactura"); 

		this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.setName("jPanelCamposOcultosCobrarEstadosCuentasPorFactura"); 

        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setToolTipText("Acciones");
        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarEstadosCuentasPorFactura.setText("Nuevo");
		this.jButtonModificarCobrarEstadosCuentasPorFactura.setText("Editar");
        this.jButtonActualizarCobrarEstadosCuentasPorFactura.setText("Actualizar");
        this.jButtonEliminarCobrarEstadosCuentasPorFactura.setText("Eliminar");
        this.jButtonCancelarCobrarEstadosCuentasPorFactura.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setText("Guardar");
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarEstadosCuentasPorFactura,"nuevo_button","Nuevo",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarEstadosCuentasPorFactura,"modificar_button","Editar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarEstadosCuentasPorFactura,"actualizar_button","Actualizar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarEstadosCuentasPorFactura,"eliminar_button","Eliminar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarEstadosCuentasPorFactura,"cancelar_button","Cancelar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura,"guardarcambios_button","Guardar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura,"guardarcambiostabla_button","Guardar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarEstadosCuentasPorFactura,"cerrar_button","Salir",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.setToolTipText("Nuevo"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarEstadosCuentasPorFactura.setToolTipText("Editar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarEstadosCuentasPorFactura.setToolTipText("Actualizar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarEstadosCuentasPorFactura.setToolTipText("Eliminar)"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarEstadosCuentasPorFactura.setToolTipText("Cancelar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura.setToolTipText("Guardar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setToolTipText("Guardar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.setToolTipText("Salir"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarEstadosCuentasPorFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonActualizarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarEstadosCuentasPorFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonEliminarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarEstadosCuentasPorFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCancelarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarEstadosCuentasPorFactura"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCerrarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarEstadosCuentasPorFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarEstadosCuentasPorFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura.setToolTipText("Nuevo CobrarEstadosCuentasPorFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura.setToolTipText("Sin Cerrar Ventana CobrarEstadosCuentasPorFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setText("Accion");
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarEstadosCuentasPorFactura = new JLabelMe();
		
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setText("Acciones");		
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarEstadosCuentasPorFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarEstadosCuentasPorFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarEstadosCuentasPorFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarEstadosCuentasPorFactura = new GridBagLayout();
		
		this.jPanelCamposCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutCamposCobrarEstadosCuentasPorFactura);
		this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutCamposOcultosCobrarEstadosCuentasPorFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarEstadosCuentasPorFactura.add(jLabelIdCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarEstadosCuentasPorFactura.add(jLabelidCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarEstadosCuentasPorFactura.add(jLabelid_empresaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarEstadosCuentasPorFactura.add(jButtonid_empresaCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 3;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarEstadosCuentasPorFactura.add(jButtonid_empresaCobrarEstadosCuentasPorFacturaUpdate, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarEstadosCuentasPorFactura.add(jComboBoxid_empresaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.add(jLabelfecha_emision_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.add(jButtonfecha_emision_desdeCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_emision_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.add(jLabelfecha_emision_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.add(jButtonfecha_emision_hastaCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_emision_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.add(jLabelfecha_vence_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.add(jButtonfecha_vence_desdeCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_vence_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.add(jLabelfecha_vence_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.add(jButtonfecha_vence_hastaCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_vence_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.add(jLabelnombre_cuenta_contableCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.add(jButtonnombre_cuenta_contableCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura.add(jscrollPanenombre_cuenta_contableCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.add(jLabelnombre_ciudadCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.add(jButtonnombre_ciudadCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura.add(jscrollPanenombre_ciudadCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.add(jLabelnombre_zonaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.add(jButtonnombre_zonaCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura.add(jTextFieldnombre_zonaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarEstadosCuentasPorFactura.add(jLabelnombre_completoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarEstadosCuentasPorFactura.add(jButtonnombre_completoCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarEstadosCuentasPorFactura.add(jscrollPanenombre_completoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucCobrarEstadosCuentasPorFactura.add(jLabelrucCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucCobrarEstadosCuentasPorFactura.add(jButtonrucCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucCobrarEstadosCuentasPorFactura.add(jTextFieldrucCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentanteCobrarEstadosCuentasPorFactura.add(jLabelrepresentanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentanteCobrarEstadosCuentasPorFactura.add(jButtonrepresentanteCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentanteCobrarEstadosCuentasPorFactura.add(jscrollPanerepresentanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_pagoCobrarEstadosCuentasPorFactura.add(jLabeldia_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_pagoCobrarEstadosCuentasPorFactura.add(jButtondia_pagoCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_pagoCobrarEstadosCuentasPorFactura.add(jTextFielddia_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_pagoCobrarEstadosCuentasPorFactura.add(jLabelhora_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_pagoCobrarEstadosCuentasPorFactura.add(jButtonhora_pagoCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_pagoCobrarEstadosCuentasPorFactura.add(jSpinnerhora_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionCobrarEstadosCuentasPorFactura.add(jLabelobservacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionCobrarEstadosCuentasPorFactura.add(jButtonobservacionCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionCobrarEstadosCuentasPorFactura.add(jscrollPaneobservacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.add(jLabelnombre_transaccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.add(jButtonnombre_transaccionCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura.add(jscrollPanenombre_transaccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceCobrarEstadosCuentasPorFactura.add(jLabelfecha_venceCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceCobrarEstadosCuentasPorFactura.add(jButtonfecha_venceCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_venceCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.add(jLabelfecha_emisionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.add(jButtonfecha_emisionCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_emisionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.add(jLabelnumero_comprobanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.add(jButtonnumero_comprobanteCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura.add(jTextFieldnumero_comprobanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.add(jLabelnumero_facturaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.add(jButtonnumero_facturaCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura.add(jTextFieldnumero_facturaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.add(jLabeldebito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.add(jButtondebito_mone_localCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura.add(jTextFielddebito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.add(jLabelcredito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.add(jButtoncredito_mone_localCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura.add(jTextFieldcredito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.add(jLabeldireccion_direccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.add(jButtondireccion_direccionCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura.add(jscrollPanedireccion_direccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.add(jLabeltelefono_telefonoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 2;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.add(jButtontelefono_telefonoCobrarEstadosCuentasPorFacturaBusqueda, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	}

	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura.add(jscrollPanetelefono_telefonoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelidCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_emision_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_emision_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_vence_desdeCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_vence_hastaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnombre_cuenta_contableCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnombre_ciudadCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnombre_zonaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnombre_completoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelrucCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelrepresentanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPaneldia_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelhora_pagoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelobservacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnombre_transaccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_venceCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelfecha_emisionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnumero_comprobanteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelnumero_facturaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPaneldebito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPanelcredito_mone_localCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPaneldireccion_direccionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarEstadosCuentasPorFactura.add(this.jPaneltelefono_telefonoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposCobrarEstadosCuentasPorFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iYPanelCamposOcultosCobrarEstadosCuentasPorFactura;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iXPanelCamposOcultosCobrarEstadosCuentasPorFactura++;
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarEstadosCuentasPorFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.add(this.jPanelid_empresaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);



	if(iXPanelCamposOcultosCobrarEstadosCuentasPorFactura % 3==0) {
		iXPanelCamposOcultosCobrarEstadosCuentasPorFactura=0;
		iYPanelCamposOcultosCobrarEstadosCuentasPorFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarEstadosCuentasPorFactura= new GridBagLayout();
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutAccionesCobrarEstadosCuentasPorFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarEstadosCuentasPorFactura= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutAccionesFormularioCobrarEstadosCuentasPorFactura);
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposAccionesFormularioCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonModificarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);							

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonEliminarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonActualizarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonGuardarCambiosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);	
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonCancelarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarEstadosCuentasPorFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();						
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;		
			//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarEstadosCuentasPorFactura = new CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Estados Cuentas Por Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Estados Cuentas Por Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Estados Cuentas Por Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarEstadosCuentasPorFacturaModel cobrarestadoscuentasporfacturaModel=new CobrarEstadosCuentasPorFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarEstadosCuentasPorFacturaModel.CobrarEstadosCuentasPorFacturaFocusTraversalPolicy cobrarestadoscuentasporfacturaFocusTraversalPolicy = cobrarestadoscuentasporfacturaModel.new CobrarEstadosCuentasPorFacturaFocusTraversalPolicy(this);
			
			//cobrarestadoscuentasporfacturaFocusTraversalPolicy.setcobrarestadoscuentasporfacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarestadoscuentasporfacturaModel);
			
			
			this.jContentPaneDetalleCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarEstadosCuentasPorFactura = new GridBagLayout();	
			this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutDetalleCobrarEstadosCuentasPorFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarEstadosCuentasPorFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(jTtoolBarDetalleCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura=   new JScrollPane(jContentPaneDetalleCobrarEstadosCuentasPorFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	        
			this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(jPanelCamposCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			
			
			
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
						//&& cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarEstadosCuentasPorFactura= new GridBagConstraints();
						this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
						this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
					this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(jPanelCamposOcultosCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);
				
					this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);							
			
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarEstadosCuentasPorFactura.add(this.jPanelAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura=   new JScrollPane(this.jPanelCamposCobrarEstadosCuentasPorFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura;
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
