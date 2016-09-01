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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TerminoProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TerminoProformaDetalleFormJInternalFrame extends TerminoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTerminoProforma;
	
	protected JMenuBar jmenuBarDetalleTerminoProforma;
	
	protected JMenu jmenuDetalleTerminoProforma;
	protected JMenu jmenuDetalleArchivoTerminoProforma;
	protected JMenu jmenuDetalleAccionesTerminoProforma;
	protected JMenu jmenuDetalleDatosTerminoProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTerminoProforma;	
	protected GridBagConstraints gridBagConstraintsTerminoProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TerminoProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTerminoProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_proforma="";
	
	public TerminoProformaSessionBean terminoproformaSessionBean;
	
	

	public DetalleTerminoProformaBeanSwingJInternalFrame detalleterminoproformaBeanSwingJInternalFrame=null;
	public DetalleTerminoProformaBeanSwingJInternalFrame detalleterminoproformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleTerminoProforma=false;
	public DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ProformaSessionBean proformaSessionBean;	
	
	public TerminoProformaLogic terminoproformaLogic;
	
	public JScrollPane jScrollPanelDatosTerminoProforma;
	public JScrollPane jScrollPanelDatosEdicionTerminoProforma;
	public JScrollPane jScrollPanelDatosGeneralTerminoProforma;
	
	protected JPanel jPanelCamposTerminoProforma;    
	protected JPanel jPanelCamposOcultosTerminoProforma;    	
	protected JPanel jPanelAccionesTerminoProforma;
	protected JPanel jPanelAccionesFormularioTerminoProforma;
    
	
	
	protected Integer iXPanelCamposTerminoProforma=0;
	protected Integer iYPanelCamposTerminoProforma=0;
	
	protected Integer iXPanelCamposOcultosTerminoProforma=0;
	protected Integer iYPanelCamposOcultosTerminoProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTerminoProforma;
	public JButton jButtonModificarTerminoProforma;
	public JButton jButtonActualizarTerminoProforma;
    public JButton jButtonEliminarTerminoProforma;
	public JButton jButtonCancelarTerminoProforma;
    public JButton jButtonGuardarCambiosTerminoProforma;
	public JButton jButtonGuardarCambiosTablaTerminoProforma;
	protected JButton jButtonCerrarTerminoProforma;
	
	
	protected JButton jButtonProcesarInformacionTerminoProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTerminoProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTerminoProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTerminoProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTerminoProforma;
	protected JButton jButtonModificarToolBarTerminoProforma;
	protected JButton jButtonActualizarToolBarTerminoProforma;
    protected JButton jButtonEliminarToolBarTerminoProforma;
	protected JButton jButtonCancelarToolBarTerminoProforma;
    protected JButton jButtonGuardarCambiosToolBarTerminoProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarTerminoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarTerminoProforma;
	protected JButton jButtonCerrarToolBarTerminoProforma;
	
	protected JButton jButtonProcesarInformacionToolBarTerminoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTerminoProforma;
	protected JMenuItem jMenuItemModificarTerminoProforma;
	protected JMenuItem jMenuItemActualizarTerminoProforma;
    protected JMenuItem jMenuItemEliminarTerminoProforma;
	protected JMenuItem jMenuItemCancelarTerminoProforma;
    protected JMenuItem jMenuItemGuardarCambiosTerminoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTerminoProforma;
	protected JMenuItem jMenuItemCerrarTerminoProforma;
	protected JMenuItem jMenuItemDetalleCerrarTerminoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTerminoProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionTerminoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTerminoProforma;
	protected JMenuItem jMenuItemMostrarOcultarTerminoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTerminoProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTerminoProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTerminoProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTerminoProforma;
	public JLabel jLabelIdTerminoProforma;
	public JLabel jLabelidTerminoProforma;
	public JButton jButtonidTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelatencionTerminoProforma;
	public JLabel jLabelatencionTerminoProforma;
	public JTextArea jTextAreaatencionTerminoProforma;
	public JScrollPane jscrollPaneatencionTerminoProforma;
	public JButton jButtonatencionTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelregistro_sanitarioTerminoProforma;
	public JLabel jLabelregistro_sanitarioTerminoProforma;
	public JTextField jTextFieldregistro_sanitarioTerminoProforma;
	public JButton jButtonregistro_sanitarioTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaTerminoProforma;
	public JLabel jLabelreferenciaTerminoProforma;
	public JTextArea jTextAreareferenciaTerminoProforma;
	public JScrollPane jscrollPanereferenciaTerminoProforma;
	public JButton jButtonreferenciaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTerminoProforma;
	public JLabel jLabeldescripcionTerminoProforma;
	public JTextArea jTextAreadescripcionTerminoProforma;
	public JScrollPane jscrollPanedescripcionTerminoProforma;
	public JButton jButtondescripcionTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcion2TerminoProforma;
	public JLabel jLabeldescripcion2TerminoProforma;
	public JTextArea jTextAreadescripcion2TerminoProforma;
	public JScrollPane jscrollPanedescripcion2TerminoProforma;
	public JButton jButtondescripcion2TerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelmarcaTerminoProforma;
	public JLabel jLabelmarcaTerminoProforma;
	public JTextField jTextFieldmarcaTerminoProforma;
	public JButton jButtonmarcaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelorigenTerminoProforma;
	public JLabel jLabelorigenTerminoProforma;
	public JTextField jTextFieldorigenTerminoProforma;
	public JButton jButtonorigenTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelgarantia_tecnicaTerminoProforma;
	public JLabel jLabelgarantia_tecnicaTerminoProforma;
	public JTextField jTextFieldgarantia_tecnicaTerminoProforma;
	public JButton jButtongarantia_tecnicaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoTerminoProforma;
	public JLabel jLabelfecha_pagoTerminoProforma;
	public JTextField jTextFieldfecha_pagoTerminoProforma;
	public JButton jButtonfecha_pagoTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaTerminoProforma;
	public JLabel jLabelfecha_entregaTerminoProforma;
	public JTextField jTextFieldfecha_entregaTerminoProforma;
	public JButton jButtonfecha_entregaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPaneladjuntoTerminoProforma;
	public JLabel jLabeladjuntoTerminoProforma;
	public JTextArea jTextAreaadjuntoTerminoProforma;
	public JScrollPane jscrollPaneadjuntoTerminoProforma;
	public JButton jButtonadjuntoTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelresponsableTerminoProforma;
	public JLabel jLabelresponsableTerminoProforma;
	public JTextArea jTextArearesponsableTerminoProforma;
	public JScrollPane jscrollPaneresponsableTerminoProforma;
	public JButton jButtonresponsableTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelcargoTerminoProforma;
	public JLabel jLabelcargoTerminoProforma;
	public JTextField jTextFieldcargoTerminoProforma;
	public JButton jButtoncargoTerminoProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTerminoProforma;
	public JLabel jLabelid_empresaTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTerminoProforma;
	public JButton jButtonid_empresaTerminoProforma= new JButtonMe();
	public JButton jButtonid_empresaTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTerminoProforma;
	public JLabel jLabelid_sucursalTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTerminoProforma;
	public JButton jButtonid_sucursalTerminoProforma= new JButtonMe();
	public JButton jButtonid_sucursalTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaTerminoProforma;
	public JLabel jLabelid_monedaTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaTerminoProforma;
	public JButton jButtonid_monedaTerminoProforma= new JButtonMe();
	public JButton jButtonid_monedaTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_monedaTerminoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_proformaTerminoProforma;
	public JLabel jLabelid_proformaTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proformaTerminoProforma;
	public JButton jButtonid_proformaTerminoProforma= new JButtonMe();
	public JButton jButtonid_proformaTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_proformaTerminoProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTerminoProforma;
	
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
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TerminoProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTerminoProforma=new JPanel();
				this.jPanelAccionesFormularioTerminoProforma=new JPanel();
				this.jmenuBarDetalleTerminoProforma=new JMenuBar();
				this.jTtoolBarDetalleTerminoProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TerminoProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarTerminoProforma() {
		return this.jButtonActualizarToolBarTerminoProforma;
	}
	
	public JButton getjButtonEliminarToolBarTerminoProforma() {
		return this.jButtonEliminarToolBarTerminoProforma;
	}
	
	public JButton getjButtonCancelarToolBarTerminoProforma() {
		return this.jButtonCancelarToolBarTerminoProforma;
	}		
	
	public JButton getjButtonProcesarInformacionTerminoProforma() {
		return this.jButtonProcesarInformacionTerminoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTerminoProforma)	{
		this.jButtonProcesarInformacionTerminoProforma = jButtonProcesarInformacionTerminoProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTerminoProforma() {
		return this.jComboBoxTiposAccionesTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTerminoProforma(
			JComboBox jComboBoxTiposRelacionesTerminoProforma) {
		this.jComboBoxTiposRelacionesTerminoProforma = jComboBoxTiposRelacionesTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTerminoProforma(
			JComboBox jComboBoxTiposAccionesTerminoProforma) {
		this.jComboBoxTiposAccionesTerminoProforma = jComboBoxTiposAccionesTerminoProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTerminoProforma() {
		return this.jComboBoxTiposAccionesFormularioTerminoProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTerminoProforma(
			JComboBox jComboBoxTiposAccionesFormularioTerminoProforma) {
		this.jComboBoxTiposAccionesFormularioTerminoProforma = jComboBoxTiposAccionesFormularioTerminoProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		
		this.terminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.terminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.terminoproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TerminoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Termino Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		TerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTerminoProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTerminoProforma=new JButtonMe();
				this.jButtonModificarToolBarTerminoProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"actualizar","actualizar","Actualizar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"eliminar","eliminar","Eliminar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"cancelar","cancelar","Cancelar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTerminoProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTerminoProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTerminoProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTerminoProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTerminoProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTerminoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTerminoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTerminoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTerminoProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTerminoProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTerminoProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTerminoProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTerminoProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTerminoProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTerminoProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTerminoProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTerminoProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTerminoProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTerminoProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTerminoProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTerminoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTerminoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTerminoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTerminoProforma.add(this.jMenuItemDetalleCerrarTerminoProforma);
		
		this.jmenuDetalleAccionesTerminoProforma.add(this.jMenuItemActualizarTerminoProforma);
		this.jmenuDetalleAccionesTerminoProforma.add(this.jMenuItemEliminarTerminoProforma);
		this.jmenuDetalleAccionesTerminoProforma.add(this.jMenuItemCancelarTerminoProforma);		
		
		//this.jmenuDetalleDatosTerminoProforma.add(this.jMenuItemDetalleAbrirOrderByTerminoProforma);				
		this.jmenuDetalleDatosTerminoProforma.add(this.jMenuItemDetalleMostarOcultarTerminoProforma);				
				
		//this.jmenuDetalleAccionesTerminoProforma.add(this.jMenuItemGuardarCambiosTerminoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTerminoProforma.add(this.jmenuDetalleArchivoTerminoProforma);		
		this.jmenuBarDetalleTerminoProforma.add(this.jmenuDetalleAccionesTerminoProforma);		
		this.jmenuBarDetalleTerminoProforma.add(this.jmenuDetalleDatosTerminoProforma);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTerminoProforma.add(this.jmenuDetalleTerminoProforma);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTerminoProforma);				
	}
	
	
	public void inicializarElementosCamposTerminoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTerminoProforma = new JLabelMe();
		jLabelIdTerminoProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTerminoProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTerminoProforma= new GridBagLayout();

		this.jPanelidTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);

		jLabelidTerminoProforma = new JLabel();
		jLabelidTerminoProforma.setText("Id");

		jLabelidTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelatencionTerminoProforma = new JLabelMe();
		this.jLabelatencionTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_ATENCION+" : *");
		this.jLabelatencionTerminoProforma.setToolTipText("Atencion");
		this.jLabelatencionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelatencionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelatencionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelatencionTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelatencionTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelatencionTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_ATENCION);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelatencionTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextAreaatencionTerminoProforma= new JTextAreaMe();
		jTextAreaatencionTerminoProforma.setEnabled(false);
		jTextAreaatencionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaatencionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaatencionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaatencionTerminoProforma.setLineWrap(true);
		jTextAreaatencionTerminoProforma.setWrapStyleWord(true);
		jTextAreaatencionTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaatencionTerminoProforma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaatencionTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneatencionTerminoProforma = new JScrollPane(jTextAreaatencionTerminoProforma);
		jscrollPaneatencionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneatencionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneatencionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonatencionTerminoProformaBusqueda= new JButtonMe();
		this.jButtonatencionTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonatencionTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonatencionTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonatencionTerminoProformaBusqueda.setText("U");
		this.jButtonatencionTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonatencionTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonatencionTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaatencionTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaatencionTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"atencionTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonatencionTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelregistro_sanitarioTerminoProforma = new JLabelMe();
		this.jLabelregistro_sanitarioTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO+" : *");
		this.jLabelregistro_sanitarioTerminoProforma.setToolTipText("Registro Sanitario");
		this.jLabelregistro_sanitarioTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelregistro_sanitarioTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelregistro_sanitarioTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelregistro_sanitarioTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelregistro_sanitarioTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelregistro_sanitarioTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelregistro_sanitarioTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldregistro_sanitarioTerminoProforma= new JTextFieldMe();

		jTextFieldregistro_sanitarioTerminoProforma.setEnabled(false);
		jTextFieldregistro_sanitarioTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldregistro_sanitarioTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldregistro_sanitarioTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldregistro_sanitarioTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonregistro_sanitarioTerminoProformaBusqueda= new JButtonMe();
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonregistro_sanitarioTerminoProformaBusqueda.setText("U");
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonregistro_sanitarioTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldregistro_sanitarioTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldregistro_sanitarioTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"registro_sanitarioTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonregistro_sanitarioTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaTerminoProforma = new JLabelMe();
		this.jLabelreferenciaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_REFERENCIA+" : *");
		this.jLabelreferenciaTerminoProforma.setToolTipText("Referencia");
		this.jLabelreferenciaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelreferenciaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextAreareferenciaTerminoProforma= new JTextAreaMe();
		jTextAreareferenciaTerminoProforma.setEnabled(false);
		jTextAreareferenciaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaTerminoProforma.setLineWrap(true);
		jTextAreareferenciaTerminoProforma.setWrapStyleWord(true);
		jTextAreareferenciaTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreareferenciaTerminoProforma.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreareferenciaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanereferenciaTerminoProforma = new JScrollPane(jTextAreareferenciaTerminoProforma);
		jscrollPanereferenciaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonreferenciaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonreferenciaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaTerminoProformaBusqueda.setText("U");
		this.jButtonreferenciaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreareferenciaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreareferenciaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTerminoProforma = new JLabelMe();
		this.jLabeldescripcionTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTerminoProforma.setToolTipText("Descripcion");
		this.jLabeldescripcionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPaneldescripcionTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextAreadescripcionTerminoProforma= new JTextAreaMe();
		jTextAreadescripcionTerminoProforma.setEnabled(false);
		jTextAreadescripcionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTerminoProforma.setLineWrap(true);
		jTextAreadescripcionTerminoProforma.setWrapStyleWord(true);
		jTextAreadescripcionTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTerminoProforma.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTerminoProforma = new JScrollPane(jTextAreadescripcionTerminoProforma);
		jscrollPanedescripcionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTerminoProformaBusqueda= new JButtonMe();
		this.jButtondescripcionTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTerminoProformaBusqueda.setText("U");
		this.jButtondescripcionTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcion2TerminoProforma = new JLabelMe();
		this.jLabeldescripcion2TerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2+" : *");
		this.jLabeldescripcion2TerminoProforma.setToolTipText("Descripcion2");
		this.jLabeldescripcion2TerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2TerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcion2TerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcion2TerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcion2TerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcion2TerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPaneldescripcion2TerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextAreadescripcion2TerminoProforma= new JTextAreaMe();
		jTextAreadescripcion2TerminoProforma.setEnabled(false);
		jTextAreadescripcion2TerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2TerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2TerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcion2TerminoProforma.setLineWrap(true);
		jTextAreadescripcion2TerminoProforma.setWrapStyleWord(true);
		jTextAreadescripcion2TerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcion2TerminoProforma.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcion2TerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcion2TerminoProforma = new JScrollPane(jTextAreadescripcion2TerminoProforma);
		jscrollPanedescripcion2TerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2TerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcion2TerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcion2TerminoProformaBusqueda= new JButtonMe();
		this.jButtondescripcion2TerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2TerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcion2TerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcion2TerminoProformaBusqueda.setText("U");
		this.jButtondescripcion2TerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcion2TerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcion2TerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcion2TerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcion2TerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcion2TerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcion2TerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelmarcaTerminoProforma = new JLabelMe();
		this.jLabelmarcaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaTerminoProforma.setToolTipText("Marca");
		this.jLabelmarcaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelmarcaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldmarcaTerminoProforma= new JTextFieldMe();

		jTextFieldmarcaTerminoProforma.setEnabled(false);
		jTextFieldmarcaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarcaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarcaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmarcaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmarcaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonmarcaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaTerminoProformaBusqueda.setText("U");
		this.jButtonmarcaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmarcaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmarcaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelorigenTerminoProforma = new JLabelMe();
		this.jLabelorigenTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_ORIGEN+" : *");
		this.jLabelorigenTerminoProforma.setToolTipText("Origen");
		this.jLabelorigenTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorigenTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorigenTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorigenTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_ORIGEN);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelorigenTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldorigenTerminoProforma= new JTextFieldMe();

		jTextFieldorigenTerminoProforma.setEnabled(false);
		jTextFieldorigenTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorigenTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorigenTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorigenTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonorigenTerminoProformaBusqueda= new JButtonMe();
		this.jButtonorigenTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorigenTerminoProformaBusqueda.setText("U");
		this.jButtonorigenTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorigenTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorigenTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorigenTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorigenTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"origenTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorigenTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelgarantia_tecnicaTerminoProforma = new JLabelMe();
		this.jLabelgarantia_tecnicaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA+" : *");
		this.jLabelgarantia_tecnicaTerminoProforma.setToolTipText("Garantia Tecnica");
		this.jLabelgarantia_tecnicaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgarantia_tecnicaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgarantia_tecnicaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgarantia_tecnicaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgarantia_tecnicaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgarantia_tecnicaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelgarantia_tecnicaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldgarantia_tecnicaTerminoProforma= new JTextFieldMe();

		jTextFieldgarantia_tecnicaTerminoProforma.setEnabled(false);
		jTextFieldgarantia_tecnicaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgarantia_tecnicaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgarantia_tecnicaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgarantia_tecnicaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtongarantia_tecnicaTerminoProformaBusqueda= new JButtonMe();
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongarantia_tecnicaTerminoProformaBusqueda.setText("U");
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongarantia_tecnicaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgarantia_tecnicaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgarantia_tecnicaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"garantia_tecnicaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongarantia_tecnicaTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoTerminoProforma = new JLabelMe();
		this.jLabelfecha_pagoTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoTerminoProforma.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelfecha_pagoTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldfecha_pagoTerminoProforma= new JTextFieldMe();

		jTextFieldfecha_pagoTerminoProforma.setEnabled(false);
		jTextFieldfecha_pagoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_pagoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_pagoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfecha_pagoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfecha_pagoTerminoProformaBusqueda= new JButtonMe();
		this.jButtonfecha_pagoTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoTerminoProformaBusqueda.setText("U");
		this.jButtonfecha_pagoTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfecha_pagoTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfecha_pagoTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaTerminoProforma = new JLabelMe();
		this.jLabelfecha_entregaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaTerminoProforma.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelfecha_entregaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldfecha_entregaTerminoProforma= new JTextFieldMe();

		jTextFieldfecha_entregaTerminoProforma.setEnabled(false);
		jTextFieldfecha_entregaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_entregaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfecha_entregaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfecha_entregaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfecha_entregaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonfecha_entregaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaTerminoProformaBusqueda.setText("U");
		this.jButtonfecha_entregaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfecha_entregaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfecha_entregaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabeladjuntoTerminoProforma = new JLabelMe();
		this.jLabeladjuntoTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_ADJUNTO+" : *");
		this.jLabeladjuntoTerminoProforma.setToolTipText("Adjunto");
		this.jLabeladjuntoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeladjuntoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeladjuntoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeladjuntoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneladjuntoTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneladjuntoTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_ADJUNTO);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPaneladjuntoTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextAreaadjuntoTerminoProforma= new JTextAreaMe();
		jTextAreaadjuntoTerminoProforma.setEnabled(false);
		jTextAreaadjuntoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaadjuntoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaadjuntoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaadjuntoTerminoProforma.setLineWrap(true);
		jTextAreaadjuntoTerminoProforma.setWrapStyleWord(true);
		jTextAreaadjuntoTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaadjuntoTerminoProforma.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaadjuntoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneadjuntoTerminoProforma = new JScrollPane(jTextAreaadjuntoTerminoProforma);
		jscrollPaneadjuntoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneadjuntoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneadjuntoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonadjuntoTerminoProformaBusqueda= new JButtonMe();
		this.jButtonadjuntoTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonadjuntoTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonadjuntoTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonadjuntoTerminoProformaBusqueda.setText("U");
		this.jButtonadjuntoTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonadjuntoTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonadjuntoTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaadjuntoTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaadjuntoTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"adjuntoTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonadjuntoTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelresponsableTerminoProforma = new JLabelMe();
		this.jLabelresponsableTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableTerminoProforma.setToolTipText("Responsable");
		this.jLabelresponsableTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelresponsableTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextArearesponsableTerminoProforma= new JTextAreaMe();
		jTextArearesponsableTerminoProforma.setEnabled(false);
		jTextArearesponsableTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableTerminoProforma.setLineWrap(true);
		jTextArearesponsableTerminoProforma.setWrapStyleWord(true);
		jTextArearesponsableTerminoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableTerminoProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableTerminoProforma = new JScrollPane(jTextArearesponsableTerminoProforma);
		jscrollPaneresponsableTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresponsableTerminoProformaBusqueda= new JButtonMe();
		this.jButtonresponsableTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableTerminoProformaBusqueda.setText("U");
		this.jButtonresponsableTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableTerminoProformaBusqueda.setVisible(false);		}


					
		this.jLabelcargoTerminoProforma = new JLabelMe();
		this.jLabelcargoTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_CARGO+" : *");
		this.jLabelcargoTerminoProforma.setToolTipText("Cargo");
		this.jLabelcargoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcargoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcargoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcargoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcargoTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcargoTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_CARGO);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelcargoTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jTextFieldcargoTerminoProforma= new JTextFieldMe();

		jTextFieldcargoTerminoProforma.setEnabled(false);
		jTextFieldcargoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcargoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcargoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcargoTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncargoTerminoProformaBusqueda= new JButtonMe();
		this.jButtoncargoTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncargoTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncargoTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncargoTerminoProformaBusqueda.setText("U");
		this.jButtoncargoTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncargoTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncargoTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcargoTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcargoTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cargoTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncargoTerminoProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTerminoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTerminoProforma = new JLabelMe();
		this.jLabelid_empresaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTerminoProforma.setToolTipText("Empresa");
		this.jLabelid_empresaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelid_empresaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jComboBoxid_empresaTerminoProforma= new JComboBoxMe();
		jComboBoxid_empresaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTerminoProforma.setEnabled(false);

		this.jButtonid_empresaTerminoProforma= new JButtonMe();
		this.jButtonid_empresaTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTerminoProforma.setText("Buscar");
		this.jButtonid_empresaTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTerminoProforma"));

		this.jButtonid_empresaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTerminoProformaBusqueda.setText("U");
		this.jButtonid_empresaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_empresaTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTerminoProformaUpdate.setText("U");
		this.jButtonid_empresaTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTerminoProformaUpdate"));



					
		this.jLabelid_sucursalTerminoProforma = new JLabelMe();
		this.jLabelid_sucursalTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTerminoProforma.setToolTipText("Sucursal");
		this.jLabelid_sucursalTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelid_sucursalTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jComboBoxid_sucursalTerminoProforma= new JComboBoxMe();
		jComboBoxid_sucursalTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTerminoProforma.setEnabled(false);

		this.jButtonid_sucursalTerminoProforma= new JButtonMe();
		this.jButtonid_sucursalTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTerminoProforma.setText("Buscar");
		this.jButtonid_sucursalTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTerminoProforma"));

		this.jButtonid_sucursalTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_sucursalTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTerminoProformaBusqueda.setText("U");
		this.jButtonid_sucursalTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_sucursalTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTerminoProformaUpdate.setText("U");
		this.jButtonid_sucursalTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTerminoProformaUpdate"));



					
		this.jLabelid_monedaTerminoProforma = new JLabelMe();
		this.jLabelid_monedaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaTerminoProforma.setToolTipText("Moneda");
		this.jLabelid_monedaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelid_monedaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jComboBoxid_monedaTerminoProforma= new JComboBoxMe();
		jComboBoxid_monedaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaTerminoProforma= new JButtonMe();
		this.jButtonid_monedaTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTerminoProforma.setText("Buscar");
		this.jButtonid_monedaTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTerminoProforma"));

		this.jButtonid_monedaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_monedaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTerminoProformaBusqueda.setText("U");
		this.jButtonid_monedaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_monedaTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_monedaTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTerminoProformaUpdate.setText("U");
		this.jButtonid_monedaTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTerminoProformaUpdate"));



					
		this.jLabelid_proformaTerminoProforma = new JLabelMe();
		this.jLabelid_proformaTerminoProforma.setText(""+TerminoProformaConstantesFunciones.LABEL_IDPROFORMA+" : *");
		this.jLabelid_proformaTerminoProforma.setToolTipText("Proforma");
		this.jLabelid_proformaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proformaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proformaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_proformaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_proformaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_proformaTerminoProforma.setToolTipText(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA);
		this.gridaBagLayoutTerminoProforma = new GridBagLayout();
		this.jPanelid_proformaTerminoProforma.setLayout(this.gridaBagLayoutTerminoProforma);


		jComboBoxid_proformaTerminoProforma= new JComboBoxMe();
		jComboBoxid_proformaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proformaTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_proformaTerminoProforma= new JButtonMe();
		this.jButtonid_proformaTerminoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaTerminoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaTerminoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proformaTerminoProforma.setText("Buscar");
		this.jButtonid_proformaTerminoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_proformaTerminoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaTerminoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_proformaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaTerminoProforma"));

		this.jButtonid_proformaTerminoProformaBusqueda= new JButtonMe();
		this.jButtonid_proformaTerminoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaTerminoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaTerminoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proformaTerminoProformaBusqueda.setText("U");
		this.jButtonid_proformaTerminoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_proformaTerminoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaTerminoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_proformaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaTerminoProformaBusqueda"));

		if(this.terminoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_proformaTerminoProformaBusqueda.setVisible(false);		}

		this.jButtonid_proformaTerminoProformaUpdate= new JButtonMe();
		this.jButtonid_proformaTerminoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaTerminoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proformaTerminoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proformaTerminoProformaUpdate.setText("U");
		this.jButtonid_proformaTerminoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_proformaTerminoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proformaTerminoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_proformaTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proformaTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proformaTerminoProformaUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTerminoProforma = new TerminoProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Termino Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTerminoProforma= new GridBagLayout();
		

		
		String sToolTipTerminoProforma="";
		sToolTipTerminoProforma=TerminoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTerminoProforma+="(Facturacion.TerminoProforma)";
		}
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTerminoProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTerminoProforma = new JButtonMe();
		this.jButtonModificarTerminoProforma = new JButtonMe();
        this.jButtonActualizarTerminoProforma = new JButtonMe();
        this.jButtonEliminarTerminoProforma = new JButtonMe();
        this.jButtonCancelarTerminoProforma = new JButtonMe();
        this.jButtonGuardarCambiosTerminoProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaTerminoProforma = new JButtonMe();
		this.jButtonCerrarTerminoProforma = new JButtonMe();
		
		this.jScrollPanelDatosTerminoProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionTerminoProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralTerminoProforma = new JScrollPane();
				
		
		
		this.jPanelCamposTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Termino Proforma";
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposTerminoProforma.setName("jPanelCamposTerminoProforma"); 

		this.jPanelCamposOcultosTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTerminoProforma.setName("jPanelCamposOcultosTerminoProforma"); 

        this.jPanelAccionesTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesTerminoProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTerminoProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTerminoProforma.setText("Nuevo");
		this.jButtonModificarTerminoProforma.setText("Editar");
        this.jButtonActualizarTerminoProforma.setText("Actualizar");
        this.jButtonEliminarTerminoProforma.setText("Eliminar");
        this.jButtonCancelarTerminoProforma.setText("Cancelar");
        this.jButtonGuardarCambiosTerminoProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaTerminoProforma.setText("Guardar");
		this.jButtonCerrarTerminoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTerminoProforma,"nuevo_button","Nuevo",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTerminoProforma,"modificar_button","Editar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTerminoProforma,"actualizar_button","Actualizar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTerminoProforma,"eliminar_button","Eliminar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTerminoProforma,"cancelar_button","Cancelar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTerminoProforma,"guardarcambios_button","Guardar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTerminoProforma,"guardarcambiostabla_button","Guardar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTerminoProforma,"cerrar_button","Salir",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTerminoProforma.setToolTipText("Nuevo"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTerminoProforma.setToolTipText("Editar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTerminoProforma.setToolTipText("Actualizar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTerminoProforma.setToolTipText("Eliminar)"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTerminoProforma.setToolTipText("Cancelar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTerminoProforma.setToolTipText("Guardar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTerminoProforma.setToolTipText("Guardar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTerminoProforma.setToolTipText("Salir"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTerminoProforma";
		inputMap = this.jButtonNuevoTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTerminoProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTerminoProforma";
		inputMap = this.jButtonActualizarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTerminoProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarTerminoProforma";
		inputMap = this.jButtonEliminarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTerminoProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarTerminoProforma";
		inputMap = this.jButtonCancelarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTerminoProforma"));
		
		//CERRAR		
		sMapKey = "CerrarTerminoProforma";
		inputMap = this.jButtonCerrarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTerminoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTerminoProforma";
		inputMap = this.jButtonGuardarCambiosTablaTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTerminoProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTerminoProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTerminoProforma.setToolTipText("Nuevo TerminoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTerminoProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTerminoProforma.setToolTipText("Sin Cerrar Ventana TerminoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTerminoProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTerminoProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTerminoProforma.setText("Accion");
		this.jComboBoxTiposAccionesTerminoProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTerminoProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTerminoProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTerminoProforma = new JLabelMe();
		
		this.jLabelAccionesTerminoProforma.setText("Acciones");		
		this.jLabelAccionesTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTerminoProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTerminoProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTerminoProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTerminoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTerminoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTerminoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTerminoProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTerminoProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTerminoProforma = new GridBagLayout();
		
		this.jPanelCamposTerminoProforma.setLayout(gridaBagLayoutCamposTerminoProforma);
		this.jPanelCamposOcultosTerminoProforma.setLayout(gridaBagLayoutCamposOcultosTerminoProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTerminoProforma.add(jLabelIdTerminoProforma, this.gridBagConstraintsTerminoProforma);



	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTerminoProforma.add(jLabelidTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTerminoProforma.add(jLabelid_empresaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTerminoProforma.add(jButtonid_empresaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 3;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTerminoProforma.add(jButtonid_empresaTerminoProformaUpdate, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTerminoProforma.add(jComboBoxid_empresaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTerminoProforma.add(jLabelid_sucursalTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTerminoProforma.add(jButtonid_sucursalTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 3;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTerminoProforma.add(jButtonid_sucursalTerminoProformaUpdate, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTerminoProforma.add(jComboBoxid_sucursalTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaTerminoProforma.add(jLabelid_monedaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTerminoProforma.add(jButtonid_monedaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 3;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTerminoProforma.add(jButtonid_monedaTerminoProformaUpdate, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaTerminoProforma.add(jComboBoxid_monedaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_proformaTerminoProforma.add(jLabelid_proformaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proformaTerminoProforma.add(jButtonid_proformaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 3;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proformaTerminoProforma.add(jButtonid_proformaTerminoProformaUpdate, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_proformaTerminoProforma.add(jComboBoxid_proformaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelatencionTerminoProforma.add(jLabelatencionTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelatencionTerminoProforma.add(jButtonatencionTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelatencionTerminoProforma.add(jscrollPaneatencionTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelregistro_sanitarioTerminoProforma.add(jLabelregistro_sanitarioTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelregistro_sanitarioTerminoProforma.add(jButtonregistro_sanitarioTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelregistro_sanitarioTerminoProforma.add(jTextFieldregistro_sanitarioTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaTerminoProforma.add(jLabelreferenciaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaTerminoProforma.add(jButtonreferenciaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaTerminoProforma.add(jscrollPanereferenciaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTerminoProforma.add(jLabeldescripcionTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTerminoProforma.add(jButtondescripcionTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTerminoProforma.add(jscrollPanedescripcionTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcion2TerminoProforma.add(jLabeldescripcion2TerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcion2TerminoProforma.add(jButtondescripcion2TerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcion2TerminoProforma.add(jscrollPanedescripcion2TerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaTerminoProforma.add(jLabelmarcaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaTerminoProforma.add(jButtonmarcaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaTerminoProforma.add(jTextFieldmarcaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorigenTerminoProforma.add(jLabelorigenTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelorigenTerminoProforma.add(jButtonorigenTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorigenTerminoProforma.add(jTextFieldorigenTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgarantia_tecnicaTerminoProforma.add(jLabelgarantia_tecnicaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelgarantia_tecnicaTerminoProforma.add(jButtongarantia_tecnicaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgarantia_tecnicaTerminoProforma.add(jTextFieldgarantia_tecnicaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoTerminoProforma.add(jLabelfecha_pagoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoTerminoProforma.add(jButtonfecha_pagoTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoTerminoProforma.add(jTextFieldfecha_pagoTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaTerminoProforma.add(jLabelfecha_entregaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaTerminoProforma.add(jButtonfecha_entregaTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaTerminoProforma.add(jTextFieldfecha_entregaTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneladjuntoTerminoProforma.add(jLabeladjuntoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneladjuntoTerminoProforma.add(jButtonadjuntoTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneladjuntoTerminoProforma.add(jscrollPaneadjuntoTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableTerminoProforma.add(jLabelresponsableTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableTerminoProforma.add(jButtonresponsableTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableTerminoProforma.add(jscrollPaneresponsableTerminoProforma, this.gridBagConstraintsTerminoProforma);


	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 0;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcargoTerminoProforma.add(jLabelcargoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 2;
		this.gridBagConstraintsTerminoProforma.ipadx = 0;
		this.gridBagConstraintsTerminoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcargoTerminoProforma.add(jButtoncargoTerminoProformaBusqueda, this.gridBagConstraintsTerminoProforma);
	}

	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTerminoProforma.gridy = 0;
	this.gridBagConstraintsTerminoProforma.gridx = 1;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcargoTerminoProforma.add(jTextFieldcargoTerminoProforma, this.gridBagConstraintsTerminoProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelidTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelid_monedaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelid_proformaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelatencionTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelregistro_sanitarioTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelreferenciaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPaneldescripcionTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPaneldescripcion2TerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelmarcaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelorigenTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelgarantia_tecnicaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelfecha_pagoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelfecha_entregaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPaneladjuntoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelresponsableTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTerminoProforma.add(this.jPanelcargoTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposTerminoProforma % 2==0) {
		iXPanelCamposTerminoProforma=0;
		iYPanelCamposTerminoProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposOcultosTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposOcultosTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTerminoProforma.add(this.jPanelid_empresaTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposOcultosTerminoProforma % 2==0) {
		iXPanelCamposOcultosTerminoProforma=0;
		iYPanelCamposOcultosTerminoProforma++;
	}
	this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
	this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTerminoProforma.gridy = iYPanelCamposOcultosTerminoProforma;
	this.gridBagConstraintsTerminoProforma.gridx = iXPanelCamposOcultosTerminoProforma++;
	this.gridBagConstraintsTerminoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTerminoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTerminoProforma.add(this.jPanelid_sucursalTerminoProforma, this.gridBagConstraintsTerminoProforma);



	if(iXPanelCamposOcultosTerminoProforma % 2==0) {
		iXPanelCamposOcultosTerminoProforma=0;
		iYPanelCamposOcultosTerminoProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesTerminoProforma= new GridBagLayout();
		this.jPanelAccionesTerminoProforma.setLayout(gridaBagLayoutAccionesTerminoProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTerminoProforma= new GridBagLayout();
		this.jPanelAccionesFormularioTerminoProforma.setLayout(gridaBagLayoutAccionesFormularioTerminoProforma);
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTerminoProforma.add(this.jComboBoxTiposAccionesFormularioTerminoProforma, this.gridBagConstraintsTerminoProforma);

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTerminoProforma.add(this.jCheckBoxPostAccionNuevoTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTerminoProforma.add(this.jCheckBoxPostAccionSinCerrarTerminoProforma, this.gridBagConstraintsTerminoProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTerminoProforma.add(this.jCheckBoxPostAccionSinMensajeTerminoProforma, this.gridBagConstraintsTerminoProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesTerminoProforma.add(this.jButtonModificarTerminoProforma, this.gridBagConstraintsTerminoProforma);							

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesTerminoProforma.add(this.jButtonEliminarTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = 0;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTerminoProforma.add(this.jButtonActualizarTerminoProforma, this.gridBagConstraintsTerminoProforma);


		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = 0;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesTerminoProforma.add(this.jButtonGuardarCambiosTerminoProforma, this.gridBagConstraintsTerminoProforma);	
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = 0;		
		this.gridBagConstraintsTerminoProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesTerminoProforma.add(this.jButtonCancelarTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTerminoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTerminoProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();						
			this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTerminoProforma.gridx = 0;		
			//this.gridBagConstraintsTerminoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTerminoProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTerminoProforma.gridx =0;
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTerminoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTerminoProforma, this.gridBagConstraintsTerminoProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTerminoProforma = new TerminoProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Termino Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Termino Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Termino Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TerminoProformaModel terminoproformaModel=new TerminoProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//TerminoProformaModel.TerminoProformaFocusTraversalPolicy terminoproformaFocusTraversalPolicy = terminoproformaModel.new TerminoProformaFocusTraversalPolicy(this);
			
			//terminoproformaFocusTraversalPolicy.setterminoproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(terminoproformaModel);
			
			
			this.jContentPaneDetalleTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTerminoProforma = new GridBagLayout();	
			this.jContentPaneDetalleTerminoProforma.setLayout(gridaBagLayoutDetalleTerminoProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTerminoProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTerminoProforma.gridx = 0;
					
				
				this.jContentPaneDetalleTerminoProforma.add(jTtoolBarDetalleTerminoProforma, gridBagConstraintsTerminoProforma);								
				
}
			
			this.jScrollPanelDatosEdicionTerminoProforma=   new JScrollPane(jContentPaneDetalleTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTerminoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTerminoProforma.gridx = 0;
	        
			this.jContentPaneDetalleTerminoProforma.add(jPanelCamposTerminoProforma, gridBagConstraintsTerminoProforma);
			
			
			
			
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
						&& terminoproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleTerminoProforma(this.puedeCargarPorParteDetalleTerminoProforma,false,-1);
					
					if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTerminoProforma= new GridBagConstraints();
						this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTerminoProforma.gridx = 0;
						this.jContentPaneDetalleTerminoProforma.add(this.jTabbedPaneRelacionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTerminoProforma.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleTerminoProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTerminoProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
					this.gridBagConstraintsTerminoProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTerminoProforma.gridx = 0;
					
				
					this.jContentPaneDetalleTerminoProforma.add(jPanelCamposOcultosTerminoProforma, gridBagConstraintsTerminoProforma);
				
					this.jPanelCamposOcultosTerminoProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTerminoProforma.gridx = 0;
	        this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTerminoProforma.add(this.jPanelAccionesFormularioTerminoProforma, this.gridBagConstraintsTerminoProforma);							
			
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTerminoProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleTerminoProforma.add(this.jPanelAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTerminoProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTerminoProforma=   new JScrollPane(this.jPanelCamposTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTerminoProforma.gridx = 0;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTerminoProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTerminoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTerminoProforma, this.gridBagConstraintsTerminoProforma);			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTerminoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTerminoProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionTerminoProforma;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleTerminoProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		this.detalleterminoproformaSessionBean.setConGuardarRelaciones(false);
		this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(true);

		this.detalleterminoproformaBeanSwingJInternalFrame=null;//new DetalleTerminoProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleterminoproformaBeanSwingJInternalFramePopup=new DetalleTerminoProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleterminoproformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {

				DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleTerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(true);

				this.detalleterminoproformaBeanSwingJInternalFrame=new DetalleTerminoProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleterminoproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleterminoproformaBeanSwingJInternalFrame.setdetalleterminoproformaSessionBean(this.detalleterminoproformaSessionBean);

				//this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
				//this.gridBagConstraintsTerminoProforma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTerminoProforma.gridx = 0;
				//this.jContentPaneDetalleTerminoProforma.add(this.detalleterminoproformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTerminoProforma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTerminoProforma.add("Detalle Termino Proformas",this.detalleterminoproformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTerminoProforma.setComponentAt(iIndexTab,this.detalleterminoproformaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(false);
				this.detalleterminoproformaBeanSwingJInternalFrame=null;//new DetalleTerminoProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleTerminoProforma) {
					this.jTabbedPaneRelacionesTerminoProforma.add("Detalle Termino Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleTerminoProformaBeanSwingJInternalFrame(List<TerminoProforma> terminoproformas,TerminoProforma terminoproforma,DetalleTerminoProformaBeanSwingJInternalFrame detalleterminoproformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleterminoproformaBeanSwingJInternalFrame=new DetalleTerminoProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleterminoproformaBeanSwingJInternalFrame.getDetalleTerminoProformaLogic().setConnexion(this.terminoproformaLogic.getConnexion());

					detalleterminoproformaBeanSwingJInternalFrame.setterminoproformasForeignKey(terminoproformas);
					detalleterminoproformaBeanSwingJInternalFrame.setterminoproformaForeignKey(terminoproforma);
					detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setisBusquedaDesdeForeignKeySesionTerminoProforma(true);
					detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setlidTerminoProformaActual(terminoproforma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleterminoproformaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleTerminoProforma(detalleterminoproformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleterminoproformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTerminoProforma(true);
					detalleterminoproformaBeanSwingJInternalFrame.setid_termino_proformaFK_IdTerminoProforma(terminoproforma.getId());

					if(!this.conCargarFormDetalle) {
						detalleterminoproformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleterminoproformaBeanSwingJInternalFrame.setSelectedItemCombosFrameTerminoProformaForeignKey(terminoproforma,1,false,true,true);
					detalleterminoproformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleterminoproformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTerminoProforma");
					detalleterminoproformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTerminoProforma");
					detalleterminoproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTerminoProforma(true);
					detalleterminoproformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n",detalleterminoproformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleterminoproformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleterminoproformaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleterminoproformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleterminoproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTerminoProforma("relacionado");
					} else {
						detalleterminoproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTerminoProforma("no_relacionado");
					}

					detalleterminoproformaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleTerminoProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
