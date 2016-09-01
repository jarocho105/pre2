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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.nomina.util.CargaFamiliar_NMConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CargaFamiliar_NMJInternalFrame extends CargaFamiliar_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCargaFamiliar_NM;
	
	protected JMenuBar jmenuBarCargaFamiliar_NM;
	
	protected JMenu jmenuCargaFamiliar_NM;
	protected JMenu jmenuDatosCargaFamiliar_NM;
	protected JMenu jmenuArchivoCargaFamiliar_NM;
	protected JMenu jmenuAccionesCargaFamiliar_NM;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargaFamiliar_NM;	
	protected GridBagConstraints gridBagConstraintsCargaFamiliar_NM;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CargaFamiliar_NMDetalleFormJInternalFrame jInternalFrameDetalleFormCargaFamiliar_NM;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCargaFamiliar_NM;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCargaFamiliar_NM;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargafami="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";
	
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CargaFamiliar_NM> cargafamiliar_nms;		
	public List<CargaFamiliar_NM> cargafamiliar_nmsEliminados;	
	public List<CargaFamiliar_NM> cargafamiliar_nmsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCargaFamiliar_NM;		
	protected JButton jButtonAbrirOrderByCargaFamiliar_NM;
	
	
	//protected JPanel jPanelOrderByCargaFamiliar_NM;
	//public JScrollPane jScrollPanelOrderByCargaFamiliar_NM;	
	//protected JButton jButtonCerrarOrderByCargaFamiliar_NM;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CargaFamiliar_NMLogic cargafamiliar_nmLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCargaFamiliar_NM;
	public JScrollPane jScrollPanelDatosEdicionCargaFamiliar_NM;
	public JScrollPane jScrollPanelDatosGeneralCargaFamiliar_NM;
    
	
	
	//public JScrollPane jScrollPanelDatosCargaFamiliar_NMOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCargaFamiliar_NM;
	//public JScrollPane jScrollPanelImportacionCargaFamiliar_NM;
	
	
	
	protected JPanel jPanelAccionesCargaFamiliar_NM;
	
    protected JPanel jPanelPaginacionCargaFamiliar_NM;
    protected JPanel jPanelParametrosReportesCargaFamiliar_NM;
	protected JPanel jPanelParametrosReportesAccionesCargaFamiliar_NM;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CargaFamiliar_NM;
	protected JPanel jPanelParametrosAuxiliar2CargaFamiliar_NM;
	protected JPanel jPanelParametrosAuxiliar3CargaFamiliar_NM;
	protected JPanel jPanelParametrosAuxiliar4CargaFamiliar_NM;
	//protected JPanel jPanelParametrosAuxiliar5CargaFamiliar_NM;
	
	
	
	//protected JPanel jPanelReporteDinamicoCargaFamiliar_NM;
	//protected JPanel jPanelImportacionCargaFamiliar_NM;
	
	
	public JTable jTableDatosCargaFamiliar_NM;
	
	
	
	//public JTable jTableDatosCargaFamiliar_NMOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCargaFamiliar_NM;
	protected JButton jButtonDuplicarCargaFamiliar_NM;
	protected JButton jButtonCopiarCargaFamiliar_NM;
	protected JButton jButtonVerFormCargaFamiliar_NM;
	protected JButton jButtonNuevoRelacionesCargaFamiliar_NM;
	protected JButton jButtonModificarCargaFamiliar_NM;
	
    protected JButton jButtonGuardarCambiosTablaCargaFamiliar_NM;
	protected JButton jButtonCerrarCargaFamiliar_NM;
	
	
	protected JButton jButtonRecargarInformacionCargaFamiliar_NM;
	protected JButton jButtonProcesarInformacionCargaFamiliar_NM;
	
	
	protected JButton jButtonAnterioresCargaFamiliar_NM;
	protected JButton jButtonSiguientesCargaFamiliar_NM;
	protected JButton jButtonNuevoGuardarCambiosCargaFamiliar_NM;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCargaFamiliar_NM;
	//protected JButton jButtonCerrarReporteDinamicoCargaFamiliar_NM;
	//protected JButton jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM;	
	
	
	
	//protected JButton jButtonAbrirImportacionCargaFamiliar_NM;
	//protected JButton jButtonGenerarImportacionCargaFamiliar_NM;
	//protected JButton jButtonCerrarImportacionCargaFamiliar_NM;
	//protected JFileChooser jFileChooserImportacionCargaFamiliar_NM;
	//protected File fileImportacionCargaFamiliar_NM;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargaFamiliar_NM;
	protected JButton jButtonDuplicarToolBarCargaFamiliar_NM;
	protected JButton jButtonNuevoRelacionesToolBarCargaFamiliar_NM;
	
	
	public JButton jButtonGuardarCambiosToolBarCargaFamiliar_NM;
	protected JButton jButtonCopiarToolBarCargaFamiliar_NM;
	protected JButton jButtonVerFormToolBarCargaFamiliar_NM;
	public JButton jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarCargaFamiliar_NM;
	protected JButton jButtonCerrarToolBarCargaFamiliar_NM;
	
	protected JButton jButtonRecargarInformacionToolBarCargaFamiliar_NM;
	protected JButton jButtonProcesarInformacionToolBarCargaFamiliar_NM;
	protected JButton jButtonAnterioresToolBarCargaFamiliar_NM;
	protected JButton jButtonSiguientesToolBarCargaFamiliar_NM;
	protected JButton jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM;
	protected JButton jButtonAbrirOrderByToolBarCargaFamiliar_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargaFamiliar_NM;
	protected JMenuItem jMenuItemDuplicarCargaFamiliar_NM;
	protected JMenuItem jMenuItemNuevoRelacionesCargaFamiliar_NM;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCargaFamiliar_NM;
	protected JMenuItem jMenuItemCopiarCargaFamiliar_NM;
	protected JMenuItem jMenuItemVerFormCargaFamiliar_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargaFamiliar_NM;
	protected JMenuItem jMenuItemCerrarCargaFamiliar_NM;
	protected JMenuItem jMenuItemDetalleCerrarCargaFamiliar_NM;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCargaFamiliar_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargaFamiliar_NM;
	
	protected JMenuItem jMenuItemRecargarInformacionCargaFamiliar_NM;
	protected JMenuItem jMenuItemProcesarInformacionCargaFamiliar_NM;
	protected JMenuItem jMenuItemAnterioresCargaFamiliar_NM;
	protected JMenuItem jMenuItemSiguientesCargaFamiliar_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargaFamiliar_NM;
	protected JMenuItem jMenuItemAbrirOrderByCargaFamiliar_NM;
	protected JMenuItem jMenuItemMostrarOcultarCargaFamiliar_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargaFamiliar_NM;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCargaFamiliar_NM;
	protected JCheckBox jCheckBoxSeleccionadosCargaFamiliar_NM;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCargaFamiliar_NM;
	protected JCheckBox jCheckBoxConGraficoReporteCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCargaFamiliar_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCargaFamiliar_NM;
	protected JTextField jTextFieldValorCampoGeneralCargaFamiliar_NM;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCargaFamiliar_NM;
	//public JList<Reporte> jListColumnasSelectReporteCargaFamiliar_NM;
	//public JScrollPane jScrollColumnasSelectReporteCargaFamiliar_NM;
	
	//public JLabel jLabelRelacionesSelectReporteCargaFamiliar_NM;
	//public JList<Reporte> jListRelacionesSelectReporteCargaFamiliar_NM;
	//public JScrollPane jScrollRelacionesSelectReporteCargaFamiliar_NM;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCargaFamiliar_NM;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCargaFamiliar_NM;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM;
	//public JLabel jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM;
	
		
	//public JLabel jLabelArchivoImportacionCargaFamiliar_NM;	
	//public JLabel jLabelPathArchivoImportacionCargaFamiliar_NM;
	//protected JTextField jTextFieldPathArchivoImportacionCargaFamiliar_NM;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCargaFamiliar_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM;
	
	//public JLabel jLabelColumnaCategoriaValorCargaFamiliar_NM;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCargaFamiliar_NM;
	
	//public JLabel jLabelColumnasValoresGraficoCargaFamiliar_NM;
	//public JList<Reporte> jListColumnasValoresGraficoCargaFamiliar_NM;
	//public JScrollPane jScrollColumnasValoresGraficoCargaFamiliar_NM;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCargaFamiliar_NM;
	public JPanel jPanelFK_IdEmpleadoCargaFamiliar_NM;
	public JButton jButtonFK_IdEmpleadoCargaFamiliar_NM;
	public JPanel jPanelFK_IdEstadoCivilCargaFamiliar_NM;
	public JButton jButtonFK_IdEstadoCivilCargaFamiliar_NM;
	public JPanel jPanelFK_IdTipoCargaFamiCargaFamiliar_NM;
	public JButton jButtonFK_IdTipoCargaFamiCargaFamiliar_NM;
	public JPanel jPanelFK_IdTipoGeneroCargaFamiliar_NM;
	public JButton jButtonFK_IdTipoGeneroCargaFamiliar_NM;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoCargaFamiliar_NM;
	public JLabel jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM;
	public JButton jButtonid_empleadoFK_IdEmpleadoCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCargaFamiliar_NMBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM;
	
	public JPanel jPanelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM;
	public JLabel jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM;
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliar_NMBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM;
	public JLabel jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM;
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NMBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM;
	public JLabel jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM;
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NMUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NMBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CargaFamiliar_NMJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliar_NMJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCargaFamiliar_NM)	{
		this.jButtonRecargarInformacionCargaFamiliar_NM = jButtonRecargarInformacionCargaFamiliar_NM;
	}
	
	public JButton getjButtonProcesarInformacionCargaFamiliar_NM() {
		return this.jButtonProcesarInformacionCargaFamiliar_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargaFamiliar_NM)	{
		this.jButtonProcesarInformacionCargaFamiliar_NM = jButtonProcesarInformacionCargaFamiliar_NM;
	}
	
	
	public JButton getjButtonRecargarInformacionCargaFamiliar_NM() {
		return this.jButtonRecargarInformacionCargaFamiliar_NM;
	}
	
	
	public List<CargaFamiliar_NM> getcargafamiliar_nms() {
		return this.cargafamiliar_nms;
	}

	public void setcargafamiliar_nms(List<CargaFamiliar_NM> cargafamiliar_nms) {
		this.cargafamiliar_nms = cargafamiliar_nms;
	}
	
	public List<CargaFamiliar_NM> getcargafamiliar_nmsAux() {
		return this.cargafamiliar_nmsAux;
	}

	public void setcargafamiliar_nmsAux(List<CargaFamiliar_NM> cargafamiliar_nmsAux) {
		this.cargafamiliar_nmsAux = cargafamiliar_nmsAux;
	}
	
	public List<CargaFamiliar_NM> getcargafamiliar_nmsEliminados() {
		return this.cargafamiliar_nmsEliminados;
	}

	public void setCargaFamiliar_NMsEliminados(List<CargaFamiliar_NM> cargafamiliar_nmsEliminados) {
		this.cargafamiliar_nmsEliminados = cargafamiliar_nmsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCargaFamiliar_NM() {
		return jComboBoxTiposSeleccionarCargaFamiliar_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCargaFamiliar_NM(
			JComboBox jComboBoxTiposSeleccionarCargaFamiliar_NM) {
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM = jComboBoxTiposSeleccionarCargaFamiliar_NM;
	}
	
	public void setBorderResaltarTiposSeleccionarCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCargaFamiliar_NM() {
		return jTextFieldValorCampoGeneralCargaFamiliar_NM;
	}

	public void setjTextFieldValorCampoGeneralCargaFamiliar_NM(
			JTextField jTextFieldValorCampoGeneralCargaFamiliar_NM) {
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM = jTextFieldValorCampoGeneralCargaFamiliar_NM;
	}

	public void setBorderResaltarValorCampoGeneralCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCargaFamiliar_NM() {
		return this.jCheckBoxSeleccionarTodosCargaFamiliar_NM;
	}

	public void setjCheckBoxSeleccionarTodosCargaFamiliar_NM(
			JCheckBox jCheckBoxSeleccionarTodosCargaFamiliar_NM) {
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM = jCheckBoxSeleccionarTodosCargaFamiliar_NM;
	}

	public void setBorderResaltarSeleccionarTodosCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCargaFamiliar_NM() {
		return this.jCheckBoxSeleccionadosCargaFamiliar_NM;
	}

	public void setjCheckBoxSeleccionadosCargaFamiliar_NM(
			JCheckBox jCheckBoxSeleccionadosCargaFamiliar_NM) {
		this.jCheckBoxSeleccionadosCargaFamiliar_NM = jCheckBoxSeleccionadosCargaFamiliar_NM;
	}
	
	public void setBorderResaltarSeleccionadosCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCargaFamiliar_NM() {
		return this.jComboBoxTiposArchivosReportesCargaFamiliar_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCargaFamiliar_NM(
			JComboBox jComboBoxTiposArchivosReportesCargaFamiliar_NM) {
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM = jComboBoxTiposArchivosReportesCargaFamiliar_NM;
	}

	public void setBorderResaltarTiposArchivosReportesCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCargaFamiliar_NM() {
		return this.jComboBoxTiposReportesCargaFamiliar_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCargaFamiliar_NM(
			JComboBox jComboBoxTiposReportesCargaFamiliar_NM) {
		this.jComboBoxTiposReportesCargaFamiliar_NM = jComboBoxTiposReportesCargaFamiliar_NM;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCargaFamiliar_NM() {
	//	return jComboBoxTiposReportesDinamicoCargaFamiliar_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCargaFamiliar_NM(
	//		JComboBox jComboBoxTiposReportesDinamicoCargaFamiliar_NM) {
	//	this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM = jComboBoxTiposReportesDinamicoCargaFamiliar_NM;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM() {
	//	return jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM = jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM;
	//}
	
	public void setBorderResaltarTiposReportesCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCargaFamiliar_NM() {
		return this.jComboBoxTiposGraficosReportesCargaFamiliar_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCargaFamiliar_NM(
			JComboBox jComboBoxTiposGraficosReportesCargaFamiliar_NM) {
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM = jComboBoxTiposGraficosReportesCargaFamiliar_NM;
	}
	
	public void setBorderResaltarTiposGraficosReportesCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCargaFamiliar_NM() {
		return this.jComboBoxTiposPaginacionCargaFamiliar_NM;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCargaFamiliar_NM(
			JComboBox jComboBoxTiposPaginacionCargaFamiliar_NM) {
		this.jComboBoxTiposPaginacionCargaFamiliar_NM = jComboBoxTiposPaginacionCargaFamiliar_NM;
	}
	
	public void setBorderResaltarTiposPaginacionCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCargaFamiliar_NM() {
		return this.jComboBoxTiposRelacionesCargaFamiliar_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargaFamiliar_NM() {
		return this.jComboBoxTiposAccionesCargaFamiliar_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargaFamiliar_NM(
			JComboBox jComboBoxTiposRelacionesCargaFamiliar_NM) {
		this.jComboBoxTiposRelacionesCargaFamiliar_NM = jComboBoxTiposRelacionesCargaFamiliar_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargaFamiliar_NM(
			JComboBox jComboBoxTiposAccionesCargaFamiliar_NM) {
		this.jComboBoxTiposAccionesCargaFamiliar_NM = jComboBoxTiposAccionesCargaFamiliar_NM;
	}
	
	public void setBorderResaltarTiposRelacionesCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCargaFamiliar_NM() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCargaFamiliar_NM .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCargaFamiliar_NM() {
	//	return jCheckBoxConGraficoDinamicoCargaFamiliar_NM;
	//}

	//public void setjCheckBoxConGraficoDinamicoCargaFamiliar_NM(
	//		JCheckBox jCheckBoxConGraficoDinamicoCargaFamiliar_NM) {
	//	this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM = jCheckBoxConGraficoDinamicoCargaFamiliar_NM;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCargaFamiliar_NM() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCargaFamiliar_NM.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM .setBorder(borderResaltar);		
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
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargaFamiliar_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Carga Familiar_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
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
		
		CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CargaFamiliar_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCargaFamiliar_NM= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"nuevo","nuevo","Nuevo"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"duplicar","duplicar","Duplicar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"copiar","copiar","Copiar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"ver_form","ver_form","Ver"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"recargar","recargar","Recargar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCargaFamiliar_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCargaFamiliar_NM,this.jTtoolBarCargaFamiliar_NM,
							"cerrar","cerrar","Salir"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCargaFamiliar_NM=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCargaFamiliar_NM;
			
				this.jButtonProcesarInformacionToolBarCargaFamiliar_NM=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCargaFamiliar_NM;
				
		//protected JButton jButtonModificarToolBarCargaFamiliar_NM;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCargaFamiliar_NM=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCargaFamiliar_NM=new JMenuMe("General");
		this.jmenuArchivoCargaFamiliar_NM=new JMenuMe("Archivo");
		this.jmenuAccionesCargaFamiliar_NM=new JMenuMe("Acciones");
		this.jmenuDatosCargaFamiliar_NM=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargaFamiliar_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargaFamiliar_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargaFamiliar_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCargaFamiliar_NM= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCargaFamiliar_NM.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCargaFamiliar_NM,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCargaFamiliar_NM= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCargaFamiliar_NM.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCargaFamiliar_NM,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCargaFamiliar_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargaFamiliar_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargaFamiliar_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCargaFamiliar_NM= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCargaFamiliar_NM.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCargaFamiliar_NM,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCargaFamiliar_NM= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCargaFamiliar_NM.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCargaFamiliar_NM,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargaFamiliar_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargaFamiliar_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargaFamiliar_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCargaFamiliar_NM= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCargaFamiliar_NM.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCargaFamiliar_NM,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCargaFamiliar_NM= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCargaFamiliar_NM.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCargaFamiliar_NM,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCargaFamiliar_NM= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCargaFamiliar_NM.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCargaFamiliar_NM,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCargaFamiliar_NM= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCargaFamiliar_NM.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCargaFamiliar_NM,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCargaFamiliar_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCargaFamiliar_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCargaFamiliar_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargaFamiliar_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargaFamiliar_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargaFamiliar_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCargaFamiliar_NM.add(this.jMenuItemCerrarCargaFamiliar_NM);
			
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemNuevoCargaFamiliar_NM);
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemNuevoGuardarCambiosCargaFamiliar_NM);
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemNuevoRelacionesCargaFamiliar_NM);
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemGuardarCambiosTablaCargaFamiliar_NM);		
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemDuplicarCargaFamiliar_NM);		
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemCopiarCargaFamiliar_NM);		
			this.jmenuAccionesCargaFamiliar_NM.add(this.jMenuItemVerFormCargaFamiliar_NM);		
			
			this.jmenuDatosCargaFamiliar_NM.add(this.jMenuItemRecargarInformacionCargaFamiliar_NM);				
			this.jmenuDatosCargaFamiliar_NM.add(this.jMenuItemAnterioresCargaFamiliar_NM);				
			this.jmenuDatosCargaFamiliar_NM.add(this.jMenuItemSiguientesCargaFamiliar_NM);				
			this.jmenuDatosCargaFamiliar_NM.add(this.jMenuItemAbrirOrderByCargaFamiliar_NM);				
			this.jmenuDatosCargaFamiliar_NM.add(this.jMenuItemMostrarOcultarCargaFamiliar_NM);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCargaFamiliar_NM.add(this.jMenuItemGuardarCambiosCargaFamiliar_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCargaFamiliar_NM.add(this.jmenuArchivoCargaFamiliar_NM);		
			this.jmenuBarCargaFamiliar_NM.add(this.jmenuAccionesCargaFamiliar_NM);		
			this.jmenuBarCargaFamiliar_NM.add(this.jmenuDatosCargaFamiliar_NM);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCargaFamiliar_NM);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCargaFamiliar_NM() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoCargaFamiliar_NM.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoCargaFamiliar_NM= new JButtonMe();
		this.jButtonFK_IdEmpleadoCargaFamiliar_NM.setText("Buscar");
		this.jButtonFK_IdEmpleadoCargaFamiliar_NM.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoCargaFamiliar_NM,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM.setFocusable(false);

		this.jPanelFK_IdEstadoCivilCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCivilCargaFamiliar_NM.setToolTipText("Buscar Por Estado Civil ");
		this.jButtonFK_IdEstadoCivilCargaFamiliar_NM= new JButtonMe();
		this.jButtonFK_IdEstadoCivilCargaFamiliar_NM.setText("Buscar");
		this.jButtonFK_IdEstadoCivilCargaFamiliar_NM.setToolTipText("Buscar Por Estado Civil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCivilCargaFamiliar_NM,"buscar_button","Buscar Por Estado Civil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCivilCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM = new JLabelMe();
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setText("Estado Civil :");
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setToolTipText("Estado Civil");
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCargaFamiCargaFamiliar_NM.setToolTipText("Buscar Por Tipo Carga Fami ");
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM= new JButtonMe();
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM.setText("Buscar");
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM.setToolTipText("Buscar Por Tipo Carga Fami ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM,"buscar_button","Buscar Por Tipo Carga Fami ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCargaFamiCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM = new JLabelMe();
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setText("Tipo Carga Fami :");
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setToolTipText("Tipo Carga Fami");
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGeneroCargaFamiliar_NM=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGeneroCargaFamiliar_NM.setToolTipText("Buscar Por Tipo Genero ");
		this.jButtonFK_IdTipoGeneroCargaFamiliar_NM= new JButtonMe();
		this.jButtonFK_IdTipoGeneroCargaFamiliar_NM.setText("Buscar");
		this.jButtonFK_IdTipoGeneroCargaFamiliar_NM.setToolTipText("Buscar Por Tipo Genero ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGeneroCargaFamiliar_NM,"buscar_button","Buscar Por Tipo Genero ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGeneroCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM = new JLabelMe();
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setText("Tipo Genero :");
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setToolTipText("Tipo Genero");
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM= new JComboBoxMe();
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCargaFamiliar_NM=new JTabbedPane();


		this.jTabbedPaneBusquedasCargaFamiliar_NM.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargaFamiliar_NM.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargaFamiliar_NM.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCargaFamiliar_NM = new CargaFamiliar_NMDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Carga Familiar_ N M DATOS");
			this.jInternalFrameDetalleFormCargaFamiliar_NM = new CargaFamiliar_NMDetalleFormJInternalFrame(jDesktopPane,this.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCargaFamiliar_NM = null;//new CargaFamiliar_NMDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargaFamiliar_NM= new GridBagLayout();
		
		
		this.jTableDatosCargaFamiliar_NM = new JTableMe();      
		
		String sToolTipCargaFamiliar_NM="";
		sToolTipCargaFamiliar_NM=CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargaFamiliar_NM+="(Nomina.CargaFamiliar_NM)";
		}
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargaFamiliar_NM+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCargaFamiliar_NM.setToolTipText(sToolTipCargaFamiliar_NM);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCargaFamiliar_NM);
		this.jTableDatosCargaFamiliar_NM.setAutoCreateRowSorter(true);
		this.jTableDatosCargaFamiliar_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCargaFamiliar_NM.setRowSelectionAllowed(true);
		this.jTableDatosCargaFamiliar_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCargaFamiliar_NM,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCargaFamiliar_NM = new JButtonMe();
		this.jButtonDuplicarCargaFamiliar_NM = new JButtonMe();
		this.jButtonCopiarCargaFamiliar_NM = new JButtonMe();
		this.jButtonVerFormCargaFamiliar_NM = new JButtonMe();
		this.jButtonNuevoRelacionesCargaFamiliar_NM = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM = new JButtonMe();
		this.jButtonCerrarCargaFamiliar_NM = new JButtonMe();
		
		this.jScrollPanelDatosCargaFamiliar_NM = new JScrollPane();   
        this.jScrollPanelDatosGeneralCargaFamiliar_NM = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Carga Familiar_ N M";
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosCargaFamiliar_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargaFamiliar_NM.setToolTipText("Acciones");
        this.jPanelAccionesCargaFamiliar_NM.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCargaFamiliar_NM=new ReporteDinamicoJInternalFrame(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCargaFamiliar_NM();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCargaFamiliar_NM=new ImportacionJInternalFrame(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCargaFamiliar_NM();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCargaFamiliar_NM = new JButtonMe();
		
		this.jButtonAbrirOrderByCargaFamiliar_NM.setText("Orden");
		this.jButtonAbrirOrderByCargaFamiliar_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargaFamiliar_NM,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargaFamiliar_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar_NM,false,this);
			
			//this.cargarOrderByCargaFamiliar_NM(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargaFamiliar_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar_NM,true,this);
			
			//this.cargarOrderByCargaFamiliar_NM(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCargaFamiliar_NM.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosCargaFamiliar_NM.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosCargaFamiliar_NM.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCargaFamiliar_NM.setText("Nuevo");
		this.jButtonDuplicarCargaFamiliar_NM.setText("Duplicar");
		this.jButtonCopiarCargaFamiliar_NM.setText("Copiar");
		this.jButtonVerFormCargaFamiliar_NM.setText("Ver");
		this.jButtonNuevoRelacionesCargaFamiliar_NM.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setText("Guardar");
		this.jButtonCerrarCargaFamiliar_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargaFamiliar_NM,"nuevo_button","Nuevo",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCargaFamiliar_NM,"duplicar_button","Duplicar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCargaFamiliar_NM,"copiar_button","Copiar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCargaFamiliar_NM,"ver_form","Ver",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCargaFamiliar_NM,"nuevorelaciones_button","Nuevo Rel",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargaFamiliar_NM,"guardarcambiostabla_button","Guardar",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargaFamiliar_NM,"cerrar_button","Salir",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCargaFamiliar_NM.setToolTipText("Nuevo"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCargaFamiliar_NM.setToolTipText("Duplicar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCargaFamiliar_NM.setToolTipText("Copiar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCargaFamiliar_NM.setToolTipText("Ver"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCargaFamiliar_NM.setToolTipText("Nuevo Rel"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.setToolTipText("Guardar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargaFamiliar_NM.setToolTipText("Salir"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargaFamiliar_NM";
		inputMap = this.jButtonNuevoCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargaFamiliar_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargaFamiliar_NM"));
		
		//DUPLICAR
		sMapKey = "DuplicarCargaFamiliar_NM";
		inputMap = this.jButtonDuplicarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCargaFamiliar_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCargaFamiliar_NM"));
		
		//COPIAR
		sMapKey = "CopiarCargaFamiliar_NM";
		inputMap = this.jButtonCopiarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCargaFamiliar_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCargaFamiliar_NM"));
		
		//VEr FORM
		sMapKey = "VerFormCargaFamiliar_NM";
		inputMap = this.jButtonVerFormCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCargaFamiliar_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCargaFamiliar_NM"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCargaFamiliar_NM";
		inputMap = this.jButtonNuevoRelacionesCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCargaFamiliar_NM"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCargaFamiliar_NM";
		inputMap = this.jButtonModificarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCargaFamiliar_NM"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCargaFamiliar_NM";
		inputMap = this.jButtonCerrarCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargaFamiliar_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargaFamiliar_NM";
		inputMap = this.jButtonGuardarCambiosTablaCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargaFamiliar_NM"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCargaFamiliar_NM.setName("jPanelParametrosReportesCargaFamiliar_NM"); 
		
		this.jPanelParametrosReportesAccionesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCargaFamiliar_NM.setName("jPanelParametrosReportesAccionesCargaFamiliar_NM"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCargaFamiliar_NM = new JButtonMe();
		this.jButtonRecargarInformacionCargaFamiliar_NM.setText("Recargar");
		this.jButtonRecargarInformacionCargaFamiliar_NM.setToolTipText("Recargar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCargaFamiliar_NM,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCargaFamiliar_NM = new JButtonMe();
		this.jButtonProcesarInformacionCargaFamiliar_NM.setText("Procesar");
		this.jButtonProcesarInformacionCargaFamiliar_NM.setToolTipText("Procesar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCargaFamiliar_NM.setVisible(false);
			
		this.jButtonProcesarInformacionCargaFamiliar_NM.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargaFamiliar_NM.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargaFamiliar_NM.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setText("TIPO");       
		this.jComboBoxTiposReportesCargaFamiliar_NM.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCargaFamiliar_NM.setText("Paginacion");
		this.jComboBoxTiposPaginacionCargaFamiliar_NM.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCargaFamiliar_NM.setText("Accion");
		this.jComboBoxTiposRelacionesCargaFamiliar_NM.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargaFamiliar_NM.setText("Accion");
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setText("Accion");
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargaFamiliar_NM.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCargaFamiliar_NM = new JLabelMe();
		
		this.jLabelAccionesCargaFamiliar_NM.setText("Acciones");		
		this.jLabelAccionesCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCargaFamiliar_NM = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCargaFamiliar_NM.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCargaFamiliar_NM.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setText("Graf.");
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCargaFamiliar_NM = new JButtonMe();
		//this.jButtonAnterioresCargaFamiliar_NM.setText("<<");
        this.jButtonAnterioresCargaFamiliar_NM.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCargaFamiliar_NM,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCargaFamiliar_NM = new JButtonMe();
		//this.jButtonSiguientesCargaFamiliar_NM.setText(">>");
        this.jButtonSiguientesCargaFamiliar_NM.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCargaFamiliar_NM,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar_NM = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.setText("Nue");
        this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCargaFamiliar_NM,"nuevoguardarcambios_button","Nue",this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCargaFamiliar_NM";
		inputMap = this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCargaFamiliar_NM"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCargaFamiliar_NM";
		inputMap = this.jButtonRecargarInformacionCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCargaFamiliar_NM"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCargaFamiliar_NM";
		inputMap = this.jButtonSiguientesCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCargaFamiliar_NM"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCargaFamiliar_NM";
		inputMap = this.jButtonAnterioresCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCargaFamiliar_NM"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCargaFamiliar_NM();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCargaFamiliar_NM.setMinimumSize(new Dimension(this.getWidth(),CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargaFamiliar_NM.setMaximumSize(new Dimension(this.getWidth(),CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargaFamiliar_NM.setPreferredSize(new Dimension(this.getWidth(),CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliar_NMBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCargaFamiliar_NM = new GridBagLayout();

			this.jPanelPaginacionCargaFamiliar_NM.setLayout(gridaBagLayoutPaginacionCargaFamiliar_NM);						
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonAnterioresCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					
						
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
			
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonNuevoGuardarCambiosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
						
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonSiguientesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonNuevoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
						
			
			
			if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
				this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonGuardarCambiosTablaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			}
			
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonDuplicarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonCopiarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonVerFormCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 1;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCargaFamiliar_NM.add(this.jButtonCerrarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		
		this.jButtonRecargarInformacionCargaFamiliar_NM.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargaFamiliar_NM.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargaFamiliar_NM.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargaFamiliar_NM.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCargaFamiliar_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargaFamiliar_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargaFamiliar_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargaFamiliar_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCargaFamiliar_NM.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargaFamiliar_NM.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargaFamiliar_NM.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargaFamiliar_NM.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargaFamiliar_NM.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCargaFamiliar_NM.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargaFamiliar_NM.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargaFamiliar_NM.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCargaFamiliar_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCargaFamiliar_NM = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CargaFamiliar_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CargaFamiliar_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CargaFamiliar_NM = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CargaFamiliar_NM = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCargaFamiliar_NM.setLayout(gridaBagParametrosReportesCargaFamiliar_NM);
			this.jPanelParametrosReportesAccionesCargaFamiliar_NM.setLayout(gridaBagParametrosReportesAccionesCargaFamiliar_NM);
			
			
			this.jPanelParametrosAuxiliar1CargaFamiliar_NM.setLayout(gridaBagParametrosAuxiliar1CargaFamiliar_NM);
			this.jPanelParametrosAuxiliar2CargaFamiliar_NM.setLayout(gridaBagParametrosAuxiliar2CargaFamiliar_NM);
			this.jPanelParametrosAuxiliar3CargaFamiliar_NM.setLayout(gridaBagParametrosAuxiliar3CargaFamiliar_NM);
			this.jPanelParametrosAuxiliar4CargaFamiliar_NM.setLayout(gridaBagParametrosAuxiliar4CargaFamiliar_NM);
			//this.jPanelParametrosAuxiliar5CargaFamiliar_NM.setLayout(gridaBagParametrosAuxiliar2CargaFamiliar_NM);			
			
			
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jButtonRecargarInformacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar_NM.add(this.jComboBoxTiposPaginacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar_NM.add(this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar_NM.add(this.jComboBoxTiposArchivosReportesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jPanelParametrosAuxiliar1CargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CargaFamiliar_NM.add(this.jComboBoxTiposReportesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);																		
			
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CargaFamiliar_NM.add(this.jComboBoxTiposGraficosReportesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jPanelParametrosAuxiliar4CargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jComboBoxTiposReportesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jCheckBoxGenerarReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jPanelParametrosAuxiliar2CargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jLabelAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jButtonAbrirOrderByCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jComboBoxTiposSeleccionarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			
			
			/*
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jCheckBoxSeleccionarTodosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jCheckBoxConGraficoReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar_NM.add(this.jCheckBoxSeleccionarTodosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);															
				
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar_NM.add(this.jCheckBoxSeleccionadosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);															
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar_NM.add(this.jCheckBoxConGraficoReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jPanelParametrosAuxiliar3CargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jComboBoxTiposAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
	
				
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar_NM.add(this.jTextFieldValorCampoGeneralCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCargaFamiliar_NM = new GridBagLayout();

			this.jScrollPanelDatosCargaFamiliar_NM.setLayout(gridaBagLayoutDatosCargaFamiliar_NM);
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
			
			this.jScrollPanelDatosCargaFamiliar_NM.add(this.jTableDatosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCargaFamiliar_NM.setViewportView(this.jTableDatosCargaFamiliar_NM);
		this.jTableDatosCargaFamiliar_NM.setFillsViewportHeight(true);
		this.jTableDatosCargaFamiliar_NM.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCargaFamiliar_NM= new GridBagLayout();
		this.jPanelAccionesCargaFamiliar_NM.setLayout(gridaBagLayoutAccionesCargaFamiliar_NM);
		
		
		/*	
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
			
		this.jPanelAccionesCargaFamiliar_NM.add(this.jButtonNuevoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoCargaFamiliar_NM.setLayout(gridaBagLayoutFK_IdEmpleadoCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		jPanelFK_IdEmpleadoCargaFamiliar_NM.add(jLabelid_empleadoFK_IdEmpleadoCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 1;
		jPanelFK_IdEmpleadoCargaFamiliar_NM.add(jComboBoxid_empleadoFK_IdEmpleadoCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);


		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.NONE;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		jPanelFK_IdEmpleadoCargaFamiliar_NM.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 1;
		gridBagConstraintsCargaFamiliar_NM.gridx =1;
		jPanelFK_IdEmpleadoCargaFamiliar_NM.add(jButtonFK_IdEmpleadoCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		jTabbedPaneBusquedasCargaFamiliar_NM.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoCargaFamiliar_NM);
		jTabbedPaneBusquedasCargaFamiliar_NM.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCivilCargaFamiliar_NM.setLayout(gridaBagLayoutFK_IdEstadoCivilCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		jPanelFK_IdEstadoCivilCargaFamiliar_NM.add(jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 1;
		jPanelFK_IdEstadoCivilCargaFamiliar_NM.add(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 1;
		gridBagConstraintsCargaFamiliar_NM.gridx =1;
		jPanelFK_IdEstadoCivilCargaFamiliar_NM.add(jButtonFK_IdEstadoCivilCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		jTabbedPaneBusquedasCargaFamiliar_NM.addTab("2.-Por Estado Civil ", jPanelFK_IdEstadoCivilCargaFamiliar_NM);
		jTabbedPaneBusquedasCargaFamiliar_NM.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCargaFamiCargaFamiliar_NM.setLayout(gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		jPanelFK_IdTipoCargaFamiCargaFamiliar_NM.add(jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 1;
		jPanelFK_IdTipoCargaFamiCargaFamiliar_NM.add(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 1;
		gridBagConstraintsCargaFamiliar_NM.gridx =1;
		jPanelFK_IdTipoCargaFamiCargaFamiliar_NM.add(jButtonFK_IdTipoCargaFamiCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		jTabbedPaneBusquedasCargaFamiliar_NM.addTab("3.-Por Tipo Carga Fami ", jPanelFK_IdTipoCargaFamiCargaFamiliar_NM);
		jTabbedPaneBusquedasCargaFamiliar_NM.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGeneroCargaFamiliar_NM.setLayout(gridaBagLayoutFK_IdTipoGeneroCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		jPanelFK_IdTipoGeneroCargaFamiliar_NM.add(jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 0;
		gridBagConstraintsCargaFamiliar_NM.gridx = 1;
		jPanelFK_IdTipoGeneroCargaFamiliar_NM.add(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar_NM.gridy = 1;
		gridBagConstraintsCargaFamiliar_NM.gridx =1;
		jPanelFK_IdTipoGeneroCargaFamiliar_NM.add(jButtonFK_IdTipoGeneroCargaFamiliar_NM, gridBagConstraintsCargaFamiliar_NM);

		jTabbedPaneBusquedasCargaFamiliar_NM.addTab("4.-Por Tipo Genero ", jPanelFK_IdTipoGeneroCargaFamiliar_NM);
		jTabbedPaneBusquedasCargaFamiliar_NM.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargaFamiliar_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargaFamiliar_NM);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();						
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;		
			//this.gridBagConstraintsCargaFamiliar_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargaFamiliar_NM.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;		
		//this.gridBagConstraintsCargaFamiliar_NM.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCargaFamiliar_NM.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCargaFamiliar_NM);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;		
			this.gridBagConstraintsCargaFamiliar_NM.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCargaFamiliar_NM.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);								
		
		
		/*
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		*/		
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar_NM.gridx =0;
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargaFamiliar_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
				
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CargaFamiliar_NMJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCargaFamiliar_NM= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargaFamiliar_NM = new GridBagLayout();
			this.jPanelBusquedasParametrosCargaFamiliar_NM.setLayout(gridaBagLayoutBusquedasParametrosCargaFamiliar_NM);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCargaFamiliar_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
			
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCargaFamiliar_NM;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCargaFamiliar_NM() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCargaFamiliar_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCargaFamiliar_NM.setName("jPanelReporteDinamicoCargaFamiliar_NM"); 
		
		this.jPanelReporteDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCargaFamiliar_NM.setLayout(gridaBagLayoutReporteDinamicoCargaFamiliar_NM);
		
		
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargaFamiliar_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setResizable(true);
	    this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setClosable(true);
	    this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCargaFamiliar_NM = new JLabelMe();

		this.jLabelColumnasSelectReporteCargaFamiliar_NM.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelColumnasSelectReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCargaFamiliar_NM = new JList<Reporte>();
		this.jListColumnasSelectReporteCargaFamiliar_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCargaFamiliar_NM=new JScrollPane(this.jListColumnasSelectReporteCargaFamiliar_NM);
			
			this.jScrollColumnasSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jListColumnasSelectReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jScrollColumnasSelectReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCargaFamiliar_NM = new JLabelMe();

		this.jLabelRelacionesSelectReporteCargaFamiliar_NM.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCargaFamiliar_NM = new JList<Reporte>();
		this.jListRelacionesSelectReporteCargaFamiliar_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCargaFamiliar_NM=new JScrollPane(this.jListRelacionesSelectReporteCargaFamiliar_NM);
			
			this.jScrollRelacionesSelectReporteCargaFamiliar_NM.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargaFamiliar_NM.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargaFamiliar_NM.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM = new JComboBoxMe();
		this.jListColumnasValoresGraficoCargaFamiliar_NM = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCargaFamiliar_NM = new JLabelMe();

		this.jLabelConGraficoDinamicoCargaFamiliar_NM.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelConGraficoDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jCheckBoxConGraficoDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelColumnaCategoriaGraficoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCargaFamiliar_NM = new JLabelMe();

		this.jLabelColumnaCategoriaValorCargaFamiliar_NM.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelColumnaCategoriaValorCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jComboBoxColumnaCategoriaValorCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCargaFamiliar_NM = new JLabelMe();

		this.jLabelColumnasValoresGraficoCargaFamiliar_NM.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelColumnasValoresGraficoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCargaFamiliar_NM = new JList<Reporte>();
		this.jListColumnasValoresGraficoCargaFamiliar_NM.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCargaFamiliar_NM.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCargaFamiliar_NM.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargaFamiliar_NM.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargaFamiliar_NM.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCargaFamiliar_NM=new JScrollPane(this.jListColumnasValoresGraficoCargaFamiliar_NM);
			
			this.jScrollColumnasValoresGraficoCargaFamiliar_NM.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargaFamiliar_NM.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargaFamiliar_NM.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jListColumnasSelectReporteCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jScrollColumnasValoresGraficoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelTiposGraficosReportesDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargaFamiliar_NM.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelGenerarExcelReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM.setToolTipText("Generar EXCEL"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jButtonGenerarExcelReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jComboBoxTiposReportesDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jLabelTiposArchivoReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCargaFamiliar_NM = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCargaFamiliar_NM.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCargaFamiliar_NM,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCargaFamiliar_NM.setToolTipText("Generar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jButtonGenerarReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCargaFamiliar_NM = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCargaFamiliar_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCargaFamiliar_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCargaFamiliar_NM.setToolTipText("Cancelar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar_NM.add(this.jButtonCerrarReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCargaFamiliar_NM = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM= new JScrollPane(jPanelReporteDinamicoCargaFamiliar_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCargaFamiliar_NM);
		this.jInternalFrameReporteDinamicoCargaFamiliar_NM.getContentPane().add(this.jScrollPanelReporteDinamicoCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCargaFamiliar_NM() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCargaFamiliar_NM = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCargaFamiliar_NM.setName("jPanelImportacionCargaFamiliar_NM"); 
		
		this.jPanelImportacionCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCargaFamiliar_NM.setLayout(gridaBagLayoutImportacionCargaFamiliar_NM);
		
		
		this.jInternalFrameImportacionCargaFamiliar_NM= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCargaFamiliar_NM= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCargaFamiliar_NM = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargaFamiliar_NM= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCargaFamiliar_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargaFamiliar_NM.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCargaFamiliar_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargaFamiliar_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargaFamiliar_NM.setResizable(true);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setClosable(true);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCargaFamiliar_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargaFamiliar_NM.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCargaFamiliar_NM.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargaFamiliar_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargaFamiliar_NM.setResizable(true);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setClosable(true);
	    this.jInternalFrameImportacionCargaFamiliar_NM.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCargaFamiliar_NM = new JLabelMe();

		this.jLabelArchivoImportacionCargaFamiliar_NM.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargaFamiliar_NM.add(this.jLabelArchivoImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCargaFamiliar_NM = new JFileChooser();		
		this.jFileChooserImportacionCargaFamiliar_NM.setToolTipText("ESCOGER ARCHIVO"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCargaFamiliar_NM = new JButtonMe();
		this.jButtonAbrirImportacionCargaFamiliar_NM.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCargaFamiliar_NM,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCargaFamiliar_NM.setToolTipText("Generar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar_NM.add(this.jButtonAbrirImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCargaFamiliar_NM = new JLabelMe();

		this.jLabelPathArchivoImportacionCargaFamiliar_NM.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCargaFamiliar_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargaFamiliar_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargaFamiliar_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargaFamiliar_NM.add(this.jLabelPathArchivoImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCargaFamiliar_NM=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCargaFamiliar_NM.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargaFamiliar_NM.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargaFamiliar_NM.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar_NM.add(this.jTextFieldPathArchivoImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCargaFamiliar_NM = new JButtonMe();
		this.jButtonGenerarImportacionCargaFamiliar_NM.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCargaFamiliar_NM,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCargaFamiliar_NM.setToolTipText("Generar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar_NM.add(this.jButtonGenerarImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCargaFamiliar_NM = new JButtonMe();
		this.jButtonCerrarImportacionCargaFamiliar_NM.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCargaFamiliar_NM,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCargaFamiliar_NM.setToolTipText("Cancelar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar_NM.add(this.jButtonCerrarImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCargaFamiliar_NM = new GridBagLayout();
		
		this.jScrollPanelImportacionCargaFamiliar_NM= new JScrollPane(jPanelImportacionCargaFamiliar_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar_NM.gridy =iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXImportacion;
		this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCargaFamiliar_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCargaFamiliar_NM.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCargaFamiliar_NM);
		this.jInternalFrameImportacionCargaFamiliar_NM.getContentPane().add(this.jScrollPanelImportacionCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCargaFamiliar_NM(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCargaFamiliar_NM = new JButtonMe();
			this.jButtonAbrirOrderByCargaFamiliar_NM.setText("Orden");
			this.jButtonAbrirOrderByCargaFamiliar_NM.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargaFamiliar_NM,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCargaFamiliar_NM";
			inputMap = this.jButtonAbrirOrderByCargaFamiliar_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCargaFamiliar_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCargaFamiliar_NM"));
		
		
			GridBagLayout gridaBagLayoutOrderByCargaFamiliar_NM = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCargaFamiliar_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCargaFamiliar_NM.setName("jPanelOrderByCargaFamiliar_NM"); 
			
			this.jPanelOrderByCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCargaFamiliar_NM.setLayout(gridaBagLayoutOrderByCargaFamiliar_NM);
			
			
			this.jTableDatosCargaFamiliar_NMOrderBy = new JTableMe();        
			this.jTableDatosCargaFamiliar_NMOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCargaFamiliar_NMOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCargaFamiliar_NMOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCargaFamiliar_NMOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCargaFamiliar_NMOrderBy.setViewportView(this.jTableDatosCargaFamiliar_NMOrderBy);
			this.jTableDatosCargaFamiliar_NMOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCargaFamiliar_NMOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCargaFamiliar_NM= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCargaFamiliar_NM= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCargaFamiliar_NM = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCargaFamiliar_NM= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCargaFamiliar_NM.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCargaFamiliar_NM.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCargaFamiliar_NM.setTitle("Orden");
			this.jInternalFrameOrderByCargaFamiliar_NM.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCargaFamiliar_NM.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCargaFamiliar_NM.setResizable(true);
			this.jInternalFrameOrderByCargaFamiliar_NM.setClosable(true);
			this.jInternalFrameOrderByCargaFamiliar_NM.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCargaFamiliar_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiar_ N Mes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCargaFamiliar_NM.ipady =150;
				
			this.jPanelOrderByCargaFamiliar_NM.add(jScrollPanelDatosCargaFamiliar_NMOrderBy, this.gridBagConstraintsCargaFamiliar_NM);//this.jTableDatosCargaFamiliar_NMTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCargaFamiliar_NM = new JButtonMe();
			this.jButtonCerrarOrderByCargaFamiliar_NM.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCargaFamiliar_NM,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCargaFamiliar_NM.setToolTipText("Cancelar"+" "+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCargaFamiliar_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar_NM.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCargaFamiliar_NM.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCargaFamiliar_NM.add(this.jButtonCerrarOrderByCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCargaFamiliar_NM = new GridBagLayout();
			
			this.jScrollPanelOrderByCargaFamiliar_NM= new JScrollPane(jPanelOrderByCargaFamiliar_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCargaFamiliar_NM = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar_NM.gridy =iPosYOrderBy;
			this.gridBagConstraintsCargaFamiliar_NM.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargaFamiliar_NM.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCargaFamiliar_NM.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCargaFamiliar_NM.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCargaFamiliar_NM);
			
			this.jInternalFrameOrderByCargaFamiliar_NM.getContentPane().add(this.jScrollPanelOrderByCargaFamiliar_NM, this.gridBagConstraintsCargaFamiliar_NM);			
		
		} else {
			this.jButtonAbrirOrderByCargaFamiliar_NM = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cargafamiliar_nmSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCargaFamiliar_NM.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCargaFamiliar_NM.getRowHeight();//CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.isSelected()) {
					iHeightTable=CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargaFamiliar_NM.isSelected()) {
					iHeightTable=CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargaFamiliar_NMConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCargaFamiliar_NM!=null && this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy()!=null) {
			//if(!this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCargaFamiliar_NM.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCargaFamiliar_NM.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCargaFamiliar_NM.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCargaFamiliar_NM.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cargafamiliar_nmLogic.getCargaFamiliar_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliar_nms.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CargaFamiliar_NM> TraerCargaFamiliar_NMBeans(List<CargaFamiliar_NM> cargafamiliar_nms,ArrayList<Classe> classes)throws Exception {
		try {
			for(CargaFamiliar_NM cargafamiliar_nm:cargafamiliar_nms) {
					
				if(!(CargaFamiliar_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CargaFamiliar_NMConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cargafamiliar_nm.setsDetalleGeneralEntityReporte(CargaFamiliar_NMConstantesFunciones.getCargaFamiliar_NMDescripcion(cargafamiliar_nm));
										
						
					
						
					
				} else  {
							
					//cargafamiliar_nm.setsDetalleGeneralEntityReporte(cargafamiliar_nm.getsDetalleGeneralEntityReporte());
										
				}
				
				//cargafamiliar_nmbeans.add(cargafamiliar_nmbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cargafamiliar_nms;
    }
	//PARA REPORTES FIN
}
