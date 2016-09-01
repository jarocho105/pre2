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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.FormularioRentaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class FormularioRentaDetalleFormJInternalFrame extends FormularioRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormularioRenta;
	
	protected JMenuBar jmenuBarDetalleFormularioRenta;
	
	protected JMenu jmenuDetalleFormularioRenta;
	protected JMenu jmenuDetalleArchivoFormularioRenta;
	protected JMenu jmenuDetalleAccionesFormularioRenta;
	protected JMenu jmenuDetalleDatosFormularioRenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRenta;	
	protected GridBagConstraints gridBagConstraintsFormularioRenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormularioRentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormularioRenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformulariorenta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroformularioiva="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public FormularioRentaSessionBean formulariorentaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	public PaisSessionBean paisSessionBean;	
	
	public FormularioRentaLogic formulariorentaLogic;
	
	public JScrollPane jScrollPanelDatosFormularioRenta;
	public JScrollPane jScrollPanelDatosEdicionFormularioRenta;
	public JScrollPane jScrollPanelDatosGeneralFormularioRenta;
	
	protected JPanel jPanelCamposFormularioRenta;    
	protected JPanel jPanelCamposOcultosFormularioRenta;    	
	protected JPanel jPanelAccionesFormularioRenta;
	protected JPanel jPanelAccionesFormularioFormularioRenta;
    
	
	
	protected Integer iXPanelCamposFormularioRenta=0;
	protected Integer iYPanelCamposFormularioRenta=0;
	
	protected Integer iXPanelCamposOcultosFormularioRenta=0;
	protected Integer iYPanelCamposOcultosFormularioRenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormularioRenta;
	public JButton jButtonModificarFormularioRenta;
	public JButton jButtonActualizarFormularioRenta;
    public JButton jButtonEliminarFormularioRenta;
	public JButton jButtonCancelarFormularioRenta;
    public JButton jButtonGuardarCambiosFormularioRenta;
	public JButton jButtonGuardarCambiosTablaFormularioRenta;
	protected JButton jButtonCerrarFormularioRenta;
	
	
	protected JButton jButtonProcesarInformacionFormularioRenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormularioRenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormularioRenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormularioRenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRenta;
	protected JButton jButtonModificarToolBarFormularioRenta;
	protected JButton jButtonActualizarToolBarFormularioRenta;
    protected JButton jButtonEliminarToolBarFormularioRenta;
	protected JButton jButtonCancelarToolBarFormularioRenta;
    protected JButton jButtonGuardarCambiosToolBarFormularioRenta;
	protected JButton jButtonGuardarCambiosTablaToolBarFormularioRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRenta;
	protected JButton jButtonCerrarToolBarFormularioRenta;
	
	protected JButton jButtonProcesarInformacionToolBarFormularioRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRenta;
	protected JMenuItem jMenuItemModificarFormularioRenta;
	protected JMenuItem jMenuItemActualizarFormularioRenta;
    protected JMenuItem jMenuItemEliminarFormularioRenta;
	protected JMenuItem jMenuItemCancelarFormularioRenta;
    protected JMenuItem jMenuItemGuardarCambiosFormularioRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRenta;
	protected JMenuItem jMenuItemCerrarFormularioRenta;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRenta;
	
	protected JMenuItem jMenuItemProcesarInformacionFormularioRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRenta;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormularioRenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormularioRenta;
	public JLabel jLabelIdFormularioRenta;
	public JLabel jLabelidFormularioRenta;
	public JButton jButtonidFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagadoFormularioRenta;
	public JLabel jLabelvalor_pagadoFormularioRenta;
	public JTextField jTextFieldvalor_pagadoFormularioRenta;
	public JButton jButtonvalor_pagadoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelimpuesto_retenidoFormularioRenta;
	public JLabel jLabelimpuesto_retenidoFormularioRenta;
	public JTextField jTextFieldimpuesto_retenidoFormularioRenta;
	public JButton jButtonimpuesto_retenidoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelbase_impornibleFormularioRenta;
	public JLabel jLabelbase_impornibleFormularioRenta;
	public JTextField jTextFieldbase_impornibleFormularioRenta;
	public JButton jButtonbase_impornibleFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormularioRenta;
	public JLabel jLabelid_empresaFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormularioRenta;
	public JButton jButtonid_empresaFormularioRenta= new JButtonMe();
	public JButton jButtonid_empresaFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormularioRenta;
	public JLabel jLabelid_ejercicioFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormularioRenta;
	public JButton jButtonid_ejercicioFormularioRenta= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormularioRenta;
	public JLabel jLabelid_periodoFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormularioRenta;
	public JButton jButtonid_periodoFormularioRenta= new JButtonMe();
	public JButton jButtonid_periodoFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_dato_formulario_rentaFormularioRenta;
	public JLabel jLabelid_dato_formulario_rentaFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_rentaFormularioRenta;
	public JButton jButtonid_dato_formulario_rentaFormularioRenta= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableFormularioRenta;
	public JLabel jLabelid_cuenta_contableFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFormularioRenta;
	public JButton jButtonid_cuenta_contableFormularioRenta= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormularioRentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormularioRentaArbol= new JButtonMe();

	public JPanel jPanelid_tipo_retencionFormularioRenta;
	public JLabel jLabelid_tipo_retencionFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFormularioRenta;
	public JButton jButtonid_tipo_retencionFormularioRenta= new JButtonMe();
	public JButton jButtonid_tipo_retencionFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_parametro_formulario_ivaFormularioRenta;
	public JLabel jLabelid_parametro_formulario_ivaFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_formulario_ivaFormularioRenta;
	public JButton jButtonid_parametro_formulario_ivaFormularioRenta= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisFormularioRenta;
	public JLabel jLabelid_paisFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFormularioRenta;
	public JButton jButtonid_paisFormularioRenta= new JButtonMe();
	public JButton jButtonid_paisFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_paisFormularioRentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormularioRenta;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormularioRentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormularioRenta=new JPanel();
				this.jPanelAccionesFormularioFormularioRenta=new JPanel();
				this.jmenuBarDetalleFormularioRenta=new JMenuBar();
				this.jTtoolBarDetalleFormularioRenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormularioRentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormularioRenta() {
		return this.jButtonActualizarToolBarFormularioRenta;
	}
	
	public JButton getjButtonEliminarToolBarFormularioRenta() {
		return this.jButtonEliminarToolBarFormularioRenta;
	}
	
	public JButton getjButtonCancelarToolBarFormularioRenta() {
		return this.jButtonCancelarToolBarFormularioRenta;
	}		
	
	public JButton getjButtonProcesarInformacionFormularioRenta() {
		return this.jButtonProcesarInformacionFormularioRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRenta)	{
		this.jButtonProcesarInformacionFormularioRenta = jButtonProcesarInformacionFormularioRenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRenta() {
		return this.jComboBoxTiposAccionesFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRenta(
			JComboBox jComboBoxTiposRelacionesFormularioRenta) {
		this.jComboBoxTiposRelacionesFormularioRenta = jComboBoxTiposRelacionesFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRenta(
			JComboBox jComboBoxTiposAccionesFormularioRenta) {
		this.jComboBoxTiposAccionesFormularioRenta = jComboBoxTiposAccionesFormularioRenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormularioRenta() {
		return this.jComboBoxTiposAccionesFormularioFormularioRenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormularioRenta(
			JComboBox jComboBoxTiposAccionesFormularioFormularioRenta) {
		this.jComboBoxTiposAccionesFormularioFormularioRenta = jComboBoxTiposAccionesFormularioFormularioRenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		
		this.formulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
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
	
		FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormularioRenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormularioRenta=new JButtonMe();
				this.jButtonModificarToolBarFormularioRenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta,
							"actualizar","actualizar","Actualizar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta,
							"eliminar","eliminar","Eliminar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta,
							"cancelar","cancelar","Cancelar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta,
							"guardarcambios","guardarcambios","Guardar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormularioRenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormularioRenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormularioRenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormularioRenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormularioRenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormularioRenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormularioRenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormularioRenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormularioRenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormularioRenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormularioRenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormularioRenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormularioRenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormularioRenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormularioRenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormularioRenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormularioRenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormularioRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormularioRenta.add(this.jMenuItemDetalleCerrarFormularioRenta);
		
		this.jmenuDetalleAccionesFormularioRenta.add(this.jMenuItemActualizarFormularioRenta);
		this.jmenuDetalleAccionesFormularioRenta.add(this.jMenuItemEliminarFormularioRenta);
		this.jmenuDetalleAccionesFormularioRenta.add(this.jMenuItemCancelarFormularioRenta);		
		
		//this.jmenuDetalleDatosFormularioRenta.add(this.jMenuItemDetalleAbrirOrderByFormularioRenta);				
		this.jmenuDetalleDatosFormularioRenta.add(this.jMenuItemDetalleMostarOcultarFormularioRenta);				
				
		//this.jmenuDetalleAccionesFormularioRenta.add(this.jMenuItemGuardarCambiosFormularioRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormularioRenta.add(this.jmenuDetalleArchivoFormularioRenta);		
		this.jmenuBarDetalleFormularioRenta.add(this.jmenuDetalleAccionesFormularioRenta);		
		this.jmenuBarDetalleFormularioRenta.add(this.jmenuDetalleDatosFormularioRenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormularioRenta);				
	}
	
	
	public void inicializarElementosCamposFormularioRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormularioRenta = new JLabelMe();
		jLabelIdFormularioRenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormularioRenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormularioRenta= new GridBagLayout();

		this.jPanelidFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);

		jLabelidFormularioRenta = new JLabel();
		jLabelidFormularioRenta.setText("Id");

		jLabelidFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_pagadoFormularioRenta = new JLabelMe();
		this.jLabelvalor_pagadoFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_VALORPAGADO+" : *");
		this.jLabelvalor_pagadoFormularioRenta.setToolTipText("Valor Pagado");
		this.jLabelvalor_pagadoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagadoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagadoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagadoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagadoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagadoFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelvalor_pagadoFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jTextFieldvalor_pagadoFormularioRenta= new JTextFieldMe();
		jTextFieldvalor_pagadoFormularioRenta.setEnabled(false);
		jTextFieldvalor_pagadoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagadoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagadoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagadoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagadoFormularioRenta.setText("0.0");

		this.jButtonvalor_pagadoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagadoFormularioRentaBusqueda.setText("U");
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagadoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagadoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagadoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagadoFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagadoFormularioRentaBusqueda.setVisible(false);		}


					
		this.jLabelimpuesto_retenidoFormularioRenta = new JLabelMe();
		this.jLabelimpuesto_retenidoFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO+" : *");
		this.jLabelimpuesto_retenidoFormularioRenta.setToolTipText("Impuesto Retenido");
		this.jLabelimpuesto_retenidoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelimpuesto_retenidoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelimpuesto_retenidoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto_retenidoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto_retenidoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto_retenidoFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelimpuesto_retenidoFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jTextFieldimpuesto_retenidoFormularioRenta= new JTextFieldMe();
		jTextFieldimpuesto_retenidoFormularioRenta.setEnabled(false);
		jTextFieldimpuesto_retenidoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenidoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto_retenidoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto_retenidoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto_retenidoFormularioRenta.setText("0.0");

		this.jButtonimpuesto_retenidoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setText("U");
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto_retenidoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto_retenidoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto_retenidoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto_retenidoFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto_retenidoFormularioRentaBusqueda.setVisible(false);		}


					
		this.jLabelbase_impornibleFormularioRenta = new JLabelMe();
		this.jLabelbase_impornibleFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE+" : *");
		this.jLabelbase_impornibleFormularioRenta.setToolTipText("Base Impornible");
		this.jLabelbase_impornibleFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbase_impornibleFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelbase_impornibleFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_impornibleFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_impornibleFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_impornibleFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelbase_impornibleFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jTextFieldbase_impornibleFormularioRenta= new JTextFieldMe();
		jTextFieldbase_impornibleFormularioRenta.setEnabled(false);
		jTextFieldbase_impornibleFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impornibleFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impornibleFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_impornibleFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_impornibleFormularioRenta.setText("0.0");

		this.jButtonbase_impornibleFormularioRentaBusqueda= new JButtonMe();
		this.jButtonbase_impornibleFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impornibleFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impornibleFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_impornibleFormularioRentaBusqueda.setText("U");
		this.jButtonbase_impornibleFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_impornibleFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_impornibleFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_impornibleFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_impornibleFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_impornibleFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_impornibleFormularioRentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormularioRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormularioRenta = new JLabelMe();
		this.jLabelid_empresaFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormularioRenta.setToolTipText("Empresa");
		this.jLabelid_empresaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_empresaFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_empresaFormularioRenta= new JComboBoxMe();
		jComboBoxid_empresaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormularioRenta.setEnabled(false);

		this.jButtonid_empresaFormularioRenta= new JButtonMe();
		this.jButtonid_empresaFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta.setText("Buscar");
		this.jButtonid_empresaFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRenta"));

		this.jButtonid_empresaFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_empresaFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRentaBusqueda.setText("U");
		this.jButtonid_empresaFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_empresaFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRentaUpdate.setText("U");
		this.jButtonid_empresaFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRentaUpdate"));



					
		this.jLabelid_ejercicioFormularioRenta = new JLabelMe();
		this.jLabelid_ejercicioFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormularioRenta.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_ejercicioFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_ejercicioFormularioRenta= new JComboBoxMe();
		jComboBoxid_ejercicioFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormularioRenta.setEnabled(false);

		this.jButtonid_ejercicioFormularioRenta= new JButtonMe();
		this.jButtonid_ejercicioFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta.setText("Buscar");
		this.jButtonid_ejercicioFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRenta"));

		this.jButtonid_ejercicioFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRentaBusqueda.setText("U");
		this.jButtonid_ejercicioFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRentaUpdate.setText("U");
		this.jButtonid_ejercicioFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRentaUpdate"));



					
		this.jLabelid_periodoFormularioRenta = new JLabelMe();
		this.jLabelid_periodoFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormularioRenta.setToolTipText("Periodo");
		this.jLabelid_periodoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_periodoFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_periodoFormularioRenta= new JComboBoxMe();
		jComboBoxid_periodoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormularioRenta.setEnabled(false);

		this.jButtonid_periodoFormularioRenta= new JButtonMe();
		this.jButtonid_periodoFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioRenta.setText("Buscar");
		this.jButtonid_periodoFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRenta"));

		this.jButtonid_periodoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_periodoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioRentaBusqueda.setText("U");
		this.jButtonid_periodoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_periodoFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioRentaUpdate.setText("U");
		this.jButtonid_periodoFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioRentaUpdate"));



					
		this.jLabelid_dato_formulario_rentaFormularioRenta = new JLabelMe();
		this.jLabelid_dato_formulario_rentaFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA+" : *");
		this.jLabelid_dato_formulario_rentaFormularioRenta.setToolTipText("Dato Formulario Renta");
		this.jLabelid_dato_formulario_rentaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_dato_formulario_rentaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_dato_formulario_rentaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_rentaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_dato_formulario_rentaFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_dato_formulario_rentaFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_dato_formulario_rentaFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_dato_formulario_rentaFormularioRenta= new JComboBoxMe();
		jComboBoxid_dato_formulario_rentaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_rentaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_dato_formulario_rentaFormularioRenta= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_rentaFormularioRenta.setText("Buscar");
		this.jButtonid_dato_formulario_rentaFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_dato_formulario_rentaFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_dato_formulario_rentaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRenta"));

		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setText("U");
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_dato_formulario_rentaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setText("U");
		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_dato_formulario_rentaFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_rentaFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_dato_formulario_rentaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_rentaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_rentaFormularioRentaUpdate"));



					
		this.jLabelid_cuenta_contableFormularioRenta = new JLabelMe();
		this.jLabelid_cuenta_contableFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableFormularioRenta.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_cuenta_contableFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_cuenta_contableFormularioRenta= new JComboBoxMe();
		jComboBoxid_cuenta_contableFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableFormularioRenta= new JButtonMe();
		this.jButtonid_cuenta_contableFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormularioRenta.setText("Buscar");
		this.jButtonid_cuenta_contableFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormularioRenta"));

		this.jButtonid_cuenta_contableFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormularioRentaBusqueda.setText("U");
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormularioRentaUpdate.setText("U");
		this.jButtonid_cuenta_contableFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormularioRentaUpdate"));


		jButtonid_cuenta_contableFormularioRentaArbol= new JButtonMe();
		jButtonid_cuenta_contableFormularioRentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormularioRentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormularioRentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormularioRentaArbol.setText("Arbol");
		jButtonid_cuenta_contableFormularioRentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableFormularioRentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormularioRentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormularioRentaArbol"));



					
		this.jLabelid_tipo_retencionFormularioRenta = new JLabelMe();
		this.jLabelid_tipo_retencionFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionFormularioRenta.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_tipo_retencionFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_tipo_retencionFormularioRenta= new JComboBoxMe();
		jComboBoxid_tipo_retencionFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionFormularioRenta= new JButtonMe();
		this.jButtonid_tipo_retencionFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionFormularioRenta.setText("Buscar");
		this.jButtonid_tipo_retencionFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionFormularioRenta"));

		this.jButtonid_tipo_retencionFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionFormularioRentaBusqueda.setText("U");
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionFormularioRentaUpdate.setText("U");
		this.jButtonid_tipo_retencionFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionFormularioRentaUpdate"));



					
		this.jLabelid_parametro_formulario_ivaFormularioRenta = new JLabelMe();
		this.jLabelid_parametro_formulario_ivaFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_parametro_formulario_ivaFormularioRenta.setToolTipText("Parametro Formulario Iva");
		this.jLabelid_parametro_formulario_ivaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_parametro_formulario_ivaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_parametro_formulario_ivaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_formulario_ivaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parametro_formulario_ivaFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parametro_formulario_ivaFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_parametro_formulario_ivaFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_parametro_formulario_ivaFormularioRenta= new JComboBoxMe();
		jComboBoxid_parametro_formulario_ivaFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_formulario_ivaFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parametro_formulario_ivaFormularioRenta= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setText("Buscar");
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parametro_formulario_ivaFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioRenta"));

		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setText("U");
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setText("U");
		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioRentaUpdate"));



					
		this.jLabelid_paisFormularioRenta = new JLabelMe();
		this.jLabelid_paisFormularioRenta.setText(""+FormularioRentaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisFormularioRenta.setToolTipText("Pais");
		this.jLabelid_paisFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisFormularioRenta.setToolTipText(FormularioRentaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutFormularioRenta = new GridBagLayout();
		this.jPanelid_paisFormularioRenta.setLayout(this.gridaBagLayoutFormularioRenta);


		jComboBoxid_paisFormularioRenta= new JComboBoxMe();
		jComboBoxid_paisFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisFormularioRenta= new JButtonMe();
		this.jButtonid_paisFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisFormularioRenta.setText("Buscar");
		this.jButtonid_paisFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisFormularioRenta"));

		this.jButtonid_paisFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_paisFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisFormularioRentaBusqueda.setText("U");
		this.jButtonid_paisFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisFormularioRentaBusqueda"));

		if(this.formulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_paisFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_paisFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisFormularioRentaUpdate.setText("U");
		this.jButtonid_paisFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisFormularioRentaUpdate"));



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
		//this.jInternalFrameDetalleFormularioRenta = new FormularioRentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formulario Renta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRenta= new GridBagLayout();
		

		
		String sToolTipFormularioRenta="";
		sToolTipFormularioRenta=FormularioRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRenta+="(Contabilidad.FormularioRenta)";
		}
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormularioRenta = new JButtonMe();
		this.jButtonModificarFormularioRenta = new JButtonMe();
        this.jButtonActualizarFormularioRenta = new JButtonMe();
        this.jButtonEliminarFormularioRenta = new JButtonMe();
        this.jButtonCancelarFormularioRenta = new JButtonMe();
        this.jButtonGuardarCambiosFormularioRenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormularioRenta = new JButtonMe();
		this.jButtonCerrarFormularioRenta = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormularioRenta = new JScrollPane();
		this.jScrollPanelDatosGeneralFormularioRenta = new JScrollPane();
				
		
		
		this.jPanelCamposFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta";
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormularioRenta.setName("jPanelCamposFormularioRenta"); 

		this.jPanelCamposOcultosFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormularioRenta.setName("jPanelCamposOcultosFormularioRenta"); 

        this.jPanelAccionesFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRenta.setName("Acciones"); 

		this.jPanelAccionesFormularioFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormularioRenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormularioRenta.setText("Nuevo");
		this.jButtonModificarFormularioRenta.setText("Editar");
        this.jButtonActualizarFormularioRenta.setText("Actualizar");
        this.jButtonEliminarFormularioRenta.setText("Eliminar");
        this.jButtonCancelarFormularioRenta.setText("Cancelar");
        this.jButtonGuardarCambiosFormularioRenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormularioRenta.setText("Guardar");
		this.jButtonCerrarFormularioRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRenta,"nuevo_button","Nuevo",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormularioRenta,"modificar_button","Editar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormularioRenta,"actualizar_button","Actualizar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormularioRenta,"eliminar_button","Eliminar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormularioRenta,"cancelar_button","Cancelar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormularioRenta,"guardarcambios_button","Guardar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRenta,"guardarcambiostabla_button","Guardar",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRenta,"cerrar_button","Salir",this.formulariorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormularioRenta.setToolTipText("Nuevo"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormularioRenta.setToolTipText("Editar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormularioRenta.setToolTipText("Actualizar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormularioRenta.setToolTipText("Eliminar)"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormularioRenta.setToolTipText("Cancelar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormularioRenta.setToolTipText("Guardar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormularioRenta.setToolTipText("Guardar"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRenta.setToolTipText("Salir"+" "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRenta";
		inputMap = this.jButtonNuevoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormularioRenta";
		inputMap = this.jButtonActualizarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormularioRenta"));
		
		//ELIMINAR
		sMapKey = "EliminarFormularioRenta";
		inputMap = this.jButtonEliminarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormularioRenta"));
		
		//CANCELAR	
		sMapKey = "CancelarFormularioRenta";
		inputMap = this.jButtonCancelarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormularioRenta"));
		
		//CERRAR		
		sMapKey = "CerrarFormularioRenta";
		inputMap = this.jButtonCerrarFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRenta";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormularioRenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormularioRenta.setToolTipText("Nuevo FormularioRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormularioRenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormularioRenta.setToolTipText("Sin Cerrar Ventana FormularioRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormularioRenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormularioRenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRenta.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormularioRenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormularioRenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormularioRenta = new JLabelMe();
		
		this.jLabelAccionesFormularioRenta.setText("Acciones");		
		this.jLabelAccionesFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormularioRenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormularioRenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormularioRenta=new JTabbedPane();
		this.jTabbedPaneRelacionesFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormularioRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormularioRenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormularioRenta = new GridBagLayout();
		
		this.jPanelCamposFormularioRenta.setLayout(gridaBagLayoutCamposFormularioRenta);
		this.jPanelCamposOcultosFormularioRenta.setLayout(gridaBagLayoutCamposOcultosFormularioRenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormularioRenta.add(jLabelIdFormularioRenta, this.gridBagConstraintsFormularioRenta);



	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormularioRenta.add(jLabelidFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormularioRenta.add(jLabelid_empresaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRenta.add(jButtonid_empresaFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRenta.add(jButtonid_empresaFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormularioRenta.add(jComboBoxid_empresaFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormularioRenta.add(jLabelid_ejercicioFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRenta.add(jButtonid_ejercicioFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRenta.add(jButtonid_ejercicioFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormularioRenta.add(jComboBoxid_ejercicioFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormularioRenta.add(jLabelid_periodoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioRenta.add(jButtonid_periodoFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioRenta.add(jButtonid_periodoFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormularioRenta.add(jComboBoxid_periodoFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_dato_formulario_rentaFormularioRenta.add(jLabelid_dato_formulario_rentaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_rentaFormularioRenta.add(jButtonid_dato_formulario_rentaFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_rentaFormularioRenta.add(jButtonid_dato_formulario_rentaFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_dato_formulario_rentaFormularioRenta.add(jComboBoxid_dato_formulario_rentaFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableFormularioRenta.add(jLabelid_cuenta_contableFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormularioRenta.add(jButtonid_cuenta_contableFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormularioRenta.add(jButtonid_cuenta_contableFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableFormularioRenta.add(jComboBoxid_cuenta_contableFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionFormularioRenta.add(jLabelid_tipo_retencionFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionFormularioRenta.add(jButtonid_tipo_retencionFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionFormularioRenta.add(jButtonid_tipo_retencionFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionFormularioRenta.add(jComboBoxid_tipo_retencionFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parametro_formulario_ivaFormularioRenta.add(jLabelid_parametro_formulario_ivaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_formulario_ivaFormularioRenta.add(jButtonid_parametro_formulario_ivaFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_formulario_ivaFormularioRenta.add(jButtonid_parametro_formulario_ivaFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parametro_formulario_ivaFormularioRenta.add(jComboBoxid_parametro_formulario_ivaFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisFormularioRenta.add(jLabelid_paisFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisFormularioRenta.add(jButtonid_paisFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 3;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisFormularioRenta.add(jButtonid_paisFormularioRentaUpdate, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisFormularioRenta.add(jComboBoxid_paisFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagadoFormularioRenta.add(jLabelvalor_pagadoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagadoFormularioRenta.add(jButtonvalor_pagadoFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagadoFormularioRenta.add(jTextFieldvalor_pagadoFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto_retenidoFormularioRenta.add(jLabelimpuesto_retenidoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto_retenidoFormularioRenta.add(jButtonimpuesto_retenidoFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto_retenidoFormularioRenta.add(jTextFieldimpuesto_retenidoFormularioRenta, this.gridBagConstraintsFormularioRenta);


	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 0;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_impornibleFormularioRenta.add(jLabelbase_impornibleFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = 2;
		this.gridBagConstraintsFormularioRenta.ipadx = 0;
		this.gridBagConstraintsFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_impornibleFormularioRenta.add(jButtonbase_impornibleFormularioRentaBusqueda, this.gridBagConstraintsFormularioRenta);
	}

	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta.gridy = 0;
	this.gridBagConstraintsFormularioRenta.gridx = 1;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_impornibleFormularioRenta.add(jTextFieldbase_impornibleFormularioRenta, this.gridBagConstraintsFormularioRenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelidFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelid_dato_formulario_rentaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelid_cuenta_contableFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelid_tipo_retencionFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelid_parametro_formulario_ivaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelid_paisFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelvalor_pagadoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelimpuesto_retenidoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta.add(this.jPanelbase_impornibleFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposFormularioRenta % 1==0) {
		iXPanelCamposFormularioRenta=0;
		iYPanelCamposFormularioRenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposOcultosFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposOcultosFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRenta.add(this.jPanelid_empresaFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposOcultosFormularioRenta % 1==0) {
		iXPanelCamposOcultosFormularioRenta=0;
		iYPanelCamposOcultosFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposOcultosFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposOcultosFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRenta.add(this.jPanelid_ejercicioFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposOcultosFormularioRenta % 1==0) {
		iXPanelCamposOcultosFormularioRenta=0;
		iYPanelCamposOcultosFormularioRenta++;
	}
	this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta.gridy = iYPanelCamposOcultosFormularioRenta;
	this.gridBagConstraintsFormularioRenta.gridx = iXPanelCamposOcultosFormularioRenta++;
	this.gridBagConstraintsFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRenta.add(this.jPanelid_periodoFormularioRenta, this.gridBagConstraintsFormularioRenta);



	if(iXPanelCamposOcultosFormularioRenta % 1==0) {
		iXPanelCamposOcultosFormularioRenta=0;
		iYPanelCamposOcultosFormularioRenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormularioRenta= new GridBagLayout();
		this.jPanelAccionesFormularioRenta.setLayout(gridaBagLayoutAccionesFormularioRenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormularioRenta= new GridBagLayout();
		this.jPanelAccionesFormularioFormularioRenta.setLayout(gridaBagLayoutAccionesFormularioFormularioRenta);
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRenta.add(this.jComboBoxTiposAccionesFormularioFormularioRenta, this.gridBagConstraintsFormularioRenta);

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRenta.add(this.jCheckBoxPostAccionNuevoFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRenta.add(this.jCheckBoxPostAccionSinCerrarFormularioRenta, this.gridBagConstraintsFormularioRenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRenta.add(this.jCheckBoxPostAccionSinMensajeFormularioRenta, this.gridBagConstraintsFormularioRenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormularioRenta.add(this.jButtonModificarFormularioRenta, this.gridBagConstraintsFormularioRenta);							

		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta.gridy = 0;
		this.gridBagConstraintsFormularioRenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormularioRenta.add(this.jButtonEliminarFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = 0;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta.add(this.jButtonActualizarFormularioRenta, this.gridBagConstraintsFormularioRenta);


		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = 0;		
		this.gridBagConstraintsFormularioRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta.add(this.jButtonGuardarCambiosFormularioRenta, this.gridBagConstraintsFormularioRenta);	
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = 0;		
		this.gridBagConstraintsFormularioRenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta.add(this.jButtonCancelarFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta.gridx = 0;		
			//this.gridBagConstraintsFormularioRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta.gridx =0;
		this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRenta, this.gridBagConstraintsFormularioRenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormularioRenta = new FormularioRentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formulario Renta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formulario Renta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Renta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormularioRentaModel formulariorentaModel=new FormularioRentaModel(this);
			
			//SI USARA CLASE INTERNA
			//FormularioRentaModel.FormularioRentaFocusTraversalPolicy formulariorentaFocusTraversalPolicy = formulariorentaModel.new FormularioRentaFocusTraversalPolicy(this);
			
			//formulariorentaFocusTraversalPolicy.setformulariorentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formulariorentaModel);
			
			
			this.jContentPaneDetalleFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormularioRenta = new GridBagLayout();	
			this.jContentPaneDetalleFormularioRenta.setLayout(gridaBagLayoutDetalleFormularioRenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormularioRenta.gridx = 0;
					
				
				this.jContentPaneDetalleFormularioRenta.add(jTtoolBarDetalleFormularioRenta, gridBagConstraintsFormularioRenta);								
				
}
			
			this.jScrollPanelDatosEdicionFormularioRenta=   new JScrollPane(jContentPaneDetalleFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormularioRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormularioRenta.gridx = 0;
	        
			this.jContentPaneDetalleFormularioRenta.add(jPanelCamposFormularioRenta, gridBagConstraintsFormularioRenta);
			
			
			
			
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
						&& formulariorentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormularioRenta= new GridBagConstraints();
						this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormularioRenta.gridx = 0;
						this.jContentPaneDetalleFormularioRenta.add(this.jTabbedPaneRelacionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormularioRenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormularioRenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
					this.gridBagConstraintsFormularioRenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormularioRenta.gridx = 0;
					
				
					this.jContentPaneDetalleFormularioRenta.add(jPanelCamposOcultosFormularioRenta, gridBagConstraintsFormularioRenta);
				
					this.jPanelCamposOcultosFormularioRenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormularioRenta.gridx = 0;
	        this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormularioRenta.add(this.jPanelAccionesFormularioFormularioRenta, this.gridBagConstraintsFormularioRenta);							
			
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
	        this.gridBagConstraintsFormularioRenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormularioRenta.gridx = 0;
	        
			
			this.jContentPaneDetalleFormularioRenta.add(this.jPanelAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormularioRenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormularioRenta=   new JScrollPane(this.jPanelCamposFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta.gridx = 0;
			this.gridBagConstraintsFormularioRenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormularioRenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormularioRenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormularioRenta, this.gridBagConstraintsFormularioRenta);			
			
			this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRenta, this.gridBagConstraintsFormularioRenta);
			
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRenta, this.gridBagConstraintsFormularioRenta);
		
			
		this.gridBagConstraintsFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRenta, this.gridBagConstraintsFormularioRenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormularioRenta;//jContentPane;
		
		return jScrollPanelDatosEdicionFormularioRenta;
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
