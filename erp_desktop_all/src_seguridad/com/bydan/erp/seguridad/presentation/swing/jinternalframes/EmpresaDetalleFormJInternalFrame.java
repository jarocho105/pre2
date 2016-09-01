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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.EmpresaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class EmpresaDetalleFormJInternalFrame extends EmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpresa;
	
	protected JMenuBar jmenuBarDetalleEmpresa;
	
	protected JMenu jmenuDetalleEmpresa;
	protected JMenu jmenuDetalleArchivoEmpresa;
	protected JMenu jmenuDetalleAccionesEmpresa;
	protected JMenu jmenuDetalleDatosEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpresa;	
	protected GridBagConstraints gridBagConstraintsEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempresa="";
	
	public EmpresaSessionBean empresaSessionBean;
	
	

	public SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame=null;
	public SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSucursal=false;
	public SucursalSessionBean sucursalSessionBean;
	
	
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public TipoEmpresaSessionBean tipoempresaSessionBean;	
	
	public EmpresaLogic empresaLogic;
	
	public JScrollPane jScrollPanelDatosEmpresa;
	public JScrollPane jScrollPanelDatosEdicionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralEmpresa;
	
	protected JPanel jPanelCamposEmpresa;    
	protected JPanel jPanelCamposOcultosEmpresa;    	
	protected JPanel jPanelAccionesEmpresa;
	protected JPanel jPanelAccionesFormularioEmpresa;
    
	
	
	protected Integer iXPanelCamposEmpresa=0;
	protected Integer iYPanelCamposEmpresa=0;
	
	protected Integer iXPanelCamposOcultosEmpresa=0;
	protected Integer iYPanelCamposOcultosEmpresa=0;
	
	

	protected JPanel jPanelCamposIniciogeneralEmpresa;
	protected Integer iXPanelCamposIniciogeneralEmpresa=0;
	protected Integer iYPanelCamposIniciogeneralEmpresa=0;

	protected JPanel jPanelCamposIniciocontadorEmpresa;
	protected Integer iXPanelCamposIniciocontadorEmpresa=0;
	protected Integer iYPanelCamposIniciocontadorEmpresa=0;

	protected JPanel jPanelCamposIniciorepresentanteEmpresa;
	protected Integer iXPanelCamposIniciorepresentanteEmpresa=0;
	protected Integer iYPanelCamposIniciorepresentanteEmpresa=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpresa;
	public JButton jButtonModificarEmpresa;
	public JButton jButtonActualizarEmpresa;
    public JButton jButtonEliminarEmpresa;
	public JButton jButtonCancelarEmpresa;
    public JButton jButtonGuardarCambiosEmpresa;
	public JButton jButtonGuardarCambiosTablaEmpresa;
	protected JButton jButtonCerrarEmpresa;
	
	
	protected JButton jButtonProcesarInformacionEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpresa;
	protected JButton jButtonModificarToolBarEmpresa;
	protected JButton jButtonActualizarToolBarEmpresa;
    protected JButton jButtonEliminarToolBarEmpresa;
	protected JButton jButtonCancelarToolBarEmpresa;
    protected JButton jButtonGuardarCambiosToolBarEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpresa;
	protected JButton jButtonCerrarToolBarEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpresa;
	protected JMenuItem jMenuItemModificarEmpresa;
	protected JMenuItem jMenuItemActualizarEmpresa;
    protected JMenuItem jMenuItemEliminarEmpresa;
	protected JMenuItem jMenuItemCancelarEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpresa;
	protected JMenuItem jMenuItemCerrarEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpresa;
	public JLabel jLabelIdEmpresa;
	public JLabel jLabelidEmpresa;
	public JButton jButtonidEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEmpresa;
	public JLabel jLabelnombreEmpresa;
	public JTextArea jTextAreanombreEmpresa;
	public JScrollPane jscrollPanenombreEmpresa;
	public JButton jButtonnombreEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionEmpresa;
	public JLabel jLabeldireccionEmpresa;
	public JTextArea jTextAreadireccionEmpresa;
	public JScrollPane jscrollPanedireccionEmpresa;
	public JButton jButtondireccionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelrucEmpresa;
	public JLabel jLabelrucEmpresa;
	public JTextField jTextFieldrucEmpresa;
	public JButton jButtonrucEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelmailEmpresa;
	public JLabel jLabelmailEmpresa;
	public JTextArea jTextAreamailEmpresa;
	public JScrollPane jscrollPanemailEmpresa;
	public JButton jButtonmailEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoEmpresa;
	public JLabel jLabeltelefonoEmpresa;
	public JTextField jTextFieldtelefonoEmpresa;
	public JButton jButtontelefonoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelfaxEmpresa;
	public JLabel jLabelfaxEmpresa;
	public JTextField jTextFieldfaxEmpresa;
	public JButton jButtonfaxEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_postalEmpresa;
	public JLabel jLabelcodigo_postalEmpresa;
	public JTextField jTextFieldcodigo_postalEmpresa;
	public JButton jButtoncodigo_postalEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelivaEmpresa;
	public JLabel jLabelivaEmpresa;
	public JTextField jTextFieldivaEmpresa;
	public JButton jButtonivaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelactividad_principalEmpresa;
	public JLabel jLabelactividad_principalEmpresa;
	public JTextArea jTextAreaactividad_principalEmpresa;
	public JScrollPane jscrollPaneactividad_principalEmpresa;
	public JButton jButtonactividad_principalEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelactividad_secundariaEmpresa;
	public JLabel jLabelactividad_secundariaEmpresa;
	public JTextArea jTextAreaactividad_secundariaEmpresa;
	public JScrollPane jscrollPaneactividad_secundariaEmpresa;
	public JButton jButtonactividad_secundariaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcontador_nombreEmpresa;
	public JLabel jLabelcontador_nombreEmpresa;
	public JTextArea jTextAreacontador_nombreEmpresa;
	public JScrollPane jscrollPanecontador_nombreEmpresa;
	public JButton jButtoncontador_nombreEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcontador_rucEmpresa;
	public JLabel jLabelcontador_rucEmpresa;
	public JTextField jTextFieldcontador_rucEmpresa;
	public JButton jButtoncontador_rucEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcontador_licenciaEmpresa;
	public JLabel jLabelcontador_licenciaEmpresa;
	public JTextField jTextFieldcontador_licenciaEmpresa;
	public JButton jButtoncontador_licenciaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelrepresentante_nombreEmpresa;
	public JLabel jLabelrepresentante_nombreEmpresa;
	public JTextArea jTextArearepresentante_nombreEmpresa;
	public JScrollPane jscrollPanerepresentante_nombreEmpresa;
	public JButton jButtonrepresentante_nombreEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelrepresentante_cedulaEmpresa;
	public JLabel jLabelrepresentante_cedulaEmpresa;
	public JTextField jTextFieldrepresentante_cedulaEmpresa;
	public JButton jButtonrepresentante_cedulaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisEmpresa;
	public JLabel jLabelid_paisEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisEmpresa;
	public JButton jButtonid_paisEmpresa= new JButtonMe();
	public JButton jButtonid_paisEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_paisEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadEmpresa;
	public JLabel jLabelid_ciudadEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadEmpresa;
	public JButton jButtonid_ciudadEmpresa= new JButtonMe();
	public JButton jButtonid_ciudadEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_empresaEmpresa;
	public JLabel jLabelid_tipo_empresaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_empresaEmpresa;
	public JButton jButtonid_tipo_empresaEmpresa= new JButtonMe();
	public JButton jButtonid_tipo_empresaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_empresaEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpresa;
	
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
	public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpresa=new JPanel();
				this.jPanelAccionesFormularioEmpresa=new JPanel();
				this.jmenuBarDetalleEmpresa=new JMenuBar();
				this.jTtoolBarDetalleEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpresa() {
		return this.jButtonActualizarToolBarEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarEmpresa() {
		return this.jButtonEliminarToolBarEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarEmpresa() {
		return this.jButtonCancelarToolBarEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionEmpresa() {
		return this.jButtonProcesarInformacionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpresa)	{
		this.jButtonProcesarInformacionEmpresa = jButtonProcesarInformacionEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpresa() {
		return this.jComboBoxTiposAccionesEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpresa(
			JComboBox jComboBoxTiposRelacionesEmpresa) {
		this.jComboBoxTiposRelacionesEmpresa = jComboBoxTiposRelacionesEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpresa(
			JComboBox jComboBoxTiposAccionesEmpresa) {
		this.jComboBoxTiposAccionesEmpresa = jComboBoxTiposAccionesEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpresa() {
		return this.jComboBoxTiposAccionesFormularioEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioEmpresa) {
		this.jComboBoxTiposAccionesFormularioEmpresa = jComboBoxTiposAccionesFormularioEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empresaSessionBean=new EmpresaSessionBean();
		
		this.empresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.sucursalSessionBean=new SucursalSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpresa=new JButtonMe();
				this.jButtonModificarToolBarEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpresa,this.jTtoolBarDetalleEmpresa,
							"actualizar","actualizar","Actualizar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpresa,this.jTtoolBarDetalleEmpresa,
							"eliminar","eliminar","Eliminar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpresa,this.jTtoolBarDetalleEmpresa,
							"cancelar","cancelar","Cancelar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpresa,this.jTtoolBarDetalleEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpresa.add(this.jMenuItemDetalleCerrarEmpresa);
		
		this.jmenuDetalleAccionesEmpresa.add(this.jMenuItemActualizarEmpresa);
		this.jmenuDetalleAccionesEmpresa.add(this.jMenuItemEliminarEmpresa);
		this.jmenuDetalleAccionesEmpresa.add(this.jMenuItemCancelarEmpresa);		
		
		//this.jmenuDetalleDatosEmpresa.add(this.jMenuItemDetalleAbrirOrderByEmpresa);				
		this.jmenuDetalleDatosEmpresa.add(this.jMenuItemDetalleMostarOcultarEmpresa);				
				
		//this.jmenuDetalleAccionesEmpresa.add(this.jMenuItemGuardarCambiosEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpresa.add(this.jmenuDetalleArchivoEmpresa);		
		this.jmenuBarDetalleEmpresa.add(this.jmenuDetalleAccionesEmpresa);		
		this.jmenuBarDetalleEmpresa.add(this.jmenuDetalleDatosEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEmpresa.add(this.jmenuDetalleEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpresa);				
	}
	
	
	public void inicializarElementosCamposEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpresa = new JLabelMe();
		jLabelIdEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpresa= new GridBagLayout();

		this.jPanelidEmpresa.setLayout(this.gridaBagLayoutEmpresa);

		jLabelidEmpresa = new JLabel();
		jLabelidEmpresa.setText("Id");

		jLabelidEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEmpresa = new JLabelMe();
		this.jLabelnombreEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEmpresa.setToolTipText("Nombre");
		this.jLabelnombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelnombreEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreanombreEmpresa= new JTextAreaMe();
		jTextAreanombreEmpresa.setEnabled(false);
		jTextAreanombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpresa.setLineWrap(true);
		jTextAreanombreEmpresa.setWrapStyleWord(true);
		jTextAreanombreEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEmpresa = new JScrollPane(jTextAreanombreEmpresa);
		jscrollPanenombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEmpresaBusqueda.setText("U");
		this.jButtonnombreEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionEmpresa = new JLabelMe();
		this.jLabeldireccionEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionEmpresa.setToolTipText("Direccion");
		this.jLabeldireccionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPaneldireccionEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreadireccionEmpresa= new JTextAreaMe();
		jTextAreadireccionEmpresa.setEnabled(false);
		jTextAreadireccionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpresa.setLineWrap(true);
		jTextAreadireccionEmpresa.setWrapStyleWord(true);
		jTextAreadireccionEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionEmpresa.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionEmpresa = new JScrollPane(jTextAreadireccionEmpresa);
		jscrollPanedireccionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionEmpresaBusqueda= new JButtonMe();
		this.jButtondireccionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionEmpresaBusqueda.setText("U");
		this.jButtondireccionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelrucEmpresa = new JLabelMe();
		this.jLabelrucEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucEmpresa.setToolTipText("Ruc");
		this.jLabelrucEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelrucEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldrucEmpresa= new JTextFieldMe();

		jTextFieldrucEmpresa.setEnabled(false);
		jTextFieldrucEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucEmpresaBusqueda= new JButtonMe();
		this.jButtonrucEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucEmpresaBusqueda.setText("U");
		this.jButtonrucEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelmailEmpresa = new JLabelMe();
		this.jLabelmailEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_MAIL+" : *");
		this.jLabelmailEmpresa.setToolTipText("Mail");
		this.jLabelmailEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmailEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmailEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmailEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_MAIL);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelmailEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreamailEmpresa= new JTextAreaMe();
		jTextAreamailEmpresa.setEnabled(false);
		jTextAreamailEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpresa.setLineWrap(true);
		jTextAreamailEmpresa.setWrapStyleWord(true);
		jTextAreamailEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamailEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamailEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemailEmpresa = new JScrollPane(jTextAreamailEmpresa);
		jscrollPanemailEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmailEmpresaBusqueda= new JButtonMe();
		this.jButtonmailEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmailEmpresaBusqueda.setText("U");
		this.jButtonmailEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmailEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmailEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamailEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamailEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mailEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmailEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoEmpresa = new JLabelMe();
		this.jLabeltelefonoEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoEmpresa.setToolTipText("Telefono");
		this.jLabeltelefonoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPaneltelefonoEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldtelefonoEmpresa= new JTextFieldMe();

		jTextFieldtelefonoEmpresa.setEnabled(false);
		jTextFieldtelefonoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoEmpresaBusqueda= new JButtonMe();
		this.jButtontelefonoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoEmpresaBusqueda.setText("U");
		this.jButtontelefonoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelfaxEmpresa = new JLabelMe();
		this.jLabelfaxEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_FAX+" :");
		this.jLabelfaxEmpresa.setToolTipText("Fax");
		this.jLabelfaxEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfaxEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfaxEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfaxEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_FAX);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelfaxEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldfaxEmpresa= new JTextFieldMe();

		jTextFieldfaxEmpresa.setEnabled(false);
		jTextFieldfaxEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfaxEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfaxEmpresaBusqueda= new JButtonMe();
		this.jButtonfaxEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfaxEmpresaBusqueda.setText("U");
		this.jButtonfaxEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfaxEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfaxEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfaxEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfaxEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"faxEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfaxEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_postalEmpresa = new JLabelMe();
		this.jLabelcodigo_postalEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL+" :");
		this.jLabelcodigo_postalEmpresa.setToolTipText("Codigo Postal");
		this.jLabelcodigo_postalEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_postalEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_postalEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_postalEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_postalEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_postalEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelcodigo_postalEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldcodigo_postalEmpresa= new JTextFieldMe();

		jTextFieldcodigo_postalEmpresa.setEnabled(false);
		jTextFieldcodigo_postalEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_postalEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_postalEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_postalEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_postalEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigo_postalEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_postalEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_postalEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_postalEmpresaBusqueda.setText("U");
		this.jButtoncodigo_postalEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_postalEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_postalEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_postalEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_postalEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_postalEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_postalEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelivaEmpresa = new JLabelMe();
		this.jLabelivaEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaEmpresa.setToolTipText("Iva");
		this.jLabelivaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelivaEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldivaEmpresa= new JTextFieldMe();
		jTextFieldivaEmpresa.setEnabled(false);
		jTextFieldivaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaEmpresa.setText("0.0");

		this.jButtonivaEmpresaBusqueda= new JButtonMe();
		this.jButtonivaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaEmpresaBusqueda.setText("U");
		this.jButtonivaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelactividad_principalEmpresa = new JLabelMe();
		this.jLabelactividad_principalEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL+" : *");
		this.jLabelactividad_principalEmpresa.setToolTipText("Actividad Principal");
		this.jLabelactividad_principalEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelactividad_principalEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelactividad_principalEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelactividad_principalEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactividad_principalEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactividad_principalEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelactividad_principalEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreaactividad_principalEmpresa= new JTextAreaMe();
		jTextAreaactividad_principalEmpresa.setEnabled(false);
		jTextAreaactividad_principalEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_principalEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_principalEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_principalEmpresa.setLineWrap(true);
		jTextAreaactividad_principalEmpresa.setWrapStyleWord(true);
		jTextAreaactividad_principalEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaactividad_principalEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaactividad_principalEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneactividad_principalEmpresa = new JScrollPane(jTextAreaactividad_principalEmpresa);
		jscrollPaneactividad_principalEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividad_principalEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividad_principalEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonactividad_principalEmpresaBusqueda= new JButtonMe();
		this.jButtonactividad_principalEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividad_principalEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividad_principalEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactividad_principalEmpresaBusqueda.setText("U");
		this.jButtonactividad_principalEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactividad_principalEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactividad_principalEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaactividad_principalEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaactividad_principalEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"actividad_principalEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactividad_principalEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelactividad_secundariaEmpresa = new JLabelMe();
		this.jLabelactividad_secundariaEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA+" :");
		this.jLabelactividad_secundariaEmpresa.setToolTipText("Actividad Secundaria");
		this.jLabelactividad_secundariaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelactividad_secundariaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelactividad_secundariaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelactividad_secundariaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactividad_secundariaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactividad_secundariaEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelactividad_secundariaEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreaactividad_secundariaEmpresa= new JTextAreaMe();
		jTextAreaactividad_secundariaEmpresa.setEnabled(false);
		jTextAreaactividad_secundariaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_secundariaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_secundariaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactividad_secundariaEmpresa.setLineWrap(true);
		jTextAreaactividad_secundariaEmpresa.setWrapStyleWord(true);
		jTextAreaactividad_secundariaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaactividad_secundariaEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaactividad_secundariaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneactividad_secundariaEmpresa = new JScrollPane(jTextAreaactividad_secundariaEmpresa);
		jscrollPaneactividad_secundariaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividad_secundariaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactividad_secundariaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonactividad_secundariaEmpresaBusqueda= new JButtonMe();
		this.jButtonactividad_secundariaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividad_secundariaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactividad_secundariaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactividad_secundariaEmpresaBusqueda.setText("U");
		this.jButtonactividad_secundariaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactividad_secundariaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactividad_secundariaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaactividad_secundariaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaactividad_secundariaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"actividad_secundariaEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactividad_secundariaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcontador_nombreEmpresa = new JLabelMe();
		this.jLabelcontador_nombreEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE+" : *");
		this.jLabelcontador_nombreEmpresa.setToolTipText("Nombre.");
		this.jLabelcontador_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontador_nombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontador_nombreEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontador_nombreEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelcontador_nombreEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextAreacontador_nombreEmpresa= new JTextAreaMe();
		jTextAreacontador_nombreEmpresa.setEnabled(false);
		jTextAreacontador_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontador_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontador_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontador_nombreEmpresa.setLineWrap(true);
		jTextAreacontador_nombreEmpresa.setWrapStyleWord(true);
		jTextAreacontador_nombreEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacontador_nombreEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacontador_nombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecontador_nombreEmpresa = new JScrollPane(jTextAreacontador_nombreEmpresa);
		jscrollPanecontador_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontador_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontador_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncontador_nombreEmpresaBusqueda= new JButtonMe();
		this.jButtoncontador_nombreEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_nombreEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_nombreEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontador_nombreEmpresaBusqueda.setText("U");
		this.jButtoncontador_nombreEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontador_nombreEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontador_nombreEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacontador_nombreEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacontador_nombreEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contador_nombreEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontador_nombreEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcontador_rucEmpresa = new JLabelMe();
		this.jLabelcontador_rucEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_CONTADORRUC+" : *");
		this.jLabelcontador_rucEmpresa.setToolTipText("Ruc.");
		this.jLabelcontador_rucEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_rucEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_rucEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontador_rucEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontador_rucEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontador_rucEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_CONTADORRUC);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelcontador_rucEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldcontador_rucEmpresa= new JTextFieldMe();

		jTextFieldcontador_rucEmpresa.setEnabled(false);
		jTextFieldcontador_rucEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontador_rucEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontador_rucEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcontador_rucEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncontador_rucEmpresaBusqueda= new JButtonMe();
		this.jButtoncontador_rucEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_rucEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_rucEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontador_rucEmpresaBusqueda.setText("U");
		this.jButtoncontador_rucEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontador_rucEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontador_rucEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcontador_rucEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcontador_rucEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contador_rucEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontador_rucEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcontador_licenciaEmpresa = new JLabelMe();
		this.jLabelcontador_licenciaEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA+" : *");
		this.jLabelcontador_licenciaEmpresa.setToolTipText("Licencia");
		this.jLabelcontador_licenciaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_licenciaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontador_licenciaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontador_licenciaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontador_licenciaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontador_licenciaEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelcontador_licenciaEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldcontador_licenciaEmpresa= new JTextFieldMe();

		jTextFieldcontador_licenciaEmpresa.setEnabled(false);
		jTextFieldcontador_licenciaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontador_licenciaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcontador_licenciaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcontador_licenciaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncontador_licenciaEmpresaBusqueda= new JButtonMe();
		this.jButtoncontador_licenciaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_licenciaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontador_licenciaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontador_licenciaEmpresaBusqueda.setText("U");
		this.jButtoncontador_licenciaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontador_licenciaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontador_licenciaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcontador_licenciaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcontador_licenciaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contador_licenciaEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontador_licenciaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelrepresentante_nombreEmpresa = new JLabelMe();
		this.jLabelrepresentante_nombreEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE+" : *");
		this.jLabelrepresentante_nombreEmpresa.setToolTipText("Nombre .");
		this.jLabelrepresentante_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentante_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentante_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentante_nombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentante_nombreEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentante_nombreEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelrepresentante_nombreEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextArearepresentante_nombreEmpresa= new JTextAreaMe();
		jTextArearepresentante_nombreEmpresa.setEnabled(false);
		jTextArearepresentante_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreEmpresa.setLineWrap(true);
		jTextArearepresentante_nombreEmpresa.setWrapStyleWord(true);
		jTextArearepresentante_nombreEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentante_nombreEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearepresentante_nombreEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentante_nombreEmpresa = new JScrollPane(jTextArearepresentante_nombreEmpresa);
		jscrollPanerepresentante_nombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentante_nombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentante_nombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrepresentante_nombreEmpresaBusqueda= new JButtonMe();
		this.jButtonrepresentante_nombreEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_nombreEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_nombreEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentante_nombreEmpresaBusqueda.setText("U");
		this.jButtonrepresentante_nombreEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentante_nombreEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentante_nombreEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentante_nombreEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentante_nombreEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representante_nombreEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentante_nombreEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelrepresentante_cedulaEmpresa = new JLabelMe();
		this.jLabelrepresentante_cedulaEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA+" : *");
		this.jLabelrepresentante_cedulaEmpresa.setToolTipText("Cedula");
		this.jLabelrepresentante_cedulaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentante_cedulaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentante_cedulaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentante_cedulaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentante_cedulaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentante_cedulaEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelrepresentante_cedulaEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jTextFieldrepresentante_cedulaEmpresa= new JTextFieldMe();

		jTextFieldrepresentante_cedulaEmpresa.setEnabled(false);
		jTextFieldrepresentante_cedulaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrepresentante_cedulaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrepresentante_cedulaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrepresentante_cedulaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrepresentante_cedulaEmpresaBusqueda= new JButtonMe();
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentante_cedulaEmpresaBusqueda.setText("U");
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentante_cedulaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrepresentante_cedulaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrepresentante_cedulaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representante_cedulaEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentante_cedulaEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisEmpresa = new JLabelMe();
		this.jLabelid_paisEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisEmpresa.setToolTipText("Pais");
		this.jLabelid_paisEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelid_paisEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jComboBoxid_paisEmpresa= new JComboBoxMe();
		jComboBoxid_paisEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisEmpresa= new JButtonMe();
		this.jButtonid_paisEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpresa.setText("Buscar");
		this.jButtonid_paisEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpresa"));

		this.jButtonid_paisEmpresaBusqueda= new JButtonMe();
		this.jButtonid_paisEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmpresaBusqueda.setText("U");
		this.jButtonid_paisEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_paisEmpresaUpdate= new JButtonMe();
		this.jButtonid_paisEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmpresaUpdate.setText("U");
		this.jButtonid_paisEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpresaUpdate"));



					
		this.jLabelid_ciudadEmpresa = new JLabelMe();
		this.jLabelid_ciudadEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadEmpresa.setToolTipText("Ciudad");
		this.jLabelid_ciudadEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelid_ciudadEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jComboBoxid_ciudadEmpresa= new JComboBoxMe();
		jComboBoxid_ciudadEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadEmpresa= new JButtonMe();
		this.jButtonid_ciudadEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpresa.setText("Buscar");
		this.jButtonid_ciudadEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpresa"));

		this.jButtonid_ciudadEmpresaBusqueda= new JButtonMe();
		this.jButtonid_ciudadEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmpresaBusqueda.setText("U");
		this.jButtonid_ciudadEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadEmpresaUpdate= new JButtonMe();
		this.jButtonid_ciudadEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmpresaUpdate.setText("U");
		this.jButtonid_ciudadEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpresaUpdate"));



					
		this.jLabelid_tipo_empresaEmpresa = new JLabelMe();
		this.jLabelid_tipo_empresaEmpresa.setText(""+EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA+" : *");
		this.jLabelid_tipo_empresaEmpresa.setToolTipText("Tipo Empresa");
		this.jLabelid_tipo_empresaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_empresaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_empresaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_empresaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_empresaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_empresaEmpresa.setToolTipText(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA);
		this.gridaBagLayoutEmpresa = new GridBagLayout();
		this.jPanelid_tipo_empresaEmpresa.setLayout(this.gridaBagLayoutEmpresa);


		jComboBoxid_tipo_empresaEmpresa= new JComboBoxMe();
		jComboBoxid_tipo_empresaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empresaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empresaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_empresaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_empresaEmpresa= new JButtonMe();
		this.jButtonid_tipo_empresaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empresaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empresaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empresaEmpresa.setText("Buscar");
		this.jButtonid_tipo_empresaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_empresaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empresaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_empresaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empresaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empresaEmpresa"));

		this.jButtonid_tipo_empresaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_tipo_empresaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empresaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empresaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_empresaEmpresaBusqueda.setText("U");
		this.jButtonid_tipo_empresaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_empresaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empresaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_empresaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empresaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empresaEmpresaBusqueda"));

		if(this.empresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_empresaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_empresaEmpresaUpdate= new JButtonMe();
		this.jButtonid_tipo_empresaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empresaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empresaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_empresaEmpresaUpdate.setText("U");
		this.jButtonid_tipo_empresaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_empresaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empresaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_empresaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empresaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empresaEmpresaUpdate"));



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
		//this.jInternalFrameDetalleEmpresa = new EmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpresa= new GridBagLayout();
		

		
		String sToolTipEmpresa="";
		sToolTipEmpresa=EmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpresa+="(Seguridad.Empresa)";
		}
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpresa = new JButtonMe();
		this.jButtonModificarEmpresa = new JButtonMe();
        this.jButtonActualizarEmpresa = new JButtonMe();
        this.jButtonEliminarEmpresa = new JButtonMe();
        this.jButtonCancelarEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpresa = new JButtonMe();
		this.jButtonCerrarEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontadorEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorepresentanteEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Empresa";
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpresa.setName("jPanelCamposEmpresa"); 

		this.jPanelCamposOcultosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpresa.setName("jPanelCamposOcultosEmpresa"); 

        this.jPanelAccionesEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralEmpresa.setName("jPanelCamposFingeneralEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontadorEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Contador"));
		this.jPanelCamposIniciocontadorEmpresa.setName("jPanelCamposFincontadorEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontadorEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorepresentanteEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Representante"));
		this.jPanelCamposIniciorepresentanteEmpresa.setName("jPanelCamposFinrepresentanteEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorepresentanteEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpresa.setText("Nuevo");
		this.jButtonModificarEmpresa.setText("Editar");
        this.jButtonActualizarEmpresa.setText("Actualizar");
        this.jButtonEliminarEmpresa.setText("Eliminar");
        this.jButtonCancelarEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpresa.setText("Guardar");
		this.jButtonCerrarEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpresa,"nuevo_button","Nuevo",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpresa,"modificar_button","Editar",this.empresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpresa,"actualizar_button","Actualizar",this.empresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpresa,"eliminar_button","Eliminar",this.empresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpresa,"cancelar_button","Cancelar",this.empresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpresa,"guardarcambios_button","Guardar",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpresa,"guardarcambiostabla_button","Guardar",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpresa,"cerrar_button","Salir",this.empresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpresa.setToolTipText("Nuevo"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpresa.setToolTipText("Editar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpresa.setToolTipText("Actualizar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpresa.setToolTipText("Eliminar)"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpresa.setToolTipText("Cancelar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpresa.setToolTipText("Guardar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpresa.setToolTipText("Guardar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpresa.setToolTipText("Salir"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpresa";
		inputMap = this.jButtonNuevoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpresa";
		inputMap = this.jButtonActualizarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpresa";
		inputMap = this.jButtonEliminarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpresa";
		inputMap = this.jButtonCancelarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarEmpresa";
		inputMap = this.jButtonCerrarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpresa.setToolTipText("Nuevo Empresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpresa.setToolTipText("Sin Cerrar Ventana Empresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpresa = new JLabelMe();
		
		this.jLabelAccionesEmpresa.setText("Acciones");		
		this.jLabelAccionesEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpresa = new GridBagLayout();
		
		this.jPanelCamposEmpresa.setLayout(gridaBagLayoutCamposEmpresa);
		this.jPanelCamposOcultosEmpresa.setLayout(gridaBagLayoutCamposOcultosEmpresa);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralEmpresa= new GridBagLayout();
		this.jPanelCamposIniciogeneralEmpresa.setLayout(gridaBagLayoutCamposIniciogeneralEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciocontadorEmpresa= new GridBagLayout();
		this.jPanelCamposIniciocontadorEmpresa.setLayout(gridaBagLayoutCamposIniciocontadorEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciorepresentanteEmpresa= new GridBagLayout();
		this.jPanelCamposIniciorepresentanteEmpresa.setLayout(gridaBagLayoutCamposIniciorepresentanteEmpresa);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpresa.add(jLabelIdEmpresa, this.gridBagConstraintsEmpresa);



	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpresa.add(jLabelidEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisEmpresa.add(jLabelid_paisEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmpresa.add(jButtonid_paisEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 3;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmpresa.add(jButtonid_paisEmpresaUpdate, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisEmpresa.add(jComboBoxid_paisEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadEmpresa.add(jLabelid_ciudadEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmpresa.add(jButtonid_ciudadEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 3;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmpresa.add(jButtonid_ciudadEmpresaUpdate, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadEmpresa.add(jComboBoxid_ciudadEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_empresaEmpresa.add(jLabelid_tipo_empresaEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_empresaEmpresa.add(jButtonid_tipo_empresaEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 3;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_empresaEmpresa.add(jButtonid_tipo_empresaEmpresaUpdate, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_empresaEmpresa.add(jComboBoxid_tipo_empresaEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEmpresa.add(jLabelnombreEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEmpresa.add(jButtonnombreEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEmpresa.add(jscrollPanenombreEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionEmpresa.add(jLabeldireccionEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionEmpresa.add(jButtondireccionEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionEmpresa.add(jscrollPanedireccionEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucEmpresa.add(jLabelrucEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucEmpresa.add(jButtonrucEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucEmpresa.add(jTextFieldrucEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmailEmpresa.add(jLabelmailEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelmailEmpresa.add(jButtonmailEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmailEmpresa.add(jscrollPanemailEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoEmpresa.add(jLabeltelefonoEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoEmpresa.add(jButtontelefonoEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoEmpresa.add(jTextFieldtelefonoEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfaxEmpresa.add(jLabelfaxEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelfaxEmpresa.add(jButtonfaxEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfaxEmpresa.add(jTextFieldfaxEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_postalEmpresa.add(jLabelcodigo_postalEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_postalEmpresa.add(jButtoncodigo_postalEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_postalEmpresa.add(jTextFieldcodigo_postalEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaEmpresa.add(jLabelivaEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaEmpresa.add(jButtonivaEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaEmpresa.add(jTextFieldivaEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactividad_principalEmpresa.add(jLabelactividad_principalEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelactividad_principalEmpresa.add(jButtonactividad_principalEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactividad_principalEmpresa.add(jscrollPaneactividad_principalEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactividad_secundariaEmpresa.add(jLabelactividad_secundariaEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelactividad_secundariaEmpresa.add(jButtonactividad_secundariaEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactividad_secundariaEmpresa.add(jscrollPaneactividad_secundariaEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontador_nombreEmpresa.add(jLabelcontador_nombreEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontador_nombreEmpresa.add(jButtoncontador_nombreEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontador_nombreEmpresa.add(jscrollPanecontador_nombreEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontador_rucEmpresa.add(jLabelcontador_rucEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontador_rucEmpresa.add(jButtoncontador_rucEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontador_rucEmpresa.add(jTextFieldcontador_rucEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontador_licenciaEmpresa.add(jLabelcontador_licenciaEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontador_licenciaEmpresa.add(jButtoncontador_licenciaEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontador_licenciaEmpresa.add(jTextFieldcontador_licenciaEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentante_nombreEmpresa.add(jLabelrepresentante_nombreEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentante_nombreEmpresa.add(jButtonrepresentante_nombreEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentante_nombreEmpresa.add(jscrollPanerepresentante_nombreEmpresa, this.gridBagConstraintsEmpresa);


	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 0;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentante_cedulaEmpresa.add(jLabelrepresentante_cedulaEmpresa, this.gridBagConstraintsEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 2;
		this.gridBagConstraintsEmpresa.ipadx = 0;
		this.gridBagConstraintsEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentante_cedulaEmpresa.add(jButtonrepresentante_cedulaEmpresaBusqueda, this.gridBagConstraintsEmpresa);
	}

	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpresa.gridy = 0;
	this.gridBagConstraintsEmpresa.gridx = 1;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentante_cedulaEmpresa.add(jTextFieldrepresentante_cedulaEmpresa, this.gridBagConstraintsEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelidEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelid_paisEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelid_ciudadEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelid_tipo_empresaEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelnombreEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPaneldireccionEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelrucEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelmailEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPaneltelefonoEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelfaxEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelcodigo_postalEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelivaEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelactividad_principalEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciogeneralEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciogeneralEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralEmpresa.add(this.jPanelactividad_secundariaEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciogeneralEmpresa % 2==0) {
		iXPanelCamposIniciogeneralEmpresa=0;
		iYPanelCamposIniciogeneralEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciocontadorEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciocontadorEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontadorEmpresa.add(this.jPanelcontador_nombreEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciocontadorEmpresa % 2==0) {
		iXPanelCamposIniciocontadorEmpresa=0;
		iYPanelCamposIniciocontadorEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciocontadorEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciocontadorEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontadorEmpresa.add(this.jPanelcontador_rucEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciocontadorEmpresa % 2==0) {
		iXPanelCamposIniciocontadorEmpresa=0;
		iYPanelCamposIniciocontadorEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciocontadorEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciocontadorEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontadorEmpresa.add(this.jPanelcontador_licenciaEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciocontadorEmpresa % 2==0) {
		iXPanelCamposIniciocontadorEmpresa=0;
		iYPanelCamposIniciocontadorEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciorepresentanteEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciorepresentanteEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciorepresentanteEmpresa.add(this.jPanelrepresentante_nombreEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciorepresentanteEmpresa % 2==0) {
		iXPanelCamposIniciorepresentanteEmpresa=0;
		iYPanelCamposIniciorepresentanteEmpresa++;
	}
	this.gridBagConstraintsEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpresa.gridy = iYPanelCamposIniciorepresentanteEmpresa;
	this.gridBagConstraintsEmpresa.gridx = iXPanelCamposIniciorepresentanteEmpresa++;
	this.gridBagConstraintsEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciorepresentanteEmpresa.add(this.jPanelrepresentante_cedulaEmpresa, this.gridBagConstraintsEmpresa);



	if(iXPanelCamposIniciorepresentanteEmpresa % 2==0) {
		iXPanelCamposIniciorepresentanteEmpresa=0;
		iYPanelCamposIniciorepresentanteEmpresa++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesEmpresa= new GridBagLayout();
		this.jPanelAccionesEmpresa.setLayout(gridaBagLayoutAccionesEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioEmpresa.setLayout(gridaBagLayoutAccionesFormularioEmpresa);
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpresa.add(this.jComboBoxTiposAccionesFormularioEmpresa, this.gridBagConstraintsEmpresa);

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpresa.add(this.jCheckBoxPostAccionNuevoEmpresa, this.gridBagConstraintsEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpresa.add(this.jCheckBoxPostAccionSinCerrarEmpresa, this.gridBagConstraintsEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpresa.add(this.jCheckBoxPostAccionSinMensajeEmpresa, this.gridBagConstraintsEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpresa.add(this.jButtonModificarEmpresa, this.gridBagConstraintsEmpresa);							

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpresa.add(this.jButtonEliminarEmpresa, this.gridBagConstraintsEmpresa);
		
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = 0;		
		this.gridBagConstraintsEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpresa.add(this.jButtonActualizarEmpresa, this.gridBagConstraintsEmpresa);


		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = 0;		
		this.gridBagConstraintsEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpresa.add(this.jButtonGuardarCambiosEmpresa, this.gridBagConstraintsEmpresa);	
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = 0;		
		this.gridBagConstraintsEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpresa.add(this.jButtonCancelarEmpresa, this.gridBagConstraintsEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpresa.gridx = 0;		
			//this.gridBagConstraintsEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpresa.gridx =0;
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpresa, this.gridBagConstraintsEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpresa = new EmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpresaModel empresaModel=new EmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpresaModel.EmpresaFocusTraversalPolicy empresaFocusTraversalPolicy = empresaModel.new EmpresaFocusTraversalPolicy(this);
			
			//empresaFocusTraversalPolicy.setempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empresaModel);
			
			
			this.jContentPaneDetalleEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleEmpresa.setLayout(gridaBagLayoutDetalleEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleEmpresa.add(jTtoolBarDetalleEmpresa, gridBagConstraintsEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionEmpresa=   new JScrollPane(jContentPaneDetalleEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;
		this.gridBagConstraintsEmpresa.gridx = 0;

		this.jContentPaneDetalleEmpresa.add(jPanelCamposIniciogeneralEmpresa, gridBagConstraintsEmpresa);


		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;
		this.gridBagConstraintsEmpresa.gridx = 0;

		this.jContentPaneDetalleEmpresa.add(jPanelCamposIniciocontadorEmpresa, gridBagConstraintsEmpresa);


		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;
		this.gridBagConstraintsEmpresa.gridx = 0;

		this.jContentPaneDetalleEmpresa.add(jPanelCamposIniciorepresentanteEmpresa, gridBagConstraintsEmpresa);
			
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
						&& empresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameSucursal(this.puedeCargarPorParteSucursal,false,-1);
					
					if(this.empresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpresa= new GridBagConstraints();
						this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpresa.gridx = 0;
						this.jContentPaneDetalleEmpresa.add(this.jTabbedPaneRelacionesEmpresa, this.gridBagConstraintsEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameSucursal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpresa = new GridBagConstraints();
					this.gridBagConstraintsEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleEmpresa.add(jPanelCamposOcultosEmpresa, gridBagConstraintsEmpresa);
				
					this.jPanelCamposOcultosEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEmpresa.gridx = 0;
	        this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpresa.add(this.jPanelAccionesFormularioEmpresa, this.gridBagConstraintsEmpresa);							
			
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpresa.add(this.jPanelAccionesEmpresa, this.gridBagConstraintsEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpresa=   new JScrollPane(this.jPanelCamposEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpresa.gridx = 0;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpresa, this.gridBagConstraintsEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpresa, this.gridBagConstraintsEmpresa);			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpresa, this.gridBagConstraintsEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpresa, this.gridBagConstraintsEmpresa);
			
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpresa, this.gridBagConstraintsEmpresa);
		
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpresa, this.gridBagConstraintsEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameSucursal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.sucursalSessionBean=new SucursalSessionBean();
		this.sucursalSessionBean.setConGuardarRelaciones(false);
		this.sucursalSessionBean.setEsGuardarRelacionado(true);

		this.sucursalBeanSwingJInternalFrame=null;//new SucursalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.sucursalBeanSwingJInternalFramePopup=new SucursalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.sucursalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.sucursalSessionBean.getEsGuardarRelacionado()) {

				SucursalJInternalFrame.STIPO_TAMANIO_GENERAL=EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				SucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.sucursalSessionBean.setEsGuardarRelacionado(true);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.sucursalBeanSwingJInternalFrame.setsucursalSessionBean(this.sucursalSessionBean);

				//this.gridBagConstraintsEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpresa.gridx = 0;
				//this.jContentPaneDetalleEmpresa.add(this.sucursalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpresa.add("Sucursales",this.sucursalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpresa.setComponentAt(iIndexTab,this.sucursalBeanSwingJInternalFrame.getContentPane());
				}

				//SucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.sucursalSessionBean.setEsGuardarRelacionado(false);
				this.sucursalBeanSwingJInternalFrame=null;//new SucursalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSucursal) {
					this.jTabbedPaneRelacionesEmpresa.add("Sucursales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarSucursalBeanSwingJInternalFrame(List<Empresa> empresas,Empresa empresa,SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.empresaLogic.getConnexion());

					sucursalBeanSwingJInternalFrame.setempresasForeignKey(empresas);
					sucursalBeanSwingJInternalFrame.setempresaForeignKey(empresa);
					sucursalBeanSwingJInternalFrame.sucursalSessionBean.setisBusquedaDesdeForeignKeySesionEmpresa(true);
					sucursalBeanSwingJInternalFrame.sucursalSessionBean.setlidEmpresaActual(empresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					sucursalBeanSwingJInternalFrame.cargarCombosForeignKeySucursal(sucursalBeanSwingJInternalFrame.isCargarCombosDependencia);
					sucursalBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpresa(true);
					sucursalBeanSwingJInternalFrame.setid_empresaFK_IdEmpresa(empresa.getId());

					if(!this.conCargarFormDetalle) {
						sucursalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					sucursalBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpresaForeignKey(empresa,1,false,true,true);
					sucursalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					sucursalBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpresa");
					sucursalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpresa");
					sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal(true);
					sucursalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSucursal("n",sucursalBeanSwingJInternalFrame.isGuardarCambiosEnLote, sucursalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					sucursalBeanSwingJInternalFrame.setAutoscrolls(true);
					sucursalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						sucursalBeanSwingJInternalFrame.actualizarEstadoPanelsSucursal("relacionado");
					} else {
						sucursalBeanSwingJInternalFrame.actualizarEstadoPanelsSucursal("no_relacionado");
					}

					sucursalBeanSwingJInternalFrame.getjButtonRecargarInformacionSucursal().setVisible(false);

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
