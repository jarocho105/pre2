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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.RubrosVariablesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class RubrosVariablesDetalleFormJInternalFrame extends RubrosVariablesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRubrosVariables;
	
	protected JMenuBar jmenuBarDetalleRubrosVariables;
	
	protected JMenu jmenuDetalleRubrosVariables;
	protected JMenu jmenuDetalleArchivoRubrosVariables;
	protected JMenu jmenuDetalleAccionesRubrosVariables;
	protected JMenu jmenuDetalleDatosRubrosVariables;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubrosVariables;	
	protected GridBagConstraints gridBagConstraintsRubrosVariables;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RubrosVariablesBeanSwingJInternalFrameAdditional jInternalFrameDetalleRubrosVariables;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public RubrosVariablesSessionBean rubrosvariablesSessionBean;
	
	
	
	
	public TipoContratoSessionBean tipocontratoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;	
	
	public RubrosVariablesLogic rubrosvariablesLogic;
	
	public JScrollPane jScrollPanelDatosRubrosVariables;
	public JScrollPane jScrollPanelDatosEdicionRubrosVariables;
	public JScrollPane jScrollPanelDatosGeneralRubrosVariables;
	
	protected JPanel jPanelCamposRubrosVariables;    
	protected JPanel jPanelCamposOcultosRubrosVariables;    	
	protected JPanel jPanelAccionesRubrosVariables;
	protected JPanel jPanelAccionesFormularioRubrosVariables;
    
	
	
	protected Integer iXPanelCamposRubrosVariables=0;
	protected Integer iYPanelCamposRubrosVariables=0;
	
	protected Integer iXPanelCamposOcultosRubrosVariables=0;
	protected Integer iYPanelCamposOcultosRubrosVariables=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRubrosVariables;
	public JButton jButtonModificarRubrosVariables;
	public JButton jButtonActualizarRubrosVariables;
    public JButton jButtonEliminarRubrosVariables;
	public JButton jButtonCancelarRubrosVariables;
    public JButton jButtonGuardarCambiosRubrosVariables;
	public JButton jButtonGuardarCambiosTablaRubrosVariables;
	protected JButton jButtonCerrarRubrosVariables;
	
	
	protected JButton jButtonProcesarInformacionRubrosVariables;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRubrosVariables;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRubrosVariables;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRubrosVariables;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubrosVariables;
	protected JButton jButtonModificarToolBarRubrosVariables;
	protected JButton jButtonActualizarToolBarRubrosVariables;
    protected JButton jButtonEliminarToolBarRubrosVariables;
	protected JButton jButtonCancelarToolBarRubrosVariables;
    protected JButton jButtonGuardarCambiosToolBarRubrosVariables;
	protected JButton jButtonGuardarCambiosTablaToolBarRubrosVariables;
	protected JButton jButtonMostrarOcultarTablaToolBarRubrosVariables;
	protected JButton jButtonCerrarToolBarRubrosVariables;
	
	protected JButton jButtonProcesarInformacionToolBarRubrosVariables;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubrosVariables;
	protected JMenuItem jMenuItemModificarRubrosVariables;
	protected JMenuItem jMenuItemActualizarRubrosVariables;
    protected JMenuItem jMenuItemEliminarRubrosVariables;
	protected JMenuItem jMenuItemCancelarRubrosVariables;
    protected JMenuItem jMenuItemGuardarCambiosRubrosVariables;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubrosVariables;
	protected JMenuItem jMenuItemCerrarRubrosVariables;
	protected JMenuItem jMenuItemDetalleCerrarRubrosVariables;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubrosVariables;
	
	protected JMenuItem jMenuItemProcesarInformacionRubrosVariables;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubrosVariables;
	protected JMenuItem jMenuItemMostrarOcultarRubrosVariables;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubrosVariables;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubrosVariables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubrosVariables;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRubrosVariables;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRubrosVariables;
	public JLabel jLabelIdRubrosVariables;
	public JLabel jLabelidRubrosVariables;
	public JButton jButtonidRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeRubrosVariables;
	public JLabel jLabelfecha_desdeRubrosVariables;
	//public JFormattedTextField jDateChooserfecha_desdeRubrosVariables;

	public JDateChooser jDateChooserfecha_desdeRubrosVariables;
	public JButton jButtonfecha_desdeRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaRubrosVariables;
	public JLabel jLabelfecha_hastaRubrosVariables;
	//public JFormattedTextField jDateChooserfecha_hastaRubrosVariables;

	public JDateChooser jDateChooserfecha_hastaRubrosVariables;
	public JButton jButtonfecha_hastaRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoRubrosVariables;
	public JLabel jLabelcodigoRubrosVariables;
	public JTextField jTextFieldcodigoRubrosVariables;
	public JButton jButtoncodigoRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelnombreRubrosVariables;
	public JLabel jLabelnombreRubrosVariables;
	public JTextArea jTextAreanombreRubrosVariables;
	public JScrollPane jscrollPanenombreRubrosVariables;
	public JButton jButtonnombreRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelfechaRubrosVariables;
	public JLabel jLabelfechaRubrosVariables;
	//public JFormattedTextField jDateChooserfechaRubrosVariables;

	public JDateChooser jDateChooserfechaRubrosVariables;
	public JButton jButtonfechaRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelvalorRubrosVariables;
	public JLabel jLabelvalorRubrosVariables;
	public JTextField jTextFieldvalorRubrosVariables;
	public JButton jButtonvalorRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_rubro_empleaRubrosVariables;
	public JLabel jLabelnombre_rubro_empleaRubrosVariables;
	public JTextArea jTextAreanombre_rubro_empleaRubrosVariables;
	public JScrollPane jscrollPanenombre_rubro_empleaRubrosVariables;
	public JButton jButtonnombre_rubro_empleaRubrosVariablesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_contratoRubrosVariables;
	public JLabel jLabelid_tipo_contratoRubrosVariables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoRubrosVariables;
	public JButton jButtonid_tipo_contratoRubrosVariables= new JButtonMe();
	public JButton jButtonid_tipo_contratoRubrosVariablesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaRubrosVariables;
	public JLabel jLabelid_empresaRubrosVariables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRubrosVariables;
	public JButton jButtonid_empresaRubrosVariables= new JButtonMe();
	public JButton jButtonid_empresaRubrosVariablesUpdate= new JButtonMe();
	public JButton jButtonid_empresaRubrosVariablesBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaRubrosVariables;
	public JLabel jLabelid_rubro_empleaRubrosVariables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaRubrosVariables;
	public JButton jButtonid_rubro_empleaRubrosVariables= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubrosVariablesUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubrosVariablesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRubrosVariables;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RubrosVariablesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRubrosVariables=new JPanel();
				this.jPanelAccionesFormularioRubrosVariables=new JPanel();
				this.jmenuBarDetalleRubrosVariables=new JMenuBar();
				this.jTtoolBarDetalleRubrosVariables=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RubrosVariablesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRubrosVariables() {
		return this.jButtonActualizarToolBarRubrosVariables;
	}
	
	public JButton getjButtonEliminarToolBarRubrosVariables() {
		return this.jButtonEliminarToolBarRubrosVariables;
	}
	
	public JButton getjButtonCancelarToolBarRubrosVariables() {
		return this.jButtonCancelarToolBarRubrosVariables;
	}		
	
	public JButton getjButtonProcesarInformacionRubrosVariables() {
		return this.jButtonProcesarInformacionRubrosVariables;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubrosVariables)	{
		this.jButtonProcesarInformacionRubrosVariables = jButtonProcesarInformacionRubrosVariables;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubrosVariables() {
		return this.jComboBoxTiposAccionesRubrosVariables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubrosVariables(
			JComboBox jComboBoxTiposRelacionesRubrosVariables) {
		this.jComboBoxTiposRelacionesRubrosVariables = jComboBoxTiposRelacionesRubrosVariables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubrosVariables(
			JComboBox jComboBoxTiposAccionesRubrosVariables) {
		this.jComboBoxTiposAccionesRubrosVariables = jComboBoxTiposAccionesRubrosVariables;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRubrosVariables() {
		return this.jComboBoxTiposAccionesFormularioRubrosVariables;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRubrosVariables(
			JComboBox jComboBoxTiposAccionesFormularioRubrosVariables) {
		this.jComboBoxTiposAccionesFormularioRubrosVariables = jComboBoxTiposAccionesFormularioRubrosVariables;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
		
		this.rubrosvariablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubrosvariablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubrosvariablesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubrosVariablesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubros Variables MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
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
	
		RubrosVariablesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRubrosVariables= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRubrosVariables=new JButtonMe();
				this.jButtonModificarToolBarRubrosVariables=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables,
							"actualizar","actualizar","Actualizar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables,
							"eliminar","eliminar","Eliminar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables,
							"cancelar","cancelar","Cancelar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables,
							"guardarcambios","guardarcambios","Guardar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRubrosVariables=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRubrosVariables=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRubrosVariables=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRubrosVariables=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRubrosVariables=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubrosVariables= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubrosVariables.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubrosVariables,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRubrosVariables= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRubrosVariables.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRubrosVariables,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRubrosVariables= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRubrosVariables.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRubrosVariables,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRubrosVariables= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRubrosVariables.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRubrosVariables,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRubrosVariables= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRubrosVariables.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRubrosVariables,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRubrosVariables= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubrosVariables.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubrosVariables,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubrosVariables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubrosVariables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubrosVariables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRubrosVariables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRubrosVariables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRubrosVariables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubrosVariables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubrosVariables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubrosVariables,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubrosVariables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubrosVariables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubrosVariables,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRubrosVariables.add(this.jMenuItemDetalleCerrarRubrosVariables);
		
		this.jmenuDetalleAccionesRubrosVariables.add(this.jMenuItemActualizarRubrosVariables);
		this.jmenuDetalleAccionesRubrosVariables.add(this.jMenuItemEliminarRubrosVariables);
		this.jmenuDetalleAccionesRubrosVariables.add(this.jMenuItemCancelarRubrosVariables);		
		
		//this.jmenuDetalleDatosRubrosVariables.add(this.jMenuItemDetalleAbrirOrderByRubrosVariables);				
		this.jmenuDetalleDatosRubrosVariables.add(this.jMenuItemDetalleMostarOcultarRubrosVariables);				
				
		//this.jmenuDetalleAccionesRubrosVariables.add(this.jMenuItemGuardarCambiosRubrosVariables);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRubrosVariables.add(this.jmenuDetalleArchivoRubrosVariables);		
		this.jmenuBarDetalleRubrosVariables.add(this.jmenuDetalleAccionesRubrosVariables);		
		this.jmenuBarDetalleRubrosVariables.add(this.jmenuDetalleDatosRubrosVariables);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRubrosVariables);				
	}
	
	
	public void inicializarElementosCamposRubrosVariables() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRubrosVariables = new JLabelMe();
		jLabelIdRubrosVariables.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRubrosVariables = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRubrosVariables= new GridBagLayout();

		this.jPanelidRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);

		jLabelidRubrosVariables = new JLabel();
		jLabelidRubrosVariables.setText("Id");

		jLabelidRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeRubrosVariables = new JLabelMe();
		this.jLabelfecha_desdeRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeRubrosVariables.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelfecha_desdeRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		//jFormattedTextFieldfecha_desdeRubrosVariables= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeRubrosVariables= new JDateChooser();
		jDateChooserfecha_desdeRubrosVariables.setEnabled(false);
		jDateChooserfecha_desdeRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeRubrosVariables.setDate(new Date());
		jDateChooserfecha_desdeRubrosVariables.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeRubrosVariables.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeRubrosVariablesBusqueda.setText("U");
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaRubrosVariables = new JLabelMe();
		this.jLabelfecha_hastaRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaRubrosVariables.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelfecha_hastaRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		//jFormattedTextFieldfecha_hastaRubrosVariables= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaRubrosVariables= new JDateChooser();
		jDateChooserfecha_hastaRubrosVariables.setEnabled(false);
		jDateChooserfecha_hastaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaRubrosVariables.setDate(new Date());
		jDateChooserfecha_hastaRubrosVariables.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaRubrosVariables.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaRubrosVariablesBusqueda.setText("U");
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoRubrosVariables = new JLabelMe();
		this.jLabelcodigoRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoRubrosVariables.setToolTipText("Codigo");
		this.jLabelcodigoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelcodigoRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jTextFieldcodigoRubrosVariables= new JTextFieldMe();

		jTextFieldcodigoRubrosVariables.setEnabled(false);
		jTextFieldcodigoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoRubrosVariablesBusqueda= new JButtonMe();
		this.jButtoncodigoRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoRubrosVariablesBusqueda.setText("U");
		this.jButtoncodigoRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelnombreRubrosVariables = new JLabelMe();
		this.jLabelnombreRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRubrosVariables.setToolTipText("Nombre");
		this.jLabelnombreRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelnombreRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jTextAreanombreRubrosVariables= new JTextAreaMe();
		jTextAreanombreRubrosVariables.setEnabled(false);
		jTextAreanombreRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRubrosVariables.setLineWrap(true);
		jTextAreanombreRubrosVariables.setWrapStyleWord(true);
		jTextAreanombreRubrosVariables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreRubrosVariables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreRubrosVariables = new JScrollPane(jTextAreanombreRubrosVariables);
		jscrollPanenombreRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonnombreRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRubrosVariablesBusqueda.setText("U");
		this.jButtonnombreRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelfechaRubrosVariables = new JLabelMe();
		this.jLabelfechaRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaRubrosVariables.setToolTipText("Fecha");
		this.jLabelfechaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelfechaRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		//jFormattedTextFieldfechaRubrosVariables= new JFormattedTextFieldMe();

		jDateChooserfechaRubrosVariables= new JDateChooser();
		jDateChooserfechaRubrosVariables.setEnabled(false);
		jDateChooserfechaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaRubrosVariables.setDate(new Date());
		jDateChooserfechaRubrosVariables.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaRubrosVariables.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonfechaRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaRubrosVariablesBusqueda.setText("U");
		this.jButtonfechaRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelvalorRubrosVariables = new JLabelMe();
		this.jLabelvalorRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRubrosVariables.setToolTipText("Valor");
		this.jLabelvalorRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelvalorRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jTextFieldvalorRubrosVariables= new JTextFieldMe();
		jTextFieldvalorRubrosVariables.setEnabled(false);
		jTextFieldvalorRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRubrosVariables.setText("0.0");

		this.jButtonvalorRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonvalorRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRubrosVariablesBusqueda.setText("U");
		this.jButtonvalorRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRubrosVariablesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_rubro_empleaRubrosVariables = new JLabelMe();
		this.jLabelnombre_rubro_empleaRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA+" : *");
		this.jLabelnombre_rubro_empleaRubrosVariables.setToolTipText("Nombre Rubro Emplea");
		this.jLabelnombre_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_rubro_empleaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_rubro_empleaRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_rubro_empleaRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelnombre_rubro_empleaRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jTextAreanombre_rubro_empleaRubrosVariables= new JTextAreaMe();
		jTextAreanombre_rubro_empleaRubrosVariables.setEnabled(false);
		jTextAreanombre_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaRubrosVariables.setLineWrap(true);
		jTextAreanombre_rubro_empleaRubrosVariables.setWrapStyleWord(true);
		jTextAreanombre_rubro_empleaRubrosVariables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_rubro_empleaRubrosVariables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_rubro_empleaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_rubro_empleaRubrosVariables = new JScrollPane(jTextAreanombre_rubro_empleaRubrosVariables);
		jscrollPanenombre_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setText("U");
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_rubro_empleaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_rubro_empleaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_rubro_empleaRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRubrosVariables() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_contratoRubrosVariables = new JLabelMe();
		this.jLabelid_tipo_contratoRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO+" : *");
		this.jLabelid_tipo_contratoRubrosVariables.setToolTipText("Tipo Contrato");
		this.jLabelid_tipo_contratoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_contratoRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_contratoRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelid_tipo_contratoRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jComboBoxid_tipo_contratoRubrosVariables= new JComboBoxMe();
		jComboBoxid_tipo_contratoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_contratoRubrosVariables= new JButtonMe();
		this.jButtonid_tipo_contratoRubrosVariables.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoRubrosVariables.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoRubrosVariables.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoRubrosVariables.setText("Buscar");
		this.jButtonid_tipo_contratoRubrosVariables.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_contratoRubrosVariables.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoRubrosVariables,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_contratoRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoRubrosVariables"));

		this.jButtonid_tipo_contratoRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setText("U");
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_contratoRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_contratoRubrosVariablesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_contratoRubrosVariablesUpdate= new JButtonMe();
		this.jButtonid_tipo_contratoRubrosVariablesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoRubrosVariablesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoRubrosVariablesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoRubrosVariablesUpdate.setText("U");
		this.jButtonid_tipo_contratoRubrosVariablesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_contratoRubrosVariablesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoRubrosVariablesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_contratoRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoRubrosVariablesUpdate"));



					
		this.jLabelid_empresaRubrosVariables = new JLabelMe();
		this.jLabelid_empresaRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRubrosVariables.setToolTipText("Empresa");
		this.jLabelid_empresaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelid_empresaRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jComboBoxid_empresaRubrosVariables= new JComboBoxMe();
		jComboBoxid_empresaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRubrosVariables.setEnabled(false);

		this.jButtonid_empresaRubrosVariables= new JButtonMe();
		this.jButtonid_empresaRubrosVariables.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubrosVariables.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubrosVariables.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubrosVariables.setText("Buscar");
		this.jButtonid_empresaRubrosVariables.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRubrosVariables.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubrosVariables,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubrosVariables"));

		this.jButtonid_empresaRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonid_empresaRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubrosVariablesBusqueda.setText("U");
		this.jButtonid_empresaRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRubrosVariablesBusqueda.setVisible(false);		}

		this.jButtonid_empresaRubrosVariablesUpdate= new JButtonMe();
		this.jButtonid_empresaRubrosVariablesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubrosVariablesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubrosVariablesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubrosVariablesUpdate.setText("U");
		this.jButtonid_empresaRubrosVariablesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRubrosVariablesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubrosVariablesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubrosVariablesUpdate"));



					
		this.jLabelid_rubro_empleaRubrosVariables = new JLabelMe();
		this.jLabelid_rubro_empleaRubrosVariables.setText(""+RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaRubrosVariables.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaRubrosVariables.setToolTipText(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutRubrosVariables = new GridBagLayout();
		this.jPanelid_rubro_empleaRubrosVariables.setLayout(this.gridaBagLayoutRubrosVariables);


		jComboBoxid_rubro_empleaRubrosVariables= new JComboBoxMe();
		jComboBoxid_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaRubrosVariables= new JButtonMe();
		this.jButtonid_rubro_empleaRubrosVariables.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubrosVariables.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubrosVariables.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubrosVariables.setText("Buscar");
		this.jButtonid_rubro_empleaRubrosVariables.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaRubrosVariables.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubrosVariables,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubrosVariables"));

		this.jButtonid_rubro_empleaRubrosVariablesBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setText("U");
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubrosVariablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubrosVariablesBusqueda"));

		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaRubrosVariablesBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaRubrosVariablesUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaRubrosVariablesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubrosVariablesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubrosVariablesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubrosVariablesUpdate.setText("U");
		this.jButtonid_rubro_empleaRubrosVariablesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaRubrosVariablesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubrosVariablesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubrosVariablesUpdate"));



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
		//this.jInternalFrameDetalleRubrosVariables = new RubrosVariablesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rubros Variables DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubrosVariables= new GridBagLayout();
		

		
		String sToolTipRubrosVariables="";
		sToolTipRubrosVariables=RubrosVariablesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubrosVariables+="(Nomina.RubrosVariables)";
		}
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubrosVariables+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRubrosVariables = new JButtonMe();
		this.jButtonModificarRubrosVariables = new JButtonMe();
        this.jButtonActualizarRubrosVariables = new JButtonMe();
        this.jButtonEliminarRubrosVariables = new JButtonMe();
        this.jButtonCancelarRubrosVariables = new JButtonMe();
        this.jButtonGuardarCambiosRubrosVariables = new JButtonMe();
		this.jButtonGuardarCambiosTablaRubrosVariables = new JButtonMe();
		this.jButtonCerrarRubrosVariables = new JButtonMe();
		
		this.jScrollPanelDatosRubrosVariables = new JScrollPane();   
        this.jScrollPanelDatosEdicionRubrosVariables = new JScrollPane();
		this.jScrollPanelDatosGeneralRubrosVariables = new JScrollPane();
				
		
		
		this.jPanelCamposRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rubros Variables";
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses" + this.sPath));
		} else {
			this.jScrollPanelDatosRubrosVariables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRubrosVariables.setName("jPanelCamposRubrosVariables"); 

		this.jPanelCamposOcultosRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRubrosVariables.setName("jPanelCamposOcultosRubrosVariables"); 

        this.jPanelAccionesRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubrosVariables.setToolTipText("Acciones");
        this.jPanelAccionesRubrosVariables.setName("Acciones"); 

		this.jPanelAccionesFormularioRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRubrosVariables.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRubrosVariables.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRubrosVariables.setText("Nuevo");
		this.jButtonModificarRubrosVariables.setText("Editar");
        this.jButtonActualizarRubrosVariables.setText("Actualizar");
        this.jButtonEliminarRubrosVariables.setText("Eliminar");
        this.jButtonCancelarRubrosVariables.setText("Cancelar");
        this.jButtonGuardarCambiosRubrosVariables.setText("Guardar");
		this.jButtonGuardarCambiosTablaRubrosVariables.setText("Guardar");
		this.jButtonCerrarRubrosVariables.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubrosVariables,"nuevo_button","Nuevo",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRubrosVariables,"modificar_button","Editar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRubrosVariables,"actualizar_button","Actualizar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRubrosVariables,"eliminar_button","Eliminar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRubrosVariables,"cancelar_button","Cancelar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRubrosVariables,"guardarcambios_button","Guardar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubrosVariables,"guardarcambiostabla_button","Guardar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubrosVariables,"cerrar_button","Salir",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRubrosVariables.setToolTipText("Nuevo"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRubrosVariables.setToolTipText("Editar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRubrosVariables.setToolTipText("Actualizar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRubrosVariables.setToolTipText("Eliminar)"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRubrosVariables.setToolTipText("Cancelar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRubrosVariables.setToolTipText("Guardar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRubrosVariables.setToolTipText("Guardar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubrosVariables.setToolTipText("Salir"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubrosVariables";
		inputMap = this.jButtonNuevoRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubrosVariables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubrosVariables"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRubrosVariables";
		inputMap = this.jButtonActualizarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRubrosVariables"));
		
		//ELIMINAR
		sMapKey = "EliminarRubrosVariables";
		inputMap = this.jButtonEliminarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRubrosVariables"));
		
		//CANCELAR	
		sMapKey = "CancelarRubrosVariables";
		inputMap = this.jButtonCancelarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRubrosVariables"));
		
		//CERRAR		
		sMapKey = "CerrarRubrosVariables";
		inputMap = this.jButtonCerrarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubrosVariables"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubrosVariables";
		inputMap = this.jButtonGuardarCambiosTablaRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubrosVariables"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRubrosVariables.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRubrosVariables.setToolTipText("Nuevo RubrosVariables");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRubrosVariables.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRubrosVariables.setToolTipText("Sin Cerrar Ventana RubrosVariables");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRubrosVariables.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRubrosVariables.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubrosVariables.setText("Accion");
		this.jComboBoxTiposAccionesRubrosVariables.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRubrosVariables.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRubrosVariables.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRubrosVariables = new JLabelMe();
		
		this.jLabelAccionesRubrosVariables.setText("Acciones");		
		this.jLabelAccionesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRubrosVariables();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRubrosVariables();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRubrosVariables=new JTabbedPane();
		this.jTabbedPaneRelacionesRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRubrosVariables,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRubrosVariables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubrosVariables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubrosVariables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRubrosVariables.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubrosVariables.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubrosVariables.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRubrosVariables = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRubrosVariables = new GridBagLayout();
		
		this.jPanelCamposRubrosVariables.setLayout(gridaBagLayoutCamposRubrosVariables);
		this.jPanelCamposOcultosRubrosVariables.setLayout(gridaBagLayoutCamposOcultosRubrosVariables);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRubrosVariables.add(jLabelIdRubrosVariables, this.gridBagConstraintsRubrosVariables);



	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRubrosVariables.add(jLabelidRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_contratoRubrosVariables.add(jLabelid_tipo_contratoRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoRubrosVariables.add(jButtonid_tipo_contratoRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 3;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoRubrosVariables.add(jButtonid_tipo_contratoRubrosVariablesUpdate, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_contratoRubrosVariables.add(jComboBoxid_tipo_contratoRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRubrosVariables.add(jLabelid_empresaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubrosVariables.add(jButtonid_empresaRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 3;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubrosVariables.add(jButtonid_empresaRubrosVariablesUpdate, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRubrosVariables.add(jComboBoxid_empresaRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaRubrosVariables.add(jLabelid_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubrosVariables.add(jButtonid_rubro_empleaRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 3;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubrosVariables.add(jButtonid_rubro_empleaRubrosVariablesUpdate, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaRubrosVariables.add(jComboBoxid_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeRubrosVariables.add(jLabelfecha_desdeRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeRubrosVariables.add(jButtonfecha_desdeRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeRubrosVariables.add(jDateChooserfecha_desdeRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaRubrosVariables.add(jLabelfecha_hastaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaRubrosVariables.add(jButtonfecha_hastaRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaRubrosVariables.add(jDateChooserfecha_hastaRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoRubrosVariables.add(jLabelcodigoRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoRubrosVariables.add(jButtoncodigoRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoRubrosVariables.add(jTextFieldcodigoRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRubrosVariables.add(jLabelnombreRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRubrosVariables.add(jButtonnombreRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRubrosVariables.add(jscrollPanenombreRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaRubrosVariables.add(jLabelfechaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaRubrosVariables.add(jButtonfechaRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaRubrosVariables.add(jDateChooserfechaRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorRubrosVariables.add(jLabelvalorRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRubrosVariables.add(jButtonvalorRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorRubrosVariables.add(jTextFieldvalorRubrosVariables, this.gridBagConstraintsRubrosVariables);


	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 0;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_rubro_empleaRubrosVariables.add(jLabelnombre_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 2;
		this.gridBagConstraintsRubrosVariables.ipadx = 0;
		this.gridBagConstraintsRubrosVariables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_rubro_empleaRubrosVariables.add(jButtonnombre_rubro_empleaRubrosVariablesBusqueda, this.gridBagConstraintsRubrosVariables);
	}

	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubrosVariables.gridy = 0;
	this.gridBagConstraintsRubrosVariables.gridx = 1;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_rubro_empleaRubrosVariables.add(jscrollPanenombre_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelidRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelid_tipo_contratoRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelid_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelfecha_desdeRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelfecha_hastaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelcodigoRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelnombreRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelfechaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelvalorRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubrosVariables.add(this.jPanelnombre_rubro_empleaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposRubrosVariables % 1==0) {
		iXPanelCamposRubrosVariables=0;
		iYPanelCamposRubrosVariables++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubrosVariables.gridy = iYPanelCamposOcultosRubrosVariables;
	this.gridBagConstraintsRubrosVariables.gridx = iXPanelCamposOcultosRubrosVariables++;
	this.gridBagConstraintsRubrosVariables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubrosVariables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubrosVariables.add(this.jPanelid_empresaRubrosVariables, this.gridBagConstraintsRubrosVariables);



	if(iXPanelCamposOcultosRubrosVariables % 1==0) {
		iXPanelCamposOcultosRubrosVariables=0;
		iYPanelCamposOcultosRubrosVariables++;
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
			
		GridBagLayout gridaBagLayoutAccionesRubrosVariables= new GridBagLayout();
		this.jPanelAccionesRubrosVariables.setLayout(gridaBagLayoutAccionesRubrosVariables);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRubrosVariables= new GridBagLayout();
		this.jPanelAccionesFormularioRubrosVariables.setLayout(gridaBagLayoutAccionesFormularioRubrosVariables);
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubrosVariables.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubrosVariables.add(this.jComboBoxTiposAccionesFormularioRubrosVariables, this.gridBagConstraintsRubrosVariables);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXAccion++;
			
		this.jPanelAccionesRubrosVariables.add(this.jButtonModificarRubrosVariables, this.gridBagConstraintsRubrosVariables);							

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx =iPosXAccion++;
			
		this.jPanelAccionesRubrosVariables.add(this.jButtonEliminarRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = 0;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubrosVariables.add(this.jButtonActualizarRubrosVariables, this.gridBagConstraintsRubrosVariables);


		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = 0;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubrosVariables.add(this.jButtonGuardarCambiosRubrosVariables, this.gridBagConstraintsRubrosVariables);	
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = 0;		
		this.gridBagConstraintsRubrosVariables.gridx =iPosXAccion++;
		
		this.jPanelAccionesRubrosVariables.add(this.jButtonCancelarRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubrosVariables = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubrosVariables);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();						
			this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubrosVariables.gridx = 0;		
			//this.gridBagConstraintsRubrosVariables.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubrosVariables.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubrosVariables.gridx =0;
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubrosVariables.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubrosVariables, this.gridBagConstraintsRubrosVariables);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRubrosVariables = new RubrosVariablesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rubros Variables DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rubros Variables DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubros Variables Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RubrosVariablesModel rubrosvariablesModel=new RubrosVariablesModel(this);
			
			//SI USARA CLASE INTERNA
			//RubrosVariablesModel.RubrosVariablesFocusTraversalPolicy rubrosvariablesFocusTraversalPolicy = rubrosvariablesModel.new RubrosVariablesFocusTraversalPolicy(this);
			
			//rubrosvariablesFocusTraversalPolicy.setrubrosvariablesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rubrosvariablesModel);
			
			
			this.jContentPaneDetalleRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRubrosVariables = new GridBagLayout();	
			this.jContentPaneDetalleRubrosVariables.setLayout(gridaBagLayoutDetalleRubrosVariables);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubrosVariables = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
				this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRubrosVariables.gridx = 0;
					
				
				this.jContentPaneDetalleRubrosVariables.add(jTtoolBarDetalleRubrosVariables, gridBagConstraintsRubrosVariables);								
				
}
			
			this.jScrollPanelDatosEdicionRubrosVariables=   new JScrollPane(jContentPaneDetalleRubrosVariables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubrosVariables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubrosVariables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubrosVariables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRubrosVariables=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubrosVariables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubrosVariables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubrosVariables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRubrosVariables.gridx = 0;
	        
			this.jContentPaneDetalleRubrosVariables.add(jPanelCamposRubrosVariables, gridBagConstraintsRubrosVariables);
			
			
			
			
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
						//&& rubrosvariablesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRubrosVariables= new GridBagConstraints();
						this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRubrosVariables.gridx = 0;
						this.jContentPaneDetalleRubrosVariables.add(this.jTabbedPaneRelacionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRubrosVariables.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRubrosVariables.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
					this.gridBagConstraintsRubrosVariables.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRubrosVariables.gridx = 0;
					
				
					this.jContentPaneDetalleRubrosVariables.add(jPanelCamposOcultosRubrosVariables, gridBagConstraintsRubrosVariables);
				
					this.jPanelCamposOcultosRubrosVariables.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRubrosVariables.gridx = 0;
	        this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRubrosVariables.add(this.jPanelAccionesFormularioRubrosVariables, this.gridBagConstraintsRubrosVariables);							
			
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
	        this.gridBagConstraintsRubrosVariables.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRubrosVariables.gridx = 0;
	        
			
			this.jContentPaneDetalleRubrosVariables.add(this.jPanelAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRubrosVariables);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRubrosVariables=   new JScrollPane(this.jPanelCamposRubrosVariables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubrosVariables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubrosVariables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubrosVariables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRubrosVariables.gridx = 0;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRubrosVariables.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubrosVariables.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRubrosVariables, this.gridBagConstraintsRubrosVariables);			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubrosVariables.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRubrosVariables;//jContentPane;
		
		return jScrollPanelDatosEdicionRubrosVariables;
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
