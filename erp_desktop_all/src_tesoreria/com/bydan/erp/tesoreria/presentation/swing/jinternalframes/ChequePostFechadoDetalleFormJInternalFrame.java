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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.tesoreria.util.ChequePostFechadoConstantesFunciones;

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
public class ChequePostFechadoDetalleFormJInternalFrame extends ChequePostFechadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleChequePostFechado;
	
	protected JMenuBar jmenuBarDetalleChequePostFechado;
	
	protected JMenu jmenuDetalleChequePostFechado;
	protected JMenu jmenuDetalleArchivoChequePostFechado;
	protected JMenu jmenuDetalleAccionesChequePostFechado;
	protected JMenu jmenuDetalleDatosChequePostFechado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutChequePostFechado;	
	protected GridBagConstraints gridBagConstraintsChequePostFechado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ChequePostFechadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleChequePostFechado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public ChequePostFechadoSessionBean chequepostfechadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public ChequePostFechadoLogic chequepostfechadoLogic;
	
	public JScrollPane jScrollPanelDatosChequePostFechado;
	public JScrollPane jScrollPanelDatosEdicionChequePostFechado;
	public JScrollPane jScrollPanelDatosGeneralChequePostFechado;
	
	protected JPanel jPanelCamposChequePostFechado;    
	protected JPanel jPanelCamposOcultosChequePostFechado;    	
	protected JPanel jPanelAccionesChequePostFechado;
	protected JPanel jPanelAccionesFormularioChequePostFechado;
    
	
	
	protected Integer iXPanelCamposChequePostFechado=0;
	protected Integer iYPanelCamposChequePostFechado=0;
	
	protected Integer iXPanelCamposOcultosChequePostFechado=0;
	protected Integer iYPanelCamposOcultosChequePostFechado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoChequePostFechado;
	public JButton jButtonModificarChequePostFechado;
	public JButton jButtonActualizarChequePostFechado;
    public JButton jButtonEliminarChequePostFechado;
	public JButton jButtonCancelarChequePostFechado;
    public JButton jButtonGuardarCambiosChequePostFechado;
	public JButton jButtonGuardarCambiosTablaChequePostFechado;
	protected JButton jButtonCerrarChequePostFechado;
	
	
	protected JButton jButtonProcesarInformacionChequePostFechado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoChequePostFechado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarChequePostFechado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeChequePostFechado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarChequePostFechado;
	protected JButton jButtonModificarToolBarChequePostFechado;
	protected JButton jButtonActualizarToolBarChequePostFechado;
    protected JButton jButtonEliminarToolBarChequePostFechado;
	protected JButton jButtonCancelarToolBarChequePostFechado;
    protected JButton jButtonGuardarCambiosToolBarChequePostFechado;
	protected JButton jButtonGuardarCambiosTablaToolBarChequePostFechado;
	protected JButton jButtonMostrarOcultarTablaToolBarChequePostFechado;
	protected JButton jButtonCerrarToolBarChequePostFechado;
	
	protected JButton jButtonProcesarInformacionToolBarChequePostFechado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoChequePostFechado;
	protected JMenuItem jMenuItemModificarChequePostFechado;
	protected JMenuItem jMenuItemActualizarChequePostFechado;
    protected JMenuItem jMenuItemEliminarChequePostFechado;
	protected JMenuItem jMenuItemCancelarChequePostFechado;
    protected JMenuItem jMenuItemGuardarCambiosChequePostFechado;
	protected JMenuItem jMenuItemGuardarCambiosTablaChequePostFechado;
	protected JMenuItem jMenuItemCerrarChequePostFechado;
	protected JMenuItem jMenuItemDetalleCerrarChequePostFechado;
	protected JMenuItem jMenuItemDetalleMostarOcultarChequePostFechado;
	
	protected JMenuItem jMenuItemProcesarInformacionChequePostFechado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosChequePostFechado;
	protected JMenuItem jMenuItemMostrarOcultarChequePostFechado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesChequePostFechado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesChequePostFechado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesChequePostFechado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioChequePostFechado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidChequePostFechado;
	public JLabel jLabelIdChequePostFechado;
	public JLabel jLabelidChequePostFechado;
	public JButton jButtonidChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_giraChequePostFechado;
	public JLabel jLabelnombre_giraChequePostFechado;
	public JTextArea jTextAreanombre_giraChequePostFechado;
	public JScrollPane jscrollPanenombre_giraChequePostFechado;
	public JButton jButtonnombre_giraChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoChequePostFechado;
	public JLabel jLabelfecha_vencimientoChequePostFechado;
	//public JFormattedTextField jDateChooserfecha_vencimientoChequePostFechado;

	public JDateChooser jDateChooserfecha_vencimientoChequePostFechado;
	public JButton jButtonfecha_vencimientoChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_originalChequePostFechado;
	public JLabel jLabelfecha_vencimiento_originalChequePostFechado;
	//public JFormattedTextField jDateChooserfecha_vencimiento_originalChequePostFechado;

	public JDateChooser jDateChooserfecha_vencimiento_originalChequePostFechado;
	public JButton jButtonfecha_vencimiento_originalChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelnumeroChequePostFechado;
	public JLabel jLabelnumeroChequePostFechado;
	public JTextField jTextFieldnumeroChequePostFechado;
	public JButton jButtonnumeroChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeChequePostFechado;
	public JLabel jLabelnumero_chequeChequePostFechado;
	public JTextField jTextFieldnumero_chequeChequePostFechado;
	public JButton jButtonnumero_chequeChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionChequePostFechado;
	public JLabel jLabeldescripcionChequePostFechado;
	public JTextArea jTextAreadescripcionChequePostFechado;
	public JScrollPane jscrollPanedescripcionChequePostFechado;
	public JButton jButtondescripcionChequePostFechadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaChequePostFechado;
	public JLabel jLabelid_empresaChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaChequePostFechado;
	public JButton jButtonid_empresaChequePostFechado= new JButtonMe();
	public JButton jButtonid_empresaChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalChequePostFechado;
	public JLabel jLabelid_sucursalChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalChequePostFechado;
	public JButton jButtonid_sucursalChequePostFechado= new JButtonMe();
	public JButton jButtonid_sucursalChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteChequePostFechado;
	public JLabel jLabelid_clienteChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteChequePostFechado;
	public JButton jButtonid_clienteChequePostFechado= new JButtonMe();
	public JButton jButtonid_clienteChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_clienteChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableChequePostFechado;
	public JLabel jLabelid_asiento_contableChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableChequePostFechado;
	public JButton jButtonid_asiento_contableChequePostFechado= new JButtonMe();
	public JButton jButtonid_asiento_contableChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioChequePostFechado;
	public JLabel jLabelid_ejercicioChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioChequePostFechado;
	public JButton jButtonid_ejercicioChequePostFechado= new JButtonMe();
	public JButton jButtonid_ejercicioChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoChequePostFechado;
	public JLabel jLabelid_periodoChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoChequePostFechado;
	public JButton jButtonid_periodoChequePostFechado= new JButtonMe();
	public JButton jButtonid_periodoChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_periodoChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoChequePostFechado;
	public JLabel jLabelid_tipo_forma_pagoChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoChequePostFechado;
	public JButton jButtonid_tipo_forma_pagoChequePostFechado= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioChequePostFechado;
	public JLabel jLabelid_anioChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioChequePostFechado;
	public JButton jButtonid_anioChequePostFechado= new JButtonMe();
	public JButton jButtonid_anioChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_anioChequePostFechadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesChequePostFechado;
	public JLabel jLabelid_mesChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesChequePostFechado;
	public JButton jButtonid_mesChequePostFechado= new JButtonMe();
	public JButton jButtonid_mesChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_mesChequePostFechadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesChequePostFechado;
	
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
	
	public ChequePostFechadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposChequePostFechado=new JPanel();
				this.jPanelAccionesFormularioChequePostFechado=new JPanel();
				this.jmenuBarDetalleChequePostFechado=new JMenuBar();
				this.jTtoolBarDetalleChequePostFechado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ChequePostFechadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarChequePostFechado() {
		return this.jButtonActualizarToolBarChequePostFechado;
	}
	
	public JButton getjButtonEliminarToolBarChequePostFechado() {
		return this.jButtonEliminarToolBarChequePostFechado;
	}
	
	public JButton getjButtonCancelarToolBarChequePostFechado() {
		return this.jButtonCancelarToolBarChequePostFechado;
	}		
	
	public JButton getjButtonProcesarInformacionChequePostFechado() {
		return this.jButtonProcesarInformacionChequePostFechado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionChequePostFechado)	{
		this.jButtonProcesarInformacionChequePostFechado = jButtonProcesarInformacionChequePostFechado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesChequePostFechado() {
		return this.jComboBoxTiposAccionesChequePostFechado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesChequePostFechado(
			JComboBox jComboBoxTiposRelacionesChequePostFechado) {
		this.jComboBoxTiposRelacionesChequePostFechado = jComboBoxTiposRelacionesChequePostFechado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesChequePostFechado(
			JComboBox jComboBoxTiposAccionesChequePostFechado) {
		this.jComboBoxTiposAccionesChequePostFechado = jComboBoxTiposAccionesChequePostFechado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioChequePostFechado() {
		return this.jComboBoxTiposAccionesFormularioChequePostFechado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioChequePostFechado(
			JComboBox jComboBoxTiposAccionesFormularioChequePostFechado) {
		this.jComboBoxTiposAccionesFormularioChequePostFechado = jComboBoxTiposAccionesFormularioChequePostFechado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		
		this.chequepostfechadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequepostfechadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.chequepostfechadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ChequePostFechadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cheque Post Fechado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
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
	
		ChequePostFechadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleChequePostFechado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarChequePostFechado=new JButtonMe();
				this.jButtonModificarToolBarChequePostFechado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado,
							"actualizar","actualizar","Actualizar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado,
							"eliminar","eliminar","Eliminar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado,
							"cancelar","cancelar","Cancelar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarChequePostFechado,this.jTtoolBarDetalleChequePostFechado,
							"guardarcambios","guardarcambios","Guardar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleChequePostFechado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleChequePostFechado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoChequePostFechado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesChequePostFechado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosChequePostFechado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoChequePostFechado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoChequePostFechado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoChequePostFechado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarChequePostFechado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarChequePostFechado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarChequePostFechado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarChequePostFechado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarChequePostFechado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarChequePostFechado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarChequePostFechado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarChequePostFechado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarChequePostFechado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarChequePostFechado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarChequePostFechado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarChequePostFechado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosChequePostFechado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosChequePostFechado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosChequePostFechado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarChequePostFechado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarChequePostFechado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarChequePostFechado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarChequePostFechado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarChequePostFechado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarChequePostFechado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarChequePostFechado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarChequePostFechado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarChequePostFechado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarChequePostFechado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarChequePostFechado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarChequePostFechado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoChequePostFechado.add(this.jMenuItemDetalleCerrarChequePostFechado);
		
		this.jmenuDetalleAccionesChequePostFechado.add(this.jMenuItemActualizarChequePostFechado);
		this.jmenuDetalleAccionesChequePostFechado.add(this.jMenuItemEliminarChequePostFechado);
		this.jmenuDetalleAccionesChequePostFechado.add(this.jMenuItemCancelarChequePostFechado);		
		
		//this.jmenuDetalleDatosChequePostFechado.add(this.jMenuItemDetalleAbrirOrderByChequePostFechado);				
		this.jmenuDetalleDatosChequePostFechado.add(this.jMenuItemDetalleMostarOcultarChequePostFechado);				
				
		//this.jmenuDetalleAccionesChequePostFechado.add(this.jMenuItemGuardarCambiosChequePostFechado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleChequePostFechado.add(this.jmenuDetalleArchivoChequePostFechado);		
		this.jmenuBarDetalleChequePostFechado.add(this.jmenuDetalleAccionesChequePostFechado);		
		this.jmenuBarDetalleChequePostFechado.add(this.jmenuDetalleDatosChequePostFechado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleChequePostFechado);				
	}
	
	
	public void inicializarElementosCamposChequePostFechado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdChequePostFechado = new JLabelMe();
		jLabelIdChequePostFechado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidChequePostFechado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutChequePostFechado= new GridBagLayout();

		this.jPanelidChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);

		jLabelidChequePostFechado = new JLabel();
		jLabelidChequePostFechado.setText("Id");

		jLabelidChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_giraChequePostFechado = new JLabelMe();
		this.jLabelnombre_giraChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA+" : *");
		this.jLabelnombre_giraChequePostFechado.setToolTipText("Nombre Gira");
		this.jLabelnombre_giraChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giraChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giraChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_giraChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_giraChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_giraChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_NOMBREGIRA);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelnombre_giraChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jTextAreanombre_giraChequePostFechado= new JTextAreaMe();
		jTextAreanombre_giraChequePostFechado.setEnabled(false);
		jTextAreanombre_giraChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giraChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giraChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giraChequePostFechado.setLineWrap(true);
		jTextAreanombre_giraChequePostFechado.setWrapStyleWord(true);
		jTextAreanombre_giraChequePostFechado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_giraChequePostFechado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_giraChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_giraChequePostFechado = new JScrollPane(jTextAreanombre_giraChequePostFechado);
		jscrollPanenombre_giraChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_giraChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_giraChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_giraChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonnombre_giraChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giraChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giraChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_giraChequePostFechadoBusqueda.setText("U");
		this.jButtonnombre_giraChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_giraChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_giraChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_giraChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_giraChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_giraChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_giraChequePostFechadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoChequePostFechado = new JLabelMe();
		this.jLabelfecha_vencimientoChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoChequePostFechado.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelfecha_vencimientoChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		//jFormattedTextFieldfecha_vencimientoChequePostFechado= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoChequePostFechado= new JDateChooser();
		jDateChooserfecha_vencimientoChequePostFechado.setEnabled(false);
		jDateChooserfecha_vencimientoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoChequePostFechado.setDate(new Date());
		jDateChooserfecha_vencimientoChequePostFechado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoChequePostFechado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setText("U");
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoChequePostFechadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimiento_originalChequePostFechado = new JLabelMe();
		this.jLabelfecha_vencimiento_originalChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL+" : *");
		this.jLabelfecha_vencimiento_originalChequePostFechado.setToolTipText("Fecha Vencimiento Original");
		this.jLabelfecha_vencimiento_originalChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_originalChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_originalChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_originalChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelfecha_vencimiento_originalChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		//jFormattedTextFieldfecha_vencimiento_originalChequePostFechado= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_originalChequePostFechado= new JDateChooser();
		jDateChooserfecha_vencimiento_originalChequePostFechado.setEnabled(false);
		jDateChooserfecha_vencimiento_originalChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_originalChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_originalChequePostFechado.setDate(new Date());
		jDateChooserfecha_vencimiento_originalChequePostFechado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_originalChequePostFechado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setText("U");
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_originalChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_originalChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_originalChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_originalChequePostFechadoBusqueda.setVisible(false);		}


					
		this.jLabelnumeroChequePostFechado = new JLabelMe();
		this.jLabelnumeroChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroChequePostFechado.setToolTipText("Numero");
		this.jLabelnumeroChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelnumeroChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jTextFieldnumeroChequePostFechado= new JTextFieldMe();

		jTextFieldnumeroChequePostFechado.setEnabled(false);
		jTextFieldnumeroChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonnumeroChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroChequePostFechadoBusqueda.setText("U");
		this.jButtonnumeroChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroChequePostFechadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeChequePostFechado = new JLabelMe();
		this.jLabelnumero_chequeChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeChequePostFechado.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelnumero_chequeChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jTextFieldnumero_chequeChequePostFechado= new JTextFieldMe();

		jTextFieldnumero_chequeChequePostFechado.setEnabled(false);
		jTextFieldnumero_chequeChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeChequePostFechadoBusqueda.setText("U");
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeChequePostFechadoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionChequePostFechado = new JLabelMe();
		this.jLabeldescripcionChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionChequePostFechado.setToolTipText("Descripcion");
		this.jLabeldescripcionChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPaneldescripcionChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jTextAreadescripcionChequePostFechado= new JTextAreaMe();
		jTextAreadescripcionChequePostFechado.setEnabled(false);
		jTextAreadescripcionChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionChequePostFechado.setLineWrap(true);
		jTextAreadescripcionChequePostFechado.setWrapStyleWord(true);
		jTextAreadescripcionChequePostFechado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionChequePostFechado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionChequePostFechado = new JScrollPane(jTextAreadescripcionChequePostFechado);
		jscrollPanedescripcionChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionChequePostFechadoBusqueda= new JButtonMe();
		this.jButtondescripcionChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionChequePostFechadoBusqueda.setText("U");
		this.jButtondescripcionChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionChequePostFechadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysChequePostFechado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaChequePostFechado = new JLabelMe();
		this.jLabelid_empresaChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaChequePostFechado.setToolTipText("Empresa");
		this.jLabelid_empresaChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_empresaChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_empresaChequePostFechado= new JComboBoxMe();
		jComboBoxid_empresaChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaChequePostFechado.setEnabled(false);

		this.jButtonid_empresaChequePostFechado= new JButtonMe();
		this.jButtonid_empresaChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequePostFechado.setText("Buscar");
		this.jButtonid_empresaChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequePostFechado"));

		this.jButtonid_empresaChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_empresaChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaChequePostFechadoBusqueda.setText("U");
		this.jButtonid_empresaChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_empresaChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaChequePostFechadoUpdate.setText("U");
		this.jButtonid_empresaChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequePostFechadoUpdate"));



					
		this.jLabelid_sucursalChequePostFechado = new JLabelMe();
		this.jLabelid_sucursalChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalChequePostFechado.setToolTipText("Sucursal");
		this.jLabelid_sucursalChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_sucursalChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_sucursalChequePostFechado= new JComboBoxMe();
		jComboBoxid_sucursalChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalChequePostFechado.setEnabled(false);

		this.jButtonid_sucursalChequePostFechado= new JButtonMe();
		this.jButtonid_sucursalChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalChequePostFechado.setText("Buscar");
		this.jButtonid_sucursalChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalChequePostFechado"));

		this.jButtonid_sucursalChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_sucursalChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalChequePostFechadoBusqueda.setText("U");
		this.jButtonid_sucursalChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_sucursalChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalChequePostFechadoUpdate.setText("U");
		this.jButtonid_sucursalChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalChequePostFechadoUpdate"));



					
		this.jLabelid_clienteChequePostFechado = new JLabelMe();
		this.jLabelid_clienteChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteChequePostFechado.setToolTipText("Cliente");
		this.jLabelid_clienteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_clienteChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_clienteChequePostFechado= new JComboBoxMe();
		jComboBoxid_clienteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteChequePostFechado= new JButtonMe();
		this.jButtonid_clienteChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteChequePostFechado.setText("Buscar");
		this.jButtonid_clienteChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteChequePostFechado"));

		this.jButtonid_clienteChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_clienteChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteChequePostFechadoBusqueda.setText("U");
		this.jButtonid_clienteChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_clienteChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_clienteChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteChequePostFechadoUpdate.setText("U");
		this.jButtonid_clienteChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteChequePostFechadoUpdate"));



					
		this.jLabelid_asiento_contableChequePostFechado = new JLabelMe();
		this.jLabelid_asiento_contableChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableChequePostFechado.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_asiento_contableChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_asiento_contableChequePostFechado= new JComboBoxMe();
		jComboBoxid_asiento_contableChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableChequePostFechado= new JButtonMe();
		this.jButtonid_asiento_contableChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableChequePostFechado.setText("Buscar");
		this.jButtonid_asiento_contableChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableChequePostFechado"));

		this.jButtonid_asiento_contableChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableChequePostFechadoBusqueda.setText("U");
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableChequePostFechadoUpdate.setText("U");
		this.jButtonid_asiento_contableChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableChequePostFechadoUpdate"));



					
		this.jLabelid_ejercicioChequePostFechado = new JLabelMe();
		this.jLabelid_ejercicioChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioChequePostFechado.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_ejercicioChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_ejercicioChequePostFechado= new JComboBoxMe();
		jComboBoxid_ejercicioChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioChequePostFechado.setEnabled(false);

		this.jButtonid_ejercicioChequePostFechado= new JButtonMe();
		this.jButtonid_ejercicioChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioChequePostFechado.setText("Buscar");
		this.jButtonid_ejercicioChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioChequePostFechado"));

		this.jButtonid_ejercicioChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioChequePostFechadoBusqueda.setText("U");
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_ejercicioChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioChequePostFechadoUpdate.setText("U");
		this.jButtonid_ejercicioChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioChequePostFechadoUpdate"));



					
		this.jLabelid_periodoChequePostFechado = new JLabelMe();
		this.jLabelid_periodoChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoChequePostFechado.setToolTipText("Periodo");
		this.jLabelid_periodoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_periodoChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_periodoChequePostFechado= new JComboBoxMe();
		jComboBoxid_periodoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoChequePostFechado.setEnabled(false);

		this.jButtonid_periodoChequePostFechado= new JButtonMe();
		this.jButtonid_periodoChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoChequePostFechado.setText("Buscar");
		this.jButtonid_periodoChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoChequePostFechado"));

		this.jButtonid_periodoChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_periodoChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoChequePostFechadoBusqueda.setText("U");
		this.jButtonid_periodoChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_periodoChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_periodoChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoChequePostFechadoUpdate.setText("U");
		this.jButtonid_periodoChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoChequePostFechadoUpdate"));



					
		this.jLabelid_tipo_forma_pagoChequePostFechado = new JLabelMe();
		this.jLabelid_tipo_forma_pagoChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoChequePostFechado.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_tipo_forma_pagoChequePostFechado= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoChequePostFechado= new JButtonMe();
		this.jButtonid_tipo_forma_pagoChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoChequePostFechado.setText("Buscar");
		this.jButtonid_tipo_forma_pagoChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoChequePostFechado"));

		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoChequePostFechadoUpdate"));



					
		this.jLabelid_anioChequePostFechado = new JLabelMe();
		this.jLabelid_anioChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioChequePostFechado.setToolTipText("Anio");
		this.jLabelid_anioChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_anioChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_anioChequePostFechado= new JComboBoxMe();
		jComboBoxid_anioChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioChequePostFechado.setEnabled(false);

		this.jButtonid_anioChequePostFechado= new JButtonMe();
		this.jButtonid_anioChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioChequePostFechado.setText("Buscar");
		this.jButtonid_anioChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioChequePostFechado"));

		this.jButtonid_anioChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_anioChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioChequePostFechadoBusqueda.setText("U");
		this.jButtonid_anioChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_anioChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_anioChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioChequePostFechadoUpdate.setText("U");
		this.jButtonid_anioChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioChequePostFechadoUpdate"));



					
		this.jLabelid_mesChequePostFechado = new JLabelMe();
		this.jLabelid_mesChequePostFechado.setText(""+ChequePostFechadoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesChequePostFechado.setToolTipText("Mes");
		this.jLabelid_mesChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesChequePostFechado.setToolTipText(ChequePostFechadoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutChequePostFechado = new GridBagLayout();
		this.jPanelid_mesChequePostFechado.setLayout(this.gridaBagLayoutChequePostFechado);


		jComboBoxid_mesChequePostFechado= new JComboBoxMe();
		jComboBoxid_mesChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesChequePostFechado.setEnabled(false);

		this.jButtonid_mesChequePostFechado= new JButtonMe();
		this.jButtonid_mesChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesChequePostFechado.setText("Buscar");
		this.jButtonid_mesChequePostFechado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesChequePostFechado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesChequePostFechado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesChequePostFechado"));

		this.jButtonid_mesChequePostFechadoBusqueda= new JButtonMe();
		this.jButtonid_mesChequePostFechadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesChequePostFechadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesChequePostFechadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesChequePostFechadoBusqueda.setText("U");
		this.jButtonid_mesChequePostFechadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesChequePostFechadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesChequePostFechadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesChequePostFechadoBusqueda"));

		if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesChequePostFechadoBusqueda.setVisible(false);		}

		this.jButtonid_mesChequePostFechadoUpdate= new JButtonMe();
		this.jButtonid_mesChequePostFechadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesChequePostFechadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesChequePostFechadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesChequePostFechadoUpdate.setText("U");
		this.jButtonid_mesChequePostFechadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesChequePostFechadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesChequePostFechadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesChequePostFechado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesChequePostFechado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesChequePostFechadoUpdate"));



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
		//this.jInternalFrameDetalleChequePostFechado = new ChequePostFechadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cheque Post Fechado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutChequePostFechado= new GridBagLayout();
		

		
		String sToolTipChequePostFechado="";
		sToolTipChequePostFechado=ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipChequePostFechado+="(Tesoreria.ChequePostFechado)";
		}
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipChequePostFechado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoChequePostFechado = new JButtonMe();
		this.jButtonModificarChequePostFechado = new JButtonMe();
        this.jButtonActualizarChequePostFechado = new JButtonMe();
        this.jButtonEliminarChequePostFechado = new JButtonMe();
        this.jButtonCancelarChequePostFechado = new JButtonMe();
        this.jButtonGuardarCambiosChequePostFechado = new JButtonMe();
		this.jButtonGuardarCambiosTablaChequePostFechado = new JButtonMe();
		this.jButtonCerrarChequePostFechado = new JButtonMe();
		
		this.jScrollPanelDatosChequePostFechado = new JScrollPane();   
        this.jScrollPanelDatosEdicionChequePostFechado = new JScrollPane();
		this.jScrollPanelDatosGeneralChequePostFechado = new JScrollPane();
				
		
		
		this.jPanelCamposChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cheque Post Fechado";
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados" + this.sPath));
		} else {
			this.jScrollPanelDatosChequePostFechado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposChequePostFechado.setName("jPanelCamposChequePostFechado"); 

		this.jPanelCamposOcultosChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosChequePostFechado.setName("jPanelCamposOcultosChequePostFechado"); 

        this.jPanelAccionesChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesChequePostFechado.setToolTipText("Acciones");
        this.jPanelAccionesChequePostFechado.setName("Acciones"); 

		this.jPanelAccionesFormularioChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioChequePostFechado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioChequePostFechado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoChequePostFechado.setText("Nuevo");
		this.jButtonModificarChequePostFechado.setText("Editar");
        this.jButtonActualizarChequePostFechado.setText("Actualizar");
        this.jButtonEliminarChequePostFechado.setText("Eliminar");
        this.jButtonCancelarChequePostFechado.setText("Cancelar");
        this.jButtonGuardarCambiosChequePostFechado.setText("Guardar");
		this.jButtonGuardarCambiosTablaChequePostFechado.setText("Guardar");
		this.jButtonCerrarChequePostFechado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoChequePostFechado,"nuevo_button","Nuevo",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarChequePostFechado,"modificar_button","Editar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarChequePostFechado,"actualizar_button","Actualizar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarChequePostFechado,"eliminar_button","Eliminar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarChequePostFechado,"cancelar_button","Cancelar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosChequePostFechado,"guardarcambios_button","Guardar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaChequePostFechado,"guardarcambiostabla_button","Guardar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarChequePostFechado,"cerrar_button","Salir",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoChequePostFechado.setToolTipText("Nuevo"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarChequePostFechado.setToolTipText("Editar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarChequePostFechado.setToolTipText("Actualizar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarChequePostFechado.setToolTipText("Eliminar)"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarChequePostFechado.setToolTipText("Cancelar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosChequePostFechado.setToolTipText("Guardar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaChequePostFechado.setToolTipText("Guardar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarChequePostFechado.setToolTipText("Salir"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoChequePostFechado";
		inputMap = this.jButtonNuevoChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoChequePostFechado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoChequePostFechado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarChequePostFechado";
		inputMap = this.jButtonActualizarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarChequePostFechado"));
		
		//ELIMINAR
		sMapKey = "EliminarChequePostFechado";
		inputMap = this.jButtonEliminarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarChequePostFechado"));
		
		//CANCELAR	
		sMapKey = "CancelarChequePostFechado";
		inputMap = this.jButtonCancelarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarChequePostFechado"));
		
		//CERRAR		
		sMapKey = "CerrarChequePostFechado";
		inputMap = this.jButtonCerrarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarChequePostFechado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaChequePostFechado";
		inputMap = this.jButtonGuardarCambiosTablaChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaChequePostFechado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoChequePostFechado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoChequePostFechado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoChequePostFechado.setToolTipText("Nuevo ChequePostFechado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarChequePostFechado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarChequePostFechado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarChequePostFechado.setToolTipText("Sin Cerrar Ventana ChequePostFechado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeChequePostFechado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeChequePostFechado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeChequePostFechado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesChequePostFechado.setText("Accion");
		this.jComboBoxTiposAccionesChequePostFechado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioChequePostFechado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioChequePostFechado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesChequePostFechado = new JLabelMe();
		
		this.jLabelAccionesChequePostFechado.setText("Acciones");		
		this.jLabelAccionesChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposChequePostFechado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysChequePostFechado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesChequePostFechado=new JTabbedPane();
		this.jTabbedPaneRelacionesChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesChequePostFechado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesChequePostFechado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequePostFechado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequePostFechado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioChequePostFechado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioChequePostFechado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioChequePostFechado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposChequePostFechado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosChequePostFechado = new GridBagLayout();
		
		this.jPanelCamposChequePostFechado.setLayout(gridaBagLayoutCamposChequePostFechado);
		this.jPanelCamposOcultosChequePostFechado.setLayout(gridaBagLayoutCamposOcultosChequePostFechado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidChequePostFechado.add(jLabelIdChequePostFechado, this.gridBagConstraintsChequePostFechado);



	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidChequePostFechado.add(jLabelidChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaChequePostFechado.add(jLabelid_empresaChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaChequePostFechado.add(jButtonid_empresaChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaChequePostFechado.add(jButtonid_empresaChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaChequePostFechado.add(jComboBoxid_empresaChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalChequePostFechado.add(jLabelid_sucursalChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalChequePostFechado.add(jButtonid_sucursalChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalChequePostFechado.add(jButtonid_sucursalChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalChequePostFechado.add(jComboBoxid_sucursalChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteChequePostFechado.add(jLabelid_clienteChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 2;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteChequePostFechado.add(jButtonid_clienteChequePostFechado, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteChequePostFechado.add(jButtonid_clienteChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 4;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteChequePostFechado.add(jButtonid_clienteChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteChequePostFechado.add(jComboBoxid_clienteChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableChequePostFechado.add(jLabelid_asiento_contableChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 2;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableChequePostFechado.add(jButtonid_asiento_contableChequePostFechado, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableChequePostFechado.add(jButtonid_asiento_contableChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 4;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableChequePostFechado.add(jButtonid_asiento_contableChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableChequePostFechado.add(jComboBoxid_asiento_contableChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioChequePostFechado.add(jLabelid_ejercicioChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioChequePostFechado.add(jButtonid_ejercicioChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioChequePostFechado.add(jButtonid_ejercicioChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioChequePostFechado.add(jComboBoxid_ejercicioChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoChequePostFechado.add(jLabelid_periodoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoChequePostFechado.add(jButtonid_periodoChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoChequePostFechado.add(jButtonid_periodoChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoChequePostFechado.add(jComboBoxid_periodoChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoChequePostFechado.add(jLabelid_tipo_forma_pagoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoChequePostFechado.add(jButtonid_tipo_forma_pagoChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoChequePostFechado.add(jButtonid_tipo_forma_pagoChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoChequePostFechado.add(jComboBoxid_tipo_forma_pagoChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_giraChequePostFechado.add(jLabelnombre_giraChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_giraChequePostFechado.add(jButtonnombre_giraChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_giraChequePostFechado.add(jscrollPanenombre_giraChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoChequePostFechado.add(jLabelfecha_vencimientoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoChequePostFechado.add(jButtonfecha_vencimientoChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoChequePostFechado.add(jDateChooserfecha_vencimientoChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_originalChequePostFechado.add(jLabelfecha_vencimiento_originalChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_originalChequePostFechado.add(jButtonfecha_vencimiento_originalChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_originalChequePostFechado.add(jDateChooserfecha_vencimiento_originalChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroChequePostFechado.add(jLabelnumeroChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroChequePostFechado.add(jButtonnumeroChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroChequePostFechado.add(jTextFieldnumeroChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeChequePostFechado.add(jLabelnumero_chequeChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeChequePostFechado.add(jButtonnumero_chequeChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeChequePostFechado.add(jTextFieldnumero_chequeChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionChequePostFechado.add(jLabeldescripcionChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionChequePostFechado.add(jButtondescripcionChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionChequePostFechado.add(jscrollPanedescripcionChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioChequePostFechado.add(jLabelid_anioChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioChequePostFechado.add(jButtonid_anioChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioChequePostFechado.add(jButtonid_anioChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioChequePostFechado.add(jComboBoxid_anioChequePostFechado, this.gridBagConstraintsChequePostFechado);


	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 0;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesChequePostFechado.add(jLabelid_mesChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 2;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesChequePostFechado.add(jButtonid_mesChequePostFechadoBusqueda, this.gridBagConstraintsChequePostFechado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 3;
		this.gridBagConstraintsChequePostFechado.ipadx = 0;
		this.gridBagConstraintsChequePostFechado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesChequePostFechado.add(jButtonid_mesChequePostFechadoUpdate, this.gridBagConstraintsChequePostFechado);
	}

	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequePostFechado.gridy = 0;
	this.gridBagConstraintsChequePostFechado.gridx = 1;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesChequePostFechado.add(jComboBoxid_mesChequePostFechado, this.gridBagConstraintsChequePostFechado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelidChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelid_clienteChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelid_asiento_contableChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelid_tipo_forma_pagoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelnombre_giraChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelfecha_vencimientoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelfecha_vencimiento_originalChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelnumeroChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPanelnumero_chequeChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequePostFechado.add(this.jPaneldescripcionChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposChequePostFechado % 2==0) {
		iXPanelCamposChequePostFechado=0;
		iYPanelCamposChequePostFechado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_empresaChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_sucursalChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_ejercicioChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_periodoChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_anioChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
	}
	this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequePostFechado.gridy = iYPanelCamposOcultosChequePostFechado;
	this.gridBagConstraintsChequePostFechado.gridx = iXPanelCamposOcultosChequePostFechado++;
	this.gridBagConstraintsChequePostFechado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequePostFechado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequePostFechado.add(this.jPanelid_mesChequePostFechado, this.gridBagConstraintsChequePostFechado);



	if(iXPanelCamposOcultosChequePostFechado % 2==0) {
		iXPanelCamposOcultosChequePostFechado=0;
		iYPanelCamposOcultosChequePostFechado++;
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
			
		GridBagLayout gridaBagLayoutAccionesChequePostFechado= new GridBagLayout();
		this.jPanelAccionesChequePostFechado.setLayout(gridaBagLayoutAccionesChequePostFechado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioChequePostFechado= new GridBagLayout();
		this.jPanelAccionesFormularioChequePostFechado.setLayout(gridaBagLayoutAccionesFormularioChequePostFechado);
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsChequePostFechado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioChequePostFechado.add(this.jComboBoxTiposAccionesFormularioChequePostFechado, this.gridBagConstraintsChequePostFechado);

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsChequePostFechado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioChequePostFechado.add(this.jCheckBoxPostAccionNuevoChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioChequePostFechado.add(this.jCheckBoxPostAccionSinCerrarChequePostFechado, this.gridBagConstraintsChequePostFechado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.chequepostfechadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioChequePostFechado.add(this.jCheckBoxPostAccionSinMensajeChequePostFechado, this.gridBagConstraintsChequePostFechado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXAccion++;
			
		this.jPanelAccionesChequePostFechado.add(this.jButtonModificarChequePostFechado, this.gridBagConstraintsChequePostFechado);							

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx =iPosXAccion++;
			
		this.jPanelAccionesChequePostFechado.add(this.jButtonEliminarChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = 0;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXAccion++;
		
		this.jPanelAccionesChequePostFechado.add(this.jButtonActualizarChequePostFechado, this.gridBagConstraintsChequePostFechado);


		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = 0;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXAccion++;
		
		this.jPanelAccionesChequePostFechado.add(this.jButtonGuardarCambiosChequePostFechado, this.gridBagConstraintsChequePostFechado);	
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = 0;		
		this.gridBagConstraintsChequePostFechado.gridx =iPosXAccion++;
		
		this.jPanelAccionesChequePostFechado.add(this.jButtonCancelarChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutChequePostFechado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutChequePostFechado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();						
			this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequePostFechado.gridx = 0;		
			//this.gridBagConstraintsChequePostFechado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsChequePostFechado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsChequePostFechado.gridx =0;
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsChequePostFechado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosChequePostFechado, this.gridBagConstraintsChequePostFechado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleChequePostFechado = new ChequePostFechadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cheque Post Fechado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cheque Post Fechado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cheque Post Fechado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ChequePostFechadoModel chequepostfechadoModel=new ChequePostFechadoModel(this);
			
			//SI USARA CLASE INTERNA
			//ChequePostFechadoModel.ChequePostFechadoFocusTraversalPolicy chequepostfechadoFocusTraversalPolicy = chequepostfechadoModel.new ChequePostFechadoFocusTraversalPolicy(this);
			
			//chequepostfechadoFocusTraversalPolicy.setchequepostfechadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(chequepostfechadoModel);
			
			
			this.jContentPaneDetalleChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleChequePostFechado = new GridBagLayout();	
			this.jContentPaneDetalleChequePostFechado.setLayout(gridaBagLayoutDetalleChequePostFechado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosChequePostFechado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
				this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsChequePostFechado.gridx = 0;
					
				
				this.jContentPaneDetalleChequePostFechado.add(jTtoolBarDetalleChequePostFechado, gridBagConstraintsChequePostFechado);								
				
}
			
			this.jScrollPanelDatosEdicionChequePostFechado=   new JScrollPane(jContentPaneDetalleChequePostFechado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionChequePostFechado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequePostFechado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequePostFechado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralChequePostFechado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralChequePostFechado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequePostFechado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequePostFechado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsChequePostFechado.gridx = 0;
	        
			this.jContentPaneDetalleChequePostFechado.add(jPanelCamposChequePostFechado, gridBagConstraintsChequePostFechado);
			
			
			
			
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
						&& chequepostfechadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.chequepostfechadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsChequePostFechado= new GridBagConstraints();
						this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsChequePostFechado.gridx = 0;
						this.jContentPaneDetalleChequePostFechado.add(this.jTabbedPaneRelacionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesChequePostFechado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosChequePostFechado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
					this.gridBagConstraintsChequePostFechado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsChequePostFechado.gridx = 0;
					
				
					this.jContentPaneDetalleChequePostFechado.add(jPanelCamposOcultosChequePostFechado, gridBagConstraintsChequePostFechado);
				
					this.jPanelCamposOcultosChequePostFechado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsChequePostFechado.gridx = 0;
	        this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleChequePostFechado.add(this.jPanelAccionesFormularioChequePostFechado, this.gridBagConstraintsChequePostFechado);							
			
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
	        this.gridBagConstraintsChequePostFechado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsChequePostFechado.gridx = 0;
	        
			
			this.jContentPaneDetalleChequePostFechado.add(this.jPanelAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionChequePostFechado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionChequePostFechado=   new JScrollPane(this.jPanelCamposChequePostFechado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionChequePostFechado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequePostFechado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequePostFechado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsChequePostFechado.gridx = 0;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsChequePostFechado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsChequePostFechado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsChequePostFechado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralChequePostFechado;//jContentPane;
		
		return jScrollPanelDatosEdicionChequePostFechado;
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
