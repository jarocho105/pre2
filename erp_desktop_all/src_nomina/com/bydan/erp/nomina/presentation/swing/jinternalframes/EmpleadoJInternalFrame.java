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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.nomina.util.EmpleadoConstantesFunciones;

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
public class EmpleadoJInternalFrame extends EmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleado;
	
	protected JMenuBar jmenuBarEmpleado;
	
	protected JMenu jmenuEmpleado;
	protected JMenu jmenuDatosEmpleado;
	protected JMenu jmenuArchivoEmpleado;
	protected JMenu jmenuAccionesEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleado;	
	protected GridBagConstraints gridBagConstraintsEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ReligionBeanSwingJInternalFrame religionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_religion="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected TipoEmpleadoBeanSwingJInternalFrame tipoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempleado="";

	protected TipoInstruccionBeanSwingJInternalFrame tipoinstruccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinstruccion="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";

	protected EstadoEmpleadoBeanSwingJInternalFrame estadoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoempleado="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public EmpleadoSessionBean empleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ReligionSessionBean religionSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public TipoEmpleadoSessionBean tipoempleadoSessionBean;
	public TipoInstruccionSessionBean tipoinstruccionSessionBean;
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Empleado> empleados;		
	public List<Empleado> empleadosEliminados;	
	public List<Empleado> empleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleado;		
	protected JButton jButtonAbrirOrderByEmpleado;
	
	
	//protected JPanel jPanelOrderByEmpleado;
	//public JScrollPane jScrollPanelOrderByEmpleado;	
	//protected JButton jButtonCerrarOrderByEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoLogic empleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleado;
	//public JScrollPane jScrollPanelImportacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesEmpleado;
	
    protected JPanel jPanelPaginacionEmpleado;
    protected JPanel jPanelParametrosReportesEmpleado;
	protected JPanel jPanelParametrosReportesAccionesEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Empleado;
	protected JPanel jPanelParametrosAuxiliar2Empleado;
	protected JPanel jPanelParametrosAuxiliar3Empleado;
	protected JPanel jPanelParametrosAuxiliar4Empleado;
	//protected JPanel jPanelParametrosAuxiliar5Empleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleado;
	//protected JPanel jPanelImportacionEmpleado;
	
	
	public JTable jTableDatosEmpleado;
	
	
	
	//public JTable jTableDatosEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleado;
	protected JButton jButtonDuplicarEmpleado;
	protected JButton jButtonCopiarEmpleado;
	protected JButton jButtonVerFormEmpleado;
	protected JButton jButtonNuevoRelacionesEmpleado;
	protected JButton jButtonModificarEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaEmpleado;
	protected JButton jButtonCerrarEmpleado;
	
	
	protected JButton jButtonRecargarInformacionEmpleado;
	protected JButton jButtonProcesarInformacionEmpleado;
	
	
	protected JButton jButtonAnterioresEmpleado;
	protected JButton jButtonSiguientesEmpleado;
	protected JButton jButtonNuevoGuardarCambiosEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleado;
	//protected JButton jButtonGenerarImportacionEmpleado;
	//protected JButton jButtonCerrarImportacionEmpleado;
	//protected JFileChooser jFileChooserImportacionEmpleado;
	//protected File fileImportacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleado;
	protected JButton jButtonDuplicarToolBarEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleado;
	protected JButton jButtonCopiarToolBarEmpleado;
	protected JButton jButtonVerFormToolBarEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleado;
	protected JButton jButtonCerrarToolBarEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleado;
	protected JButton jButtonProcesarInformacionToolBarEmpleado;
	protected JButton jButtonAnterioresToolBarEmpleado;
	protected JButton jButtonSiguientesToolBarEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleado;
	protected JButton jButtonAbrirOrderByToolBarEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleado;
	protected JMenuItem jMenuItemDuplicarEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleado;
	protected JMenuItem jMenuItemCopiarEmpleado;
	protected JMenuItem jMenuItemVerFormEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleado;
	protected JMenuItem jMenuItemCerrarEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionEmpleado;
	protected JMenuItem jMenuItemAnterioresEmpleado;
	protected JMenuItem jMenuItemSiguientesEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleado;
	protected JTextField jTextFieldValorCampoGeneralEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleado;
	public JPanel jPanelFK_IdCargoEmpleado;
	public JButton jButtonFK_IdCargoEmpleado;
	public JPanel jPanelFK_IdCentroCostoEmpleado;
	public JButton jButtonFK_IdCentroCostoEmpleado;
	public JPanel jPanelFK_IdCiudadEmpleado;
	public JButton jButtonFK_IdCiudadEmpleado;
	public JPanel jPanelFK_IdEstadoCivilEmpleado;
	public JButton jButtonFK_IdEstadoCivilEmpleado;
	public JPanel jPanelFK_IdEstadoEmpleadoEmpleado;
	public JButton jButtonFK_IdEstadoEmpleadoEmpleado;
	public JPanel jPanelFK_IdEstructuraEmpleado;
	public JButton jButtonFK_IdEstructuraEmpleado;
	public JPanel jPanelFK_IdEstructuraSeccionEmpleado;
	public JButton jButtonFK_IdEstructuraSeccionEmpleado;
	public JPanel jPanelFK_IdPaisEmpleado;
	public JButton jButtonFK_IdPaisEmpleado;
	public JPanel jPanelFK_IdProvinciaEmpleado;
	public JButton jButtonFK_IdProvinciaEmpleado;
	public JPanel jPanelFK_IdReligionEmpleado;
	public JButton jButtonFK_IdReligionEmpleado;
	public JPanel jPanelFK_IdTipoContratoEmpleado;
	public JButton jButtonFK_IdTipoContratoEmpleado;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalEmpleado;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalEmpleado;
	public JPanel jPanelFK_IdTipoEmpleadoEmpleado;
	public JButton jButtonFK_IdTipoEmpleadoEmpleado;
	public JPanel jPanelFK_IdTipoGeneroEmpleado;
	public JButton jButtonFK_IdTipoGeneroEmpleado;
	public JPanel jPanelFK_IdTipoInstruccionEmpleado;
	public JButton jButtonFK_IdTipoInstruccionEmpleado;
	
	public JPanel jPanelid_cargoFK_IdCargoEmpleado;
	public JLabel jLabelid_cargoFK_IdCargoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoFK_IdCargoEmpleado;
	public JButton jButtonid_cargoFK_IdCargoEmpleado= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoArbol= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoEmpleado;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoEmpleado;
	public JButton jButtonid_centro_costoFK_IdCentroCostoEmpleado= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoEmpleadoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado;
	
	public JPanel jPanelid_ciudadFK_IdCiudadEmpleado;
	public JLabel jLabelid_ciudadFK_IdCiudadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadEmpleado;
	public JButton jButtonid_ciudadFK_IdCiudadEmpleado= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_civilFK_IdEstadoCivilEmpleado;
	public JLabel jLabelid_estado_civilFK_IdEstadoCivilEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado;
	public JButton jButtonid_estado_civilFK_IdEstadoCivilEmpleado= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado;
	public JLabel jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado;
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoEmpleado= new JButtonMe();
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEmpleado;
	public JLabel jLabelid_estructuraFK_IdEstructuraEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEmpleado;
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoArbol= new JButtonMe();

	
	public JPanel jPanelid_estructura_seccionFK_IdEstructuraSeccionEmpleado;
	public JLabel jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado;
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionEmpleado= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionEmpleadoArbol= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisEmpleado;
	public JLabel jLabelid_paisFK_IdPaisEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisEmpleado;
	public JButton jButtonid_paisFK_IdPaisEmpleado= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaEmpleado;
	public JLabel jLabelid_provinciaFK_IdProvinciaEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaEmpleado;
	public JButton jButtonid_provinciaFK_IdProvinciaEmpleado= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_religionFK_IdReligionEmpleado;
	public JLabel jLabelid_religionFK_IdReligionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_religionFK_IdReligionEmpleado;
	public JButton jButtonid_religionFK_IdReligionEmpleado= new JButtonMe();
	public JButton jButtonid_religionFK_IdReligionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_religionFK_IdReligionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_contratoFK_IdTipoContratoEmpleado;
	public JLabel jLabelid_tipo_contratoFK_IdTipoContratoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado;
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoFK_IdTipoContratoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado;
	public JLabel jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado;
	public JButton jButtonid_tipo_empleadoFK_IdTipoEmpleadoEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_empleadoFK_IdTipoEmpleadoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_empleadoFK_IdTipoEmpleadoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_generoFK_IdTipoGeneroEmpleado;
	public JLabel jLabelid_tipo_generoFK_IdTipoGeneroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado;
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_instruccionFK_IdTipoInstruccionEmpleado;
	public JLabel jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado;
	public JButton jButtonid_tipo_instruccionFK_IdTipoInstruccionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_instruccionFK_IdTipoInstruccionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_instruccionFK_IdTipoInstruccionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1056;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleado)	{
		this.jButtonRecargarInformacionEmpleado = jButtonRecargarInformacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionEmpleado() {
		return this.jButtonProcesarInformacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleado)	{
		this.jButtonProcesarInformacionEmpleado = jButtonProcesarInformacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleado() {
		return this.jButtonRecargarInformacionEmpleado;
	}
	
	
	public List<Empleado> getempleados() {
		return this.empleados;
	}

	public void setempleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public List<Empleado> getempleadosAux() {
		return this.empleadosAux;
	}

	public void setempleadosAux(List<Empleado> empleadosAux) {
		this.empleadosAux = empleadosAux;
	}
	
	public List<Empleado> getempleadosEliminados() {
		return this.empleadosEliminados;
	}

	public void setEmpleadosEliminados(List<Empleado> empleadosEliminados) {
		this.empleadosEliminados = empleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleado() {
		return jComboBoxTiposSeleccionarEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleado(
			JComboBox jComboBoxTiposSeleccionarEmpleado) {
		this.jComboBoxTiposSeleccionarEmpleado = jComboBoxTiposSeleccionarEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleado() {
		return jTextFieldValorCampoGeneralEmpleado;
	}

	public void setjTextFieldValorCampoGeneralEmpleado(
			JTextField jTextFieldValorCampoGeneralEmpleado) {
		this.jTextFieldValorCampoGeneralEmpleado = jTextFieldValorCampoGeneralEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleado() {
		return this.jCheckBoxSeleccionarTodosEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosEmpleado) {
		this.jCheckBoxSeleccionarTodosEmpleado = jCheckBoxSeleccionarTodosEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleado() {
		return this.jCheckBoxSeleccionadosEmpleado;
	}

	public void setjCheckBoxSeleccionadosEmpleado(
			JCheckBox jCheckBoxSeleccionadosEmpleado) {
		this.jCheckBoxSeleccionadosEmpleado = jCheckBoxSeleccionadosEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleado() {
		return this.jComboBoxTiposArchivosReportesEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleado(
			JComboBox jComboBoxTiposArchivosReportesEmpleado) {
		this.jComboBoxTiposArchivosReportesEmpleado = jComboBoxTiposArchivosReportesEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleado() {
		return this.jComboBoxTiposReportesEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleado(
			JComboBox jComboBoxTiposReportesEmpleado) {
		this.jComboBoxTiposReportesEmpleado = jComboBoxTiposReportesEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleado() {
	//	return jComboBoxTiposReportesDinamicoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoEmpleado = jComboBoxTiposReportesDinamicoEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleado = jComboBoxTiposArchivosReportesDinamicoEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleado() {
		return this.jComboBoxTiposGraficosReportesEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleado(
			JComboBox jComboBoxTiposGraficosReportesEmpleado) {
		this.jComboBoxTiposGraficosReportesEmpleado = jComboBoxTiposGraficosReportesEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleado() {
		return this.jComboBoxTiposPaginacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleado(
			JComboBox jComboBoxTiposPaginacionEmpleado) {
		this.jComboBoxTiposPaginacionEmpleado = jComboBoxTiposPaginacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleado() {
		return this.jComboBoxTiposRelacionesEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleado() {
		return this.jComboBoxTiposAccionesEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleado(
			JComboBox jComboBoxTiposRelacionesEmpleado) {
		this.jComboBoxTiposRelacionesEmpleado = jComboBoxTiposRelacionesEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleado(
			JComboBox jComboBoxTiposAccionesEmpleado) {
		this.jComboBoxTiposAccionesEmpleado = jComboBoxTiposAccionesEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleado() {
	//	return jCheckBoxConGraficoDinamicoEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoEmpleado = jCheckBoxConGraficoDinamicoEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleado .setBorder(borderResaltar);		
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
		this.empleadoSessionBean=new EmpleadoSessionBean();
		
		this.empleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleado,this.jTtoolBarEmpleado,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleado,this.jTtoolBarEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleado,this.jTtoolBarEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleado,this.jTtoolBarEmpleado,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleado,this.jTtoolBarEmpleado,
							"copiar","copiar","Copiar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleado,this.jTtoolBarEmpleado,
							"ver_form","ver_form","Ver"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleado,this.jTtoolBarEmpleado,
							"recargar","recargar","Recargar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleado,this.jTtoolBarEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleado,this.jTtoolBarEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleado,this.jTtoolBarEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleado,this.jTtoolBarEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleado,this.jTtoolBarEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleado,this.jTtoolBarEmpleado,
							"cerrar","cerrar","Salir"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleado;
			
				this.jButtonProcesarInformacionToolBarEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleado;
				
		//protected JButton jButtonModificarToolBarEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleado=new JMenuMe("General");
		this.jmenuArchivoEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleado.add(this.jMenuItemCerrarEmpleado);
			
			this.jmenuAccionesEmpleado.add(this.jMenuItemNuevoEmpleado);
			this.jmenuAccionesEmpleado.add(this.jMenuItemNuevoGuardarCambiosEmpleado);
			this.jmenuAccionesEmpleado.add(this.jMenuItemNuevoRelacionesEmpleado);
			this.jmenuAccionesEmpleado.add(this.jMenuItemGuardarCambiosTablaEmpleado);		
			this.jmenuAccionesEmpleado.add(this.jMenuItemDuplicarEmpleado);		
			this.jmenuAccionesEmpleado.add(this.jMenuItemCopiarEmpleado);		
			this.jmenuAccionesEmpleado.add(this.jMenuItemVerFormEmpleado);		
			
			this.jmenuDatosEmpleado.add(this.jMenuItemRecargarInformacionEmpleado);				
			this.jmenuDatosEmpleado.add(this.jMenuItemAnterioresEmpleado);				
			this.jmenuDatosEmpleado.add(this.jMenuItemSiguientesEmpleado);				
			this.jmenuDatosEmpleado.add(this.jMenuItemAbrirOrderByEmpleado);				
			this.jmenuDatosEmpleado.add(this.jMenuItemMostrarOcultarEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleado.add(this.jMenuItemGuardarCambiosEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleado.add(this.jmenuArchivoEmpleado);		
			this.jmenuBarEmpleado.add(this.jmenuAccionesEmpleado);		
			this.jmenuBarEmpleado.add(this.jmenuDatosEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCargoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoEmpleado.setToolTipText("Buscar Por Cargo ");
		this.jButtonFK_IdCargoEmpleado= new JButtonMe();
		this.jButtonFK_IdCargoEmpleado.setText("Buscar");
		this.jButtonFK_IdCargoEmpleado.setToolTipText("Buscar Por Cargo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoEmpleado,"buscar_button","Buscar Por Cargo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoFK_IdCargoEmpleado = new JLabelMe();
		jLabelid_cargoFK_IdCargoEmpleado.setText("Cargo :");
		jLabelid_cargoFK_IdCargoEmpleado.setToolTipText("Cargo");
		jLabelid_cargoFK_IdCargoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoFK_IdCargoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoFK_IdCargoEmpleado= new JComboBoxMe();
		jComboBoxid_cargoFK_IdCargoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoFK_IdCargoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoEmpleado.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoEmpleado= new JButtonMe();
		this.jButtonFK_IdCentroCostoEmpleado.setText("Buscar");
		this.jButtonFK_IdCentroCostoEmpleado.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoEmpleado,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoEmpleado = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoEmpleado.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoEmpleado.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoEmpleado= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado.setFocusable(false);

		this.jPanelFK_IdCiudadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadEmpleado.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadEmpleado= new JButtonMe();
		this.jButtonFK_IdCiudadEmpleado.setText("Buscar");
		this.jButtonFK_IdCiudadEmpleado.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadEmpleado,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadEmpleado = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadEmpleado.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadEmpleado.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadEmpleado= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoCivilEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCivilEmpleado.setToolTipText("Buscar Por Estado Civil ");
		this.jButtonFK_IdEstadoCivilEmpleado= new JButtonMe();
		this.jButtonFK_IdEstadoCivilEmpleado.setText("Buscar");
		this.jButtonFK_IdEstadoCivilEmpleado.setToolTipText("Buscar Por Estado Civil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCivilEmpleado,"buscar_button","Buscar Por Estado Civil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCivilEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado = new JLabelMe();
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado.setText("Estado Civil :");
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado.setToolTipText("Estado Civil");
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilFK_IdEstadoCivilEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado= new JComboBoxMe();
		jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoEmpleadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoEmpleadoEmpleado.setToolTipText("Buscar Por Estado Empleado ");
		this.jButtonFK_IdEstadoEmpleadoEmpleado= new JButtonMe();
		this.jButtonFK_IdEstadoEmpleadoEmpleado.setText("Buscar");
		this.jButtonFK_IdEstadoEmpleadoEmpleado.setToolTipText("Buscar Por Estado Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoEmpleadoEmpleado,"buscar_button","Buscar Por Estado Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoEmpleadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado = new JLabelMe();
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setText("Estado Empleado :");
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setToolTipText("Estado Empleado");
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado= new JComboBoxMe();
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEmpleado.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEmpleado= new JButtonMe();
		this.jButtonFK_IdEstructuraEmpleado.setText("Buscar");
		this.jButtonFK_IdEstructuraEmpleado.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEmpleado,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEmpleado = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEmpleado.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEmpleado.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSeccionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSeccionEmpleado.setToolTipText("Buscar Por Estructura Seccion ");
		this.jButtonFK_IdEstructuraSeccionEmpleado= new JButtonMe();
		this.jButtonFK_IdEstructuraSeccionEmpleado.setText("Buscar");
		this.jButtonFK_IdEstructuraSeccionEmpleado.setToolTipText("Buscar Por Estructura Seccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSeccionEmpleado,"buscar_button","Buscar Por Estructura Seccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSeccionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado = new JLabelMe();
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setText("Estructura Seccion :");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setToolTipText("Estructura Seccion");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado= new JComboBoxMe();
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisEmpleado.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisEmpleado= new JButtonMe();
		this.jButtonFK_IdPaisEmpleado.setText("Buscar");
		this.jButtonFK_IdPaisEmpleado.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisEmpleado,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisEmpleado = new JLabelMe();
		jLabelid_paisFK_IdPaisEmpleado.setText("Pais :");
		jLabelid_paisFK_IdPaisEmpleado.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisEmpleado= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaEmpleado.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaEmpleado= new JButtonMe();
		this.jButtonFK_IdProvinciaEmpleado.setText("Buscar");
		this.jButtonFK_IdProvinciaEmpleado.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaEmpleado,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaEmpleado = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaEmpleado.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaEmpleado.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaEmpleado= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdReligionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdReligionEmpleado.setToolTipText("Buscar Por Religion ");
		this.jButtonFK_IdReligionEmpleado= new JButtonMe();
		this.jButtonFK_IdReligionEmpleado.setText("Buscar");
		this.jButtonFK_IdReligionEmpleado.setToolTipText("Buscar Por Religion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdReligionEmpleado,"buscar_button","Buscar Por Religion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdReligionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_religionFK_IdReligionEmpleado = new JLabelMe();
		jLabelid_religionFK_IdReligionEmpleado.setText("Religion :");
		jLabelid_religionFK_IdReligionEmpleado.setToolTipText("Religion");
		jLabelid_religionFK_IdReligionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_religionFK_IdReligionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_religionFK_IdReligionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_religionFK_IdReligionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_religionFK_IdReligionEmpleado= new JComboBoxMe();
		jComboBoxid_religionFK_IdReligionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_religionFK_IdReligionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_religionFK_IdReligionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_religionFK_IdReligionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoContratoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoContratoEmpleado.setToolTipText("Buscar Por Idtipo Contrato ");
		this.jButtonFK_IdTipoContratoEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoContratoEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoContratoEmpleado.setToolTipText("Buscar Por Idtipo Contrato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoContratoEmpleado,"buscar_button","Buscar Por Idtipo Contrato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoContratoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado = new JLabelMe();
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado.setText("Idtipo Contrato :");
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado.setToolTipText("Idtipo Contrato");
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_contratoFK_IdTipoContratoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoFK_IdTipoContratoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoGlobalEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalEmpleado.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		this.jButtonFK_IdTipoCuentaBancoGlobalEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalEmpleado.setToolTipText("Buscar Por Tipo Cuenta Banco Global ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalEmpleado,"buscar_button","Buscar Por Tipo Cuenta Banco Global ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setText("Tipo Cuenta Banco Global :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setToolTipText("Tipo Cuenta Banco Global");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoEmpleadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEmpleadoEmpleado.setToolTipText("Buscar Por Tipo Empleado ");
		this.jButtonFK_IdTipoEmpleadoEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoEmpleadoEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoEmpleadoEmpleado.setToolTipText("Buscar Por Tipo Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEmpleadoEmpleado,"buscar_button","Buscar Por Tipo Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEmpleadoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado = new JLabelMe();
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setText("Tipo Empleado :");
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setToolTipText("Tipo Empleado");
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGeneroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGeneroEmpleado.setToolTipText("Buscar Por Tipo Genero ");
		this.jButtonFK_IdTipoGeneroEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoGeneroEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoGeneroEmpleado.setToolTipText("Buscar Por Tipo Genero ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGeneroEmpleado,"buscar_button","Buscar Por Tipo Genero ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGeneroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado = new JLabelMe();
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado.setText("Tipo Genero :");
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado.setToolTipText("Tipo Genero");
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoFK_IdTipoGeneroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoInstruccionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoInstruccionEmpleado.setToolTipText("Buscar Por Tipo Instruccion ");
		this.jButtonFK_IdTipoInstruccionEmpleado= new JButtonMe();
		this.jButtonFK_IdTipoInstruccionEmpleado.setText("Buscar");
		this.jButtonFK_IdTipoInstruccionEmpleado.setToolTipText("Buscar Por Tipo Instruccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoInstruccionEmpleado,"buscar_button","Buscar Por Tipo Instruccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoInstruccionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado = new JLabelMe();
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setText("Tipo Instruccion :");
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setToolTipText("Tipo Instruccion");
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleado = new EmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado DATOS");
			this.jInternalFrameDetalleFormEmpleado = new EmpleadoDetalleFormJInternalFrame(jDesktopPane,this.empleadoSessionBean.getConGuardarRelaciones(),this.empleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleado = null;//new EmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleado= new GridBagLayout();
		
		
		this.jTableDatosEmpleado = new JTableMe();      
		
		String sToolTipEmpleado="";
		sToolTipEmpleado=EmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleado+="(Nomina.Empleado)";
		}
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleado.setToolTipText(sToolTipEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleado);
		this.jTableDatosEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleado = new JButtonMe();
		this.jButtonDuplicarEmpleado = new JButtonMe();
		this.jButtonCopiarEmpleado = new JButtonMe();
		this.jButtonVerFormEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleado = new JButtonMe();
		this.jButtonCerrarEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado";
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleado=new ReporteDinamicoJInternalFrame(EmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleado=new ImportacionJInternalFrame(EmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleado.setText("Orden");
		this.jButtonAbrirOrderByEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleado,false,this);
			
			//this.cargarOrderByEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleado,true,this);
			
			//this.cargarOrderByEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleado.setMinimumSize(new Dimension(400,50));//2830
		this.jTableDatosEmpleado.setMaximumSize(new Dimension(400,50));//2830
		this.jTableDatosEmpleado.setPreferredSize(new Dimension(400,50));//2830
		
		this.jScrollPanelDatosEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleado.setText("Nuevo");
		this.jButtonDuplicarEmpleado.setText("Duplicar");
		this.jButtonCopiarEmpleado.setText("Copiar");
		this.jButtonVerFormEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleado.setText("Guardar");
		this.jButtonCerrarEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleado,"nuevo_button","Nuevo",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleado,"duplicar_button","Duplicar",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleado,"copiar_button","Copiar",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleado,"ver_form","Ver",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleado,"nuevorelaciones_button","Nuevo Rel",this.empleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleado,"guardarcambiostabla_button","Guardar",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleado,"cerrar_button","Salir",this.empleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleado.setToolTipText("Nuevo"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleado.setToolTipText("Duplicar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleado.setToolTipText("Copiar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleado.setToolTipText("Ver"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleado.setToolTipText("Nuevo Rel"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleado.setToolTipText("Guardar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleado.setToolTipText("Salir"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleado";
		inputMap = this.jButtonNuevoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleado";
		inputMap = this.jButtonDuplicarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarEmpleado";
		inputMap = this.jButtonCopiarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleado";
		inputMap = this.jButtonVerFormEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleado";
		inputMap = this.jButtonNuevoRelacionesEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleado";
		inputMap = this.jButtonModificarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleado";
		inputMap = this.jButtonCerrarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Empleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Empleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Empleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Empleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Empleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleado.setName("jPanelParametrosReportesEmpleado"); 
		
		this.jPanelParametrosReportesAccionesEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleado.setName("jPanelParametrosReportesAccionesEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionEmpleado.setToolTipText("Recargar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionEmpleado.setToolTipText("Procesar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleado = new JLabelMe();
		
		this.jLabelAccionesEmpleado.setText("Acciones");		
		this.jLabelAccionesEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleado = new JButtonMe();
		//this.jButtonAnterioresEmpleado.setText("<<");
        this.jButtonAnterioresEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleado = new JButtonMe();
		//this.jButtonSiguientesEmpleado.setText(">>");
        this.jButtonSiguientesEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleado,"nuevoguardarcambios_button","Nue",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleado";
		inputMap = this.jButtonRecargarInformacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleado";
		inputMap = this.jButtonSiguientesEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleado";
		inputMap = this.jButtonAnterioresEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleado.setMinimumSize(new Dimension(this.getWidth(),EmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleado.setMaximumSize(new Dimension(this.getWidth(),EmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleado.setPreferredSize(new Dimension(this.getWidth(),EmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionEmpleado.setLayout(gridaBagLayoutPaginacionEmpleado);						
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 0;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleado.add(this.jButtonAnterioresEmpleado, this.gridBagConstraintsEmpleado);
					
						
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleado.gridy = 0;
			
			this.jPanelPaginacionEmpleado.add(this.jButtonNuevoGuardarCambiosEmpleado, this.gridBagConstraintsEmpleado);
						
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleado.gridy = 0;
			this.jPanelPaginacionEmpleado.add(this.jButtonSiguientesEmpleado, this.gridBagConstraintsEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 1;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleado.add(this.jButtonNuevoEmpleado, this.gridBagConstraintsEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleado.gridy = 1;
				this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEmpleado.add(this.jButtonNuevoRelacionesEmpleado, this.gridBagConstraintsEmpleado);
			}
			
			
			if(!this.empleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleado.gridy = 1;
				this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleado.add(this.jButtonGuardarCambiosTablaEmpleado, this.gridBagConstraintsEmpleado);
			}
			
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 1;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleado.add(this.jButtonDuplicarEmpleado, this.gridBagConstraintsEmpleado);
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 1;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleado.add(this.jButtonCopiarEmpleado, this.gridBagConstraintsEmpleado);
		
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 1;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleado.add(this.jButtonVerFormEmpleado, this.gridBagConstraintsEmpleado);
		
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 1;
			this.gridBagConstraintsEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleado.add(this.jButtonCerrarEmpleado, this.gridBagConstraintsEmpleado);
		
		
		
		this.jButtonRecargarInformacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Empleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Empleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Empleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Empleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleado.setLayout(gridaBagParametrosReportesEmpleado);
			this.jPanelParametrosReportesAccionesEmpleado.setLayout(gridaBagParametrosReportesAccionesEmpleado);
			
			
			this.jPanelParametrosAuxiliar1Empleado.setLayout(gridaBagParametrosAuxiliar1Empleado);
			this.jPanelParametrosAuxiliar2Empleado.setLayout(gridaBagParametrosAuxiliar2Empleado);
			this.jPanelParametrosAuxiliar3Empleado.setLayout(gridaBagParametrosAuxiliar3Empleado);
			this.jPanelParametrosAuxiliar4Empleado.setLayout(gridaBagParametrosAuxiliar4Empleado);
			//this.jPanelParametrosAuxiliar5Empleado.setLayout(gridaBagParametrosAuxiliar2Empleado);			
			
			
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleado.add(this.jButtonRecargarInformacionEmpleado, this.gridBagConstraintsEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empleado.add(this.jComboBoxTiposPaginacionEmpleado, this.gridBagConstraintsEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empleado.add(this.jCheckBoxConAltoMaximoTablaEmpleado, this.gridBagConstraintsEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empleado.add(this.jComboBoxTiposArchivosReportesEmpleado, this.gridBagConstraintsEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleado.add(this.jPanelParametrosAuxiliar1Empleado, this.gridBagConstraintsEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Empleado.add(this.jComboBoxTiposReportesEmpleado, this.gridBagConstraintsEmpleado);																		
			
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Empleado.add(this.jComboBoxTiposGraficosReportesEmpleado, this.gridBagConstraintsEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleado.add(this.jPanelParametrosAuxiliar4Empleado, this.gridBagConstraintsEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleado.add(this.jComboBoxTiposReportesEmpleado, this.gridBagConstraintsEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleado.add(this.jCheckBoxGenerarReporteEmpleado, this.gridBagConstraintsEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleado.add(this.jPanelParametrosAuxiliar2Empleado, this.gridBagConstraintsEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleado.add(this.jLabelAccionesEmpleado, this.gridBagConstraintsEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleado.add(this.jButtonAbrirOrderByEmpleado, this.gridBagConstraintsEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleado.add(this.jComboBoxTiposSeleccionarEmpleado, this.gridBagConstraintsEmpleado);			
			
			
			/*
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleado.add(this.jCheckBoxSeleccionarTodosEmpleado, this.gridBagConstraintsEmpleado);
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleado.add(this.jCheckBoxConGraficoReporteEmpleado, this.gridBagConstraintsEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empleado.add(this.jCheckBoxSeleccionarTodosEmpleado, this.gridBagConstraintsEmpleado);															
				
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empleado.add(this.jCheckBoxSeleccionadosEmpleado, this.gridBagConstraintsEmpleado);															
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empleado.add(this.jCheckBoxConGraficoReporteEmpleado, this.gridBagConstraintsEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleado.add(this.jPanelParametrosAuxiliar3Empleado, this.gridBagConstraintsEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleado.add(this.jComboBoxTiposRelacionesEmpleado, this.gridBagConstraintsEmpleado);
				
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleado.add(this.jComboBoxTiposAccionesEmpleado, this.gridBagConstraintsEmpleado);
	
				
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleado.add(this.jTextFieldValorCampoGeneralEmpleado, this.gridBagConstraintsEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleado = new GridBagLayout();

			this.jScrollPanelDatosEmpleado.setLayout(gridaBagLayoutDatosEmpleado);
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = 0;
			this.gridBagConstraintsEmpleado.gridx = 0;
			
			this.jScrollPanelDatosEmpleado.add(this.jTableDatosEmpleado, this.gridBagConstraintsEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleado.setViewportView(this.jTableDatosEmpleado);
		this.jTableDatosEmpleado.setFillsViewportHeight(true);
		this.jTableDatosEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleado= new GridBagLayout();
		this.jPanelAccionesEmpleado.setLayout(gridaBagLayoutAccionesEmpleado);
		
		
		/*	
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 0;
			
		this.jPanelAccionesEmpleado.add(this.jButtonNuevoEmpleado, this.gridBagConstraintsEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCargoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdCargoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoEmpleado.setLayout(gridaBagLayoutFK_IdCargoEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdCargoEmpleado.add(jLabelid_cargoFK_IdCargoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdCargoEmpleado.add(jComboBoxid_cargoFK_IdCargoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdCargoEmpleado.add(jButtonFK_IdCargoEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("1.-Por Cargo ", jPanelFK_IdCargoEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoEmpleado.setLayout(gridaBagLayoutFK_IdCentroCostoEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdCentroCostoEmpleado.add(jLabelid_centro_costoFK_IdCentroCostoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdCentroCostoEmpleado.add(jComboBoxid_centro_costoFK_IdCentroCostoEmpleado, gridBagConstraintsEmpleado);


		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdCentroCostoEmpleado.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdCentroCostoEmpleado.add(jButtonFK_IdCentroCostoEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCiudadEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadEmpleado.setLayout(gridaBagLayoutFK_IdCiudadEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdCiudadEmpleado.add(jLabelid_ciudadFK_IdCiudadEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdCiudadEmpleado.add(jComboBoxid_ciudadFK_IdCiudadEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdCiudadEmpleado.add(jButtonFK_IdCiudadEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("3.-Por Ciudad ", jPanelFK_IdCiudadEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoCivilEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCivilEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCivilEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCivilEmpleado.setLayout(gridaBagLayoutFK_IdEstadoCivilEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdEstadoCivilEmpleado.add(jLabelid_estado_civilFK_IdEstadoCivilEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdEstadoCivilEmpleado.add(jComboBoxid_estado_civilFK_IdEstadoCivilEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdEstadoCivilEmpleado.add(jButtonFK_IdEstadoCivilEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("4.-Por Estado Civil ", jPanelFK_IdEstadoCivilEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoEmpleadoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoEmpleadoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoEmpleadoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoEmpleadoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoEmpleadoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoEmpleadoEmpleado.setLayout(gridaBagLayoutFK_IdEstadoEmpleadoEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdEstadoEmpleadoEmpleado.add(jLabelid_estado_empleadoFK_IdEstadoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdEstadoEmpleadoEmpleado.add(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdEstadoEmpleadoEmpleado.add(jButtonFK_IdEstadoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("5.-Por Estado Empleado ", jPanelFK_IdEstadoEmpleadoEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEmpleado.setLayout(gridaBagLayoutFK_IdEstructuraEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdEstructuraEmpleado.add(jLabelid_estructuraFK_IdEstructuraEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdEstructuraEmpleado.add(jComboBoxid_estructuraFK_IdEstructuraEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdEstructuraEmpleado.add(jButtonFK_IdEstructuraEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("6.-Por Estructura ", jPanelFK_IdEstructuraEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSeccionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSeccionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSeccionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSeccionEmpleado.setLayout(gridaBagLayoutFK_IdEstructuraSeccionEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdEstructuraSeccionEmpleado.add(jLabelid_estructura_seccionFK_IdEstructuraSeccionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdEstructuraSeccionEmpleado.add(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdEstructuraSeccionEmpleado.add(jButtonFK_IdEstructuraSeccionEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("7.-Por Estructura Seccion ", jPanelFK_IdEstructuraSeccionEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdPaisEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdPaisEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisEmpleado.setLayout(gridaBagLayoutFK_IdPaisEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdPaisEmpleado.add(jLabelid_paisFK_IdPaisEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdPaisEmpleado.add(jComboBoxid_paisFK_IdPaisEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdPaisEmpleado.add(jButtonFK_IdPaisEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("8.-Por Pais ", jPanelFK_IdPaisEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdProvinciaEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaEmpleado.setLayout(gridaBagLayoutFK_IdProvinciaEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdProvinciaEmpleado.add(jLabelid_provinciaFK_IdProvinciaEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdProvinciaEmpleado.add(jComboBoxid_provinciaFK_IdProvinciaEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdProvinciaEmpleado.add(jButtonFK_IdProvinciaEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("9.-Por Provincia ", jPanelFK_IdProvinciaEmpleado);
		jTabbedPaneBusquedasEmpleado.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdReligionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdReligionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdReligionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdReligionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdReligionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdReligionEmpleado.setLayout(gridaBagLayoutFK_IdReligionEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdReligionEmpleado.add(jLabelid_religionFK_IdReligionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdReligionEmpleado.add(jComboBoxid_religionFK_IdReligionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdReligionEmpleado.add(jButtonFK_IdReligionEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("10.-Por Religion ", jPanelFK_IdReligionEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoContratoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoContratoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoContratoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoContratoEmpleado.setLayout(gridaBagLayoutFK_IdTipoContratoEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdTipoContratoEmpleado.add(jLabelid_tipo_contratoFK_IdTipoContratoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdTipoContratoEmpleado.add(jComboBoxid_tipo_contratoFK_IdTipoContratoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdTipoContratoEmpleado.add(jButtonFK_IdTipoContratoEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("11.-Por Idtipo Contrato ", jPanelFK_IdTipoContratoEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalEmpleado.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalEmpleado.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalEmpleado.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalEmpleado.add(jButtonFK_IdTipoCuentaBancoGlobalEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("12.-Por Tipo Cuenta Banco Global ", jPanelFK_IdTipoCuentaBancoGlobalEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoEmpleadoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEmpleadoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpleadoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpleadoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEmpleadoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEmpleadoEmpleado.setLayout(gridaBagLayoutFK_IdTipoEmpleadoEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdTipoEmpleadoEmpleado.add(jLabelid_tipo_empleadoFK_IdTipoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdTipoEmpleadoEmpleado.add(jComboBoxid_tipo_empleadoFK_IdTipoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdTipoEmpleadoEmpleado.add(jButtonFK_IdTipoEmpleadoEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("13.-Por Tipo Empleado ", jPanelFK_IdTipoEmpleadoEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoGeneroEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGeneroEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGeneroEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGeneroEmpleado.setLayout(gridaBagLayoutFK_IdTipoGeneroEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdTipoGeneroEmpleado.add(jLabelid_tipo_generoFK_IdTipoGeneroEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdTipoGeneroEmpleado.add(jComboBoxid_tipo_generoFK_IdTipoGeneroEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdTipoGeneroEmpleado.add(jButtonFK_IdTipoGeneroEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("14.-Por Tipo Genero ", jPanelFK_IdTipoGeneroEmpleado);

		GridBagLayout gridaBagLayoutFK_IdTipoInstruccionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoInstruccionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoInstruccionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoInstruccionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoInstruccionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoInstruccionEmpleado.setLayout(gridaBagLayoutFK_IdTipoInstruccionEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 0;
		jPanelFK_IdTipoInstruccionEmpleado.add(jLabelid_tipo_instruccionFK_IdTipoInstruccionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 0;
		gridBagConstraintsEmpleado.gridx = 1;
		jPanelFK_IdTipoInstruccionEmpleado.add(jComboBoxid_tipo_instruccionFK_IdTipoInstruccionEmpleado, gridBagConstraintsEmpleado);

		gridBagConstraintsEmpleado = new GridBagConstraints();
		gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleado.gridy = 1;
		gridBagConstraintsEmpleado.gridx =1;
		jPanelFK_IdTipoInstruccionEmpleado.add(jButtonFK_IdTipoInstruccionEmpleado, gridBagConstraintsEmpleado);

		jTabbedPaneBusquedasEmpleado.addTab("15.-Por Tipo Instruccion ", jPanelFK_IdTipoInstruccionEmpleado);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleado.gridx = 0;		
			//this.gridBagConstraintsEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleado, this.gridBagConstraintsEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleado.gridx = 0;		
		//this.gridBagConstraintsEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleado.gridx = 0;		
			this.gridBagConstraintsEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleado, this.gridBagConstraintsEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleado, this.gridBagConstraintsEmpleado);								
		
		
		/*
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleado, this.gridBagConstraintsEmpleado);
		*/		
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleado.gridx =0;
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleado, this.gridBagConstraintsEmpleado);
				
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleado, this.gridBagConstraintsEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleado.setLayout(gridaBagLayoutBusquedasParametrosEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleado, this.gridBagConstraintsEmpleado);
			
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleado, this.gridBagConstraintsEmpleado);
		
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleado, this.gridBagConstraintsEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleado.setName("jPanelReporteDinamicoEmpleado"); 
		
		this.jPanelReporteDinamicoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleado.setLayout(gridaBagLayoutReporteDinamicoEmpleado);
		
		
		this.jInternalFrameReporteDinamicoEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelColumnasSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleado=new JScrollPane(this.jListColumnasSelectReporteEmpleado);
			
			this.jScrollColumnasSelectReporteEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleado.add(this.jListColumnasSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		this.jPanelReporteDinamicoEmpleado.add(this.jScrollColumnasSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelRelacionesSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleado=new JScrollPane(this.jListRelacionesSelectReporteEmpleado);
			
			this.jScrollRelacionesSelectReporteEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleado.add(this.jListRelacionesSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		this.jPanelReporteDinamicoEmpleado.add(this.jScrollRelacionesSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelConGraficoDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jCheckBoxConGraficoDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelColumnaCategoriaGraficoEmpleado, this.gridBagConstraintsEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpleado.add(this.jComboBoxColumnaCategoriaGraficoEmpleado, this.gridBagConstraintsEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelColumnaCategoriaValorEmpleado, this.gridBagConstraintsEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpleado.add(this.jComboBoxColumnaCategoriaValorEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelColumnasValoresGraficoEmpleado, this.gridBagConstraintsEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpleado=new JScrollPane(this.jListColumnasValoresGraficoEmpleado);
			
			this.jScrollColumnasValoresGraficoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpleado.add(this.jListColumnasSelectReporteEmpleado, this.gridBagConstraintsEmpleado);
		this.jPanelReporteDinamicoEmpleado.add(this.jScrollColumnasValoresGraficoEmpleado, this.gridBagConstraintsEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelTiposGraficosReportesDinamicoEmpleado, this.gridBagConstraintsEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelGenerarExcelReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleado.setToolTipText("Generar EXCEL"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleado.add(this.jButtonGenerarExcelReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleado.add(this.jComboBoxTiposReportesDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleado.add(this.jLabelTiposArchivoReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleado, this.gridBagConstraintsEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleado.setToolTipText("Generar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleado.add(this.jButtonGenerarReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleado.setToolTipText("Cancelar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleado.add(this.jButtonCerrarReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleado= new JScrollPane(jPanelReporteDinamicoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleado);
		this.jInternalFrameReporteDinamicoEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleado, this.gridBagConstraintsEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleado.setName("jPanelImportacionEmpleado"); 
		
		this.jPanelImportacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleado.setLayout(gridaBagLayoutImportacionEmpleado);
		
		
		this.jInternalFrameImportacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleado.add(this.jLabelArchivoImportacionEmpleado, this.gridBagConstraintsEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleado.setToolTipText("Generar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleado.add(this.jButtonAbrirImportacionEmpleado, this.gridBagConstraintsEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleado.add(this.jLabelPathArchivoImportacionEmpleado, this.gridBagConstraintsEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleado.add(this.jTextFieldPathArchivoImportacionEmpleado, this.gridBagConstraintsEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleado.setToolTipText("Generar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleado.add(this.jButtonGenerarImportacionEmpleado, this.gridBagConstraintsEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleado.setToolTipText("Cancelar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleado.add(this.jButtonCerrarImportacionEmpleado, this.gridBagConstraintsEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleado= new JScrollPane(jPanelImportacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleado);
		this.jInternalFrameImportacionEmpleado.getContentPane().add(this.jScrollPanelImportacionEmpleado, this.gridBagConstraintsEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByEmpleado.setText("Orden");
			this.jButtonAbrirOrderByEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleado";
			inputMap = this.jButtonAbrirOrderByEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleado.setName("jPanelOrderByEmpleado"); 
			
			this.jPanelOrderByEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleado.setLayout(gridaBagLayoutOrderByEmpleado);
			
			
			this.jTableDatosEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoOrderBy.setViewportView(this.jTableDatosEmpleadoOrderBy);
			this.jTableDatosEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleado.setResizable(true);
			this.jInternalFrameOrderByEmpleado.setClosable(true);
			this.jInternalFrameOrderByEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleado.ipady =150;
				
			this.jPanelOrderByEmpleado.add(jScrollPanelDatosEmpleadoOrderBy, this.gridBagConstraintsEmpleado);//this.jTableDatosEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleado.setToolTipText("Cancelar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleado.add(this.jButtonCerrarOrderByEmpleado, this.gridBagConstraintsEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleado= new JScrollPane(jPanelOrderByEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleado);
			
			this.jInternalFrameOrderByEmpleado.getContentPane().add(this.jScrollPanelOrderByEmpleado, this.gridBagConstraintsEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//8330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=2600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleado.getRowHeight();//EmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleado.isSelected()) {
					iHeightTable=EmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleado.isSelected()) {
					iHeightTable=EmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleado!=null && this.jInternalFrameOrderByEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoLogic.getEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Empleado> TraerEmpleadoBeans(List<Empleado> empleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(Empleado empleado:empleados) {
					
				if(!(EmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleado.setsDetalleGeneralEntityReporte(EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleado));
										
					empleado.settiene_casa_descripcion(EmpleadoConstantesFunciones.gettiene_casaDescripcion(empleado));empleado.settiene_vehiculo_descripcion(EmpleadoConstantesFunciones.gettiene_vehiculoDescripcion(empleado));	
					
					

					if(empleado.getCargaFamiliar_NMs()!=null && Funciones.existeClass(classes,CargaFamiliar_NM.class)) {
						try{empleado.setcargafamiliar_nmsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliar_NMJInternalFrame.TraerCargaFamiliar_NMBeans(empleado.getCargaFamiliar_NMs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getCursos()!=null && Funciones.existeClass(classes,Curso.class)) {
						try{empleado.setcursosDescripcionReporte(new JRBeanCollectionDataSource(CursoJInternalFrame.TraerCursoBeans(empleado.getCursos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getPrestamos()!=null && Funciones.existeClass(classes,Prestamo.class)) {
						try{empleado.setprestamosDescripcionReporte(new JRBeanCollectionDataSource(PrestamoJInternalFrame.TraerPrestamoBeans(empleado.getPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoIdiomas()!=null && Funciones.existeClass(classes,EmpleadoIdioma.class)) {
						try{empleado.setempleadoidiomasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoIdiomaJInternalFrame.TraerEmpleadoIdiomaBeans(empleado.getEmpleadoIdiomas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getHistorialPagoMesNomis()!=null && Funciones.existeClass(classes,HistorialPagoMesNomi.class)) {
						try{empleado.sethistorialpagomesnomisDescripcionReporte(new JRBeanCollectionDataSource(HistorialPagoMesNomiJInternalFrame.TraerHistorialPagoMesNomiBeans(empleado.getHistorialPagoMesNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoImpuestoRentas()!=null && Funciones.existeClass(classes,EmpleadoImpuestoRenta.class)) {
						try{empleado.setempleadoimpuestorentasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoImpuestoRentaJInternalFrame.TraerEmpleadoImpuestoRentaBeans(empleado.getEmpleadoImpuestoRentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					List<DatoGeneralEmpleado> datogeneralempleados=new ArrayList<DatoGeneralEmpleado>(); 

					if(empleado.getDatoGeneralEmpleado()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class))
				{
						datogeneralempleados.add(empleado.getDatoGeneralEmpleado()); 
					}
					if(empleado.getDatoGeneralEmpleado()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {

						try{empleado.setDatoGeneralEmpleadoDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(datogeneralempleados,classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getAreas()!=null && Funciones.existeClass(classes,Area.class)) {
						try{empleado.setareasDescripcionReporte(new JRBeanCollectionDataSource(AreaJInternalFrame.TraerAreaBeans(empleado.getAreas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getGastoEmpleados()!=null && Funciones.existeClass(classes,GastoEmpleado.class)) {
						try{empleado.setgastoempleadosDescripcionReporte(new JRBeanCollectionDataSource(GastoEmpleadoJInternalFrame.TraerGastoEmpleadoBeans(empleado.getGastoEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoHobbys()!=null && Funciones.existeClass(classes,EmpleadoHobby.class)) {
						try{empleado.setempleadohobbysDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoHobbyJInternalFrame.TraerEmpleadoHobbyBeans(empleado.getEmpleadoHobbys(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoEMails()!=null && Funciones.existeClass(classes,EmpleadoEMail.class)) {
						try{empleado.setempleadoemailsDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoEMailJInternalFrame.TraerEmpleadoEMailBeans(empleado.getEmpleadoEMails(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getRasgoPersonals()!=null && Funciones.existeClass(classes,RasgoPersonal.class)) {
						try{empleado.setrasgopersonalsDescripcionReporte(new JRBeanCollectionDataSource(RasgoPersonalJInternalFrame.TraerRasgoPersonalBeans(empleado.getRasgoPersonals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getReferencias()!=null && Funciones.existeClass(classes,Referencia.class)) {
						try{empleado.setreferenciasDescripcionReporte(new JRBeanCollectionDataSource(ReferenciaJInternalFrame.TraerReferenciaBeans(empleado.getReferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getTelefono_NMs()!=null && Funciones.existeClass(classes,Telefono_NM.class)) {
						try{empleado.settelefono_nmsDescripcionReporte(new JRBeanCollectionDataSource(Telefono_NMJInternalFrame.TraerTelefono_NMBeans(empleado.getTelefono_NMs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getNovedads()!=null && Funciones.existeClass(classes,Novedad.class)) {
						try{empleado.setnovedadsDescripcionReporte(new JRBeanCollectionDataSource(NovedadJInternalFrame.TraerNovedadBeans(empleado.getNovedads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoHerras()!=null && Funciones.existeClass(classes,EmpleadoHerra.class)) {
						try{empleado.setempleadoherrasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoHerraJInternalFrame.TraerEmpleadoHerraBeans(empleado.getEmpleadoHerras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoEnfers()!=null && Funciones.existeClass(classes,EmpleadoEnfer.class)) {
						try{empleado.setempleadoenfersDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoEnferJInternalFrame.TraerEmpleadoEnferBeans(empleado.getEmpleadoEnfers(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getVisas()!=null && Funciones.existeClass(classes,Visa.class)) {
						try{empleado.setvisasDescripcionReporte(new JRBeanCollectionDataSource(VisaJInternalFrame.TraerVisaBeans(empleado.getVisas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getSeguros()!=null && Funciones.existeClass(classes,Seguro.class)) {
						try{empleado.setsegurosDescripcionReporte(new JRBeanCollectionDataSource(SeguroJInternalFrame.TraerSeguroBeans(empleado.getSeguros(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getAsistenciaMensuals()!=null && Funciones.existeClass(classes,AsistenciaMensual.class)) {
						try{empleado.setasistenciamensualsDescripcionReporte(new JRBeanCollectionDataSource(AsistenciaMensualJInternalFrame.TraerAsistenciaMensualBeans(empleado.getAsistenciaMensuals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoDiscas()!=null && Funciones.existeClass(classes,EmpleadoDisca.class)) {
						try{empleado.setempleadodiscasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoDiscaJInternalFrame.TraerEmpleadoDiscaBeans(empleado.getEmpleadoDiscas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getProfesionEmpleas()!=null && Funciones.existeClass(classes,ProfesionEmplea.class)) {
						try{empleado.setprofesionempleasDescripcionReporte(new JRBeanCollectionDataSource(ProfesionEmpleaJInternalFrame.TraerProfesionEmpleaBeans(empleado.getProfesionEmpleas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getRubroEmpleados()!=null && Funciones.existeClass(classes,RubroEmpleado.class)) {
						try{empleado.setrubroempleadosDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleadoJInternalFrame.TraerRubroEmpleadoBeans(empleado.getRubroEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getEmpleadoConstantes()!=null && Funciones.existeClass(classes,EmpleadoConstante.class)) {
						try{empleado.setempleadoconstantesDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoConstanteJInternalFrame.TraerEmpleadoConstanteBeans(empleado.getEmpleadoConstantes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getTallaVestidos()!=null && Funciones.existeClass(classes,TallaVestido.class)) {
						try{empleado.settallavestidosDescripcionReporte(new JRBeanCollectionDataSource(TallaVestidoJInternalFrame.TraerTallaVestidoBeans(empleado.getTallaVestidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empleado.getNovedadNomis()!=null && Funciones.existeClass(classes,NovedadNomi.class)) {
						try{empleado.setnovedadnomisDescripcionReporte(new JRBeanCollectionDataSource(NovedadNomiJInternalFrame.TraerNovedadNomiBeans(empleado.getNovedadNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//empleado.setsDetalleGeneralEntityReporte(empleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadobeans.add(empleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleados;
    }
	//PARA REPORTES FIN
}
