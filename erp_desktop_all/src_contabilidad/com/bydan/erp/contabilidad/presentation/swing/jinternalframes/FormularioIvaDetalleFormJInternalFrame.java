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
import com.bydan.erp.contabilidad.util.FormularioIvaConstantesFunciones;

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
public class FormularioIvaDetalleFormJInternalFrame extends FormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormularioIva;
	
	protected JMenuBar jmenuBarDetalleFormularioIva;
	
	protected JMenu jmenuDetalleFormularioIva;
	protected JMenu jmenuDetalleArchivoFormularioIva;
	protected JMenu jmenuDetalleAccionesFormularioIva;
	protected JMenu jmenuDetalleDatosFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioIva;	
	protected GridBagConstraints gridBagConstraintsFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioIvaBeanSwingJInternalFrame datoformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformularioiva="";

	protected GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoparametroformularioiva="";

	protected ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroformularioiva="";
	
	public FormularioIvaSessionBean formularioivaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioIvaSessionBean datoformularioivaSessionBean;
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;	
	
	public FormularioIvaLogic formularioivaLogic;
	
	public JScrollPane jScrollPanelDatosFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralFormularioIva;
	
	protected JPanel jPanelCamposFormularioIva;    
	protected JPanel jPanelCamposOcultosFormularioIva;    	
	protected JPanel jPanelAccionesFormularioIva;
	protected JPanel jPanelAccionesFormularioFormularioIva;
    
	
	
	protected Integer iXPanelCamposFormularioIva=0;
	protected Integer iYPanelCamposFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosFormularioIva=0;
	protected Integer iYPanelCamposOcultosFormularioIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormularioIva;
	public JButton jButtonModificarFormularioIva;
	public JButton jButtonActualizarFormularioIva;
    public JButton jButtonEliminarFormularioIva;
	public JButton jButtonCancelarFormularioIva;
    public JButton jButtonGuardarCambiosFormularioIva;
	public JButton jButtonGuardarCambiosTablaFormularioIva;
	protected JButton jButtonCerrarFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioIva;
	protected JButton jButtonModificarToolBarFormularioIva;
	protected JButton jButtonActualizarToolBarFormularioIva;
    protected JButton jButtonEliminarToolBarFormularioIva;
	protected JButton jButtonCancelarToolBarFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioIva;
	protected JButton jButtonCerrarToolBarFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioIva;
	protected JMenuItem jMenuItemModificarFormularioIva;
	protected JMenuItem jMenuItemActualizarFormularioIva;
    protected JMenuItem jMenuItemEliminarFormularioIva;
	protected JMenuItem jMenuItemCancelarFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioIva;
	protected JMenuItem jMenuItemCerrarFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormularioIva;
	public JLabel jLabelIdFormularioIva;
	public JLabel jLabelidFormularioIva;
	public JButton jButtonidFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelvalorFormularioIva;
	public JLabel jLabelvalorFormularioIva;
	public JTextField jTextFieldvalorFormularioIva;
	public JButton jButtonvalorFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormularioIva;
	public JLabel jLabelid_empresaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormularioIva;
	public JButton jButtonid_empresaFormularioIva= new JButtonMe();
	public JButton jButtonid_empresaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormularioIva;
	public JLabel jLabelid_ejercicioFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormularioIva;
	public JButton jButtonid_ejercicioFormularioIva= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormularioIva;
	public JLabel jLabelid_periodoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormularioIva;
	public JButton jButtonid_periodoFormularioIva= new JButtonMe();
	public JButton jButtonid_periodoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_dato_formulario_ivaFormularioIva;
	public JLabel jLabelid_dato_formulario_ivaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_ivaFormularioIva;
	public JButton jButtonid_dato_formulario_ivaFormularioIva= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_ivaFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_parametro_formulario_ivaFormularioIva;
	public JLabel jLabelid_grupo_parametro_formulario_ivaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_parametro_formulario_ivaFormularioIva;
	public JButton jButtonid_grupo_parametro_formulario_ivaFormularioIva= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_parametro_formulario_ivaFormularioIva;
	public JLabel jLabelid_parametro_formulario_ivaFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_formulario_ivaFormularioIva;
	public JButton jButtonid_parametro_formulario_ivaFormularioIva= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_parametro_formulario_ivaFormularioIvaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormularioIva;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormularioIva=new JPanel();
				this.jPanelAccionesFormularioFormularioIva=new JPanel();
				this.jmenuBarDetalleFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormularioIva() {
		return this.jButtonActualizarToolBarFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarFormularioIva() {
		return this.jButtonEliminarToolBarFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarFormularioIva() {
		return this.jButtonCancelarToolBarFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionFormularioIva() {
		return this.jButtonProcesarInformacionFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioIva)	{
		this.jButtonProcesarInformacionFormularioIva = jButtonProcesarInformacionFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioIva(
			JComboBox jComboBoxTiposRelacionesFormularioIva) {
		this.jComboBoxTiposRelacionesFormularioIva = jComboBoxTiposRelacionesFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioIva) {
		this.jComboBoxTiposAccionesFormularioIva = jComboBoxTiposAccionesFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioFormularioIva) {
		this.jComboBoxTiposAccionesFormularioFormularioIva = jComboBoxTiposAccionesFormularioFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formularioivaSessionBean=new FormularioIvaSessionBean();
		
		this.formularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
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
	
		FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormularioIva,this.jTtoolBarDetalleFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormularioIva,this.jTtoolBarDetalleFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormularioIva,this.jTtoolBarDetalleFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormularioIva,this.jTtoolBarDetalleFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormularioIva.add(this.jMenuItemDetalleCerrarFormularioIva);
		
		this.jmenuDetalleAccionesFormularioIva.add(this.jMenuItemActualizarFormularioIva);
		this.jmenuDetalleAccionesFormularioIva.add(this.jMenuItemEliminarFormularioIva);
		this.jmenuDetalleAccionesFormularioIva.add(this.jMenuItemCancelarFormularioIva);		
		
		//this.jmenuDetalleDatosFormularioIva.add(this.jMenuItemDetalleAbrirOrderByFormularioIva);				
		this.jmenuDetalleDatosFormularioIva.add(this.jMenuItemDetalleMostarOcultarFormularioIva);				
				
		//this.jmenuDetalleAccionesFormularioIva.add(this.jMenuItemGuardarCambiosFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormularioIva.add(this.jmenuDetalleArchivoFormularioIva);		
		this.jmenuBarDetalleFormularioIva.add(this.jmenuDetalleAccionesFormularioIva);		
		this.jmenuBarDetalleFormularioIva.add(this.jmenuDetalleDatosFormularioIva);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormularioIva);				
	}
	
	
	public void inicializarElementosCamposFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormularioIva = new JLabelMe();
		jLabelIdFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormularioIva= new GridBagLayout();

		this.jPanelidFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);

		jLabelidFormularioIva = new JLabel();
		jLabelidFormularioIva.setText("Id");

		jLabelidFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorFormularioIva = new JLabelMe();
		this.jLabelvalorFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorFormularioIva.setToolTipText("Valor");
		this.jLabelvalorFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelvalorFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jTextFieldvalorFormularioIva= new JTextFieldMe();
		jTextFieldvalorFormularioIva.setEnabled(false);
		jTextFieldvalorFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorFormularioIva.setText("0.0");

		this.jButtonvalorFormularioIvaBusqueda= new JButtonMe();
		this.jButtonvalorFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorFormularioIvaBusqueda.setText("U");
		this.jButtonvalorFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormularioIva = new JLabelMe();
		this.jLabelid_empresaFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormularioIva.setToolTipText("Empresa");
		this.jLabelid_empresaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_empresaFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_empresaFormularioIva= new JComboBoxMe();
		jComboBoxid_empresaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormularioIva.setEnabled(false);

		this.jButtonid_empresaFormularioIva= new JButtonMe();
		this.jButtonid_empresaFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioIva.setText("Buscar");
		this.jButtonid_empresaFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioIva"));

		this.jButtonid_empresaFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_empresaFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioIvaBusqueda.setText("U");
		this.jButtonid_empresaFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_empresaFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioIvaUpdate.setText("U");
		this.jButtonid_empresaFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioIvaUpdate"));



					
		this.jLabelid_ejercicioFormularioIva = new JLabelMe();
		this.jLabelid_ejercicioFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormularioIva.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_ejercicioFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_ejercicioFormularioIva= new JComboBoxMe();
		jComboBoxid_ejercicioFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormularioIva.setEnabled(false);

		this.jButtonid_ejercicioFormularioIva= new JButtonMe();
		this.jButtonid_ejercicioFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioIva.setText("Buscar");
		this.jButtonid_ejercicioFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioIva"));

		this.jButtonid_ejercicioFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioIvaBusqueda.setText("U");
		this.jButtonid_ejercicioFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioIvaUpdate.setText("U");
		this.jButtonid_ejercicioFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioIvaUpdate"));



					
		this.jLabelid_periodoFormularioIva = new JLabelMe();
		this.jLabelid_periodoFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormularioIva.setToolTipText("Periodo");
		this.jLabelid_periodoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_periodoFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_periodoFormularioIva= new JComboBoxMe();
		jComboBoxid_periodoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormularioIva.setEnabled(false);

		this.jButtonid_periodoFormularioIva= new JButtonMe();
		this.jButtonid_periodoFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormularioIva.setText("Buscar");
		this.jButtonid_periodoFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioIva"));

		this.jButtonid_periodoFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_periodoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioIvaBusqueda.setText("U");
		this.jButtonid_periodoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_periodoFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormularioIvaUpdate.setText("U");
		this.jButtonid_periodoFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormularioIvaUpdate"));



					
		this.jLabelid_dato_formulario_ivaFormularioIva = new JLabelMe();
		this.jLabelid_dato_formulario_ivaFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA+" : *");
		this.jLabelid_dato_formulario_ivaFormularioIva.setToolTipText("Dato Formulario Iva");
		this.jLabelid_dato_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_dato_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_dato_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_dato_formulario_ivaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_dato_formulario_ivaFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_dato_formulario_ivaFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_dato_formulario_ivaFormularioIva= new JComboBoxMe();
		jComboBoxid_dato_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_dato_formulario_ivaFormularioIva= new JButtonMe();
		this.jButtonid_dato_formulario_ivaFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_ivaFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_ivaFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_dato_formulario_ivaFormularioIva.setText("Buscar");
		this.jButtonid_dato_formulario_ivaFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_dato_formulario_ivaFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_ivaFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_dato_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_ivaFormularioIva"));

		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setText("U");
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_dato_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_ivaFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setText("U");
		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_dato_formulario_ivaFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_dato_formulario_ivaFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_dato_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_dato_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_dato_formulario_ivaFormularioIvaUpdate"));



					
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva = new JLabelMe();
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva.setToolTipText("Grupo Parametro Formulario Iva");
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_grupo_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_parametro_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_parametro_formulario_ivaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva= new JComboBoxMe();
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_parametro_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setText("Buscar");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaFormularioIva"));

		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setText("U");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setText("U");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaFormularioIvaUpdate"));



					
		this.jLabelid_parametro_formulario_ivaFormularioIva = new JLabelMe();
		this.jLabelid_parametro_formulario_ivaFormularioIva.setText(""+FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_parametro_formulario_ivaFormularioIva.setToolTipText("Parametro Formulario Iva");
		this.jLabelid_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parametro_formulario_ivaFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parametro_formulario_ivaFormularioIva.setToolTipText(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutFormularioIva = new GridBagLayout();
		this.jPanelid_parametro_formulario_ivaFormularioIva.setLayout(this.gridaBagLayoutFormularioIva);


		jComboBoxid_parametro_formulario_ivaFormularioIva= new JComboBoxMe();
		jComboBoxid_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_formulario_ivaFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parametro_formulario_ivaFormularioIva= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_formulario_ivaFormularioIva.setText("Buscar");
		this.jButtonid_parametro_formulario_ivaFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parametro_formulario_ivaFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioIva"));

		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setText("U");
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioIvaBusqueda"));

		if(this.formularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setText("U");
		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_formulario_ivaFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parametro_formulario_ivaFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_formulario_ivaFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_formulario_ivaFormularioIvaUpdate"));



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
		//this.jInternalFrameDetalleFormularioIva = new FormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formulario Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioIva= new GridBagLayout();
		

		
		String sToolTipFormularioIva="";
		sToolTipFormularioIva=FormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioIva+="(Contabilidad.FormularioIva)";
		}
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormularioIva = new JButtonMe();
		this.jButtonModificarFormularioIva = new JButtonMe();
        this.jButtonActualizarFormularioIva = new JButtonMe();
        this.jButtonEliminarFormularioIva = new JButtonMe();
        this.jButtonCancelarFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormularioIva = new JButtonMe();
		this.jButtonCerrarFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Iva";
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormularioIva.setName("jPanelCamposFormularioIva"); 

		this.jPanelCamposOcultosFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormularioIva.setName("jPanelCamposOcultosFormularioIva"); 

        this.jPanelAccionesFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormularioIva.setText("Nuevo");
		this.jButtonModificarFormularioIva.setText("Editar");
        this.jButtonActualizarFormularioIva.setText("Actualizar");
        this.jButtonEliminarFormularioIva.setText("Eliminar");
        this.jButtonCancelarFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormularioIva.setText("Guardar");
		this.jButtonCerrarFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioIva,"nuevo_button","Nuevo",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormularioIva,"modificar_button","Editar",this.formularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormularioIva,"actualizar_button","Actualizar",this.formularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormularioIva,"eliminar_button","Eliminar",this.formularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormularioIva,"cancelar_button","Cancelar",this.formularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormularioIva,"guardarcambios_button","Guardar",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioIva,"guardarcambiostabla_button","Guardar",this.formularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioIva,"cerrar_button","Salir",this.formularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormularioIva.setToolTipText("Nuevo"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormularioIva.setToolTipText("Editar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormularioIva.setToolTipText("Actualizar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormularioIva.setToolTipText("Eliminar)"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormularioIva.setToolTipText("Cancelar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormularioIva.setToolTipText("Guardar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormularioIva.setToolTipText("Guardar"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioIva.setToolTipText("Salir"+" "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioIva";
		inputMap = this.jButtonNuevoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormularioIva";
		inputMap = this.jButtonActualizarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarFormularioIva";
		inputMap = this.jButtonEliminarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarFormularioIva";
		inputMap = this.jButtonCancelarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarFormularioIva";
		inputMap = this.jButtonCerrarFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormularioIva.setToolTipText("Nuevo FormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormularioIva.setToolTipText("Sin Cerrar Ventana FormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormularioIva = new JLabelMe();
		
		this.jLabelAccionesFormularioIva.setText("Acciones");		
		this.jLabelAccionesFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormularioIva = new GridBagLayout();
		
		this.jPanelCamposFormularioIva.setLayout(gridaBagLayoutCamposFormularioIva);
		this.jPanelCamposOcultosFormularioIva.setLayout(gridaBagLayoutCamposOcultosFormularioIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormularioIva.add(jLabelIdFormularioIva, this.gridBagConstraintsFormularioIva);



	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormularioIva.add(jLabelidFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormularioIva.add(jLabelid_empresaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioIva.add(jButtonid_empresaFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioIva.add(jButtonid_empresaFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormularioIva.add(jComboBoxid_empresaFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormularioIva.add(jLabelid_ejercicioFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioIva.add(jButtonid_ejercicioFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioIva.add(jButtonid_ejercicioFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormularioIva.add(jComboBoxid_ejercicioFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormularioIva.add(jLabelid_periodoFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioIva.add(jButtonid_periodoFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormularioIva.add(jButtonid_periodoFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormularioIva.add(jComboBoxid_periodoFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_dato_formulario_ivaFormularioIva.add(jLabelid_dato_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_ivaFormularioIva.add(jButtonid_dato_formulario_ivaFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_dato_formulario_ivaFormularioIva.add(jButtonid_dato_formulario_ivaFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_dato_formulario_ivaFormularioIva.add(jComboBoxid_dato_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.add(jLabelid_grupo_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.add(jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.add(jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_parametro_formulario_ivaFormularioIva.add(jComboBoxid_grupo_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parametro_formulario_ivaFormularioIva.add(jLabelid_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_formulario_ivaFormularioIva.add(jButtonid_parametro_formulario_ivaFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 3;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_formulario_ivaFormularioIva.add(jButtonid_parametro_formulario_ivaFormularioIvaUpdate, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parametro_formulario_ivaFormularioIva.add(jComboBoxid_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);


	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 0;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorFormularioIva.add(jLabelvalorFormularioIva, this.gridBagConstraintsFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = 2;
		this.gridBagConstraintsFormularioIva.ipadx = 0;
		this.gridBagConstraintsFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorFormularioIva.add(jButtonvalorFormularioIvaBusqueda, this.gridBagConstraintsFormularioIva);
	}

	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioIva.gridy = 0;
	this.gridBagConstraintsFormularioIva.gridx = 1;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorFormularioIva.add(jTextFieldvalorFormularioIva, this.gridBagConstraintsFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioIva.add(this.jPanelidFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposFormularioIva % 1==0) {
		iXPanelCamposFormularioIva=0;
		iYPanelCamposFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioIva.add(this.jPanelid_dato_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposFormularioIva % 1==0) {
		iXPanelCamposFormularioIva=0;
		iYPanelCamposFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioIva.add(this.jPanelid_grupo_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposFormularioIva % 1==0) {
		iXPanelCamposFormularioIva=0;
		iYPanelCamposFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioIva.add(this.jPanelid_parametro_formulario_ivaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposFormularioIva % 1==0) {
		iXPanelCamposFormularioIva=0;
		iYPanelCamposFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioIva.add(this.jPanelvalorFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposFormularioIva % 1==0) {
		iXPanelCamposFormularioIva=0;
		iYPanelCamposFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposOcultosFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposOcultosFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioIva.add(this.jPanelid_empresaFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposOcultosFormularioIva % 1==0) {
		iXPanelCamposOcultosFormularioIva=0;
		iYPanelCamposOcultosFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposOcultosFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposOcultosFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioIva.add(this.jPanelid_ejercicioFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposOcultosFormularioIva % 1==0) {
		iXPanelCamposOcultosFormularioIva=0;
		iYPanelCamposOcultosFormularioIva++;
	}
	this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioIva.gridy = iYPanelCamposOcultosFormularioIva;
	this.gridBagConstraintsFormularioIva.gridx = iXPanelCamposOcultosFormularioIva++;
	this.gridBagConstraintsFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioIva.add(this.jPanelid_periodoFormularioIva, this.gridBagConstraintsFormularioIva);



	if(iXPanelCamposOcultosFormularioIva % 1==0) {
		iXPanelCamposOcultosFormularioIva=0;
		iYPanelCamposOcultosFormularioIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioIva.setLayout(gridaBagLayoutAccionesFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioFormularioIva.setLayout(gridaBagLayoutAccionesFormularioFormularioIva);
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioIva.add(this.jComboBoxTiposAccionesFormularioFormularioIva, this.gridBagConstraintsFormularioIva);

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioIva.add(this.jCheckBoxPostAccionNuevoFormularioIva, this.gridBagConstraintsFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioIva.add(this.jCheckBoxPostAccionSinCerrarFormularioIva, this.gridBagConstraintsFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioIva.add(this.jCheckBoxPostAccionSinMensajeFormularioIva, this.gridBagConstraintsFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormularioIva.add(this.jButtonModificarFormularioIva, this.gridBagConstraintsFormularioIva);							

		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioIva.gridy = 0;
		this.gridBagConstraintsFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormularioIva.add(this.jButtonEliminarFormularioIva, this.gridBagConstraintsFormularioIva);
		
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = 0;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioIva.add(this.jButtonActualizarFormularioIva, this.gridBagConstraintsFormularioIva);


		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = 0;		
		this.gridBagConstraintsFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioIva.add(this.jButtonGuardarCambiosFormularioIva, this.gridBagConstraintsFormularioIva);	
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = 0;		
		this.gridBagConstraintsFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormularioIva.add(this.jButtonCancelarFormularioIva, this.gridBagConstraintsFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioIva.gridx = 0;		
			//this.gridBagConstraintsFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioIva.gridx =0;
		this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioIva, this.gridBagConstraintsFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormularioIva = new FormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formulario Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formulario Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormularioIvaModel formularioivaModel=new FormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//FormularioIvaModel.FormularioIvaFocusTraversalPolicy formularioivaFocusTraversalPolicy = formularioivaModel.new FormularioIvaFocusTraversalPolicy(this);
			
			//formularioivaFocusTraversalPolicy.setformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formularioivaModel);
			
			
			this.jContentPaneDetalleFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleFormularioIva.setLayout(gridaBagLayoutDetalleFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleFormularioIva.add(jTtoolBarDetalleFormularioIva, gridBagConstraintsFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionFormularioIva=   new JScrollPane(jContentPaneDetalleFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleFormularioIva.add(jPanelCamposFormularioIva, gridBagConstraintsFormularioIva);
			
			
			
			
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
						&& formularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormularioIva.gridx = 0;
						this.jContentPaneDetalleFormularioIva.add(this.jTabbedPaneRelacionesFormularioIva, this.gridBagConstraintsFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormularioIva.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleFormularioIva.add(jPanelCamposOcultosFormularioIva, gridBagConstraintsFormularioIva);
				
					this.jPanelCamposOcultosFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormularioIva.gridx = 0;
	        this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormularioIva.add(this.jPanelAccionesFormularioFormularioIva, this.gridBagConstraintsFormularioIva);							
			
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsFormularioIva.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleFormularioIva.add(this.jPanelAccionesFormularioIva, this.gridBagConstraintsFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormularioIva=   new JScrollPane(this.jPanelCamposFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormularioIva.gridx = 0;
			this.gridBagConstraintsFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormularioIva, this.gridBagConstraintsFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormularioIva, this.gridBagConstraintsFormularioIva);			
			
			this.gridBagConstraintsFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIva, this.gridBagConstraintsFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioIva, this.gridBagConstraintsFormularioIva);
			
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioIva, this.gridBagConstraintsFormularioIva);
		
			
		this.gridBagConstraintsFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioIva, this.gridBagConstraintsFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionFormularioIva;
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
