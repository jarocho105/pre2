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
import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesConstantesFunciones;

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
public class CobrarControlCarterasGeneralesDetalleFormJInternalFrame extends CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarControlCarterasGenerales;
	
	protected JMenuBar jmenuBarDetalleCobrarControlCarterasGenerales;
	
	protected JMenu jmenuDetalleCobrarControlCarterasGenerales;
	protected JMenu jmenuDetalleArchivoCobrarControlCarterasGenerales;
	protected JMenu jmenuDetalleAccionesCobrarControlCarterasGenerales;
	protected JMenu jmenuDetalleDatosCobrarControlCarterasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarControlCarterasGenerales;	
	protected GridBagConstraints gridBagConstraintsCobrarControlCarterasGenerales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarControlCarterasGenerales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarControlCarterasGeneralesSessionBean cobrarcontrolcarterasgeneralesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CobrarControlCarterasGeneralesLogic cobrarcontrolcarterasgeneralesLogic;
	
	public JScrollPane jScrollPanelDatosCobrarControlCarterasGenerales;
	public JScrollPane jScrollPanelDatosEdicionCobrarControlCarterasGenerales;
	public JScrollPane jScrollPanelDatosGeneralCobrarControlCarterasGenerales;
	
	protected JPanel jPanelCamposCobrarControlCarterasGenerales;    
	protected JPanel jPanelCamposOcultosCobrarControlCarterasGenerales;    	
	protected JPanel jPanelAccionesCobrarControlCarterasGenerales;
	protected JPanel jPanelAccionesFormularioCobrarControlCarterasGenerales;
    
	
	
	protected Integer iXPanelCamposCobrarControlCarterasGenerales=0;
	protected Integer iYPanelCamposCobrarControlCarterasGenerales=0;
	
	protected Integer iXPanelCamposOcultosCobrarControlCarterasGenerales=0;
	protected Integer iYPanelCamposOcultosCobrarControlCarterasGenerales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarControlCarterasGenerales;
	public JButton jButtonModificarCobrarControlCarterasGenerales;
	public JButton jButtonActualizarCobrarControlCarterasGenerales;
    public JButton jButtonEliminarCobrarControlCarterasGenerales;
	public JButton jButtonCancelarCobrarControlCarterasGenerales;
    public JButton jButtonGuardarCambiosCobrarControlCarterasGenerales;
	public JButton jButtonGuardarCambiosTablaCobrarControlCarterasGenerales;
	protected JButton jButtonCerrarCobrarControlCarterasGenerales;
	
	
	protected JButton jButtonProcesarInformacionCobrarControlCarterasGenerales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonModificarToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonActualizarToolBarCobrarControlCarterasGenerales;
    protected JButton jButtonEliminarToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonCancelarToolBarCobrarControlCarterasGenerales;
    protected JButton jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarControlCarterasGenerales;
	protected JButton jButtonCerrarToolBarCobrarControlCarterasGenerales;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarControlCarterasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemModificarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemActualizarCobrarControlCarterasGenerales;
    protected JMenuItem jMenuItemEliminarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemCancelarCobrarControlCarterasGenerales;
    protected JMenuItem jMenuItemGuardarCambiosCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemCerrarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarControlCarterasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarCobrarControlCarterasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarControlCarterasGenerales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarControlCarterasGenerales;
	public JLabel jLabelIdCobrarControlCarterasGenerales;
	public JLabel jLabelidCobrarControlCarterasGenerales;
	public JButton jButtonidCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaCobrarControlCarterasGenerales;
	public JLabel jLabelfecha_emision_hastaCobrarControlCarterasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales;
	public JButton jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadCobrarControlCarterasGenerales;
	public JLabel jLabelnombre_ciudadCobrarControlCarterasGenerales;
	public JTextArea jTextAreanombre_ciudadCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanenombre_ciudadCobrarControlCarterasGenerales;
	public JButton jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaCobrarControlCarterasGenerales;
	public JLabel jLabelnombre_zonaCobrarControlCarterasGenerales;
	public JTextField jTextFieldnombre_zonaCobrarControlCarterasGenerales;
	public JButton jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorCobrarControlCarterasGenerales;
	public JLabel jLabelnombre_vendedorCobrarControlCarterasGenerales;
	public JTextArea jTextAreanombre_vendedorCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanenombre_vendedorCobrarControlCarterasGenerales;
	public JButton jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarControlCarterasGenerales;
	public JLabel jLabelcodigoCobrarControlCarterasGenerales;
	public JTextField jTextFieldcodigoCobrarControlCarterasGenerales;
	public JButton jButtoncodigoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCobrarControlCarterasGenerales;
	public JLabel jLabelnombre_completoCobrarControlCarterasGenerales;
	public JTextArea jTextAreanombre_completoCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanenombre_completoCobrarControlCarterasGenerales;
	public JButton jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanellimite_creditoCobrarControlCarterasGenerales;
	public JLabel jLabellimite_creditoCobrarControlCarterasGenerales;
	public JTextField jTextFieldlimite_creditoCobrarControlCarterasGenerales;
	public JButton jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelrepresentanteCobrarControlCarterasGenerales;
	public JLabel jLabelrepresentanteCobrarControlCarterasGenerales;
	public JTextArea jTextArearepresentanteCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanerepresentanteCobrarControlCarterasGenerales;
	public JButton jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldia_pagoCobrarControlCarterasGenerales;
	public JLabel jLabeldia_pagoCobrarControlCarterasGenerales;
	public JTextField jTextFielddia_pagoCobrarControlCarterasGenerales;
	public JButton jButtondia_pagoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCobrarControlCarterasGenerales;
	public JLabel jLabelnumero_comprobanteCobrarControlCarterasGenerales;
	public JTextField jTextFieldnumero_comprobanteCobrarControlCarterasGenerales;
	public JButton jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaCobrarControlCarterasGenerales;
	public JLabel jLabelnumero_facturaCobrarControlCarterasGenerales;
	public JTextField jTextFieldnumero_facturaCobrarControlCarterasGenerales;
	public JButton jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_direccionCobrarControlCarterasGenerales;
	public JLabel jLabeldireccion_direccionCobrarControlCarterasGenerales;
	public JTextArea jTextAreadireccion_direccionCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanedireccion_direccionCobrarControlCarterasGenerales;
	public JButton jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_telefonoCobrarControlCarterasGenerales;
	public JLabel jLabeltelefono_telefonoCobrarControlCarterasGenerales;
	public JTextArea jTextAreatelefono_telefonoCobrarControlCarterasGenerales;
	public JScrollPane jscrollPanetelefono_telefonoCobrarControlCarterasGenerales;
	public JButton jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisioCobrarControlCarterasGenerales;
	public JLabel jLabelfecha_emisioCobrarControlCarterasGenerales;
	//public JFormattedTextField jDateChooserfecha_emisioCobrarControlCarterasGenerales;

	public JDateChooser jDateChooserfecha_emisioCobrarControlCarterasGenerales;
	public JButton jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceCobrarControlCarterasGenerales;
	public JLabel jLabelfecha_venceCobrarControlCarterasGenerales;
	//public JFormattedTextField jDateChooserfecha_venceCobrarControlCarterasGenerales;

	public JDateChooser jDateChooserfecha_venceCobrarControlCarterasGenerales;
	public JButton jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldiasCobrarControlCarterasGenerales;
	public JLabel jLabeldiasCobrarControlCarterasGenerales;
	public JTextField jTextFielddiasCobrarControlCarterasGenerales;
	public JButton jButtondiasCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCobrarControlCarterasGenerales;
	public JLabel jLabelsaldoCobrarControlCarterasGenerales;
	public JTextField jTextFieldsaldoCobrarControlCarterasGenerales;
	public JButton jButtonsaldoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localCobrarControlCarterasGenerales;
	public JLabel jLabeldebito_mone_localCobrarControlCarterasGenerales;
	public JTextField jTextFielddebito_mone_localCobrarControlCarterasGenerales;
	public JButton jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localCobrarControlCarterasGenerales;
	public JLabel jLabelcredito_mone_localCobrarControlCarterasGenerales;
	public JTextField jTextFieldcredito_mone_localCobrarControlCarterasGenerales;
	public JButton jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelhora_pagoCobrarControlCarterasGenerales;
	public JLabel jLabelhora_pagoCobrarControlCarterasGenerales;
	public JSpinner jSpinnerhora_pagoCobrarControlCarterasGenerales= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarControlCarterasGenerales;
	public JLabel jLabelid_empresaCobrarControlCarterasGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarControlCarterasGenerales;
	public JButton jButtonid_empresaCobrarControlCarterasGenerales= new JButtonMe();
	public JButton jButtonid_empresaCobrarControlCarterasGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarControlCarterasGenerales;
	
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
	public int iHeightFormulario=1012;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarControlCarterasGenerales=new JPanel();
				this.jPanelAccionesFormularioCobrarControlCarterasGenerales=new JPanel();
				this.jmenuBarDetalleCobrarControlCarterasGenerales=new JMenuBar();
				this.jTtoolBarDetalleCobrarControlCarterasGenerales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarControlCarterasGeneralesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarControlCarterasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarControlCarterasGenerales() {
		return this.jButtonActualizarToolBarCobrarControlCarterasGenerales;
	}
	
	public JButton getjButtonEliminarToolBarCobrarControlCarterasGenerales() {
		return this.jButtonEliminarToolBarCobrarControlCarterasGenerales;
	}
	
	public JButton getjButtonCancelarToolBarCobrarControlCarterasGenerales() {
		return this.jButtonCancelarToolBarCobrarControlCarterasGenerales;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarControlCarterasGenerales() {
		return this.jButtonProcesarInformacionCobrarControlCarterasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarControlCarterasGenerales)	{
		this.jButtonProcesarInformacionCobrarControlCarterasGenerales = jButtonProcesarInformacionCobrarControlCarterasGenerales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposRelacionesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposRelacionesCobrarControlCarterasGenerales = jComboBoxTiposRelacionesCobrarControlCarterasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposAccionesCobrarControlCarterasGenerales) {
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales = jComboBoxTiposAccionesCobrarControlCarterasGenerales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales() {
		return this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales(
			JComboBox jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales) {
		this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales = jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarcontrolcarterasgeneralesSessionBean=new CobrarControlCarterasGeneralesSessionBean();
		
		this.cobrarcontrolcarterasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarcontrolcarterasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarControlCarterasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarControlCarterasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Control Carteras Generales MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarControlCarterasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarControlCarterasGenerales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarControlCarterasGenerales=new JButtonMe();
				this.jButtonModificarToolBarCobrarControlCarterasGenerales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales,
							"actualizar","actualizar","Actualizar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales,
							"eliminar","eliminar","Eliminar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales,
							"cancelar","cancelar","Cancelar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarControlCarterasGenerales,this.jTtoolBarDetalleCobrarControlCarterasGenerales,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarControlCarterasGenerales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarControlCarterasGenerales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarControlCarterasGenerales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarControlCarterasGenerales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarControlCarterasGenerales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarControlCarterasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarControlCarterasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarControlCarterasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarControlCarterasGenerales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarControlCarterasGenerales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarControlCarterasGenerales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarControlCarterasGenerales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarControlCarterasGenerales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarControlCarterasGenerales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarControlCarterasGenerales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarControlCarterasGenerales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarControlCarterasGenerales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarControlCarterasGenerales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarControlCarterasGenerales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarControlCarterasGenerales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarControlCarterasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarControlCarterasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarControlCarterasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarControlCarterasGenerales.add(this.jMenuItemDetalleCerrarCobrarControlCarterasGenerales);
		
		this.jmenuDetalleAccionesCobrarControlCarterasGenerales.add(this.jMenuItemActualizarCobrarControlCarterasGenerales);
		this.jmenuDetalleAccionesCobrarControlCarterasGenerales.add(this.jMenuItemEliminarCobrarControlCarterasGenerales);
		this.jmenuDetalleAccionesCobrarControlCarterasGenerales.add(this.jMenuItemCancelarCobrarControlCarterasGenerales);		
		
		//this.jmenuDetalleDatosCobrarControlCarterasGenerales.add(this.jMenuItemDetalleAbrirOrderByCobrarControlCarterasGenerales);				
		this.jmenuDetalleDatosCobrarControlCarterasGenerales.add(this.jMenuItemDetalleMostarOcultarCobrarControlCarterasGenerales);				
				
		//this.jmenuDetalleAccionesCobrarControlCarterasGenerales.add(this.jMenuItemGuardarCambiosCobrarControlCarterasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarControlCarterasGenerales.add(this.jmenuDetalleArchivoCobrarControlCarterasGenerales);		
		this.jmenuBarDetalleCobrarControlCarterasGenerales.add(this.jmenuDetalleAccionesCobrarControlCarterasGenerales);		
		this.jmenuBarDetalleCobrarControlCarterasGenerales.add(this.jmenuDetalleDatosCobrarControlCarterasGenerales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarControlCarterasGenerales);				
	}
	
	
	public void inicializarElementosCamposCobrarControlCarterasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarControlCarterasGenerales = new JLabelMe();
		jLabelIdCobrarControlCarterasGenerales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarControlCarterasGenerales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarControlCarterasGenerales= new GridBagLayout();

		this.jPanelidCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);

		jLabelidCobrarControlCarterasGenerales = new JLabel();
		jLabelidCobrarControlCarterasGenerales.setText("Id");

		jLabelidCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		//jFormattedTextFieldfecha_emision_hastaCobrarControlCarterasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setEnabled(false);
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaCobrarControlCarterasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnombre_ciudadCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextAreanombre_ciudadCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setEnabled(false);
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setLineWrap(true);
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadCobrarControlCarterasGenerales = new JScrollPane(jTextAreanombre_ciudadCobrarControlCarterasGenerales);
		jscrollPanenombre_ciudadCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnombre_zonaCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaCobrarControlCarterasGenerales.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnombre_zonaCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldnombre_zonaCobrarControlCarterasGenerales= new JTextFieldMe();

		jTextFieldnombre_zonaCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldnombre_zonaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnombre_vendedorCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextAreanombre_vendedorCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setEnabled(false);
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setLineWrap(true);
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorCobrarControlCarterasGenerales = new JScrollPane(jTextAreanombre_vendedorCobrarControlCarterasGenerales);
		jscrollPanenombre_vendedorCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelcodigoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarControlCarterasGenerales.setToolTipText("Codigo");
		this.jLabelcodigoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelcodigoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldcodigoCobrarControlCarterasGenerales= new JTextFieldMe();

		jTextFieldcodigoCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldcodigoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnombre_completoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoCobrarControlCarterasGenerales.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnombre_completoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextAreanombre_completoCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextAreanombre_completoCobrarControlCarterasGenerales.setEnabled(false);
		jTextAreanombre_completoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCobrarControlCarterasGenerales.setLineWrap(true);
		jTextAreanombre_completoCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextAreanombre_completoCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCobrarControlCarterasGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCobrarControlCarterasGenerales = new JScrollPane(jTextAreanombre_completoCobrarControlCarterasGenerales);
		jscrollPanenombre_completoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabellimite_creditoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabellimite_creditoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO+" : *");
		this.jLabellimite_creditoCobrarControlCarterasGenerales.setToolTipText("Limite Credito");
		this.jLabellimite_creditoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellimite_creditoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellimite_creditoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellimite_creditoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanellimite_creditoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldlimite_creditoCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlimite_creditoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlimite_creditoCobrarControlCarterasGenerales.setText("0.0");

		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlimite_creditoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"limite_creditoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelrepresentanteCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelrepresentanteCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE+" : *");
		this.jLabelrepresentanteCobrarControlCarterasGenerales.setToolTipText("Representante");
		this.jLabelrepresentanteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentanteCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentanteCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentanteCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelrepresentanteCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextArearepresentanteCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextArearepresentanteCobrarControlCarterasGenerales.setEnabled(false);
		jTextArearepresentanteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCobrarControlCarterasGenerales.setLineWrap(true);
		jTextArearepresentanteCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextArearepresentanteCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentanteCobrarControlCarterasGenerales.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearepresentanteCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentanteCobrarControlCarterasGenerales = new JScrollPane(jTextArearepresentanteCobrarControlCarterasGenerales);
		jscrollPanerepresentanteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentanteCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentanteCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representanteCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldia_pagoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabeldia_pagoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO+" : *");
		this.jLabeldia_pagoCobrarControlCarterasGenerales.setToolTipText("Dia Pago");
		this.jLabeldia_pagoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_pagoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_pagoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_pagoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_pagoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_pagoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPaneldia_pagoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFielddia_pagoCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFielddia_pagoCobrarControlCarterasGenerales.setEnabled(false);
		jTextFielddia_pagoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_pagoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_pagoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_pagoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_pagoCobrarControlCarterasGenerales.setText("0");

		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_pagoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_pagoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_pagoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_pagoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnumero_comprobanteCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales= new JTextFieldMe();

		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelnumero_facturaCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaCobrarControlCarterasGenerales.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelnumero_facturaCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldnumero_facturaCobrarControlCarterasGenerales= new JTextFieldMe();

		jTextFieldnumero_facturaCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldnumero_facturaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION+" : *");
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales.setToolTipText("Direccion Direccion");
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_direccionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_direccionCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_direccionCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_direccionCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPaneldireccion_direccionCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextAreadireccion_direccionCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setEnabled(false);
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setLineWrap(true);
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_direccionCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_direccionCobrarControlCarterasGenerales = new JScrollPane(jTextAreadireccion_direccionCobrarControlCarterasGenerales);
		jscrollPanedireccion_direccionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccion_direccionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_direccionCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_direccionCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO+" : *");
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales.setToolTipText("Telefono Telefono");
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_telefonoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_telefonoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_telefonoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_telefonoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPaneltelefono_telefonoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextAreatelefono_telefonoCobrarControlCarterasGenerales= new JTextAreaMe();
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setEnabled(false);
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setLineWrap(true);
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setWrapStyleWord(true);
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_telefonoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_telefonoCobrarControlCarterasGenerales = new JScrollPane(jTextAreatelefono_telefonoCobrarControlCarterasGenerales);
		jscrollPanetelefono_telefonoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetelefono_telefonoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_telefonoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_telefonoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisioCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelfecha_emisioCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO+" : *");
		this.jLabelfecha_emisioCobrarControlCarterasGenerales.setToolTipText("Fecha Emisio");
		this.jLabelfecha_emisioCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisioCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisioCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisioCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisioCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisioCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelfecha_emisioCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		//jFormattedTextFieldfecha_emisioCobrarControlCarterasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emisioCobrarControlCarterasGenerales= new JDateChooser();
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setEnabled(false);
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisioCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setDate(new Date());
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisioCobrarControlCarterasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisioCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisioCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelfecha_venceCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceCobrarControlCarterasGenerales.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelfecha_venceCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		//jFormattedTextFieldfecha_venceCobrarControlCarterasGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_venceCobrarControlCarterasGenerales= new JDateChooser();
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setEnabled(false);
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setDate(new Date());
		jDateChooserfecha_venceCobrarControlCarterasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceCobrarControlCarterasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldiasCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabeldiasCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS+" : *");
		this.jLabeldiasCobrarControlCarterasGenerales.setToolTipText("Dias");
		this.jLabeldiasCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiasCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiasCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiasCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPaneldiasCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFielddiasCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFielddiasCobrarControlCarterasGenerales.setEnabled(false);
		jTextFielddiasCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiasCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiasCobrarControlCarterasGenerales.setText("0");

		this.jButtondiasCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiasCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiasCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiasCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diasCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiasCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelsaldoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCobrarControlCarterasGenerales.setToolTipText("Saldo");
		this.jLabelsaldoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelsaldoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldsaldoCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFieldsaldoCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldsaldoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCobrarControlCarterasGenerales.setText("0.0");

		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPaneldebito_mone_localCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFielddebito_mone_localCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.setEnabled(false);
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localCobrarControlCarterasGenerales.setText("0.0");

		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelcredito_mone_localCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jTextFieldcredito_mone_localCobrarControlCarterasGenerales= new JTextFieldMe();
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setEnabled(false);
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.setText("0.0");

		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelhora_pagoCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelhora_pagoCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO+" : *");
		this.jLabelhora_pagoCobrarControlCarterasGenerales.setToolTipText("Hora Pago");
		this.jLabelhora_pagoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_pagoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_pagoCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_pagoCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelhora_pagoCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		//jFormattedTextFieldhora_pagoCobrarControlCarterasGenerales= new JFormattedTextFieldMe();

		jSpinnerhora_pagoCobrarControlCarterasGenerales= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_pagoCobrarControlCarterasGenerales.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_pagoCobrarControlCarterasGenerales = new JSpinner.DateEditor(jSpinnerhora_pagoCobrarControlCarterasGenerales, "HH:mm:ss");

		jSpinnerhora_pagoCobrarControlCarterasGenerales.setEditor(timeEditorhora_pagoCobrarControlCarterasGenerales);

		jSpinnerhora_pagoCobrarControlCarterasGenerales.setValue(new Date());

		jSpinnerhora_pagoCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_pagoCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_pagoCobrarControlCarterasGenerales.setValue(new Date());
		//jSpinnerhora_pagoCobrarControlCarterasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_pagoCobrarControlCarterasGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_pagoCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_pagoCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_pagoCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarControlCarterasGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarControlCarterasGenerales = new JLabelMe();
		this.jLabelid_empresaCobrarControlCarterasGenerales.setText(""+CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarControlCarterasGenerales.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarControlCarterasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarControlCarterasGenerales.setToolTipText(CobrarControlCarterasGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		this.jPanelid_empresaCobrarControlCarterasGenerales.setLayout(this.gridaBagLayoutCobrarControlCarterasGenerales);


		jComboBoxid_empresaCobrarControlCarterasGenerales= new JComboBoxMe();
		jComboBoxid_empresaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarControlCarterasGenerales.setEnabled(false);

		this.jButtonid_empresaCobrarControlCarterasGenerales= new JButtonMe();
		this.jButtonid_empresaCobrarControlCarterasGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarControlCarterasGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarControlCarterasGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarControlCarterasGenerales.setText("Buscar");
		this.jButtonid_empresaCobrarControlCarterasGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarControlCarterasGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarControlCarterasGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarControlCarterasGenerales"));

		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setText("U");
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarControlCarterasGeneralesBusqueda"));

		if(this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarControlCarterasGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setText("U");
		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarControlCarterasGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarControlCarterasGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarControlCarterasGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarControlCarterasGeneralesUpdate"));



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
		//this.jInternalFrameDetalleCobrarControlCarterasGenerales = new CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Control Carteras Generales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarControlCarterasGenerales= new GridBagLayout();
		

		
		String sToolTipCobrarControlCarterasGenerales="";
		sToolTipCobrarControlCarterasGenerales=CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarControlCarterasGenerales+="(Cartera.CobrarControlCarterasGenerales)";
		}
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarControlCarterasGenerales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonModificarCobrarControlCarterasGenerales = new JButtonMe();
        this.jButtonActualizarCobrarControlCarterasGenerales = new JButtonMe();
        this.jButtonEliminarCobrarControlCarterasGenerales = new JButtonMe();
        this.jButtonCancelarCobrarControlCarterasGenerales = new JButtonMe();
        this.jButtonGuardarCambiosCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales = new JButtonMe();
		this.jButtonCerrarCobrarControlCarterasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosCobrarControlCarterasGenerales = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Control Carteras Generales";
		
		if(!this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Control Carteras Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarControlCarterasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarControlCarterasGenerales.setName("jPanelCamposCobrarControlCarterasGenerales"); 

		this.jPanelCamposOcultosCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarControlCarterasGenerales.setName("jPanelCamposOcultosCobrarControlCarterasGenerales"); 

        this.jPanelAccionesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarControlCarterasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesCobrarControlCarterasGenerales.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarControlCarterasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarControlCarterasGenerales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarControlCarterasGenerales.setText("Nuevo");
		this.jButtonModificarCobrarControlCarterasGenerales.setText("Editar");
        this.jButtonActualizarCobrarControlCarterasGenerales.setText("Actualizar");
        this.jButtonEliminarCobrarControlCarterasGenerales.setText("Eliminar");
        this.jButtonCancelarCobrarControlCarterasGenerales.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarControlCarterasGenerales.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setText("Guardar");
		this.jButtonCerrarCobrarControlCarterasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarControlCarterasGenerales,"nuevo_button","Nuevo",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarControlCarterasGenerales,"modificar_button","Editar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarControlCarterasGenerales,"actualizar_button","Actualizar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarControlCarterasGenerales,"eliminar_button","Eliminar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarControlCarterasGenerales,"cancelar_button","Cancelar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarControlCarterasGenerales,"guardarcambios_button","Guardar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales,"guardarcambiostabla_button","Guardar",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarControlCarterasGenerales,"cerrar_button","Salir",this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarControlCarterasGenerales.setToolTipText("Nuevo"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarControlCarterasGenerales.setToolTipText("Editar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarControlCarterasGenerales.setToolTipText("Actualizar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarControlCarterasGenerales.setToolTipText("Eliminar)"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarControlCarterasGenerales.setToolTipText("Cancelar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarControlCarterasGenerales.setToolTipText("Guardar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.setToolTipText("Guardar"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarControlCarterasGenerales.setToolTipText("Salir"+" "+CobrarControlCarterasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarControlCarterasGenerales";
		inputMap = this.jButtonNuevoCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarControlCarterasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarControlCarterasGenerales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarControlCarterasGenerales";
		inputMap = this.jButtonActualizarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarControlCarterasGenerales"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarControlCarterasGenerales";
		inputMap = this.jButtonEliminarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarControlCarterasGenerales"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCancelarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarControlCarterasGenerales"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarControlCarterasGenerales";
		inputMap = this.jButtonCerrarCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarControlCarterasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarControlCarterasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarControlCarterasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarControlCarterasGenerales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales.setToolTipText("Nuevo CobrarControlCarterasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales.setToolTipText("Sin Cerrar Ventana CobrarControlCarterasGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarControlCarterasGenerales = new JLabelMe();
		
		this.jLabelAccionesCobrarControlCarterasGenerales.setText("Acciones");		
		this.jLabelAccionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarControlCarterasGenerales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarControlCarterasGenerales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarControlCarterasGenerales=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarControlCarterasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarControlCarterasGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarControlCarterasGenerales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarControlCarterasGenerales = new GridBagLayout();
		
		this.jPanelCamposCobrarControlCarterasGenerales.setLayout(gridaBagLayoutCamposCobrarControlCarterasGenerales);
		this.jPanelCamposOcultosCobrarControlCarterasGenerales.setLayout(gridaBagLayoutCamposOcultosCobrarControlCarterasGenerales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarControlCarterasGenerales.add(jLabelIdCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarControlCarterasGenerales.add(jLabelidCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarControlCarterasGenerales.add(jLabelid_empresaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarControlCarterasGenerales.add(jButtonid_empresaCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 3;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarControlCarterasGenerales.add(jButtonid_empresaCobrarControlCarterasGeneralesUpdate, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarControlCarterasGenerales.add(jComboBoxid_empresaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.add(jLabelfecha_emision_hastaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.add(jButtonfecha_emision_hastaCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales.add(jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadCobrarControlCarterasGenerales.add(jLabelnombre_ciudadCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadCobrarControlCarterasGenerales.add(jButtonnombre_ciudadCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadCobrarControlCarterasGenerales.add(jscrollPanenombre_ciudadCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaCobrarControlCarterasGenerales.add(jLabelnombre_zonaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaCobrarControlCarterasGenerales.add(jButtonnombre_zonaCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaCobrarControlCarterasGenerales.add(jTextFieldnombre_zonaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorCobrarControlCarterasGenerales.add(jLabelnombre_vendedorCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorCobrarControlCarterasGenerales.add(jButtonnombre_vendedorCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorCobrarControlCarterasGenerales.add(jscrollPanenombre_vendedorCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarControlCarterasGenerales.add(jLabelcodigoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarControlCarterasGenerales.add(jButtoncodigoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarControlCarterasGenerales.add(jTextFieldcodigoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCobrarControlCarterasGenerales.add(jLabelnombre_completoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCobrarControlCarterasGenerales.add(jButtonnombre_completoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCobrarControlCarterasGenerales.add(jscrollPanenombre_completoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellimite_creditoCobrarControlCarterasGenerales.add(jLabellimite_creditoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanellimite_creditoCobrarControlCarterasGenerales.add(jButtonlimite_creditoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellimite_creditoCobrarControlCarterasGenerales.add(jTextFieldlimite_creditoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentanteCobrarControlCarterasGenerales.add(jLabelrepresentanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentanteCobrarControlCarterasGenerales.add(jButtonrepresentanteCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentanteCobrarControlCarterasGenerales.add(jscrollPanerepresentanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_pagoCobrarControlCarterasGenerales.add(jLabeldia_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_pagoCobrarControlCarterasGenerales.add(jButtondia_pagoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_pagoCobrarControlCarterasGenerales.add(jTextFielddia_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteCobrarControlCarterasGenerales.add(jLabelnumero_comprobanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCobrarControlCarterasGenerales.add(jButtonnumero_comprobanteCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteCobrarControlCarterasGenerales.add(jTextFieldnumero_comprobanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaCobrarControlCarterasGenerales.add(jLabelnumero_facturaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaCobrarControlCarterasGenerales.add(jButtonnumero_facturaCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaCobrarControlCarterasGenerales.add(jTextFieldnumero_facturaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_direccionCobrarControlCarterasGenerales.add(jLabeldireccion_direccionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_direccionCobrarControlCarterasGenerales.add(jButtondireccion_direccionCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_direccionCobrarControlCarterasGenerales.add(jscrollPanedireccion_direccionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_telefonoCobrarControlCarterasGenerales.add(jLabeltelefono_telefonoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_telefonoCobrarControlCarterasGenerales.add(jButtontelefono_telefonoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_telefonoCobrarControlCarterasGenerales.add(jscrollPanetelefono_telefonoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisioCobrarControlCarterasGenerales.add(jLabelfecha_emisioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisioCobrarControlCarterasGenerales.add(jButtonfecha_emisioCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisioCobrarControlCarterasGenerales.add(jDateChooserfecha_emisioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_venceCobrarControlCarterasGenerales.add(jLabelfecha_venceCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceCobrarControlCarterasGenerales.add(jButtonfecha_venceCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_venceCobrarControlCarterasGenerales.add(jDateChooserfecha_venceCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiasCobrarControlCarterasGenerales.add(jLabeldiasCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiasCobrarControlCarterasGenerales.add(jButtondiasCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiasCobrarControlCarterasGenerales.add(jTextFielddiasCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCobrarControlCarterasGenerales.add(jLabelsaldoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCobrarControlCarterasGenerales.add(jButtonsaldoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCobrarControlCarterasGenerales.add(jTextFieldsaldoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localCobrarControlCarterasGenerales.add(jLabeldebito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localCobrarControlCarterasGenerales.add(jButtondebito_mone_localCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localCobrarControlCarterasGenerales.add(jTextFielddebito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localCobrarControlCarterasGenerales.add(jLabelcredito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localCobrarControlCarterasGenerales.add(jButtoncredito_mone_localCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localCobrarControlCarterasGenerales.add(jTextFieldcredito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_pagoCobrarControlCarterasGenerales.add(jLabelhora_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 2;
		this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_pagoCobrarControlCarterasGenerales.add(jButtonhora_pagoCobrarControlCarterasGeneralesBusqueda, this.gridBagConstraintsCobrarControlCarterasGenerales);
	}

	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 1;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_pagoCobrarControlCarterasGenerales.add(jSpinnerhora_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelidCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelfecha_emision_hastaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnombre_ciudadCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnombre_zonaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnombre_vendedorCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelcodigoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnombre_completoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanellimite_creditoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelrepresentanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPaneldia_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnumero_comprobanteCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelnumero_facturaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPaneldireccion_direccionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPaneltelefono_telefonoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelfecha_emisioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelfecha_venceCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPaneldiasCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelsaldoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPaneldebito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelcredito_mone_localCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarControlCarterasGenerales.add(this.jPanelhora_pagoCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposCobrarControlCarterasGenerales=0;
		iYPanelCamposCobrarControlCarterasGenerales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iYPanelCamposOcultosCobrarControlCarterasGenerales;
	this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iXPanelCamposOcultosCobrarControlCarterasGenerales++;
	this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarControlCarterasGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarControlCarterasGenerales.add(this.jPanelid_empresaCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);



	if(iXPanelCamposOcultosCobrarControlCarterasGenerales % 2==0) {
		iXPanelCamposOcultosCobrarControlCarterasGenerales=0;
		iYPanelCamposOcultosCobrarControlCarterasGenerales++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarControlCarterasGenerales= new GridBagLayout();
		this.jPanelAccionesCobrarControlCarterasGenerales.setLayout(gridaBagLayoutAccionesCobrarControlCarterasGenerales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarControlCarterasGenerales= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarControlCarterasGenerales.setLayout(gridaBagLayoutAccionesFormularioCobrarControlCarterasGenerales);
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarControlCarterasGenerales.add(this.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonModificarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);							

		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonEliminarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonActualizarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);


		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonGuardarCambiosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);	
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = 0;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarControlCarterasGenerales.add(this.jButtonCancelarCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarControlCarterasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarControlCarterasGenerales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarcontrolcarterasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;		
			//this.gridBagConstraintsCobrarControlCarterasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarControlCarterasGenerales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =0;
		this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarControlCarterasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarControlCarterasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarControlCarterasGenerales = new CobrarControlCarterasGeneralesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Control Carteras Generales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Control Carteras Generales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Control Carteras Generales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarControlCarterasGeneralesModel cobrarcontrolcarterasgeneralesModel=new CobrarControlCarterasGeneralesModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarControlCarterasGeneralesModel.CobrarControlCarterasGeneralesFocusTraversalPolicy cobrarcontrolcarterasgeneralesFocusTraversalPolicy = cobrarcontrolcarterasgeneralesModel.new CobrarControlCarterasGeneralesFocusTraversalPolicy(this);
			
			//cobrarcontrolcarterasgeneralesFocusTraversalPolicy.setcobrarcontrolcarterasgeneralesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarcontrolcarterasgeneralesModel);
			
			
			this.jContentPaneDetalleCobrarControlCarterasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarControlCarterasGenerales = new GridBagLayout();	
			this.jContentPaneDetalleCobrarControlCarterasGenerales.setLayout(gridaBagLayoutDetalleCobrarControlCarterasGenerales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarControlCarterasGenerales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarControlCarterasGenerales.add(jTtoolBarDetalleCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales=   new JScrollPane(jContentPaneDetalleCobrarControlCarterasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	        
			this.jContentPaneDetalleCobrarControlCarterasGenerales.add(jPanelCamposCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);
			
			
			
			
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
						//&& cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarcontrolcarterasgeneralesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarControlCarterasGenerales= new GridBagConstraints();
						this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
						this.jContentPaneDetalleCobrarControlCarterasGenerales.add(this.jTabbedPaneRelacionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarControlCarterasGenerales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarControlCarterasGenerales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
					this.gridBagConstraintsCobrarControlCarterasGenerales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarControlCarterasGenerales.add(jPanelCamposOcultosCobrarControlCarterasGenerales, gridBagConstraintsCobrarControlCarterasGenerales);
				
					this.jPanelCamposOcultosCobrarControlCarterasGenerales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	        this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarControlCarterasGenerales.add(this.jPanelAccionesFormularioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);							
			
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
	        this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarControlCarterasGenerales.add(this.jPanelAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarControlCarterasGenerales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales=   new JScrollPane(this.jPanelCamposCobrarControlCarterasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
			this.gridBagConstraintsCobrarControlCarterasGenerales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarControlCarterasGenerales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarControlCarterasGenerales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);			
			
			this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
			
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		
			
		this.gridBagConstraintsCobrarControlCarterasGenerales = new GridBagConstraints();
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarControlCarterasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarControlCarterasGenerales, this.gridBagConstraintsCobrarControlCarterasGenerales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarControlCarterasGenerales;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarControlCarterasGenerales;
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
