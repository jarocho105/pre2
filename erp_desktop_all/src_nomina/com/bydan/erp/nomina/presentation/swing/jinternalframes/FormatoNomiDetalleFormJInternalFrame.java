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
import com.bydan.erp.nomina.util.FormatoNomiConstantesFunciones;

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
public class FormatoNomiDetalleFormJInternalFrame extends FormatoNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormatoNomi;
	
	protected JMenuBar jmenuBarDetalleFormatoNomi;
	
	protected JMenu jmenuDetalleFormatoNomi;
	protected JMenu jmenuDetalleArchivoFormatoNomi;
	protected JMenu jmenuDetalleAccionesFormatoNomi;
	protected JMenu jmenuDetalleDatosFormatoNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormatoNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormatoNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected PuntajeNomiBeanSwingJInternalFrame puntajenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puntajenomi="";
	
	public FormatoNomiSessionBean formatonomiSessionBean;
	
	

	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomiPreguntaNomi=false;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;

	public FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame=null;
	public FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomiFactorNomi=false;
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;

	public EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame=null;
	public EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEvaluacionNomi=false;
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;

	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;
	public DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionNomi=false;
	public DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public PuntajeNomiSessionBean puntajenomiSessionBean;	
	
	public FormatoNomiLogic formatonomiLogic;
	
	public JScrollPane jScrollPanelDatosFormatoNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomi;
	
	protected JPanel jPanelCamposFormatoNomi;    
	protected JPanel jPanelCamposOcultosFormatoNomi;    	
	protected JPanel jPanelAccionesFormatoNomi;
	protected JPanel jPanelAccionesFormularioFormatoNomi;
    
	
	
	protected Integer iXPanelCamposFormatoNomi=0;
	protected Integer iYPanelCamposFormatoNomi=0;
	
	protected Integer iXPanelCamposOcultosFormatoNomi=0;
	protected Integer iYPanelCamposOcultosFormatoNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormatoNomi;
	public JButton jButtonModificarFormatoNomi;
	public JButton jButtonActualizarFormatoNomi;
    public JButton jButtonEliminarFormatoNomi;
	public JButton jButtonCancelarFormatoNomi;
    public JButton jButtonGuardarCambiosFormatoNomi;
	public JButton jButtonGuardarCambiosTablaFormatoNomi;
	protected JButton jButtonCerrarFormatoNomi;
	
	
	protected JButton jButtonProcesarInformacionFormatoNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormatoNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormatoNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormatoNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomi;
	protected JButton jButtonModificarToolBarFormatoNomi;
	protected JButton jButtonActualizarToolBarFormatoNomi;
    protected JButton jButtonEliminarToolBarFormatoNomi;
	protected JButton jButtonCancelarToolBarFormatoNomi;
    protected JButton jButtonGuardarCambiosToolBarFormatoNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarFormatoNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomi;
	protected JButton jButtonCerrarToolBarFormatoNomi;
	
	protected JButton jButtonProcesarInformacionToolBarFormatoNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomi;
	protected JMenuItem jMenuItemModificarFormatoNomi;
	protected JMenuItem jMenuItemActualizarFormatoNomi;
    protected JMenuItem jMenuItemEliminarFormatoNomi;
	protected JMenuItem jMenuItemCancelarFormatoNomi;
    protected JMenuItem jMenuItemGuardarCambiosFormatoNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormatoNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormatoNomi;
	public JLabel jLabelIdFormatoNomi;
	public JLabel jLabelidFormatoNomi;
	public JButton jButtonidFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoFormatoNomi;
	public JLabel jLabelcodigoFormatoNomi;
	public JTextField jTextFieldcodigoFormatoNomi;
	public JButton jButtoncodigoFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreFormatoNomi;
	public JLabel jLabelnombreFormatoNomi;
	public JTextArea jTextAreanombreFormatoNomi;
	public JScrollPane jscrollPanenombreFormatoNomi;
	public JButton jButtonnombreFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelfechaFormatoNomi;
	public JLabel jLabelfechaFormatoNomi;
	//public JFormattedTextField jDateChooserfechaFormatoNomi;

	public JDateChooser jDateChooserfechaFormatoNomi;
	public JButton jButtonfechaFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelinstruccionesFormatoNomi;
	public JLabel jLabelinstruccionesFormatoNomi;
	public JTextArea jTextAreainstruccionesFormatoNomi;
	public JScrollPane jscrollPaneinstruccionesFormatoNomi;
	public JButton jButtoninstruccionesFormatoNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormatoNomi;
	public JLabel jLabelid_empresaFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormatoNomi;
	public JButton jButtonid_empresaFormatoNomi= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormatoNomi;
	public JLabel jLabelid_sucursalFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormatoNomi;
	public JButton jButtonid_sucursalFormatoNomi= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormatoNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraFormatoNomi;
	public JLabel jLabelid_estructuraFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFormatoNomi;
	public JButton jButtonid_estructuraFormatoNomi= new JButtonMe();
	public JButton jButtonid_estructuraFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFormatoNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFormatoNomiArbol= new JButtonMe();

	public JPanel jPanelid_puntaje_nomiFormatoNomi;
	public JLabel jLabelid_puntaje_nomiFormatoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puntaje_nomiFormatoNomi;
	public JButton jButtonid_puntaje_nomiFormatoNomi= new JButtonMe();
	public JButton jButtonid_puntaje_nomiFormatoNomiUpdate= new JButtonMe();
	public JButton jButtonid_puntaje_nomiFormatoNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormatoNomi;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormatoNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormatoNomi=new JPanel();
				this.jPanelAccionesFormularioFormatoNomi=new JPanel();
				this.jmenuBarDetalleFormatoNomi=new JMenuBar();
				this.jTtoolBarDetalleFormatoNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormatoNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormatoNomi() {
		return this.jButtonActualizarToolBarFormatoNomi;
	}
	
	public JButton getjButtonEliminarToolBarFormatoNomi() {
		return this.jButtonEliminarToolBarFormatoNomi;
	}
	
	public JButton getjButtonCancelarToolBarFormatoNomi() {
		return this.jButtonCancelarToolBarFormatoNomi;
	}		
	
	public JButton getjButtonProcesarInformacionFormatoNomi() {
		return this.jButtonProcesarInformacionFormatoNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomi)	{
		this.jButtonProcesarInformacionFormatoNomi = jButtonProcesarInformacionFormatoNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomi() {
		return this.jComboBoxTiposAccionesFormatoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomi) {
		this.jComboBoxTiposRelacionesFormatoNomi = jComboBoxTiposRelacionesFormatoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomi) {
		this.jComboBoxTiposAccionesFormatoNomi = jComboBoxTiposAccionesFormatoNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormatoNomi() {
		return this.jComboBoxTiposAccionesFormularioFormatoNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormatoNomi(
			JComboBox jComboBoxTiposAccionesFormularioFormatoNomi) {
		this.jComboBoxTiposAccionesFormularioFormatoNomi = jComboBoxTiposAccionesFormularioFormatoNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formatonomiSessionBean=new FormatoNomiSessionBean();
		
		this.formatonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		//this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		//this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		//this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
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
	
		FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormatoNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormatoNomi=new JButtonMe();
				this.jButtonModificarToolBarFormatoNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi,
							"actualizar","actualizar","Actualizar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi,
							"eliminar","eliminar","Eliminar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi,
							"cancelar","cancelar","Cancelar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormatoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormatoNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormatoNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormatoNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormatoNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormatoNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormatoNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormatoNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormatoNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormatoNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormatoNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormatoNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormatoNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormatoNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormatoNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormatoNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormatoNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormatoNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormatoNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormatoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormatoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormatoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormatoNomi.add(this.jMenuItemDetalleCerrarFormatoNomi);
		
		this.jmenuDetalleAccionesFormatoNomi.add(this.jMenuItemActualizarFormatoNomi);
		this.jmenuDetalleAccionesFormatoNomi.add(this.jMenuItemEliminarFormatoNomi);
		this.jmenuDetalleAccionesFormatoNomi.add(this.jMenuItemCancelarFormatoNomi);		
		
		//this.jmenuDetalleDatosFormatoNomi.add(this.jMenuItemDetalleAbrirOrderByFormatoNomi);				
		this.jmenuDetalleDatosFormatoNomi.add(this.jMenuItemDetalleMostarOcultarFormatoNomi);				
				
		//this.jmenuDetalleAccionesFormatoNomi.add(this.jMenuItemGuardarCambiosFormatoNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormatoNomi.add(this.jmenuDetalleArchivoFormatoNomi);		
		this.jmenuBarDetalleFormatoNomi.add(this.jmenuDetalleAccionesFormatoNomi);		
		this.jmenuBarDetalleFormatoNomi.add(this.jmenuDetalleDatosFormatoNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormatoNomi.add(this.jmenuDetalleFormatoNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormatoNomi);				
	}
	
	
	public void inicializarElementosCamposFormatoNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormatoNomi = new JLabelMe();
		jLabelIdFormatoNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormatoNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormatoNomi= new GridBagLayout();

		this.jPanelidFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);

		jLabelidFormatoNomi = new JLabel();
		jLabelidFormatoNomi.setText("Id");

		jLabelidFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoFormatoNomi = new JLabelMe();
		this.jLabelcodigoFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoFormatoNomi.setToolTipText("Codigo");
		this.jLabelcodigoFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelcodigoFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jTextFieldcodigoFormatoNomi= new JTextFieldMe();

		jTextFieldcodigoFormatoNomi.setEnabled(false);
		jTextFieldcodigoFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoFormatoNomiBusqueda= new JButtonMe();
		this.jButtoncodigoFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoFormatoNomiBusqueda.setText("U");
		this.jButtoncodigoFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoFormatoNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreFormatoNomi = new JLabelMe();
		this.jLabelnombreFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFormatoNomi.setToolTipText("Nombre");
		this.jLabelnombreFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelnombreFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jTextAreanombreFormatoNomi= new JTextAreaMe();
		jTextAreanombreFormatoNomi.setEnabled(false);
		jTextAreanombreFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormatoNomi.setLineWrap(true);
		jTextAreanombreFormatoNomi.setWrapStyleWord(true);
		jTextAreanombreFormatoNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFormatoNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFormatoNomi = new JScrollPane(jTextAreanombreFormatoNomi);
		jscrollPanenombreFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFormatoNomiBusqueda= new JButtonMe();
		this.jButtonnombreFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFormatoNomiBusqueda.setText("U");
		this.jButtonnombreFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFormatoNomiBusqueda.setVisible(false);		}


					
		this.jLabelfechaFormatoNomi = new JLabelMe();
		this.jLabelfechaFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFormatoNomi.setToolTipText("Fecha");
		this.jLabelfechaFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelfechaFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		//jFormattedTextFieldfechaFormatoNomi= new JFormattedTextFieldMe();

		jDateChooserfechaFormatoNomi= new JDateChooser();
		jDateChooserfechaFormatoNomi.setEnabled(false);
		jDateChooserfechaFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFormatoNomi.setDate(new Date());
		jDateChooserfechaFormatoNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFormatoNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFormatoNomiBusqueda= new JButtonMe();
		this.jButtonfechaFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFormatoNomiBusqueda.setText("U");
		this.jButtonfechaFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFormatoNomiBusqueda.setVisible(false);		}


					
		this.jLabelinstruccionesFormatoNomi = new JLabelMe();
		this.jLabelinstruccionesFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES+" : *");
		this.jLabelinstruccionesFormatoNomi.setToolTipText("Instrucciones");
		this.jLabelinstruccionesFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinstruccionesFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinstruccionesFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinstruccionesFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinstruccionesFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinstruccionesFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelinstruccionesFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jTextAreainstruccionesFormatoNomi= new JTextAreaMe();
		jTextAreainstruccionesFormatoNomi.setEnabled(false);
		jTextAreainstruccionesFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreainstruccionesFormatoNomi.setLineWrap(true);
		jTextAreainstruccionesFormatoNomi.setWrapStyleWord(true);
		jTextAreainstruccionesFormatoNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreainstruccionesFormatoNomi.setRows(10);

		FuncionesSwing.setBoldTextArea(jTextAreainstruccionesFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneinstruccionesFormatoNomi = new JScrollPane(jTextAreainstruccionesFormatoNomi);
		jscrollPaneinstruccionesFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneinstruccionesFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneinstruccionesFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoninstruccionesFormatoNomiBusqueda= new JButtonMe();
		this.jButtoninstruccionesFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninstruccionesFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninstruccionesFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninstruccionesFormatoNomiBusqueda.setText("U");
		this.jButtoninstruccionesFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninstruccionesFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninstruccionesFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreainstruccionesFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreainstruccionesFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"instruccionesFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninstruccionesFormatoNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormatoNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormatoNomi = new JLabelMe();
		this.jLabelid_empresaFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormatoNomi.setToolTipText("Empresa");
		this.jLabelid_empresaFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelid_empresaFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jComboBoxid_empresaFormatoNomi= new JComboBoxMe();
		jComboBoxid_empresaFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormatoNomi.setEnabled(false);

		this.jButtonid_empresaFormatoNomi= new JButtonMe();
		this.jButtonid_empresaFormatoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoNomi.setText("Buscar");
		this.jButtonid_empresaFormatoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormatoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomi"));

		this.jButtonid_empresaFormatoNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiBusqueda.setText("U");
		this.jButtonid_empresaFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormatoNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormatoNomiUpdate= new JButtonMe();
		this.jButtonid_empresaFormatoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoNomiUpdate.setText("U");
		this.jButtonid_empresaFormatoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormatoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoNomiUpdate"));



					
		this.jLabelid_sucursalFormatoNomi = new JLabelMe();
		this.jLabelid_sucursalFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormatoNomi.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelid_sucursalFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jComboBoxid_sucursalFormatoNomi= new JComboBoxMe();
		jComboBoxid_sucursalFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormatoNomi.setEnabled(false);

		this.jButtonid_sucursalFormatoNomi= new JButtonMe();
		this.jButtonid_sucursalFormatoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormatoNomi.setText("Buscar");
		this.jButtonid_sucursalFormatoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormatoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomi"));

		this.jButtonid_sucursalFormatoNomiBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiBusqueda.setText("U");
		this.jButtonid_sucursalFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormatoNomiBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormatoNomiUpdate= new JButtonMe();
		this.jButtonid_sucursalFormatoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormatoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormatoNomiUpdate.setText("U");
		this.jButtonid_sucursalFormatoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormatoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormatoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormatoNomiUpdate"));



					
		this.jLabelid_estructuraFormatoNomi = new JLabelMe();
		this.jLabelid_estructuraFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraFormatoNomi.setToolTipText("Estructura");
		this.jLabelid_estructuraFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelid_estructuraFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jComboBoxid_estructuraFormatoNomi= new JComboBoxMe();
		jComboBoxid_estructuraFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraFormatoNomi= new JButtonMe();
		this.jButtonid_estructuraFormatoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFormatoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFormatoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraFormatoNomi.setText("Buscar");
		this.jButtonid_estructuraFormatoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraFormatoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFormatoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFormatoNomi"));

		this.jButtonid_estructuraFormatoNomiBusqueda= new JButtonMe();
		this.jButtonid_estructuraFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraFormatoNomiBusqueda.setText("U");
		this.jButtonid_estructuraFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraFormatoNomiBusqueda.setVisible(false);		}

		this.jButtonid_estructuraFormatoNomiUpdate= new JButtonMe();
		this.jButtonid_estructuraFormatoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFormatoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraFormatoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraFormatoNomiUpdate.setText("U");
		this.jButtonid_estructuraFormatoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraFormatoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFormatoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFormatoNomiUpdate"));


		jButtonid_estructuraFormatoNomiArbol= new JButtonMe();
		jButtonid_estructuraFormatoNomiArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFormatoNomiArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFormatoNomiArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraFormatoNomiArbol.setText("Arbol");
		jButtonid_estructuraFormatoNomiArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraFormatoNomiArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraFormatoNomiArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraFormatoNomiArbol"));



					
		this.jLabelid_puntaje_nomiFormatoNomi = new JLabelMe();
		this.jLabelid_puntaje_nomiFormatoNomi.setText(""+FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI+" : *");
		this.jLabelid_puntaje_nomiFormatoNomi.setToolTipText("Puntaje Nomi");
		this.jLabelid_puntaje_nomiFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puntaje_nomiFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puntaje_nomiFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_puntaje_nomiFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_puntaje_nomiFormatoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_puntaje_nomiFormatoNomi.setToolTipText(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI);
		this.gridaBagLayoutFormatoNomi = new GridBagLayout();
		this.jPanelid_puntaje_nomiFormatoNomi.setLayout(this.gridaBagLayoutFormatoNomi);


		jComboBoxid_puntaje_nomiFormatoNomi= new JComboBoxMe();
		jComboBoxid_puntaje_nomiFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puntaje_nomiFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puntaje_nomiFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puntaje_nomiFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_puntaje_nomiFormatoNomi= new JButtonMe();
		this.jButtonid_puntaje_nomiFormatoNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puntaje_nomiFormatoNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puntaje_nomiFormatoNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puntaje_nomiFormatoNomi.setText("Buscar");
		this.jButtonid_puntaje_nomiFormatoNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_puntaje_nomiFormatoNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puntaje_nomiFormatoNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_puntaje_nomiFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puntaje_nomiFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puntaje_nomiFormatoNomi"));

		this.jButtonid_puntaje_nomiFormatoNomiBusqueda= new JButtonMe();
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setText("U");
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puntaje_nomiFormatoNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_puntaje_nomiFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puntaje_nomiFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puntaje_nomiFormatoNomiBusqueda"));

		if(this.formatonomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_puntaje_nomiFormatoNomiBusqueda.setVisible(false);		}

		this.jButtonid_puntaje_nomiFormatoNomiUpdate= new JButtonMe();
		this.jButtonid_puntaje_nomiFormatoNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puntaje_nomiFormatoNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puntaje_nomiFormatoNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puntaje_nomiFormatoNomiUpdate.setText("U");
		this.jButtonid_puntaje_nomiFormatoNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_puntaje_nomiFormatoNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puntaje_nomiFormatoNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_puntaje_nomiFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puntaje_nomiFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puntaje_nomiFormatoNomiUpdate"));



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
		//this.jInternalFrameDetalleFormatoNomi = new FormatoNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formato Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomi= new GridBagLayout();
		

		
		String sToolTipFormatoNomi="";
		sToolTipFormatoNomi=FormatoNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomi+="(Nomina.FormatoNomi)";
		}
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormatoNomi = new JButtonMe();
		this.jButtonModificarFormatoNomi = new JButtonMe();
        this.jButtonActualizarFormatoNomi = new JButtonMe();
        this.jButtonEliminarFormatoNomi = new JButtonMe();
        this.jButtonCancelarFormatoNomi = new JButtonMe();
        this.jButtonGuardarCambiosFormatoNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormatoNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormatoNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralFormatoNomi = new JScrollPane();
				
		
		
		this.jPanelCamposFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi";
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormatoNomi.setName("jPanelCamposFormatoNomi"); 

		this.jPanelCamposOcultosFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormatoNomi.setName("jPanelCamposOcultosFormatoNomi"); 

        this.jPanelAccionesFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormatoNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormatoNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormatoNomi.setText("Nuevo");
		this.jButtonModificarFormatoNomi.setText("Editar");
        this.jButtonActualizarFormatoNomi.setText("Actualizar");
        this.jButtonEliminarFormatoNomi.setText("Eliminar");
        this.jButtonCancelarFormatoNomi.setText("Cancelar");
        this.jButtonGuardarCambiosFormatoNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormatoNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomi,"nuevo_button","Nuevo",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormatoNomi,"modificar_button","Editar",this.formatonomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormatoNomi,"actualizar_button","Actualizar",this.formatonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormatoNomi,"eliminar_button","Eliminar",this.formatonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormatoNomi,"cancelar_button","Cancelar",this.formatonomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormatoNomi,"guardarcambios_button","Guardar",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomi,"guardarcambiostabla_button","Guardar",this.formatonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomi,"cerrar_button","Salir",this.formatonomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormatoNomi.setToolTipText("Nuevo"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormatoNomi.setToolTipText("Editar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormatoNomi.setToolTipText("Actualizar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormatoNomi.setToolTipText("Eliminar)"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormatoNomi.setToolTipText("Cancelar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormatoNomi.setToolTipText("Guardar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormatoNomi.setToolTipText("Guardar"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomi.setToolTipText("Salir"+" "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomi";
		inputMap = this.jButtonNuevoFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormatoNomi";
		inputMap = this.jButtonActualizarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormatoNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarFormatoNomi";
		inputMap = this.jButtonEliminarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormatoNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarFormatoNomi";
		inputMap = this.jButtonCancelarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormatoNomi"));
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomi";
		inputMap = this.jButtonCerrarFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormatoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormatoNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormatoNomi.setToolTipText("Nuevo FormatoNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormatoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormatoNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormatoNomi.setToolTipText("Sin Cerrar Ventana FormatoNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormatoNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormatoNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormatoNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormatoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormatoNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormatoNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormatoNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormatoNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormatoNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormatoNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesFormatoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormatoNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormatoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormatoNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormatoNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormatoNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormatoNomi = new GridBagLayout();
		
		this.jPanelCamposFormatoNomi.setLayout(gridaBagLayoutCamposFormatoNomi);
		this.jPanelCamposOcultosFormatoNomi.setLayout(gridaBagLayoutCamposOcultosFormatoNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormatoNomi.add(jLabelIdFormatoNomi, this.gridBagConstraintsFormatoNomi);



	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormatoNomi.add(jLabelidFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormatoNomi.add(jLabelid_empresaFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomi.add(jButtonid_empresaFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoNomi.add(jButtonid_empresaFormatoNomiUpdate, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormatoNomi.add(jComboBoxid_empresaFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormatoNomi.add(jLabelid_sucursalFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomi.add(jButtonid_sucursalFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormatoNomi.add(jButtonid_sucursalFormatoNomiUpdate, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormatoNomi.add(jComboBoxid_sucursalFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoFormatoNomi.add(jLabelcodigoFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoFormatoNomi.add(jButtoncodigoFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoFormatoNomi.add(jTextFieldcodigoFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFormatoNomi.add(jLabelnombreFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFormatoNomi.add(jButtonnombreFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFormatoNomi.add(jscrollPanenombreFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFormatoNomi.add(jLabelfechaFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFormatoNomi.add(jButtonfechaFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFormatoNomi.add(jDateChooserfechaFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinstruccionesFormatoNomi.add(jLabelinstruccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelinstruccionesFormatoNomi.add(jButtoninstruccionesFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinstruccionesFormatoNomi.add(jscrollPaneinstruccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraFormatoNomi.add(jLabelid_estructuraFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraFormatoNomi.add(jButtonid_estructuraFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraFormatoNomi.add(jButtonid_estructuraFormatoNomiUpdate, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraFormatoNomi.add(jComboBoxid_estructuraFormatoNomi, this.gridBagConstraintsFormatoNomi);


	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 0;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_puntaje_nomiFormatoNomi.add(jLabelid_puntaje_nomiFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 2;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puntaje_nomiFormatoNomi.add(jButtonid_puntaje_nomiFormatoNomiBusqueda, this.gridBagConstraintsFormatoNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = 3;
		this.gridBagConstraintsFormatoNomi.ipadx = 0;
		this.gridBagConstraintsFormatoNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puntaje_nomiFormatoNomi.add(jButtonid_puntaje_nomiFormatoNomiUpdate, this.gridBagConstraintsFormatoNomi);
	}

	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoNomi.gridy = 0;
	this.gridBagConstraintsFormatoNomi.gridx = 1;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_puntaje_nomiFormatoNomi.add(jComboBoxid_puntaje_nomiFormatoNomi, this.gridBagConstraintsFormatoNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelidFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelcodigoFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelnombreFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelfechaFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelinstruccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelid_estructuraFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoNomi.add(this.jPanelid_puntaje_nomiFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposFormatoNomi % 1==0) {
		iXPanelCamposFormatoNomi=0;
		iYPanelCamposFormatoNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposOcultosFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposOcultosFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomi.add(this.jPanelid_empresaFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposOcultosFormatoNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomi=0;
		iYPanelCamposOcultosFormatoNomi++;
	}
	this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoNomi.gridy = iYPanelCamposOcultosFormatoNomi;
	this.gridBagConstraintsFormatoNomi.gridx = iXPanelCamposOcultosFormatoNomi++;
	this.gridBagConstraintsFormatoNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoNomi.add(this.jPanelid_sucursalFormatoNomi, this.gridBagConstraintsFormatoNomi);



	if(iXPanelCamposOcultosFormatoNomi % 1==0) {
		iXPanelCamposOcultosFormatoNomi=0;
		iYPanelCamposOcultosFormatoNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomi.setLayout(gridaBagLayoutAccionesFormatoNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormatoNomi= new GridBagLayout();
		this.jPanelAccionesFormularioFormatoNomi.setLayout(gridaBagLayoutAccionesFormularioFormatoNomi);
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomi.add(this.jComboBoxTiposAccionesFormularioFormatoNomi, this.gridBagConstraintsFormatoNomi);

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoNomi.add(this.jCheckBoxPostAccionNuevoFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomi.add(this.jCheckBoxPostAccionSinCerrarFormatoNomi, this.gridBagConstraintsFormatoNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoNomi.add(this.jCheckBoxPostAccionSinMensajeFormatoNomi, this.gridBagConstraintsFormatoNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormatoNomi.add(this.jButtonModificarFormatoNomi, this.gridBagConstraintsFormatoNomi);							

		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormatoNomi.add(this.jButtonEliminarFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomi.add(this.jButtonActualizarFormatoNomi, this.gridBagConstraintsFormatoNomi);


		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoNomi.add(this.jButtonGuardarCambiosFormatoNomi, this.gridBagConstraintsFormatoNomi);	
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = 0;		
		this.gridBagConstraintsFormatoNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormatoNomi.add(this.jButtonCancelarFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomi.gridx =0;
		this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomi, this.gridBagConstraintsFormatoNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormatoNomi = new FormatoNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formato Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formato Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormatoNomiModel formatonomiModel=new FormatoNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//FormatoNomiModel.FormatoNomiFocusTraversalPolicy formatonomiFocusTraversalPolicy = formatonomiModel.new FormatoNomiFocusTraversalPolicy(this);
			
			//formatonomiFocusTraversalPolicy.setformatonomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formatonomiModel);
			
			
			this.jContentPaneDetalleFormatoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormatoNomi = new GridBagLayout();	
			this.jContentPaneDetalleFormatoNomi.setLayout(gridaBagLayoutDetalleFormatoNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormatoNomi.gridx = 0;
					
				
				this.jContentPaneDetalleFormatoNomi.add(jTtoolBarDetalleFormatoNomi, gridBagConstraintsFormatoNomi);								
				
}
			
			this.jScrollPanelDatosEdicionFormatoNomi=   new JScrollPane(jContentPaneDetalleFormatoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormatoNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormatoNomi.gridx = 0;
	        
			this.jContentPaneDetalleFormatoNomi.add(jPanelCamposFormatoNomi, gridBagConstraintsFormatoNomi);
			
			
			
			
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
						&& formatonomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(this.puedeCargarPorParteDetalleEvaluacionNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(this.puedeCargarPorParteEvaluacionNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(this.puedeCargarPorParteFormatoNomiFactorNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(this.puedeCargarPorParteFormatoNomiPreguntaNomi,false,-1);
					
					if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormatoNomi= new GridBagConstraints();
						this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormatoNomi.gridx = 0;
						this.jContentPaneDetalleFormatoNomi.add(this.jTabbedPaneRelacionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormatoNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormatoNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
					this.gridBagConstraintsFormatoNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormatoNomi.gridx = 0;
					
				
					this.jContentPaneDetalleFormatoNomi.add(jPanelCamposOcultosFormatoNomi, gridBagConstraintsFormatoNomi);
				
					this.jPanelCamposOcultosFormatoNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsFormatoNomi.gridx = 0;
	        this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormatoNomi.add(this.jPanelAccionesFormularioFormatoNomi, this.gridBagConstraintsFormatoNomi);							
			
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
	        this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsFormatoNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleFormatoNomi.add(this.jPanelAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormatoNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormatoNomi=   new JScrollPane(this.jPanelCamposFormatoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomi.gridx = 0;
			this.gridBagConstraintsFormatoNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormatoNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormatoNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormatoNomi, this.gridBagConstraintsFormatoNomi);			
			
			this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomi, this.gridBagConstraintsFormatoNomi);
			
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomi, this.gridBagConstraintsFormatoNomi);
		
			
		this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomi, this.gridBagConstraintsFormatoNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormatoNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionFormatoNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);
		this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);

		this.detalleevaluacionnomiBeanSwingJInternalFrame=null;//new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleevaluacionnomiBeanSwingJInternalFramePopup=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleevaluacionnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {

				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionnomiBeanSwingJInternalFrame.setdetalleevaluacionnomiSessionBean(this.detalleevaluacionnomiSessionBean);

				//this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomi.add(this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Detalle Evaluacion Nomis",this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomi.setComponentAt(iIndexTab,this.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionnomiBeanSwingJInternalFrame=null;//new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionNomi) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Detalle Evaluacion Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		this.evaluacionnomiSessionBean.setConGuardarRelaciones(false);
		this.evaluacionnomiSessionBean.setEsGuardarRelacionado(true);

		this.evaluacionnomiBeanSwingJInternalFrame=null;//new EvaluacionNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.evaluacionnomiBeanSwingJInternalFramePopup=new EvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.evaluacionnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {

				EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.evaluacionnomiSessionBean.setEsGuardarRelacionado(true);

				this.evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.evaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.evaluacionnomiBeanSwingJInternalFrame.setevaluacionnomiSessionBean(this.evaluacionnomiSessionBean);

				//this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomi.add(this.evaluacionnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Evaluacion Nomis",this.evaluacionnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomi.setComponentAt(iIndexTab,this.evaluacionnomiBeanSwingJInternalFrame.getContentPane());
				}

				//EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.evaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				this.evaluacionnomiBeanSwingJInternalFrame=null;//new EvaluacionNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEvaluacionNomi) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Evaluacion Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		this.formatonomifactornomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomifactornomiBeanSwingJInternalFrame=null;//new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomifactornomiBeanSwingJInternalFramePopup=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomifactornomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomifactornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomifactornomiBeanSwingJInternalFrame.setformatonomifactornomiSessionBean(this.formatonomifactornomiSessionBean);

				//this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomi.add(this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Formato Nomi Factor Nomis",this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomi.setComponentAt(iIndexTab,this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomifactornomiBeanSwingJInternalFrame=null;//new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomiFactorNomi) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Formato Nomi Factor Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setformatonomipreguntanomiSessionBean(this.formatonomipreguntanomiSessionBean);

				//this.gridBagConstraintsFormatoNomi = new GridBagConstraints();
				//this.gridBagConstraintsFormatoNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormatoNomi.gridx = 0;
				//this.jContentPaneDetalleFormatoNomi.add(this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormatoNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Formato Nomi Pregunta Nomis",this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormatoNomi.setComponentAt(iIndexTab,this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomiPreguntaNomi) {
					this.jTabbedPaneRelacionesFormatoNomi.add("Formato Nomi Pregunta Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(List<FormatoNomi> formatonomis,FormatoNomi formatonomi,FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.formatonomiLogic.getConnexion());

					formatonomipreguntanomiBeanSwingJInternalFrame.setformatonomisForeignKey(formatonomis);
					formatonomipreguntanomiBeanSwingJInternalFrame.setformatonomiForeignKey(formatonomi);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setlidFormatoNomiActual(formatonomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomipreguntanomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setid_formato_nomiFK_IdFormatoNomi(formatonomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomipreguntanomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiForeignKey(formatonomi,1,false,true,true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n",formatonomipreguntanomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomipreguntanomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomipreguntanomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("relacionado");
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomiPreguntaNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormatoNomiFactorNomiBeanSwingJInternalFrame(List<FormatoNomi> formatonomis,FormatoNomi formatonomi,FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomifactornomiBeanSwingJInternalFrame.getFormatoNomiFactorNomiLogic().setConnexion(this.formatonomiLogic.getConnexion());

					formatonomifactornomiBeanSwingJInternalFrame.setformatonomisForeignKey(formatonomis);
					formatonomifactornomiBeanSwingJInternalFrame.setformatonomiForeignKey(formatonomi);
					formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setlidFormatoNomiActual(formatonomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomifactornomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomiFactorNomi(formatonomifactornomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomifactornomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.setid_formato_nomiFK_IdFormatoNomi(formatonomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomifactornomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomifactornomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiForeignKey(formatonomi,1,false,true,true);
					formatonomifactornomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomifactornomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomi");
					formatonomifactornomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomi");
					formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n",formatonomifactornomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomifactornomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomifactornomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomifactornomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("relacionado");
					} else {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("no_relacionado");
					}

					formatonomifactornomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomiFactorNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEvaluacionNomiBeanSwingJInternalFrame(List<FormatoNomi> formatonomis,FormatoNomi formatonomi,EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					evaluacionnomiBeanSwingJInternalFrame.getEvaluacionNomiLogic().setConnexion(this.formatonomiLogic.getConnexion());

					evaluacionnomiBeanSwingJInternalFrame.setformatonomisForeignKey(formatonomis);
					evaluacionnomiBeanSwingJInternalFrame.setformatonomiForeignKey(formatonomi);
					evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
					evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setlidFormatoNomiActual(formatonomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					evaluacionnomiBeanSwingJInternalFrame.cargarCombosForeignKeyEvaluacionNomi(evaluacionnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					evaluacionnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomi(true);
					evaluacionnomiBeanSwingJInternalFrame.setid_formato_nomiFK_IdFormatoNomi(formatonomi.getId());

					if(!this.conCargarFormDetalle) {
						evaluacionnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					evaluacionnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiForeignKey(formatonomi,1,false,true,true);
					evaluacionnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					evaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomi");
					evaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomi");
					evaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionNomi(true);
					evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEvaluacionNomi("n",evaluacionnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, evaluacionnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					evaluacionnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					evaluacionnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionNomi("relacionado");
					} else {
						evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionNomi("no_relacionado");
					}

					evaluacionnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionEvaluacionNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(List<FormatoNomi> formatonomis,FormatoNomi formatonomi,DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionnomiBeanSwingJInternalFrame.getDetalleEvaluacionNomiLogic().setConnexion(this.formatonomiLogic.getConnexion());

					detalleevaluacionnomiBeanSwingJInternalFrame.setformatonomisForeignKey(formatonomis);
					detalleevaluacionnomiBeanSwingJInternalFrame.setformatonomiForeignKey(formatonomi);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setlidFormatoNomiActual(formatonomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionnomiBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionNomi(detalleevaluacionnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormatoNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setid_formato_nomiFK_IdFormatoNomi(formatonomi.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFormatoNomiForeignKey(formatonomi,1,false,true,true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormatoNomi");
					detalleevaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormatoNomi");
					detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleEvaluacionNomi("n",detalleevaluacionnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleevaluacionnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleevaluacionnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("relacionado");
					} else {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("no_relacionado");
					}

					detalleevaluacionnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleEvaluacionNomi().setVisible(false);

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
