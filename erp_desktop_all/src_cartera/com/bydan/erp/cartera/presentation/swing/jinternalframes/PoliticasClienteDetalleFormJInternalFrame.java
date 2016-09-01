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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.PoliticasClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class PoliticasClienteDetalleFormJInternalFrame extends PoliticasClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePoliticasCliente;
	
	protected JMenuBar jmenuBarDetallePoliticasCliente;
	
	protected JMenu jmenuDetallePoliticasCliente;
	protected JMenu jmenuDetalleArchivoPoliticasCliente;
	protected JMenu jmenuDetalleAccionesPoliticasCliente;
	protected JMenu jmenuDetalleDatosPoliticasCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticasCliente;	
	protected GridBagConstraints gridBagConstraintsPoliticasCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PoliticasClienteBeanSwingJInternalFrameAdditional jInternalFrameDetallePoliticasCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected LineaNegocioBeanSwingJInternalFrame lineanegocioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineanegocio="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected EstadoPoliticasClienteBeanSwingJInternalFrame estadopoliticasclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopoliticascliente="";
	
	public PoliticasClienteSessionBean politicasclienteSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public LineaNegocioSessionBean lineanegocioSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean;	
	
	public PoliticasClienteLogic politicasclienteLogic;
	
	public JScrollPane jScrollPanelDatosPoliticasCliente;
	public JScrollPane jScrollPanelDatosEdicionPoliticasCliente;
	public JScrollPane jScrollPanelDatosGeneralPoliticasCliente;
	
	protected JPanel jPanelCamposPoliticasCliente;    
	protected JPanel jPanelCamposOcultosPoliticasCliente;    	
	protected JPanel jPanelAccionesPoliticasCliente;
	protected JPanel jPanelAccionesFormularioPoliticasCliente;
    
	
	
	protected Integer iXPanelCamposPoliticasCliente=0;
	protected Integer iYPanelCamposPoliticasCliente=0;
	
	protected Integer iXPanelCamposOcultosPoliticasCliente=0;
	protected Integer iYPanelCamposOcultosPoliticasCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPoliticasCliente;
	public JButton jButtonModificarPoliticasCliente;
	public JButton jButtonActualizarPoliticasCliente;
    public JButton jButtonEliminarPoliticasCliente;
	public JButton jButtonCancelarPoliticasCliente;
    public JButton jButtonGuardarCambiosPoliticasCliente;
	public JButton jButtonGuardarCambiosTablaPoliticasCliente;
	protected JButton jButtonCerrarPoliticasCliente;
	
	
	protected JButton jButtonProcesarInformacionPoliticasCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPoliticasCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPoliticasCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajePoliticasCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticasCliente;
	protected JButton jButtonModificarToolBarPoliticasCliente;
	protected JButton jButtonActualizarToolBarPoliticasCliente;
    protected JButton jButtonEliminarToolBarPoliticasCliente;
	protected JButton jButtonCancelarToolBarPoliticasCliente;
    protected JButton jButtonGuardarCambiosToolBarPoliticasCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarPoliticasCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticasCliente;
	protected JButton jButtonCerrarToolBarPoliticasCliente;
	
	protected JButton jButtonProcesarInformacionToolBarPoliticasCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticasCliente;
	protected JMenuItem jMenuItemModificarPoliticasCliente;
	protected JMenuItem jMenuItemActualizarPoliticasCliente;
    protected JMenuItem jMenuItemEliminarPoliticasCliente;
	protected JMenuItem jMenuItemCancelarPoliticasCliente;
    protected JMenuItem jMenuItemGuardarCambiosPoliticasCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticasCliente;
	protected JMenuItem jMenuItemCerrarPoliticasCliente;
	protected JMenuItem jMenuItemDetalleCerrarPoliticasCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticasCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionPoliticasCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticasCliente;
	protected JMenuItem jMenuItemMostrarOcultarPoliticasCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticasCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticasCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticasCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPoliticasCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanellimite_creditoPoliticasCliente;
	public JLabel jLabellimite_creditoPoliticasCliente;
	public JTextField jTextFieldlimite_creditoPoliticasCliente;
	public JButton jButtonlimite_creditoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioPoliticasCliente;
	public JLabel jLabelfecha_inicioPoliticasCliente;
	//public JFormattedTextField jDateChooserfecha_inicioPoliticasCliente;

	public JDateChooser jDateChooserfecha_inicioPoliticasCliente;
	public JButton jButtonfecha_inicioPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_renovacionPoliticasCliente;
	public JLabel jLabelfecha_renovacionPoliticasCliente;
	//public JFormattedTextField jDateChooserfecha_renovacionPoliticasCliente;

	public JDateChooser jDateChooserfecha_renovacionPoliticasCliente;
	public JButton jButtonfecha_renovacionPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finPoliticasCliente;
	public JLabel jLabelfecha_finPoliticasCliente;
	//public JFormattedTextField jDateChooserfecha_finPoliticasCliente;

	public JDateChooser jDateChooserfecha_finPoliticasCliente;
	public JButton jButtonfecha_finPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPaneldias_neto_pagoPoliticasCliente;
	public JLabel jLabeldias_neto_pagoPoliticasCliente;
	public JTextField jTextFielddias_neto_pagoPoliticasCliente;
	public JButton jButtondias_neto_pagoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPaneldias_graciaPoliticasCliente;
	public JLabel jLabeldias_graciaPoliticasCliente;
	public JTextField jTextFielddias_graciaPoliticasCliente;
	public JButton jButtondias_graciaPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelcupoPoliticasCliente;
	public JLabel jLabelcupoPoliticasCliente;
	public JTextField jTextFieldcupoPoliticasCliente;
	public JButton jButtoncupoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_generalPoliticasCliente;
	public JLabel jLabeldescuento_generalPoliticasCliente;
	public JTextField jTextFielddescuento_generalPoliticasCliente;
	public JButton jButtondescuento_generalPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_pronto_pagoPoliticasCliente;
	public JLabel jLabeldescuento_pronto_pagoPoliticasCliente;
	public JTextField jTextFielddescuento_pronto_pagoPoliticasCliente;
	public JButton jButtondescuento_pronto_pagoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelcon_lista_precioPoliticasCliente;
	public JLabel jLabelcon_lista_precioPoliticasCliente;
	public JCheckBox jCheckBoxcon_lista_precioPoliticasCliente;
	public JButton jButtoncon_lista_precioPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelcon_impuestosPoliticasCliente;
	public JLabel jLabelcon_impuestosPoliticasCliente;
	public JCheckBox jCheckBoxcon_impuestosPoliticasCliente;
	public JButton jButtoncon_impuestosPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelactivar_monto_facturacionPoliticasCliente;
	public JLabel jLabelactivar_monto_facturacionPoliticasCliente;
	public JCheckBox jCheckBoxactivar_monto_facturacionPoliticasCliente;
	public JButton jButtonactivar_monto_facturacionPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_sobregiroPoliticasCliente;
	public JLabel jLabelvalor_sobregiroPoliticasCliente;
	public JTextField jTextFieldvalor_sobregiroPoliticasCliente;
	public JButton jButtonvalor_sobregiroPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venci_sobregiroPoliticasCliente;
	public JLabel jLabelfecha_venci_sobregiroPoliticasCliente;
	//public JFormattedTextField jDateChooserfecha_venci_sobregiroPoliticasCliente;

	public JDateChooser jDateChooserfecha_venci_sobregiroPoliticasCliente;
	public JButton jButtonfecha_venci_sobregiroPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_solicitadoPoliticasCliente;
	public JLabel jLabelvalor_solicitadoPoliticasCliente;
	public JTextField jTextFieldvalor_solicitadoPoliticasCliente;
	public JButton jButtonvalor_solicitadoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_aprobadoPoliticasCliente;
	public JLabel jLabelvalor_aprobadoPoliticasCliente;
	public JTextField jTextFieldvalor_aprobadoPoliticasCliente;
	public JButton jButtonvalor_aprobadoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_solicitudPoliticasCliente;
	public JLabel jLabelfecha_solicitudPoliticasCliente;
	//public JFormattedTextField jDateChooserfecha_solicitudPoliticasCliente;

	public JDateChooser jDateChooserfecha_solicitudPoliticasCliente;
	public JButton jButtonfecha_solicitudPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelobsevacionPoliticasCliente;
	public JLabel jLabelobsevacionPoliticasCliente;
	public JTextArea jTextAreaobsevacionPoliticasCliente;
	public JScrollPane jscrollPaneobsevacionPoliticasCliente;
	public JButton jButtonobsevacionPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelwebPoliticasCliente;
	public JLabel jLabelwebPoliticasCliente;
	public JTextArea jTextAreawebPoliticasCliente;
	public JScrollPane jscrollPanewebPoliticasCliente;
	public JButton jButtonwebPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelcasilla_postalPoliticasCliente;
	public JLabel jLabelcasilla_postalPoliticasCliente;
	public JTextField jTextFieldcasilla_postalPoliticasCliente;
	public JButton jButtoncasilla_postalPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelforma_envioPoliticasCliente;
	public JLabel jLabelforma_envioPoliticasCliente;
	public JTextArea jTextAreaforma_envioPoliticasCliente;
	public JScrollPane jscrollPaneforma_envioPoliticasCliente;
	public JButton jButtonforma_envioPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaPoliticasCliente;
	public JLabel jLabelnumero_cuentaPoliticasCliente;
	public JTextField jTextFieldnumero_cuentaPoliticasCliente;
	public JButton jButtonnumero_cuentaPoliticasClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clientePoliticasCliente;
	public JLabel jLabelid_clientePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePoliticasCliente;
	public JButton jButtonid_clientePoliticasCliente= new JButtonMe();
	public JButton jButtonid_clientePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_clientePoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaPoliticasCliente;
	public JLabel jLabelid_empresaPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPoliticasCliente;
	public JButton jButtonid_empresaPoliticasCliente= new JButtonMe();
	public JButton jButtonid_empresaPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioPoliticasCliente;
	public JLabel jLabelid_tipo_precioPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioPoliticasCliente;
	public JButton jButtonid_tipo_precioPoliticasCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transportePoliticasCliente;
	public JLabel jLabelid_transportePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportePoliticasCliente;
	public JButton jButtonid_transportePoliticasCliente= new JButtonMe();
	public JButton jButtonid_transportePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_transportePoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_negocioPoliticasCliente;
	public JLabel jLabelid_linea_negocioPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_negocioPoliticasCliente;
	public JButton jButtonid_linea_negocioPoliticasCliente= new JButtonMe();
	public JButton jButtonid_linea_negocioPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_linea_negocioPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoPoliticasCliente;
	public JLabel jLabelid_bancoPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoPoliticasCliente;
	public JButton jButtonid_bancoPoliticasCliente= new JButtonMe();
	public JButton jButtonid_bancoPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_bancoPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalPoliticasCliente;
	public JLabel jLabelid_tipo_cuenta_banco_globalPoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente;
	public JButton jButtonid_tipo_cuenta_banco_globalPoliticasCliente= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_politicas_clientePoliticasCliente;
	public JLabel jLabelid_estado_politicas_clientePoliticasCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_politicas_clientePoliticasCliente;
	public JButton jButtonid_estado_politicas_clientePoliticasCliente= new JButtonMe();
	public JButton jButtonid_estado_politicas_clientePoliticasClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_politicas_clientePoliticasClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPoliticasCliente;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=968;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PoliticasClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPoliticasCliente=new JPanel();
				this.jPanelAccionesFormularioPoliticasCliente=new JPanel();
				this.jmenuBarDetallePoliticasCliente=new JMenuBar();
				this.jTtoolBarDetallePoliticasCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PoliticasClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticasClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticasCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPoliticasCliente() {
		return this.jButtonActualizarToolBarPoliticasCliente;
	}
	
	public JButton getjButtonEliminarToolBarPoliticasCliente() {
		return this.jButtonEliminarToolBarPoliticasCliente;
	}
	
	public JButton getjButtonCancelarToolBarPoliticasCliente() {
		return this.jButtonCancelarToolBarPoliticasCliente;
	}		
	
	public JButton getjButtonProcesarInformacionPoliticasCliente() {
		return this.jButtonProcesarInformacionPoliticasCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticasCliente)	{
		this.jButtonProcesarInformacionPoliticasCliente = jButtonProcesarInformacionPoliticasCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticasCliente() {
		return this.jComboBoxTiposAccionesPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticasCliente(
			JComboBox jComboBoxTiposRelacionesPoliticasCliente) {
		this.jComboBoxTiposRelacionesPoliticasCliente = jComboBoxTiposRelacionesPoliticasCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticasCliente(
			JComboBox jComboBoxTiposAccionesPoliticasCliente) {
		this.jComboBoxTiposAccionesPoliticasCliente = jComboBoxTiposAccionesPoliticasCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPoliticasCliente() {
		return this.jComboBoxTiposAccionesFormularioPoliticasCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPoliticasCliente(
			JComboBox jComboBoxTiposAccionesFormularioPoliticasCliente) {
		this.jComboBoxTiposAccionesFormularioPoliticasCliente = jComboBoxTiposAccionesFormularioPoliticasCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		
		this.politicasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicasclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticasClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politicas Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePoliticasCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPoliticasCliente=new JButtonMe();
				this.jButtonModificarToolBarPoliticasCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPoliticasCliente,this.jTtoolBarDetallePoliticasCliente,
							"actualizar","actualizar","Actualizar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPoliticasCliente,this.jTtoolBarDetallePoliticasCliente,
							"eliminar","eliminar","Eliminar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPoliticasCliente,this.jTtoolBarDetallePoliticasCliente,
							"cancelar","cancelar","Cancelar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPoliticasCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPoliticasCliente,this.jTtoolBarDetallePoliticasCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePoliticasCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePoliticasCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPoliticasCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPoliticasCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPoliticasCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticasCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticasCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticasCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPoliticasCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPoliticasCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPoliticasCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPoliticasCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPoliticasCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPoliticasCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPoliticasCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPoliticasCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPoliticasCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPoliticasCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPoliticasCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPoliticasCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPoliticasCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticasCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticasCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPoliticasCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPoliticasCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPoliticasCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticasCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticasCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticasCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPoliticasCliente.add(this.jMenuItemDetalleCerrarPoliticasCliente);
		
		this.jmenuDetalleAccionesPoliticasCliente.add(this.jMenuItemActualizarPoliticasCliente);
		this.jmenuDetalleAccionesPoliticasCliente.add(this.jMenuItemEliminarPoliticasCliente);
		this.jmenuDetalleAccionesPoliticasCliente.add(this.jMenuItemCancelarPoliticasCliente);		
		
		//this.jmenuDetalleDatosPoliticasCliente.add(this.jMenuItemDetalleAbrirOrderByPoliticasCliente);				
		this.jmenuDetalleDatosPoliticasCliente.add(this.jMenuItemDetalleMostarOcultarPoliticasCliente);				
				
		//this.jmenuDetalleAccionesPoliticasCliente.add(this.jMenuItemGuardarCambiosPoliticasCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePoliticasCliente.add(this.jmenuDetalleArchivoPoliticasCliente);		
		this.jmenuBarDetallePoliticasCliente.add(this.jmenuDetalleAccionesPoliticasCliente);		
		this.jmenuBarDetallePoliticasCliente.add(this.jmenuDetalleDatosPoliticasCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePoliticasCliente);				
	}
	
	
	public void inicializarElementosCamposPoliticasCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabellimite_creditoPoliticasCliente = new JLabelMe();
		this.jLabellimite_creditoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_LIMITECREDITO+" : *");
		this.jLabellimite_creditoPoliticasCliente.setToolTipText("Limite Credito");
		this.jLabellimite_creditoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellimite_creditoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellimite_creditoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellimite_creditoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_LIMITECREDITO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanellimite_creditoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldlimite_creditoPoliticasCliente= new JTextFieldMe();
		jTextFieldlimite_creditoPoliticasCliente.setEnabled(false);
		jTextFieldlimite_creditoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlimite_creditoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlimite_creditoPoliticasCliente.setText("0.0");

		this.jButtonlimite_creditoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlimite_creditoPoliticasClienteBusqueda.setText("U");
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlimite_creditoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlimite_creditoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlimite_creditoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"limite_creditoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlimite_creditoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioPoliticasCliente = new JLabelMe();
		this.jLabelfecha_inicioPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioPoliticasCliente.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelfecha_inicioPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		//jFormattedTextFieldfecha_inicioPoliticasCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioPoliticasCliente= new JDateChooser();
		jDateChooserfecha_inicioPoliticasCliente.setEnabled(false);
		jDateChooserfecha_inicioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioPoliticasCliente.setDate(new Date());
		jDateChooserfecha_inicioPoliticasCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioPoliticasCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioPoliticasClienteBusqueda.setText("U");
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_renovacionPoliticasCliente = new JLabelMe();
		this.jLabelfecha_renovacionPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FECHARENOVACION+" : *");
		this.jLabelfecha_renovacionPoliticasCliente.setToolTipText("Fecha Renovacion");
		this.jLabelfecha_renovacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_renovacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_renovacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_renovacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_renovacionPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_renovacionPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FECHARENOVACION);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelfecha_renovacionPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		//jFormattedTextFieldfecha_renovacionPoliticasCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_renovacionPoliticasCliente= new JDateChooser();
		jDateChooserfecha_renovacionPoliticasCliente.setEnabled(false);
		jDateChooserfecha_renovacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_renovacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_renovacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_renovacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_renovacionPoliticasCliente.setDate(new Date());
		jDateChooserfecha_renovacionPoliticasCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_renovacionPoliticasCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_renovacionPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_renovacionPoliticasClienteBusqueda.setText("U");
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_renovacionPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_renovacionPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_renovacionPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_renovacionPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_renovacionPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finPoliticasCliente = new JLabelMe();
		this.jLabelfecha_finPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finPoliticasCliente.setToolTipText("Fecha Fin");
		this.jLabelfecha_finPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelfecha_finPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		//jFormattedTextFieldfecha_finPoliticasCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_finPoliticasCliente= new JDateChooser();
		jDateChooserfecha_finPoliticasCliente.setEnabled(false);
		jDateChooserfecha_finPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finPoliticasCliente.setDate(new Date());
		jDateChooserfecha_finPoliticasCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finPoliticasCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonfecha_finPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finPoliticasClienteBusqueda.setText("U");
		this.jButtonfecha_finPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabeldias_neto_pagoPoliticasCliente = new JLabelMe();
		this.jLabeldias_neto_pagoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_DIASNETOPAGO+" : *");
		this.jLabeldias_neto_pagoPoliticasCliente.setToolTipText("Dias Neto Pago");
		this.jLabeldias_neto_pagoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_neto_pagoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_neto_pagoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_neto_pagoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_neto_pagoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_neto_pagoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_DIASNETOPAGO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPaneldias_neto_pagoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFielddias_neto_pagoPoliticasCliente= new JTextFieldMe();
		jTextFielddias_neto_pagoPoliticasCliente.setEnabled(false);
		jTextFielddias_neto_pagoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_neto_pagoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_neto_pagoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_neto_pagoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_neto_pagoPoliticasCliente.setText("0");

		this.jButtondias_neto_pagoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_neto_pagoPoliticasClienteBusqueda.setText("U");
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_neto_pagoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_neto_pagoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_neto_pagoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_neto_pagoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_neto_pagoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabeldias_graciaPoliticasCliente = new JLabelMe();
		this.jLabeldias_graciaPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_DIASGRACIA+" : *");
		this.jLabeldias_graciaPoliticasCliente.setToolTipText("Dias Gracia");
		this.jLabeldias_graciaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_graciaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_graciaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_graciaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_graciaPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_graciaPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_DIASGRACIA);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPaneldias_graciaPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFielddias_graciaPoliticasCliente= new JTextFieldMe();
		jTextFielddias_graciaPoliticasCliente.setEnabled(false);
		jTextFielddias_graciaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_graciaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_graciaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_graciaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_graciaPoliticasCliente.setText("0");

		this.jButtondias_graciaPoliticasClienteBusqueda= new JButtonMe();
		this.jButtondias_graciaPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_graciaPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_graciaPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_graciaPoliticasClienteBusqueda.setText("U");
		this.jButtondias_graciaPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_graciaPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_graciaPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_graciaPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_graciaPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_graciaPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_graciaPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelcupoPoliticasCliente = new JLabelMe();
		this.jLabelcupoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_CUPO+" : *");
		this.jLabelcupoPoliticasCliente.setToolTipText("Cupo");
		this.jLabelcupoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcupoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcupoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcupoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_CUPO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelcupoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldcupoPoliticasCliente= new JTextFieldMe();
		jTextFieldcupoPoliticasCliente.setEnabled(false);
		jTextFieldcupoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcupoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcupoPoliticasCliente.setText("0.0");

		this.jButtoncupoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtoncupoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncupoPoliticasClienteBusqueda.setText("U");
		this.jButtoncupoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncupoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncupoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcupoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcupoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cupoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncupoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_generalPoliticasCliente = new JLabelMe();
		this.jLabeldescuento_generalPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_DESCUENTOGENERAL+" : *");
		this.jLabeldescuento_generalPoliticasCliente.setToolTipText("Descuento General");
		this.jLabeldescuento_generalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_generalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_generalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_generalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_generalPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_generalPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_DESCUENTOGENERAL);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPaneldescuento_generalPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFielddescuento_generalPoliticasCliente= new JTextFieldMe();
		jTextFielddescuento_generalPoliticasCliente.setEnabled(false);
		jTextFielddescuento_generalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_generalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_generalPoliticasCliente.setText("0.0");

		this.jButtondescuento_generalPoliticasClienteBusqueda= new JButtonMe();
		this.jButtondescuento_generalPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_generalPoliticasClienteBusqueda.setText("U");
		this.jButtondescuento_generalPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_generalPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_generalPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_generalPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_generalPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_generalPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_generalPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_pronto_pagoPoliticasCliente = new JLabelMe();
		this.jLabeldescuento_pronto_pagoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_DESCUENTOPRONTOPAGO+" : *");
		this.jLabeldescuento_pronto_pagoPoliticasCliente.setToolTipText("Descuento Pronto Pago");
		this.jLabeldescuento_pronto_pagoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_pronto_pagoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldescuento_pronto_pagoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_pronto_pagoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_pronto_pagoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_pronto_pagoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_DESCUENTOPRONTOPAGO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPaneldescuento_pronto_pagoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFielddescuento_pronto_pagoPoliticasCliente= new JTextFieldMe();
		jTextFielddescuento_pronto_pagoPoliticasCliente.setEnabled(false);
		jTextFielddescuento_pronto_pagoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_pronto_pagoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_pronto_pagoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_pronto_pagoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_pronto_pagoPoliticasCliente.setText("0.0");

		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setText("U");
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_pronto_pagoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_pronto_pagoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_pronto_pagoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_pronto_pagoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelcon_lista_precioPoliticasCliente = new JLabelMe();
		this.jLabelcon_lista_precioPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_CONLISTAPRECIO+" : *");
		this.jLabelcon_lista_precioPoliticasCliente.setToolTipText("Con Lista Precio");
		this.jLabelcon_lista_precioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_lista_precioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_lista_precioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_lista_precioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_lista_precioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_lista_precioPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_CONLISTAPRECIO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelcon_lista_precioPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jCheckBoxcon_lista_precioPoliticasCliente= new JCheckBoxMe();
		jCheckBoxcon_lista_precioPoliticasCliente.setEnabled(false);

		jCheckBoxcon_lista_precioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lista_precioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lista_precioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_lista_precioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_lista_precioPoliticasClienteBusqueda= new JButtonMe();
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_lista_precioPoliticasClienteBusqueda.setText("U");
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_lista_precioPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_lista_precioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_lista_precioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_lista_precioPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_lista_precioPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelcon_impuestosPoliticasCliente = new JLabelMe();
		this.jLabelcon_impuestosPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_CONIMPUESTOS+" : *");
		this.jLabelcon_impuestosPoliticasCliente.setToolTipText("Con Impuestos");
		this.jLabelcon_impuestosPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestosPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestosPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_impuestosPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_impuestosPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_impuestosPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_CONIMPUESTOS);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelcon_impuestosPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jCheckBoxcon_impuestosPoliticasCliente= new JCheckBoxMe();
		jCheckBoxcon_impuestosPoliticasCliente.setEnabled(false);

		jCheckBoxcon_impuestosPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestosPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestosPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_impuestosPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_impuestosPoliticasClienteBusqueda= new JButtonMe();
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_impuestosPoliticasClienteBusqueda.setText("U");
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_impuestosPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_impuestosPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_impuestosPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_impuestosPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_impuestosPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelactivar_monto_facturacionPoliticasCliente = new JLabelMe();
		this.jLabelactivar_monto_facturacionPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_ACTIVARMONTOFACTURACION+" : *");
		this.jLabelactivar_monto_facturacionPoliticasCliente.setToolTipText("Activar Monto Facturacion");
		this.jLabelactivar_monto_facturacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelactivar_monto_facturacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelactivar_monto_facturacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelactivar_monto_facturacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactivar_monto_facturacionPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactivar_monto_facturacionPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_ACTIVARMONTOFACTURACION);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelactivar_monto_facturacionPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jCheckBoxactivar_monto_facturacionPoliticasCliente= new JCheckBoxMe();
		jCheckBoxactivar_monto_facturacionPoliticasCliente.setEnabled(false);

		jCheckBoxactivar_monto_facturacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxactivar_monto_facturacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxactivar_monto_facturacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxactivar_monto_facturacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setText("U");
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxactivar_monto_facturacionPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxactivar_monto_facturacionPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"activar_monto_facturacionPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactivar_monto_facturacionPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_sobregiroPoliticasCliente = new JLabelMe();
		this.jLabelvalor_sobregiroPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_VALORSOBREGIRO+" : *");
		this.jLabelvalor_sobregiroPoliticasCliente.setToolTipText("Valor Sobregiro");
		this.jLabelvalor_sobregiroPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_sobregiroPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_sobregiroPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_sobregiroPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_sobregiroPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_sobregiroPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_VALORSOBREGIRO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelvalor_sobregiroPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldvalor_sobregiroPoliticasCliente= new JTextFieldMe();
		jTextFieldvalor_sobregiroPoliticasCliente.setEnabled(false);
		jTextFieldvalor_sobregiroPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_sobregiroPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_sobregiroPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_sobregiroPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_sobregiroPoliticasCliente.setText("0.0");

		this.jButtonvalor_sobregiroPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setText("U");
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_sobregiroPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_sobregiroPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_sobregiroPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_sobregiroPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_sobregiroPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venci_sobregiroPoliticasCliente = new JLabelMe();
		this.jLabelfecha_venci_sobregiroPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FECHAVENCISOBREGIRO+" : *");
		this.jLabelfecha_venci_sobregiroPoliticasCliente.setToolTipText("Fecha Venci Sobregiro");
		this.jLabelfecha_venci_sobregiroPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_venci_sobregiroPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_venci_sobregiroPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venci_sobregiroPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venci_sobregiroPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venci_sobregiroPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FECHAVENCISOBREGIRO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelfecha_venci_sobregiroPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		//jFormattedTextFieldfecha_venci_sobregiroPoliticasCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_venci_sobregiroPoliticasCliente= new JDateChooser();
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setEnabled(false);
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venci_sobregiroPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setDate(new Date());
		jDateChooserfecha_venci_sobregiroPoliticasCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venci_sobregiroPoliticasCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setText("U");
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venci_sobregiroPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venci_sobregiroPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venci_sobregiroPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venci_sobregiroPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_solicitadoPoliticasCliente = new JLabelMe();
		this.jLabelvalor_solicitadoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_VALORSOLICITADO+" : *");
		this.jLabelvalor_solicitadoPoliticasCliente.setToolTipText("Valor Solicitado");
		this.jLabelvalor_solicitadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_solicitadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_solicitadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_solicitadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_solicitadoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_solicitadoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_VALORSOLICITADO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelvalor_solicitadoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldvalor_solicitadoPoliticasCliente= new JTextFieldMe();
		jTextFieldvalor_solicitadoPoliticasCliente.setEnabled(false);
		jTextFieldvalor_solicitadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_solicitadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_solicitadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_solicitadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_solicitadoPoliticasCliente.setText("0.0");

		this.jButtonvalor_solicitadoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setText("U");
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_solicitadoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_solicitadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_solicitadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_solicitadoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_solicitadoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_aprobadoPoliticasCliente = new JLabelMe();
		this.jLabelvalor_aprobadoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_VALORAPROBADO+" : *");
		this.jLabelvalor_aprobadoPoliticasCliente.setToolTipText("Valor Aprobado");
		this.jLabelvalor_aprobadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_aprobadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_aprobadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_aprobadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_aprobadoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_aprobadoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_VALORAPROBADO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelvalor_aprobadoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldvalor_aprobadoPoliticasCliente= new JTextFieldMe();
		jTextFieldvalor_aprobadoPoliticasCliente.setEnabled(false);
		jTextFieldvalor_aprobadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_aprobadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_aprobadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_aprobadoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_aprobadoPoliticasCliente.setText("0.0");

		this.jButtonvalor_aprobadoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setText("U");
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_aprobadoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_aprobadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_aprobadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_aprobadoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_aprobadoPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_solicitudPoliticasCliente = new JLabelMe();
		this.jLabelfecha_solicitudPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FECHASOLICITUD+" : *");
		this.jLabelfecha_solicitudPoliticasCliente.setToolTipText("Fecha Solicitud");
		this.jLabelfecha_solicitudPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_solicitudPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_solicitudPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_solicitudPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_solicitudPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_solicitudPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FECHASOLICITUD);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelfecha_solicitudPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		//jFormattedTextFieldfecha_solicitudPoliticasCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_solicitudPoliticasCliente= new JDateChooser();
		jDateChooserfecha_solicitudPoliticasCliente.setEnabled(false);
		jDateChooserfecha_solicitudPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitudPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_solicitudPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_solicitudPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_solicitudPoliticasCliente.setDate(new Date());
		jDateChooserfecha_solicitudPoliticasCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_solicitudPoliticasCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_solicitudPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_solicitudPoliticasClienteBusqueda.setText("U");
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_solicitudPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_solicitudPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_solicitudPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_solicitudPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_solicitudPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelobsevacionPoliticasCliente = new JLabelMe();
		this.jLabelobsevacionPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_OBSEVACION+" : *");
		this.jLabelobsevacionPoliticasCliente.setToolTipText("Obsevacion");
		this.jLabelobsevacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobsevacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobsevacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobsevacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobsevacionPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobsevacionPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_OBSEVACION);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelobsevacionPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextAreaobsevacionPoliticasCliente= new JTextAreaMe();
		jTextAreaobsevacionPoliticasCliente.setEnabled(false);
		jTextAreaobsevacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobsevacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobsevacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobsevacionPoliticasCliente.setLineWrap(true);
		jTextAreaobsevacionPoliticasCliente.setWrapStyleWord(true);
		jTextAreaobsevacionPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobsevacionPoliticasCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobsevacionPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobsevacionPoliticasCliente = new JScrollPane(jTextAreaobsevacionPoliticasCliente);
		jscrollPaneobsevacionPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobsevacionPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobsevacionPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobsevacionPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonobsevacionPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobsevacionPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobsevacionPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobsevacionPoliticasClienteBusqueda.setText("U");
		this.jButtonobsevacionPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobsevacionPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobsevacionPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobsevacionPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobsevacionPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"obsevacionPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobsevacionPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelwebPoliticasCliente = new JLabelMe();
		this.jLabelwebPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_WEB+" : *");
		this.jLabelwebPoliticasCliente.setToolTipText("Web");
		this.jLabelwebPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelwebPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelwebPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelwebPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelwebPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelwebPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_WEB);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelwebPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextAreawebPoliticasCliente= new JTextAreaMe();
		jTextAreawebPoliticasCliente.setEnabled(false);
		jTextAreawebPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreawebPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreawebPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreawebPoliticasCliente.setLineWrap(true);
		jTextAreawebPoliticasCliente.setWrapStyleWord(true);
		jTextAreawebPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreawebPoliticasCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreawebPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanewebPoliticasCliente = new JScrollPane(jTextAreawebPoliticasCliente);
		jscrollPanewebPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanewebPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanewebPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonwebPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonwebPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonwebPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonwebPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonwebPoliticasClienteBusqueda.setText("U");
		this.jButtonwebPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonwebPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonwebPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreawebPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreawebPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"webPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonwebPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelcasilla_postalPoliticasCliente = new JLabelMe();
		this.jLabelcasilla_postalPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_CASILLAPOSTAL+" : *");
		this.jLabelcasilla_postalPoliticasCliente.setToolTipText("Casilla Postal");
		this.jLabelcasilla_postalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcasilla_postalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcasilla_postalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcasilla_postalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcasilla_postalPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcasilla_postalPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_CASILLAPOSTAL);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelcasilla_postalPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldcasilla_postalPoliticasCliente= new JTextFieldMe();

		jTextFieldcasilla_postalPoliticasCliente.setEnabled(false);
		jTextFieldcasilla_postalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcasilla_postalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcasilla_postalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcasilla_postalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncasilla_postalPoliticasClienteBusqueda= new JButtonMe();
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncasilla_postalPoliticasClienteBusqueda.setText("U");
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncasilla_postalPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcasilla_postalPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcasilla_postalPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"casilla_postalPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncasilla_postalPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelforma_envioPoliticasCliente = new JLabelMe();
		this.jLabelforma_envioPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_FORMAENVIO+" : *");
		this.jLabelforma_envioPoliticasCliente.setToolTipText("Forma Envio");
		this.jLabelforma_envioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_envioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_envioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelforma_envioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelforma_envioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelforma_envioPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_FORMAENVIO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelforma_envioPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextAreaforma_envioPoliticasCliente= new JTextAreaMe();
		jTextAreaforma_envioPoliticasCliente.setEnabled(false);
		jTextAreaforma_envioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_envioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_envioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_envioPoliticasCliente.setLineWrap(true);
		jTextAreaforma_envioPoliticasCliente.setWrapStyleWord(true);
		jTextAreaforma_envioPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaforma_envioPoliticasCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaforma_envioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneforma_envioPoliticasCliente = new JScrollPane(jTextAreaforma_envioPoliticasCliente);
		jscrollPaneforma_envioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneforma_envioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneforma_envioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonforma_envioPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonforma_envioPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_envioPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_envioPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonforma_envioPoliticasClienteBusqueda.setText("U");
		this.jButtonforma_envioPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonforma_envioPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonforma_envioPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaforma_envioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaforma_envioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"forma_envioPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonforma_envioPoliticasClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaPoliticasCliente = new JLabelMe();
		this.jLabelnumero_cuentaPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaPoliticasCliente.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelnumero_cuentaPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jTextFieldnumero_cuentaPoliticasCliente= new JTextFieldMe();

		jTextFieldnumero_cuentaPoliticasCliente.setEnabled(false);
		jTextFieldnumero_cuentaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaPoliticasClienteBusqueda.setText("U");
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaPoliticasClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPoliticasCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_clientePoliticasCliente = new JLabelMe();
		this.jLabelid_clientePoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_ID+" : *");
		this.jLabelid_clientePoliticasCliente.setToolTipText("");
		this.jLabelid_clientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_clientePoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_clientePoliticasCliente= new JComboBoxMe();
		jComboBoxid_clientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePoliticasCliente= new JButtonMe();
		this.jButtonid_clientePoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticasCliente.setText("Buscar");
		this.jButtonid_clientePoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticasCliente"));

		this.jButtonid_clientePoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_clientePoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePoliticasClienteBusqueda.setText("U");
		this.jButtonid_clientePoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_clientePoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_clientePoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePoliticasClienteUpdate.setText("U");
		this.jButtonid_clientePoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticasClienteUpdate"));



					
		this.jLabelid_empresaPoliticasCliente = new JLabelMe();
		this.jLabelid_empresaPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPoliticasCliente.setToolTipText("Empresa");
		this.jLabelid_empresaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_empresaPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_empresaPoliticasCliente= new JComboBoxMe();
		jComboBoxid_empresaPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPoliticasCliente.setEnabled(false);

		this.jButtonid_empresaPoliticasCliente= new JButtonMe();
		this.jButtonid_empresaPoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticasCliente.setText("Buscar");
		this.jButtonid_empresaPoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticasCliente"));

		this.jButtonid_empresaPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticasClienteBusqueda.setText("U");
		this.jButtonid_empresaPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaPoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_empresaPoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticasClienteUpdate.setText("U");
		this.jButtonid_empresaPoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticasClienteUpdate"));



					
		this.jLabelid_tipo_precioPoliticasCliente = new JLabelMe();
		this.jLabelid_tipo_precioPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioPoliticasCliente.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_tipo_precioPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_tipo_precioPoliticasCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioPoliticasCliente= new JButtonMe();
		this.jButtonid_tipo_precioPoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPoliticasCliente.setText("Buscar");
		this.jButtonid_tipo_precioPoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioPoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPoliticasCliente"));

		this.jButtonid_tipo_precioPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPoliticasClienteBusqueda.setText("U");
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioPoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioPoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_precioPoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPoliticasClienteUpdate.setText("U");
		this.jButtonid_tipo_precioPoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioPoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPoliticasClienteUpdate"));



					
		this.jLabelid_transportePoliticasCliente = new JLabelMe();
		this.jLabelid_transportePoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDTRANSPORTE+" : *");
		this.jLabelid_transportePoliticasCliente.setToolTipText("Transporte");
		this.jLabelid_transportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportePoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_transportePoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_transportePoliticasCliente= new JComboBoxMe();
		jComboBoxid_transportePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportePoliticasCliente= new JButtonMe();
		this.jButtonid_transportePoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePoliticasCliente.setText("Buscar");
		this.jButtonid_transportePoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportePoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePoliticasCliente"));

		this.jButtonid_transportePoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_transportePoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePoliticasClienteBusqueda.setText("U");
		this.jButtonid_transportePoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportePoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportePoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_transportePoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_transportePoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePoliticasClienteUpdate.setText("U");
		this.jButtonid_transportePoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportePoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePoliticasClienteUpdate"));



					
		this.jLabelid_linea_negocioPoliticasCliente = new JLabelMe();
		this.jLabelid_linea_negocioPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDLINEANEGOCIO+" : *");
		this.jLabelid_linea_negocioPoliticasCliente.setToolTipText("Linea Negocio");
		this.jLabelid_linea_negocioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_negocioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_negocioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_negocioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_negocioPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_negocioPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDLINEANEGOCIO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_linea_negocioPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_linea_negocioPoliticasCliente= new JComboBoxMe();
		jComboBoxid_linea_negocioPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_negocioPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_negocioPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_negocioPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_negocioPoliticasCliente= new JButtonMe();
		this.jButtonid_linea_negocioPoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_negocioPoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_negocioPoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_negocioPoliticasCliente.setText("Buscar");
		this.jButtonid_linea_negocioPoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_negocioPoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_negocioPoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_negocioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_negocioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_negocioPoliticasCliente"));

		this.jButtonid_linea_negocioPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_negocioPoliticasClienteBusqueda.setText("U");
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_negocioPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_negocioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_negocioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_negocioPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_negocioPoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_linea_negocioPoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_linea_negocioPoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_negocioPoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_negocioPoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_negocioPoliticasClienteUpdate.setText("U");
		this.jButtonid_linea_negocioPoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_negocioPoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_negocioPoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_negocioPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_negocioPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_negocioPoliticasClienteUpdate"));



					
		this.jLabelid_bancoPoliticasCliente = new JLabelMe();
		this.jLabelid_bancoPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoPoliticasCliente.setToolTipText("Banco");
		this.jLabelid_bancoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_bancoPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_bancoPoliticasCliente= new JComboBoxMe();
		jComboBoxid_bancoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoPoliticasCliente= new JButtonMe();
		this.jButtonid_bancoPoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoPoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoPoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoPoliticasCliente.setText("Buscar");
		this.jButtonid_bancoPoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoPoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoPoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoPoliticasCliente"));

		this.jButtonid_bancoPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_bancoPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoPoliticasClienteBusqueda.setText("U");
		this.jButtonid_bancoPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoPoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_bancoPoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_bancoPoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoPoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoPoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoPoliticasClienteUpdate.setText("U");
		this.jButtonid_bancoPoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoPoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoPoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoPoliticasClienteUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente.setToolTipText("Tipo Cuenta Banco Global");
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalPoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalPoliticasCliente"));

		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalPoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalPoliticasClienteUpdate"));



					
		this.jLabelid_estado_politicas_clientePoliticasCliente = new JLabelMe();
		this.jLabelid_estado_politicas_clientePoliticasCliente.setText(""+PoliticasClienteConstantesFunciones.LABEL_IDESTADOPOLITICASCLIENTE+" : *");
		this.jLabelid_estado_politicas_clientePoliticasCliente.setToolTipText("Estado Politicas Cliente");
		this.jLabelid_estado_politicas_clientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_politicas_clientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_politicas_clientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_politicas_clientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_politicas_clientePoliticasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_politicas_clientePoliticasCliente.setToolTipText(PoliticasClienteConstantesFunciones.LABEL_IDESTADOPOLITICASCLIENTE);
		this.gridaBagLayoutPoliticasCliente = new GridBagLayout();
		this.jPanelid_estado_politicas_clientePoliticasCliente.setLayout(this.gridaBagLayoutPoliticasCliente);


		jComboBoxid_estado_politicas_clientePoliticasCliente= new JComboBoxMe();
		jComboBoxid_estado_politicas_clientePoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_politicas_clientePoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_politicas_clientePoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_politicas_clientePoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_politicas_clientePoliticasCliente= new JButtonMe();
		this.jButtonid_estado_politicas_clientePoliticasCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_politicas_clientePoliticasCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_politicas_clientePoliticasCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_politicas_clientePoliticasCliente.setText("Buscar");
		this.jButtonid_estado_politicas_clientePoliticasCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_politicas_clientePoliticasCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_politicas_clientePoliticasCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_politicas_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_politicas_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_politicas_clientePoliticasCliente"));

		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setText("U");
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_politicas_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_politicas_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_politicas_clientePoliticasClienteBusqueda"));

		if(this.politicasclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_politicas_clientePoliticasClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate= new JButtonMe();
		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setText("U");
		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_politicas_clientePoliticasClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_politicas_clientePoliticasClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_politicas_clientePoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_politicas_clientePoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_politicas_clientePoliticasClienteUpdate"));



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
		//this.jInternalFrameDetallePoliticasCliente = new PoliticasClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Politicas Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticasCliente= new GridBagLayout();
		

		
		String sToolTipPoliticasCliente="";
		sToolTipPoliticasCliente=PoliticasClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticasCliente+="(Cartera.PoliticasCliente)";
		}
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticasCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPoliticasCliente = new JButtonMe();
		this.jButtonModificarPoliticasCliente = new JButtonMe();
        this.jButtonActualizarPoliticasCliente = new JButtonMe();
        this.jButtonEliminarPoliticasCliente = new JButtonMe();
        this.jButtonCancelarPoliticasCliente = new JButtonMe();
        this.jButtonGuardarCambiosPoliticasCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaPoliticasCliente = new JButtonMe();
		this.jButtonCerrarPoliticasCliente = new JButtonMe();
		
		this.jScrollPanelDatosPoliticasCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionPoliticasCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralPoliticasCliente = new JScrollPane();
				
		
		
		this.jPanelCamposPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Politicas Cliente";
		
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politicas Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticasCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPoliticasCliente.setName("jPanelCamposPoliticasCliente"); 

		this.jPanelCamposOcultosPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPoliticasCliente.setName("jPanelCamposOcultosPoliticasCliente"); 

        this.jPanelAccionesPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesPoliticasCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPoliticasCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPoliticasCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPoliticasCliente.setText("Nuevo");
		this.jButtonModificarPoliticasCliente.setText("Editar");
        this.jButtonActualizarPoliticasCliente.setText("Actualizar");
        this.jButtonEliminarPoliticasCliente.setText("Eliminar");
        this.jButtonCancelarPoliticasCliente.setText("Cancelar");
        this.jButtonGuardarCambiosPoliticasCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaPoliticasCliente.setText("Guardar");
		this.jButtonCerrarPoliticasCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticasCliente,"nuevo_button","Nuevo",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPoliticasCliente,"modificar_button","Editar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPoliticasCliente,"actualizar_button","Actualizar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPoliticasCliente,"eliminar_button","Eliminar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPoliticasCliente,"cancelar_button","Cancelar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPoliticasCliente,"guardarcambios_button","Guardar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticasCliente,"guardarcambiostabla_button","Guardar",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticasCliente,"cerrar_button","Salir",this.politicasclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPoliticasCliente.setToolTipText("Nuevo"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPoliticasCliente.setToolTipText("Editar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPoliticasCliente.setToolTipText("Actualizar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPoliticasCliente.setToolTipText("Eliminar)"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPoliticasCliente.setToolTipText("Cancelar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPoliticasCliente.setToolTipText("Guardar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPoliticasCliente.setToolTipText("Guardar"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticasCliente.setToolTipText("Salir"+" "+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticasCliente";
		inputMap = this.jButtonNuevoPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticasCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticasCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPoliticasCliente";
		inputMap = this.jButtonActualizarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPoliticasCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarPoliticasCliente";
		inputMap = this.jButtonEliminarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPoliticasCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarPoliticasCliente";
		inputMap = this.jButtonCancelarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPoliticasCliente"));
		
		//CERRAR		
		sMapKey = "CerrarPoliticasCliente";
		inputMap = this.jButtonCerrarPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticasCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticasCliente";
		inputMap = this.jButtonGuardarCambiosTablaPoliticasCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticasCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticasCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPoliticasCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPoliticasCliente.setToolTipText("Nuevo PoliticasCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPoliticasCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPoliticasCliente.setToolTipText("Sin Cerrar Ventana PoliticasCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePoliticasCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePoliticasCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePoliticasCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticasCliente.setText("Accion");
		this.jComboBoxTiposAccionesPoliticasCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPoliticasCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPoliticasCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPoliticasCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPoliticasCliente = new JLabelMe();
		
		this.jLabelAccionesPoliticasCliente.setText("Acciones");		
		this.jLabelAccionesPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPoliticasCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPoliticasCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPoliticasCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesPoliticasCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPoliticasCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPoliticasCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticasCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticasCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticasCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPoliticasCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticasCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticasCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPoliticasCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPoliticasCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPoliticasCliente = new GridBagLayout();
		
		this.jPanelCamposPoliticasCliente.setLayout(gridaBagLayoutCamposPoliticasCliente);
		this.jPanelCamposOcultosPoliticasCliente.setLayout(gridaBagLayoutCamposOcultosPoliticasCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePoliticasCliente.add(jLabelid_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 2;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePoliticasCliente.add(jButtonid_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePoliticasCliente.add(jButtonid_clientePoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 4;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePoliticasCliente.add(jButtonid_clientePoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePoliticasCliente.add(jComboBoxid_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPoliticasCliente.add(jLabelid_empresaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticasCliente.add(jButtonid_empresaPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticasCliente.add(jButtonid_empresaPoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPoliticasCliente.add(jComboBoxid_empresaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellimite_creditoPoliticasCliente.add(jLabellimite_creditoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanellimite_creditoPoliticasCliente.add(jButtonlimite_creditoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellimite_creditoPoliticasCliente.add(jTextFieldlimite_creditoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioPoliticasCliente.add(jLabelfecha_inicioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioPoliticasCliente.add(jButtonfecha_inicioPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioPoliticasCliente.add(jDateChooserfecha_inicioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_renovacionPoliticasCliente.add(jLabelfecha_renovacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_renovacionPoliticasCliente.add(jButtonfecha_renovacionPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_renovacionPoliticasCliente.add(jDateChooserfecha_renovacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finPoliticasCliente.add(jLabelfecha_finPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finPoliticasCliente.add(jButtonfecha_finPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finPoliticasCliente.add(jDateChooserfecha_finPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_neto_pagoPoliticasCliente.add(jLabeldias_neto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_neto_pagoPoliticasCliente.add(jButtondias_neto_pagoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_neto_pagoPoliticasCliente.add(jTextFielddias_neto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_graciaPoliticasCliente.add(jLabeldias_graciaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_graciaPoliticasCliente.add(jButtondias_graciaPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_graciaPoliticasCliente.add(jTextFielddias_graciaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcupoPoliticasCliente.add(jLabelcupoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcupoPoliticasCliente.add(jButtoncupoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcupoPoliticasCliente.add(jTextFieldcupoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_generalPoliticasCliente.add(jLabeldescuento_generalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_generalPoliticasCliente.add(jButtondescuento_generalPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_generalPoliticasCliente.add(jTextFielddescuento_generalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_pronto_pagoPoliticasCliente.add(jLabeldescuento_pronto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_pronto_pagoPoliticasCliente.add(jButtondescuento_pronto_pagoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_pronto_pagoPoliticasCliente.add(jTextFielddescuento_pronto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioPoliticasCliente.add(jLabelid_tipo_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPoliticasCliente.add(jButtonid_tipo_precioPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPoliticasCliente.add(jButtonid_tipo_precioPoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioPoliticasCliente.add(jComboBoxid_tipo_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_lista_precioPoliticasCliente.add(jLabelcon_lista_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_lista_precioPoliticasCliente.add(jButtoncon_lista_precioPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_lista_precioPoliticasCliente.add(jCheckBoxcon_lista_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_impuestosPoliticasCliente.add(jLabelcon_impuestosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_impuestosPoliticasCliente.add(jButtoncon_impuestosPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_impuestosPoliticasCliente.add(jCheckBoxcon_impuestosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactivar_monto_facturacionPoliticasCliente.add(jLabelactivar_monto_facturacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelactivar_monto_facturacionPoliticasCliente.add(jButtonactivar_monto_facturacionPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactivar_monto_facturacionPoliticasCliente.add(jCheckBoxactivar_monto_facturacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_sobregiroPoliticasCliente.add(jLabelvalor_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_sobregiroPoliticasCliente.add(jButtonvalor_sobregiroPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_sobregiroPoliticasCliente.add(jTextFieldvalor_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venci_sobregiroPoliticasCliente.add(jLabelfecha_venci_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venci_sobregiroPoliticasCliente.add(jButtonfecha_venci_sobregiroPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venci_sobregiroPoliticasCliente.add(jDateChooserfecha_venci_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportePoliticasCliente.add(jLabelid_transportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePoliticasCliente.add(jButtonid_transportePoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePoliticasCliente.add(jButtonid_transportePoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportePoliticasCliente.add(jComboBoxid_transportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_solicitadoPoliticasCliente.add(jLabelvalor_solicitadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_solicitadoPoliticasCliente.add(jButtonvalor_solicitadoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_solicitadoPoliticasCliente.add(jTextFieldvalor_solicitadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_aprobadoPoliticasCliente.add(jLabelvalor_aprobadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_aprobadoPoliticasCliente.add(jButtonvalor_aprobadoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_aprobadoPoliticasCliente.add(jTextFieldvalor_aprobadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_negocioPoliticasCliente.add(jLabelid_linea_negocioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_negocioPoliticasCliente.add(jButtonid_linea_negocioPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_negocioPoliticasCliente.add(jButtonid_linea_negocioPoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_negocioPoliticasCliente.add(jComboBoxid_linea_negocioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_solicitudPoliticasCliente.add(jLabelfecha_solicitudPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_solicitudPoliticasCliente.add(jButtonfecha_solicitudPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_solicitudPoliticasCliente.add(jDateChooserfecha_solicitudPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobsevacionPoliticasCliente.add(jLabelobsevacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelobsevacionPoliticasCliente.add(jButtonobsevacionPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobsevacionPoliticasCliente.add(jscrollPaneobsevacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelwebPoliticasCliente.add(jLabelwebPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelwebPoliticasCliente.add(jButtonwebPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelwebPoliticasCliente.add(jscrollPanewebPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcasilla_postalPoliticasCliente.add(jLabelcasilla_postalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcasilla_postalPoliticasCliente.add(jButtoncasilla_postalPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcasilla_postalPoliticasCliente.add(jTextFieldcasilla_postalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelforma_envioPoliticasCliente.add(jLabelforma_envioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelforma_envioPoliticasCliente.add(jButtonforma_envioPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelforma_envioPoliticasCliente.add(jscrollPaneforma_envioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoPoliticasCliente.add(jLabelid_bancoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoPoliticasCliente.add(jButtonid_bancoPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoPoliticasCliente.add(jButtonid_bancoPoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoPoliticasCliente.add(jComboBoxid_bancoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.add(jLabelid_tipo_cuenta_banco_globalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.add(jButtonid_tipo_cuenta_banco_globalPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.add(jButtonid_tipo_cuenta_banco_globalPoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente.add(jComboBoxid_tipo_cuenta_banco_globalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaPoliticasCliente.add(jLabelnumero_cuentaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaPoliticasCliente.add(jButtonnumero_cuentaPoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaPoliticasCliente.add(jTextFieldnumero_cuentaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 0;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_politicas_clientePoliticasCliente.add(jLabelid_estado_politicas_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 2;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_politicas_clientePoliticasCliente.add(jButtonid_estado_politicas_clientePoliticasClienteBusqueda, this.gridBagConstraintsPoliticasCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = 3;
		this.gridBagConstraintsPoliticasCliente.ipadx = 0;
		this.gridBagConstraintsPoliticasCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_politicas_clientePoliticasCliente.add(jButtonid_estado_politicas_clientePoliticasClienteUpdate, this.gridBagConstraintsPoliticasCliente);
	}

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticasCliente.gridy = 0;
	this.gridBagConstraintsPoliticasCliente.gridx = 1;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_politicas_clientePoliticasCliente.add(jComboBoxid_estado_politicas_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanellimite_creditoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelfecha_inicioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelfecha_renovacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelfecha_finPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPaneldias_neto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPaneldias_graciaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelcupoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPaneldescuento_generalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPaneldescuento_pronto_pagoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_tipo_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelcon_lista_precioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelcon_impuestosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelactivar_monto_facturacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelvalor_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelfecha_venci_sobregiroPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_transportePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	iXPanelCamposPoliticasCliente=0;
	iYPanelCamposPoliticasCliente++;


	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	JLabelMe jLabelTitulovalor_solicitadoPoliticasCliente = new JLabelMe();
	jLabelTitulovalor_solicitadoPoliticasCliente.setText("DATOS DE LA SOLICITUD");
	jLabelTitulovalor_solicitadoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_solicitadoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_solicitadoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulovalor_solicitadoPoliticasCliente);

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.gridwidth = 3;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(jLabelTitulovalor_solicitadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelvalor_solicitadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelvalor_aprobadoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_linea_negocioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelfecha_solicitudPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelobsevacionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	iXPanelCamposPoliticasCliente=0;
	iYPanelCamposPoliticasCliente++;


	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	JLabelMe jLabelTitulowebPoliticasCliente = new JLabelMe();
	jLabelTitulowebPoliticasCliente.setText("CONTACTO");
	jLabelTitulowebPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulowebPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulowebPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulowebPoliticasCliente);

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.gridwidth = 3;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(jLabelTitulowebPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelwebPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelcasilla_postalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelforma_envioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	iXPanelCamposPoliticasCliente=0;
	iYPanelCamposPoliticasCliente++;


	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	JLabelMe jLabelTituloid_bancoPoliticasCliente = new JLabelMe();
	jLabelTituloid_bancoPoliticasCliente.setText("BANCO");
	jLabelTituloid_bancoPoliticasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloid_bancoPoliticasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloid_bancoPoliticasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTituloid_bancoPoliticasCliente);

	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	this.gridBagConstraintsPoliticasCliente.gridwidth = 3;
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(jLabelTituloid_bancoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}

	if(!iXPanelCamposPoliticasCliente.equals(0)) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}


	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_bancoPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_tipo_cuenta_banco_globalPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelnumero_cuentaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticasCliente.add(this.jPanelid_estado_politicas_clientePoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposPoliticasCliente % 2==0) {
		iXPanelCamposPoliticasCliente=0;
		iYPanelCamposPoliticasCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticasCliente.gridy = iYPanelCamposOcultosPoliticasCliente;
	this.gridBagConstraintsPoliticasCliente.gridx = iXPanelCamposOcultosPoliticasCliente++;
	this.gridBagConstraintsPoliticasCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticasCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticasCliente.add(this.jPanelid_empresaPoliticasCliente, this.gridBagConstraintsPoliticasCliente);



	if(iXPanelCamposOcultosPoliticasCliente % 2==0) {
		iXPanelCamposOcultosPoliticasCliente=0;
		iYPanelCamposOcultosPoliticasCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesPoliticasCliente.setLayout(gridaBagLayoutAccionesPoliticasCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPoliticasCliente= new GridBagLayout();
		this.jPanelAccionesFormularioPoliticasCliente.setLayout(gridaBagLayoutAccionesFormularioPoliticasCliente);
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticasCliente.add(this.jComboBoxTiposAccionesFormularioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);

			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.politicasclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticasCliente.add(this.jCheckBoxPostAccionSinCerrarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.politicasclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.politicasclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticasCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticasCliente.add(this.jCheckBoxPostAccionSinMensajePoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesPoliticasCliente.add(this.jButtonModificarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);							

		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticasCliente.gridy = 0;
		this.gridBagConstraintsPoliticasCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesPoliticasCliente.add(this.jButtonEliminarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticasCliente.add(this.jButtonActualizarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);


		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsPoliticasCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticasCliente.add(this.jButtonGuardarCambiosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);	
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = 0;		
		this.gridBagConstraintsPoliticasCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesPoliticasCliente.add(this.jButtonCancelarPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticasCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticasCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicasclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();						
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticasCliente.gridx = 0;		
			//this.gridBagConstraintsPoliticasCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticasCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticasCliente.gridx =0;
		this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticasCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PoliticasClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePoliticasCliente = new PoliticasClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Politicas Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Politicas Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politicas Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PoliticasClienteModel politicasclienteModel=new PoliticasClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//PoliticasClienteModel.PoliticasClienteFocusTraversalPolicy politicasclienteFocusTraversalPolicy = politicasclienteModel.new PoliticasClienteFocusTraversalPolicy(this);
			
			//politicasclienteFocusTraversalPolicy.setpoliticasclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(politicasclienteModel);
			
			
			this.jContentPaneDetallePoliticasCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePoliticasCliente = new GridBagLayout();	
			this.jContentPaneDetallePoliticasCliente.setLayout(gridaBagLayoutDetallePoliticasCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticasCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
				this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPoliticasCliente.gridx = 0;
					
				
				this.jContentPaneDetallePoliticasCliente.add(jTtoolBarDetallePoliticasCliente, gridBagConstraintsPoliticasCliente);								
				
}
			
			this.jScrollPanelDatosEdicionPoliticasCliente=   new JScrollPane(jContentPaneDetallePoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPoliticasCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPoliticasCliente.gridx = 0;
	        
			this.jContentPaneDetallePoliticasCliente.add(jPanelCamposPoliticasCliente, gridBagConstraintsPoliticasCliente);
			
			
			
			
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
						&& politicasclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.politicasclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPoliticasCliente= new GridBagConstraints();
						this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPoliticasCliente.gridx = 0;
						this.jContentPaneDetallePoliticasCliente.add(this.jTabbedPaneRelacionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPoliticasCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPoliticasCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
					this.gridBagConstraintsPoliticasCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPoliticasCliente.gridx = 0;
					
				
					this.jContentPaneDetallePoliticasCliente.add(jPanelCamposOcultosPoliticasCliente, gridBagConstraintsPoliticasCliente);
				
					this.jPanelCamposOcultosPoliticasCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPoliticasCliente.gridx = 0;
	        this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePoliticasCliente.add(this.jPanelAccionesFormularioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);							
			
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
	        this.gridBagConstraintsPoliticasCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPoliticasCliente.gridx = 0;
	        
			
			this.jContentPaneDetallePoliticasCliente.add(this.jPanelAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPoliticasCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPoliticasCliente=   new JScrollPane(this.jPanelCamposPoliticasCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticasCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticasCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticasCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPoliticasCliente.gridx = 0;
			this.gridBagConstraintsPoliticasCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPoliticasCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPoliticasCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticasCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPoliticasCliente, this.gridBagConstraintsPoliticasCliente);			
			
			this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticasCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
			
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		
			
		this.gridBagConstraintsPoliticasCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticasCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticasCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticasCliente, this.gridBagConstraintsPoliticasCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPoliticasCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionPoliticasCliente;
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
