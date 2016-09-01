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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.EvaluacionEmpleadoConstantesFunciones;

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
public class EvaluacionEmpleadoJInternalFrame extends EvaluacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionEmpleado;
	
	protected JMenuBar jmenuBarEvaluacionEmpleado;
	
	protected JMenu jmenuEvaluacionEmpleado;
	protected JMenu jmenuDatosEvaluacionEmpleado;
	protected JMenu jmenuArchivoEvaluacionEmpleado;
	protected JMenu jmenuAccionesEvaluacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsEvaluacionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoevaluaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoevalua="";

	protected TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoevaluacionempleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_semestre="";

	protected TrimestreBeanSwingJInternalFrame trimestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_trimestre="";

	protected BimestreBeanSwingJInternalFrame bimestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bimestre="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoevaluaSessionBean;
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public SemestreSessionBean semestreSessionBean;
	public TrimestreSessionBean trimestreSessionBean;
	public BimestreSessionBean bimestreSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionEmpleado> evaluacionempleados;		
	public List<EvaluacionEmpleado> evaluacionempleadosEliminados;	
	public List<EvaluacionEmpleado> evaluacionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionEmpleado;		
	protected JButton jButtonAbrirOrderByEvaluacionEmpleado;
	
	
	//protected JPanel jPanelOrderByEvaluacionEmpleado;
	//public JScrollPane jScrollPanelOrderByEvaluacionEmpleado;	
	//protected JButton jButtonCerrarOrderByEvaluacionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionEmpleadoLogic evaluacionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionEmpleado;
	//public JScrollPane jScrollPanelImportacionEvaluacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesEvaluacionEmpleado;
	
    protected JPanel jPanelPaginacionEvaluacionEmpleado;
    protected JPanel jPanelParametrosReportesEvaluacionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionEmpleado;
	//protected JPanel jPanelImportacionEvaluacionEmpleado;
	
	
	public JTable jTableDatosEvaluacionEmpleado;
	
	
	
	//public JTable jTableDatosEvaluacionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionEmpleado;
	protected JButton jButtonDuplicarEvaluacionEmpleado;
	protected JButton jButtonCopiarEvaluacionEmpleado;
	protected JButton jButtonVerFormEvaluacionEmpleado;
	protected JButton jButtonNuevoRelacionesEvaluacionEmpleado;
	protected JButton jButtonModificarEvaluacionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionEmpleado;
	protected JButton jButtonCerrarEvaluacionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionEmpleado;
	protected JButton jButtonProcesarInformacionEvaluacionEmpleado;
	
	
	protected JButton jButtonAnterioresEvaluacionEmpleado;
	protected JButton jButtonSiguientesEvaluacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionEmpleado;
	//protected JButton jButtonGenerarImportacionEvaluacionEmpleado;
	//protected JButton jButtonCerrarImportacionEvaluacionEmpleado;
	//protected JFileChooser jFileChooserImportacionEvaluacionEmpleado;
	//protected File fileImportacionEvaluacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionEmpleado;
	protected JButton jButtonDuplicarToolBarEvaluacionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionEmpleado;
	protected JButton jButtonCopiarToolBarEvaluacionEmpleado;
	protected JButton jButtonVerFormToolBarEvaluacionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionEmpleado;
	protected JButton jButtonCerrarToolBarEvaluacionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionEmpleado;
	protected JButton jButtonAnterioresToolBarEvaluacionEmpleado;
	protected JButton jButtonSiguientesToolBarEvaluacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionEmpleado;
	protected JMenuItem jMenuItemDuplicarEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionEmpleado;
	protected JMenuItem jMenuItemCopiarEvaluacionEmpleado;
	protected JMenuItem jMenuItemVerFormEvaluacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionEmpleado;
	protected JMenuItem jMenuItemCerrarEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionEmpleado;
	protected JMenuItem jMenuItemAnterioresEvaluacionEmpleado;
	protected JMenuItem jMenuItemSiguientesEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionEmpleado;
	public JPanel jPanelFK_IdAnioEvaluacionEmpleado;
	public JButton jButtonFK_IdAnioEvaluacionEmpleado;
	public JPanel jPanelFK_IdBimestreEvaluacionEmpleado;
	public JButton jButtonFK_IdBimestreEvaluacionEmpleado;
	public JPanel jPanelFK_IdEmpleadoEvaluacionEmpleado;
	public JButton jButtonFK_IdEmpleadoEvaluacionEmpleado;
	public JPanel jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado;
	public JButton jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado;
	public JPanel jPanelFK_IdEstructuraEvaluacionEmpleado;
	public JButton jButtonFK_IdEstructuraEvaluacionEmpleado;
	public JPanel jPanelFK_IdMesEvaluacionEmpleado;
	public JButton jButtonFK_IdMesEvaluacionEmpleado;
	public JPanel jPanelFK_IdSemestreEvaluacionEmpleado;
	public JButton jButtonFK_IdSemestreEvaluacionEmpleado;
	public JPanel jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado;
	public JButton jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado;
	public JPanel jPanelFK_IdTrimestreEvaluacionEmpleado;
	public JButton jButtonFK_IdTrimestreEvaluacionEmpleado;
	
	public JPanel jPanelid_anioFK_IdAnioEvaluacionEmpleado;
	public JLabel jLabelid_anioFK_IdAnioEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioEvaluacionEmpleado;
	public JButton jButtonid_anioFK_IdAnioEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bimestreFK_IdBimestreEvaluacionEmpleado;
	public JLabel jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado;
	public JButton jButtonid_bimestreFK_IdBimestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_bimestreFK_IdBimestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_bimestreFK_IdBimestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEvaluacionEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado;
	public JLabel jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado;
	public JButton jButtonid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEvaluacionEmpleado;
	public JLabel jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado;
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionEmpleadoArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesEvaluacionEmpleado;
	public JLabel jLabelid_mesFK_IdMesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesEvaluacionEmpleado;
	public JButton jButtonid_mesFK_IdMesEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_semestreFK_IdSemestreEvaluacionEmpleado;
	public JLabel jLabelid_semestreFK_IdSemestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado;
	public JButton jButtonid_semestreFK_IdSemestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_semestreFK_IdSemestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_semestreFK_IdSemestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado;
	public JLabel jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado;
	public JButton jButtonid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_trimestreFK_IdTrimestreEvaluacionEmpleado;
	public JLabel jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado;
	public JButton jButtonid_trimestreFK_IdTrimestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_trimestreFK_IdTrimestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_trimestreFK_IdTrimestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EvaluacionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionEmpleado)	{
		this.jButtonRecargarInformacionEvaluacionEmpleado = jButtonRecargarInformacionEvaluacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionEmpleado() {
		return this.jButtonProcesarInformacionEvaluacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionEmpleado)	{
		this.jButtonProcesarInformacionEvaluacionEmpleado = jButtonProcesarInformacionEvaluacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionEmpleado() {
		return this.jButtonRecargarInformacionEvaluacionEmpleado;
	}
	
	
	public List<EvaluacionEmpleado> getevaluacionempleados() {
		return this.evaluacionempleados;
	}

	public void setevaluacionempleados(List<EvaluacionEmpleado> evaluacionempleados) {
		this.evaluacionempleados = evaluacionempleados;
	}
	
	public List<EvaluacionEmpleado> getevaluacionempleadosAux() {
		return this.evaluacionempleadosAux;
	}

	public void setevaluacionempleadosAux(List<EvaluacionEmpleado> evaluacionempleadosAux) {
		this.evaluacionempleadosAux = evaluacionempleadosAux;
	}
	
	public List<EvaluacionEmpleado> getevaluacionempleadosEliminados() {
		return this.evaluacionempleadosEliminados;
	}

	public void setEvaluacionEmpleadosEliminados(List<EvaluacionEmpleado> evaluacionempleadosEliminados) {
		this.evaluacionempleadosEliminados = evaluacionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionEmpleado() {
		return jComboBoxTiposSeleccionarEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionEmpleado(
			JComboBox jComboBoxTiposSeleccionarEvaluacionEmpleado) {
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado = jComboBoxTiposSeleccionarEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionEmpleado() {
		return jTextFieldValorCampoGeneralEvaluacionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionEmpleado(
			JTextField jTextFieldValorCampoGeneralEvaluacionEmpleado) {
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado = jTextFieldValorCampoGeneralEvaluacionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionEmpleado() {
		return this.jCheckBoxSeleccionarTodosEvaluacionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionEmpleado) {
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado = jCheckBoxSeleccionarTodosEvaluacionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionEmpleado() {
		return this.jCheckBoxSeleccionadosEvaluacionEmpleado;
	}

	public void setjCheckBoxSeleccionadosEvaluacionEmpleado(
			JCheckBox jCheckBoxSeleccionadosEvaluacionEmpleado) {
		this.jCheckBoxSeleccionadosEvaluacionEmpleado = jCheckBoxSeleccionadosEvaluacionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionEmpleado() {
		return this.jComboBoxTiposArchivosReportesEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionEmpleado) {
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado = jComboBoxTiposArchivosReportesEvaluacionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionEmpleado() {
		return this.jComboBoxTiposReportesEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionEmpleado(
			JComboBox jComboBoxTiposReportesEvaluacionEmpleado) {
		this.jComboBoxTiposReportesEvaluacionEmpleado = jComboBoxTiposReportesEvaluacionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado = jComboBoxTiposReportesDinamicoEvaluacionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado = jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionEmpleado() {
		return this.jComboBoxTiposGraficosReportesEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionEmpleado) {
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado = jComboBoxTiposGraficosReportesEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionEmpleado() {
		return this.jComboBoxTiposPaginacionEvaluacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionEmpleado(
			JComboBox jComboBoxTiposPaginacionEvaluacionEmpleado) {
		this.jComboBoxTiposPaginacionEvaluacionEmpleado = jComboBoxTiposPaginacionEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionEmpleado() {
		return this.jComboBoxTiposRelacionesEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionEmpleado(
			JComboBox jComboBoxTiposRelacionesEvaluacionEmpleado) {
		this.jComboBoxTiposRelacionesEvaluacionEmpleado = jComboBoxTiposRelacionesEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesEvaluacionEmpleado = jComboBoxTiposAccionesEvaluacionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionEmpleado = jCheckBoxConGraficoDinamicoEvaluacionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionEmpleado .setBorder(borderResaltar);		
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
		this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		
		this.evaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"copiar","copiar","Copiar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"ver_form","ver_form","Ver"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"recargar","recargar","Recargar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionEmpleado,this.jTtoolBarEvaluacionEmpleado,
							"cerrar","cerrar","Salir"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionEmpleado;
			
				this.jButtonProcesarInformacionToolBarEvaluacionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionEmpleado;
				
		//protected JButton jButtonModificarToolBarEvaluacionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionEmpleado=new JMenuMe("General");
		this.jmenuArchivoEvaluacionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionEmpleado.add(this.jMenuItemCerrarEvaluacionEmpleado);
			
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemNuevoEvaluacionEmpleado);
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemNuevoGuardarCambiosEvaluacionEmpleado);
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemNuevoRelacionesEvaluacionEmpleado);
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosTablaEvaluacionEmpleado);		
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemDuplicarEvaluacionEmpleado);		
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemCopiarEvaluacionEmpleado);		
			this.jmenuAccionesEvaluacionEmpleado.add(this.jMenuItemVerFormEvaluacionEmpleado);		
			
			this.jmenuDatosEvaluacionEmpleado.add(this.jMenuItemRecargarInformacionEvaluacionEmpleado);				
			this.jmenuDatosEvaluacionEmpleado.add(this.jMenuItemAnterioresEvaluacionEmpleado);				
			this.jmenuDatosEvaluacionEmpleado.add(this.jMenuItemSiguientesEvaluacionEmpleado);				
			this.jmenuDatosEvaluacionEmpleado.add(this.jMenuItemAbrirOrderByEvaluacionEmpleado);				
			this.jmenuDatosEvaluacionEmpleado.add(this.jMenuItemMostrarOcultarEvaluacionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosEvaluacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionEmpleado.add(this.jmenuArchivoEvaluacionEmpleado);		
			this.jmenuBarEvaluacionEmpleado.add(this.jmenuAccionesEvaluacionEmpleado);		
			this.jmenuBarEvaluacionEmpleado.add(this.jmenuDatosEvaluacionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioEvaluacionEmpleado.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioEvaluacionEmpleado.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioEvaluacionEmpleado,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioEvaluacionEmpleado = new JLabelMe();
		jLabelid_anioFK_IdAnioEvaluacionEmpleado.setText("Anio :");
		jLabelid_anioFK_IdAnioEvaluacionEmpleado.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBimestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBimestreEvaluacionEmpleado.setToolTipText("Buscar Por Bimestre ");
		this.jButtonFK_IdBimestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdBimestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdBimestreEvaluacionEmpleado.setToolTipText("Buscar Por Bimestre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBimestreEvaluacionEmpleado,"buscar_button","Buscar Por Bimestre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBimestreEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado = new JLabelMe();
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado.setText("Bimestre :");
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado.setToolTipText("Bimestre");
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEvaluacionEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoEvaluacionEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEvaluacionEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado.setToolTipText("Buscar Por Empleado Evalua ");
		this.jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado.setToolTipText("Buscar Por Empleado Evalua ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado,"buscar_button","Buscar Por Empleado Evalua ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado = new JLabelMe();
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setText("Empleado Evalua :");
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setToolTipText("Empleado Evalua");
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEvaluacionEmpleado.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEstructuraEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEstructuraEvaluacionEmpleado.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEvaluacionEmpleado,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesEvaluacionEmpleado.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdMesEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdMesEvaluacionEmpleado.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesEvaluacionEmpleado,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesEvaluacionEmpleado = new JLabelMe();
		jLabelid_mesFK_IdMesEvaluacionEmpleado.setText("Mes :");
		jLabelid_mesFK_IdMesEvaluacionEmpleado.setToolTipText("Mes");
		jLabelid_mesFK_IdMesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSemestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSemestreEvaluacionEmpleado.setToolTipText("Buscar Por Semestre ");
		this.jButtonFK_IdSemestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdSemestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdSemestreEvaluacionEmpleado.setToolTipText("Buscar Por Semestre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSemestreEvaluacionEmpleado,"buscar_button","Buscar Por Semestre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSemestreEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado = new JLabelMe();
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado.setText("Semestre :");
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado.setToolTipText("Semestre");
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_semestreFK_IdSemestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_semestreFK_IdSemestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setToolTipText("Buscar Por Tipo Evaluacion Empleado ");
		this.jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setToolTipText("Buscar Por Tipo Evaluacion Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado,"buscar_button","Buscar Por Tipo Evaluacion Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado = new JLabelMe();
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setText("Tipo Evaluacion Empleado :");
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setToolTipText("Tipo Evaluacion Empleado");
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTrimestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTrimestreEvaluacionEmpleado.setToolTipText("Buscar Por Trimestre ");
		this.jButtonFK_IdTrimestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonFK_IdTrimestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonFK_IdTrimestreEvaluacionEmpleado.setToolTipText("Buscar Por Trimestre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTrimestreEvaluacionEmpleado,"buscar_button","Buscar Por Trimestre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTrimestreEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado = new JLabelMe();
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado.setText("Trimestre :");
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado.setToolTipText("Trimestre");
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEvaluacionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEvaluacionEmpleado = new EvaluacionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluacion Empleado DATOS");
			this.jInternalFrameDetalleFormEvaluacionEmpleado = new EvaluacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.evaluacionempleadoSessionBean.getConGuardarRelaciones(),this.evaluacionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionEmpleado = null;//new EvaluacionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionEmpleado = new JTableMe();      
		
		String sToolTipEvaluacionEmpleado="";
		sToolTipEvaluacionEmpleado=EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionEmpleado+="(Nomina.EvaluacionEmpleado)";
		}
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionEmpleado.setToolTipText(sToolTipEvaluacionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionEmpleado);
		this.jTableDatosEvaluacionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionEmpleado = new JButtonMe();
		this.jButtonDuplicarEvaluacionEmpleado = new JButtonMe();
		this.jButtonCopiarEvaluacionEmpleado = new JButtonMe();
		this.jButtonVerFormEvaluacionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarEvaluacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Empleado";
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEvaluacionEmpleado=new ReporteDinamicoJInternalFrame(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionEmpleado=new ImportacionJInternalFrame(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionEmpleado,false,this);
			
			//this.cargarOrderByEvaluacionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionEmpleado,true,this);
			
			//this.cargarOrderByEvaluacionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionEmpleado.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosEvaluacionEmpleado.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosEvaluacionEmpleado.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosEvaluacionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionEmpleado.setText("Nuevo");
		this.jButtonDuplicarEvaluacionEmpleado.setText("Duplicar");
		this.jButtonCopiarEvaluacionEmpleado.setText("Copiar");
		this.jButtonVerFormEvaluacionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.setText("Guardar");
		this.jButtonCerrarEvaluacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionEmpleado,"nuevo_button","Nuevo",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionEmpleado,"duplicar_button","Duplicar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionEmpleado,"copiar_button","Copiar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionEmpleado,"ver_form","Ver",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionEmpleado,"guardarcambiostabla_button","Guardar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionEmpleado,"cerrar_button","Salir",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionEmpleado.setToolTipText("Nuevo"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionEmpleado.setToolTipText("Duplicar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionEmpleado.setToolTipText("Copiar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionEmpleado.setToolTipText("Ver"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionEmpleado.setToolTipText("Nuevo Rel"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.setToolTipText("Guardar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionEmpleado.setToolTipText("Salir"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionEmpleado";
		inputMap = this.jButtonDuplicarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionEmpleado";
		inputMap = this.jButtonCopiarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionEmpleado";
		inputMap = this.jButtonVerFormEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionEmpleado";
		inputMap = this.jButtonModificarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionEmpleado";
		inputMap = this.jButtonCerrarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionEmpleado.setName("jPanelParametrosReportesEvaluacionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionEmpleado.setName("jPanelParametrosReportesAccionesEvaluacionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionEvaluacionEmpleado.setToolTipText("Recargar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEvaluacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionEmpleado.setToolTipText("Procesar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesEvaluacionEmpleado.setText("Acciones");		
		this.jLabelAccionesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionEmpleado = new JButtonMe();
		//this.jButtonAnterioresEvaluacionEmpleado.setText("<<");
        this.jButtonAnterioresEvaluacionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionEmpleado = new JButtonMe();
		//this.jButtonSiguientesEvaluacionEmpleado.setText(">>");
        this.jButtonSiguientesEvaluacionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionEmpleado,"nuevoguardarcambios_button","Nue",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionEmpleado";
		inputMap = this.jButtonRecargarInformacionEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionEmpleado";
		inputMap = this.jButtonSiguientesEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionEmpleado";
		inputMap = this.jButtonAnterioresEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionEvaluacionEmpleado.setLayout(gridaBagLayoutPaginacionEvaluacionEmpleado);						
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonAnterioresEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					
						
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
			
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonNuevoGuardarCambiosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
						
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonSiguientesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonNuevoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
				this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonNuevoRelacionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			}
			
			
			if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
				this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonGuardarCambiosTablaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			}
			
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonDuplicarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonCopiarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonVerFormEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 1;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionEmpleado.add(this.jButtonCerrarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
		
		
		this.jButtonRecargarInformacionEvaluacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionEmpleado.setLayout(gridaBagParametrosReportesEvaluacionEmpleado);
			this.jPanelParametrosReportesAccionesEvaluacionEmpleado.setLayout(gridaBagParametrosReportesAccionesEvaluacionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar1EvaluacionEmpleado);
			this.jPanelParametrosAuxiliar2EvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar2EvaluacionEmpleado);
			this.jPanelParametrosAuxiliar3EvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar3EvaluacionEmpleado);
			this.jPanelParametrosAuxiliar4EvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar4EvaluacionEmpleado);
			//this.jPanelParametrosAuxiliar5EvaluacionEmpleado.setLayout(gridaBagParametrosAuxiliar2EvaluacionEmpleado);			
			
			
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jButtonRecargarInformacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionEmpleado.add(this.jComboBoxTiposPaginacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionEmpleado.add(this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionEmpleado.add(this.jComboBoxTiposArchivosReportesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar1EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionEmpleado.add(this.jComboBoxTiposReportesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar4EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jComboBoxTiposReportesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jCheckBoxGenerarReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar2EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jLabelAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jButtonAbrirOrderByEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jComboBoxTiposSeleccionarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			
			
			/*
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jCheckBoxSeleccionarTodosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionEmpleado.add(this.jCheckBoxSeleccionarTodosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);															
				
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionEmpleado.add(this.jCheckBoxSeleccionadosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jPanelParametrosAuxiliar3EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jComboBoxTiposRelacionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
				
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jComboBoxTiposAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
	
				
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionEmpleado.add(this.jTextFieldValorCampoGeneralEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionEmpleado.setLayout(gridaBagLayoutDatosEvaluacionEmpleado);
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionEmpleado.add(this.jTableDatosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionEmpleado.setViewportView(this.jTableDatosEvaluacionEmpleado);
		this.jTableDatosEvaluacionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesEvaluacionEmpleado);
		
		
		/*	
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
			
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonNuevoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdAnioEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdAnioEvaluacionEmpleado.add(jLabelid_anioFK_IdAnioEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdAnioEvaluacionEmpleado.add(jComboBoxid_anioFK_IdAnioEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdAnioEvaluacionEmpleado.add(jButtonFK_IdAnioEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("1.-Por Anio ", jPanelFK_IdAnioEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBimestreEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdBimestreEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBimestreEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBimestreEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBimestreEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBimestreEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdBimestreEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdBimestreEvaluacionEmpleado.add(jLabelid_bimestreFK_IdBimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdBimestreEvaluacionEmpleado.add(jComboBoxid_bimestreFK_IdBimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdBimestreEvaluacionEmpleado.add(jButtonFK_IdBimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("2.-Por Bimestre ", jPanelFK_IdBimestreEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoEvaluacionEmpleado.add(jLabelid_empleadoFK_IdEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoEvaluacionEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdEmpleadoEvaluacionEmpleado.add(jButtonFK_IdEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoEvaluaEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado.add(jLabelid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado.add(jComboBoxid_empleado_evaluaFK_IdEmpleadoEvaluaEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado.add(jButtonFK_IdEmpleadoEvaluaEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("4.-Por Empleado Evalua ", jPanelFK_IdEmpleadoEvaluaEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdEstructuraEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdEstructuraEvaluacionEmpleado.add(jLabelid_estructuraFK_IdEstructuraEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdEstructuraEvaluacionEmpleado.add(jComboBoxid_estructuraFK_IdEstructuraEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdEstructuraEvaluacionEmpleado.add(jButtonFK_IdEstructuraEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("5.-Por Estructura ", jPanelFK_IdEstructuraEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdMesEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdMesEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdMesEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdMesEvaluacionEmpleado.add(jLabelid_mesFK_IdMesEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdMesEvaluacionEmpleado.add(jComboBoxid_mesFK_IdMesEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdMesEvaluacionEmpleado.add(jButtonFK_IdMesEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("6.-Por Mes ", jPanelFK_IdMesEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdSemestreEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdSemestreEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSemestreEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSemestreEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSemestreEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSemestreEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdSemestreEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdSemestreEvaluacionEmpleado.add(jLabelid_semestreFK_IdSemestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdSemestreEvaluacionEmpleado.add(jComboBoxid_semestreFK_IdSemestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdSemestreEvaluacionEmpleado.add(jButtonFK_IdSemestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("7.-Por Semestre ", jPanelFK_IdSemestreEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.add(jLabelid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.add(jComboBoxid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado.add(jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("8.-Por Tipo Evaluacion Empleado ", jPanelFK_IdTipoEvaluacionEmpleadoEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTrimestreEvaluacionEmpleado.setLayout(gridaBagLayoutFK_IdTrimestreEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		jPanelFK_IdTrimestreEvaluacionEmpleado.add(jLabelid_trimestreFK_IdTrimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		gridBagConstraintsEvaluacionEmpleado.gridx = 1;
		jPanelFK_IdTrimestreEvaluacionEmpleado.add(jComboBoxid_trimestreFK_IdTrimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionEmpleado.gridy = 1;
		gridBagConstraintsEvaluacionEmpleado.gridx =1;
		jPanelFK_IdTrimestreEvaluacionEmpleado.add(jButtonFK_IdTrimestreEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);

		jTabbedPaneBusquedasEvaluacionEmpleado.addTab("9.-Por Trimestre ", jPanelFK_IdTrimestreEvaluacionEmpleado);
		jTabbedPaneBusquedasEvaluacionEmpleado.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;		
		//this.gridBagConstraintsEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;		
			this.gridBagConstraintsEvaluacionEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);								
		
		
		/*
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		*/		
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionEmpleado.gridx =0;
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
				
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionEmpleado.setName("jPanelReporteDinamicoEvaluacionEmpleado"); 
		
		this.jPanelReporteDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionEmpleado.setLayout(gridaBagLayoutReporteDinamicoEvaluacionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jLabelColumnasSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionEmpleado=new JScrollPane(this.jListColumnasSelectReporteEvaluacionEmpleado);
			
			this.jScrollColumnasSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jListColumnasSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jScrollColumnasSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jLabelRelacionesSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionEmpleado);
			
			this.jScrollRelacionesSelectReporteEvaluacionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jListRelacionesSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jScrollRelacionesSelectReporteEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado.setToolTipText("Generar EXCEL"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jComboBoxTiposReportesDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionEmpleado.setToolTipText("Generar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jButtonGenerarReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionEmpleado.setToolTipText("Cancelar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionEmpleado.add(this.jButtonCerrarReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado= new JScrollPane(jPanelReporteDinamicoEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionEmpleado);
		this.jInternalFrameReporteDinamicoEvaluacionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionEmpleado.setName("jPanelImportacionEvaluacionEmpleado"); 
		
		this.jPanelImportacionEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionEmpleado.setLayout(gridaBagLayoutImportacionEvaluacionEmpleado);
		
		
		this.jInternalFrameImportacionEvaluacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionEmpleado.add(this.jLabelArchivoImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionEmpleado.setToolTipText("Generar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionEmpleado.add(this.jButtonAbrirImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionEmpleado.add(this.jLabelPathArchivoImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionEmpleado.add(this.jTextFieldPathArchivoImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionEmpleado.setToolTipText("Generar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionEmpleado.add(this.jButtonGenerarImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionEmpleado.setToolTipText("Cancelar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionEmpleado.add(this.jButtonCerrarImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionEmpleado= new JScrollPane(jPanelImportacionEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionEmpleado);
		this.jInternalFrameImportacionEvaluacionEmpleado.getContentPane().add(this.jScrollPanelImportacionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionEmpleado";
			inputMap = this.jButtonAbrirOrderByEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionEmpleado.setName("jPanelOrderByEvaluacionEmpleado"); 
			
			this.jPanelOrderByEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionEmpleado.setLayout(gridaBagLayoutOrderByEvaluacionEmpleado);
			
			
			this.jTableDatosEvaluacionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionEmpleadoOrderBy.setViewportView(this.jTableDatosEvaluacionEmpleadoOrderBy);
			this.jTableDatosEvaluacionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionEmpleado.setResizable(true);
			this.jInternalFrameOrderByEvaluacionEmpleado.setClosable(true);
			this.jInternalFrameOrderByEvaluacionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionEmpleado.ipady =150;
				
			this.jPanelOrderByEvaluacionEmpleado.add(jScrollPanelDatosEvaluacionEmpleadoOrderBy, this.gridBagConstraintsEvaluacionEmpleado);//this.jTableDatosEvaluacionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionEmpleado.setToolTipText("Cancelar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionEmpleado.add(this.jButtonCerrarOrderByEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionEmpleado= new JScrollPane(jPanelOrderByEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionEmpleado);
			
			this.jInternalFrameOrderByEvaluacionEmpleado.getContentPane().add(this.jScrollPanelOrderByEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//3830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.evaluacionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEvaluacionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEvaluacionEmpleado.getRowHeight();//EvaluacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.isSelected()) {
					iHeightTable=EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionEmpleado.isSelected()) {
					iHeightTable=EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionEmpleado!=null && this.jInternalFrameOrderByEvaluacionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=evaluacionempleadoLogic.getEvaluacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionEmpleado> TraerEvaluacionEmpleadoBeans(List<EvaluacionEmpleado> evaluacionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionEmpleado evaluacionempleado:evaluacionempleados) {
					
				if(!(EvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionempleado.setsDetalleGeneralEntityReporte(EvaluacionEmpleadoConstantesFunciones.getEvaluacionEmpleadoDescripcion(evaluacionempleado));
										
					evaluacionempleado.setesta_evaluado_descripcion(EvaluacionEmpleadoConstantesFunciones.getesta_evaluadoDescripcion(evaluacionempleado));	
					
					

					if(evaluacionempleado.getCalificacionEmpleados()!=null && Funciones.existeClass(classes,CalificacionEmpleado.class)) {
						try{evaluacionempleado.setcalificacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(CalificacionEmpleadoJInternalFrame.TraerCalificacionEmpleadoBeans(evaluacionempleado.getCalificacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//evaluacionempleado.setsDetalleGeneralEntityReporte(evaluacionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionempleadobeans.add(evaluacionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionempleados;
    }
	//PARA REPORTES FIN
}
