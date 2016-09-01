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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ProformaJInternalFrame extends ProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProforma;
	
	protected JMenuBar jmenuBarProforma;
	
	protected JMenu jmenuProforma;
	protected JMenu jmenuDatosProforma;
	protected JMenu jmenuArchivoProforma;
	protected JMenu jmenuAccionesProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProforma;	
	protected GridBagConstraints gridBagConstraintsProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProformaDetalleFormJInternalFrame jInternalFrameDetalleFormProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EstadoProformaBeanSwingJInternalFrame estadoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoproforma="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoProformaBeanSwingJInternalFrame tipoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproforma="";

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public ProformaSessionBean proformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EstadoProformaSessionBean estadoproformaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoProformaSessionBean tipoproformaSessionBean;
	public ConsignatarioSessionBean consignatarioSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Proforma> proformas;		
	public List<Proforma> proformasEliminados;	
	public List<Proforma> proformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProforma;		
	protected JButton jButtonAbrirOrderByProforma;
	
	
	//protected JPanel jPanelOrderByProforma;
	//public JScrollPane jScrollPanelOrderByProforma;	
	//protected JButton jButtonCerrarOrderByProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProformaLogic proformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProforma;
	public JScrollPane jScrollPanelDatosEdicionProforma;
	public JScrollPane jScrollPanelDatosGeneralProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProforma;
	//public JScrollPane jScrollPanelImportacionProforma;
	
	
	
	protected JPanel jPanelAccionesProforma;
	
    protected JPanel jPanelPaginacionProforma;
    protected JPanel jPanelParametrosReportesProforma;
	protected JPanel jPanelParametrosReportesAccionesProforma;
	
	
	
	
	
	

	protected JPanel jPanelCamposFindatos_valoresProforma;
	protected Integer iXPanelCamposFindatos_valoresProforma=0;
	protected Integer iYPanelCamposFindatos_valoresProforma=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Proforma;
	protected JPanel jPanelParametrosAuxiliar2Proforma;
	protected JPanel jPanelParametrosAuxiliar3Proforma;
	protected JPanel jPanelParametrosAuxiliar4Proforma;
	//protected JPanel jPanelParametrosAuxiliar5Proforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoProforma;
	//protected JPanel jPanelImportacionProforma;
	
	
	public JTable jTableDatosProforma;
	
	
	
	//public JTable jTableDatosProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProforma;
	protected JButton jButtonDuplicarProforma;
	protected JButton jButtonCopiarProforma;
	protected JButton jButtonVerFormProforma;
	protected JButton jButtonNuevoRelacionesProforma;
	protected JButton jButtonModificarProforma;
	
    protected JButton jButtonGuardarCambiosTablaProforma;
	protected JButton jButtonCerrarProforma;
	
	
	protected JButton jButtonRecargarInformacionProforma;
	protected JButton jButtonProcesarInformacionProforma;
	
	
	protected JButton jButtonAnterioresProforma;
	protected JButton jButtonSiguientesProforma;
	protected JButton jButtonNuevoGuardarCambiosProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProforma;
	//protected JButton jButtonCerrarReporteDinamicoProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionProforma;
	//protected JButton jButtonGenerarImportacionProforma;
	//protected JButton jButtonCerrarImportacionProforma;
	//protected JFileChooser jFileChooserImportacionProforma;
	//protected File fileImportacionProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProforma;
	protected JButton jButtonDuplicarToolBarProforma;
	protected JButton jButtonNuevoRelacionesToolBarProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarProforma;
	protected JButton jButtonCopiarToolBarProforma;
	protected JButton jButtonVerFormToolBarProforma;
	public JButton jButtonGuardarCambiosTablaToolBarProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarProforma;
	protected JButton jButtonCerrarToolBarProforma;
	
	protected JButton jButtonRecargarInformacionToolBarProforma;
	protected JButton jButtonProcesarInformacionToolBarProforma;
	protected JButton jButtonAnterioresToolBarProforma;
	protected JButton jButtonSiguientesToolBarProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarProforma;
	protected JButton jButtonAbrirOrderByToolBarProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProforma;
	protected JMenuItem jMenuItemDuplicarProforma;
	protected JMenuItem jMenuItemNuevoRelacionesProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProforma;
	protected JMenuItem jMenuItemCopiarProforma;
	protected JMenuItem jMenuItemVerFormProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProforma;
	protected JMenuItem jMenuItemCerrarProforma;
	protected JMenuItem jMenuItemDetalleCerrarProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionProforma;
	protected JMenuItem jMenuItemProcesarInformacionProforma;
	protected JMenuItem jMenuItemAnterioresProforma;
	protected JMenuItem jMenuItemSiguientesProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProforma;
	protected JMenuItem jMenuItemAbrirOrderByProforma;
	protected JMenuItem jMenuItemMostrarOcultarProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProforma;
	protected JCheckBox jCheckBoxSeleccionadosProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProforma;
	protected JCheckBox jCheckBoxConGraficoReporteProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProforma;
	protected JTextField jTextFieldValorCampoGeneralProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProforma;
	//public JList<Reporte> jListColumnasSelectReporteProforma;
	//public JScrollPane jScrollColumnasSelectReporteProforma;
	
	//public JLabel jLabelRelacionesSelectReporteProforma;
	//public JList<Reporte> jListRelacionesSelectReporteProforma;
	//public JScrollPane jScrollRelacionesSelectReporteProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoProforma;
	
		
	//public JLabel jLabelArchivoImportacionProforma;	
	//public JLabel jLabelPathArchivoImportacionProforma;
	//protected JTextField jTextFieldPathArchivoImportacionProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProforma;
	
	//public JLabel jLabelColumnaCategoriaValorProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProforma;
	
	//public JLabel jLabelColumnasValoresGraficoProforma;
	//public JList<Reporte> jListColumnasValoresGraficoProforma;
	//public JScrollPane jScrollColumnasValoresGraficoProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProforma;
	public JPanel jPanelFK_IdCentroCostoProforma;
	public JButton jButtonFK_IdCentroCostoProforma;
	public JPanel jPanelFK_IdClienteProforma;
	public JButton jButtonFK_IdClienteProforma;
	public JPanel jPanelFK_IdConsignatarioProforma;
	public JButton jButtonFK_IdConsignatarioProforma;
	public JPanel jPanelFK_IdEmpleadoProforma;
	public JButton jButtonFK_IdEmpleadoProforma;
	public JPanel jPanelFK_IdEstadoProformaProforma;
	public JButton jButtonFK_IdEstadoProformaProforma;
	public JPanel jPanelFK_IdFormatoProforma;
	public JButton jButtonFK_IdFormatoProforma;
	public JPanel jPanelFK_IdRutaTransporteProforma;
	public JButton jButtonFK_IdRutaTransporteProforma;
	public JPanel jPanelFK_IdSubClienteProforma;
	public JButton jButtonFK_IdSubClienteProforma;
	public JPanel jPanelFK_IdTipoCambioProforma;
	public JButton jButtonFK_IdTipoCambioProforma;
	public JPanel jPanelFK_IdTipoPrecioProforma;
	public JButton jButtonFK_IdTipoPrecioProforma;
	public JPanel jPanelFK_IdTipoProformaProforma;
	public JButton jButtonFK_IdTipoProformaProforma;
	public JPanel jPanelFK_IdTipoViaTransporteProforma;
	public JButton jButtonFK_IdTipoViaTransporteProforma;
	public JPanel jPanelFK_IdTransporteProforma;
	public JButton jButtonFK_IdTransporteProforma;
	public JPanel jPanelFK_IdVendedorProforma;
	public JButton jButtonFK_IdVendedorProforma;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoProforma;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoProforma;
	public JButton jButtonid_centro_costoFK_IdCentroCostoProforma= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProformaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProformaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProformaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoProforma;
	
	public JPanel jPanelid_clienteFK_IdClienteProforma;
	public JLabel jLabelid_clienteFK_IdClienteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteProforma;
	public JButton jButtonid_clienteFK_IdClienteProforma= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProformaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProformaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteProforma;
	
	public JPanel jPanelid_consignatarioFK_IdConsignatarioProforma;
	public JLabel jLabelid_consignatarioFK_IdConsignatarioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioFK_IdConsignatarioProforma;
	public JButton jButtonid_consignatarioFK_IdConsignatarioProforma= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioProformaUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoProforma;
	public JLabel jLabelid_empleadoFK_IdEmpleadoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoProforma;
	public JButton jButtonid_empleadoFK_IdEmpleadoProforma= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoProformaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoProforma;
	
	public JPanel jPanelid_estado_proformaFK_IdEstadoProformaProforma;
	public JLabel jLabelid_estado_proformaFK_IdEstadoProformaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_proformaFK_IdEstadoProformaProforma;
	public JButton jButtonid_estado_proformaFK_IdEstadoProformaProforma= new JButtonMe();
	public JButton jButtonid_estado_proformaFK_IdEstadoProformaProformaUpdate= new JButtonMe();
	public JButton jButtonid_estado_proformaFK_IdEstadoProformaProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoProforma;
	public JLabel jLabelid_formatoFK_IdFormatoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoProforma;
	public JButton jButtonid_formatoFK_IdFormatoProforma= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoProformaUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ruta_transporteFK_IdRutaTransporteProforma;
	public JLabel jLabelid_ruta_transporteFK_IdRutaTransporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma;
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteProforma= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransporteProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClienteProforma;
	public JLabel jLabelid_sub_clienteFK_IdSubClienteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClienteProforma;
	public JButton jButtonid_sub_clienteFK_IdSubClienteProforma= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteProformaUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioProforma;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioProforma;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioProforma= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioProformaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma;
	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioProforma;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioProforma;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioProforma= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proformaFK_IdTipoProformaProforma;
	public JLabel jLabelid_tipo_proformaFK_IdTipoProformaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proformaFK_IdTipoProformaProforma;
	public JButton jButtonid_tipo_proformaFK_IdTipoProformaProforma= new JButtonMe();
	public JButton jButtonid_tipo_proformaFK_IdTipoProformaProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proformaFK_IdTipoProformaProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransporteProforma;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteProforma= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransporteProforma;
	public JLabel jLabelid_transporteFK_IdTransporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransporteProforma;
	public JButton jButtonid_transporteFK_IdTransporteProforma= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorProforma;
	public JLabel jLabelid_vendedorFK_IdVendedorProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorProforma;
	public JButton jButtonid_vendedorFK_IdVendedorProforma= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorProformaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorProformaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorProformaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorProforma;
	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
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
	public ProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProforma)	{
		this.jButtonRecargarInformacionProforma = jButtonRecargarInformacionProforma;
	}
	
	public JButton getjButtonProcesarInformacionProforma() {
		return this.jButtonProcesarInformacionProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProforma)	{
		this.jButtonProcesarInformacionProforma = jButtonProcesarInformacionProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionProforma() {
		return this.jButtonRecargarInformacionProforma;
	}
	
	
	public List<Proforma> getproformas() {
		return this.proformas;
	}

	public void setproformas(List<Proforma> proformas) {
		this.proformas = proformas;
	}
	
	public List<Proforma> getproformasAux() {
		return this.proformasAux;
	}

	public void setproformasAux(List<Proforma> proformasAux) {
		this.proformasAux = proformasAux;
	}
	
	public List<Proforma> getproformasEliminados() {
		return this.proformasEliminados;
	}

	public void setProformasEliminados(List<Proforma> proformasEliminados) {
		this.proformasEliminados = proformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProforma() {
		return jComboBoxTiposSeleccionarProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProforma(
			JComboBox jComboBoxTiposSeleccionarProforma) {
		this.jComboBoxTiposSeleccionarProforma = jComboBoxTiposSeleccionarProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProforma() {
		return jTextFieldValorCampoGeneralProforma;
	}

	public void setjTextFieldValorCampoGeneralProforma(
			JTextField jTextFieldValorCampoGeneralProforma) {
		this.jTextFieldValorCampoGeneralProforma = jTextFieldValorCampoGeneralProforma;
	}

	public void setBorderResaltarValorCampoGeneralProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProforma() {
		return this.jCheckBoxSeleccionarTodosProforma;
	}

	public void setjCheckBoxSeleccionarTodosProforma(
			JCheckBox jCheckBoxSeleccionarTodosProforma) {
		this.jCheckBoxSeleccionarTodosProforma = jCheckBoxSeleccionarTodosProforma;
	}

	public void setBorderResaltarSeleccionarTodosProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProforma() {
		return this.jCheckBoxSeleccionadosProforma;
	}

	public void setjCheckBoxSeleccionadosProforma(
			JCheckBox jCheckBoxSeleccionadosProforma) {
		this.jCheckBoxSeleccionadosProforma = jCheckBoxSeleccionadosProforma;
	}
	
	public void setBorderResaltarSeleccionadosProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProforma() {
		return this.jComboBoxTiposArchivosReportesProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProforma(
			JComboBox jComboBoxTiposArchivosReportesProforma) {
		this.jComboBoxTiposArchivosReportesProforma = jComboBoxTiposArchivosReportesProforma;
	}

	public void setBorderResaltarTiposArchivosReportesProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProforma() {
		return this.jComboBoxTiposReportesProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProforma(
			JComboBox jComboBoxTiposReportesProforma) {
		this.jComboBoxTiposReportesProforma = jComboBoxTiposReportesProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProforma() {
	//	return jComboBoxTiposReportesDinamicoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoProforma) {
	//	this.jComboBoxTiposReportesDinamicoProforma = jComboBoxTiposReportesDinamicoProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProforma = jComboBoxTiposArchivosReportesDinamicoProforma;
	//}
	
	public void setBorderResaltarTiposReportesProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProforma() {
		return this.jComboBoxTiposGraficosReportesProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProforma(
			JComboBox jComboBoxTiposGraficosReportesProforma) {
		this.jComboBoxTiposGraficosReportesProforma = jComboBoxTiposGraficosReportesProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProforma() {
		return this.jComboBoxTiposPaginacionProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProforma(
			JComboBox jComboBoxTiposPaginacionProforma) {
		this.jComboBoxTiposPaginacionProforma = jComboBoxTiposPaginacionProforma;
	}
	
	public void setBorderResaltarTiposPaginacionProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProforma() {
		return this.jComboBoxTiposRelacionesProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProforma() {
		return this.jComboBoxTiposAccionesProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProforma(
			JComboBox jComboBoxTiposRelacionesProforma) {
		this.jComboBoxTiposRelacionesProforma = jComboBoxTiposRelacionesProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProforma(
			JComboBox jComboBoxTiposAccionesProforma) {
		this.jComboBoxTiposAccionesProforma = jComboBoxTiposAccionesProforma;
	}
	
	public void setBorderResaltarTiposRelacionesProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProforma() {
	//	return jCheckBoxConGraficoDinamicoProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoProforma) {
	//	this.jCheckBoxConGraficoDinamicoProforma = jCheckBoxConGraficoDinamicoProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProforma .setBorder(borderResaltar);		
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
		this.proformaSessionBean=new ProformaSessionBean();
		
		this.proformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.proformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.proformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 3950) {
			iWidth=3950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProforma,this.jTtoolBarProforma,
							"nuevo","nuevo","Nuevo"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProforma,this.jTtoolBarProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProforma,this.jTtoolBarProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProforma,this.jTtoolBarProforma,
							"duplicar","duplicar","Duplicar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProforma,this.jTtoolBarProforma,
							"copiar","copiar","Copiar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProforma,this.jTtoolBarProforma,
							"ver_form","ver_form","Ver"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProforma,this.jTtoolBarProforma,
							"recargar","recargar","Recargar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProforma,this.jTtoolBarProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProforma,this.jTtoolBarProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProforma,this.jTtoolBarProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProforma,this.jTtoolBarProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProforma,this.jTtoolBarProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProforma,this.jTtoolBarProforma,
							"cerrar","cerrar","Salir"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProforma;
			
				this.jButtonProcesarInformacionToolBarProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProforma;
				
		//protected JButton jButtonModificarToolBarProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProforma=new JMenuMe("General");
		this.jmenuArchivoProforma=new JMenuMe("Archivo");
		this.jmenuAccionesProforma=new JMenuMe("Acciones");
		this.jmenuDatosProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProforma.add(this.jMenuItemCerrarProforma);
			
			this.jmenuAccionesProforma.add(this.jMenuItemNuevoProforma);
			this.jmenuAccionesProforma.add(this.jMenuItemNuevoGuardarCambiosProforma);
			this.jmenuAccionesProforma.add(this.jMenuItemNuevoRelacionesProforma);
			this.jmenuAccionesProforma.add(this.jMenuItemGuardarCambiosTablaProforma);		
			this.jmenuAccionesProforma.add(this.jMenuItemDuplicarProforma);		
			this.jmenuAccionesProforma.add(this.jMenuItemCopiarProforma);		
			this.jmenuAccionesProforma.add(this.jMenuItemVerFormProforma);		
			
			this.jmenuDatosProforma.add(this.jMenuItemRecargarInformacionProforma);				
			this.jmenuDatosProforma.add(this.jMenuItemAnterioresProforma);				
			this.jmenuDatosProforma.add(this.jMenuItemSiguientesProforma);				
			this.jmenuDatosProforma.add(this.jMenuItemAbrirOrderByProforma);				
			this.jmenuDatosProforma.add(this.jMenuItemMostrarOcultarProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProforma.add(this.jMenuItemGuardarCambiosProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProforma.add(this.jmenuArchivoProforma);		
			this.jmenuBarProforma.add(this.jmenuAccionesProforma);		
			this.jmenuBarProforma.add(this.jmenuDatosProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoProforma.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoProforma= new JButtonMe();
		this.jButtonFK_IdCentroCostoProforma.setText("Buscar");
		this.jButtonFK_IdCentroCostoProforma.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoProforma,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoProforma = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoProforma.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoProforma.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoProforma= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma.setFocusable(false);

		this.jPanelFK_IdClienteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProforma.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteProforma= new JButtonMe();
		this.jButtonFK_IdClienteProforma.setText("Buscar");
		this.jButtonFK_IdClienteProforma.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProforma,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteProforma = new JLabelMe();
		jLabelid_clienteFK_IdClienteProforma.setText("Cliente :");
		jLabelid_clienteFK_IdClienteProforma.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteProforma= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteProforma= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteProforma.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProforma.setFocusable(false);

		this.jPanelFK_IdConsignatarioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsignatarioProforma.setToolTipText("Buscar Por Consignatario ");
		this.jButtonFK_IdConsignatarioProforma= new JButtonMe();
		this.jButtonFK_IdConsignatarioProforma.setText("Buscar");
		this.jButtonFK_IdConsignatarioProforma.setToolTipText("Buscar Por Consignatario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsignatarioProforma,"buscar_button","Buscar Por Consignatario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsignatarioProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consignatarioFK_IdConsignatarioProforma = new JLabelMe();
		jLabelid_consignatarioFK_IdConsignatarioProforma.setText("Consignatario :");
		jLabelid_consignatarioFK_IdConsignatarioProforma.setToolTipText("Consignatario");
		jLabelid_consignatarioFK_IdConsignatarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioFK_IdConsignatarioProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consignatarioFK_IdConsignatarioProforma= new JComboBoxMe();
		jComboBoxid_consignatarioFK_IdConsignatarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioFK_IdConsignatarioProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoProforma.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoProforma= new JButtonMe();
		this.jButtonFK_IdEmpleadoProforma.setText("Buscar");
		this.jButtonFK_IdEmpleadoProforma.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoProforma,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoProforma = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoProforma.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoProforma.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoProforma= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma.setFocusable(false);

		this.jPanelFK_IdEstadoProformaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoProformaProforma.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoProformaProforma= new JButtonMe();
		this.jButtonFK_IdEstadoProformaProforma.setText("Buscar");
		this.jButtonFK_IdEstadoProformaProforma.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoProformaProforma,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoProformaProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_proformaFK_IdEstadoProformaProforma = new JLabelMe();
		jLabelid_estado_proformaFK_IdEstadoProformaProforma.setText("Estado :");
		jLabelid_estado_proformaFK_IdEstadoProformaProforma.setToolTipText("Estado");
		jLabelid_estado_proformaFK_IdEstadoProformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_proformaFK_IdEstadoProformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_proformaFK_IdEstadoProformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_proformaFK_IdEstadoProformaProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_proformaFK_IdEstadoProformaProforma= new JComboBoxMe();
		jComboBoxid_estado_proformaFK_IdEstadoProformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_proformaFK_IdEstadoProformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_proformaFK_IdEstadoProformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_proformaFK_IdEstadoProformaProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoProforma.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoProforma= new JButtonMe();
		this.jButtonFK_IdFormatoProforma.setText("Buscar");
		this.jButtonFK_IdFormatoProforma.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoProforma,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoProforma = new JLabelMe();
		jLabelid_formatoFK_IdFormatoProforma.setText("Formato :");
		jLabelid_formatoFK_IdFormatoProforma.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoProforma= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRutaTransporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRutaTransporteProforma.setToolTipText("Buscar Por Ruta ");
		this.jButtonFK_IdRutaTransporteProforma= new JButtonMe();
		this.jButtonFK_IdRutaTransporteProforma.setText("Buscar");
		this.jButtonFK_IdRutaTransporteProforma.setToolTipText("Buscar Por Ruta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRutaTransporteProforma,"buscar_button","Buscar Por Ruta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRutaTransporteProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma = new JLabelMe();
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma.setText("Ruta :");
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma.setToolTipText("Ruta");
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ruta_transporteFK_IdRutaTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transporteFK_IdRutaTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma= new JComboBoxMe();
		jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClienteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClienteProforma.setToolTipText("Buscar Por Contacto ");
		this.jButtonFK_IdSubClienteProforma= new JButtonMe();
		this.jButtonFK_IdSubClienteProforma.setText("Buscar");
		this.jButtonFK_IdSubClienteProforma.setToolTipText("Buscar Por Contacto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClienteProforma,"buscar_button","Buscar Por Contacto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClienteProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClienteProforma = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClienteProforma.setText("Contacto :");
		jLabelid_sub_clienteFK_IdSubClienteProforma.setToolTipText("Contacto");
		jLabelid_sub_clienteFK_IdSubClienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClienteProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClienteProforma= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClienteProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioProforma.setToolTipText("Buscar Por T. Cambio ");
		this.jButtonFK_IdTipoCambioProforma= new JButtonMe();
		this.jButtonFK_IdTipoCambioProforma.setText("Buscar");
		this.jButtonFK_IdTipoCambioProforma.setToolTipText("Buscar Por T. Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioProforma,"buscar_button","Buscar Por T. Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioProforma = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioProforma.setText("T. Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioProforma.setToolTipText("T. Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioProforma= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma.setFocusable(false);

		this.jPanelFK_IdTipoPrecioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioProforma.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioProforma= new JButtonMe();
		this.jButtonFK_IdTipoPrecioProforma.setText("Buscar");
		this.jButtonFK_IdTipoPrecioProforma.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioProforma,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioProforma = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioProforma.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioProforma.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioProforma= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProformaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProformaProforma.setToolTipText("Buscar Por Tipo Proforma ");
		this.jButtonFK_IdTipoProformaProforma= new JButtonMe();
		this.jButtonFK_IdTipoProformaProforma.setText("Buscar");
		this.jButtonFK_IdTipoProformaProforma.setToolTipText("Buscar Por Tipo Proforma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProformaProforma,"buscar_button","Buscar Por Tipo Proforma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProformaProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proformaFK_IdTipoProformaProforma = new JLabelMe();
		jLabelid_tipo_proformaFK_IdTipoProformaProforma.setText("Tipo Proforma :");
		jLabelid_tipo_proformaFK_IdTipoProformaProforma.setToolTipText("Tipo Proforma");
		jLabelid_tipo_proformaFK_IdTipoProformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_proformaFK_IdTipoProformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_proformaFK_IdTipoProformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proformaFK_IdTipoProformaProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proformaFK_IdTipoProformaProforma= new JComboBoxMe();
		jComboBoxid_tipo_proformaFK_IdTipoProformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proformaFK_IdTipoProformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proformaFK_IdTipoProformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proformaFK_IdTipoProformaProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoViaTransporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransporteProforma.setToolTipText("Buscar Por Forma Envio ");
		this.jButtonFK_IdTipoViaTransporteProforma= new JButtonMe();
		this.jButtonFK_IdTipoViaTransporteProforma.setText("Buscar");
		this.jButtonFK_IdTipoViaTransporteProforma.setToolTipText("Buscar Por Forma Envio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransporteProforma,"buscar_button","Buscar Por Forma Envio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransporteProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setText("Forma Envio :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setToolTipText("Forma Envio");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransporteProforma.setToolTipText("Buscar Por Transporte ");
		this.jButtonFK_IdTransporteProforma= new JButtonMe();
		this.jButtonFK_IdTransporteProforma.setText("Buscar");
		this.jButtonFK_IdTransporteProforma.setToolTipText("Buscar Por Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransporteProforma,"buscar_button","Buscar Por Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransporteProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransporteProforma = new JLabelMe();
		jLabelid_transporteFK_IdTransporteProforma.setText("Transporte :");
		jLabelid_transporteFK_IdTransporteProforma.setToolTipText("Transporte");
		jLabelid_transporteFK_IdTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransporteProforma= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransporteProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorProforma.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorProforma= new JButtonMe();
		this.jButtonFK_IdVendedorProforma.setText("Buscar");
		this.jButtonFK_IdVendedorProforma.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorProforma,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorProforma = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorProforma.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorProforma.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorProforma= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorProforma,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorProforma= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorProforma.setFocusable(false);


		this.jTabbedPaneBusquedasProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProforma = new ProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proforma DATOS");
			this.jInternalFrameDetalleFormProforma = new ProformaDetalleFormJInternalFrame(jDesktopPane,this.proformaSessionBean.getConGuardarRelaciones(),this.proformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProforma = null;//new ProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProforma= new GridBagLayout();
		
		
		this.jTableDatosProforma = new JTableMe();      
		
		String sToolTipProforma="";
		sToolTipProforma=ProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProforma+="(Facturacion.Proforma)";
		}
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProforma.setToolTipText(sToolTipProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProforma);
		this.jTableDatosProforma.setAutoCreateRowSorter(true);
		this.jTableDatosProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProforma.setRowSelectionAllowed(true);
		this.jTableDatosProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProforma = new JButtonMe();
		this.jButtonDuplicarProforma = new JButtonMe();
		this.jButtonCopiarProforma = new JButtonMe();
		this.jButtonVerFormProforma = new JButtonMe();
		this.jButtonNuevoRelacionesProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProforma = new JButtonMe();
		this.jButtonCerrarProforma = new JButtonMe();
		
		this.jScrollPanelDatosProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFindatos_valoresProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Proforma";
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProforma.setToolTipText("Acciones");
        this.jPanelAccionesProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFindatos_valoresProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFindatos_valoresProforma.setName("jPanelCamposFindatos_valoresProforma");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFindatos_valoresProforma, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoProforma=new ReporteDinamicoJInternalFrame(ProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProforma=new ImportacionJInternalFrame(ProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByProforma.setText("Orden");
		this.jButtonAbrirOrderByProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProforma,false,this);
			
			//this.cargarOrderByProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProforma,true,this);
			
			//this.cargarOrderByProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProforma.setMinimumSize(new Dimension(400,50));//3930
		this.jTableDatosProforma.setMaximumSize(new Dimension(400,50));//3930
		this.jTableDatosProforma.setPreferredSize(new Dimension(400,50));//3930
		
		this.jScrollPanelDatosProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProforma.setText("Nuevo");
		this.jButtonDuplicarProforma.setText("Duplicar");
		this.jButtonCopiarProforma.setText("Copiar");
		this.jButtonVerFormProforma.setText("Ver");
		this.jButtonNuevoRelacionesProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProforma.setText("Guardar");
		this.jButtonCerrarProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProforma,"nuevo_button","Nuevo",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProforma,"duplicar_button","Duplicar",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProforma,"copiar_button","Copiar",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProforma,"ver_form","Ver",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProforma,"nuevorelaciones_button","Nuevo Rel",this.proformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProforma,"guardarcambiostabla_button","Guardar",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProforma,"cerrar_button","Salir",this.proformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProforma.setToolTipText("Nuevo"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProforma.setToolTipText("Duplicar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProforma.setToolTipText("Copiar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProforma.setToolTipText("Ver"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProforma.setToolTipText("Nuevo Rel"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProforma.setToolTipText("Guardar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProforma.setToolTipText("Salir"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProforma";
		inputMap = this.jButtonNuevoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarProforma";
		inputMap = this.jButtonDuplicarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProforma"));
		
		//COPIAR
		sMapKey = "CopiarProforma";
		inputMap = this.jButtonCopiarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProforma"));
		
		//VEr FORM
		sMapKey = "VerFormProforma";
		inputMap = this.jButtonVerFormProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProforma";
		inputMap = this.jButtonNuevoRelacionesProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProforma";
		inputMap = this.jButtonModificarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProforma";
		inputMap = this.jButtonCerrarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProforma";
		inputMap = this.jButtonGuardarCambiosTablaProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Proforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Proforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Proforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Proforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Proforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProforma.setName("jPanelParametrosReportesProforma"); 
		
		this.jPanelParametrosReportesAccionesProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProforma.setName("jPanelParametrosReportesAccionesProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProforma = new JButtonMe();
		this.jButtonRecargarInformacionProforma.setText("Recargar");
		this.jButtonRecargarInformacionProforma.setToolTipText("Recargar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProforma = new JButtonMe();
		this.jButtonProcesarInformacionProforma.setText("Procesar");
		this.jButtonProcesarInformacionProforma.setToolTipText("Procesar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProforma.setVisible(false);
			
		this.jButtonProcesarInformacionProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProforma.setText("TIPO");       
		this.jComboBoxTiposReportesProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProforma.setText("Accion");
		this.jComboBoxTiposRelacionesProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProforma.setText("Accion");
		this.jComboBoxTiposAccionesProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProforma = new JLabelMe();
		
		this.jLabelAccionesProforma.setText("Acciones");		
		this.jLabelAccionesProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProforma = new JButtonMe();
		//this.jButtonAnterioresProforma.setText("<<");
        this.jButtonAnterioresProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProforma = new JButtonMe();
		//this.jButtonSiguientesProforma.setText(">>");
        this.jButtonSiguientesProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProforma,"nuevoguardarcambios_button","Nue",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProforma";
		inputMap = this.jButtonNuevoGuardarCambiosProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProforma";
		inputMap = this.jButtonRecargarInformacionProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProforma";
		inputMap = this.jButtonSiguientesProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProforma";
		inputMap = this.jButtonAnterioresProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProforma.setMinimumSize(new Dimension(this.getWidth(),ProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProforma.setMaximumSize(new Dimension(this.getWidth(),ProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProforma.setPreferredSize(new Dimension(this.getWidth(),ProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProforma = new GridBagLayout();

			this.jPanelPaginacionProforma.setLayout(gridaBagLayoutPaginacionProforma);						
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = 0;
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProforma.add(this.jButtonAnterioresProforma, this.gridBagConstraintsProforma);
					
						
			this.gridBagConstraintsProforma = new GridBagConstraints();//
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsProforma.gridy = 0;//
			
			this.jPanelPaginacionProforma.add(this.jButtonNuevoGuardarCambiosProforma, this.gridBagConstraintsProforma);//
						
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProforma.gridy = 0;
			this.jPanelPaginacionProforma.add(this.jButtonSiguientesProforma, this.gridBagConstraintsProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProforma = new GridBagConstraints();//
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsProforma.gridy = 1;//
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionProforma.add(this.jButtonNuevoProforma, this.gridBagConstraintsProforma);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProforma = new GridBagConstraints();
				this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProforma.gridy = 1;
				this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProforma.add(this.jButtonNuevoRelacionesProforma, this.gridBagConstraintsProforma);
			}
			
			
			if(!this.proformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProforma = new GridBagConstraints();//
				this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsProforma.gridy = 1;//
				this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionProforma.add(this.jButtonGuardarCambiosTablaProforma, this.gridBagConstraintsProforma);//
			}
			
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();//
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsProforma.gridy = 1;//
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionProforma.add(this.jButtonDuplicarProforma, this.gridBagConstraintsProforma);//
			
			this.gridBagConstraintsProforma = new GridBagConstraints();//
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsProforma.gridy = 1;//
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionProforma.add(this.jButtonCopiarProforma, this.gridBagConstraintsProforma);//
		
			this.gridBagConstraintsProforma = new GridBagConstraints();//
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsProforma.gridy = 1;//
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionProforma.add(this.jButtonVerFormProforma, this.gridBagConstraintsProforma);//
		
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = 1;
			this.gridBagConstraintsProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProforma.add(this.jButtonCerrarProforma, this.gridBagConstraintsProforma);
		
		
		
		this.jButtonRecargarInformacionProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Proforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Proforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Proforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Proforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProforma.setLayout(gridaBagParametrosReportesProforma);
			this.jPanelParametrosReportesAccionesProforma.setLayout(gridaBagParametrosReportesAccionesProforma);
			
			
			this.jPanelParametrosAuxiliar1Proforma.setLayout(gridaBagParametrosAuxiliar1Proforma);
			this.jPanelParametrosAuxiliar2Proforma.setLayout(gridaBagParametrosAuxiliar2Proforma);
			this.jPanelParametrosAuxiliar3Proforma.setLayout(gridaBagParametrosAuxiliar3Proforma);
			this.jPanelParametrosAuxiliar4Proforma.setLayout(gridaBagParametrosAuxiliar4Proforma);
			//this.jPanelParametrosAuxiliar5Proforma.setLayout(gridaBagParametrosAuxiliar2Proforma);			
			
			
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProforma.add(this.jButtonRecargarInformacionProforma, this.gridBagConstraintsProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Proforma.add(this.jComboBoxTiposPaginacionProforma, this.gridBagConstraintsProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Proforma.add(this.jCheckBoxConAltoMaximoTablaProforma, this.gridBagConstraintsProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Proforma.add(this.jComboBoxTiposArchivosReportesProforma, this.gridBagConstraintsProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProforma.add(this.jPanelParametrosAuxiliar1Proforma, this.gridBagConstraintsProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Proforma.add(this.jComboBoxTiposReportesProforma, this.gridBagConstraintsProforma);																		
			
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Proforma.add(this.jComboBoxTiposGraficosReportesProforma, this.gridBagConstraintsProforma);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProforma.add(this.jPanelParametrosAuxiliar4Proforma, this.gridBagConstraintsProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProforma.add(this.jComboBoxTiposReportesProforma, this.gridBagConstraintsProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProforma.add(this.jCheckBoxGenerarReporteProforma, this.gridBagConstraintsProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProforma.add(this.jPanelParametrosAuxiliar2Proforma, this.gridBagConstraintsProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProforma.add(this.jLabelAccionesProforma, this.gridBagConstraintsProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProforma = new GridBagConstraints();
				this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProforma.add(this.jButtonAbrirOrderByProforma, this.gridBagConstraintsProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProforma.add(this.jComboBoxTiposSeleccionarProforma, this.gridBagConstraintsProforma);			
			
			
			/*
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProforma.add(this.jCheckBoxSeleccionarTodosProforma, this.gridBagConstraintsProforma);
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProforma.add(this.jCheckBoxConGraficoReporteProforma, this.gridBagConstraintsProforma);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Proforma.add(this.jCheckBoxSeleccionarTodosProforma, this.gridBagConstraintsProforma);															
				
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Proforma.add(this.jCheckBoxSeleccionadosProforma, this.gridBagConstraintsProforma);															
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Proforma.add(this.jCheckBoxConGraficoReporteProforma, this.gridBagConstraintsProforma);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProforma.add(this.jPanelParametrosAuxiliar3Proforma, this.gridBagConstraintsProforma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProforma.add(this.jComboBoxTiposRelacionesProforma, this.gridBagConstraintsProforma);
				
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProforma.add(this.jComboBoxTiposAccionesProforma, this.gridBagConstraintsProforma);
	
				
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProforma.add(this.jTextFieldValorCampoGeneralProforma, this.gridBagConstraintsProforma);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFindatos_valoresProforma= new GridBagLayout();
		this.jPanelCamposFindatos_valoresProforma.setLayout(gridaBagLayoutCamposFindatos_valoresProforma);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProforma = new GridBagLayout();

			this.jScrollPanelDatosProforma.setLayout(gridaBagLayoutDatosProforma);
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = 0;
			this.gridBagConstraintsProforma.gridx = 0;
			
			this.jScrollPanelDatosProforma.add(this.jTableDatosProforma, this.gridBagConstraintsProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProforma.setViewportView(this.jTableDatosProforma);
		this.jTableDatosProforma.setFillsViewportHeight(true);
		this.jTableDatosProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProforma= new GridBagLayout();
		this.jPanelAccionesProforma.setLayout(gridaBagLayoutAccionesProforma);
		
		
		/*	
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 0;
			
		this.jPanelAccionesProforma.add(this.jButtonNuevoProforma, this.gridBagConstraintsProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoProforma.setLayout(gridaBagLayoutFK_IdCentroCostoProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdCentroCostoProforma.add(jLabelid_centro_costoFK_IdCentroCostoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdCentroCostoProforma.add(jComboBoxid_centro_costoFK_IdCentroCostoProforma, gridBagConstraintsProforma);


		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdCentroCostoProforma.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdCentroCostoProforma.add(jButtonFK_IdCentroCostoProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteProforma= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProforma.setLayout(gridaBagLayoutFK_IdClienteProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdClienteProforma.add(jLabelid_clienteFK_IdClienteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdClienteProforma.add(jComboBoxid_clienteFK_IdClienteProforma, gridBagConstraintsProforma);


		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdClienteProforma.add(this.jButtonBuscarFK_IdClienteid_clienteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdClienteProforma.add(jButtonFK_IdClienteProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("2.-Por Cliente ", jPanelFK_IdClienteProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdConsignatarioProforma= new GridBagLayout();
		gridaBagLayoutFK_IdConsignatarioProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsignatarioProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsignatarioProforma.setLayout(gridaBagLayoutFK_IdConsignatarioProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdConsignatarioProforma.add(jLabelid_consignatarioFK_IdConsignatarioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdConsignatarioProforma.add(jComboBoxid_consignatarioFK_IdConsignatarioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdConsignatarioProforma.add(jButtonFK_IdConsignatarioProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("3.-Por Consignatario ", jPanelFK_IdConsignatarioProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoProforma.setLayout(gridaBagLayoutFK_IdEmpleadoProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdEmpleadoProforma.add(jLabelid_empleadoFK_IdEmpleadoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdEmpleadoProforma.add(jComboBoxid_empleadoFK_IdEmpleadoProforma, gridBagConstraintsProforma);


		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdEmpleadoProforma.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdEmpleadoProforma.add(jButtonFK_IdEmpleadoProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoProformaProforma= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoProformaProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoProformaProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoProformaProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoProformaProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoProformaProforma.setLayout(gridaBagLayoutFK_IdEstadoProformaProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdEstadoProformaProforma.add(jLabelid_estado_proformaFK_IdEstadoProformaProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdEstadoProformaProforma.add(jComboBoxid_estado_proformaFK_IdEstadoProformaProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdEstadoProformaProforma.add(jButtonFK_IdEstadoProformaProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("5.-Por Estado ", jPanelFK_IdEstadoProformaProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoProforma.setLayout(gridaBagLayoutFK_IdFormatoProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdFormatoProforma.add(jLabelid_formatoFK_IdFormatoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdFormatoProforma.add(jComboBoxid_formatoFK_IdFormatoProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdFormatoProforma.add(jButtonFK_IdFormatoProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("6.-Por Formato ", jPanelFK_IdFormatoProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdRutaTransporteProforma= new GridBagLayout();
		gridaBagLayoutFK_IdRutaTransporteProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRutaTransporteProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRutaTransporteProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRutaTransporteProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRutaTransporteProforma.setLayout(gridaBagLayoutFK_IdRutaTransporteProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdRutaTransporteProforma.add(jLabelid_ruta_transporteFK_IdRutaTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdRutaTransporteProforma.add(jComboBoxid_ruta_transporteFK_IdRutaTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdRutaTransporteProforma.add(jButtonFK_IdRutaTransporteProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("7.-Por Ruta ", jPanelFK_IdRutaTransporteProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdSubClienteProforma= new GridBagLayout();
		gridaBagLayoutFK_IdSubClienteProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClienteProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClienteProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClienteProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClienteProforma.setLayout(gridaBagLayoutFK_IdSubClienteProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdSubClienteProforma.add(jLabelid_sub_clienteFK_IdSubClienteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdSubClienteProforma.add(jComboBoxid_sub_clienteFK_IdSubClienteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdSubClienteProforma.add(jButtonFK_IdSubClienteProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("8.-Por Contacto ", jPanelFK_IdSubClienteProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioProforma.setLayout(gridaBagLayoutFK_IdTipoCambioProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTipoCambioProforma.add(jLabelid_tipo_cambioFK_IdTipoCambioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdTipoCambioProforma.add(jComboBoxid_tipo_cambioFK_IdTipoCambioProforma, gridBagConstraintsProforma);


		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTipoCambioProforma.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdTipoCambioProforma.add(jButtonFK_IdTipoCambioProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("9.-Por T. Cambio ", jPanelFK_IdTipoCambioProforma);
		jTabbedPaneBusquedasProforma.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioProforma.setLayout(gridaBagLayoutFK_IdTipoPrecioProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTipoPrecioProforma.add(jLabelid_tipo_precioFK_IdTipoPrecioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdTipoPrecioProforma.add(jComboBoxid_tipo_precioFK_IdTipoPrecioProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdTipoPrecioProforma.add(jButtonFK_IdTipoPrecioProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("10.-Por Tipo Precio ", jPanelFK_IdTipoPrecioProforma);

		GridBagLayout gridaBagLayoutFK_IdTipoProformaProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProformaProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProformaProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProformaProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProformaProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProformaProforma.setLayout(gridaBagLayoutFK_IdTipoProformaProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTipoProformaProforma.add(jLabelid_tipo_proformaFK_IdTipoProformaProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdTipoProformaProforma.add(jComboBoxid_tipo_proformaFK_IdTipoProformaProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdTipoProformaProforma.add(jButtonFK_IdTipoProformaProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("11.-Por Tipo Proforma ", jPanelFK_IdTipoProformaProforma);

		GridBagLayout gridaBagLayoutFK_IdTipoViaTransporteProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransporteProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransporteProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransporteProforma.setLayout(gridaBagLayoutFK_IdTipoViaTransporteProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTipoViaTransporteProforma.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdTipoViaTransporteProforma.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdTipoViaTransporteProforma.add(jButtonFK_IdTipoViaTransporteProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("12.-Por Forma Envio ", jPanelFK_IdTipoViaTransporteProforma);

		GridBagLayout gridaBagLayoutFK_IdTransporteProforma= new GridBagLayout();
		gridaBagLayoutFK_IdTransporteProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransporteProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransporteProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransporteProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransporteProforma.setLayout(gridaBagLayoutFK_IdTransporteProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdTransporteProforma.add(jLabelid_transporteFK_IdTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdTransporteProforma.add(jComboBoxid_transporteFK_IdTransporteProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdTransporteProforma.add(jButtonFK_IdTransporteProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("13.-Por Transporte ", jPanelFK_IdTransporteProforma);

		GridBagLayout gridaBagLayoutFK_IdVendedorProforma= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorProforma.setLayout(gridaBagLayoutFK_IdVendedorProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdVendedorProforma.add(jLabelid_vendedorFK_IdVendedorProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 1;
		jPanelFK_IdVendedorProforma.add(jComboBoxid_vendedorFK_IdVendedorProforma, gridBagConstraintsProforma);


		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
		gridBagConstraintsProforma.gridy = 0;
		gridBagConstraintsProforma.gridx = 0;
		jPanelFK_IdVendedorProforma.add(this.jButtonBuscarFK_IdVendedorid_vendedorProforma, gridBagConstraintsProforma);

		gridBagConstraintsProforma = new GridBagConstraints();
		gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProforma.gridy = 1;
		gridBagConstraintsProforma.gridx =1;
		jPanelFK_IdVendedorProforma.add(jButtonFK_IdVendedorProforma, gridBagConstraintsProforma);

		jTabbedPaneBusquedasProforma.addTab("14.-Por Vendedor ", jPanelFK_IdVendedorProforma);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.proformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProforma = new GridBagConstraints();						
			this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProforma.gridx = 0;		
			//this.gridBagConstraintsProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProforma, this.gridBagConstraintsProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProforma.gridx = 0;		
		//this.gridBagConstraintsProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProforma.gridx = 0;		
			this.gridBagConstraintsProforma.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProforma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProforma, this.gridBagConstraintsProforma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProforma, this.gridBagConstraintsProforma);								
		
		
		/*
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProforma, this.gridBagConstraintsProforma);
		*/		
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProforma.gridx =0;
		this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProforma, this.gridBagConstraintsProforma);
				
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProforma, this.gridBagConstraintsProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosProforma.setLayout(gridaBagLayoutBusquedasParametrosProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProforma, this.gridBagConstraintsProforma);
			
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProforma, this.gridBagConstraintsProforma);
		
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProforma, this.gridBagConstraintsProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProforma.setName("jPanelReporteDinamicoProforma"); 
		
		this.jPanelReporteDinamicoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProforma.setLayout(gridaBagLayoutReporteDinamicoProforma);
		
		
		this.jInternalFrameReporteDinamicoProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProforma.add(this.jLabelColumnasSelectReporteProforma, this.gridBagConstraintsProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProforma=new JScrollPane(this.jListColumnasSelectReporteProforma);
			
			this.jScrollColumnasSelectReporteProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProforma.add(this.jListColumnasSelectReporteProforma, this.gridBagConstraintsProforma);
		this.jPanelReporteDinamicoProforma.add(this.jScrollColumnasSelectReporteProforma, this.gridBagConstraintsProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProforma.add(this.jLabelRelacionesSelectReporteProforma, this.gridBagConstraintsProforma);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProforma=new JScrollPane(this.jListRelacionesSelectReporteProforma);
			
			this.jScrollRelacionesSelectReporteProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProforma.add(this.jListRelacionesSelectReporteProforma, this.gridBagConstraintsProforma);
		this.jPanelReporteDinamicoProforma.add(this.jScrollRelacionesSelectReporteProforma, this.gridBagConstraintsProforma);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProforma = new JLabelMe();

		this.jLabelConGraficoDinamicoProforma.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProforma.add(this.jLabelConGraficoDinamicoProforma, this.gridBagConstraintsProforma);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProforma.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProforma.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProforma.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jCheckBoxConGraficoDinamicoProforma, this.gridBagConstraintsProforma);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProforma = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProforma.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProforma.add(this.jLabelColumnaCategoriaGraficoProforma, this.gridBagConstraintsProforma);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProforma.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProforma.add(this.jComboBoxColumnaCategoriaGraficoProforma, this.gridBagConstraintsProforma);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProforma = new JLabelMe();

		this.jLabelColumnaCategoriaValorProforma.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jLabelColumnaCategoriaValorProforma, this.gridBagConstraintsProforma);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProforma.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProforma.add(this.jComboBoxColumnaCategoriaValorProforma, this.gridBagConstraintsProforma);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProforma = new JLabelMe();

		this.jLabelColumnasValoresGraficoProforma.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jLabelColumnasValoresGraficoProforma, this.gridBagConstraintsProforma);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProforma = new JList<Reporte>();
		this.jListColumnasValoresGraficoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProforma.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProforma=new JScrollPane(this.jListColumnasValoresGraficoProforma);
			
			this.jScrollColumnasValoresGraficoProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProforma.add(this.jListColumnasSelectReporteProforma, this.gridBagConstraintsProforma);
		this.jPanelReporteDinamicoProforma.add(this.jScrollColumnasValoresGraficoProforma, this.gridBagConstraintsProforma);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProforma = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProforma.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jLabelTiposGraficosReportesDinamicoProforma, this.gridBagConstraintsProforma);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProforma = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProforma.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProforma.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProforma.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jComboBoxTiposGraficosReportesDinamicoProforma, this.gridBagConstraintsProforma);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jLabelGenerarExcelReporteDinamicoProforma, this.gridBagConstraintsProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProforma.setToolTipText("Generar EXCEL"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProforma.add(this.jButtonGenerarExcelReporteDinamicoProforma, this.gridBagConstraintsProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProforma.add(this.jComboBoxTiposReportesDinamicoProforma, this.gridBagConstraintsProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProforma.add(this.jLabelTiposArchivoReporteDinamicoProforma, this.gridBagConstraintsProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProforma.add(this.jComboBoxTiposArchivosReportesDinamicoProforma, this.gridBagConstraintsProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProforma.setToolTipText("Generar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProforma.add(this.jButtonGenerarReporteDinamicoProforma, this.gridBagConstraintsProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProforma.setToolTipText("Cancelar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProforma.add(this.jButtonCerrarReporteDinamicoProforma, this.gridBagConstraintsProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProforma= new JScrollPane(jPanelReporteDinamicoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProforma);
		this.jInternalFrameReporteDinamicoProforma.getContentPane().add(this.jScrollPanelReporteDinamicoProforma, this.gridBagConstraintsProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProforma.setName("jPanelImportacionProforma"); 
		
		this.jPanelImportacionProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProforma.setLayout(gridaBagLayoutImportacionProforma);
		
		
		this.jInternalFrameImportacionProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProforma.setResizable(true);
	    this.jInternalFrameImportacionProforma.setClosable(true);
	    this.jInternalFrameImportacionProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProforma.setResizable(true);
	    this.jInternalFrameImportacionProforma.setClosable(true);
	    this.jInternalFrameImportacionProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProforma = new JLabelMe();

		this.jLabelArchivoImportacionProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProforma.add(this.jLabelArchivoImportacionProforma, this.gridBagConstraintsProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProforma = new JFileChooser();		
		this.jFileChooserImportacionProforma.setToolTipText("ESCOGER ARCHIVO"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProforma = new JButtonMe();
		this.jButtonAbrirImportacionProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProforma.setToolTipText("Generar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProforma.add(this.jButtonAbrirImportacionProforma, this.gridBagConstraintsProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProforma.add(this.jLabelPathArchivoImportacionProforma, this.gridBagConstraintsProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProforma.add(this.jTextFieldPathArchivoImportacionProforma, this.gridBagConstraintsProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProforma = new JButtonMe();
		this.jButtonGenerarImportacionProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProforma.setToolTipText("Generar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProforma.add(this.jButtonGenerarImportacionProforma, this.gridBagConstraintsProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProforma = new JButtonMe();
		this.jButtonCerrarImportacionProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProforma.setToolTipText("Cancelar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProforma.add(this.jButtonCerrarImportacionProforma, this.gridBagConstraintsProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionProforma= new JScrollPane(jPanelImportacionProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProforma);
		this.jInternalFrameImportacionProforma.getContentPane().add(this.jScrollPanelImportacionProforma, this.gridBagConstraintsProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProforma = new JButtonMe();
			this.jButtonAbrirOrderByProforma.setText("Orden");
			this.jButtonAbrirOrderByProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProforma";
			inputMap = this.jButtonAbrirOrderByProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProforma.setName("jPanelOrderByProforma"); 
			
			this.jPanelOrderByProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProforma.setLayout(gridaBagLayoutOrderByProforma);
			
			
			this.jTableDatosProformaOrderBy = new JTableMe();        
			this.jTableDatosProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProformaOrderBy.setViewportView(this.jTableDatosProformaOrderBy);
			this.jTableDatosProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProforma.setTitle("Orden");
			this.jInternalFrameOrderByProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProforma.setResizable(true);
			this.jInternalFrameOrderByProforma.setClosable(true);
			this.jInternalFrameOrderByProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProforma.ipady =150;
				
			this.jPanelOrderByProforma.add(jScrollPanelDatosProformaOrderBy, this.gridBagConstraintsProforma);//this.jTableDatosProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProforma = new JButtonMe();
			this.jButtonCerrarOrderByProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProforma.setToolTipText("Cancelar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProforma.add(this.jButtonCerrarOrderByProforma, this.gridBagConstraintsProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByProforma= new JScrollPane(jPanelOrderByProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProforma);
			
			this.jInternalFrameOrderByProforma.getContentPane().add(this.jScrollPanelOrderByProforma, this.gridBagConstraintsProforma);			
		
		} else {
			this.jButtonAbrirOrderByProforma = new JButtonMe();
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
		int iWidthTableCalculado=0;//9630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.proformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProforma.getRowHeight();//ProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProforma.isSelected()) {
					iHeightTable=ProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProforma.isSelected()) {
					iHeightTable=ProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProforma!=null && this.jInternalFrameOrderByProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.proformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=proformaLogic.getProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=proformas.size();
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
	public static List<Proforma> TraerProformaBeans(List<Proforma> proformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Proforma proforma:proformas) {
					
				if(!(ProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					proforma.setsDetalleGeneralEntityReporte(ProformaConstantesFunciones.getProformaDescripcion(proforma));
										
					proforma.setes_oferta_descripcion(ProformaConstantesFunciones.getes_ofertaDescripcion(proforma));	
					
					

					if(proforma.getTerminoProformas()!=null && Funciones.existeClass(classes,TerminoProforma.class)) {
						try{proforma.setterminoproformasDescripcionReporte(new JRBeanCollectionDataSource(TerminoProformaJInternalFrame.TraerTerminoProformaBeans(proforma.getTerminoProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(proforma.getDetalleProformas()!=null && Funciones.existeClass(classes,DetalleProforma.class)) {
						try{proforma.setdetalleproformasDescripcionReporte(new JRBeanCollectionDataSource(DetalleProformaJInternalFrame.TraerDetalleProformaBeans(proforma.getDetalleProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//proforma.setsDetalleGeneralEntityReporte(proforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//proformabeans.add(proformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return proformas;
    }
	//PARA REPORTES FIN
}
