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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.EvaluacionProveedorConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.Classe;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
public class EvaluacionProveedorJInternalFrame extends EvaluacionProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionProveedor;
	
	protected JMenuBar jmenuBarEvaluacionProveedor;
	
	protected JMenu jmenuEvaluacionProveedor;
	protected JMenu jmenuDatosEvaluacionProveedor;
	protected JMenu jmenuArchivoEvaluacionProveedor;
	protected JMenu jmenuAccionesEvaluacionProveedor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionProveedor;	
	protected GridBagConstraints gridBagConstraintsEvaluacionProveedor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionProveedorDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionProveedor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionProveedor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionProveedor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public EvaluacionProveedorSessionBean evaluacionproveedorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionProveedor> evaluacionproveedors;		
	public List<EvaluacionProveedor> evaluacionproveedorsEliminados;	
	public List<EvaluacionProveedor> evaluacionproveedorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionProveedor;		
	protected JButton jButtonAbrirOrderByEvaluacionProveedor;
	
	
	//protected JPanel jPanelOrderByEvaluacionProveedor;
	//public JScrollPane jScrollPanelOrderByEvaluacionProveedor;	
	//protected JButton jButtonCerrarOrderByEvaluacionProveedor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionProveedorLogic evaluacionproveedorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionProveedor;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionProveedorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionProveedor;
	//public JScrollPane jScrollPanelImportacionEvaluacionProveedor;
	
	
	
	protected JPanel jPanelAccionesEvaluacionProveedor;
	
    protected JPanel jPanelPaginacionEvaluacionProveedor;
    protected JPanel jPanelParametrosReportesEvaluacionProveedor;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionProveedor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionProveedor;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionProveedor;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionProveedor;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionProveedor;
	//protected JPanel jPanelImportacionEvaluacionProveedor;
	
	
	public JTable jTableDatosEvaluacionProveedor;
	
	
	
	//public JTable jTableDatosEvaluacionProveedorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionProveedor;
	protected JButton jButtonDuplicarEvaluacionProveedor;
	protected JButton jButtonCopiarEvaluacionProveedor;
	protected JButton jButtonVerFormEvaluacionProveedor;
	protected JButton jButtonNuevoRelacionesEvaluacionProveedor;
	protected JButton jButtonModificarEvaluacionProveedor;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionProveedor;
	protected JButton jButtonCerrarEvaluacionProveedor;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionProveedor;
	protected JButton jButtonProcesarInformacionEvaluacionProveedor;
	
	
	protected JButton jButtonAnterioresEvaluacionProveedor;
	protected JButton jButtonSiguientesEvaluacionProveedor;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionProveedor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionProveedor;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionProveedor;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionProveedor;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionProveedor;
	//protected JButton jButtonGenerarImportacionEvaluacionProveedor;
	//protected JButton jButtonCerrarImportacionEvaluacionProveedor;
	//protected JFileChooser jFileChooserImportacionEvaluacionProveedor;
	//protected File fileImportacionEvaluacionProveedor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionProveedor;
	protected JButton jButtonDuplicarToolBarEvaluacionProveedor;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionProveedor;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionProveedor;
	protected JButton jButtonCopiarToolBarEvaluacionProveedor;
	protected JButton jButtonVerFormToolBarEvaluacionProveedor;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionProveedor;
	protected JButton jButtonCerrarToolBarEvaluacionProveedor;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionProveedor;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionProveedor;
	protected JButton jButtonAnterioresToolBarEvaluacionProveedor;
	protected JButton jButtonSiguientesToolBarEvaluacionProveedor;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionProveedor;
	protected JMenuItem jMenuItemDuplicarEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionProveedor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionProveedor;
	protected JMenuItem jMenuItemCopiarEvaluacionProveedor;
	protected JMenuItem jMenuItemVerFormEvaluacionProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionProveedor;
	protected JMenuItem jMenuItemCerrarEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionProveedor;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionProveedor;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionProveedor;
	protected JMenuItem jMenuItemAnterioresEvaluacionProveedor;
	protected JMenuItem jMenuItemSiguientesEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionProveedor;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionProveedor;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionProveedor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionProveedor;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionProveedor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionProveedor;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionProveedor;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionProveedor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionProveedor;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionProveedor;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionProveedor;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionProveedor;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionProveedor;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionProveedor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionProveedor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionProveedor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionProveedor;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionProveedor;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionProveedor;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionProveedor;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionProveedor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionProveedor;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionProveedor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionProveedor;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionProveedor;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionProveedor;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionProveedor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionProveedor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionProveedor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionProveedor;
	public JPanel jPanelFK_IdClienteEvaluacionProveedor;
	public JButton jButtonFK_IdClienteEvaluacionProveedor;
	
	public JPanel jPanelid_clienteFK_IdClienteEvaluacionProveedor;
	public JLabel jLabelid_clienteFK_IdClienteEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteEvaluacionProveedor;
	public JButton jButtonid_clienteFK_IdClienteEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteEvaluacionProveedorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor;
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
	//Esto va en DetalleForm
	//public int iHeightFormularioMaximo=0;
	//public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
	
	/*
	double start=(double)System.currentTimeMillis();	
	double end=0;
	double dif=0;
	
	end=(double)System.currentTimeMillis();			
	dif=end - start;			
	start=(double)System.currentTimeMillis();	
	System.out.println("Tiempo(ms) Carga TEST 1_2 DetalleMovimientoInventario: " + dif);		
	*/
	
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionProveedorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionProveedorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionProveedor)	{
		this.jButtonRecargarInformacionEvaluacionProveedor = jButtonRecargarInformacionEvaluacionProveedor;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionProveedor() {
		return this.jButtonProcesarInformacionEvaluacionProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionProveedor)	{
		this.jButtonProcesarInformacionEvaluacionProveedor = jButtonProcesarInformacionEvaluacionProveedor;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionProveedor() {
		return this.jButtonRecargarInformacionEvaluacionProveedor;
	}
	
	
	public List<EvaluacionProveedor> getevaluacionproveedors() {
		return this.evaluacionproveedors;
	}

	public void setevaluacionproveedors(List<EvaluacionProveedor> evaluacionproveedors) {
		this.evaluacionproveedors = evaluacionproveedors;
	}
	
	public List<EvaluacionProveedor> getevaluacionproveedorsAux() {
		return this.evaluacionproveedorsAux;
	}

	public void setevaluacionproveedorsAux(List<EvaluacionProveedor> evaluacionproveedorsAux) {
		this.evaluacionproveedorsAux = evaluacionproveedorsAux;
	}
	
	public List<EvaluacionProveedor> getevaluacionproveedorsEliminados() {
		return this.evaluacionproveedorsEliminados;
	}

	public void setEvaluacionProveedorsEliminados(List<EvaluacionProveedor> evaluacionproveedorsEliminados) {
		this.evaluacionproveedorsEliminados = evaluacionproveedorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionProveedor() {
		return jComboBoxTiposSeleccionarEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionProveedor(
			JComboBox jComboBoxTiposSeleccionarEvaluacionProveedor) {
		this.jComboBoxTiposSeleccionarEvaluacionProveedor = jComboBoxTiposSeleccionarEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionProveedor() {
		return jTextFieldValorCampoGeneralEvaluacionProveedor;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionProveedor(
			JTextField jTextFieldValorCampoGeneralEvaluacionProveedor) {
		this.jTextFieldValorCampoGeneralEvaluacionProveedor = jTextFieldValorCampoGeneralEvaluacionProveedor;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionProveedor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionProveedor() {
		return this.jCheckBoxSeleccionarTodosEvaluacionProveedor;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionProveedor(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionProveedor) {
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor = jCheckBoxSeleccionarTodosEvaluacionProveedor;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionProveedor() {
		return this.jCheckBoxSeleccionadosEvaluacionProveedor;
	}

	public void setjCheckBoxSeleccionadosEvaluacionProveedor(
			JCheckBox jCheckBoxSeleccionadosEvaluacionProveedor) {
		this.jCheckBoxSeleccionadosEvaluacionProveedor = jCheckBoxSeleccionadosEvaluacionProveedor;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionProveedor() {
		return this.jComboBoxTiposArchivosReportesEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionProveedor(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionProveedor) {
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor = jComboBoxTiposArchivosReportesEvaluacionProveedor;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionProveedor() {
		return this.jComboBoxTiposReportesEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionProveedor(
			JComboBox jComboBoxTiposReportesEvaluacionProveedor) {
		this.jComboBoxTiposReportesEvaluacionProveedor = jComboBoxTiposReportesEvaluacionProveedor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionProveedor() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionProveedor(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionProveedor) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionProveedor = jComboBoxTiposReportesDinamicoEvaluacionProveedor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor = jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionProveedor() {
		return this.jComboBoxTiposGraficosReportesEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionProveedor(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionProveedor) {
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor = jComboBoxTiposGraficosReportesEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionProveedor() {
		return this.jComboBoxTiposPaginacionEvaluacionProveedor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionProveedor(
			JComboBox jComboBoxTiposPaginacionEvaluacionProveedor) {
		this.jComboBoxTiposPaginacionEvaluacionProveedor = jComboBoxTiposPaginacionEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionProveedor() {
		return this.jComboBoxTiposRelacionesEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionProveedor(
			JComboBox jComboBoxTiposRelacionesEvaluacionProveedor) {
		this.jComboBoxTiposRelacionesEvaluacionProveedor = jComboBoxTiposRelacionesEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesEvaluacionProveedor) {
		this.jComboBoxTiposAccionesEvaluacionProveedor = jComboBoxTiposAccionesEvaluacionProveedor;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionProveedor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionProveedor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionProveedor() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionProveedor;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionProveedor(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionProveedor) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionProveedor = jCheckBoxConGraficoDinamicoEvaluacionProveedor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionProveedor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionProveedor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionProveedor .setBorder(borderResaltar);		
	//}
	
	
	
			
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		
		this.evaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionproveedorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionProveedor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"copiar","copiar","Copiar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"ver_form","ver_form","Ver"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"recargar","recargar","Recargar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,
							"cerrar","cerrar","Salir"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionProveedor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionProveedor;
			
				this.jButtonProcesarInformacionToolBarEvaluacionProveedor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionProveedor;
				
		//protected JButton jButtonModificarToolBarEvaluacionProveedor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionProveedor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionProveedor=new JMenuMe("General");
		this.jmenuArchivoEvaluacionProveedor=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionProveedor=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionProveedor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionProveedor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionProveedor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionProveedor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionProveedor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionProveedor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionProveedor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionProveedor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionProveedor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionProveedor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionProveedor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionProveedor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionProveedor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionProveedor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionProveedor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionProveedor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionProveedor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionProveedor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionProveedor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionProveedor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionProveedor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionProveedor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionProveedor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionProveedor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionProveedor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionProveedor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionProveedor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionProveedor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionProveedor.add(this.jMenuItemCerrarEvaluacionProveedor);
			
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemNuevoEvaluacionProveedor);
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor);
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemNuevoRelacionesEvaluacionProveedor);
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemGuardarCambiosTablaEvaluacionProveedor);		
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemDuplicarEvaluacionProveedor);		
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemCopiarEvaluacionProveedor);		
			this.jmenuAccionesEvaluacionProveedor.add(this.jMenuItemVerFormEvaluacionProveedor);		
			
			this.jmenuDatosEvaluacionProveedor.add(this.jMenuItemRecargarInformacionEvaluacionProveedor);				
			this.jmenuDatosEvaluacionProveedor.add(this.jMenuItemAnterioresEvaluacionProveedor);				
			this.jmenuDatosEvaluacionProveedor.add(this.jMenuItemSiguientesEvaluacionProveedor);				
			this.jmenuDatosEvaluacionProveedor.add(this.jMenuItemAbrirOrderByEvaluacionProveedor);				
			this.jmenuDatosEvaluacionProveedor.add(this.jMenuItemMostrarOcultarEvaluacionProveedor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionProveedor.add(this.jMenuItemGuardarCambiosEvaluacionProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionProveedor.add(this.jmenuArchivoEvaluacionProveedor);		
			this.jmenuBarEvaluacionProveedor.add(this.jmenuAccionesEvaluacionProveedor);		
			this.jmenuBarEvaluacionProveedor.add(this.jmenuDatosEvaluacionProveedor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionProveedor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionProveedor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteEvaluacionProveedor.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteEvaluacionProveedor= new JButtonMe();
		this.jButtonFK_IdClienteEvaluacionProveedor.setText("Buscar");
		this.jButtonFK_IdClienteEvaluacionProveedor.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteEvaluacionProveedor,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteEvaluacionProveedor = new JLabelMe();
		jLabelid_clienteFK_IdClienteEvaluacionProveedor.setText("Cliente :");
		jLabelid_clienteFK_IdClienteEvaluacionProveedor.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.setFocusable(false);


		this.jTabbedPaneBusquedasEvaluacionProveedor=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionProveedor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionProveedor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionProveedor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
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
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleEvaluacionProveedor = new EvaluacionProveedorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluacion Proveedor DATOS");
			this.jInternalFrameDetalleFormEvaluacionProveedor = new EvaluacionProveedorDetalleFormJInternalFrame(jDesktopPane,this.evaluacionproveedorSessionBean.getConGuardarRelaciones(),this.evaluacionproveedorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionProveedor = null;//new EvaluacionProveedorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionProveedor= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionProveedor = new JTableMe();      
		
		String sToolTipEvaluacionProveedor="";
		sToolTipEvaluacionProveedor=EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionProveedor+="(Cartera.EvaluacionProveedor)";
		}
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionProveedor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionProveedor.setToolTipText(sToolTipEvaluacionProveedor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionProveedor);
		this.jTableDatosEvaluacionProveedor.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionProveedor.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionProveedor = new JButtonMe();
		this.jButtonDuplicarEvaluacionProveedor = new JButtonMe();
		this.jButtonCopiarEvaluacionProveedor = new JButtonMe();
		this.jButtonVerFormEvaluacionProveedor = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionProveedor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarEvaluacionProveedor = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionProveedor = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionProveedor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Proveedor";
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionProveedor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoEvaluacionProveedor=new ReporteDinamicoJInternalFrame(EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionProveedor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionProveedor=new ImportacionJInternalFrame(EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionProveedor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionProveedor = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionProveedor.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionProveedor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionProveedor,false,this);
			
			//this.cargarOrderByEvaluacionProveedor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionProveedor,true,this);
			
			//this.cargarOrderByEvaluacionProveedor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionProveedor.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosEvaluacionProveedor.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosEvaluacionProveedor.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosEvaluacionProveedor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionProveedor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionProveedor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionProveedor.setText("Nuevo");
		this.jButtonDuplicarEvaluacionProveedor.setText("Duplicar");
		this.jButtonCopiarEvaluacionProveedor.setText("Copiar");
		this.jButtonVerFormEvaluacionProveedor.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionProveedor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.setText("Guardar");
		this.jButtonCerrarEvaluacionProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionProveedor,"nuevo_button","Nuevo",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionProveedor,"duplicar_button","Duplicar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionProveedor,"copiar_button","Copiar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionProveedor,"ver_form","Ver",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionProveedor,"nuevorelaciones_button","Nuevo Rel",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionProveedor,"guardarcambiostabla_button","Guardar",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionProveedor,"cerrar_button","Salir",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionProveedor.setToolTipText("Nuevo"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionProveedor.setToolTipText("Duplicar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionProveedor.setToolTipText("Copiar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionProveedor.setToolTipText("Ver"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionProveedor.setToolTipText("Nuevo Rel"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.setToolTipText("Guardar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionProveedor.setToolTipText("Salir"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		//String sMapKey = "";
		//InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoEvaluacionProveedor";
		inputMap = this.jButtonNuevoEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionProveedor"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionProveedor";
		inputMap = this.jButtonDuplicarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionProveedor"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionProveedor";
		inputMap = this.jButtonCopiarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionProveedor"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionProveedor";
		inputMap = this.jButtonVerFormEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionProveedor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionProveedor";
		inputMap = this.jButtonNuevoRelacionesEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionProveedor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionProveedor";
		inputMap = this.jButtonModificarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionProveedor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionProveedor";
		inputMap = this.jButtonCerrarEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionProveedor";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionProveedor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionProveedor.setName("jPanelParametrosReportesEvaluacionProveedor"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionProveedor.setName("jPanelParametrosReportesAccionesEvaluacionProveedor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionProveedor = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionProveedor.setText("Recargar");
		this.jButtonRecargarInformacionEvaluacionProveedor.setToolTipText("Recargar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionProveedor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEvaluacionProveedor = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionProveedor.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionProveedor.setToolTipText("Procesar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionProveedor.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionProveedor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionProveedor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionProveedor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionProveedor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionProveedor.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionProveedor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionProveedor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionProveedor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionProveedor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionProveedor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionProveedor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionProveedor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionProveedor = new JLabelMe();
		
		this.jLabelAccionesEvaluacionProveedor.setText("Acciones");		
		this.jLabelAccionesEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionProveedor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionProveedor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionProveedor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionProveedor.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionProveedor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionProveedor = new JButtonMe();
		//this.jButtonAnterioresEvaluacionProveedor.setText("<<");
        this.jButtonAnterioresEvaluacionProveedor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionProveedor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionProveedor = new JButtonMe();
		//this.jButtonSiguientesEvaluacionProveedor.setText(">>");
        this.jButtonSiguientesEvaluacionProveedor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionProveedor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionProveedor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionProveedor.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionProveedor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionProveedor,"nuevoguardarcambios_button","Nue",this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionProveedor";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionProveedor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionProveedor";
		inputMap = this.jButtonRecargarInformacionEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionProveedor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionProveedor";
		inputMap = this.jButtonSiguientesEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionProveedor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionProveedor";
		inputMap = this.jButtonAnterioresEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionProveedor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionProveedor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionProveedor.setMinimumSize(new Dimension(this.getWidth(),EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionProveedor.setMaximumSize(new Dimension(this.getWidth(),EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionProveedor.setPreferredSize(new Dimension(this.getWidth(),EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionProveedorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionProveedor = new GridBagLayout();

			this.jPanelPaginacionEvaluacionProveedor.setLayout(gridaBagLayoutPaginacionEvaluacionProveedor);						
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonAnterioresEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					
						
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
			
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonNuevoGuardarCambiosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
						
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonSiguientesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonNuevoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
				this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonNuevoRelacionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			}
			
			
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
				this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonGuardarCambiosTablaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			}
			
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonDuplicarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonCopiarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonVerFormEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 1;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionProveedor.add(this.jButtonCerrarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
		
		
		this.jButtonRecargarInformacionEvaluacionProveedor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionProveedor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionProveedor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionProveedor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionProveedor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionProveedor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionProveedor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionProveedor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionProveedor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionProveedor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionProveedor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionProveedor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionProveedor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionProveedor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionProveedor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionProveedor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionProveedor.setLayout(gridaBagParametrosReportesEvaluacionProveedor);
			this.jPanelParametrosReportesAccionesEvaluacionProveedor.setLayout(gridaBagParametrosReportesAccionesEvaluacionProveedor);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar1EvaluacionProveedor);
			this.jPanelParametrosAuxiliar2EvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar2EvaluacionProveedor);
			this.jPanelParametrosAuxiliar3EvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar3EvaluacionProveedor);
			this.jPanelParametrosAuxiliar4EvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar4EvaluacionProveedor);
			//this.jPanelParametrosAuxiliar5EvaluacionProveedor.setLayout(gridaBagParametrosAuxiliar2EvaluacionProveedor);			
			
			
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jButtonRecargarInformacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionProveedor.add(this.jComboBoxTiposPaginacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionProveedor.add(this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionProveedor.add(this.jComboBoxTiposArchivosReportesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jPanelParametrosAuxiliar1EvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionProveedor.add(this.jComboBoxTiposReportesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jPanelParametrosAuxiliar4EvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jComboBoxTiposReportesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jCheckBoxGenerarReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jPanelParametrosAuxiliar2EvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jLabelAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionProveedor.add(this.jButtonAbrirOrderByEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jComboBoxTiposSeleccionarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			
			
			/*
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jCheckBoxSeleccionarTodosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionProveedor.add(this.jCheckBoxSeleccionarTodosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);															
				
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionProveedor.add(this.jCheckBoxSeleccionadosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jPanelParametrosAuxiliar3EvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jComboBoxTiposRelacionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
				
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jComboBoxTiposAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
	
				
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionProveedor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionProveedor.add(this.jTextFieldValorCampoGeneralEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionProveedor = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionProveedor.setLayout(gridaBagLayoutDatosEvaluacionProveedor);
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionProveedor.add(this.jTableDatosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionProveedor.setViewportView(this.jTableDatosEvaluacionProveedor);
		this.jTableDatosEvaluacionProveedor.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionProveedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesEvaluacionProveedor.setLayout(gridaBagLayoutAccionesEvaluacionProveedor);
		
		
		/*	
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
			
		this.jPanelAccionesEvaluacionProveedor.add(this.jButtonNuevoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteEvaluacionProveedor= new GridBagLayout();
		gridaBagLayoutFK_IdClienteEvaluacionProveedor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteEvaluacionProveedor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteEvaluacionProveedor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteEvaluacionProveedor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteEvaluacionProveedor.setLayout(gridaBagLayoutFK_IdClienteEvaluacionProveedor);

		gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionProveedor.gridy = 0;
		gridBagConstraintsEvaluacionProveedor.gridx = 0;
		jPanelFK_IdClienteEvaluacionProveedor.add(jLabelid_clienteFK_IdClienteEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);

		gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionProveedor.gridy = 0;
		gridBagConstraintsEvaluacionProveedor.gridx = 1;
		jPanelFK_IdClienteEvaluacionProveedor.add(jComboBoxid_clienteFK_IdClienteEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);


		gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.NONE;
		gridBagConstraintsEvaluacionProveedor.gridy = 0;
		gridBagConstraintsEvaluacionProveedor.gridx = 0;
		jPanelFK_IdClienteEvaluacionProveedor.add(this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);

		gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionProveedor.gridy = 1;
		gridBagConstraintsEvaluacionProveedor.gridx =1;
		jPanelFK_IdClienteEvaluacionProveedor.add(jButtonFK_IdClienteEvaluacionProveedor, gridBagConstraintsEvaluacionProveedor);

		jTabbedPaneBusquedasEvaluacionProveedor.addTab("1.-Por Cliente ", jPanelFK_IdClienteEvaluacionProveedor);
		jTabbedPaneBusquedasEvaluacionProveedor.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionProveedor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;		
			//this.gridBagConstraintsEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionProveedor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;		
		//this.gridBagConstraintsEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionProveedor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionProveedor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionProveedor.gridx = 0;		
			this.gridBagConstraintsEvaluacionProveedor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionProveedor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);								
		
		
		/*
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		*/		
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionProveedor.gridx =0;
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
				
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionProveedor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionProveedor = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionProveedor.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionProveedor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
			
			
			if(!Constantes.ISDEVELOPING) {
			} else {
				if(tieneColumnasOcultas) {
				}
			}					
			
		} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
		}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
			
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionProveedor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionProveedor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionProveedor.setName("jPanelReporteDinamicoEvaluacionProveedor"); 
		
		this.jPanelReporteDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionProveedor.setLayout(gridaBagLayoutReporteDinamicoEvaluacionProveedor);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionProveedor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionProveedor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionProveedor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionProveedor = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionProveedor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jLabelColumnasSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionProveedor = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionProveedor=new JScrollPane(this.jListColumnasSelectReporteEvaluacionProveedor);
			
			this.jScrollColumnasSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jListColumnasSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jScrollColumnasSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionProveedor = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionProveedor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jLabelRelacionesSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionProveedor = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionProveedor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionProveedor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionProveedor=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionProveedor);
			
			this.jScrollRelacionesSelectReporteEvaluacionProveedor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionProveedor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionProveedor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jListRelacionesSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jScrollRelacionesSelectReporteEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionProveedor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionProveedor = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionProveedor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionProveedor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionProveedor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor.setToolTipText("Generar EXCEL"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jComboBoxTiposReportesDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionProveedor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionProveedor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionProveedor.setToolTipText("Generar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jButtonGenerarReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionProveedor.setToolTipText("Cancelar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionProveedor.add(this.jButtonCerrarReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionProveedor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionProveedor= new JScrollPane(jPanelReporteDinamicoEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionProveedor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionProveedor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionProveedor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionProveedor);
		this.jInternalFrameReporteDinamicoEvaluacionProveedor.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionProveedor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionProveedor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionProveedor.setName("jPanelImportacionEvaluacionProveedor"); 
		
		this.jPanelImportacionEvaluacionProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionProveedor.setLayout(gridaBagLayoutImportacionEvaluacionProveedor);
		
		
		this.jInternalFrameImportacionEvaluacionProveedor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionProveedor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionProveedor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionProveedor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionProveedor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionProveedor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionProveedor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionProveedor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionProveedor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionProveedor.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionProveedor.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionProveedor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionProveedor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionProveedor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionProveedor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionProveedor = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionProveedor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionProveedor.add(this.jLabelArchivoImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionProveedor = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionProveedor.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionProveedor = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionProveedor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionProveedor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionProveedor.setToolTipText("Generar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionProveedor.add(this.jButtonAbrirImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionProveedor = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionProveedor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionProveedor.add(this.jLabelPathArchivoImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionProveedor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionProveedor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionProveedor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionProveedor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionProveedor.add(this.jTextFieldPathArchivoImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionProveedor = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionProveedor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionProveedor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionProveedor.setToolTipText("Generar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionProveedor.add(this.jButtonGenerarImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionProveedor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionProveedor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionProveedor.setToolTipText("Cancelar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionProveedor.add(this.jButtonCerrarImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionProveedor = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionProveedor= new JScrollPane(jPanelImportacionEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionProveedor.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionProveedor);
		this.jInternalFrameImportacionEvaluacionProveedor.getContentPane().add(this.jScrollPanelImportacionEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionProveedor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionProveedor = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionProveedor.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionProveedor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionProveedor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionProveedor";
			inputMap = this.jButtonAbrirOrderByEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionProveedor"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionProveedor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionProveedor.setName("jPanelOrderByEvaluacionProveedor"); 
			
			this.jPanelOrderByEvaluacionProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionProveedor.setLayout(gridaBagLayoutOrderByEvaluacionProveedor);
			
			
			this.jTableDatosEvaluacionProveedorOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionProveedorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionProveedorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionProveedorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionProveedorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionProveedorOrderBy.setViewportView(this.jTableDatosEvaluacionProveedorOrderBy);
			this.jTableDatosEvaluacionProveedorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionProveedorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionProveedor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionProveedor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionProveedor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionProveedor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionProveedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionProveedor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionProveedor.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionProveedor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionProveedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionProveedor.setResizable(true);
			this.jInternalFrameOrderByEvaluacionProveedor.setClosable(true);
			this.jInternalFrameOrderByEvaluacionProveedor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionProveedor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionProveedor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionProveedor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Proveedores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionProveedor.ipady =150;
				
			this.jPanelOrderByEvaluacionProveedor.add(jScrollPanelDatosEvaluacionProveedorOrderBy, this.gridBagConstraintsEvaluacionProveedor);//this.jTableDatosEvaluacionProveedorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionProveedor = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionProveedor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionProveedor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionProveedor.setToolTipText("Cancelar"+" "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionProveedor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionProveedor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionProveedor.add(this.jButtonCerrarOrderByEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionProveedor = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionProveedor= new JScrollPane(jPanelOrderByEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionProveedor.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionProveedor.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionProveedor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionProveedor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionProveedor);
			
			this.jInternalFrameOrderByEvaluacionProveedor.getContentPane().add(this.jScrollPanelOrderByEvaluacionProveedor, this.gridBagConstraintsEvaluacionProveedor);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionProveedor = new JButtonMe();
		}				
	}
	*/
	
	
	public void redimensionarTablaDatos(int iNumFilas) {
		this.redimensionarTablaDatos(iNumFilas,0);
	}
	
	public void redimensionarTablaDatos(int iNumFilas,int iTamanioFilaTabla) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    
		int iWidthTable=screenSize.width*2;//screenSize.width - (screenSize.width/8);
		int iWidthTableScroll=screenSize.width - (screenSize.width/8);
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.evaluacionproveedorSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
		}
		
		//SI CALCULADO ES MENOR QUE MAXIMO
		/*
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		*/
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTableCalculado<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTableCalculado;
		}
		
		//NO VALE SIEMPRE PONE TAMANIO COLUMNA 200
		/*
		int iTotalWidth=0;
		int iWidthColumn=0;
		int iCountColumns=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEvaluacionProveedor.getRowHeight();//EvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.isSelected()) {
					iHeightTable=EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionProveedor.isSelected()) {
					iHeightTable=EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionProveedorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionProveedor!=null && this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionProveedor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionProveedor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionProveedor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionProveedor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionProveedor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionProveedor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
		//VERSION 0
		/*
		//SI CALCULADO ES MENOR QUE MAXIMO
		if(iWidthTableCalculado<=iWidthTable) {
			iWidthTable=iWidthTableCalculado;
		}
		
		//SI TABLA ES MENOR QUE SCROLL
		if(iWidthTable<=iWidthTableScroll) {
			iWidthTableScroll=iWidthTable;
		}
		*/
	}
	
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionproveedorLogic.getEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionproveedors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionProveedor> TraerEvaluacionProveedorBeans(List<EvaluacionProveedor> evaluacionproveedors,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedors) {
					
				if(!(EvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionproveedor.setsDetalleGeneralEntityReporte(EvaluacionProveedorConstantesFunciones.getEvaluacionProveedorDescripcion(evaluacionproveedor));
										
						
					
					

					if(evaluacionproveedor.getDetalleEvaluacionProveedors()!=null && Funciones.existeClass(classes,DetalleEvaluacionProveedor.class)) {
						try{evaluacionproveedor.setdetalleevaluacionproveedorsDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionProveedorJInternalFrame.TraerDetalleEvaluacionProveedorBeans(evaluacionproveedor.getDetalleEvaluacionProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//evaluacionproveedor.setsDetalleGeneralEntityReporte(evaluacionproveedor.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionproveedorbeans.add(evaluacionproveedorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionproveedors;
    }
	//PARA REPORTES FIN
}
