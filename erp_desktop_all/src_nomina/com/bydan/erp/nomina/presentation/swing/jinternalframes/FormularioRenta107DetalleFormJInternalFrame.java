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
import com.bydan.erp.nomina.util.FormularioRenta107ConstantesFunciones;

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
public class FormularioRenta107DetalleFormJInternalFrame extends FormularioRenta107BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormularioRenta107;
	
	protected JMenuBar jmenuBarDetalleFormularioRenta107;
	
	protected JMenu jmenuDetalleFormularioRenta107;
	protected JMenu jmenuDetalleArchivoFormularioRenta107;
	protected JMenu jmenuDetalleAccionesFormularioRenta107;
	protected JMenu jmenuDetalleDatosFormularioRenta107;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRenta107;	
	protected GridBagConstraints gridBagConstraintsFormularioRenta107;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormularioRenta107BeanSwingJInternalFrameAdditional jInternalFrameDetalleFormularioRenta107;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public FormularioRenta107SessionBean formulariorenta107SessionBean;
	
	

	public DetalleFormularioRenta107BeanSwingJInternalFrame detalleformulariorenta107BeanSwingJInternalFrame=null;
	public DetalleFormularioRenta107BeanSwingJInternalFrame detalleformulariorenta107BeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleFormularioRenta107=false;
	public DetalleFormularioRenta107SessionBean detalleformulariorenta107SessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public FormularioRenta107Logic formulariorenta107Logic;
	
	public JScrollPane jScrollPanelDatosFormularioRenta107;
	public JScrollPane jScrollPanelDatosEdicionFormularioRenta107;
	public JScrollPane jScrollPanelDatosGeneralFormularioRenta107;
	
	protected JPanel jPanelCamposFormularioRenta107;    
	protected JPanel jPanelCamposOcultosFormularioRenta107;    	
	protected JPanel jPanelAccionesFormularioRenta107;
	protected JPanel jPanelAccionesFormularioFormularioRenta107;
    
	
	
	protected Integer iXPanelCamposFormularioRenta107=0;
	protected Integer iYPanelCamposFormularioRenta107=0;
	
	protected Integer iXPanelCamposOcultosFormularioRenta107=0;
	protected Integer iYPanelCamposOcultosFormularioRenta107=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormularioRenta107;
	public JButton jButtonModificarFormularioRenta107;
	public JButton jButtonActualizarFormularioRenta107;
    public JButton jButtonEliminarFormularioRenta107;
	public JButton jButtonCancelarFormularioRenta107;
    public JButton jButtonGuardarCambiosFormularioRenta107;
	public JButton jButtonGuardarCambiosTablaFormularioRenta107;
	protected JButton jButtonCerrarFormularioRenta107;
	
	
	protected JButton jButtonProcesarInformacionFormularioRenta107;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormularioRenta107;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormularioRenta107;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormularioRenta107;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRenta107;
	protected JButton jButtonModificarToolBarFormularioRenta107;
	protected JButton jButtonActualizarToolBarFormularioRenta107;
    protected JButton jButtonEliminarToolBarFormularioRenta107;
	protected JButton jButtonCancelarToolBarFormularioRenta107;
    protected JButton jButtonGuardarCambiosToolBarFormularioRenta107;
	protected JButton jButtonGuardarCambiosTablaToolBarFormularioRenta107;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRenta107;
	protected JButton jButtonCerrarToolBarFormularioRenta107;
	
	protected JButton jButtonProcesarInformacionToolBarFormularioRenta107;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRenta107;
	protected JMenuItem jMenuItemModificarFormularioRenta107;
	protected JMenuItem jMenuItemActualizarFormularioRenta107;
    protected JMenuItem jMenuItemEliminarFormularioRenta107;
	protected JMenuItem jMenuItemCancelarFormularioRenta107;
    protected JMenuItem jMenuItemGuardarCambiosFormularioRenta107;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRenta107;
	protected JMenuItem jMenuItemCerrarFormularioRenta107;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRenta107;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRenta107;
	
	protected JMenuItem jMenuItemProcesarInformacionFormularioRenta107;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRenta107;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRenta107;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRenta107;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRenta107;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormularioRenta107;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormularioRenta107;
	public JLabel jLabelIdFormularioRenta107;
	public JLabel jLabelidFormularioRenta107;
	public JButton jButtonidFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoFormularioRenta107;
	public JLabel jLabelnumero_pre_impresoFormularioRenta107;
	public JTextField jTextFieldnumero_pre_impresoFormularioRenta107;
	public JButton jButtonnumero_pre_impresoFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaFormularioRenta107;
	public JLabel jLabelfecha_entregaFormularioRenta107;
	//public JFormattedTextField jDateChooserfecha_entregaFormularioRenta107;

	public JDateChooser jDateChooserfecha_entregaFormularioRenta107;
	public JButton jButtonfecha_entregaFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelfecha_generacionFormularioRenta107;
	public JLabel jLabelfecha_generacionFormularioRenta107;
	//public JFormattedTextField jDateChooserfecha_generacionFormularioRenta107;

	public JDateChooser jDateChooserfecha_generacionFormularioRenta107;
	public JButton jButtonfecha_generacionFormularioRenta107Busqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormularioRenta107;
	public JLabel jLabelid_empresaFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormularioRenta107;
	public JButton jButtonid_empresaFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empresaFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empresaFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelid_empleadoFormularioRenta107;
	public JLabel jLabelid_empleadoFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFormularioRenta107;
	public JButton jButtonid_empleadoFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empleadoFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empleadoFormularioRenta107Busqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormularioRenta107;
	public JLabel jLabelid_ejercicioFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormularioRenta107;
	public JButton jButtonid_ejercicioFormularioRenta107= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_ejercicioFormularioRenta107Busqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormularioRenta107;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormularioRenta107DetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormularioRenta107=new JPanel();
				this.jPanelAccionesFormularioFormularioRenta107=new JPanel();
				this.jmenuBarDetalleFormularioRenta107=new JMenuBar();
				this.jTtoolBarDetalleFormularioRenta107=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107DetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormularioRenta107DetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107DetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107DetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRenta107DetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormularioRenta107() {
		return this.jButtonActualizarToolBarFormularioRenta107;
	}
	
	public JButton getjButtonEliminarToolBarFormularioRenta107() {
		return this.jButtonEliminarToolBarFormularioRenta107;
	}
	
	public JButton getjButtonCancelarToolBarFormularioRenta107() {
		return this.jButtonCancelarToolBarFormularioRenta107;
	}		
	
	public JButton getjButtonProcesarInformacionFormularioRenta107() {
		return this.jButtonProcesarInformacionFormularioRenta107;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRenta107)	{
		this.jButtonProcesarInformacionFormularioRenta107 = jButtonProcesarInformacionFormularioRenta107;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRenta107() {
		return this.jComboBoxTiposAccionesFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRenta107(
			JComboBox jComboBoxTiposRelacionesFormularioRenta107) {
		this.jComboBoxTiposRelacionesFormularioRenta107 = jComboBoxTiposRelacionesFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRenta107(
			JComboBox jComboBoxTiposAccionesFormularioRenta107) {
		this.jComboBoxTiposAccionesFormularioRenta107 = jComboBoxTiposAccionesFormularioRenta107;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormularioRenta107() {
		return this.jComboBoxTiposAccionesFormularioFormularioRenta107;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormularioRenta107(
			JComboBox jComboBoxTiposAccionesFormularioFormularioRenta107) {
		this.jComboBoxTiposAccionesFormularioFormularioRenta107 = jComboBoxTiposAccionesFormularioFormularioRenta107;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		
		this.formulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorenta107SessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleformulariorenta107SessionBean=new DetalleFormularioRenta107SessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRenta107JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta107 MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
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
	
		FormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormularioRenta107= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormularioRenta107=new JButtonMe();
				this.jButtonModificarToolBarFormularioRenta107=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"actualizar","actualizar","Actualizar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"eliminar","eliminar","Eliminar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"cancelar","cancelar","Cancelar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"guardarcambios","guardarcambios","Guardar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormularioRenta107=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormularioRenta107=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormularioRenta107=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormularioRenta107=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormularioRenta107=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRenta107= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRenta107.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRenta107,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormularioRenta107= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormularioRenta107.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormularioRenta107,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormularioRenta107= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormularioRenta107.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormularioRenta107,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormularioRenta107= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormularioRenta107.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormularioRenta107,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormularioRenta107= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormularioRenta107.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormularioRenta107,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormularioRenta107= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRenta107.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRenta107,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormularioRenta107.add(this.jMenuItemDetalleCerrarFormularioRenta107);
		
		this.jmenuDetalleAccionesFormularioRenta107.add(this.jMenuItemActualizarFormularioRenta107);
		this.jmenuDetalleAccionesFormularioRenta107.add(this.jMenuItemEliminarFormularioRenta107);
		this.jmenuDetalleAccionesFormularioRenta107.add(this.jMenuItemCancelarFormularioRenta107);		
		
		//this.jmenuDetalleDatosFormularioRenta107.add(this.jMenuItemDetalleAbrirOrderByFormularioRenta107);				
		this.jmenuDetalleDatosFormularioRenta107.add(this.jMenuItemDetalleMostarOcultarFormularioRenta107);				
				
		//this.jmenuDetalleAccionesFormularioRenta107.add(this.jMenuItemGuardarCambiosFormularioRenta107);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormularioRenta107.add(this.jmenuDetalleArchivoFormularioRenta107);		
		this.jmenuBarDetalleFormularioRenta107.add(this.jmenuDetalleAccionesFormularioRenta107);		
		this.jmenuBarDetalleFormularioRenta107.add(this.jmenuDetalleDatosFormularioRenta107);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormularioRenta107.add(this.jmenuDetalleFormularioRenta107);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormularioRenta107);				
	}
	
	
	public void inicializarElementosCamposFormularioRenta107() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormularioRenta107 = new JLabelMe();
		jLabelIdFormularioRenta107.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormularioRenta107 = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormularioRenta107= new GridBagLayout();

		this.jPanelidFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);

		jLabelidFormularioRenta107 = new JLabel();
		jLabelidFormularioRenta107.setText("Id");

		jLabelidFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_pre_impresoFormularioRenta107 = new JLabelMe();
		this.jLabelnumero_pre_impresoFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoFormularioRenta107.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelnumero_pre_impresoFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		jTextFieldnumero_pre_impresoFormularioRenta107= new JTextFieldMe();

		jTextFieldnumero_pre_impresoFormularioRenta107.setEnabled(false);
		jTextFieldnumero_pre_impresoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setText("U");
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaFormularioRenta107 = new JLabelMe();
		this.jLabelfecha_entregaFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaFormularioRenta107.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelfecha_entregaFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		//jFormattedTextFieldfecha_entregaFormularioRenta107= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaFormularioRenta107= new JDateChooser();
		jDateChooserfecha_entregaFormularioRenta107.setEnabled(false);
		jDateChooserfecha_entregaFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaFormularioRenta107.setDate(new Date());
		jDateChooserfecha_entregaFormularioRenta107.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaFormularioRenta107.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaFormularioRenta107Busqueda.setText("U");
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaFormularioRenta107Busqueda.setVisible(false);		}


					
		this.jLabelfecha_generacionFormularioRenta107 = new JLabelMe();
		this.jLabelfecha_generacionFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION+" : *");
		this.jLabelfecha_generacionFormularioRenta107.setToolTipText("Fecha Generacion");
		this.jLabelfecha_generacionFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_generacionFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_generacionFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_generacionFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_generacionFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_generacionFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelfecha_generacionFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		//jFormattedTextFieldfecha_generacionFormularioRenta107= new JFormattedTextFieldMe();

		jDateChooserfecha_generacionFormularioRenta107= new JDateChooser();
		jDateChooserfecha_generacionFormularioRenta107.setEnabled(false);
		jDateChooserfecha_generacionFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_generacionFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_generacionFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_generacionFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_generacionFormularioRenta107.setDate(new Date());
		jDateChooserfecha_generacionFormularioRenta107.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_generacionFormularioRenta107.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_generacionFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_generacionFormularioRenta107Busqueda.setText("U");
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_generacionFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_generacionFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_generacionFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_generacionFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_generacionFormularioRenta107Busqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormularioRenta107() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormularioRenta107 = new JLabelMe();
		this.jLabelid_empresaFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormularioRenta107.setToolTipText("Empresa");
		this.jLabelid_empresaFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelid_empresaFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		jComboBoxid_empresaFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empresaFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormularioRenta107.setEnabled(false);

		this.jButtonid_empresaFormularioRenta107= new JButtonMe();
		this.jButtonid_empresaFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormularioRenta107.setText("Buscar");
		this.jButtonid_empresaFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRenta107"));

		this.jButtonid_empresaFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_empresaFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRenta107Busqueda.setText("U");
		this.jButtonid_empresaFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_empresaFormularioRenta107Update= new JButtonMe();
		this.jButtonid_empresaFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormularioRenta107Update.setText("U");
		this.jButtonid_empresaFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormularioRenta107Update"));



					
		this.jLabelid_empleadoFormularioRenta107 = new JLabelMe();
		this.jLabelid_empleadoFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoFormularioRenta107.setToolTipText("Empleado");
		this.jLabelid_empleadoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelid_empleadoFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		jComboBoxid_empleadoFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empleadoFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoFormularioRenta107= new JButtonMe();
		this.jButtonid_empleadoFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFormularioRenta107.setText("Buscar");
		this.jButtonid_empleadoFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFormularioRenta107"));

		this.jButtonid_empleadoFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_empleadoFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFormularioRenta107Busqueda.setText("U");
		this.jButtonid_empleadoFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_empleadoFormularioRenta107Update= new JButtonMe();
		this.jButtonid_empleadoFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFormularioRenta107Update.setText("U");
		this.jButtonid_empleadoFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFormularioRenta107Update"));



					
		this.jLabelid_ejercicioFormularioRenta107 = new JLabelMe();
		this.jLabelid_ejercicioFormularioRenta107.setText(""+FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormularioRenta107.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormularioRenta107.setToolTipText(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		this.jPanelid_ejercicioFormularioRenta107.setLayout(this.gridaBagLayoutFormularioRenta107);


		jComboBoxid_ejercicioFormularioRenta107= new JComboBoxMe();
		jComboBoxid_ejercicioFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormularioRenta107.setEnabled(false);

		this.jButtonid_ejercicioFormularioRenta107= new JButtonMe();
		this.jButtonid_ejercicioFormularioRenta107.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta107.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta107.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormularioRenta107.setText("Buscar");
		this.jButtonid_ejercicioFormularioRenta107.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormularioRenta107.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRenta107,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRenta107"));

		this.jButtonid_ejercicioFormularioRenta107Busqueda= new JButtonMe();
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRenta107Busqueda.setText("U");
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRenta107Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRenta107Busqueda"));

		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormularioRenta107Busqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormularioRenta107Update= new JButtonMe();
		this.jButtonid_ejercicioFormularioRenta107Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRenta107Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormularioRenta107Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormularioRenta107Update.setText("U");
		this.jButtonid_ejercicioFormularioRenta107Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormularioRenta107Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormularioRenta107Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormularioRenta107Update"));



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
		//this.jInternalFrameDetalleFormularioRenta107 = new FormularioRenta107BeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formulario Renta107 DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRenta107= new GridBagLayout();
		

		
		String sToolTipFormularioRenta107="";
		sToolTipFormularioRenta107=FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRenta107+="(Nomina.FormularioRenta107)";
		}
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRenta107+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormularioRenta107 = new JButtonMe();
		this.jButtonModificarFormularioRenta107 = new JButtonMe();
        this.jButtonActualizarFormularioRenta107 = new JButtonMe();
        this.jButtonEliminarFormularioRenta107 = new JButtonMe();
        this.jButtonCancelarFormularioRenta107 = new JButtonMe();
        this.jButtonGuardarCambiosFormularioRenta107 = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarFormularioRenta107 = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRenta107 = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormularioRenta107 = new JScrollPane();
		this.jScrollPanelDatosGeneralFormularioRenta107 = new JScrollPane();
				
		
		
		this.jPanelCamposFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta107";
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta107es" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormularioRenta107.setName("jPanelCamposFormularioRenta107"); 

		this.jPanelCamposOcultosFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormularioRenta107.setName("jPanelCamposOcultosFormularioRenta107"); 

        this.jPanelAccionesFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRenta107.setName("Acciones"); 

		this.jPanelAccionesFormularioFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormularioRenta107.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormularioRenta107.setText("Nuevo");
		this.jButtonModificarFormularioRenta107.setText("Editar");
        this.jButtonActualizarFormularioRenta107.setText("Actualizar");
        this.jButtonEliminarFormularioRenta107.setText("Eliminar");
        this.jButtonCancelarFormularioRenta107.setText("Cancelar");
        this.jButtonGuardarCambiosFormularioRenta107.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormularioRenta107.setText("Guardar");
		this.jButtonCerrarFormularioRenta107.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRenta107,"nuevo_button","Nuevo",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormularioRenta107,"modificar_button","Editar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormularioRenta107,"actualizar_button","Actualizar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormularioRenta107,"eliminar_button","Eliminar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormularioRenta107,"cancelar_button","Cancelar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormularioRenta107,"guardarcambios_button","Guardar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRenta107,"guardarcambiostabla_button","Guardar",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRenta107,"cerrar_button","Salir",this.formulariorenta107SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormularioRenta107.setToolTipText("Nuevo"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormularioRenta107.setToolTipText("Editar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormularioRenta107.setToolTipText("Actualizar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormularioRenta107.setToolTipText("Eliminar)"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormularioRenta107.setToolTipText("Cancelar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormularioRenta107.setToolTipText("Guardar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormularioRenta107.setToolTipText("Guardar"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRenta107.setToolTipText("Salir"+" "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRenta107";
		inputMap = this.jButtonNuevoFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRenta107"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormularioRenta107";
		inputMap = this.jButtonActualizarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormularioRenta107"));
		
		//ELIMINAR
		sMapKey = "EliminarFormularioRenta107";
		inputMap = this.jButtonEliminarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormularioRenta107"));
		
		//CANCELAR	
		sMapKey = "CancelarFormularioRenta107";
		inputMap = this.jButtonCancelarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormularioRenta107"));
		
		//CERRAR		
		sMapKey = "CerrarFormularioRenta107";
		inputMap = this.jButtonCerrarFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRenta107"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRenta107";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRenta107"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormularioRenta107.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormularioRenta107.setToolTipText("Nuevo FormularioRenta107");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormularioRenta107.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormularioRenta107.setToolTipText("Sin Cerrar Ventana FormularioRenta107");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormularioRenta107.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormularioRenta107.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRenta107.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRenta107.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormularioRenta107.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormularioRenta107.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormularioRenta107 = new JLabelMe();
		
		this.jLabelAccionesFormularioRenta107.setText("Acciones");		
		this.jLabelAccionesFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormularioRenta107();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormularioRenta107();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormularioRenta107=new JTabbedPane();
		this.jTabbedPaneRelacionesFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormularioRenta107,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormularioRenta107.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRenta107.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormularioRenta107.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormularioRenta107 = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormularioRenta107 = new GridBagLayout();
		
		this.jPanelCamposFormularioRenta107.setLayout(gridaBagLayoutCamposFormularioRenta107);
		this.jPanelCamposOcultosFormularioRenta107.setLayout(gridaBagLayoutCamposOcultosFormularioRenta107);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormularioRenta107.add(jLabelIdFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormularioRenta107.add(jLabelidFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormularioRenta107.add(jLabelid_empresaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRenta107.add(jButtonid_empresaFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 3;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormularioRenta107.add(jButtonid_empresaFormularioRenta107Update, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormularioRenta107.add(jComboBoxid_empresaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoFormularioRenta107.add(jLabelid_empleadoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFormularioRenta107.add(jButtonid_empleadoFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 3;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFormularioRenta107.add(jButtonid_empleadoFormularioRenta107Update, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoFormularioRenta107.add(jComboBoxid_empleadoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormularioRenta107.add(jLabelid_ejercicioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRenta107.add(jButtonid_ejercicioFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 3;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormularioRenta107.add(jButtonid_ejercicioFormularioRenta107Update, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormularioRenta107.add(jComboBoxid_ejercicioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoFormularioRenta107.add(jLabelnumero_pre_impresoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoFormularioRenta107.add(jButtonnumero_pre_impresoFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoFormularioRenta107.add(jTextFieldnumero_pre_impresoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaFormularioRenta107.add(jLabelfecha_entregaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaFormularioRenta107.add(jButtonfecha_entregaFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaFormularioRenta107.add(jDateChooserfecha_entregaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 0;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_generacionFormularioRenta107.add(jLabelfecha_generacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = 2;
		this.gridBagConstraintsFormularioRenta107.ipadx = 0;
		this.gridBagConstraintsFormularioRenta107.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_generacionFormularioRenta107.add(jButtonfecha_generacionFormularioRenta107Busqueda, this.gridBagConstraintsFormularioRenta107);
	}

	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormularioRenta107.gridy = 0;
	this.gridBagConstraintsFormularioRenta107.gridx = 1;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_generacionFormularioRenta107.add(jDateChooserfecha_generacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta107.add(this.jPanelidFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposFormularioRenta107 % 1==0) {
		iXPanelCamposFormularioRenta107=0;
		iYPanelCamposFormularioRenta107++;
	}
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta107.add(this.jPanelid_empleadoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposFormularioRenta107 % 1==0) {
		iXPanelCamposFormularioRenta107=0;
		iYPanelCamposFormularioRenta107++;
	}
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta107.add(this.jPanelnumero_pre_impresoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposFormularioRenta107 % 1==0) {
		iXPanelCamposFormularioRenta107=0;
		iYPanelCamposFormularioRenta107++;
	}
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta107.add(this.jPanelfecha_entregaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposFormularioRenta107 % 1==0) {
		iXPanelCamposFormularioRenta107=0;
		iYPanelCamposFormularioRenta107++;
	}
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormularioRenta107.add(this.jPanelfecha_generacionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposFormularioRenta107 % 1==0) {
		iXPanelCamposFormularioRenta107=0;
		iYPanelCamposFormularioRenta107++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposOcultosFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposOcultosFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRenta107.add(this.jPanelid_empresaFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposOcultosFormularioRenta107 % 1==0) {
		iXPanelCamposOcultosFormularioRenta107=0;
		iYPanelCamposOcultosFormularioRenta107++;
	}
	this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormularioRenta107.gridy = iYPanelCamposOcultosFormularioRenta107;
	this.gridBagConstraintsFormularioRenta107.gridx = iXPanelCamposOcultosFormularioRenta107++;
	this.gridBagConstraintsFormularioRenta107.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormularioRenta107.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormularioRenta107.add(this.jPanelid_ejercicioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);



	if(iXPanelCamposOcultosFormularioRenta107 % 1==0) {
		iXPanelCamposOcultosFormularioRenta107=0;
		iYPanelCamposOcultosFormularioRenta107++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesFormularioRenta107.setLayout(gridaBagLayoutAccionesFormularioRenta107);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesFormularioFormularioRenta107.setLayout(gridaBagLayoutAccionesFormularioFormularioRenta107);
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRenta107.add(this.jComboBoxTiposAccionesFormularioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormularioRenta107.add(this.jCheckBoxPostAccionNuevoFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRenta107.add(this.jCheckBoxPostAccionSinCerrarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormularioRenta107.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormularioRenta107.add(this.jCheckBoxPostAccionSinMensajeFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormularioRenta107.add(this.jButtonModificarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);							

		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRenta107.gridy = 0;
		this.gridBagConstraintsFormularioRenta107.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormularioRenta107.add(this.jButtonEliminarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta107.add(this.jButtonActualizarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);


		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsFormularioRenta107.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta107.add(this.jButtonGuardarCambiosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);	
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = 0;		
		this.gridBagConstraintsFormularioRenta107.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormularioRenta107.add(this.jButtonCancelarFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRenta107 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRenta107);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRenta107.gridx = 0;		
			//this.gridBagConstraintsFormularioRenta107.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRenta107.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRenta107.gridx =0;
		this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRenta107.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormularioRenta107 = new FormularioRenta107BeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formulario Renta107 DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formulario Renta107 DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Renta107 Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormularioRenta107Model formulariorenta107Model=new FormularioRenta107Model(this);
			
			//SI USARA CLASE INTERNA
			//FormularioRenta107Model.FormularioRenta107FocusTraversalPolicy formulariorenta107FocusTraversalPolicy = formulariorenta107Model.new FormularioRenta107FocusTraversalPolicy(this);
			
			//formulariorenta107FocusTraversalPolicy.setformulariorenta107JInternalFrame(this);
			
			this.setFocusTraversalPolicy(formulariorenta107Model);
			
			
			this.jContentPaneDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();	
			this.jContentPaneDetalleFormularioRenta107.setLayout(gridaBagLayoutDetalleFormularioRenta107);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRenta107 = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormularioRenta107.gridx = 0;
					
				
				this.jContentPaneDetalleFormularioRenta107.add(jTtoolBarDetalleFormularioRenta107, gridBagConstraintsFormularioRenta107);								
				
}
			
			this.jScrollPanelDatosEdicionFormularioRenta107=   new JScrollPane(jContentPaneDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormularioRenta107=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormularioRenta107.gridx = 0;
	        
			this.jContentPaneDetalleFormularioRenta107.add(jPanelCamposFormularioRenta107, gridBagConstraintsFormularioRenta107);
			
			
			
			
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
						&& formulariorenta107SessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleFormularioRenta107(this.puedeCargarPorParteDetalleFormularioRenta107,false,-1);
					
					if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormularioRenta107= new GridBagConstraints();
						this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormularioRenta107.gridx = 0;
						this.jContentPaneDetalleFormularioRenta107.add(this.jTabbedPaneRelacionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormularioRenta107.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleFormularioRenta107(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormularioRenta107.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
					this.gridBagConstraintsFormularioRenta107.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormularioRenta107.gridx = 0;
					
				
					this.jContentPaneDetalleFormularioRenta107.add(jPanelCamposOcultosFormularioRenta107, gridBagConstraintsFormularioRenta107);
				
					this.jPanelCamposOcultosFormularioRenta107.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFormularioRenta107.gridx = 0;
	        this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormularioRenta107.add(this.jPanelAccionesFormularioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);							
			
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
	        this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFormularioRenta107.gridx = 0;
	        
			
			this.jContentPaneDetalleFormularioRenta107.add(this.jPanelAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormularioRenta107);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormularioRenta107=   new JScrollPane(this.jPanelCamposFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta107.gridx = 0;
			this.gridBagConstraintsFormularioRenta107.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormularioRenta107.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormularioRenta107.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta107.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormularioRenta107, this.gridBagConstraintsFormularioRenta107);			
			
			this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormularioRenta107.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
			
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		
			
		this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsFormularioRenta107.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRenta107.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRenta107, this.gridBagConstraintsFormularioRenta107);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormularioRenta107;//jContentPane;
		
		return jScrollPanelDatosEdicionFormularioRenta107;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleFormularioRenta107(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleformulariorenta107SessionBean=new DetalleFormularioRenta107SessionBean();
		this.detalleformulariorenta107SessionBean.setConGuardarRelaciones(false);
		this.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(true);

		this.detalleformulariorenta107BeanSwingJInternalFrame=null;//new DetalleFormularioRenta107BeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleformulariorenta107BeanSwingJInternalFramePopup=new DetalleFormularioRenta107BeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleformulariorenta107BeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {

				DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL=FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(true);

				this.detalleformulariorenta107BeanSwingJInternalFrame=new DetalleFormularioRenta107BeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleformulariorenta107BeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleformulariorenta107BeanSwingJInternalFrame.setdetalleformulariorenta107SessionBean(this.detalleformulariorenta107SessionBean);

				//this.gridBagConstraintsFormularioRenta107 = new GridBagConstraints();
				//this.gridBagConstraintsFormularioRenta107.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormularioRenta107.gridx = 0;
				//this.jContentPaneDetalleFormularioRenta107.add(this.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormularioRenta107);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormularioRenta107.add("Detalle Formulario Renta107es",this.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormularioRenta107.setComponentAt(iIndexTab,this.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane());
				}

				//DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(false);
				this.detalleformulariorenta107BeanSwingJInternalFrame=null;//new DetalleFormularioRenta107BeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleFormularioRenta107) {
					this.jTabbedPaneRelacionesFormularioRenta107.add("Detalle Formulario Renta107es",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleFormularioRenta107BeanSwingJInternalFrame(List<FormularioRenta107> formulariorenta107s,FormularioRenta107 formulariorenta107,DetalleFormularioRenta107BeanSwingJInternalFrame detalleformulariorenta107BeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleformulariorenta107BeanSwingJInternalFrame=new DetalleFormularioRenta107BeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleformulariorenta107BeanSwingJInternalFrame.getDetalleFormularioRenta107Logic().setConnexion(this.formulariorenta107Logic.getConnexion());

					detalleformulariorenta107BeanSwingJInternalFrame.setformulariorenta107sForeignKey(formulariorenta107s);
					detalleformulariorenta107BeanSwingJInternalFrame.setformulariorenta107ForeignKey(formulariorenta107);
					detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setisBusquedaDesdeForeignKeySesionFormularioRenta107(true);
					detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setlidFormularioRenta107Actual(formulariorenta107.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleformulariorenta107BeanSwingJInternalFrame.cargarCombosForeignKeyDetalleFormularioRenta107(detalleformulariorenta107BeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleformulariorenta107BeanSwingJInternalFrame.setVisibilidadBusquedasParaFormularioRenta107(true);
					detalleformulariorenta107BeanSwingJInternalFrame.setid_formulario_renta107FK_IdFormularioRenta107(formulariorenta107.getId());

					if(!this.conCargarFormDetalle) {
						detalleformulariorenta107BeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleformulariorenta107BeanSwingJInternalFrame.setSelectedItemCombosFrameFormularioRenta107ForeignKey(formulariorenta107,1,false,true,true);
					detalleformulariorenta107BeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleformulariorenta107BeanSwingJInternalFrame.procesarBusqueda("FK_IdFormularioRenta107");
					detalleformulariorenta107BeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormularioRenta107");
					detalleformulariorenta107BeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFormularioRenta107(true);
					detalleformulariorenta107BeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleFormularioRenta107("n",detalleformulariorenta107BeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleformulariorenta107BeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleformulariorenta107BeanSwingJInternalFrame.setAutoscrolls(true);
					detalleformulariorenta107BeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleformulariorenta107BeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFormularioRenta107("relacionado");
					} else {
						detalleformulariorenta107BeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFormularioRenta107("no_relacionado");
					}

					detalleformulariorenta107BeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleFormularioRenta107().setVisible(false);

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
