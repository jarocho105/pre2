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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.DetallePagoChequeConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class DetallePagoChequeJInternalFrame extends DetallePagoChequeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePagoCheque;
	
	protected JMenuBar jmenuBarDetallePagoCheque;
	
	protected JMenu jmenuDetallePagoCheque;
	protected JMenu jmenuDatosDetallePagoCheque;
	protected JMenu jmenuArchivoDetallePagoCheque;
	protected JMenu jmenuAccionesDetallePagoCheque;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePagoCheque;	
	protected GridBagConstraints gridBagConstraintsDetallePagoCheque;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePagoChequeDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePagoCheque;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePagoCheque;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePagoCheque;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePagoChequeSessionBean detallepagochequeSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePagoCheque> detallepagocheques;		
	public List<DetallePagoCheque> detallepagochequesEliminados;	
	public List<DetallePagoCheque> detallepagochequesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePagoCheque;		
	protected JButton jButtonAbrirOrderByDetallePagoCheque;
	
	
	//protected JPanel jPanelOrderByDetallePagoCheque;
	//public JScrollPane jScrollPanelOrderByDetallePagoCheque;	
	//protected JButton jButtonCerrarOrderByDetallePagoCheque;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePagoChequeLogic detallepagochequeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePagoCheque;
	public JScrollPane jScrollPanelDatosEdicionDetallePagoCheque;
	public JScrollPane jScrollPanelDatosGeneralDetallePagoCheque;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallePagoChequeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePagoCheque;
	//public JScrollPane jScrollPanelImportacionDetallePagoCheque;
	
	
	
	protected JPanel jPanelAccionesDetallePagoCheque;
	
    protected JPanel jPanelPaginacionDetallePagoCheque;
    protected JPanel jPanelParametrosReportesDetallePagoCheque;
	protected JPanel jPanelParametrosReportesAccionesDetallePagoCheque;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePagoCheque;
	protected JPanel jPanelParametrosAuxiliar2DetallePagoCheque;
	protected JPanel jPanelParametrosAuxiliar3DetallePagoCheque;
	protected JPanel jPanelParametrosAuxiliar4DetallePagoCheque;
	//protected JPanel jPanelParametrosAuxiliar5DetallePagoCheque;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePagoCheque;
	//protected JPanel jPanelImportacionDetallePagoCheque;
	
	
	public JTable jTableDatosDetallePagoCheque;
	
	
	
	//public JTable jTableDatosDetallePagoChequeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePagoCheque;
	protected JButton jButtonDuplicarDetallePagoCheque;
	protected JButton jButtonCopiarDetallePagoCheque;
	protected JButton jButtonVerFormDetallePagoCheque;
	protected JButton jButtonNuevoRelacionesDetallePagoCheque;
	protected JButton jButtonModificarDetallePagoCheque;
	
    protected JButton jButtonGuardarCambiosTablaDetallePagoCheque;
	protected JButton jButtonCerrarDetallePagoCheque;
	
	
	protected JButton jButtonRecargarInformacionDetallePagoCheque;
	protected JButton jButtonProcesarInformacionDetallePagoCheque;
	
	
	protected JButton jButtonAnterioresDetallePagoCheque;
	protected JButton jButtonSiguientesDetallePagoCheque;
	protected JButton jButtonNuevoGuardarCambiosDetallePagoCheque;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePagoCheque;
	//protected JButton jButtonCerrarReporteDinamicoDetallePagoCheque;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePagoCheque;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePagoCheque;
	//protected JButton jButtonGenerarImportacionDetallePagoCheque;
	//protected JButton jButtonCerrarImportacionDetallePagoCheque;
	//protected JFileChooser jFileChooserImportacionDetallePagoCheque;
	//protected File fileImportacionDetallePagoCheque;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePagoCheque;
	protected JButton jButtonDuplicarToolBarDetallePagoCheque;
	protected JButton jButtonNuevoRelacionesToolBarDetallePagoCheque;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePagoCheque;
	protected JButton jButtonCopiarToolBarDetallePagoCheque;
	protected JButton jButtonVerFormToolBarDetallePagoCheque;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePagoCheque;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePagoCheque;
	protected JButton jButtonCerrarToolBarDetallePagoCheque;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePagoCheque;
	protected JButton jButtonProcesarInformacionToolBarDetallePagoCheque;
	protected JButton jButtonAnterioresToolBarDetallePagoCheque;
	protected JButton jButtonSiguientesToolBarDetallePagoCheque;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePagoCheque;
	protected JButton jButtonAbrirOrderByToolBarDetallePagoCheque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePagoCheque;
	protected JMenuItem jMenuItemDuplicarDetallePagoCheque;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePagoCheque;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePagoCheque;
	protected JMenuItem jMenuItemCopiarDetallePagoCheque;
	protected JMenuItem jMenuItemVerFormDetallePagoCheque;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePagoCheque;
	protected JMenuItem jMenuItemCerrarDetallePagoCheque;
	protected JMenuItem jMenuItemDetalleCerrarDetallePagoCheque;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePagoCheque;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePagoCheque;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePagoCheque;
	protected JMenuItem jMenuItemProcesarInformacionDetallePagoCheque;
	protected JMenuItem jMenuItemAnterioresDetallePagoCheque;
	protected JMenuItem jMenuItemSiguientesDetallePagoCheque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePagoCheque;
	protected JMenuItem jMenuItemAbrirOrderByDetallePagoCheque;
	protected JMenuItem jMenuItemMostrarOcultarDetallePagoCheque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePagoCheque;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePagoCheque;
	protected JCheckBox jCheckBoxSeleccionadosDetallePagoCheque;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePagoCheque;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePagoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePagoCheque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePagoCheque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePagoCheque;
	protected JTextField jTextFieldValorCampoGeneralDetallePagoCheque;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePagoCheque;
	//public JList<Reporte> jListColumnasSelectReporteDetallePagoCheque;
	//public JScrollPane jScrollColumnasSelectReporteDetallePagoCheque;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePagoCheque;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePagoCheque;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePagoCheque;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePagoCheque;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePagoCheque;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePagoCheque;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePagoCheque;
	
		
	//public JLabel jLabelArchivoImportacionDetallePagoCheque;	
	//public JLabel jLabelPathArchivoImportacionDetallePagoCheque;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePagoCheque;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePagoCheque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePagoCheque;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePagoCheque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePagoCheque;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePagoCheque;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePagoCheque;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePagoCheque;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePagoCheque;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePagoCheque;
	public JPanel jPanelFK_IdAsientoContableDetallePagoCheque;
	public JButton jButtonFK_IdAsientoContableDetallePagoCheque;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetallePagoCheque;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePagoChequeBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque;
	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePagoChequeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePagoCheque)	{
		this.jButtonRecargarInformacionDetallePagoCheque = jButtonRecargarInformacionDetallePagoCheque;
	}
	
	public JButton getjButtonProcesarInformacionDetallePagoCheque() {
		return this.jButtonProcesarInformacionDetallePagoCheque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePagoCheque)	{
		this.jButtonProcesarInformacionDetallePagoCheque = jButtonProcesarInformacionDetallePagoCheque;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePagoCheque() {
		return this.jButtonRecargarInformacionDetallePagoCheque;
	}
	
	
	public List<DetallePagoCheque> getdetallepagocheques() {
		return this.detallepagocheques;
	}

	public void setdetallepagocheques(List<DetallePagoCheque> detallepagocheques) {
		this.detallepagocheques = detallepagocheques;
	}
	
	public List<DetallePagoCheque> getdetallepagochequesAux() {
		return this.detallepagochequesAux;
	}

	public void setdetallepagochequesAux(List<DetallePagoCheque> detallepagochequesAux) {
		this.detallepagochequesAux = detallepagochequesAux;
	}
	
	public List<DetallePagoCheque> getdetallepagochequesEliminados() {
		return this.detallepagochequesEliminados;
	}

	public void setDetallePagoChequesEliminados(List<DetallePagoCheque> detallepagochequesEliminados) {
		this.detallepagochequesEliminados = detallepagochequesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePagoCheque() {
		return jComboBoxTiposSeleccionarDetallePagoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePagoCheque(
			JComboBox jComboBoxTiposSeleccionarDetallePagoCheque) {
		this.jComboBoxTiposSeleccionarDetallePagoCheque = jComboBoxTiposSeleccionarDetallePagoCheque;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePagoCheque() {
		return jTextFieldValorCampoGeneralDetallePagoCheque;
	}

	public void setjTextFieldValorCampoGeneralDetallePagoCheque(
			JTextField jTextFieldValorCampoGeneralDetallePagoCheque) {
		this.jTextFieldValorCampoGeneralDetallePagoCheque = jTextFieldValorCampoGeneralDetallePagoCheque;
	}

	public void setBorderResaltarValorCampoGeneralDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePagoCheque .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePagoCheque() {
		return this.jCheckBoxSeleccionarTodosDetallePagoCheque;
	}

	public void setjCheckBoxSeleccionarTodosDetallePagoCheque(
			JCheckBox jCheckBoxSeleccionarTodosDetallePagoCheque) {
		this.jCheckBoxSeleccionarTodosDetallePagoCheque = jCheckBoxSeleccionarTodosDetallePagoCheque;
	}

	public void setBorderResaltarSeleccionarTodosDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePagoCheque() {
		return this.jCheckBoxSeleccionadosDetallePagoCheque;
	}

	public void setjCheckBoxSeleccionadosDetallePagoCheque(
			JCheckBox jCheckBoxSeleccionadosDetallePagoCheque) {
		this.jCheckBoxSeleccionadosDetallePagoCheque = jCheckBoxSeleccionadosDetallePagoCheque;
	}
	
	public void setBorderResaltarSeleccionadosDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePagoCheque() {
		return this.jComboBoxTiposArchivosReportesDetallePagoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePagoCheque(
			JComboBox jComboBoxTiposArchivosReportesDetallePagoCheque) {
		this.jComboBoxTiposArchivosReportesDetallePagoCheque = jComboBoxTiposArchivosReportesDetallePagoCheque;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePagoCheque() {
		return this.jComboBoxTiposReportesDetallePagoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePagoCheque(
			JComboBox jComboBoxTiposReportesDetallePagoCheque) {
		this.jComboBoxTiposReportesDetallePagoCheque = jComboBoxTiposReportesDetallePagoCheque;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePagoCheque() {
	//	return jComboBoxTiposReportesDinamicoDetallePagoCheque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePagoCheque(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePagoCheque) {
	//	this.jComboBoxTiposReportesDinamicoDetallePagoCheque = jComboBoxTiposReportesDinamicoDetallePagoCheque;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePagoCheque() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePagoCheque(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque = jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque;
	//}
	
	public void setBorderResaltarTiposReportesDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePagoCheque() {
		return this.jComboBoxTiposGraficosReportesDetallePagoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePagoCheque(
			JComboBox jComboBoxTiposGraficosReportesDetallePagoCheque) {
		this.jComboBoxTiposGraficosReportesDetallePagoCheque = jComboBoxTiposGraficosReportesDetallePagoCheque;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePagoCheque() {
		return this.jComboBoxTiposPaginacionDetallePagoCheque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePagoCheque(
			JComboBox jComboBoxTiposPaginacionDetallePagoCheque) {
		this.jComboBoxTiposPaginacionDetallePagoCheque = jComboBoxTiposPaginacionDetallePagoCheque;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePagoCheque() {
		return this.jComboBoxTiposRelacionesDetallePagoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePagoCheque() {
		return this.jComboBoxTiposAccionesDetallePagoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePagoCheque(
			JComboBox jComboBoxTiposRelacionesDetallePagoCheque) {
		this.jComboBoxTiposRelacionesDetallePagoCheque = jComboBoxTiposRelacionesDetallePagoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePagoCheque(
			JComboBox jComboBoxTiposAccionesDetallePagoCheque) {
		this.jComboBoxTiposAccionesDetallePagoCheque = jComboBoxTiposAccionesDetallePagoCheque;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePagoCheque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePagoCheque .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePagoCheque() {
	//	return jCheckBoxConGraficoDinamicoDetallePagoCheque;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePagoCheque(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePagoCheque) {
	//	this.jCheckBoxConGraficoDinamicoDetallePagoCheque = jCheckBoxConGraficoDinamicoDetallePagoCheque;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePagoCheque() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePagoCheque.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePagoCheque .setBorder(borderResaltar);		
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
		this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		
		this.detallepagochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagochequeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagoChequeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pago Cheque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePagoChequeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagoCheque= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"nuevo","nuevo","Nuevo"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"duplicar","duplicar","Duplicar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"copiar","copiar","Copiar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"ver_form","ver_form","Ver"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"recargar","recargar","Recargar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePagoCheque,this.jTtoolBarDetallePagoCheque,
							"cerrar","cerrar","Salir"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePagoCheque=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePagoCheque;
			
				this.jButtonProcesarInformacionToolBarDetallePagoCheque=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePagoCheque;
				
		//protected JButton jButtonModificarToolBarDetallePagoCheque;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePagoCheque=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePagoCheque=new JMenuMe("General");
		this.jmenuArchivoDetallePagoCheque=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePagoCheque=new JMenuMe("Acciones");
		this.jmenuDatosDetallePagoCheque=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePagoCheque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePagoCheque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePagoCheque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePagoCheque= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePagoCheque.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePagoCheque,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePagoCheque= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePagoCheque.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePagoCheque,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePagoCheque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePagoCheque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePagoCheque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePagoCheque= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePagoCheque.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePagoCheque,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePagoCheque= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePagoCheque.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePagoCheque,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePagoCheque= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePagoCheque.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePagoCheque,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePagoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePagoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePagoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePagoCheque= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePagoCheque.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePagoCheque,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePagoCheque= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePagoCheque.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePagoCheque,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePagoCheque= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePagoCheque.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePagoCheque,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePagoCheque= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePagoCheque.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePagoCheque,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePagoCheque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePagoCheque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePagoCheque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePagoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePagoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePagoCheque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePagoCheque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePagoCheque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePagoCheque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePagoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePagoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePagoCheque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePagoCheque= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePagoCheque.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePagoCheque,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePagoCheque.add(this.jMenuItemCerrarDetallePagoCheque);
			
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemNuevoDetallePagoCheque);
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemNuevoGuardarCambiosDetallePagoCheque);
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemNuevoRelacionesDetallePagoCheque);
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemGuardarCambiosTablaDetallePagoCheque);		
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemDuplicarDetallePagoCheque);		
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemCopiarDetallePagoCheque);		
			this.jmenuAccionesDetallePagoCheque.add(this.jMenuItemVerFormDetallePagoCheque);		
			
			this.jmenuDatosDetallePagoCheque.add(this.jMenuItemRecargarInformacionDetallePagoCheque);				
			this.jmenuDatosDetallePagoCheque.add(this.jMenuItemAnterioresDetallePagoCheque);				
			this.jmenuDatosDetallePagoCheque.add(this.jMenuItemSiguientesDetallePagoCheque);				
			this.jmenuDatosDetallePagoCheque.add(this.jMenuItemAbrirOrderByDetallePagoCheque);				
			this.jmenuDatosDetallePagoCheque.add(this.jMenuItemMostrarOcultarDetallePagoCheque);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePagoCheque.add(this.jMenuItemGuardarCambiosDetallePagoCheque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePagoCheque.add(this.jmenuArchivoDetallePagoCheque);		
			this.jmenuBarDetallePagoCheque.add(this.jmenuAccionesDetallePagoCheque);		
			this.jmenuBarDetallePagoCheque.add(this.jmenuDatosDetallePagoCheque);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePagoCheque);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePagoCheque() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetallePagoCheque.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetallePagoCheque= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetallePagoCheque.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetallePagoCheque.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetallePagoCheque,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.setFocusable(false);


		this.jTabbedPaneBusquedasDetallePagoCheque=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePagoCheque.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePagoCheque.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePagoCheque.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePagoCheque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePagoCheque = new DetallePagoChequeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pago Cheque DATOS");
			this.jInternalFrameDetalleFormDetallePagoCheque = new DetallePagoChequeDetalleFormJInternalFrame(jDesktopPane,this.detallepagochequeSessionBean.getConGuardarRelaciones(),this.detallepagochequeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePagoCheque = null;//new DetallePagoChequeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePagoCheque= new GridBagLayout();
		
		
		this.jTableDatosDetallePagoCheque = new JTableMe();      
		
		String sToolTipDetallePagoCheque="";
		sToolTipDetallePagoCheque=DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePagoCheque+="(Tesoreria.DetallePagoCheque)";
		}
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePagoCheque+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePagoCheque.setToolTipText(sToolTipDetallePagoCheque);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePagoCheque);
		this.jTableDatosDetallePagoCheque.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePagoCheque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePagoCheque.setRowSelectionAllowed(true);
		this.jTableDatosDetallePagoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallePagoCheque = new JButtonMe();
		this.jButtonDuplicarDetallePagoCheque = new JButtonMe();
		this.jButtonCopiarDetallePagoCheque = new JButtonMe();
		this.jButtonVerFormDetallePagoCheque = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePagoCheque = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque = new JButtonMe();
		this.jButtonCerrarDetallePagoCheque = new JButtonMe();
		
		this.jScrollPanelDatosDetallePagoCheque = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePagoCheque = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pago Cheque";
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePagoCheque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePagoCheque.setToolTipText("Acciones");
        this.jPanelAccionesDetallePagoCheque.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePagoCheque=new ReporteDinamicoJInternalFrame(DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePagoCheque();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePagoCheque=new ImportacionJInternalFrame(DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePagoCheque();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePagoCheque = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePagoCheque.setText("Orden");
		this.jButtonAbrirOrderByDetallePagoCheque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePagoCheque,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePagoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagoCheque,false,this);
			
			//this.cargarOrderByDetallePagoCheque(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePagoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagoCheque,true,this);
			
			//this.cargarOrderByDetallePagoCheque(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePagoCheque.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosDetallePagoCheque.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosDetallePagoCheque.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosDetallePagoCheque.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePagoCheque.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePagoCheque.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePagoCheque.setText("Nuevo");
		this.jButtonDuplicarDetallePagoCheque.setText("Duplicar");
		this.jButtonCopiarDetallePagoCheque.setText("Copiar");
		this.jButtonVerFormDetallePagoCheque.setText("Ver");
		this.jButtonNuevoRelacionesDetallePagoCheque.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.setText("Guardar");
		this.jButtonCerrarDetallePagoCheque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePagoCheque,"nuevo_button","Nuevo",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePagoCheque,"duplicar_button","Duplicar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePagoCheque,"copiar_button","Copiar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePagoCheque,"ver_form","Ver",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePagoCheque,"nuevorelaciones_button","Nuevo Rel",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePagoCheque,"guardarcambiostabla_button","Guardar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePagoCheque,"cerrar_button","Salir",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePagoCheque.setToolTipText("Nuevo"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePagoCheque.setToolTipText("Duplicar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePagoCheque.setToolTipText("Copiar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePagoCheque.setToolTipText("Ver"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePagoCheque.setToolTipText("Nuevo Rel"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.setToolTipText("Guardar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePagoCheque.setToolTipText("Salir"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePagoCheque";
		inputMap = this.jButtonNuevoDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePagoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePagoCheque"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePagoCheque";
		inputMap = this.jButtonDuplicarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePagoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePagoCheque"));
		
		//COPIAR
		sMapKey = "CopiarDetallePagoCheque";
		inputMap = this.jButtonCopiarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePagoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePagoCheque"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePagoCheque";
		inputMap = this.jButtonVerFormDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePagoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePagoCheque"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePagoCheque";
		inputMap = this.jButtonNuevoRelacionesDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePagoCheque"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePagoCheque";
		inputMap = this.jButtonModificarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePagoCheque"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePagoCheque";
		inputMap = this.jButtonCerrarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePagoCheque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePagoCheque";
		inputMap = this.jButtonGuardarCambiosTablaDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePagoCheque"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePagoCheque.setName("jPanelParametrosReportesDetallePagoCheque"); 
		
		this.jPanelParametrosReportesAccionesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePagoCheque.setName("jPanelParametrosReportesAccionesDetallePagoCheque"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePagoCheque = new JButtonMe();
		this.jButtonRecargarInformacionDetallePagoCheque.setText("Recargar");
		this.jButtonRecargarInformacionDetallePagoCheque.setToolTipText("Recargar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePagoCheque,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePagoCheque = new JButtonMe();
		this.jButtonProcesarInformacionDetallePagoCheque.setText("Procesar");
		this.jButtonProcesarInformacionDetallePagoCheque.setToolTipText("Procesar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePagoCheque.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePagoCheque.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePagoCheque.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePagoCheque.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagoCheque.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePagoCheque.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagoCheque.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePagoCheque.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagoCheque.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePagoCheque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePagoCheque.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePagoCheque.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePagoCheque.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePagoCheque.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePagoCheque.setText("Accion");
		this.jComboBoxTiposAccionesDetallePagoCheque.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePagoCheque.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePagoCheque.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePagoCheque=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePagoCheque.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePagoCheque.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePagoCheque.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePagoCheque = new JLabelMe();
		
		this.jLabelAccionesDetallePagoCheque.setText("Acciones");		
		this.jLabelAccionesDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePagoCheque.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePagoCheque.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePagoCheque = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePagoCheque.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePagoCheque.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePagoCheque = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePagoCheque.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePagoCheque.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePagoCheque = new JButtonMe();
		//this.jButtonAnterioresDetallePagoCheque.setText("<<");
        this.jButtonAnterioresDetallePagoCheque.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePagoCheque,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePagoCheque = new JButtonMe();
		//this.jButtonSiguientesDetallePagoCheque.setText(">>");
        this.jButtonSiguientesDetallePagoCheque.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePagoCheque,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePagoCheque = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePagoCheque.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePagoCheque.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePagoCheque,"nuevoguardarcambios_button","Nue",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePagoCheque";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePagoCheque"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePagoCheque";
		inputMap = this.jButtonRecargarInformacionDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePagoCheque"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePagoCheque";
		inputMap = this.jButtonSiguientesDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePagoCheque"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePagoCheque";
		inputMap = this.jButtonAnterioresDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePagoCheque"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePagoCheque();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePagoCheque.setMinimumSize(new Dimension(this.getWidth(),DetallePagoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePagoCheque.setMaximumSize(new Dimension(this.getWidth(),DetallePagoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePagoCheque.setPreferredSize(new Dimension(this.getWidth(),DetallePagoChequeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoChequeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePagoCheque = new GridBagLayout();

			this.jPanelPaginacionDetallePagoCheque.setLayout(gridaBagLayoutPaginacionDetallePagoCheque);						
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 0;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonAnterioresDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					
						
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePagoCheque.gridy = 0;
			
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonNuevoGuardarCambiosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
						
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePagoCheque.gridy = 0;
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonSiguientesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 1;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonNuevoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
						
			
			
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
				this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePagoCheque.gridy = 1;
				this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePagoCheque.add(this.jButtonGuardarCambiosTablaDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			}
			
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 1;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonDuplicarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 1;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonCopiarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 1;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonVerFormDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 1;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePagoCheque.add(this.jButtonCerrarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		
		this.jButtonRecargarInformacionDetallePagoCheque.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePagoCheque.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePagoCheque.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePagoCheque.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePagoCheque.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePagoCheque.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePagoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePagoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePagoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePagoCheque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePagoCheque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePagoCheque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePagoCheque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePagoCheque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePagoCheque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePagoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePagoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePagoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePagoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePagoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePagoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePagoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePagoCheque.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePagoCheque.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePagoCheque.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePagoCheque.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePagoCheque.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePagoCheque.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePagoCheque.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePagoCheque.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePagoCheque.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePagoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePagoCheque = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePagoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePagoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePagoCheque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePagoCheque = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePagoCheque.setLayout(gridaBagParametrosReportesDetallePagoCheque);
			this.jPanelParametrosReportesAccionesDetallePagoCheque.setLayout(gridaBagParametrosReportesAccionesDetallePagoCheque);
			
			
			this.jPanelParametrosAuxiliar1DetallePagoCheque.setLayout(gridaBagParametrosAuxiliar1DetallePagoCheque);
			this.jPanelParametrosAuxiliar2DetallePagoCheque.setLayout(gridaBagParametrosAuxiliar2DetallePagoCheque);
			this.jPanelParametrosAuxiliar3DetallePagoCheque.setLayout(gridaBagParametrosAuxiliar3DetallePagoCheque);
			this.jPanelParametrosAuxiliar4DetallePagoCheque.setLayout(gridaBagParametrosAuxiliar4DetallePagoCheque);
			//this.jPanelParametrosAuxiliar5DetallePagoCheque.setLayout(gridaBagParametrosAuxiliar2DetallePagoCheque);			
			
			
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jButtonRecargarInformacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagoCheque.add(this.jComboBoxTiposPaginacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagoCheque.add(this.jCheckBoxConAltoMaximoTablaDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagoCheque.add(this.jComboBoxTiposArchivosReportesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jPanelParametrosAuxiliar1DetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePagoCheque.add(this.jComboBoxTiposReportesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);																		
			
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePagoCheque.add(this.jComboBoxTiposGraficosReportesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jPanelParametrosAuxiliar4DetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jComboBoxTiposReportesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jCheckBoxGenerarReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jPanelParametrosAuxiliar2DetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jLabelAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
				this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePagoCheque.add(this.jButtonAbrirOrderByDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jComboBoxTiposSeleccionarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			
			
			/*
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jCheckBoxSeleccionarTodosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jCheckBoxConGraficoReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagoCheque.add(this.jCheckBoxSeleccionarTodosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);															
				
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagoCheque.add(this.jCheckBoxSeleccionadosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);															
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagoCheque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagoCheque.add(this.jCheckBoxConGraficoReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jPanelParametrosAuxiliar3DetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jComboBoxTiposAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
	
				
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagoCheque.add(this.jTextFieldValorCampoGeneralDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePagoCheque = new GridBagLayout();

			this.jScrollPanelDatosDetallePagoCheque.setLayout(gridaBagLayoutDatosDetallePagoCheque);
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = 0;
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;
			
			this.jScrollPanelDatosDetallePagoCheque.add(this.jTableDatosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePagoCheque.setViewportView(this.jTableDatosDetallePagoCheque);
		this.jTableDatosDetallePagoCheque.setFillsViewportHeight(true);
		this.jTableDatosDetallePagoCheque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePagoCheque= new GridBagLayout();
		this.jPanelAccionesDetallePagoCheque.setLayout(gridaBagLayoutAccionesDetallePagoCheque);
		
		
		/*	
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
			
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonNuevoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetallePagoCheque= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetallePagoCheque.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetallePagoCheque.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetallePagoCheque.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetallePagoCheque.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetallePagoCheque.setLayout(gridaBagLayoutFK_IdAsientoContableDetallePagoCheque);

		gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagoCheque.gridy = 0;
		gridBagConstraintsDetallePagoCheque.gridx = 0;
		jPanelFK_IdAsientoContableDetallePagoCheque.add(jLabelid_asiento_contableFK_IdAsientoContableDetallePagoCheque, gridBagConstraintsDetallePagoCheque);

		gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagoCheque.gridy = 0;
		gridBagConstraintsDetallePagoCheque.gridx = 1;
		jPanelFK_IdAsientoContableDetallePagoCheque.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque, gridBagConstraintsDetallePagoCheque);


		gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePagoCheque.gridy = 0;
		gridBagConstraintsDetallePagoCheque.gridx = 0;
		jPanelFK_IdAsientoContableDetallePagoCheque.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque, gridBagConstraintsDetallePagoCheque);

		gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagoCheque.gridy = 1;
		gridBagConstraintsDetallePagoCheque.gridx =1;
		jPanelFK_IdAsientoContableDetallePagoCheque.add(jButtonFK_IdAsientoContableDetallePagoCheque, gridBagConstraintsDetallePagoCheque);

		jTabbedPaneBusquedasDetallePagoCheque.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetallePagoCheque);
		jTabbedPaneBusquedasDetallePagoCheque.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePagoCheque);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();						
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;		
			//this.gridBagConstraintsDetallePagoCheque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePagoCheque.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;		
		//this.gridBagConstraintsDetallePagoCheque.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePagoCheque);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;		
			this.gridBagConstraintsDetallePagoCheque.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePagoCheque.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);								
		
		
		/*
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		*/		
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePagoCheque.gridx =0;
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePagoCheque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
				
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePagoCheque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePagoCheque = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePagoCheque.setLayout(gridaBagLayoutBusquedasParametrosDetallePagoCheque);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePagoCheque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePagoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePagoCheque;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePagoCheque() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePagoCheque = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePagoCheque.setName("jPanelReporteDinamicoDetallePagoCheque"); 
		
		this.jPanelReporteDinamicoDetallePagoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePagoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePagoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePagoCheque.setLayout(gridaBagLayoutReporteDinamicoDetallePagoCheque);
		
		
		this.jInternalFrameReporteDinamicoDetallePagoCheque= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePagoCheque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePagoCheque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePagoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePagoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePagoCheque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePagoCheque.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePagoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePagoCheque.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePagoCheque.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePagoCheque.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePagoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePagoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePagoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePagoCheque = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePagoCheque.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelColumnasSelectReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePagoCheque = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePagoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePagoCheque.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePagoCheque=new JScrollPane(this.jListColumnasSelectReporteDetallePagoCheque);
			
			this.jScrollColumnasSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePagoCheque.add(this.jListColumnasSelectReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jScrollColumnasSelectReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePagoCheque = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePagoCheque.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePagoCheque = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePagoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePagoCheque.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePagoCheque=new JScrollPane(this.jListRelacionesSelectReporteDetallePagoCheque);
			
			this.jScrollRelacionesSelectReporteDetallePagoCheque.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePagoCheque.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePagoCheque.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePagoCheque = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePagoCheque = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePagoCheque = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePagoCheque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePagoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePagoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePagoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePagoCheque = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePagoCheque.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelConGraficoDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePagoCheque.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePagoCheque.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePagoCheque.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePagoCheque.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePagoCheque.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jCheckBoxConGraficoDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePagoCheque = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePagoCheque.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelColumnaCategoriaGraficoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePagoCheque = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePagoCheque.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelColumnaCategoriaValorDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePagoCheque.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePagoCheque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePagoCheque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePagoCheque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePagoCheque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jComboBoxColumnaCategoriaValorDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePagoCheque = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePagoCheque.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelColumnasValoresGraficoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePagoCheque = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePagoCheque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePagoCheque.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePagoCheque.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePagoCheque.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePagoCheque.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePagoCheque=new JScrollPane(this.jListColumnasValoresGraficoDetallePagoCheque);
			
			this.jScrollColumnasValoresGraficoDetallePagoCheque.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePagoCheque.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePagoCheque.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePagoCheque.add(this.jListColumnasSelectReporteDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jScrollColumnasValoresGraficoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelTiposGraficosReportesDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePagoCheque.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelGenerarExcelReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque.setToolTipText("Generar EXCEL"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePagoCheque.add(this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jComboBoxTiposReportesDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jLabelTiposArchivoReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePagoCheque = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePagoCheque.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePagoCheque,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePagoCheque.setToolTipText("Generar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jButtonGenerarReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePagoCheque = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePagoCheque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePagoCheque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePagoCheque.setToolTipText("Cancelar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagoCheque.add(this.jButtonCerrarReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePagoCheque = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePagoCheque= new JScrollPane(jPanelReporteDinamicoDetallePagoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePagoCheque.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePagoCheque.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePagoCheque.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePagoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePagoCheque.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePagoCheque);
		this.jInternalFrameReporteDinamicoDetallePagoCheque.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePagoCheque() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePagoCheque = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePagoCheque.setName("jPanelImportacionDetallePagoCheque"); 
		
		this.jPanelImportacionDetallePagoCheque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePagoCheque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePagoCheque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePagoCheque.setLayout(gridaBagLayoutImportacionDetallePagoCheque);
		
		
		this.jInternalFrameImportacionDetallePagoCheque= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePagoCheque= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePagoCheque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePagoCheque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePagoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePagoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePagoCheque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePagoCheque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePagoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePagoCheque.setResizable(true);
	    this.jInternalFrameImportacionDetallePagoCheque.setClosable(true);
	    this.jInternalFrameImportacionDetallePagoCheque.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePagoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePagoCheque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePagoCheque.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePagoCheque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePagoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePagoCheque.setResizable(true);
	    this.jInternalFrameImportacionDetallePagoCheque.setClosable(true);
	    this.jInternalFrameImportacionDetallePagoCheque.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePagoCheque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePagoCheque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePagoCheque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePagoCheque = new JLabelMe();

		this.jLabelArchivoImportacionDetallePagoCheque.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePagoCheque.add(this.jLabelArchivoImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePagoCheque = new JFileChooser();		
		this.jFileChooserImportacionDetallePagoCheque.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePagoCheque = new JButtonMe();
		this.jButtonAbrirImportacionDetallePagoCheque.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePagoCheque,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePagoCheque.setToolTipText("Generar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagoCheque.add(this.jButtonAbrirImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePagoCheque = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePagoCheque.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePagoCheque.add(this.jLabelPathArchivoImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePagoCheque=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePagoCheque.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePagoCheque.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePagoCheque.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagoCheque.add(this.jTextFieldPathArchivoImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePagoCheque = new JButtonMe();
		this.jButtonGenerarImportacionDetallePagoCheque.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePagoCheque,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePagoCheque.setToolTipText("Generar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagoCheque.add(this.jButtonGenerarImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePagoCheque = new JButtonMe();
		this.jButtonCerrarImportacionDetallePagoCheque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePagoCheque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePagoCheque.setToolTipText("Cancelar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagoCheque.add(this.jButtonCerrarImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePagoCheque = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePagoCheque= new JScrollPane(jPanelImportacionDetallePagoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePagoCheque.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePagoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePagoCheque.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePagoCheque);
		this.jInternalFrameImportacionDetallePagoCheque.getContentPane().add(this.jScrollPanelImportacionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallePagoCheque(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePagoCheque = new JButtonMe();
			this.jButtonAbrirOrderByDetallePagoCheque.setText("Orden");
			this.jButtonAbrirOrderByDetallePagoCheque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePagoCheque,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePagoCheque";
			inputMap = this.jButtonAbrirOrderByDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePagoCheque"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePagoCheque = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePagoCheque.setName("jPanelOrderByDetallePagoCheque"); 
			
			this.jPanelOrderByDetallePagoCheque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePagoCheque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePagoCheque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePagoCheque.setLayout(gridaBagLayoutOrderByDetallePagoCheque);
			
			
			this.jTableDatosDetallePagoChequeOrderBy = new JTableMe();        
			this.jTableDatosDetallePagoChequeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePagoChequeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePagoChequeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePagoChequeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePagoChequeOrderBy.setViewportView(this.jTableDatosDetallePagoChequeOrderBy);
			this.jTableDatosDetallePagoChequeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePagoChequeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePagoCheque= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePagoCheque= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePagoCheque = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePagoCheque= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePagoCheque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePagoCheque.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePagoCheque.setTitle("Orden");
			this.jInternalFrameOrderByDetallePagoCheque.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePagoCheque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePagoCheque.setResizable(true);
			this.jInternalFrameOrderByDetallePagoCheque.setClosable(true);
			this.jInternalFrameOrderByDetallePagoCheque.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePagoCheque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePagoCheque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePagoCheque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePagoCheque.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePagoCheque.ipady =150;
				
			this.jPanelOrderByDetallePagoCheque.add(jScrollPanelDatosDetallePagoChequeOrderBy, this.gridBagConstraintsDetallePagoCheque);//this.jTableDatosDetallePagoChequeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePagoCheque = new JButtonMe();
			this.jButtonCerrarOrderByDetallePagoCheque.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePagoCheque,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePagoCheque.setToolTipText("Cancelar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePagoCheque.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePagoCheque.add(this.jButtonCerrarOrderByDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePagoCheque = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePagoCheque= new JScrollPane(jPanelOrderByDetallePagoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePagoCheque.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePagoCheque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePagoCheque.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePagoCheque);
			
			this.jInternalFrameOrderByDetallePagoCheque.getContentPane().add(this.jScrollPanelOrderByDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
		
		} else {
			this.jButtonAbrirOrderByDetallePagoCheque = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepagochequeSessionBean.getConGuardarRelaciones()
			) {
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
		int iCountColumns=this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePagoCheque.getRowHeight();//DetallePagoChequeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.isSelected()) {
					iHeightTable=DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePagoCheque.isSelected()) {
					iHeightTable=DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagoChequeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePagoCheque.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePagoCheque.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePagoCheque.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePagoCheque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePagoCheque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePagoCheque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePagoCheque!=null && this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePagoCheque.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePagoCheque.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePagoCheque.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePagoCheque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePagoCheque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePagoCheque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallepagochequeLogic.getDetallePagoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagocheques.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePagoCheque> TraerDetallePagoChequeBeans(List<DetallePagoCheque> detallepagocheques,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePagoCheque detallepagocheque:detallepagocheques) {
					
				if(!(DetallePagoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePagoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepagocheque.setsDetalleGeneralEntityReporte(DetallePagoChequeConstantesFunciones.getDetallePagoChequeDescripcion(detallepagocheque));
										
						
					
						
					
				} else  {
							
					//detallepagocheque.setsDetalleGeneralEntityReporte(detallepagocheque.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepagochequebeans.add(detallepagochequebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepagocheques;
    }
	//PARA REPORTES FIN
}
