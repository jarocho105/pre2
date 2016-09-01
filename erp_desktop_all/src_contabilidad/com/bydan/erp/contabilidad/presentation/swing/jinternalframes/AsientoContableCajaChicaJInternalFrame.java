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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.AsientoContableCajaChicaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class AsientoContableCajaChicaJInternalFrame extends AsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarAsientoContableCajaChica;
	
	protected JMenu jmenuAsientoContableCajaChica;
	protected JMenu jmenuDatosAsientoContableCajaChica;
	protected JMenu jmenuArchivoAsientoContableCajaChica;
	protected JMenu jmenuAccionesAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsAsientoContableCajaChica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame jInternalFrameDetalleFormAsientoContableCajaChica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAsientoContableCajaChica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAsientoContableCajaChica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoAsientoContableCajaChicaBeanSwingJInternalFrame estadoasientocontablecajachicaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontablecajachica="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public AsientoContableCajaChicaSessionBean asientocontablecajachicaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AsientoContableCajaChica> asientocontablecajachicas;		
	public List<AsientoContableCajaChica> asientocontablecajachicasEliminados;	
	public List<AsientoContableCajaChica> asientocontablecajachicasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAsientoContableCajaChica;		
	protected JButton jButtonAbrirOrderByAsientoContableCajaChica;
	
	
	//protected JPanel jPanelOrderByAsientoContableCajaChica;
	//public JScrollPane jScrollPanelOrderByAsientoContableCajaChica;	
	//protected JButton jButtonCerrarOrderByAsientoContableCajaChica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AsientoContableCajaChicaLogic asientocontablecajachicaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralAsientoContableCajaChica;
    
	
	
	//public JScrollPane jScrollPanelDatosAsientoContableCajaChicaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAsientoContableCajaChica;
	//public JScrollPane jScrollPanelImportacionAsientoContableCajaChica;
	
	
	
	protected JPanel jPanelAccionesAsientoContableCajaChica;
	
    protected JPanel jPanelPaginacionAsientoContableCajaChica;
    protected JPanel jPanelParametrosReportesAsientoContableCajaChica;
	protected JPanel jPanelParametrosReportesAccionesAsientoContableCajaChica;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar2AsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar3AsientoContableCajaChica;
	protected JPanel jPanelParametrosAuxiliar4AsientoContableCajaChica;
	//protected JPanel jPanelParametrosAuxiliar5AsientoContableCajaChica;
	
	
	
	//protected JPanel jPanelReporteDinamicoAsientoContableCajaChica;
	//protected JPanel jPanelImportacionAsientoContableCajaChica;
	
	
	public JTable jTableDatosAsientoContableCajaChica;
	
	
	
	//public JTable jTableDatosAsientoContableCajaChicaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAsientoContableCajaChica;
	protected JButton jButtonDuplicarAsientoContableCajaChica;
	protected JButton jButtonCopiarAsientoContableCajaChica;
	protected JButton jButtonVerFormAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesAsientoContableCajaChica;
	protected JButton jButtonModificarAsientoContableCajaChica;
	
    protected JButton jButtonGuardarCambiosTablaAsientoContableCajaChica;
	protected JButton jButtonCerrarAsientoContableCajaChica;
	
	
	protected JButton jButtonRecargarInformacionAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionAsientoContableCajaChica;
	
	
	protected JButton jButtonAnterioresAsientoContableCajaChica;
	protected JButton jButtonSiguientesAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosAsientoContableCajaChica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAsientoContableCajaChica;
	//protected JButton jButtonCerrarReporteDinamicoAsientoContableCajaChica;
	//protected JButton jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica;	
	
	
	
	//protected JButton jButtonAbrirImportacionAsientoContableCajaChica;
	//protected JButton jButtonGenerarImportacionAsientoContableCajaChica;
	//protected JButton jButtonCerrarImportacionAsientoContableCajaChica;
	//protected JFileChooser jFileChooserImportacionAsientoContableCajaChica;
	//protected File fileImportacionAsientoContableCajaChica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsientoContableCajaChica;
	protected JButton jButtonDuplicarToolBarAsientoContableCajaChica;
	protected JButton jButtonNuevoRelacionesToolBarAsientoContableCajaChica;
	
	
	public JButton jButtonGuardarCambiosToolBarAsientoContableCajaChica;
	protected JButton jButtonCopiarToolBarAsientoContableCajaChica;
	protected JButton jButtonVerFormToolBarAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaToolBarAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarAsientoContableCajaChica;
	
	protected JButton jButtonRecargarInformacionToolBarAsientoContableCajaChica;
	protected JButton jButtonProcesarInformacionToolBarAsientoContableCajaChica;
	protected JButton jButtonAnterioresToolBarAsientoContableCajaChica;
	protected JButton jButtonSiguientesToolBarAsientoContableCajaChica;
	protected JButton jButtonNuevoGuardarCambiosToolBarAsientoContableCajaChica;
	protected JButton jButtonAbrirOrderByToolBarAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsientoContableCajaChica;
	protected JMenuItem jMenuItemDuplicarAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoRelacionesAsientoContableCajaChica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAsientoContableCajaChica;
	protected JMenuItem jMenuItemCopiarAsientoContableCajaChica;
	protected JMenuItem jMenuItemVerFormAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemRecargarInformacionAsientoContableCajaChica;
	protected JMenuItem jMenuItemProcesarInformacionAsientoContableCajaChica;
	protected JMenuItem jMenuItemAnterioresAsientoContableCajaChica;
	protected JMenuItem jMenuItemSiguientesAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsientoContableCajaChica;
	protected JMenuItem jMenuItemAbrirOrderByAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsientoContableCajaChica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAsientoContableCajaChica;
	protected JCheckBox jCheckBoxSeleccionadosAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAsientoContableCajaChica;
	protected JCheckBox jCheckBoxConGraficoReporteAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAsientoContableCajaChica;
	protected JTextField jTextFieldValorCampoGeneralAsientoContableCajaChica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasSelectReporteAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasSelectReporteAsientoContableCajaChica;
	
	//public JLabel jLabelRelacionesSelectReporteAsientoContableCajaChica;
	//public JList<Reporte> jListRelacionesSelectReporteAsientoContableCajaChica;
	//public JScrollPane jScrollRelacionesSelectReporteAsientoContableCajaChica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAsientoContableCajaChica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAsientoContableCajaChica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica;
	//public JLabel jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica;
	
		
	//public JLabel jLabelArchivoImportacionAsientoContableCajaChica;	
	//public JLabel jLabelPathArchivoImportacionAsientoContableCajaChica;
	//protected JTextField jTextFieldPathArchivoImportacionAsientoContableCajaChica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAsientoContableCajaChica;
	
	//public JLabel jLabelColumnaCategoriaValorAsientoContableCajaChica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAsientoContableCajaChica;
	
	//public JLabel jLabelColumnasValoresGraficoAsientoContableCajaChica;
	//public JList<Reporte> jListColumnasValoresGraficoAsientoContableCajaChica;
	//public JScrollPane jScrollColumnasValoresGraficoAsientoContableCajaChica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAsientoContableCajaChica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAsientoContableCajaChica;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAsientoContableCajaChica;
	public JPanel jPanelFK_IdClienteAsientoContableCajaChica;
	public JButton jButtonFK_IdClienteAsientoContableCajaChica;
	public JPanel jPanelFK_IdEmpleadoAsientoContableCajaChica;
	public JButton jButtonFK_IdEmpleadoAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoDocumentoAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoDocumentoAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica;
	public JPanel jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica;
	public JButton jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica;
	public JPanel jPanelFK_IdTransaccionAsientoContableCajaChica;
	public JButton jButtonFK_IdTransaccionAsientoContableCajaChica;
	
	public JPanel jPanelid_clienteFK_IdClienteAsientoContableCajaChica;
	public JLabel jLabelid_clienteFK_IdClienteAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica;
	public JButton jButtonid_clienteFK_IdClienteAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAsientoContableCajaChica;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica;
	public JButton jButtonid_empleadoFK_IdEmpleadoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica;
	
	public JPanel jPanelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica;
	public JLabel jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica;
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica;
	public JLabel jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica;
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionAsientoContableCajaChica;
	public JLabel jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica;
	public JButton jButtonid_transaccionFK_IdTransaccionAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=315;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AsientoContableCajaChicaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAsientoContableCajaChica)	{
		this.jButtonRecargarInformacionAsientoContableCajaChica = jButtonRecargarInformacionAsientoContableCajaChica;
	}
	
	public JButton getjButtonProcesarInformacionAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionAsientoContableCajaChica = jButtonProcesarInformacionAsientoContableCajaChica;
	}
	
	
	public JButton getjButtonRecargarInformacionAsientoContableCajaChica() {
		return this.jButtonRecargarInformacionAsientoContableCajaChica;
	}
	
	
	public List<AsientoContableCajaChica> getasientocontablecajachicas() {
		return this.asientocontablecajachicas;
	}

	public void setasientocontablecajachicas(List<AsientoContableCajaChica> asientocontablecajachicas) {
		this.asientocontablecajachicas = asientocontablecajachicas;
	}
	
	public List<AsientoContableCajaChica> getasientocontablecajachicasAux() {
		return this.asientocontablecajachicasAux;
	}

	public void setasientocontablecajachicasAux(List<AsientoContableCajaChica> asientocontablecajachicasAux) {
		this.asientocontablecajachicasAux = asientocontablecajachicasAux;
	}
	
	public List<AsientoContableCajaChica> getasientocontablecajachicasEliminados() {
		return this.asientocontablecajachicasEliminados;
	}

	public void setAsientoContableCajaChicasEliminados(List<AsientoContableCajaChica> asientocontablecajachicasEliminados) {
		this.asientocontablecajachicasEliminados = asientocontablecajachicasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAsientoContableCajaChica() {
		return jComboBoxTiposSeleccionarAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAsientoContableCajaChica(
			JComboBox jComboBoxTiposSeleccionarAsientoContableCajaChica) {
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica = jComboBoxTiposSeleccionarAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposSeleccionarAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAsientoContableCajaChica() {
		return jTextFieldValorCampoGeneralAsientoContableCajaChica;
	}

	public void setjTextFieldValorCampoGeneralAsientoContableCajaChica(
			JTextField jTextFieldValorCampoGeneralAsientoContableCajaChica) {
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica = jTextFieldValorCampoGeneralAsientoContableCajaChica;
	}

	public void setBorderResaltarValorCampoGeneralAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionarTodosAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionarTodosAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionarTodosAsientoContableCajaChica) {
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica = jCheckBoxSeleccionarTodosAsientoContableCajaChica;
	}

	public void setBorderResaltarSeleccionarTodosAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAsientoContableCajaChica() {
		return this.jCheckBoxSeleccionadosAsientoContableCajaChica;
	}

	public void setjCheckBoxSeleccionadosAsientoContableCajaChica(
			JCheckBox jCheckBoxSeleccionadosAsientoContableCajaChica) {
		this.jCheckBoxSeleccionadosAsientoContableCajaChica = jCheckBoxSeleccionadosAsientoContableCajaChica;
	}
	
	public void setBorderResaltarSeleccionadosAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAsientoContableCajaChica() {
		return this.jComboBoxTiposArchivosReportesAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAsientoContableCajaChica(
			JComboBox jComboBoxTiposArchivosReportesAsientoContableCajaChica) {
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica = jComboBoxTiposArchivosReportesAsientoContableCajaChica;
	}

	public void setBorderResaltarTiposArchivosReportesAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAsientoContableCajaChica() {
		return this.jComboBoxTiposReportesAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAsientoContableCajaChica(
			JComboBox jComboBoxTiposReportesAsientoContableCajaChica) {
		this.jComboBoxTiposReportesAsientoContableCajaChica = jComboBoxTiposReportesAsientoContableCajaChica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAsientoContableCajaChica() {
	//	return jComboBoxTiposReportesDinamicoAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposReportesDinamicoAsientoContableCajaChica) {
	//	this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica = jComboBoxTiposReportesDinamicoAsientoContableCajaChica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica() {
	//	return jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica = jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica;
	//}
	
	public void setBorderResaltarTiposReportesAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAsientoContableCajaChica() {
		return this.jComboBoxTiposGraficosReportesAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAsientoContableCajaChica(
			JComboBox jComboBoxTiposGraficosReportesAsientoContableCajaChica) {
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica = jComboBoxTiposGraficosReportesAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposGraficosReportesAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAsientoContableCajaChica() {
		return this.jComboBoxTiposPaginacionAsientoContableCajaChica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAsientoContableCajaChica(
			JComboBox jComboBoxTiposPaginacionAsientoContableCajaChica) {
		this.jComboBoxTiposPaginacionAsientoContableCajaChica = jComboBoxTiposPaginacionAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposPaginacionAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAsientoContableCajaChica() {
		return this.jComboBoxTiposRelacionesAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesAsientoContableCajaChica = jComboBoxTiposRelacionesAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesAsientoContableCajaChica = jComboBoxTiposAccionesAsientoContableCajaChica;
	}
	
	public void setBorderResaltarTiposRelacionesAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAsientoContableCajaChica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAsientoContableCajaChica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAsientoContableCajaChica() {
	//	return jCheckBoxConGraficoDinamicoAsientoContableCajaChica;
	//}

	//public void setjCheckBoxConGraficoDinamicoAsientoContableCajaChica(
	//		JCheckBox jCheckBoxConGraficoDinamicoAsientoContableCajaChica) {
	//	this.jCheckBoxConGraficoDinamicoAsientoContableCajaChica = jCheckBoxConGraficoDinamicoAsientoContableCajaChica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAsientoContableCajaChica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAsientoContableCajaChica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAsientoContableCajaChica .setBorder(borderResaltar);		
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
		this.asientocontablecajachicaSessionBean=new AsientoContableCajaChicaSessionBean();
		
		this.asientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
		
		AsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAsientoContableCajaChica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"nuevo","nuevo","Nuevo"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"duplicar","duplicar","Duplicar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"copiar","copiar","Copiar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"ver_form","ver_form","Ver"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"recargar","recargar","Recargar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAsientoContableCajaChica,this.jTtoolBarAsientoContableCajaChica,
							"cerrar","cerrar","Salir"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAsientoContableCajaChica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAsientoContableCajaChica;
			
				this.jButtonProcesarInformacionToolBarAsientoContableCajaChica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAsientoContableCajaChica;
				
		//protected JButton jButtonModificarToolBarAsientoContableCajaChica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAsientoContableCajaChica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAsientoContableCajaChica=new JMenuMe("General");
		this.jmenuArchivoAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuAccionesAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDatosAsientoContableCajaChica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAsientoContableCajaChica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAsientoContableCajaChica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAsientoContableCajaChica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAsientoContableCajaChica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAsientoContableCajaChica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAsientoContableCajaChica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAsientoContableCajaChica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAsientoContableCajaChica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAsientoContableCajaChica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAsientoContableCajaChica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAsientoContableCajaChica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAsientoContableCajaChica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAsientoContableCajaChica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAsientoContableCajaChica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAsientoContableCajaChica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAsientoContableCajaChica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAsientoContableCajaChica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAsientoContableCajaChica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAsientoContableCajaChica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAsientoContableCajaChica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAsientoContableCajaChica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAsientoContableCajaChica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAsientoContableCajaChica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAsientoContableCajaChica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAsientoContableCajaChica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAsientoContableCajaChica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAsientoContableCajaChica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAsientoContableCajaChica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAsientoContableCajaChica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAsientoContableCajaChica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAsientoContableCajaChica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAsientoContableCajaChica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAsientoContableCajaChica.add(this.jMenuItemCerrarAsientoContableCajaChica);
			
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemNuevoAsientoContableCajaChica);
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemNuevoGuardarCambiosAsientoContableCajaChica);
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemNuevoRelacionesAsientoContableCajaChica);
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosTablaAsientoContableCajaChica);		
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemDuplicarAsientoContableCajaChica);		
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemCopiarAsientoContableCajaChica);		
			this.jmenuAccionesAsientoContableCajaChica.add(this.jMenuItemVerFormAsientoContableCajaChica);		
			
			this.jmenuDatosAsientoContableCajaChica.add(this.jMenuItemRecargarInformacionAsientoContableCajaChica);				
			this.jmenuDatosAsientoContableCajaChica.add(this.jMenuItemAnterioresAsientoContableCajaChica);				
			this.jmenuDatosAsientoContableCajaChica.add(this.jMenuItemSiguientesAsientoContableCajaChica);				
			this.jmenuDatosAsientoContableCajaChica.add(this.jMenuItemAbrirOrderByAsientoContableCajaChica);				
			this.jmenuDatosAsientoContableCajaChica.add(this.jMenuItemMostrarOcultarAsientoContableCajaChica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAsientoContableCajaChica.add(this.jmenuArchivoAsientoContableCajaChica);		
			this.jmenuBarAsientoContableCajaChica.add(this.jmenuAccionesAsientoContableCajaChica);		
			this.jmenuBarAsientoContableCajaChica.add(this.jmenuDatosAsientoContableCajaChica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAsientoContableCajaChica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAsientoContableCajaChica() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAsientoContableCajaChica.setToolTipText("Buscar Por Cliente/Prove ");
		this.jButtonFK_IdClienteAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdClienteAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdClienteAsientoContableCajaChica.setToolTipText("Buscar Por Cliente/Prove ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAsientoContableCajaChica,"buscar_button","Buscar Por Cliente/Prove ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica = new JLabelMe();
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica.setText("Cliente/Prove :");
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica.setToolTipText("Cliente/Prove");
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdEmpleadoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAsientoContableCajaChica.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdEmpleadoAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdEmpleadoAsientoContableCajaChica.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAsientoContableCajaChica,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica.setFocusable(false);

		this.jPanelFK_IdTipoDocumentoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoAsientoContableCajaChica.setToolTipText("Buscar Por T Documento ");
		this.jButtonFK_IdTipoDocumentoAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoAsientoContableCajaChica.setToolTipText("Buscar Por T Documento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoAsientoContableCajaChica,"buscar_button","Buscar Por T Documento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setText("T Documento :");
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setToolTipText("T Documento");
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica.setToolTipText("Buscar Por Movimiento Modulo ");
		this.jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica.setToolTipText("Buscar Por Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica,"buscar_button","Buscar Por Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setText("Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setToolTipText("Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Transaccion ");
		this.jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica.setToolTipText("Buscar Por Tipo Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica,"buscar_button","Buscar Por Tipo Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setText("Tipo Transaccion :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setToolTipText("Tipo Transaccion");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionAsientoContableCajaChica.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTransaccionAsientoContableCajaChica= new JButtonMe();
		this.jButtonFK_IdTransaccionAsientoContableCajaChica.setText("Buscar");
		this.jButtonFK_IdTransaccionAsientoContableCajaChica.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionAsientoContableCajaChica,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica.setText("Tipo :");
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica.setToolTipText("Tipo");
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAsientoContableCajaChica=new JTabbedPane();


		this.jTabbedPaneBusquedasAsientoContableCajaChica.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsientoContableCajaChica.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsientoContableCajaChica.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleAsientoContableCajaChica = new AsientoContableCajaChicaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asiento Contable Caja Chica DATOS");
			this.jInternalFrameDetalleFormAsientoContableCajaChica = new AsientoContableCajaChicaDetalleFormJInternalFrame(jDesktopPane,this.asientocontablecajachicaSessionBean.getConGuardarRelaciones(),this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAsientoContableCajaChica = null;//new AsientoContableCajaChicaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsientoContableCajaChica= new GridBagLayout();
		
		
		this.jTableDatosAsientoContableCajaChica = new JTableMe();      
		
		String sToolTipAsientoContableCajaChica="";
		sToolTipAsientoContableCajaChica=AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsientoContableCajaChica+="(Contabilidad.AsientoContableCajaChica)";
		}
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAsientoContableCajaChica.setToolTipText(sToolTipAsientoContableCajaChica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAsientoContableCajaChica);
		this.jTableDatosAsientoContableCajaChica.setAutoCreateRowSorter(true);
		this.jTableDatosAsientoContableCajaChica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAsientoContableCajaChica.setRowSelectionAllowed(true);
		this.jTableDatosAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAsientoContableCajaChica = new JButtonMe();
		this.jButtonDuplicarAsientoContableCajaChica = new JButtonMe();
		this.jButtonCopiarAsientoContableCajaChica = new JButtonMe();
		this.jButtonVerFormAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoRelacionesAsientoContableCajaChica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosGeneralAsientoContableCajaChica = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asiento Contable Caja Chica";
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesAsientoContableCajaChica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAsientoContableCajaChica=new ReporteDinamicoJInternalFrame(AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAsientoContableCajaChica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAsientoContableCajaChica=new ImportacionJInternalFrame(AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAsientoContableCajaChica();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAsientoContableCajaChica = new JButtonMe();
		
		this.jButtonAbrirOrderByAsientoContableCajaChica.setText("Orden");
		this.jButtonAbrirOrderByAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsientoContableCajaChica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsientoContableCajaChica,false,this);
			
			//this.cargarOrderByAsientoContableCajaChica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsientoContableCajaChica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsientoContableCajaChica,true,this);
			
			//this.cargarOrderByAsientoContableCajaChica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosAsientoContableCajaChica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsientoContableCajaChica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsientoContableCajaChica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAsientoContableCajaChica.setText("Nuevo");
		this.jButtonDuplicarAsientoContableCajaChica.setText("Duplicar");
		this.jButtonCopiarAsientoContableCajaChica.setText("Copiar");
		this.jButtonVerFormAsientoContableCajaChica.setText("Ver");
		this.jButtonNuevoRelacionesAsientoContableCajaChica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsientoContableCajaChica,"nuevo_button","Nuevo",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAsientoContableCajaChica,"duplicar_button","Duplicar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAsientoContableCajaChica,"copiar_button","Copiar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAsientoContableCajaChica,"ver_form","Ver",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAsientoContableCajaChica,"nuevorelaciones_button","Nuevo Rel",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsientoContableCajaChica,"cerrar_button","Salir",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAsientoContableCajaChica.setToolTipText("Nuevo"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAsientoContableCajaChica.setToolTipText("Duplicar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAsientoContableCajaChica.setToolTipText("Copiar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAsientoContableCajaChica.setToolTipText("Ver"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAsientoContableCajaChica.setToolTipText("Nuevo Rel"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.setToolTipText("Guardar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsientoContableCajaChica.setToolTipText("Salir"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsientoContableCajaChica"));
		
		//DUPLICAR
		sMapKey = "DuplicarAsientoContableCajaChica";
		inputMap = this.jButtonDuplicarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAsientoContableCajaChica"));
		
		//COPIAR
		sMapKey = "CopiarAsientoContableCajaChica";
		inputMap = this.jButtonCopiarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAsientoContableCajaChica"));
		
		//VEr FORM
		sMapKey = "VerFormAsientoContableCajaChica";
		inputMap = this.jButtonVerFormAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAsientoContableCajaChica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAsientoContableCajaChica";
		inputMap = this.jButtonNuevoRelacionesAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAsientoContableCajaChica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAsientoContableCajaChica";
		inputMap = this.jButtonModificarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAsientoContableCajaChica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAsientoContableCajaChica";
		inputMap = this.jButtonCerrarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsientoContableCajaChica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAsientoContableCajaChica.setName("jPanelParametrosReportesAsientoContableCajaChica"); 
		
		this.jPanelParametrosReportesAccionesAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAsientoContableCajaChica.setName("jPanelParametrosReportesAccionesAsientoContableCajaChica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAsientoContableCajaChica = new JButtonMe();
		this.jButtonRecargarInformacionAsientoContableCajaChica.setText("Recargar");
		this.jButtonRecargarInformacionAsientoContableCajaChica.setToolTipText("Recargar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAsientoContableCajaChica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAsientoContableCajaChica = new JButtonMe();
		this.jButtonProcesarInformacionAsientoContableCajaChica.setText("Procesar");
		this.jButtonProcesarInformacionAsientoContableCajaChica.setToolTipText("Procesar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAsientoContableCajaChica.setVisible(false);
			
		this.jButtonProcesarInformacionAsientoContableCajaChica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsientoContableCajaChica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsientoContableCajaChica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposReportesAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAsientoContableCajaChica.setText("Paginacion");
		this.jComboBoxTiposPaginacionAsientoContableCajaChica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposRelacionesAsientoContableCajaChica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsientoContableCajaChica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAsientoContableCajaChica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAsientoContableCajaChica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica.setText("Graf.");
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAsientoContableCajaChica = new JButtonMe();
		//this.jButtonAnterioresAsientoContableCajaChica.setText("<<");
        this.jButtonAnterioresAsientoContableCajaChica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAsientoContableCajaChica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAsientoContableCajaChica = new JButtonMe();
		//this.jButtonSiguientesAsientoContableCajaChica.setText(">>");
        this.jButtonSiguientesAsientoContableCajaChica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAsientoContableCajaChica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAsientoContableCajaChica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAsientoContableCajaChica.setText("Nue");
        this.jButtonNuevoGuardarCambiosAsientoContableCajaChica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAsientoContableCajaChica,"nuevoguardarcambios_button","Nue",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAsientoContableCajaChica";
		inputMap = this.jButtonNuevoGuardarCambiosAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAsientoContableCajaChica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAsientoContableCajaChica";
		inputMap = this.jButtonRecargarInformacionAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAsientoContableCajaChica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAsientoContableCajaChica";
		inputMap = this.jButtonSiguientesAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAsientoContableCajaChica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAsientoContableCajaChica";
		inputMap = this.jButtonAnterioresAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAsientoContableCajaChica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAsientoContableCajaChica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAsientoContableCajaChica.setMinimumSize(new Dimension(this.getWidth(),AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsientoContableCajaChica.setMaximumSize(new Dimension(this.getWidth(),AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsientoContableCajaChica.setPreferredSize(new Dimension(this.getWidth(),AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsientoContableCajaChicaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAsientoContableCajaChica = new GridBagLayout();

			this.jPanelPaginacionAsientoContableCajaChica.setLayout(gridaBagLayoutPaginacionAsientoContableCajaChica);						
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonAnterioresAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					
						
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;//
			
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonNuevoGuardarCambiosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
						
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonSiguientesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;//
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonNuevoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;
				this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonNuevoRelacionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			}
			
			
			if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
				this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;//
				this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonGuardarCambiosTablaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
			}
			
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;//
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonDuplicarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;//
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonCopiarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
		
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();//
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;//
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonVerFormAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);//
		
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 1;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAsientoContableCajaChica.add(this.jButtonCerrarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
		
		
		this.jButtonRecargarInformacionAsientoContableCajaChica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsientoContableCajaChica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsientoContableCajaChica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsientoContableCajaChica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAsientoContableCajaChica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsientoContableCajaChica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsientoContableCajaChica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsientoContableCajaChica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAsientoContableCajaChica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsientoContableCajaChica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsientoContableCajaChica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAsientoContableCajaChica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AsientoContableCajaChica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AsientoContableCajaChica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAsientoContableCajaChica.setLayout(gridaBagParametrosReportesAsientoContableCajaChica);
			this.jPanelParametrosReportesAccionesAsientoContableCajaChica.setLayout(gridaBagParametrosReportesAccionesAsientoContableCajaChica);
			
			
			this.jPanelParametrosAuxiliar1AsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar1AsientoContableCajaChica);
			this.jPanelParametrosAuxiliar2AsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2AsientoContableCajaChica);
			this.jPanelParametrosAuxiliar3AsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar3AsientoContableCajaChica);
			this.jPanelParametrosAuxiliar4AsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar4AsientoContableCajaChica);
			//this.jPanelParametrosAuxiliar5AsientoContableCajaChica.setLayout(gridaBagParametrosAuxiliar2AsientoContableCajaChica);			
			
			
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jButtonRecargarInformacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContableCajaChica.add(this.jComboBoxTiposPaginacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContableCajaChica.add(this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar1AsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AsientoContableCajaChica.add(this.jComboBoxTiposReportesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar4AsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jComboBoxTiposReportesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jCheckBoxGenerarReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar2AsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jLabelAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jButtonAbrirOrderByAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jComboBoxTiposSeleccionarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			
			
			/*
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsientoContableCajaChica.add(this.jCheckBoxSeleccionarTodosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);															
				
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsientoContableCajaChica.add(this.jCheckBoxSeleccionadosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jPanelParametrosAuxiliar3AsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jComboBoxTiposRelacionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
				
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jComboBoxTiposAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
	
				
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsientoContableCajaChica.add(this.jTextFieldValorCampoGeneralAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAsientoContableCajaChica = new GridBagLayout();

			this.jScrollPanelDatosAsientoContableCajaChica.setLayout(gridaBagLayoutDatosAsientoContableCajaChica);
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
			
			this.jScrollPanelDatosAsientoContableCajaChica.add(this.jTableDatosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAsientoContableCajaChica.setViewportView(this.jTableDatosAsientoContableCajaChica);
		this.jTableDatosAsientoContableCajaChica.setFillsViewportHeight(true);
		this.jTableDatosAsientoContableCajaChica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesAsientoContableCajaChica);
		
		
		/*	
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
			
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonNuevoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdClienteAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdClienteAsientoContableCajaChica.add(jLabelid_clienteFK_IdClienteAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdClienteAsientoContableCajaChica.add(jComboBoxid_clienteFK_IdClienteAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);


		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdClienteAsientoContableCajaChica.add(this.jButtonBuscarFK_IdClienteid_clienteAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdClienteAsientoContableCajaChica.add(jButtonFK_IdClienteAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("1.-Por Cliente/Prove ", jPanelFK_IdClienteAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdEmpleadoAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdEmpleadoAsientoContableCajaChica.add(jLabelid_empleadoFK_IdEmpleadoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdEmpleadoAsientoContableCajaChica.add(jComboBoxid_empleadoFK_IdEmpleadoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);


		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdEmpleadoAsientoContableCajaChica.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdEmpleadoAsientoContableCajaChica.add(jButtonFK_IdEmpleadoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoDocumentoAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoDocumentoAsientoContableCajaChica.add(jLabelid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoDocumentoAsientoContableCajaChica.add(jComboBoxid_tipo_documentoFK_IdTipoDocumentoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoDocumentoAsientoContableCajaChica.add(jButtonFK_IdTipoDocumentoAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("3.-Por T Documento ", jPanelFK_IdTipoDocumentoAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoMovimientoModuloAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica.add(jLabelid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica.add(jComboBoxid_tipo_movimiento_moduloFK_IdTipoMovimientoModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica.add(jButtonFK_IdTipoMovimientoModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("4.-Por Movimiento Modulo ", jPanelFK_IdTipoMovimientoModuloAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica.add(jButtonFK_IdTipoTransaccionModuloAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("5.-Por Tipo Transaccion ", jPanelFK_IdTipoTransaccionModuloAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionAsientoContableCajaChica.setLayout(gridaBagLayoutFK_IdTransaccionAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		jPanelFK_IdTransaccionAsientoContableCajaChica.add(jLabelid_transaccionFK_IdTransaccionAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		gridBagConstraintsAsientoContableCajaChica.gridx = 1;
		jPanelFK_IdTransaccionAsientoContableCajaChica.add(jComboBoxid_transaccionFK_IdTransaccionAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsientoContableCajaChica.gridy = 1;
		gridBagConstraintsAsientoContableCajaChica.gridx =1;
		jPanelFK_IdTransaccionAsientoContableCajaChica.add(jButtonFK_IdTransaccionAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);

		jTabbedPaneBusquedasAsientoContableCajaChica.addTab("6.-Por Tipo ", jPanelFK_IdTransaccionAsientoContableCajaChica);
		jTabbedPaneBusquedasAsientoContableCajaChica.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsientoContableCajaChica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsientoContableCajaChica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;		
		//this.gridBagConstraintsAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAsientoContableCajaChica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;		
			this.gridBagConstraintsAsientoContableCajaChica.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAsientoContableCajaChica.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);								
		
		
		/*
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		*/		
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
				
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAsientoContableCajaChica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsientoContableCajaChica = new GridBagLayout();
			this.jPanelBusquedasParametrosAsientoContableCajaChica.setLayout(gridaBagLayoutBusquedasParametrosAsientoContableCajaChica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAsientoContableCajaChica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAsientoContableCajaChica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAsientoContableCajaChica.setName("jPanelReporteDinamicoAsientoContableCajaChica"); 
		
		this.jPanelReporteDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAsientoContableCajaChica.setLayout(gridaBagLayoutReporteDinamicoAsientoContableCajaChica);
		
		
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAsientoContableCajaChica = new JLabelMe();

		this.jLabelColumnasSelectReporteAsientoContableCajaChica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jLabelColumnasSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAsientoContableCajaChica = new JList<Reporte>();
		this.jListColumnasSelectReporteAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAsientoContableCajaChica=new JScrollPane(this.jListColumnasSelectReporteAsientoContableCajaChica);
			
			this.jScrollColumnasSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jListColumnasSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jScrollColumnasSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAsientoContableCajaChica = new JLabelMe();

		this.jLabelRelacionesSelectReporteAsientoContableCajaChica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jLabelRelacionesSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAsientoContableCajaChica = new JList<Reporte>();
		this.jListRelacionesSelectReporteAsientoContableCajaChica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAsientoContableCajaChica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAsientoContableCajaChica=new JScrollPane(this.jListRelacionesSelectReporteAsientoContableCajaChica);
			
			this.jScrollRelacionesSelectReporteAsientoContableCajaChica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsientoContableCajaChica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsientoContableCajaChica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jListRelacionesSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jScrollRelacionesSelectReporteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAsientoContableCajaChica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAsientoContableCajaChica = new JComboBoxMe();
		this.jListColumnasValoresGraficoAsientoContableCajaChica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jLabelGenerarExcelReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica.setToolTipText("Generar EXCEL"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jButtonGenerarExcelReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jComboBoxTiposReportesDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jLabelTiposArchivoReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jComboBoxTiposArchivosReportesDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAsientoContableCajaChica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAsientoContableCajaChica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAsientoContableCajaChica.setToolTipText("Generar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jButtonGenerarReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAsientoContableCajaChica.setToolTipText("Cancelar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsientoContableCajaChica.add(this.jButtonCerrarReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica= new JScrollPane(jPanelReporteDinamicoAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAsientoContableCajaChica);
		this.jInternalFrameReporteDinamicoAsientoContableCajaChica.getContentPane().add(this.jScrollPanelReporteDinamicoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAsientoContableCajaChica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAsientoContableCajaChica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAsientoContableCajaChica.setName("jPanelImportacionAsientoContableCajaChica"); 
		
		this.jPanelImportacionAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAsientoContableCajaChica.setLayout(gridaBagLayoutImportacionAsientoContableCajaChica);
		
		
		this.jInternalFrameImportacionAsientoContableCajaChica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAsientoContableCajaChica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAsientoContableCajaChica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsientoContableCajaChica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsientoContableCajaChica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsientoContableCajaChica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAsientoContableCajaChica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsientoContableCajaChica.setResizable(true);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setClosable(true);
	    this.jInternalFrameImportacionAsientoContableCajaChica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAsientoContableCajaChica = new JLabelMe();

		this.jLabelArchivoImportacionAsientoContableCajaChica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsientoContableCajaChica.add(this.jLabelArchivoImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAsientoContableCajaChica = new JFileChooser();		
		this.jFileChooserImportacionAsientoContableCajaChica.setToolTipText("ESCOGER ARCHIVO"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAsientoContableCajaChica = new JButtonMe();
		this.jButtonAbrirImportacionAsientoContableCajaChica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAsientoContableCajaChica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAsientoContableCajaChica.setToolTipText("Generar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContableCajaChica.add(this.jButtonAbrirImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAsientoContableCajaChica = new JLabelMe();

		this.jLabelPathArchivoImportacionAsientoContableCajaChica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsientoContableCajaChica.add(this.jLabelPathArchivoImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAsientoContableCajaChica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAsientoContableCajaChica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsientoContableCajaChica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsientoContableCajaChica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContableCajaChica.add(this.jTextFieldPathArchivoImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAsientoContableCajaChica = new JButtonMe();
		this.jButtonGenerarImportacionAsientoContableCajaChica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAsientoContableCajaChica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAsientoContableCajaChica.setToolTipText("Generar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContableCajaChica.add(this.jButtonGenerarImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarImportacionAsientoContableCajaChica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAsientoContableCajaChica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAsientoContableCajaChica.setToolTipText("Cancelar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsientoContableCajaChica.add(this.jButtonCerrarImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAsientoContableCajaChica = new GridBagLayout();
		
		this.jScrollPanelImportacionAsientoContableCajaChica= new JScrollPane(jPanelImportacionAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iPosYImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXImportacion;
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAsientoContableCajaChica);
		this.jInternalFrameImportacionAsientoContableCajaChica.getContentPane().add(this.jScrollPanelImportacionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAsientoContableCajaChica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAsientoContableCajaChica = new JButtonMe();
			this.jButtonAbrirOrderByAsientoContableCajaChica.setText("Orden");
			this.jButtonAbrirOrderByAsientoContableCajaChica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsientoContableCajaChica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAsientoContableCajaChica";
			inputMap = this.jButtonAbrirOrderByAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAsientoContableCajaChica"));
		
		
			GridBagLayout gridaBagLayoutOrderByAsientoContableCajaChica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAsientoContableCajaChica.setName("jPanelOrderByAsientoContableCajaChica"); 
			
			this.jPanelOrderByAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAsientoContableCajaChica.setLayout(gridaBagLayoutOrderByAsientoContableCajaChica);
			
			
			this.jTableDatosAsientoContableCajaChicaOrderBy = new JTableMe();        
			this.jTableDatosAsientoContableCajaChicaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAsientoContableCajaChicaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAsientoContableCajaChicaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAsientoContableCajaChicaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAsientoContableCajaChicaOrderBy.setViewportView(this.jTableDatosAsientoContableCajaChicaOrderBy);
			this.jTableDatosAsientoContableCajaChicaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAsientoContableCajaChicaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAsientoContableCajaChica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAsientoContableCajaChica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAsientoContableCajaChica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAsientoContableCajaChica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAsientoContableCajaChica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAsientoContableCajaChica.setTitle("Orden");
			this.jInternalFrameOrderByAsientoContableCajaChica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAsientoContableCajaChica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAsientoContableCajaChica.setResizable(true);
			this.jInternalFrameOrderByAsientoContableCajaChica.setClosable(true);
			this.jInternalFrameOrderByAsientoContableCajaChica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAsientoContableCajaChica.ipady =150;
				
			this.jPanelOrderByAsientoContableCajaChica.add(jScrollPanelDatosAsientoContableCajaChicaOrderBy, this.gridBagConstraintsAsientoContableCajaChica);//this.jTableDatosAsientoContableCajaChicaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAsientoContableCajaChica = new JButtonMe();
			this.jButtonCerrarOrderByAsientoContableCajaChica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAsientoContableCajaChica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAsientoContableCajaChica.setToolTipText("Cancelar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAsientoContableCajaChica.add(this.jButtonCerrarOrderByAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAsientoContableCajaChica = new GridBagLayout();
			
			this.jScrollPanelOrderByAsientoContableCajaChica= new JScrollPane(jPanelOrderByAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iPosYOrderBy;
			this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAsientoContableCajaChica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAsientoContableCajaChica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAsientoContableCajaChica);
			
			this.jInternalFrameOrderByAsientoContableCajaChica.getContentPane().add(this.jScrollPanelOrderByAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
		
		} else {
			this.jButtonAbrirOrderByAsientoContableCajaChica = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.asientocontablecajachicaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAsientoContableCajaChica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAsientoContableCajaChica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAsientoContableCajaChica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAsientoContableCajaChica.getRowHeight();//AsientoContableCajaChicaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.isSelected()) {
					iHeightTable=AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsientoContableCajaChica.isSelected()) {
					iHeightTable=AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsientoContableCajaChicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAsientoContableCajaChica!=null && this.jInternalFrameOrderByAsientoContableCajaChica.getjTableDatosOrderBy()!=null) {
			//if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAsientoContableCajaChica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAsientoContableCajaChica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAsientoContableCajaChica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAsientoContableCajaChica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAsientoContableCajaChica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=asientocontablecajachicaLogic.getAsientoContableCajaChicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asientocontablecajachicas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<AsientoContableCajaChica> TraerAsientoContableCajaChicaBeans(List<AsientoContableCajaChica> asientocontablecajachicas,ArrayList<Classe> classes)throws Exception {
		try {
			for(AsientoContableCajaChica asientocontablecajachica:asientocontablecajachicas) {
					
				if(!(AsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AsientoContableCajaChicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					asientocontablecajachica.setsDetalleGeneralEntityReporte(AsientoContableCajaChicaConstantesFunciones.getAsientoContableCajaChicaDescripcion(asientocontablecajachica));
										
					asientocontablecajachica.setes_proveedor_descripcion(AsientoContableCajaChicaConstantesFunciones.getes_proveedorDescripcion(asientocontablecajachica));	
					
					

					if(asientocontablecajachica.getDetalleAsientoContableCajaChicas()!=null && Funciones.existeClass(classes,DetalleAsientoContableCajaChica.class)) {
						try{asientocontablecajachica.setdetalleasientocontablecajachicasDescripcionReporte(new JRBeanCollectionDataSource(DetalleAsientoContableCajaChicaJInternalFrame.TraerDetalleAsientoContableCajaChicaBeans(asientocontablecajachica.getDetalleAsientoContableCajaChicas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//asientocontablecajachica.setsDetalleGeneralEntityReporte(asientocontablecajachica.getsDetalleGeneralEntityReporte());
										
				}
				
				//asientocontablecajachicabeans.add(asientocontablecajachicabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return asientocontablecajachicas;
    }
	//PARA REPORTES FIN
}
