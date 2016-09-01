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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.DefiProvisionEmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class DefiProvisionEmpleadoDetalleFormJInternalFrame extends DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDefiProvisionEmpleado;
	
	protected JMenuBar jmenuBarDetalleDefiProvisionEmpleado;
	
	protected JMenu jmenuDetalleDefiProvisionEmpleado;
	protected JMenu jmenuDetalleArchivoDefiProvisionEmpleado;
	protected JMenu jmenuDetalleAccionesDefiProvisionEmpleado;
	protected JMenu jmenuDetalleDatosDefiProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDefiProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsDefiProvisionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDefiProvisionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected MesBeanSwingJInternalFrame mesinicialBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicial="";

	protected MesBeanSwingJInternalFrame mesfinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfinal="";
	
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
	
	

	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;
	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProvisionEmpleado=false;
	public ProvisionEmpleadoSessionBean provisionempleadoSessionBean;

	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;
	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuota=false;
	public CuotaSessionBean cuotaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public MesSessionBean mesinicialSessionBean;
	public MesSessionBean mesfinalSessionBean;	
	
	public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosDefiProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionDefiProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralDefiProvisionEmpleado;
	
	protected JPanel jPanelCamposDefiProvisionEmpleado;    
	protected JPanel jPanelCamposOcultosDefiProvisionEmpleado;    	
	protected JPanel jPanelAccionesDefiProvisionEmpleado;
	protected JPanel jPanelAccionesFormularioDefiProvisionEmpleado;
    
	
	
	protected Integer iXPanelCamposDefiProvisionEmpleado=0;
	protected Integer iYPanelCamposDefiProvisionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosDefiProvisionEmpleado=0;
	protected Integer iYPanelCamposOcultosDefiProvisionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDefiProvisionEmpleado;
	public JButton jButtonModificarDefiProvisionEmpleado;
	public JButton jButtonActualizarDefiProvisionEmpleado;
    public JButton jButtonEliminarDefiProvisionEmpleado;
	public JButton jButtonCancelarDefiProvisionEmpleado;
    public JButton jButtonGuardarCambiosDefiProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaDefiProvisionEmpleado;
	protected JButton jButtonCerrarDefiProvisionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionDefiProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDefiProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDefiProvisionEmpleado;
	protected JButton jButtonModificarToolBarDefiProvisionEmpleado;
	protected JButton jButtonActualizarToolBarDefiProvisionEmpleado;
    protected JButton jButtonEliminarToolBarDefiProvisionEmpleado;
	protected JButton jButtonCancelarToolBarDefiProvisionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarDefiProvisionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarDefiProvisionEmpleado;
	protected JButton jButtonCerrarToolBarDefiProvisionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarDefiProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDefiProvisionEmpleado;
	protected JMenuItem jMenuItemModificarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemActualizarDefiProvisionEmpleado;
    protected JMenuItem jMenuItemEliminarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemCancelarDefiProvisionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosDefiProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDefiProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDefiProvisionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionDefiProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarDefiProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDefiProvisionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDefiProvisionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDefiProvisionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDefiProvisionEmpleado;
	public JLabel jLabelIdDefiProvisionEmpleado;
	public JLabel jLabelidDefiProvisionEmpleado;
	public JButton jButtonidDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDefiProvisionEmpleado;
	public JLabel jLabelnombreDefiProvisionEmpleado;
	public JTextArea jTextAreanombreDefiProvisionEmpleado;
	public JScrollPane jscrollPanenombreDefiProvisionEmpleado;
	public JButton jButtonnombreDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneldia_inicialDefiProvisionEmpleado;
	public JLabel jLabeldia_inicialDefiProvisionEmpleado;
	public JTextField jTextFielddia_inicialDefiProvisionEmpleado;
	public JButton jButtondia_inicialDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneldia_finalDefiProvisionEmpleado;
	public JLabel jLabeldia_finalDefiProvisionEmpleado;
	public JTextField jTextFielddia_finalDefiProvisionEmpleado;
	public JButton jButtondia_finalDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelpara_liquidacionDefiProvisionEmpleado;
	public JLabel jLabelpara_liquidacionDefiProvisionEmpleado;
	public JCheckBox jCheckBoxpara_liquidacionDefiProvisionEmpleado;
	public JButton jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDefiProvisionEmpleado;
	public JLabel jLabeldescripcionDefiProvisionEmpleado;
	public JTextArea jTextAreadescripcionDefiProvisionEmpleado;
	public JScrollPane jscrollPanedescripcionDefiProvisionEmpleado;
	public JButton jButtondescripcionDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDefiProvisionEmpleado;
	public JLabel jLabelid_empresaDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDefiProvisionEmpleado;
	public JButton jButtonid_empresaDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaDefiProvisionEmpleado;
	public JLabel jLabelid_rubro_empleaDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaDefiProvisionEmpleado;
	public JButton jButtonid_rubro_empleaDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoDefiProvisionEmpleado;
	public JLabel jLabelid_formatoDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoDefiProvisionEmpleado;
	public JButton jButtonid_formatoDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_formatoDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formatoDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_inicialDefiProvisionEmpleado;
	public JLabel jLabelid_mes_inicialDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicialDefiProvisionEmpleado;
	public JButton jButtonid_mes_inicialDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mes_inicialDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mes_finalDefiProvisionEmpleado;
	public JLabel jLabelid_mes_finalDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finalDefiProvisionEmpleado;
	public JButton jButtonid_mes_finalDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mes_finalDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mes_finalDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDefiProvisionEmpleado;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDefiProvisionEmpleado=new JPanel();
				this.jPanelAccionesFormularioDefiProvisionEmpleado=new JPanel();
				this.jmenuBarDetalleDefiProvisionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleDefiProvisionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DefiProvisionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDefiProvisionEmpleado() {
		return this.jButtonActualizarToolBarDefiProvisionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarDefiProvisionEmpleado() {
		return this.jButtonEliminarToolBarDefiProvisionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarDefiProvisionEmpleado() {
		return this.jButtonCancelarToolBarDefiProvisionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionDefiProvisionEmpleado() {
		return this.jButtonProcesarInformacionDefiProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDefiProvisionEmpleado)	{
		this.jButtonProcesarInformacionDefiProvisionEmpleado = jButtonProcesarInformacionDefiProvisionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDefiProvisionEmpleado() {
		return this.jComboBoxTiposAccionesDefiProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesDefiProvisionEmpleado) {
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado = jComboBoxTiposRelacionesDefiProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesDefiProvisionEmpleado) {
		this.jComboBoxTiposAccionesDefiProvisionEmpleado = jComboBoxTiposAccionesDefiProvisionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDefiProvisionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDefiProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioDefiProvisionEmpleado) {
		this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado = jComboBoxTiposAccionesFormularioDefiProvisionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		
		this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		//this.cuotaSessionBean=new CuotaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DefiProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Defi Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		DefiProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDefiProvisionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDefiProvisionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarDefiProvisionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDefiProvisionEmpleado,this.jTtoolBarDetalleDefiProvisionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDefiProvisionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDefiProvisionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDefiProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDefiProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDefiProvisionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDefiProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDefiProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDefiProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDefiProvisionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDefiProvisionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDefiProvisionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDefiProvisionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDefiProvisionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDefiProvisionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDefiProvisionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDefiProvisionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDefiProvisionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDefiProvisionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDefiProvisionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDefiProvisionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDefiProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDefiProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDefiProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDefiProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDefiProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDefiProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDefiProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDefiProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDefiProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDefiProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDefiProvisionEmpleado.add(this.jMenuItemDetalleCerrarDefiProvisionEmpleado);
		
		this.jmenuDetalleAccionesDefiProvisionEmpleado.add(this.jMenuItemActualizarDefiProvisionEmpleado);
		this.jmenuDetalleAccionesDefiProvisionEmpleado.add(this.jMenuItemEliminarDefiProvisionEmpleado);
		this.jmenuDetalleAccionesDefiProvisionEmpleado.add(this.jMenuItemCancelarDefiProvisionEmpleado);		
		
		//this.jmenuDetalleDatosDefiProvisionEmpleado.add(this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado);				
		this.jmenuDetalleDatosDefiProvisionEmpleado.add(this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado);				
				
		//this.jmenuDetalleAccionesDefiProvisionEmpleado.add(this.jMenuItemGuardarCambiosDefiProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDefiProvisionEmpleado.add(this.jmenuDetalleArchivoDefiProvisionEmpleado);		
		this.jmenuBarDetalleDefiProvisionEmpleado.add(this.jmenuDetalleAccionesDefiProvisionEmpleado);		
		this.jmenuBarDetalleDefiProvisionEmpleado.add(this.jmenuDetalleDatosDefiProvisionEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDefiProvisionEmpleado.add(this.jmenuDetalleDefiProvisionEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDefiProvisionEmpleado);				
	}
	
	
	public void inicializarElementosCamposDefiProvisionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDefiProvisionEmpleado = new JLabelMe();
		jLabelIdDefiProvisionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDefiProvisionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDefiProvisionEmpleado= new GridBagLayout();

		this.jPanelidDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);

		jLabelidDefiProvisionEmpleado = new JLabel();
		jLabelidDefiProvisionEmpleado.setText("Id");

		jLabelidDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDefiProvisionEmpleado = new JLabelMe();
		this.jLabelnombreDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDefiProvisionEmpleado.setToolTipText("Nombre");
		this.jLabelnombreDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelnombreDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jTextAreanombreDefiProvisionEmpleado= new JTextAreaMe();
		jTextAreanombreDefiProvisionEmpleado.setEnabled(false);
		jTextAreanombreDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDefiProvisionEmpleado.setLineWrap(true);
		jTextAreanombreDefiProvisionEmpleado.setWrapStyleWord(true);
		jTextAreanombreDefiProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDefiProvisionEmpleado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDefiProvisionEmpleado = new JScrollPane(jTextAreanombreDefiProvisionEmpleado);
		jscrollPanenombreDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDefiProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeldia_inicialDefiProvisionEmpleado = new JLabelMe();
		this.jLabeldia_inicialDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL+" : *");
		this.jLabeldia_inicialDefiProvisionEmpleado.setToolTipText("Dia Inicial");
		this.jLabeldia_inicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_inicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_inicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_inicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_inicialDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_inicialDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAINICIAL);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPaneldia_inicialDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jTextFielddia_inicialDefiProvisionEmpleado= new JTextFieldMe();
		jTextFielddia_inicialDefiProvisionEmpleado.setEnabled(false);
		jTextFielddia_inicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_inicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_inicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_inicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_inicialDefiProvisionEmpleado.setText("0");

		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_inicialDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_inicialDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_inicialDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_inicialDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_inicialDefiProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeldia_finalDefiProvisionEmpleado = new JLabelMe();
		this.jLabeldia_finalDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL+" : *");
		this.jLabeldia_finalDefiProvisionEmpleado.setToolTipText("Dia Final");
		this.jLabeldia_finalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_finalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_finalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_finalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_finalDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_finalDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_DIAFINAL);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPaneldia_finalDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jTextFielddia_finalDefiProvisionEmpleado= new JTextFieldMe();
		jTextFielddia_finalDefiProvisionEmpleado.setEnabled(false);
		jTextFielddia_finalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_finalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_finalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_finalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_finalDefiProvisionEmpleado.setText("0");

		this.jButtondia_finalDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_finalDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_finalDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_finalDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_finalDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_finalDefiProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelpara_liquidacionDefiProvisionEmpleado = new JLabelMe();
		this.jLabelpara_liquidacionDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION+" : *");
		this.jLabelpara_liquidacionDefiProvisionEmpleado.setToolTipText("Para Liquacion");
		this.jLabelpara_liquidacionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_liquidacionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_liquidacionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_liquidacionDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_liquidacionDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_liquidacionDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_PARALIQUIDACION);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelpara_liquidacionDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jCheckBoxpara_liquidacionDefiProvisionEmpleado= new JCheckBoxMe();
		jCheckBoxpara_liquidacionDefiProvisionEmpleado.setEnabled(false);

		jCheckBoxpara_liquidacionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_liquidacionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpara_liquidacionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpara_liquidacionDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpara_liquidacionDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpara_liquidacionDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_liquidacionDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDefiProvisionEmpleado = new JLabelMe();
		this.jLabeldescripcionDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDefiProvisionEmpleado.setToolTipText("Descripcion");
		this.jLabeldescripcionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPaneldescripcionDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jTextAreadescripcionDefiProvisionEmpleado= new JTextAreaMe();
		jTextAreadescripcionDefiProvisionEmpleado.setEnabled(false);
		jTextAreadescripcionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDefiProvisionEmpleado.setLineWrap(true);
		jTextAreadescripcionDefiProvisionEmpleado.setWrapStyleWord(true);
		jTextAreadescripcionDefiProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDefiProvisionEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDefiProvisionEmpleado = new JScrollPane(jTextAreadescripcionDefiProvisionEmpleado);
		jscrollPanedescripcionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDefiProvisionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDefiProvisionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDefiProvisionEmpleado = new JLabelMe();
		this.jLabelid_empresaDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDefiProvisionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelid_empresaDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jComboBoxid_empresaDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDefiProvisionEmpleado.setEnabled(false);

		this.jButtonid_empresaDefiProvisionEmpleado= new JButtonMe();
		this.jButtonid_empresaDefiProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefiProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefiProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefiProvisionEmpleado.setText("Buscar");
		this.jButtonid_empresaDefiProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDefiProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefiProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefiProvisionEmpleado"));

		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDefiProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDefiProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDefiProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefiProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefiProvisionEmpleadoUpdate"));



					
		this.jLabelid_rubro_empleaDefiProvisionEmpleado = new JLabelMe();
		this.jLabelid_rubro_empleaDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaDefiProvisionEmpleado.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelid_rubro_empleaDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jComboBoxid_rubro_empleaDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaDefiProvisionEmpleado= new JButtonMe();
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setText("Buscar");
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaDefiProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaDefiProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaDefiProvisionEmpleado"));

		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaDefiProvisionEmpleadoUpdate"));



					
		this.jLabelid_formatoDefiProvisionEmpleado = new JLabelMe();
		this.jLabelid_formatoDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoDefiProvisionEmpleado.setToolTipText("Formato");
		this.jLabelid_formatoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelid_formatoDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jComboBoxid_formatoDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_formatoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoDefiProvisionEmpleado= new JButtonMe();
		this.jButtonid_formatoDefiProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefiProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefiProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefiProvisionEmpleado.setText("Buscar");
		this.jButtonid_formatoDefiProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoDefiProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefiProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefiProvisionEmpleado"));

		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoDefiProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_formatoDefiProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoDefiProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefiProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefiProvisionEmpleadoUpdate"));



					
		this.jLabelid_mes_inicialDefiProvisionEmpleado = new JLabelMe();
		this.jLabelid_mes_inicialDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL+" : *");
		this.jLabelid_mes_inicialDefiProvisionEmpleado.setToolTipText("Mes Inicial");
		this.jLabelid_mes_inicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_inicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_inicialDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_inicialDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESINICIAL);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelid_mes_inicialDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jComboBoxid_mes_inicialDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mes_inicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_inicialDefiProvisionEmpleado= new JButtonMe();
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setText("Buscar");
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_inicialDefiProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicialDefiProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicialDefiProvisionEmpleado"));

		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicialDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_inicialDefiProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_inicialDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_inicialDefiProvisionEmpleadoUpdate"));



					
		this.jLabelid_mes_finalDefiProvisionEmpleado = new JLabelMe();
		this.jLabelid_mes_finalDefiProvisionEmpleado.setText(""+DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL+" : *");
		this.jLabelid_mes_finalDefiProvisionEmpleado.setToolTipText("Mes Final");
		this.jLabelid_mes_finalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mes_finalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mes_finalDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mes_finalDefiProvisionEmpleado.setToolTipText(DefiProvisionEmpleadoConstantesFunciones.LABEL_IDMESFINAL);
		this.gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		this.jPanelid_mes_finalDefiProvisionEmpleado.setLayout(this.gridaBagLayoutDefiProvisionEmpleado);


		jComboBoxid_mes_finalDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mes_finalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mes_finalDefiProvisionEmpleado= new JButtonMe();
		this.jButtonid_mes_finalDefiProvisionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finalDefiProvisionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finalDefiProvisionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mes_finalDefiProvisionEmpleado.setText("Buscar");
		this.jButtonid_mes_finalDefiProvisionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mes_finalDefiProvisionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finalDefiProvisionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mes_finalDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finalDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finalDefiProvisionEmpleado"));

		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setText("U");
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mes_finalDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finalDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finalDefiProvisionEmpleadoBusqueda"));

		if(this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mes_finalDefiProvisionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setText("U");
		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mes_finalDefiProvisionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mes_finalDefiProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mes_finalDefiProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mes_finalDefiProvisionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleDefiProvisionEmpleado = new DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Defi Provision Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDefiProvisionEmpleado= new GridBagLayout();
		

		
		String sToolTipDefiProvisionEmpleado="";
		sToolTipDefiProvisionEmpleado=DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDefiProvisionEmpleado+="(Nomina.DefiProvisionEmpleado)";
		}
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDefiProvisionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDefiProvisionEmpleado = new JButtonMe();
		this.jButtonModificarDefiProvisionEmpleado = new JButtonMe();
        this.jButtonActualizarDefiProvisionEmpleado = new JButtonMe();
        this.jButtonEliminarDefiProvisionEmpleado = new JButtonMe();
        this.jButtonCancelarDefiProvisionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosDefiProvisionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarDefiProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosDefiProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionDefiProvisionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralDefiProvisionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Defi Provision Empleado";
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosDefiProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDefiProvisionEmpleado.setName("jPanelCamposDefiProvisionEmpleado"); 

		this.jPanelCamposOcultosDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDefiProvisionEmpleado.setName("jPanelCamposOcultosDefiProvisionEmpleado"); 

        this.jPanelAccionesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDefiProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesDefiProvisionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDefiProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDefiProvisionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDefiProvisionEmpleado.setText("Nuevo");
		this.jButtonModificarDefiProvisionEmpleado.setText("Editar");
        this.jButtonActualizarDefiProvisionEmpleado.setText("Actualizar");
        this.jButtonEliminarDefiProvisionEmpleado.setText("Eliminar");
        this.jButtonCancelarDefiProvisionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosDefiProvisionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarDefiProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDefiProvisionEmpleado,"nuevo_button","Nuevo",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDefiProvisionEmpleado,"modificar_button","Editar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDefiProvisionEmpleado,"actualizar_button","Actualizar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDefiProvisionEmpleado,"eliminar_button","Eliminar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDefiProvisionEmpleado,"cancelar_button","Cancelar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDefiProvisionEmpleado,"guardarcambios_button","Guardar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDefiProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDefiProvisionEmpleado,"cerrar_button","Salir",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDefiProvisionEmpleado.setToolTipText("Nuevo"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDefiProvisionEmpleado.setToolTipText("Editar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDefiProvisionEmpleado.setToolTipText("Actualizar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDefiProvisionEmpleado.setToolTipText("Eliminar)"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDefiProvisionEmpleado.setToolTipText("Cancelar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDefiProvisionEmpleado.setToolTipText("Guardar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setToolTipText("Guardar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDefiProvisionEmpleado.setToolTipText("Salir"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDefiProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDefiProvisionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDefiProvisionEmpleado";
		inputMap = this.jButtonActualizarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDefiProvisionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarDefiProvisionEmpleado";
		inputMap = this.jButtonEliminarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDefiProvisionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarDefiProvisionEmpleado";
		inputMap = this.jButtonCancelarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDefiProvisionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarDefiProvisionEmpleado";
		inputMap = this.jButtonCerrarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDefiProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDefiProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDefiProvisionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDefiProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDefiProvisionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDefiProvisionEmpleado.setToolTipText("Nuevo DefiProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado.setToolTipText("Sin Cerrar Ventana DefiProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDefiProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesDefiProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDefiProvisionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDefiProvisionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDefiProvisionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDefiProvisionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDefiProvisionEmpleado = new GridBagLayout();
		
		this.jPanelCamposDefiProvisionEmpleado.setLayout(gridaBagLayoutCamposDefiProvisionEmpleado);
		this.jPanelCamposOcultosDefiProvisionEmpleado.setLayout(gridaBagLayoutCamposOcultosDefiProvisionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDefiProvisionEmpleado.add(jLabelIdDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDefiProvisionEmpleado.add(jLabelidDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDefiProvisionEmpleado.add(jLabelid_empresaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDefiProvisionEmpleado.add(jButtonid_empresaDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDefiProvisionEmpleado.add(jButtonid_empresaDefiProvisionEmpleadoUpdate, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDefiProvisionEmpleado.add(jComboBoxid_empresaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaDefiProvisionEmpleado.add(jLabelid_rubro_empleaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaDefiProvisionEmpleado.add(jButtonid_rubro_empleaDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaDefiProvisionEmpleado.add(jButtonid_rubro_empleaDefiProvisionEmpleadoUpdate, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaDefiProvisionEmpleado.add(jComboBoxid_rubro_empleaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoDefiProvisionEmpleado.add(jLabelid_formatoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoDefiProvisionEmpleado.add(jButtonid_formatoDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoDefiProvisionEmpleado.add(jButtonid_formatoDefiProvisionEmpleadoUpdate, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoDefiProvisionEmpleado.add(jComboBoxid_formatoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDefiProvisionEmpleado.add(jLabelnombreDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDefiProvisionEmpleado.add(jButtonnombreDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDefiProvisionEmpleado.add(jscrollPanenombreDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_inicialDefiProvisionEmpleado.add(jLabeldia_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_inicialDefiProvisionEmpleado.add(jButtondia_inicialDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_inicialDefiProvisionEmpleado.add(jTextFielddia_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_inicialDefiProvisionEmpleado.add(jLabelid_mes_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicialDefiProvisionEmpleado.add(jButtonid_mes_inicialDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_inicialDefiProvisionEmpleado.add(jButtonid_mes_inicialDefiProvisionEmpleadoUpdate, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_inicialDefiProvisionEmpleado.add(jComboBoxid_mes_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_finalDefiProvisionEmpleado.add(jLabeldia_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_finalDefiProvisionEmpleado.add(jButtondia_finalDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_finalDefiProvisionEmpleado.add(jTextFielddia_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mes_finalDefiProvisionEmpleado.add(jLabelid_mes_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finalDefiProvisionEmpleado.add(jButtonid_mes_finalDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 3;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mes_finalDefiProvisionEmpleado.add(jButtonid_mes_finalDefiProvisionEmpleadoUpdate, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mes_finalDefiProvisionEmpleado.add(jComboBoxid_mes_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_liquidacionDefiProvisionEmpleado.add(jLabelpara_liquidacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_liquidacionDefiProvisionEmpleado.add(jButtonpara_liquidacionDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_liquidacionDefiProvisionEmpleado.add(jCheckBoxpara_liquidacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDefiProvisionEmpleado.add(jLabeldescripcionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDefiProvisionEmpleado.add(jButtondescripcionDefiProvisionEmpleadoBusqueda, this.gridBagConstraintsDefiProvisionEmpleado);
	}

	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDefiProvisionEmpleado.add(jscrollPanedescripcionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelidDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelid_rubro_empleaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelid_formatoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelnombreDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPaneldia_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelid_mes_inicialDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPaneldia_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelid_mes_finalDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPanelpara_liquidacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDefiProvisionEmpleado.add(this.jPaneldescripcionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposDefiProvisionEmpleado % 1==0) {
		iXPanelCamposDefiProvisionEmpleado=0;
		iYPanelCamposDefiProvisionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefiProvisionEmpleado.gridy = iYPanelCamposOcultosDefiProvisionEmpleado;
	this.gridBagConstraintsDefiProvisionEmpleado.gridx = iXPanelCamposOcultosDefiProvisionEmpleado++;
	this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefiProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDefiProvisionEmpleado.add(this.jPanelid_empresaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);



	if(iXPanelCamposOcultosDefiProvisionEmpleado % 1==0) {
		iXPanelCamposOcultosDefiProvisionEmpleado=0;
		iYPanelCamposOcultosDefiProvisionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesDefiProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesDefiProvisionEmpleado.setLayout(gridaBagLayoutAccionesDefiProvisionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDefiProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioDefiProvisionEmpleado.setLayout(gridaBagLayoutAccionesFormularioDefiProvisionEmpleado);
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDefiProvisionEmpleado.add(this.jComboBoxTiposAccionesFormularioDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDefiProvisionEmpleado.add(this.jCheckBoxPostAccionNuevoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDefiProvisionEmpleado.add(this.jCheckBoxPostAccionSinCerrarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.defiprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDefiProvisionEmpleado.add(this.jCheckBoxPostAccionSinMensajeDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonModificarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);							

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonEliminarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonActualizarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);


		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonGuardarCambiosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);	
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonCancelarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDefiProvisionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsDefiProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =0;
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDefiProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDefiProvisionEmpleado = new DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Defi Provision Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Defi Provision Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Defi Provision Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DefiProvisionEmpleadoModel defiprovisionempleadoModel=new DefiProvisionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//DefiProvisionEmpleadoModel.DefiProvisionEmpleadoFocusTraversalPolicy defiprovisionempleadoFocusTraversalPolicy = defiprovisionempleadoModel.new DefiProvisionEmpleadoFocusTraversalPolicy(this);
			
			//defiprovisionempleadoFocusTraversalPolicy.setdefiprovisionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(defiprovisionempleadoModel);
			
			
			this.jContentPaneDetalleDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDefiProvisionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleDefiProvisionEmpleado.setLayout(gridaBagLayoutDetalleDefiProvisionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDefiProvisionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleDefiProvisionEmpleado.add(jTtoolBarDetalleDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado=   new JScrollPane(jContentPaneDetalleDefiProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleDefiProvisionEmpleado.add(jPanelCamposDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);
			
			
			
			
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
						&& defiprovisionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuota(this.puedeCargarPorParteCuota,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(this.puedeCargarPorParteProvisionEmpleado,false,-1);
					
					if(this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDefiProvisionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
						this.jContentPaneDetalleDefiProvisionEmpleado.add(this.jTabbedPaneRelacionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDefiProvisionEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuota(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDefiProvisionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsDefiProvisionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleDefiProvisionEmpleado.add(jPanelCamposOcultosDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);
				
					this.jPanelCamposOcultosDefiProvisionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	        this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDefiProvisionEmpleado.add(this.jPanelAccionesFormularioDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);							
			
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleDefiProvisionEmpleado.add(this.jPanelAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDefiProvisionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado=   new JScrollPane(this.jPanelCamposDefiProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDefiProvisionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDefiProvisionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionDefiProvisionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuota(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuotaSessionBean=new CuotaSessionBean();
		this.cuotaSessionBean.setConGuardarRelaciones(false);
		this.cuotaSessionBean.setEsGuardarRelacionado(true);

		this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuotaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {

				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuotaSessionBean.setEsGuardarRelacionado(true);

				this.cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuotaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuotaBeanSwingJInternalFrame.setcuotaSessionBean(this.cuotaSessionBean);

				//this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
				//this.jContentPaneDetalleDefiProvisionEmpleado.add(this.cuotaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDefiProvisionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.add("Cuotas",this.cuotaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.setComponentAt(iIndexTab,this.cuotaBeanSwingJInternalFrame.getContentPane());
				}

				//CuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuotaSessionBean.setEsGuardarRelacionado(false);
				this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuota) {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.add("Cuotas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		this.provisionempleadoSessionBean.setConGuardarRelaciones(false);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.provisionempleadoBeanSwingJInternalFramePopup=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.provisionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {

				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.provisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.provisionempleadoBeanSwingJInternalFrame.setprovisionempleadoSessionBean(this.provisionempleadoSessionBean);

				//this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
				//this.jContentPaneDetalleDefiProvisionEmpleado.add(this.provisionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDefiProvisionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.add("Provision Empleados",this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.setComponentAt(iIndexTab,this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProvisionEmpleado) {
					this.jTabbedPaneRelacionesDefiProvisionEmpleado.add("Provision Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProvisionEmpleadoBeanSwingJInternalFrame(List<DefiProvisionEmpleado> defiprovisionempleados,DefiProvisionEmpleado defiprovisionempleado,ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					provisionempleadoBeanSwingJInternalFrame.getProvisionEmpleadoLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

					provisionempleadoBeanSwingJInternalFrame.setdefiprovisionempleadosForeignKey(defiprovisionempleados);
					provisionempleadoBeanSwingJInternalFrame.setdefiprovisionempleadoForeignKey(defiprovisionempleado);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setlidDefiProvisionEmpleadoActual(defiprovisionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					provisionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyProvisionEmpleado(provisionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					provisionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDefiProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(defiprovisionempleado.getId());

					if(!this.conCargarFormDetalle) {
						provisionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					provisionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameDefiProvisionEmpleadoForeignKey(defiprovisionempleado,1,false,true,true);
					provisionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					provisionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDefiProvisionEmpleado");
					provisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDefiProvisionEmpleado");
					provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProvisionEmpleado("n",provisionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, provisionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					provisionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					provisionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("relacionado");
					} else {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("no_relacionado");
					}

					provisionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionProvisionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuotaBeanSwingJInternalFrame(List<DefiProvisionEmpleado> defiprovisionempleados,DefiProvisionEmpleado defiprovisionempleado,CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuotaBeanSwingJInternalFrame.getCuotaLogic().setConnexion(this.defiprovisionempleadoLogic.getConnexion());

					cuotaBeanSwingJInternalFrame.setdefiprovisionempleadosForeignKey(defiprovisionempleados);
					cuotaBeanSwingJInternalFrame.setdefiprovisionempleadoForeignKey(defiprovisionempleado);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado(true);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setlidDefiProvisionEmpleadoActual(defiprovisionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuotaBeanSwingJInternalFrame.cargarCombosForeignKeyCuota(cuotaBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuotaBeanSwingJInternalFrame.setVisibilidadBusquedasParaDefiProvisionEmpleado(true);
					cuotaBeanSwingJInternalFrame.setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(defiprovisionempleado.getId());

					if(!this.conCargarFormDetalle) {
						cuotaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuotaBeanSwingJInternalFrame.setSelectedItemCombosFrameDefiProvisionEmpleadoForeignKey(defiprovisionempleado,1,false,true,true);
					cuotaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuotaBeanSwingJInternalFrame.procesarBusqueda("FK_IdDefiProvisionEmpleado");
					cuotaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDefiProvisionEmpleado");
					cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(true);
					cuotaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuota("n",cuotaBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuotaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuotaBeanSwingJInternalFrame.setAutoscrolls(true);
					cuotaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("relacionado");
					} else {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");
					}

					cuotaBeanSwingJInternalFrame.getjButtonRecargarInformacionCuota().setVisible(false);

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
