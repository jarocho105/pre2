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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.EstadosResultadosPerdidasGananciasConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame extends EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadosResultadosPerdidasGanancias;
	
	protected JMenuBar jmenuBarDetalleEstadosResultadosPerdidasGanancias;
	
	protected JMenu jmenuDetalleEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuDetalleArchivoEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuDetalleAccionesEstadosResultadosPerdidasGanancias;
	protected JMenu jmenuDetalleDatosEstadosResultadosPerdidasGanancias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadosResultadosPerdidasGanancias;	
	protected GridBagConstraints gridBagConstraintsEstadosResultadosPerdidasGanancias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadosResultadosPerdidasGanancias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivelcuenta="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";
	
	public EstadosResultadosPerdidasGananciasSessionBean estadosresultadosperdidasgananciasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelCuentaSessionBean nivelcuentaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;	
	
	public EstadosResultadosPerdidasGananciasLogic estadosresultadosperdidasgananciasLogic;
	
	public JScrollPane jScrollPanelDatosEstadosResultadosPerdidasGanancias;
	public JScrollPane jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias;
	public JScrollPane jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias;
	
	protected JPanel jPanelCamposEstadosResultadosPerdidasGanancias;    
	protected JPanel jPanelCamposOcultosEstadosResultadosPerdidasGanancias;    	
	protected JPanel jPanelAccionesEstadosResultadosPerdidasGanancias;
	protected JPanel jPanelAccionesFormularioEstadosResultadosPerdidasGanancias;
    
	
	
	protected Integer iXPanelCamposEstadosResultadosPerdidasGanancias=0;
	protected Integer iYPanelCamposEstadosResultadosPerdidasGanancias=0;
	
	protected Integer iXPanelCamposOcultosEstadosResultadosPerdidasGanancias=0;
	protected Integer iYPanelCamposOcultosEstadosResultadosPerdidasGanancias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadosResultadosPerdidasGanancias;
	public JButton jButtonModificarEstadosResultadosPerdidasGanancias;
	public JButton jButtonActualizarEstadosResultadosPerdidasGanancias;
    public JButton jButtonEliminarEstadosResultadosPerdidasGanancias;
	public JButton jButtonCancelarEstadosResultadosPerdidasGanancias;
    public JButton jButtonGuardarCambiosEstadosResultadosPerdidasGanancias;
	public JButton jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCerrarEstadosResultadosPerdidasGanancias;
	
	
	protected JButton jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonModificarToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonActualizarToolBarEstadosResultadosPerdidasGanancias;
    protected JButton jButtonEliminarToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCancelarToolBarEstadosResultadosPerdidasGanancias;
    protected JButton jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadosResultadosPerdidasGanancias;
	protected JButton jButtonCerrarToolBarEstadosResultadosPerdidasGanancias;
	
	protected JButton jButtonProcesarInformacionToolBarEstadosResultadosPerdidasGanancias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemModificarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemActualizarEstadosResultadosPerdidasGanancias;
    protected JMenuItem jMenuItemEliminarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemCancelarEstadosResultadosPerdidasGanancias;
    protected JMenuItem jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemCerrarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadosResultadosPerdidasGanancias;
	protected JMenuItem jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadosResultadosPerdidasGanancias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadosResultadosPerdidasGanancias;
	public JLabel jLabelIdEstadosResultadosPerdidasGanancias;
	public JLabel jLabelidEstadosResultadosPerdidasGanancias;
	public JButton jButtonidEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadosResultadosPerdidasGanancias;
	public JLabel jLabelcodigoEstadosResultadosPerdidasGanancias;
	public JTextField jTextFieldcodigoEstadosResultadosPerdidasGanancias;
	public JButton jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadosResultadosPerdidasGanancias;
	public JLabel jLabelnombreEstadosResultadosPerdidasGanancias;
	public JTextArea jTextAreanombreEstadosResultadosPerdidasGanancias;
	public JScrollPane jscrollPanenombreEstadosResultadosPerdidasGanancias;
	public JButton jButtonnombreEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JLabel jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JTextArea jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JScrollPane jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JButton jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPaneldebito_inicialEstadosResultadosPerdidasGanancias;
	public JLabel jLabeldebito_inicialEstadosResultadosPerdidasGanancias;
	public JTextField jTextFielddebito_inicialEstadosResultadosPerdidasGanancias;
	public JButton jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_inicialEstadosResultadosPerdidasGanancias;
	public JLabel jLabelcredito_inicialEstadosResultadosPerdidasGanancias;
	public JTextField jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias;
	public JButton jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_inicialEstadosResultadosPerdidasGanancias;
	public JLabel jLabelsaldo_inicialEstadosResultadosPerdidasGanancias;
	public JTextField jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias;
	public JButton jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_empresaEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_empresaEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_ejercicioEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_ejercicioEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoEstadosResultadosPerdidasGanancias;
	public JLabel jLabelid_periodoEstadosResultadosPerdidasGanancias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoEstadosResultadosPerdidasGanancias;
	public JButton jButtonid_periodoEstadosResultadosPerdidasGanancias= new JButtonMe();
	public JButton jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
	public JButton jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadosResultadosPerdidasGanancias=new JPanel();
				this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias=new JPanel();
				this.jmenuBarDetalleEstadosResultadosPerdidasGanancias=new JMenuBar();
				this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosResultadosPerdidasGananciasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadosResultadosPerdidasGanancias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadosResultadosPerdidasGanancias() {
		return this.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias;
	}
	
	public JButton getjButtonEliminarToolBarEstadosResultadosPerdidasGanancias() {
		return this.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias;
	}
	
	public JButton getjButtonCancelarToolBarEstadosResultadosPerdidasGanancias() {
		return this.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias;
	}		
	
	public JButton getjButtonProcesarInformacionEstadosResultadosPerdidasGanancias() {
		return this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadosResultadosPerdidasGanancias)	{
		this.jButtonProcesarInformacionEstadosResultadosPerdidasGanancias = jButtonProcesarInformacionEstadosResultadosPerdidasGanancias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias = jComboBoxTiposRelacionesEstadosResultadosPerdidasGanancias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias = jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias() {
		return this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias(
			JComboBox jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias) {
		this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias = jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadosresultadosperdidasgananciasSessionBean=new EstadosResultadosPerdidasGananciasSessionBean();
		
		this.estadosresultadosperdidasgananciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosresultadosperdidasgananciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadosResultadosPerdidasGananciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadosResultadosPerdidasGananciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estados Resultados Perdidas Ganancias MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadosResultadosPerdidasGananciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadosResultadosPerdidasGanancias=new JButtonMe();
				this.jButtonModificarToolBarEstadosResultadosPerdidasGanancias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias,
							"actualizar","actualizar","Actualizar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias,
							"eliminar","eliminar","Eliminar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias,
							"cancelar","cancelar","Cancelar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadosResultadosPerdidasGanancias,this.jTtoolBarDetalleEstadosResultadosPerdidasGanancias,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadosResultadosPerdidasGanancias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadosResultadosPerdidasGanancias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadosResultadosPerdidasGanancias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadosResultadosPerdidasGanancias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadosResultadosPerdidasGanancias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadosResultadosPerdidasGanancias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadosResultadosPerdidasGanancias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadosResultadosPerdidasGanancias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadosResultadosPerdidasGanancias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadosResultadosPerdidasGanancias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadosResultadosPerdidasGanancias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadosResultadosPerdidasGanancias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadosResultadosPerdidasGanancias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadosResultadosPerdidasGanancias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadosResultadosPerdidasGanancias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadosResultadosPerdidasGanancias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadosResultadosPerdidasGanancias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadosResultadosPerdidasGanancias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadosResultadosPerdidasGanancias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadosResultadosPerdidasGanancias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadosResultadosPerdidasGanancias.add(this.jMenuItemDetalleCerrarEstadosResultadosPerdidasGanancias);
		
		this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemActualizarEstadosResultadosPerdidasGanancias);
		this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemEliminarEstadosResultadosPerdidasGanancias);
		this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemCancelarEstadosResultadosPerdidasGanancias);		
		
		//this.jmenuDetalleDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemDetalleAbrirOrderByEstadosResultadosPerdidasGanancias);				
		this.jmenuDetalleDatosEstadosResultadosPerdidasGanancias.add(this.jMenuItemDetalleMostarOcultarEstadosResultadosPerdidasGanancias);				
				
		//this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias.add(this.jMenuItemGuardarCambiosEstadosResultadosPerdidasGanancias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadosResultadosPerdidasGanancias.add(this.jmenuDetalleArchivoEstadosResultadosPerdidasGanancias);		
		this.jmenuBarDetalleEstadosResultadosPerdidasGanancias.add(this.jmenuDetalleAccionesEstadosResultadosPerdidasGanancias);		
		this.jmenuBarDetalleEstadosResultadosPerdidasGanancias.add(this.jmenuDetalleDatosEstadosResultadosPerdidasGanancias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadosResultadosPerdidasGanancias);				
	}
	
	
	public void inicializarElementosCamposEstadosResultadosPerdidasGanancias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadosResultadosPerdidasGanancias = new JLabelMe();
		jLabelIdEstadosResultadosPerdidasGanancias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadosResultadosPerdidasGanancias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias= new GridBagLayout();

		this.jPanelidEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);

		jLabelidEstadosResultadosPerdidasGanancias = new JLabel();
		jLabelidEstadosResultadosPerdidasGanancias.setText("Id");

		jLabelidEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelcodigoEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadosResultadosPerdidasGanancias.setToolTipText("Codigo");
		this.jLabelcodigoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelcodigoEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextFieldcodigoEstadosResultadosPerdidasGanancias= new JTextFieldMe();

		jTextFieldcodigoEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextFieldcodigoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelnombreEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadosResultadosPerdidasGanancias.setToolTipText("Nombre");
		this.jLabelnombreEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelnombreEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextAreanombreEstadosResultadosPerdidasGanancias= new JTextAreaMe();
		jTextAreanombreEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextAreanombreEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadosResultadosPerdidasGanancias.setLineWrap(true);
		jTextAreanombreEstadosResultadosPerdidasGanancias.setWrapStyleWord(true);
		jTextAreanombreEstadosResultadosPerdidasGanancias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadosResultadosPerdidasGanancias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadosResultadosPerdidasGanancias = new JScrollPane(jTextAreanombreEstadosResultadosPerdidasGanancias);
		jscrollPanenombreEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA+" : *");
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setToolTipText("Nombre Nivel Cuenta");
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias= new JTextAreaMe();
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setLineWrap(true);
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setWrapStyleWord(true);
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias = new JScrollPane(jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias);
		jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_nivel_cuentaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


					
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL+" : *");
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias.setToolTipText("Debito Inicial");
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_DEBITOINICIAL);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias= new JTextFieldMe();
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.setText("0.0");

		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_inicialEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_inicialEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL+" : *");
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias.setToolTipText("Credito Inicial");
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_CREDITOINICIAL);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias= new JTextFieldMe();
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.setText("0.0");

		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_inicialEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL+" : *");
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias.setToolTipText("Saldo Inicial");
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_SALDOINICIAL);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias= new JTextFieldMe();
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setEnabled(false);
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.setText("0.0");

		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_inicialEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadosResultadosPerdidasGanancias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias.setToolTipText("Empresa");
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelid_empresaEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jComboBoxid_empresaEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.setEnabled(false);

		this.jButtonid_empresaEstadosResultadosPerdidasGanancias= new JButtonMe();
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadosResultadosPerdidasGanancias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosResultadosPerdidasGanancias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosResultadosPerdidasGanancias"));

		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setText("U");
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosResultadosPerdidasGananciasUpdate"));



					
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA+" : *");
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setToolTipText("Nivel Cuenta");
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDNIVELCUENTA);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias= new JButtonMe();
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGanancias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaEstadosResultadosPerdidasGanancias"));

		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}

		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setText("U");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate"));



					
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.setEnabled(false);

		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias= new JButtonMe();
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosResultadosPerdidasGanancias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosResultadosPerdidasGanancias"));

		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setText("U");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosResultadosPerdidasGananciasUpdate"));



					
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias = new JLabelMe();
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias.setText(""+EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias.setToolTipText("Periodo");
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoEstadosResultadosPerdidasGanancias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoEstadosResultadosPerdidasGanancias.setToolTipText(EstadosResultadosPerdidasGananciasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		this.jPanelid_periodoEstadosResultadosPerdidasGanancias.setLayout(this.gridaBagLayoutEstadosResultadosPerdidasGanancias);


		jComboBoxid_periodoEstadosResultadosPerdidasGanancias= new JComboBoxMe();
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.setEnabled(false);

		this.jButtonid_periodoEstadosResultadosPerdidasGanancias= new JButtonMe();
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setText("Buscar");
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoEstadosResultadosPerdidasGanancias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosResultadosPerdidasGanancias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosResultadosPerdidasGanancias"));

		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda= new JButtonMe();
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setText("U");
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosResultadosPerdidasGananciasBusqueda"));

		if(this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda.setVisible(false);		}

		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate= new JButtonMe();
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setText("U");
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosResultadosPerdidasGanancias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosResultadosPerdidasGananciasUpdate"));



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
		//this.jInternalFrameDetalleEstadosResultadosPerdidasGanancias = new EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estados Resultados Perdidas Ganancias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadosResultadosPerdidasGanancias= new GridBagLayout();
		

		
		String sToolTipEstadosResultadosPerdidasGanancias="";
		sToolTipEstadosResultadosPerdidasGanancias=EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadosResultadosPerdidasGanancias+="(Contabilidad.EstadosResultadosPerdidasGanancias)";
		}
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadosResultadosPerdidasGanancias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonModificarEstadosResultadosPerdidasGanancias = new JButtonMe();
        this.jButtonActualizarEstadosResultadosPerdidasGanancias = new JButtonMe();
        this.jButtonEliminarEstadosResultadosPerdidasGanancias = new JButtonMe();
        this.jButtonCancelarEstadosResultadosPerdidasGanancias = new JButtonMe();
        this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias = new JButtonMe();
		this.jButtonCerrarEstadosResultadosPerdidasGanancias = new JButtonMe();
		
		this.jScrollPanelDatosEstadosResultadosPerdidasGanancias = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias = new JScrollPane();
				
		
		
		this.jPanelCamposEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estados Resultados Perdidas Ganancias";
		
		if(!this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Resultados Perdidas Gananciases" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadosResultadosPerdidasGanancias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadosResultadosPerdidasGanancias.setName("jPanelCamposEstadosResultadosPerdidasGanancias"); 

		this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.setName("jPanelCamposOcultosEstadosResultadosPerdidasGanancias"); 

        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setToolTipText("Acciones");
        this.jPanelAccionesEstadosResultadosPerdidasGanancias.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadosResultadosPerdidasGanancias.setText("Nuevo");
		this.jButtonModificarEstadosResultadosPerdidasGanancias.setText("Editar");
        this.jButtonActualizarEstadosResultadosPerdidasGanancias.setText("Actualizar");
        this.jButtonEliminarEstadosResultadosPerdidasGanancias.setText("Eliminar");
        this.jButtonCancelarEstadosResultadosPerdidasGanancias.setText("Cancelar");
        this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setText("Guardar");
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadosResultadosPerdidasGanancias,"nuevo_button","Nuevo",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadosResultadosPerdidasGanancias,"modificar_button","Editar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadosResultadosPerdidasGanancias,"actualizar_button","Actualizar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadosResultadosPerdidasGanancias,"eliminar_button","Eliminar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadosResultadosPerdidasGanancias,"cancelar_button","Cancelar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias,"guardarcambios_button","Guardar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias,"guardarcambiostabla_button","Guardar",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadosResultadosPerdidasGanancias,"cerrar_button","Salir",this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.setToolTipText("Nuevo"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadosResultadosPerdidasGanancias.setToolTipText("Editar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadosResultadosPerdidasGanancias.setToolTipText("Actualizar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadosResultadosPerdidasGanancias.setToolTipText("Eliminar)"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadosResultadosPerdidasGanancias.setToolTipText("Cancelar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias.setToolTipText("Guardar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.setToolTipText("Guardar"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.setToolTipText("Salir"+" "+EstadosResultadosPerdidasGananciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonNuevoEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadosResultadosPerdidasGanancias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonActualizarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadosResultadosPerdidasGanancias"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonEliminarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadosResultadosPerdidasGanancias"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCancelarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadosResultadosPerdidasGanancias"));
		
		//CERRAR		
		sMapKey = "CerrarEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonCerrarEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadosResultadosPerdidasGanancias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadosResultadosPerdidasGanancias";
		inputMap = this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadosResultadosPerdidasGanancias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadosResultadosPerdidasGanancias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias.setToolTipText("Nuevo EstadosResultadosPerdidasGanancias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias.setToolTipText("Sin Cerrar Ventana EstadosResultadosPerdidasGanancias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setText("Accion");
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadosResultadosPerdidasGanancias = new JLabelMe();
		
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setText("Acciones");		
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadosResultadosPerdidasGanancias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadosResultadosPerdidasGanancias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadosResultadosPerdidasGanancias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadosResultadosPerdidasGanancias = new GridBagLayout();
		
		this.jPanelCamposEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutCamposEstadosResultadosPerdidasGanancias);
		this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutCamposOcultosEstadosResultadosPerdidasGanancias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadosResultadosPerdidasGanancias.add(jLabelIdEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadosResultadosPerdidasGanancias.add(jLabelidEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadosResultadosPerdidasGanancias.add(jLabelid_empresaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadosResultadosPerdidasGanancias.add(jButtonid_empresaEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 3;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadosResultadosPerdidasGanancias.add(jButtonid_empresaEstadosResultadosPerdidasGananciasUpdate, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadosResultadosPerdidasGanancias.add(jComboBoxid_empresaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jLabelid_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 3;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jButtonid_nivel_cuentaEstadosResultadosPerdidasGananciasUpdate, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jComboBoxid_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.add(jLabelid_ejercicioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.add(jButtonid_ejercicioEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 3;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.add(jButtonid_ejercicioEstadosResultadosPerdidasGananciasUpdate, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias.add(jComboBoxid_ejercicioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoEstadosResultadosPerdidasGanancias.add(jLabelid_periodoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEstadosResultadosPerdidasGanancias.add(jButtonid_periodoEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 3;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEstadosResultadosPerdidasGanancias.add(jButtonid_periodoEstadosResultadosPerdidasGananciasUpdate, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoEstadosResultadosPerdidasGanancias.add(jComboBoxid_periodoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadosResultadosPerdidasGanancias.add(jLabelcodigoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadosResultadosPerdidasGanancias.add(jButtoncodigoEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadosResultadosPerdidasGanancias.add(jTextFieldcodigoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadosResultadosPerdidasGanancias.add(jLabelnombreEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadosResultadosPerdidasGanancias.add(jButtonnombreEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadosResultadosPerdidasGanancias.add(jscrollPanenombreEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jLabelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jButtonnombre_nivel_cuentaEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias.add(jscrollPanenombre_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.add(jLabeldebito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.add(jButtondebito_inicialEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias.add(jTextFielddebito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.add(jLabelcredito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.add(jButtoncredito_inicialEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias.add(jTextFieldcredito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.add(jLabelsaldo_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 2;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.add(jButtonsaldo_inicialEstadosResultadosPerdidasGananciasBusqueda, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
	}

	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 1;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias.add(jTextFieldsaldo_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelidEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelid_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelcodigoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelnombreEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelnombre_nivel_cuentaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPaneldebito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelcredito_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosResultadosPerdidasGanancias.add(this.jPanelsaldo_inicialEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposEstadosResultadosPerdidasGanancias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposOcultosEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.add(this.jPanelid_empresaEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposOcultosEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposOcultosEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposOcultosEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.add(this.jPanelid_ejercicioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposOcultosEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposOcultosEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
	}
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iYPanelCamposOcultosEstadosResultadosPerdidasGanancias;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iXPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosResultadosPerdidasGanancias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.add(this.jPanelid_periodoEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);



	if(iXPanelCamposOcultosEstadosResultadosPerdidasGanancias % 1==0) {
		iXPanelCamposOcultosEstadosResultadosPerdidasGanancias=0;
		iYPanelCamposOcultosEstadosResultadosPerdidasGanancias++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadosResultadosPerdidasGanancias= new GridBagLayout();
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutAccionesEstadosResultadosPerdidasGanancias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadosResultadosPerdidasGanancias= new GridBagLayout();
		this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutAccionesFormularioEstadosResultadosPerdidasGanancias);
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias.add(this.jComboBoxTiposAccionesFormularioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonModificarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);							

		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonEliminarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonActualizarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);


		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonGuardarCambiosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);	
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = 0;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadosResultadosPerdidasGanancias.add(this.jButtonCancelarEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadosResultadosPerdidasGanancias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadosResultadosPerdidasGanancias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosresultadosperdidasgananciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();						
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;		
			//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =0;
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadosResultadosPerdidasGananciasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadosResultadosPerdidasGanancias = new EstadosResultadosPerdidasGananciasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estados Resultados Perdidas Ganancias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estados Resultados Perdidas Ganancias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estados Resultados Perdidas Ganancias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadosResultadosPerdidasGananciasModel estadosresultadosperdidasgananciasModel=new EstadosResultadosPerdidasGananciasModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadosResultadosPerdidasGananciasModel.EstadosResultadosPerdidasGananciasFocusTraversalPolicy estadosresultadosperdidasgananciasFocusTraversalPolicy = estadosresultadosperdidasgananciasModel.new EstadosResultadosPerdidasGananciasFocusTraversalPolicy(this);
			
			//estadosresultadosperdidasgananciasFocusTraversalPolicy.setestadosresultadosperdidasgananciasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadosresultadosperdidasgananciasModel);
			
			
			this.jContentPaneDetalleEstadosResultadosPerdidasGanancias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadosResultadosPerdidasGanancias = new GridBagLayout();	
			this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.setLayout(gridaBagLayoutDetalleEstadosResultadosPerdidasGanancias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadosResultadosPerdidasGanancias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
					
				
				this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(jTtoolBarDetalleEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);								
				
}
			
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias=   new JScrollPane(jContentPaneDetalleEstadosResultadosPerdidasGanancias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	        
			this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(jPanelCamposEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			
			
			
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
						//&& estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadosresultadosperdidasgananciasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadosResultadosPerdidasGanancias= new GridBagConstraints();
						this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
						this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(this.jTabbedPaneRelacionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadosResultadosPerdidasGanancias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
					this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
					
				
					this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(jPanelCamposOcultosEstadosResultadosPerdidasGanancias, gridBagConstraintsEstadosResultadosPerdidasGanancias);
				
					this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);							
			
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadosResultadosPerdidasGanancias.add(this.jPanelAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias=   new JScrollPane(this.jPanelCamposEstadosResultadosPerdidasGanancias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);			
			
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
			
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		
			
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias = new GridBagConstraints();
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadosResultadosPerdidasGanancias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadosResultadosPerdidasGanancias, this.gridBagConstraintsEstadosResultadosPerdidasGanancias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadosResultadosPerdidasGanancias;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadosResultadosPerdidasGanancias;
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
