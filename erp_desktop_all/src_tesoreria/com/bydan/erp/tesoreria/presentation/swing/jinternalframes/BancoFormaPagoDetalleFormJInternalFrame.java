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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.BancoFormaPagoConstantesFunciones;

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
public class BancoFormaPagoDetalleFormJInternalFrame extends BancoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBancoFormaPago;
	
	protected JMenuBar jmenuBarDetalleBancoFormaPago;
	
	protected JMenu jmenuDetalleBancoFormaPago;
	protected JMenu jmenuDetalleArchivoBancoFormaPago;
	protected JMenu jmenuDetalleAccionesBancoFormaPago;
	protected JMenu jmenuDetalleDatosBancoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBancoFormaPago;	
	protected GridBagConstraints gridBagConstraintsBancoFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BancoFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleBancoFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detaformapago="";

	protected TipoBancoFormaPagoBeanSwingJInternalFrame tipobancoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobancoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public BancoFormaPagoSessionBean bancoformapagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public DetaFormaPagoSessionBean detaformapagoSessionBean;
	public TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public BancoFormaPagoLogic bancoformapagoLogic;
	
	public JScrollPane jScrollPanelDatosBancoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionBancoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralBancoFormaPago;
	
	protected JPanel jPanelCamposBancoFormaPago;    
	protected JPanel jPanelCamposOcultosBancoFormaPago;    	
	protected JPanel jPanelAccionesBancoFormaPago;
	protected JPanel jPanelAccionesFormularioBancoFormaPago;
    
	
	
	protected Integer iXPanelCamposBancoFormaPago=0;
	protected Integer iYPanelCamposBancoFormaPago=0;
	
	protected Integer iXPanelCamposOcultosBancoFormaPago=0;
	protected Integer iYPanelCamposOcultosBancoFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBancoFormaPago;
	public JButton jButtonModificarBancoFormaPago;
	public JButton jButtonActualizarBancoFormaPago;
    public JButton jButtonEliminarBancoFormaPago;
	public JButton jButtonCancelarBancoFormaPago;
    public JButton jButtonGuardarCambiosBancoFormaPago;
	public JButton jButtonGuardarCambiosTablaBancoFormaPago;
	protected JButton jButtonCerrarBancoFormaPago;
	
	
	protected JButton jButtonProcesarInformacionBancoFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBancoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBancoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBancoFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBancoFormaPago;
	protected JButton jButtonModificarToolBarBancoFormaPago;
	protected JButton jButtonActualizarToolBarBancoFormaPago;
    protected JButton jButtonEliminarToolBarBancoFormaPago;
	protected JButton jButtonCancelarToolBarBancoFormaPago;
    protected JButton jButtonGuardarCambiosToolBarBancoFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarBancoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarBancoFormaPago;
	protected JButton jButtonCerrarToolBarBancoFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarBancoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBancoFormaPago;
	protected JMenuItem jMenuItemModificarBancoFormaPago;
	protected JMenuItem jMenuItemActualizarBancoFormaPago;
    protected JMenuItem jMenuItemEliminarBancoFormaPago;
	protected JMenuItem jMenuItemCancelarBancoFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosBancoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaBancoFormaPago;
	protected JMenuItem jMenuItemCerrarBancoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarBancoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarBancoFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionBancoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBancoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarBancoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBancoFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBancoFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBancoFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBancoFormaPago;
	public JLabel jLabelIdBancoFormaPago;
	public JLabel jLabelidBancoFormaPago;
	public JButton jButtonidBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoBancoFormaPago;
	public JLabel jLabelnombre_bancoBancoFormaPago;
	public JTextField jTextFieldnombre_bancoBancoFormaPago;
	public JButton jButtonnombre_bancoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_giradorBancoFormaPago;
	public JLabel jLabelnombre_giradorBancoFormaPago;
	public JTextArea jTextAreanombre_giradorBancoFormaPago;
	public JScrollPane jscrollPanenombre_giradorBancoFormaPago;
	public JButton jButtonnombre_giradorBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceBancoFormaPago;
	public JLabel jLabelfecha_venceBancoFormaPago;
	//public JFormattedTextField jDateChooserfecha_venceBancoFormaPago;

	public JDateChooser jDateChooserfecha_venceBancoFormaPago;
	public JButton jButtonfecha_venceBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuenta_bancoBancoFormaPago;
	public JLabel jLabelnumero_cuenta_bancoBancoFormaPago;
	public JTextField jTextFieldnumero_cuenta_bancoBancoFormaPago;
	public JButton jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeBancoFormaPago;
	public JLabel jLabelnumero_chequeBancoFormaPago;
	public JTextField jTextFieldnumero_chequeBancoFormaPago;
	public JButton jButtonnumero_chequeBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_montoBancoFormaPago;
	public JLabel jLabelvalor_montoBancoFormaPago;
	public JTextField jTextFieldvalor_montoBancoFormaPago;
	public JButton jButtonvalor_montoBancoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBancoFormaPago;
	public JLabel jLabelid_empresaBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBancoFormaPago;
	public JButton jButtonid_empresaBancoFormaPago= new JButtonMe();
	public JButton jButtonid_empresaBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBancoFormaPago;
	public JLabel jLabelid_sucursalBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBancoFormaPago;
	public JButton jButtonid_sucursalBancoFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioBancoFormaPago;
	public JLabel jLabelid_ejercicioBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBancoFormaPago;
	public JButton jButtonid_ejercicioBancoFormaPago= new JButtonMe();
	public JButton jButtonid_ejercicioBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoBancoFormaPago;
	public JLabel jLabelid_periodoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBancoFormaPago;
	public JButton jButtonid_periodoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_periodoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_periodoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaBancoFormaPago;
	public JLabel jLabelid_facturaBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaBancoFormaPago;
	public JButton jButtonid_facturaBancoFormaPago= new JButtonMe();
	public JButton jButtonid_facturaBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_deta_forma_pagoBancoFormaPago;
	public JLabel jLabelid_deta_forma_pagoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_deta_forma_pagoBancoFormaPago;
	public JButton jButtonid_deta_forma_pagoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_deta_forma_pagoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_deta_forma_pagoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_banco_forma_pagoBancoFormaPago;
	public JLabel jLabelid_tipo_banco_forma_pagoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_banco_forma_pagoBancoFormaPago;
	public JButton jButtonid_tipo_banco_forma_pagoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioBancoFormaPago;
	public JLabel jLabelid_anioBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBancoFormaPago;
	public JButton jButtonid_anioBancoFormaPago= new JButtonMe();
	public JButton jButtonid_anioBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_anioBancoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesBancoFormaPago;
	public JLabel jLabelid_mesBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBancoFormaPago;
	public JButton jButtonid_mesBancoFormaPago= new JButtonMe();
	public JButton jButtonid_mesBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_mesBancoFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBancoFormaPago;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BancoFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBancoFormaPago=new JPanel();
				this.jPanelAccionesFormularioBancoFormaPago=new JPanel();
				this.jmenuBarDetalleBancoFormaPago=new JMenuBar();
				this.jTtoolBarDetalleBancoFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BancoFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBancoFormaPago() {
		return this.jButtonActualizarToolBarBancoFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarBancoFormaPago() {
		return this.jButtonEliminarToolBarBancoFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarBancoFormaPago() {
		return this.jButtonCancelarToolBarBancoFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionBancoFormaPago() {
		return this.jButtonProcesarInformacionBancoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBancoFormaPago)	{
		this.jButtonProcesarInformacionBancoFormaPago = jButtonProcesarInformacionBancoFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBancoFormaPago() {
		return this.jComboBoxTiposAccionesBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBancoFormaPago(
			JComboBox jComboBoxTiposRelacionesBancoFormaPago) {
		this.jComboBoxTiposRelacionesBancoFormaPago = jComboBoxTiposRelacionesBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBancoFormaPago(
			JComboBox jComboBoxTiposAccionesBancoFormaPago) {
		this.jComboBoxTiposAccionesBancoFormaPago = jComboBoxTiposAccionesBancoFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBancoFormaPago() {
		return this.jComboBoxTiposAccionesFormularioBancoFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBancoFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioBancoFormaPago) {
		this.jComboBoxTiposAccionesFormularioBancoFormaPago = jComboBoxTiposAccionesFormularioBancoFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		
		this.bancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancoformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBancoFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBancoFormaPago=new JButtonMe();
				this.jButtonModificarToolBarBancoFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago,
							"actualizar","actualizar","Actualizar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago,
							"eliminar","eliminar","Eliminar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago,
							"cancelar","cancelar","Cancelar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBancoFormaPago,this.jTtoolBarDetalleBancoFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBancoFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBancoFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBancoFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBancoFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBancoFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBancoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBancoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBancoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBancoFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBancoFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBancoFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBancoFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBancoFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBancoFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBancoFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBancoFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBancoFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBancoFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBancoFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBancoFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBancoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBancoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBancoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBancoFormaPago.add(this.jMenuItemDetalleCerrarBancoFormaPago);
		
		this.jmenuDetalleAccionesBancoFormaPago.add(this.jMenuItemActualizarBancoFormaPago);
		this.jmenuDetalleAccionesBancoFormaPago.add(this.jMenuItemEliminarBancoFormaPago);
		this.jmenuDetalleAccionesBancoFormaPago.add(this.jMenuItemCancelarBancoFormaPago);		
		
		//this.jmenuDetalleDatosBancoFormaPago.add(this.jMenuItemDetalleAbrirOrderByBancoFormaPago);				
		this.jmenuDetalleDatosBancoFormaPago.add(this.jMenuItemDetalleMostarOcultarBancoFormaPago);				
				
		//this.jmenuDetalleAccionesBancoFormaPago.add(this.jMenuItemGuardarCambiosBancoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBancoFormaPago.add(this.jmenuDetalleArchivoBancoFormaPago);		
		this.jmenuBarDetalleBancoFormaPago.add(this.jmenuDetalleAccionesBancoFormaPago);		
		this.jmenuBarDetalleBancoFormaPago.add(this.jmenuDetalleDatosBancoFormaPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBancoFormaPago);				
	}
	
	
	public void inicializarElementosCamposBancoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBancoFormaPago = new JLabelMe();
		jLabelIdBancoFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBancoFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBancoFormaPago= new GridBagLayout();

		this.jPanelidBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);

		jLabelidBancoFormaPago = new JLabel();
		jLabelidBancoFormaPago.setText("Id");

		jLabelidBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_bancoBancoFormaPago = new JLabelMe();
		this.jLabelnombre_bancoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoBancoFormaPago.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelnombre_bancoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jTextFieldnombre_bancoBancoFormaPago= new JTextFieldMe();

		jTextFieldnombre_bancoBancoFormaPago.setEnabled(false);
		jTextFieldnombre_bancoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_bancoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_bancoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_bancoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_bancoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoBancoFormaPagoBusqueda.setText("U");
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_bancoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_bancoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_giradorBancoFormaPago = new JLabelMe();
		this.jLabelnombre_giradorBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR+" : *");
		this.jLabelnombre_giradorBancoFormaPago.setToolTipText("Nombre Girador");
		this.jLabelnombre_giradorBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_giradorBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_giradorBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_giradorBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelnombre_giradorBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jTextAreanombre_giradorBancoFormaPago= new JTextAreaMe();
		jTextAreanombre_giradorBancoFormaPago.setEnabled(false);
		jTextAreanombre_giradorBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorBancoFormaPago.setLineWrap(true);
		jTextAreanombre_giradorBancoFormaPago.setWrapStyleWord(true);
		jTextAreanombre_giradorBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_giradorBancoFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_giradorBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_giradorBancoFormaPago = new JScrollPane(jTextAreanombre_giradorBancoFormaPago);
		jscrollPanenombre_giradorBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_giradorBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_giradorBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_giradorBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_giradorBancoFormaPagoBusqueda.setText("U");
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_giradorBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_giradorBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_giradorBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_giradorBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_giradorBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceBancoFormaPago = new JLabelMe();
		this.jLabelfecha_venceBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceBancoFormaPago.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelfecha_venceBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		//jFormattedTextFieldfecha_venceBancoFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_venceBancoFormaPago= new JDateChooser();
		jDateChooserfecha_venceBancoFormaPago.setEnabled(false);
		jDateChooserfecha_venceBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceBancoFormaPago.setDate(new Date());
		jDateChooserfecha_venceBancoFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceBancoFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceBancoFormaPagoBusqueda.setText("U");
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuenta_bancoBancoFormaPago = new JLabelMe();
		this.jLabelnumero_cuenta_bancoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO+" : *");
		this.jLabelnumero_cuenta_bancoBancoFormaPago.setToolTipText("Numero Cuenta Banco");
		this.jLabelnumero_cuenta_bancoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_cuenta_bancoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_cuenta_bancoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuenta_bancoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuenta_bancoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuenta_bancoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelnumero_cuenta_bancoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jTextFieldnumero_cuenta_bancoBancoFormaPago= new JTextFieldMe();

		jTextFieldnumero_cuenta_bancoBancoFormaPago.setEnabled(false);
		jTextFieldnumero_cuenta_bancoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuenta_bancoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuenta_bancoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuenta_bancoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setText("U");
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuenta_bancoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuenta_bancoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuenta_bancoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeBancoFormaPago = new JLabelMe();
		this.jLabelnumero_chequeBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeBancoFormaPago.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelnumero_chequeBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jTextFieldnumero_chequeBancoFormaPago= new JTextFieldMe();

		jTextFieldnumero_chequeBancoFormaPago.setEnabled(false);
		jTextFieldnumero_chequeBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeBancoFormaPagoBusqueda.setText("U");
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeBancoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_montoBancoFormaPago = new JLabelMe();
		this.jLabelvalor_montoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO+" : *");
		this.jLabelvalor_montoBancoFormaPago.setToolTipText("Valor Monto");
		this.jLabelvalor_montoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_montoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_montoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_montoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelvalor_montoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jTextFieldvalor_montoBancoFormaPago= new JTextFieldMe();
		jTextFieldvalor_montoBancoFormaPago.setEnabled(false);
		jTextFieldvalor_montoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_montoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_montoBancoFormaPago.setText("0.0");

		this.jButtonvalor_montoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_montoBancoFormaPagoBusqueda.setText("U");
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_montoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_montoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_montoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_montoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_montoBancoFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBancoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBancoFormaPago = new JLabelMe();
		this.jLabelid_empresaBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBancoFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_empresaBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_empresaBancoFormaPago= new JComboBoxMe();
		jComboBoxid_empresaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBancoFormaPago.setEnabled(false);

		this.jButtonid_empresaBancoFormaPago= new JButtonMe();
		this.jButtonid_empresaBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBancoFormaPago.setText("Buscar");
		this.jButtonid_empresaBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoFormaPago"));

		this.jButtonid_empresaBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBancoFormaPagoUpdate.setText("U");
		this.jButtonid_empresaBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBancoFormaPagoUpdate"));



					
		this.jLabelid_sucursalBancoFormaPago = new JLabelMe();
		this.jLabelid_sucursalBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBancoFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_sucursalBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_sucursalBancoFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalBancoFormaPago.setEnabled(false);

		this.jButtonid_sucursalBancoFormaPago= new JButtonMe();
		this.jButtonid_sucursalBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBancoFormaPago.setText("Buscar");
		this.jButtonid_sucursalBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBancoFormaPago"));

		this.jButtonid_sucursalBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBancoFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBancoFormaPagoUpdate"));



					
		this.jLabelid_ejercicioBancoFormaPago = new JLabelMe();
		this.jLabelid_ejercicioBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioBancoFormaPago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_ejercicioBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_ejercicioBancoFormaPago= new JComboBoxMe();
		jComboBoxid_ejercicioBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioBancoFormaPago.setEnabled(false);

		this.jButtonid_ejercicioBancoFormaPago= new JButtonMe();
		this.jButtonid_ejercicioBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioBancoFormaPago.setText("Buscar");
		this.jButtonid_ejercicioBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBancoFormaPago"));

		this.jButtonid_ejercicioBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioBancoFormaPagoUpdate.setText("U");
		this.jButtonid_ejercicioBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioBancoFormaPagoUpdate"));



					
		this.jLabelid_periodoBancoFormaPago = new JLabelMe();
		this.jLabelid_periodoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoBancoFormaPago.setToolTipText("Periodo");
		this.jLabelid_periodoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_periodoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_periodoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_periodoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoBancoFormaPago.setEnabled(false);

		this.jButtonid_periodoBancoFormaPago= new JButtonMe();
		this.jButtonid_periodoBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoBancoFormaPago.setText("Buscar");
		this.jButtonid_periodoBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoBancoFormaPago"));

		this.jButtonid_periodoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_periodoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_periodoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_periodoBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_periodoBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoBancoFormaPagoUpdate.setText("U");
		this.jButtonid_periodoBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoBancoFormaPagoUpdate"));



					
		this.jLabelid_facturaBancoFormaPago = new JLabelMe();
		this.jLabelid_facturaBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaBancoFormaPago.setToolTipText("Factura");
		this.jLabelid_facturaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_facturaBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_facturaBancoFormaPago= new JComboBoxMe();
		jComboBoxid_facturaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaBancoFormaPago= new JButtonMe();
		this.jButtonid_facturaBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaBancoFormaPago.setText("Buscar");
		this.jButtonid_facturaBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaBancoFormaPago"));

		this.jButtonid_facturaBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_facturaBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_facturaBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_facturaBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_facturaBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaBancoFormaPagoUpdate.setText("U");
		this.jButtonid_facturaBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaBancoFormaPagoUpdate"));



					
		this.jLabelid_deta_forma_pagoBancoFormaPago = new JLabelMe();
		this.jLabelid_deta_forma_pagoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO+" : *");
		this.jLabelid_deta_forma_pagoBancoFormaPago.setToolTipText("Deta Forma Pago");
		this.jLabelid_deta_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_deta_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_deta_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_deta_forma_pagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_deta_forma_pagoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_deta_forma_pagoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_deta_forma_pagoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_deta_forma_pagoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_deta_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_deta_forma_pagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_deta_forma_pagoBancoFormaPago= new JButtonMe();
		this.jButtonid_deta_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pagoBancoFormaPago.setText("Buscar");
		this.jButtonid_deta_forma_pagoBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_deta_forma_pagoBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pagoBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_deta_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pagoBancoFormaPago"));

		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_deta_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pagoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_deta_forma_pagoBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setText("U");
		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pagoBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_deta_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pagoBancoFormaPagoUpdate"));



					
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago = new JLabelMe();
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO+" : *");
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago.setToolTipText("Tipo Banco Forma Pago");
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_banco_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_banco_forma_pagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_banco_forma_pagoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_banco_forma_pagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago= new JButtonMe();
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setText("Buscar");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_forma_pagoBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_forma_pagoBancoFormaPago"));

		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_forma_pagoBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_forma_pagoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_forma_pagoBancoFormaPagoUpdate"));



					
		this.jLabelid_anioBancoFormaPago = new JLabelMe();
		this.jLabelid_anioBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioBancoFormaPago.setToolTipText("Anio");
		this.jLabelid_anioBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_anioBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_anioBancoFormaPago= new JComboBoxMe();
		jComboBoxid_anioBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioBancoFormaPago.setEnabled(false);

		this.jButtonid_anioBancoFormaPago= new JButtonMe();
		this.jButtonid_anioBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioBancoFormaPago.setText("Buscar");
		this.jButtonid_anioBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioBancoFormaPago"));

		this.jButtonid_anioBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_anioBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_anioBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_anioBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_anioBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioBancoFormaPagoUpdate.setText("U");
		this.jButtonid_anioBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioBancoFormaPagoUpdate"));



					
		this.jLabelid_mesBancoFormaPago = new JLabelMe();
		this.jLabelid_mesBancoFormaPago.setText(""+BancoFormaPagoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesBancoFormaPago.setToolTipText("Mes");
		this.jLabelid_mesBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesBancoFormaPago.setToolTipText(BancoFormaPagoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutBancoFormaPago = new GridBagLayout();
		this.jPanelid_mesBancoFormaPago.setLayout(this.gridaBagLayoutBancoFormaPago);


		jComboBoxid_mesBancoFormaPago= new JComboBoxMe();
		jComboBoxid_mesBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesBancoFormaPago.setEnabled(false);

		this.jButtonid_mesBancoFormaPago= new JButtonMe();
		this.jButtonid_mesBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesBancoFormaPago.setText("Buscar");
		this.jButtonid_mesBancoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesBancoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesBancoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesBancoFormaPago"));

		this.jButtonid_mesBancoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_mesBancoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesBancoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesBancoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesBancoFormaPagoBusqueda.setText("U");
		this.jButtonid_mesBancoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesBancoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesBancoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesBancoFormaPagoBusqueda"));

		if(this.bancoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesBancoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_mesBancoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_mesBancoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesBancoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesBancoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesBancoFormaPagoUpdate.setText("U");
		this.jButtonid_mesBancoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesBancoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesBancoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesBancoFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleBancoFormaPago = new BancoFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Banco Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBancoFormaPago= new GridBagLayout();
		

		
		String sToolTipBancoFormaPago="";
		sToolTipBancoFormaPago=BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBancoFormaPago+="(Tesoreria.BancoFormaPago)";
		}
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBancoFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBancoFormaPago = new JButtonMe();
		this.jButtonModificarBancoFormaPago = new JButtonMe();
        this.jButtonActualizarBancoFormaPago = new JButtonMe();
        this.jButtonEliminarBancoFormaPago = new JButtonMe();
        this.jButtonCancelarBancoFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosBancoFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaBancoFormaPago = new JButtonMe();
		this.jButtonCerrarBancoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosBancoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionBancoFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralBancoFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Banco Forma Pago";
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBancoFormaPago.setName("jPanelCamposBancoFormaPago"); 

		this.jPanelCamposOcultosBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBancoFormaPago.setName("jPanelCamposOcultosBancoFormaPago"); 

        this.jPanelAccionesBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesBancoFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBancoFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBancoFormaPago.setText("Nuevo");
		this.jButtonModificarBancoFormaPago.setText("Editar");
        this.jButtonActualizarBancoFormaPago.setText("Actualizar");
        this.jButtonEliminarBancoFormaPago.setText("Eliminar");
        this.jButtonCancelarBancoFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosBancoFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaBancoFormaPago.setText("Guardar");
		this.jButtonCerrarBancoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBancoFormaPago,"nuevo_button","Nuevo",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBancoFormaPago,"modificar_button","Editar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBancoFormaPago,"actualizar_button","Actualizar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBancoFormaPago,"eliminar_button","Eliminar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBancoFormaPago,"cancelar_button","Cancelar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBancoFormaPago,"guardarcambios_button","Guardar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBancoFormaPago,"guardarcambiostabla_button","Guardar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBancoFormaPago,"cerrar_button","Salir",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBancoFormaPago.setToolTipText("Nuevo"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBancoFormaPago.setToolTipText("Editar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBancoFormaPago.setToolTipText("Actualizar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBancoFormaPago.setToolTipText("Eliminar)"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBancoFormaPago.setToolTipText("Cancelar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBancoFormaPago.setToolTipText("Guardar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBancoFormaPago.setToolTipText("Guardar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBancoFormaPago.setToolTipText("Salir"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBancoFormaPago";
		inputMap = this.jButtonNuevoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBancoFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBancoFormaPago";
		inputMap = this.jButtonActualizarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBancoFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarBancoFormaPago";
		inputMap = this.jButtonEliminarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBancoFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarBancoFormaPago";
		inputMap = this.jButtonCancelarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBancoFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarBancoFormaPago";
		inputMap = this.jButtonCerrarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBancoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBancoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBancoFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBancoFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBancoFormaPago.setToolTipText("Nuevo BancoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBancoFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBancoFormaPago.setToolTipText("Sin Cerrar Ventana BancoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBancoFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBancoFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBancoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesBancoFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBancoFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBancoFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBancoFormaPago = new JLabelMe();
		
		this.jLabelAccionesBancoFormaPago.setText("Acciones");		
		this.jLabelAccionesBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBancoFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBancoFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBancoFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBancoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBancoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBancoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBancoFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBancoFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBancoFormaPago = new GridBagLayout();
		
		this.jPanelCamposBancoFormaPago.setLayout(gridaBagLayoutCamposBancoFormaPago);
		this.jPanelCamposOcultosBancoFormaPago.setLayout(gridaBagLayoutCamposOcultosBancoFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBancoFormaPago.add(jLabelIdBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBancoFormaPago.add(jLabelidBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBancoFormaPago.add(jLabelid_empresaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBancoFormaPago.add(jButtonid_empresaBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBancoFormaPago.add(jButtonid_empresaBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBancoFormaPago.add(jComboBoxid_empresaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBancoFormaPago.add(jLabelid_sucursalBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBancoFormaPago.add(jButtonid_sucursalBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBancoFormaPago.add(jButtonid_sucursalBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBancoFormaPago.add(jComboBoxid_sucursalBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioBancoFormaPago.add(jLabelid_ejercicioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioBancoFormaPago.add(jButtonid_ejercicioBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioBancoFormaPago.add(jButtonid_ejercicioBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioBancoFormaPago.add(jComboBoxid_ejercicioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoBancoFormaPago.add(jLabelid_periodoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoBancoFormaPago.add(jButtonid_periodoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoBancoFormaPago.add(jButtonid_periodoBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoBancoFormaPago.add(jComboBoxid_periodoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaBancoFormaPago.add(jLabelid_facturaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 2;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaBancoFormaPago.add(jButtonid_facturaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaBancoFormaPago.add(jButtonid_facturaBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 4;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaBancoFormaPago.add(jButtonid_facturaBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaBancoFormaPago.add(jComboBoxid_facturaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_deta_forma_pagoBancoFormaPago.add(jLabelid_deta_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_deta_forma_pagoBancoFormaPago.add(jButtonid_deta_forma_pagoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_deta_forma_pagoBancoFormaPago.add(jButtonid_deta_forma_pagoBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_deta_forma_pagoBancoFormaPago.add(jComboBoxid_deta_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.add(jLabelid_tipo_banco_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.add(jButtonid_tipo_banco_forma_pagoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.add(jButtonid_tipo_banco_forma_pagoBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_banco_forma_pagoBancoFormaPago.add(jComboBoxid_tipo_banco_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoBancoFormaPago.add(jLabelnombre_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoBancoFormaPago.add(jButtonnombre_bancoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoBancoFormaPago.add(jTextFieldnombre_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_giradorBancoFormaPago.add(jLabelnombre_giradorBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_giradorBancoFormaPago.add(jButtonnombre_giradorBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_giradorBancoFormaPago.add(jscrollPanenombre_giradorBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceBancoFormaPago.add(jLabelfecha_venceBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceBancoFormaPago.add(jButtonfecha_venceBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceBancoFormaPago.add(jDateChooserfecha_venceBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuenta_bancoBancoFormaPago.add(jLabelnumero_cuenta_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuenta_bancoBancoFormaPago.add(jButtonnumero_cuenta_bancoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuenta_bancoBancoFormaPago.add(jTextFieldnumero_cuenta_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeBancoFormaPago.add(jLabelnumero_chequeBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeBancoFormaPago.add(jButtonnumero_chequeBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeBancoFormaPago.add(jTextFieldnumero_chequeBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_montoBancoFormaPago.add(jLabelvalor_montoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_montoBancoFormaPago.add(jButtonvalor_montoBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_montoBancoFormaPago.add(jTextFieldvalor_montoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioBancoFormaPago.add(jLabelid_anioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioBancoFormaPago.add(jButtonid_anioBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioBancoFormaPago.add(jButtonid_anioBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioBancoFormaPago.add(jComboBoxid_anioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 0;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesBancoFormaPago.add(jLabelid_mesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 2;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesBancoFormaPago.add(jButtonid_mesBancoFormaPagoBusqueda, this.gridBagConstraintsBancoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 3;
		this.gridBagConstraintsBancoFormaPago.ipadx = 0;
		this.gridBagConstraintsBancoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesBancoFormaPago.add(jButtonid_mesBancoFormaPagoUpdate, this.gridBagConstraintsBancoFormaPago);
	}

	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBancoFormaPago.gridy = 0;
	this.gridBagConstraintsBancoFormaPago.gridx = 1;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesBancoFormaPago.add(jComboBoxid_mesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelidBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelid_facturaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelid_deta_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelid_tipo_banco_forma_pagoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelnombre_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelnombre_giradorBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelfecha_venceBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelnumero_cuenta_bancoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelnumero_chequeBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBancoFormaPago.add(this.jPanelvalor_montoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposBancoFormaPago % 2==0) {
		iXPanelCamposBancoFormaPago=0;
		iYPanelCamposBancoFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_empresaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_sucursalBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_ejercicioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_periodoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_anioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
	}
	this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBancoFormaPago.gridy = iYPanelCamposOcultosBancoFormaPago;
	this.gridBagConstraintsBancoFormaPago.gridx = iXPanelCamposOcultosBancoFormaPago++;
	this.gridBagConstraintsBancoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBancoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBancoFormaPago.add(this.jPanelid_mesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);



	if(iXPanelCamposOcultosBancoFormaPago % 2==0) {
		iXPanelCamposOcultosBancoFormaPago=0;
		iYPanelCamposOcultosBancoFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesBancoFormaPago.setLayout(gridaBagLayoutAccionesBancoFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioBancoFormaPago.setLayout(gridaBagLayoutAccionesFormularioBancoFormaPago);
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBancoFormaPago.add(this.jComboBoxTiposAccionesFormularioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBancoFormaPago.add(this.jCheckBoxPostAccionNuevoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBancoFormaPago.add(this.jCheckBoxPostAccionSinCerrarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBancoFormaPago.add(this.jCheckBoxPostAccionSinMensajeBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesBancoFormaPago.add(this.jButtonModificarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);							

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesBancoFormaPago.add(this.jButtonEliminarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesBancoFormaPago.add(this.jButtonActualizarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesBancoFormaPago.add(this.jButtonGuardarCambiosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);	
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = 0;		
		this.gridBagConstraintsBancoFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesBancoFormaPago.add(this.jButtonCancelarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBancoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBancoFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoFormaPago.gridx = 0;		
			//this.gridBagConstraintsBancoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBancoFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBancoFormaPago.gridx =0;
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBancoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBancoFormaPago = new BancoFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Banco Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Banco Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Banco Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BancoFormaPagoModel bancoformapagoModel=new BancoFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//BancoFormaPagoModel.BancoFormaPagoFocusTraversalPolicy bancoformapagoFocusTraversalPolicy = bancoformapagoModel.new BancoFormaPagoFocusTraversalPolicy(this);
			
			//bancoformapagoFocusTraversalPolicy.setbancoformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bancoformapagoModel);
			
			
			this.jContentPaneDetalleBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBancoFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleBancoFormaPago.setLayout(gridaBagLayoutDetalleBancoFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBancoFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBancoFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleBancoFormaPago.add(jTtoolBarDetalleBancoFormaPago, gridBagConstraintsBancoFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionBancoFormaPago=   new JScrollPane(jContentPaneDetalleBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBancoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBancoFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleBancoFormaPago.add(jPanelCamposBancoFormaPago, gridBagConstraintsBancoFormaPago);
			
			
			
			
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
						&& bancoformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bancoformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBancoFormaPago= new GridBagConstraints();
						this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBancoFormaPago.gridx = 0;
						this.jContentPaneDetalleBancoFormaPago.add(this.jTabbedPaneRelacionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBancoFormaPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBancoFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
					this.gridBagConstraintsBancoFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBancoFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleBancoFormaPago.add(jPanelCamposOcultosBancoFormaPago, gridBagConstraintsBancoFormaPago);
				
					this.jPanelCamposOcultosBancoFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBancoFormaPago.gridx = 0;
	        this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBancoFormaPago.add(this.jPanelAccionesFormularioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);							
			
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsBancoFormaPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBancoFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleBancoFormaPago.add(this.jPanelAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBancoFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBancoFormaPago=   new JScrollPane(this.jPanelCamposBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBancoFormaPago.gridx = 0;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBancoFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBancoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBancoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBancoFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionBancoFormaPago;
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
