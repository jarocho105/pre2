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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.DetalleEvaluacionNomiConstantesFunciones;

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
public class DetalleEvaluacionNomiDetalleFormJInternalFrame extends DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleEvaluacionNomi;
	
	protected JMenuBar jmenuBarDetalleDetalleEvaluacionNomi;
	
	protected JMenu jmenuDetalleDetalleEvaluacionNomi;
	protected JMenu jmenuDetalleArchivoDetalleEvaluacionNomi;
	protected JMenu jmenuDetalleAccionesDetalleEvaluacionNomi;
	protected JMenu jmenuDetalleDatosDetalleEvaluacionNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleEvaluacionNomi;	
	protected GridBagConstraints gridBagConstraintsDetalleEvaluacionNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleEvaluacionNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionnomi="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntanomi="";
	
	public DetalleEvaluacionNomiSessionBean detalleevaluacionnomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public PreguntaNomiSessionBean preguntanomiSessionBean;	
	
	public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic;
	
	public JScrollPane jScrollPanelDatosDetalleEvaluacionNomi;
	public JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionNomi;
	public JScrollPane jScrollPanelDatosGeneralDetalleEvaluacionNomi;
	
	protected JPanel jPanelCamposDetalleEvaluacionNomi;    
	protected JPanel jPanelCamposOcultosDetalleEvaluacionNomi;    	
	protected JPanel jPanelAccionesDetalleEvaluacionNomi;
	protected JPanel jPanelAccionesFormularioDetalleEvaluacionNomi;
    
	
	
	protected Integer iXPanelCamposDetalleEvaluacionNomi=0;
	protected Integer iYPanelCamposDetalleEvaluacionNomi=0;
	
	protected Integer iXPanelCamposOcultosDetalleEvaluacionNomi=0;
	protected Integer iYPanelCamposOcultosDetalleEvaluacionNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleEvaluacionNomi;
	public JButton jButtonModificarDetalleEvaluacionNomi;
	public JButton jButtonActualizarDetalleEvaluacionNomi;
    public JButton jButtonEliminarDetalleEvaluacionNomi;
	public JButton jButtonCancelarDetalleEvaluacionNomi;
    public JButton jButtonGuardarCambiosDetalleEvaluacionNomi;
	public JButton jButtonGuardarCambiosTablaDetalleEvaluacionNomi;
	protected JButton jButtonCerrarDetalleEvaluacionNomi;
	
	
	protected JButton jButtonProcesarInformacionDetalleEvaluacionNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleEvaluacionNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleEvaluacionNomi;
	protected JButton jButtonModificarToolBarDetalleEvaluacionNomi;
	protected JButton jButtonActualizarToolBarDetalleEvaluacionNomi;
    protected JButton jButtonEliminarToolBarDetalleEvaluacionNomi;
	protected JButton jButtonCancelarToolBarDetalleEvaluacionNomi;
    protected JButton jButtonGuardarCambiosToolBarDetalleEvaluacionNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleEvaluacionNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleEvaluacionNomi;
	protected JButton jButtonCerrarToolBarDetalleEvaluacionNomi;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemModificarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemActualizarDetalleEvaluacionNomi;
    protected JMenuItem jMenuItemEliminarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemCancelarDetalleEvaluacionNomi;
    protected JMenuItem jMenuItemGuardarCambiosDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemCerrarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleCerrarDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleEvaluacionNomi;
	protected JMenuItem jMenuItemMostrarOcultarDetalleEvaluacionNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleEvaluacionNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleEvaluacionNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleEvaluacionNomi;
	public JLabel jLabelIdDetalleEvaluacionNomi;
	public JLabel jLabelidDetalleEvaluacionNomi;
	public JButton jButtonidDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelrespuestaDetalleEvaluacionNomi;
	public JLabel jLabelrespuestaDetalleEvaluacionNomi;
	public JTextArea jTextArearespuestaDetalleEvaluacionNomi;
	public JScrollPane jscrollPanerespuestaDetalleEvaluacionNomi;
	public JButton jButtonrespuestaDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelrespuesta_valorDetalleEvaluacionNomi;
	public JLabel jLabelrespuesta_valorDetalleEvaluacionNomi;
	public JTextField jTextFieldrespuesta_valorDetalleEvaluacionNomi;
	public JButton jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica1DetalleEvaluacionNomi;
	public JLabel jLabelcalifica1DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica1DetalleEvaluacionNomi;
	public JButton jButtoncalifica1DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica2DetalleEvaluacionNomi;
	public JLabel jLabelcalifica2DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica2DetalleEvaluacionNomi;
	public JButton jButtoncalifica2DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica3DetalleEvaluacionNomi;
	public JLabel jLabelcalifica3DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica3DetalleEvaluacionNomi;
	public JButton jButtoncalifica3DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica4DetalleEvaluacionNomi;
	public JLabel jLabelcalifica4DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica4DetalleEvaluacionNomi;
	public JButton jButtoncalifica4DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica5DetalleEvaluacionNomi;
	public JLabel jLabelcalifica5DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica5DetalleEvaluacionNomi;
	public JButton jButtoncalifica5DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica6DetalleEvaluacionNomi;
	public JLabel jLabelcalifica6DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica6DetalleEvaluacionNomi;
	public JButton jButtoncalifica6DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica7DetalleEvaluacionNomi;
	public JLabel jLabelcalifica7DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica7DetalleEvaluacionNomi;
	public JButton jButtoncalifica7DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica8DetalleEvaluacionNomi;
	public JLabel jLabelcalifica8DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica8DetalleEvaluacionNomi;
	public JButton jButtoncalifica8DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica9DetalleEvaluacionNomi;
	public JLabel jLabelcalifica9DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica9DetalleEvaluacionNomi;
	public JButton jButtoncalifica9DetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelcalifica10DetalleEvaluacionNomi;
	public JLabel jLabelcalifica10DetalleEvaluacionNomi;
	public JCheckBox jCheckBoxcalifica10DetalleEvaluacionNomi;
	public JButton jButtoncalifica10DetalleEvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleEvaluacionNomi;
	public JLabel jLabelid_empresaDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleEvaluacionNomi;
	public JButton jButtonid_empresaDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empresaDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_evaluacion_nomiDetalleEvaluacionNomi;
	public JLabel jLabelid_evaluacion_nomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi;
	public JButton jButtonid_evaluacion_nomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomiDetalleEvaluacionNomi;
	public JLabel jLabelid_formato_nomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiDetalleEvaluacionNomi;
	public JButton jButtonid_formato_nomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_pregunta_nomiDetalleEvaluacionNomi;
	public JLabel jLabelid_pregunta_nomiDetalleEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_nomiDetalleEvaluacionNomi;
	public JButton jButtonid_pregunta_nomiDetalleEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleEvaluacionNomi;
	
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
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleEvaluacionNomi=new JPanel();
				this.jPanelAccionesFormularioDetalleEvaluacionNomi=new JPanel();
				this.jmenuBarDetalleDetalleEvaluacionNomi=new JMenuBar();
				this.jTtoolBarDetalleDetalleEvaluacionNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleEvaluacionNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleEvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleEvaluacionNomi() {
		return this.jButtonActualizarToolBarDetalleEvaluacionNomi;
	}
	
	public JButton getjButtonEliminarToolBarDetalleEvaluacionNomi() {
		return this.jButtonEliminarToolBarDetalleEvaluacionNomi;
	}
	
	public JButton getjButtonCancelarToolBarDetalleEvaluacionNomi() {
		return this.jButtonCancelarToolBarDetalleEvaluacionNomi;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleEvaluacionNomi() {
		return this.jButtonProcesarInformacionDetalleEvaluacionNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleEvaluacionNomi)	{
		this.jButtonProcesarInformacionDetalleEvaluacionNomi = jButtonProcesarInformacionDetalleEvaluacionNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleEvaluacionNomi() {
		return this.jComboBoxTiposAccionesDetalleEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposRelacionesDetalleEvaluacionNomi) {
		this.jComboBoxTiposRelacionesDetalleEvaluacionNomi = jComboBoxTiposRelacionesDetalleEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesDetalleEvaluacionNomi) {
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi = jComboBoxTiposAccionesDetalleEvaluacionNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleEvaluacionNomi() {
		return this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi) {
		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi = jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
		
		this.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleEvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleEvaluacionNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Evaluacion Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleEvaluacionNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleEvaluacionNomi=new JButtonMe();
				this.jButtonModificarToolBarDetalleEvaluacionNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi,
							"actualizar","actualizar","Actualizar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi,
							"eliminar","eliminar","Eliminar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi,
							"cancelar","cancelar","Cancelar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleEvaluacionNomi,this.jTtoolBarDetalleDetalleEvaluacionNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleEvaluacionNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleEvaluacionNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleEvaluacionNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleEvaluacionNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleEvaluacionNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleEvaluacionNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleEvaluacionNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleEvaluacionNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleEvaluacionNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleEvaluacionNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleEvaluacionNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleEvaluacionNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleEvaluacionNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleEvaluacionNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleEvaluacionNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleEvaluacionNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleEvaluacionNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleEvaluacionNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleEvaluacionNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleEvaluacionNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleEvaluacionNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleEvaluacionNomi.add(this.jMenuItemDetalleCerrarDetalleEvaluacionNomi);
		
		this.jmenuDetalleAccionesDetalleEvaluacionNomi.add(this.jMenuItemActualizarDetalleEvaluacionNomi);
		this.jmenuDetalleAccionesDetalleEvaluacionNomi.add(this.jMenuItemEliminarDetalleEvaluacionNomi);
		this.jmenuDetalleAccionesDetalleEvaluacionNomi.add(this.jMenuItemCancelarDetalleEvaluacionNomi);		
		
		//this.jmenuDetalleDatosDetalleEvaluacionNomi.add(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionNomi);				
		this.jmenuDetalleDatosDetalleEvaluacionNomi.add(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionNomi);				
				
		//this.jmenuDetalleAccionesDetalleEvaluacionNomi.add(this.jMenuItemGuardarCambiosDetalleEvaluacionNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleEvaluacionNomi.add(this.jmenuDetalleArchivoDetalleEvaluacionNomi);		
		this.jmenuBarDetalleDetalleEvaluacionNomi.add(this.jmenuDetalleAccionesDetalleEvaluacionNomi);		
		this.jmenuBarDetalleDetalleEvaluacionNomi.add(this.jmenuDetalleDatosDetalleEvaluacionNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleEvaluacionNomi);				
	}
	
	
	public void inicializarElementosCamposDetalleEvaluacionNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleEvaluacionNomi = new JLabelMe();
		jLabelIdDetalleEvaluacionNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleEvaluacionNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleEvaluacionNomi= new GridBagLayout();

		this.jPanelidDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);

		jLabelidDetalleEvaluacionNomi = new JLabel();
		jLabelidDetalleEvaluacionNomi.setText("Id");

		jLabelidDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrespuestaDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelrespuestaDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA+" : *");
		this.jLabelrespuestaDetalleEvaluacionNomi.setToolTipText("Respuesta");
		this.jLabelrespuestaDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrespuestaDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrespuestaDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrespuestaDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrespuestaDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrespuestaDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTA);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelrespuestaDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jTextArearespuestaDetalleEvaluacionNomi= new JTextAreaMe();
		jTextArearespuestaDetalleEvaluacionNomi.setEnabled(false);
		jTextArearespuestaDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearespuestaDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearespuestaDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearespuestaDetalleEvaluacionNomi.setLineWrap(true);
		jTextArearespuestaDetalleEvaluacionNomi.setWrapStyleWord(true);
		jTextArearespuestaDetalleEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearespuestaDetalleEvaluacionNomi.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextArearespuestaDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerespuestaDetalleEvaluacionNomi = new JScrollPane(jTextArearespuestaDetalleEvaluacionNomi);
		jscrollPanerespuestaDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanerespuestaDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanerespuestaDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrespuestaDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearespuestaDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearespuestaDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"respuestaDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrespuestaDetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelrespuesta_valorDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelrespuesta_valorDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR+" : *");
		this.jLabelrespuesta_valorDetalleEvaluacionNomi.setToolTipText("Respuesta Valor");
		this.jLabelrespuesta_valorDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelrespuesta_valorDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelrespuesta_valorDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelrespuesta_valorDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrespuesta_valorDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrespuesta_valorDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_RESPUESTAVALOR);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelrespuesta_valorDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jTextFieldrespuesta_valorDetalleEvaluacionNomi= new JTextFieldMe();
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.setEnabled(false);
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrespuesta_valorDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldrespuesta_valorDetalleEvaluacionNomi.setText("0.0");

		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrespuesta_valorDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"respuesta_valorDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica1DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica1DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1+" : *");
		this.jLabelcalifica1DetalleEvaluacionNomi.setToolTipText("Califica1");
		this.jLabelcalifica1DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica1DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica1DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica1DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica1DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica1DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA1);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica1DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica1DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica1DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica1DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica1DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica1DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica1DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica1DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica1DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica1DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica1DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica1DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica2DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica2DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2+" : *");
		this.jLabelcalifica2DetalleEvaluacionNomi.setToolTipText("Califica2");
		this.jLabelcalifica2DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica2DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica2DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica2DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica2DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica2DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA2);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica2DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica2DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica2DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica2DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica2DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica2DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica2DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica2DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica2DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica2DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica2DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica2DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica3DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica3DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3+" : *");
		this.jLabelcalifica3DetalleEvaluacionNomi.setToolTipText("Califica3");
		this.jLabelcalifica3DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica3DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica3DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica3DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica3DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica3DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA3);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica3DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica3DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica3DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica3DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica3DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica3DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica3DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica3DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica3DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica3DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica3DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica3DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica4DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica4DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4+" : *");
		this.jLabelcalifica4DetalleEvaluacionNomi.setToolTipText("Califica4");
		this.jLabelcalifica4DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica4DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica4DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica4DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica4DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica4DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA4);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica4DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica4DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica4DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica4DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica4DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica4DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica4DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica4DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica4DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica4DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica4DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica4DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica5DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica5DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5+" : *");
		this.jLabelcalifica5DetalleEvaluacionNomi.setToolTipText("Califica5");
		this.jLabelcalifica5DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica5DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica5DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica5DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica5DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica5DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA5);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica5DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica5DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica5DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica5DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica5DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica5DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica5DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica5DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica5DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica5DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica5DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica5DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica6DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica6DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6+" : *");
		this.jLabelcalifica6DetalleEvaluacionNomi.setToolTipText("Califica6");
		this.jLabelcalifica6DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica6DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica6DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica6DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica6DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica6DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA6);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica6DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica6DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica6DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica6DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica6DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica6DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica6DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica6DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica6DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica6DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica6DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica6DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica7DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica7DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7+" : *");
		this.jLabelcalifica7DetalleEvaluacionNomi.setToolTipText("Califica7");
		this.jLabelcalifica7DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica7DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica7DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica7DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica7DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica7DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA7);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica7DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica7DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica7DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica7DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica7DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica7DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica7DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica7DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica7DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica7DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica7DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica7DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica8DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica8DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8+" : *");
		this.jLabelcalifica8DetalleEvaluacionNomi.setToolTipText("Califica8");
		this.jLabelcalifica8DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica8DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica8DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica8DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica8DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica8DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA8);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica8DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica8DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica8DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica8DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica8DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica8DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica8DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica8DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica8DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica8DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica8DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica8DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica9DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica9DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9+" : *");
		this.jLabelcalifica9DetalleEvaluacionNomi.setToolTipText("Califica9");
		this.jLabelcalifica9DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica9DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica9DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica9DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica9DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica9DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA9);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica9DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica9DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica9DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica9DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica9DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica9DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica9DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica9DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica9DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica9DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica9DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica9DetalleEvaluacionNomiBusqueda.setVisible(false);		}


					
		this.jLabelcalifica10DetalleEvaluacionNomi = new JLabelMe();
		this.jLabelcalifica10DetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10+" : *");
		this.jLabelcalifica10DetalleEvaluacionNomi.setToolTipText("Califica10");
		this.jLabelcalifica10DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica10DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalifica10DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalifica10DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalifica10DetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalifica10DetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_CALIFICA10);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelcalifica10DetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jCheckBoxcalifica10DetalleEvaluacionNomi= new JCheckBoxMe();
		jCheckBoxcalifica10DetalleEvaluacionNomi.setEnabled(false);

		jCheckBoxcalifica10DetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica10DetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcalifica10DetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcalifica10DetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalifica10DetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcalifica10DetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcalifica10DetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"califica10DetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalifica10DetalleEvaluacionNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleEvaluacionNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelid_empresaDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleEvaluacionNomi.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelid_empresaDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jComboBoxid_empresaDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empresaDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleEvaluacionNomi.setEnabled(false);

		this.jButtonid_empresaDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonid_empresaDetalleEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionNomi"));

		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setText("U");
		this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionNomiUpdate"));



					
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI+" : *");
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi.setToolTipText("Evaluacion Nomi");
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_evaluacion_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDEVALUACIONNOMI);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_nomiDetalleEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_nomiDetalleEvaluacionNomi"));

		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_nomiDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setText("U");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_nomiDetalleEvaluacionNomiUpdate"));



					
		this.jLabelid_formato_nomiDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelid_formato_nomiDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI+" : *");
		this.jLabelid_formato_nomiDetalleEvaluacionNomi.setToolTipText("Formato Nomi");
		this.jLabelid_formato_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomiDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelid_formato_nomiDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jComboBoxid_formato_nomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomiDetalleEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiDetalleEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiDetalleEvaluacionNomi"));

		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setText("U");
		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomiDetalleEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomiDetalleEvaluacionNomiUpdate"));



					
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi = new JLabelMe();
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi.setText(""+DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI+" : *");
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi.setToolTipText("Pregunta Nomi");
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pregunta_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pregunta_nomiDetalleEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.setToolTipText(DetalleEvaluacionNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
		this.gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.setLayout(this.gridaBagLayoutDetalleEvaluacionNomi);


		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_nomiDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi= new JButtonMe();
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setText("Buscar");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiDetalleEvaluacionNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiDetalleEvaluacionNomi"));

		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda= new JButtonMe();
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setText("U");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiDetalleEvaluacionNomiBusqueda"));

		if(this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda.setVisible(false);		}

		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate= new JButtonMe();
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setText("U");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_nomiDetalleEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_nomiDetalleEvaluacionNomiUpdate"));



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
		//this.jInternalFrameDetalleDetalleEvaluacionNomi = new DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Evaluacion Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleEvaluacionNomi= new GridBagLayout();
		

		
		String sToolTipDetalleEvaluacionNomi="";
		sToolTipDetalleEvaluacionNomi=DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleEvaluacionNomi+="(Nomina.DetalleEvaluacionNomi)";
		}
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleEvaluacionNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonModificarDetalleEvaluacionNomi = new JButtonMe();
        this.jButtonActualizarDetalleEvaluacionNomi = new JButtonMe();
        this.jButtonEliminarDetalleEvaluacionNomi = new JButtonMe();
        this.jButtonCancelarDetalleEvaluacionNomi = new JButtonMe();
        this.jButtonGuardarCambiosDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarDetalleEvaluacionNomi = new JButtonMe();
		
		this.jScrollPanelDatosDetalleEvaluacionNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleEvaluacionNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleEvaluacionNomi = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Evaluacion Nomi";
		
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleEvaluacionNomi.setName("jPanelCamposDetalleEvaluacionNomi"); 

		this.jPanelCamposOcultosDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleEvaluacionNomi.setName("jPanelCamposOcultosDetalleEvaluacionNomi"); 

        this.jPanelAccionesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesDetalleEvaluacionNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleEvaluacionNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleEvaluacionNomi.setText("Nuevo");
		this.jButtonModificarDetalleEvaluacionNomi.setText("Editar");
        this.jButtonActualizarDetalleEvaluacionNomi.setText("Actualizar");
        this.jButtonEliminarDetalleEvaluacionNomi.setText("Eliminar");
        this.jButtonCancelarDetalleEvaluacionNomi.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleEvaluacionNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setText("Guardar");
		this.jButtonCerrarDetalleEvaluacionNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleEvaluacionNomi,"nuevo_button","Nuevo",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleEvaluacionNomi,"modificar_button","Editar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleEvaluacionNomi,"actualizar_button","Actualizar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleEvaluacionNomi,"eliminar_button","Eliminar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleEvaluacionNomi,"cancelar_button","Cancelar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleEvaluacionNomi,"guardarcambios_button","Guardar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi,"guardarcambiostabla_button","Guardar",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleEvaluacionNomi,"cerrar_button","Salir",this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleEvaluacionNomi.setToolTipText("Nuevo"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleEvaluacionNomi.setToolTipText("Editar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleEvaluacionNomi.setToolTipText("Actualizar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleEvaluacionNomi.setToolTipText("Eliminar)"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleEvaluacionNomi.setToolTipText("Cancelar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleEvaluacionNomi.setToolTipText("Guardar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.setToolTipText("Guardar"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleEvaluacionNomi.setToolTipText("Salir"+" "+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleEvaluacionNomi";
		inputMap = this.jButtonNuevoDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleEvaluacionNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleEvaluacionNomi";
		inputMap = this.jButtonActualizarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleEvaluacionNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleEvaluacionNomi";
		inputMap = this.jButtonEliminarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleEvaluacionNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleEvaluacionNomi";
		inputMap = this.jButtonCancelarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleEvaluacionNomi"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleEvaluacionNomi";
		inputMap = this.jButtonCerrarDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleEvaluacionNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleEvaluacionNomi";
		inputMap = this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleEvaluacionNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi.setToolTipText("Nuevo DetalleEvaluacionNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi.setToolTipText("Sin Cerrar Ventana DetalleEvaluacionNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleEvaluacionNomi = new JLabelMe();
		
		this.jLabelAccionesDetalleEvaluacionNomi.setText("Acciones");		
		this.jLabelAccionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleEvaluacionNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleEvaluacionNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleEvaluacionNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleEvaluacionNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleEvaluacionNomi = new GridBagLayout();
		
		this.jPanelCamposDetalleEvaluacionNomi.setLayout(gridaBagLayoutCamposDetalleEvaluacionNomi);
		this.jPanelCamposOcultosDetalleEvaluacionNomi.setLayout(gridaBagLayoutCamposOcultosDetalleEvaluacionNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleEvaluacionNomi.add(jLabelIdDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleEvaluacionNomi.add(jLabelidDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleEvaluacionNomi.add(jLabelid_empresaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleEvaluacionNomi.add(jButtonid_empresaDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleEvaluacionNomi.add(jButtonid_empresaDetalleEvaluacionNomiUpdate, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleEvaluacionNomi.add(jComboBoxid_empresaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.add(jLabelid_evaluacion_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.add(jButtonid_evaluacion_nomiDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.add(jButtonid_evaluacion_nomiDetalleEvaluacionNomiUpdate, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi.add(jComboBoxid_evaluacion_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomiDetalleEvaluacionNomi.add(jLabelid_formato_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiDetalleEvaluacionNomi.add(jButtonid_formato_nomiDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomiDetalleEvaluacionNomi.add(jButtonid_formato_nomiDetalleEvaluacionNomiUpdate, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomiDetalleEvaluacionNomi.add(jComboBoxid_formato_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.add(jLabelid_pregunta_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.add(jButtonid_pregunta_nomiDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.add(jButtonid_pregunta_nomiDetalleEvaluacionNomiUpdate, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pregunta_nomiDetalleEvaluacionNomi.add(jComboBoxid_pregunta_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrespuestaDetalleEvaluacionNomi.add(jLabelrespuestaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelrespuestaDetalleEvaluacionNomi.add(jButtonrespuestaDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrespuestaDetalleEvaluacionNomi.add(jscrollPanerespuestaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrespuesta_valorDetalleEvaluacionNomi.add(jLabelrespuesta_valorDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelrespuesta_valorDetalleEvaluacionNomi.add(jButtonrespuesta_valorDetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrespuesta_valorDetalleEvaluacionNomi.add(jTextFieldrespuesta_valorDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica1DetalleEvaluacionNomi.add(jLabelcalifica1DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica1DetalleEvaluacionNomi.add(jButtoncalifica1DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica1DetalleEvaluacionNomi.add(jCheckBoxcalifica1DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica2DetalleEvaluacionNomi.add(jLabelcalifica2DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica2DetalleEvaluacionNomi.add(jButtoncalifica2DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica2DetalleEvaluacionNomi.add(jCheckBoxcalifica2DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica3DetalleEvaluacionNomi.add(jLabelcalifica3DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica3DetalleEvaluacionNomi.add(jButtoncalifica3DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica3DetalleEvaluacionNomi.add(jCheckBoxcalifica3DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica4DetalleEvaluacionNomi.add(jLabelcalifica4DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica4DetalleEvaluacionNomi.add(jButtoncalifica4DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica4DetalleEvaluacionNomi.add(jCheckBoxcalifica4DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica5DetalleEvaluacionNomi.add(jLabelcalifica5DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica5DetalleEvaluacionNomi.add(jButtoncalifica5DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica5DetalleEvaluacionNomi.add(jCheckBoxcalifica5DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica6DetalleEvaluacionNomi.add(jLabelcalifica6DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica6DetalleEvaluacionNomi.add(jButtoncalifica6DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica6DetalleEvaluacionNomi.add(jCheckBoxcalifica6DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica7DetalleEvaluacionNomi.add(jLabelcalifica7DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica7DetalleEvaluacionNomi.add(jButtoncalifica7DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica7DetalleEvaluacionNomi.add(jCheckBoxcalifica7DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica8DetalleEvaluacionNomi.add(jLabelcalifica8DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica8DetalleEvaluacionNomi.add(jButtoncalifica8DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica8DetalleEvaluacionNomi.add(jCheckBoxcalifica8DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica9DetalleEvaluacionNomi.add(jLabelcalifica9DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica9DetalleEvaluacionNomi.add(jButtoncalifica9DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica9DetalleEvaluacionNomi.add(jCheckBoxcalifica9DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalifica10DetalleEvaluacionNomi.add(jLabelcalifica10DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalifica10DetalleEvaluacionNomi.add(jButtoncalifica10DetalleEvaluacionNomiBusqueda, this.gridBagConstraintsDetalleEvaluacionNomi);
	}

	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalifica10DetalleEvaluacionNomi.add(jCheckBoxcalifica10DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelidDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelid_evaluacion_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelid_formato_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelid_pregunta_nomiDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelrespuestaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelrespuesta_valorDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica1DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica2DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica3DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica4DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica5DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica6DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica7DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica8DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica9DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionNomi.add(this.jPanelcalifica10DetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposDetalleEvaluacionNomi=0;
		iYPanelCamposDetalleEvaluacionNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iYPanelCamposOcultosDetalleEvaluacionNomi;
	this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iXPanelCamposOcultosDetalleEvaluacionNomi++;
	this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleEvaluacionNomi.add(this.jPanelid_empresaDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);



	if(iXPanelCamposOcultosDetalleEvaluacionNomi % 2==0) {
		iXPanelCamposOcultosDetalleEvaluacionNomi=0;
		iYPanelCamposOcultosDetalleEvaluacionNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesDetalleEvaluacionNomi.setLayout(gridaBagLayoutAccionesDetalleEvaluacionNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleEvaluacionNomi.setLayout(gridaBagLayoutAccionesFormularioDetalleEvaluacionNomi);
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleEvaluacionNomi.add(this.jComboBoxTiposAccionesFormularioDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleEvaluacionNomi.add(this.jCheckBoxPostAccionNuevoDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleEvaluacionNomi.add(this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleevaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleEvaluacionNomi.add(this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonModificarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);							

		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonEliminarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonActualizarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);


		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonGuardarCambiosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);	
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionNomi.add(this.jButtonCancelarDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleEvaluacionNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleEvaluacionNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();						
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;		
			//this.gridBagConstraintsDetalleEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleEvaluacionNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =0;
		this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleEvaluacionNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleEvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleEvaluacionNomi = new DetalleEvaluacionNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Evaluacion Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Evaluacion Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Evaluacion Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleEvaluacionNomiModel detalleevaluacionnomiModel=new DetalleEvaluacionNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleEvaluacionNomiModel.DetalleEvaluacionNomiFocusTraversalPolicy detalleevaluacionnomiFocusTraversalPolicy = detalleevaluacionnomiModel.new DetalleEvaluacionNomiFocusTraversalPolicy(this);
			
			//detalleevaluacionnomiFocusTraversalPolicy.setdetalleevaluacionnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleevaluacionnomiModel);
			
			
			this.jContentPaneDetalleDetalleEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleEvaluacionNomi = new GridBagLayout();	
			this.jContentPaneDetalleDetalleEvaluacionNomi.setLayout(gridaBagLayoutDetalleDetalleEvaluacionNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleEvaluacionNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleEvaluacionNomi.add(jTtoolBarDetalleDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi=   new JScrollPane(jContentPaneDetalleDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	        
			this.jContentPaneDetalleDetalleEvaluacionNomi.add(jPanelCamposDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);
			
			
			
			
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
						&& detalleevaluacionnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleevaluacionnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleEvaluacionNomi= new GridBagConstraints();
						this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
						this.jContentPaneDetalleDetalleEvaluacionNomi.add(this.jTabbedPaneRelacionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleEvaluacionNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleEvaluacionNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
					this.gridBagConstraintsDetalleEvaluacionNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleEvaluacionNomi.add(jPanelCamposOcultosDetalleEvaluacionNomi, gridBagConstraintsDetalleEvaluacionNomi);
				
					this.jPanelCamposOcultosDetalleEvaluacionNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	        this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleEvaluacionNomi.add(this.jPanelAccionesFormularioDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);							
			
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
	        this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleEvaluacionNomi.add(this.jPanelAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleEvaluacionNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi=   new JScrollPane(this.jPanelCamposDetalleEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
			this.gridBagConstraintsDetalleEvaluacionNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleEvaluacionNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleEvaluacionNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);			
			
			this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
			
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		
			
		this.gridBagConstraintsDetalleEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionNomi, this.gridBagConstraintsDetalleEvaluacionNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleEvaluacionNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleEvaluacionNomi;
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
