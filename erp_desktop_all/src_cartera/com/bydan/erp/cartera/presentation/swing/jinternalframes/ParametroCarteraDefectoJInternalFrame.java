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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.cartera.util.ParametroCarteraDefectoConstantesFunciones;

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
public class ParametroCarteraDefectoJInternalFrame extends ParametroCarteraDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroCarteraDefecto;
	
	protected JMenuBar jmenuBarParametroCarteraDefecto;
	
	protected JMenu jmenuParametroCarteraDefecto;
	protected JMenu jmenuDatosParametroCarteraDefecto;
	protected JMenu jmenuArchivoParametroCarteraDefecto;
	protected JMenu jmenuAccionesParametroCarteraDefecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCarteraDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroCarteraDefecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroCarteraDefecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroCarteraDefecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroCarteraDefecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ruta="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TipoListaPrecioBeanSwingJInternalFrame tipolistaprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolistaprecio="";
	
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public RutaSessionBean rutaSessionBean;
	public DiaSessionBean diaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroCarteraDefecto> parametrocarteradefectos;		
	public List<ParametroCarteraDefecto> parametrocarteradefectosEliminados;	
	public List<ParametroCarteraDefecto> parametrocarteradefectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroCarteraDefecto;		
	protected JButton jButtonAbrirOrderByParametroCarteraDefecto;
	
	
	//protected JPanel jPanelOrderByParametroCarteraDefecto;
	//public JScrollPane jScrollPanelOrderByParametroCarteraDefecto;	
	//protected JButton jButtonCerrarOrderByParametroCarteraDefecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroCarteraDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroCarteraDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroCarteraDefecto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroCarteraDefectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroCarteraDefecto;
	//public JScrollPane jScrollPanelImportacionParametroCarteraDefecto;
	
	
	
	protected JPanel jPanelAccionesParametroCarteraDefecto;
	
    protected JPanel jPanelPaginacionParametroCarteraDefecto;
    protected JPanel jPanelParametrosReportesParametroCarteraDefecto;
	protected JPanel jPanelParametrosReportesAccionesParametroCarteraDefecto;
	
	
	
	
	
	

	protected JPanel jPanelCamposInicioubicacionParametroCarteraDefecto;
	protected Integer iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
	protected Integer iYPanelCamposInicioubicacionParametroCarteraDefecto=0;

	protected JPanel jPanelCamposInicioproveedorParametroCarteraDefecto;
	protected Integer iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
	protected Integer iYPanelCamposInicioproveedorParametroCarteraDefecto=0;

	protected JPanel jPanelCamposIniciocontableParametroCarteraDefecto;
	protected Integer iXPanelCamposIniciocontableParametroCarteraDefecto=0;
	protected Integer iYPanelCamposIniciocontableParametroCarteraDefecto=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroCarteraDefecto;
	protected JPanel jPanelParametrosAuxiliar2ParametroCarteraDefecto;
	protected JPanel jPanelParametrosAuxiliar3ParametroCarteraDefecto;
	protected JPanel jPanelParametrosAuxiliar4ParametroCarteraDefecto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroCarteraDefecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroCarteraDefecto;
	//protected JPanel jPanelImportacionParametroCarteraDefecto;
	
	
	public JTable jTableDatosParametroCarteraDefecto;
	
	
	
	//public JTable jTableDatosParametroCarteraDefectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroCarteraDefecto;
	protected JButton jButtonDuplicarParametroCarteraDefecto;
	protected JButton jButtonCopiarParametroCarteraDefecto;
	protected JButton jButtonVerFormParametroCarteraDefecto;
	protected JButton jButtonNuevoRelacionesParametroCarteraDefecto;
	protected JButton jButtonModificarParametroCarteraDefecto;
	
    protected JButton jButtonGuardarCambiosTablaParametroCarteraDefecto;
	protected JButton jButtonCerrarParametroCarteraDefecto;
	
	
	protected JButton jButtonRecargarInformacionParametroCarteraDefecto;
	protected JButton jButtonProcesarInformacionParametroCarteraDefecto;
	
	
	protected JButton jButtonAnterioresParametroCarteraDefecto;
	protected JButton jButtonSiguientesParametroCarteraDefecto;
	protected JButton jButtonNuevoGuardarCambiosParametroCarteraDefecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroCarteraDefecto;
	//protected JButton jButtonCerrarReporteDinamicoParametroCarteraDefecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroCarteraDefecto;
	//protected JButton jButtonGenerarImportacionParametroCarteraDefecto;
	//protected JButton jButtonCerrarImportacionParametroCarteraDefecto;
	//protected JFileChooser jFileChooserImportacionParametroCarteraDefecto;
	//protected File fileImportacionParametroCarteraDefecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCarteraDefecto;
	protected JButton jButtonDuplicarToolBarParametroCarteraDefecto;
	protected JButton jButtonNuevoRelacionesToolBarParametroCarteraDefecto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroCarteraDefecto;
	protected JButton jButtonCopiarToolBarParametroCarteraDefecto;
	protected JButton jButtonVerFormToolBarParametroCarteraDefecto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroCarteraDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCarteraDefecto;
	protected JButton jButtonCerrarToolBarParametroCarteraDefecto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroCarteraDefecto;
	protected JButton jButtonProcesarInformacionToolBarParametroCarteraDefecto;
	protected JButton jButtonAnterioresToolBarParametroCarteraDefecto;
	protected JButton jButtonSiguientesToolBarParametroCarteraDefecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroCarteraDefecto;
	protected JButton jButtonAbrirOrderByToolBarParametroCarteraDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCarteraDefecto;
	protected JMenuItem jMenuItemDuplicarParametroCarteraDefecto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroCarteraDefecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroCarteraDefecto;
	protected JMenuItem jMenuItemCopiarParametroCarteraDefecto;
	protected JMenuItem jMenuItemVerFormParametroCarteraDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCarteraDefecto;
	protected JMenuItem jMenuItemCerrarParametroCarteraDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroCarteraDefecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroCarteraDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCarteraDefecto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroCarteraDefecto;
	protected JMenuItem jMenuItemProcesarInformacionParametroCarteraDefecto;
	protected JMenuItem jMenuItemAnterioresParametroCarteraDefecto;
	protected JMenuItem jMenuItemSiguientesParametroCarteraDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCarteraDefecto;
	protected JMenuItem jMenuItemAbrirOrderByParametroCarteraDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroCarteraDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCarteraDefecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroCarteraDefecto;
	protected JCheckBox jCheckBoxSeleccionadosParametroCarteraDefecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroCarteraDefecto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroCarteraDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroCarteraDefecto;
	protected JTextField jTextFieldValorCampoGeneralParametroCarteraDefecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroCarteraDefecto;
	//public JList<Reporte> jListColumnasSelectReporteParametroCarteraDefecto;
	//public JScrollPane jScrollColumnasSelectReporteParametroCarteraDefecto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroCarteraDefecto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroCarteraDefecto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroCarteraDefecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroCarteraDefecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroCarteraDefecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto;
	
		
	//public JLabel jLabelArchivoImportacionParametroCarteraDefecto;	
	//public JLabel jLabelPathArchivoImportacionParametroCarteraDefecto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroCarteraDefecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroCarteraDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroCarteraDefecto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroCarteraDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroCarteraDefecto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroCarteraDefecto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroCarteraDefecto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroCarteraDefecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroCarteraDefecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroCarteraDefecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroCarteraDefecto;
	public JPanel jPanelFK_IdCiudadParametroCarteraDefecto;
	public JButton jButtonFK_IdCiudadParametroCarteraDefecto;
	public JPanel jPanelFK_IdCuentaContableParametroCarteraDefecto;
	public JButton jButtonFK_IdCuentaContableParametroCarteraDefecto;
	public JPanel jPanelFK_IdDiaParametroCarteraDefecto;
	public JButton jButtonFK_IdDiaParametroCarteraDefecto;
	public JPanel jPanelFK_IdEstadoCivilParametroCarteraDefecto;
	public JButton jButtonFK_IdEstadoCivilParametroCarteraDefecto;
	public JPanel jPanelFK_IdEstadoLegalParametroCarteraDefecto;
	public JButton jButtonFK_IdEstadoLegalParametroCarteraDefecto;
	public JPanel jPanelFK_IdPaisParametroCarteraDefecto;
	public JButton jButtonFK_IdPaisParametroCarteraDefecto;
	public JPanel jPanelFK_IdPaisNacionalidadParametroCarteraDefecto;
	public JButton jButtonFK_IdPaisNacionalidadParametroCarteraDefecto;
	public JPanel jPanelFK_IdProvinciaParametroCarteraDefecto;
	public JButton jButtonFK_IdProvinciaParametroCarteraDefecto;
	public JPanel jPanelFK_IdRegionParametroCarteraDefecto;
	public JButton jButtonFK_IdRegionParametroCarteraDefecto;
	public JPanel jPanelFK_IdRutaParametroCarteraDefecto;
	public JButton jButtonFK_IdRutaParametroCarteraDefecto;
	public JPanel jPanelFK_IdTipoGeneroParametroCarteraDefecto;
	public JButton jButtonFK_IdTipoGeneroParametroCarteraDefecto;
	public JPanel jPanelFK_IdTipoIdentificacionParametroCarteraDefecto;
	public JButton jButtonFK_IdTipoIdentificacionParametroCarteraDefecto;
	public JPanel jPanelFK_IdTipoListaPrecioParametroCarteraDefecto;
	public JButton jButtonFK_IdTipoListaPrecioParametroCarteraDefecto;
	public JPanel jPanelFK_IdTipoNivelEduParametroCarteraDefecto;
	public JButton jButtonFK_IdTipoNivelEduParametroCarteraDefecto;
	public JPanel jPanelFK_IdTipoPrecioParametroCarteraDefecto;
	public JButton jButtonFK_IdTipoPrecioParametroCarteraDefecto;
	public JPanel jPanelFK_IdVendedorParametroCarteraDefecto;
	public JButton jButtonFK_IdVendedorParametroCarteraDefecto;
	public JPanel jPanelFK_IdZonaParametroCarteraDefecto;
	public JButton jButtonFK_IdZonaParametroCarteraDefecto;
	
	public JPanel jPanelid_ciudadFK_IdCiudadParametroCarteraDefecto;
	public JLabel jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto;
	public JButton jButtonid_ciudadFK_IdCiudadParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroCarteraDefectoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroCarteraDefectoArbol= new JButtonMe();

	
	public JPanel jPanelid_diaFK_IdDiaParametroCarteraDefecto;
	public JLabel jLabelid_diaFK_IdDiaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaFK_IdDiaParametroCarteraDefecto;
	public JButton jButtonid_diaFK_IdDiaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_diaFK_IdDiaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_diaFK_IdDiaParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto;
	public JLabel jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto;
	public JButton jButtonid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto;
	public JLabel jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto;
	public JButton jButtonid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalFK_IdEstadoLegalParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisParametroCarteraDefecto;
	public JLabel jLabelid_paisFK_IdPaisParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisParametroCarteraDefecto;
	public JButton jButtonid_paisFK_IdPaisParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto;
	public JLabel jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto;
	public JButton jButtonid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaParametroCarteraDefecto;
	public JLabel jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto;
	public JButton jButtonid_provinciaFK_IdProvinciaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_regionFK_IdRegionParametroCarteraDefecto;
	public JLabel jLabelid_regionFK_IdRegionParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionFK_IdRegionParametroCarteraDefecto;
	public JButton jButtonid_regionFK_IdRegionParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_regionFK_IdRegionParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_regionFK_IdRegionParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rutaFK_IdRutaParametroCarteraDefecto;
	public JLabel jLabelid_rutaFK_IdRutaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto;
	public JButton jButtonid_rutaFK_IdRutaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_rutaFK_IdRutaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_rutaFK_IdRutaParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto;
	public JLabel jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto;
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto;
	public JLabel jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto;
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto;
	public JLabel jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto;
	public JButton jButtonid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto;
	public JLabel jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto;
	public JButton jButtonid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorParametroCarteraDefecto;
	public JLabel jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto;
	public JButton jButtonid_vendedorFK_IdVendedorParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorParametroCarteraDefectoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorParametroCarteraDefectoArbol= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaParametroCarteraDefecto;
	public JLabel jLabelid_zonaFK_IdZonaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto;
	public JButton jButtonid_zonaFK_IdZonaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaParametroCarteraDefectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroCarteraDefectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroCarteraDefecto)	{
		this.jButtonRecargarInformacionParametroCarteraDefecto = jButtonRecargarInformacionParametroCarteraDefecto;
	}
	
	public JButton getjButtonProcesarInformacionParametroCarteraDefecto() {
		return this.jButtonProcesarInformacionParametroCarteraDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCarteraDefecto)	{
		this.jButtonProcesarInformacionParametroCarteraDefecto = jButtonProcesarInformacionParametroCarteraDefecto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroCarteraDefecto() {
		return this.jButtonRecargarInformacionParametroCarteraDefecto;
	}
	
	
	public List<ParametroCarteraDefecto> getparametrocarteradefectos() {
		return this.parametrocarteradefectos;
	}

	public void setparametrocarteradefectos(List<ParametroCarteraDefecto> parametrocarteradefectos) {
		this.parametrocarteradefectos = parametrocarteradefectos;
	}
	
	public List<ParametroCarteraDefecto> getparametrocarteradefectosAux() {
		return this.parametrocarteradefectosAux;
	}

	public void setparametrocarteradefectosAux(List<ParametroCarteraDefecto> parametrocarteradefectosAux) {
		this.parametrocarteradefectosAux = parametrocarteradefectosAux;
	}
	
	public List<ParametroCarteraDefecto> getparametrocarteradefectosEliminados() {
		return this.parametrocarteradefectosEliminados;
	}

	public void setParametroCarteraDefectosEliminados(List<ParametroCarteraDefecto> parametrocarteradefectosEliminados) {
		this.parametrocarteradefectosEliminados = parametrocarteradefectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroCarteraDefecto() {
		return jComboBoxTiposSeleccionarParametroCarteraDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroCarteraDefecto(
			JComboBox jComboBoxTiposSeleccionarParametroCarteraDefecto) {
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto = jComboBoxTiposSeleccionarParametroCarteraDefecto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroCarteraDefecto() {
		return jTextFieldValorCampoGeneralParametroCarteraDefecto;
	}

	public void setjTextFieldValorCampoGeneralParametroCarteraDefecto(
			JTextField jTextFieldValorCampoGeneralParametroCarteraDefecto) {
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto = jTextFieldValorCampoGeneralParametroCarteraDefecto;
	}

	public void setBorderResaltarValorCampoGeneralParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroCarteraDefecto() {
		return this.jCheckBoxSeleccionarTodosParametroCarteraDefecto;
	}

	public void setjCheckBoxSeleccionarTodosParametroCarteraDefecto(
			JCheckBox jCheckBoxSeleccionarTodosParametroCarteraDefecto) {
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto = jCheckBoxSeleccionarTodosParametroCarteraDefecto;
	}

	public void setBorderResaltarSeleccionarTodosParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroCarteraDefecto() {
		return this.jCheckBoxSeleccionadosParametroCarteraDefecto;
	}

	public void setjCheckBoxSeleccionadosParametroCarteraDefecto(
			JCheckBox jCheckBoxSeleccionadosParametroCarteraDefecto) {
		this.jCheckBoxSeleccionadosParametroCarteraDefecto = jCheckBoxSeleccionadosParametroCarteraDefecto;
	}
	
	public void setBorderResaltarSeleccionadosParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroCarteraDefecto() {
		return this.jComboBoxTiposArchivosReportesParametroCarteraDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroCarteraDefecto(
			JComboBox jComboBoxTiposArchivosReportesParametroCarteraDefecto) {
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto = jComboBoxTiposArchivosReportesParametroCarteraDefecto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroCarteraDefecto() {
		return this.jComboBoxTiposReportesParametroCarteraDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroCarteraDefecto(
			JComboBox jComboBoxTiposReportesParametroCarteraDefecto) {
		this.jComboBoxTiposReportesParametroCarteraDefecto = jComboBoxTiposReportesParametroCarteraDefecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroCarteraDefecto() {
	//	return jComboBoxTiposReportesDinamicoParametroCarteraDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroCarteraDefecto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroCarteraDefecto) {
	//	this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto = jComboBoxTiposReportesDinamicoParametroCarteraDefecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto = jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto;
	//}
	
	public void setBorderResaltarTiposReportesParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroCarteraDefecto() {
		return this.jComboBoxTiposGraficosReportesParametroCarteraDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroCarteraDefecto(
			JComboBox jComboBoxTiposGraficosReportesParametroCarteraDefecto) {
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto = jComboBoxTiposGraficosReportesParametroCarteraDefecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroCarteraDefecto() {
		return this.jComboBoxTiposPaginacionParametroCarteraDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroCarteraDefecto(
			JComboBox jComboBoxTiposPaginacionParametroCarteraDefecto) {
		this.jComboBoxTiposPaginacionParametroCarteraDefecto = jComboBoxTiposPaginacionParametroCarteraDefecto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroCarteraDefecto() {
		return this.jComboBoxTiposRelacionesParametroCarteraDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCarteraDefecto() {
		return this.jComboBoxTiposAccionesParametroCarteraDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCarteraDefecto(
			JComboBox jComboBoxTiposRelacionesParametroCarteraDefecto) {
		this.jComboBoxTiposRelacionesParametroCarteraDefecto = jComboBoxTiposRelacionesParametroCarteraDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCarteraDefecto(
			JComboBox jComboBoxTiposAccionesParametroCarteraDefecto) {
		this.jComboBoxTiposAccionesParametroCarteraDefecto = jComboBoxTiposAccionesParametroCarteraDefecto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroCarteraDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroCarteraDefecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroCarteraDefecto() {
	//	return jCheckBoxConGraficoDinamicoParametroCarteraDefecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroCarteraDefecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroCarteraDefecto) {
	//	this.jCheckBoxConGraficoDinamicoParametroCarteraDefecto = jCheckBoxConGraficoDinamicoParametroCarteraDefecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroCarteraDefecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroCarteraDefecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroCarteraDefecto .setBorder(borderResaltar);		
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
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCarteraDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Cartera Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroCarteraDefecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"nuevo","nuevo","Nuevo"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"duplicar","duplicar","Duplicar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"copiar","copiar","Copiar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"ver_form","ver_form","Ver"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"recargar","recargar","Recargar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroCarteraDefecto,this.jTtoolBarParametroCarteraDefecto,
							"cerrar","cerrar","Salir"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroCarteraDefecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroCarteraDefecto;
			
				this.jButtonProcesarInformacionToolBarParametroCarteraDefecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroCarteraDefecto;
				
		//protected JButton jButtonModificarToolBarParametroCarteraDefecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroCarteraDefecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroCarteraDefecto=new JMenuMe("General");
		this.jmenuArchivoParametroCarteraDefecto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroCarteraDefecto=new JMenuMe("Acciones");
		this.jmenuDatosParametroCarteraDefecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCarteraDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCarteraDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCarteraDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroCarteraDefecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroCarteraDefecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroCarteraDefecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroCarteraDefecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroCarteraDefecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroCarteraDefecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroCarteraDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCarteraDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCarteraDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroCarteraDefecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroCarteraDefecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroCarteraDefecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroCarteraDefecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroCarteraDefecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroCarteraDefecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroCarteraDefecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroCarteraDefecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroCarteraDefecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCarteraDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCarteraDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCarteraDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroCarteraDefecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroCarteraDefecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroCarteraDefecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroCarteraDefecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroCarteraDefecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroCarteraDefecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroCarteraDefecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroCarteraDefecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroCarteraDefecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroCarteraDefecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroCarteraDefecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroCarteraDefecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroCarteraDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroCarteraDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroCarteraDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCarteraDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCarteraDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCarteraDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroCarteraDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroCarteraDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroCarteraDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroCarteraDefecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroCarteraDefecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroCarteraDefecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroCarteraDefecto.add(this.jMenuItemCerrarParametroCarteraDefecto);
			
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemNuevoParametroCarteraDefecto);
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemNuevoGuardarCambiosParametroCarteraDefecto);
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemNuevoRelacionesParametroCarteraDefecto);
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemGuardarCambiosTablaParametroCarteraDefecto);		
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemDuplicarParametroCarteraDefecto);		
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemCopiarParametroCarteraDefecto);		
			this.jmenuAccionesParametroCarteraDefecto.add(this.jMenuItemVerFormParametroCarteraDefecto);		
			
			this.jmenuDatosParametroCarteraDefecto.add(this.jMenuItemRecargarInformacionParametroCarteraDefecto);				
			this.jmenuDatosParametroCarteraDefecto.add(this.jMenuItemAnterioresParametroCarteraDefecto);				
			this.jmenuDatosParametroCarteraDefecto.add(this.jMenuItemSiguientesParametroCarteraDefecto);				
			this.jmenuDatosParametroCarteraDefecto.add(this.jMenuItemAbrirOrderByParametroCarteraDefecto);				
			this.jmenuDatosParametroCarteraDefecto.add(this.jMenuItemMostrarOcultarParametroCarteraDefecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroCarteraDefecto.add(this.jMenuItemGuardarCambiosParametroCarteraDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroCarteraDefecto.add(this.jmenuArchivoParametroCarteraDefecto);		
			this.jmenuBarParametroCarteraDefecto.add(this.jmenuAccionesParametroCarteraDefecto);		
			this.jmenuBarParametroCarteraDefecto.add(this.jmenuDatosParametroCarteraDefecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroCarteraDefecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroCarteraDefecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadParametroCarteraDefecto.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdCiudadParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdCiudadParametroCarteraDefecto.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadParametroCarteraDefecto,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableParametroCarteraDefecto.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdCuentaContableParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdCuentaContableParametroCarteraDefecto.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableParametroCarteraDefecto,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDiaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDiaParametroCarteraDefecto.setToolTipText("Buscar Por Dia ");
		this.jButtonFK_IdDiaParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdDiaParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdDiaParametroCarteraDefecto.setToolTipText("Buscar Por Dia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDiaParametroCarteraDefecto,"buscar_button","Buscar Por Dia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDiaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_diaFK_IdDiaParametroCarteraDefecto = new JLabelMe();
		jLabelid_diaFK_IdDiaParametroCarteraDefecto.setText("Dia :");
		jLabelid_diaFK_IdDiaParametroCarteraDefecto.setToolTipText("Dia");
		jLabelid_diaFK_IdDiaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_diaFK_IdDiaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_diaFK_IdDiaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_diaFK_IdDiaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_diaFK_IdDiaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_diaFK_IdDiaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaFK_IdDiaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaFK_IdDiaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaFK_IdDiaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoCivilParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCivilParametroCarteraDefecto.setToolTipText("Buscar Por Estado Civil ");
		this.jButtonFK_IdEstadoCivilParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdEstadoCivilParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdEstadoCivilParametroCarteraDefecto.setToolTipText("Buscar Por Estado Civil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCivilParametroCarteraDefecto,"buscar_button","Buscar Por Estado Civil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCivilParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto = new JLabelMe();
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setText("Estado Civil :");
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setToolTipText("Estado Civil");
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilFK_IdEstadoCivilParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoLegalParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoLegalParametroCarteraDefecto.setToolTipText("Buscar Por Estado Legal ");
		this.jButtonFK_IdEstadoLegalParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdEstadoLegalParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdEstadoLegalParametroCarteraDefecto.setToolTipText("Buscar Por Estado Legal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoLegalParametroCarteraDefecto,"buscar_button","Buscar Por Estado Legal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoLegalParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto = new JLabelMe();
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setText("Estado Legal :");
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setToolTipText("Estado Legal");
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalFK_IdEstadoLegalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisParametroCarteraDefecto.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdPaisParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdPaisParametroCarteraDefecto.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisParametroCarteraDefecto,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisParametroCarteraDefecto = new JLabelMe();
		jLabelid_paisFK_IdPaisParametroCarteraDefecto.setText("Pais :");
		jLabelid_paisFK_IdPaisParametroCarteraDefecto.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisNacionalidadParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisNacionalidadParametroCarteraDefecto.setToolTipText("Buscar Por Pais Nacionalad ");
		this.jButtonFK_IdPaisNacionalidadParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdPaisNacionalidadParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdPaisNacionalidadParametroCarteraDefecto.setToolTipText("Buscar Por Pais Nacionalad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisNacionalidadParametroCarteraDefecto,"buscar_button","Buscar Por Pais Nacionalad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisNacionalidadParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto = new JLabelMe();
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setText("Pais Nacionalad :");
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setToolTipText("Pais Nacionalad");
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pais_nacionalidadFK_IdPaisNacionalidadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaParametroCarteraDefecto.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdProvinciaParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdProvinciaParametroCarteraDefecto.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaParametroCarteraDefecto,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRegionParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRegionParametroCarteraDefecto.setToolTipText("Buscar Por Region ");
		this.jButtonFK_IdRegionParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdRegionParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdRegionParametroCarteraDefecto.setToolTipText("Buscar Por Region ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRegionParametroCarteraDefecto,"buscar_button","Buscar Por Region ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRegionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_regionFK_IdRegionParametroCarteraDefecto = new JLabelMe();
		jLabelid_regionFK_IdRegionParametroCarteraDefecto.setText("Region :");
		jLabelid_regionFK_IdRegionParametroCarteraDefecto.setToolTipText("Region");
		jLabelid_regionFK_IdRegionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionFK_IdRegionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionFK_IdRegionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_regionFK_IdRegionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_regionFK_IdRegionParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_regionFK_IdRegionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionFK_IdRegionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionFK_IdRegionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionFK_IdRegionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRutaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRutaParametroCarteraDefecto.setToolTipText("Buscar Por Ruta ");
		this.jButtonFK_IdRutaParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdRutaParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdRutaParametroCarteraDefecto.setToolTipText("Buscar Por Ruta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRutaParametroCarteraDefecto,"buscar_button","Buscar Por Ruta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRutaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto = new JLabelMe();
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto.setText("Ruta :");
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto.setToolTipText("Ruta");
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rutaFK_IdRutaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rutaFK_IdRutaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rutaFK_IdRutaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGeneroParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGeneroParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Genero ");
		this.jButtonFK_IdTipoGeneroParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdTipoGeneroParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdTipoGeneroParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Genero ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGeneroParametroCarteraDefecto,"buscar_button","Buscar Por Tipo Genero ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGeneroParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto = new JLabelMe();
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setText("Tipo Genero :");
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setToolTipText("Tipo Genero");
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoFK_IdTipoGeneroParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIdentificacionParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIdentificacionParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdTipoIdentificacionParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdTipoIdentificacionParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdTipoIdentificacionParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIdentificacionParametroCarteraDefecto,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIdentificacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto = new JLabelMe();
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setText("Tipo Identificacion :");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setToolTipText("Tipo Identificacion");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoListaPrecioParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoListaPrecioParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Lista Precio ");
		this.jButtonFK_IdTipoListaPrecioParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdTipoListaPrecioParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdTipoListaPrecioParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Lista Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoListaPrecioParametroCarteraDefecto,"buscar_button","Buscar Por Tipo Lista Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoListaPrecioParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto = new JLabelMe();
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setText("Tipo Lista Precio :");
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setToolTipText("Tipo Lista Precio");
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_lista_precioFK_IdTipoListaPrecioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoNivelEduParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoNivelEduParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Nivel Edu ");
		this.jButtonFK_IdTipoNivelEduParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdTipoNivelEduParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdTipoNivelEduParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Nivel Edu ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoNivelEduParametroCarteraDefecto,"buscar_button","Buscar Por Tipo Nivel Edu ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoNivelEduParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto = new JLabelMe();
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setText("Tipo Nivel Edu :");
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setToolTipText("Tipo Nivel Edu");
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nivel_eduFK_IdTipoNivelEduParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdTipoPrecioParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdTipoPrecioParametroCarteraDefecto.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioParametroCarteraDefecto,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorParametroCarteraDefecto.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdVendedorParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdVendedorParametroCarteraDefecto.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorParametroCarteraDefecto,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaParametroCarteraDefecto.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaParametroCarteraDefecto= new JButtonMe();
		this.jButtonFK_IdZonaParametroCarteraDefecto.setText("Buscar");
		this.jButtonFK_IdZonaParametroCarteraDefecto.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaParametroCarteraDefecto,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto = new JLabelMe();
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto.setText("Zona :");
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroCarteraDefecto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroCarteraDefecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroCarteraDefecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroCarteraDefecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroCarteraDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroCarteraDefecto = new ParametroCarteraDefectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Cartera Defecto DATOS");
			this.jInternalFrameDetalleFormParametroCarteraDefecto = new ParametroCarteraDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroCarteraDefecto = null;//new ParametroCarteraDefectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCarteraDefecto= new GridBagLayout();
		
		
		this.jTableDatosParametroCarteraDefecto = new JTableMe();      
		
		String sToolTipParametroCarteraDefecto="";
		sToolTipParametroCarteraDefecto=ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCarteraDefecto+="(Cartera.ParametroCarteraDefecto)";
		}
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCarteraDefecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroCarteraDefecto.setToolTipText(sToolTipParametroCarteraDefecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroCarteraDefecto);
		this.jTableDatosParametroCarteraDefecto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroCarteraDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroCarteraDefecto.setRowSelectionAllowed(true);
		this.jTableDatosParametroCarteraDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroCarteraDefecto = new JButtonMe();
		this.jButtonDuplicarParametroCarteraDefecto = new JButtonMe();
		this.jButtonCopiarParametroCarteraDefecto = new JButtonMe();
		this.jButtonVerFormParametroCarteraDefecto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroCarteraDefecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto = new JButtonMe();
		this.jButtonCerrarParametroCarteraDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroCarteraDefecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroCarteraDefecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioubicacionParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioproveedorParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Cartera Defecto";
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCarteraDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCarteraDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroCarteraDefecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setName("jPanelCamposFinubicacionParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));
		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setName("jPanelCamposFinproveedorParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioproveedorParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableParametroCarteraDefecto.setName("jPanelCamposFincontableParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroCarteraDefecto=new ReporteDinamicoJInternalFrame(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroCarteraDefecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroCarteraDefecto=new ImportacionJInternalFrame(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroCarteraDefecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroCarteraDefecto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroCarteraDefecto.setText("Orden");
		this.jButtonAbrirOrderByParametroCarteraDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCarteraDefecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCarteraDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCarteraDefecto,false,this);
			
			//this.cargarOrderByParametroCarteraDefecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCarteraDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCarteraDefecto,true,this);
			
			//this.cargarOrderByParametroCarteraDefecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroCarteraDefecto.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosParametroCarteraDefecto.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosParametroCarteraDefecto.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroCarteraDefecto.setText("Nuevo");
		this.jButtonDuplicarParametroCarteraDefecto.setText("Duplicar");
		this.jButtonCopiarParametroCarteraDefecto.setText("Copiar");
		this.jButtonVerFormParametroCarteraDefecto.setText("Ver");
		this.jButtonNuevoRelacionesParametroCarteraDefecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.setText("Guardar");
		this.jButtonCerrarParametroCarteraDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCarteraDefecto,"nuevo_button","Nuevo",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroCarteraDefecto,"duplicar_button","Duplicar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroCarteraDefecto,"copiar_button","Copiar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroCarteraDefecto,"ver_form","Ver",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroCarteraDefecto,"nuevorelaciones_button","Nuevo Rel",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCarteraDefecto,"guardarcambiostabla_button","Guardar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCarteraDefecto,"cerrar_button","Salir",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroCarteraDefecto.setToolTipText("Nuevo"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroCarteraDefecto.setToolTipText("Duplicar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroCarteraDefecto.setToolTipText("Copiar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroCarteraDefecto.setToolTipText("Ver"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroCarteraDefecto.setToolTipText("Nuevo Rel"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.setToolTipText("Guardar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCarteraDefecto.setToolTipText("Salir"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCarteraDefecto";
		inputMap = this.jButtonNuevoParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCarteraDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCarteraDefecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroCarteraDefecto";
		inputMap = this.jButtonDuplicarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroCarteraDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroCarteraDefecto"));
		
		//COPIAR
		sMapKey = "CopiarParametroCarteraDefecto";
		inputMap = this.jButtonCopiarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroCarteraDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroCarteraDefecto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroCarteraDefecto";
		inputMap = this.jButtonVerFormParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroCarteraDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroCarteraDefecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroCarteraDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroCarteraDefecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroCarteraDefecto";
		inputMap = this.jButtonModificarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroCarteraDefecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroCarteraDefecto";
		inputMap = this.jButtonCerrarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCarteraDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCarteraDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCarteraDefecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroCarteraDefecto.setName("jPanelParametrosReportesParametroCarteraDefecto"); 
		
		this.jPanelParametrosReportesAccionesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroCarteraDefecto.setName("jPanelParametrosReportesAccionesParametroCarteraDefecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroCarteraDefecto = new JButtonMe();
		this.jButtonRecargarInformacionParametroCarteraDefecto.setText("Recargar");
		this.jButtonRecargarInformacionParametroCarteraDefecto.setToolTipText("Recargar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroCarteraDefecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroCarteraDefecto = new JButtonMe();
		this.jButtonProcesarInformacionParametroCarteraDefecto.setText("Procesar");
		this.jButtonProcesarInformacionParametroCarteraDefecto.setToolTipText("Procesar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroCarteraDefecto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroCarteraDefecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCarteraDefecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCarteraDefecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroCarteraDefecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroCarteraDefecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroCarteraDefecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroCarteraDefecto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroCarteraDefecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCarteraDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroCarteraDefecto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCarteraDefecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroCarteraDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroCarteraDefecto.setText("Acciones");		
		this.jLabelAccionesParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroCarteraDefecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroCarteraDefecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroCarteraDefecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroCarteraDefecto = new JButtonMe();
		//this.jButtonAnterioresParametroCarteraDefecto.setText("<<");
        this.jButtonAnterioresParametroCarteraDefecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroCarteraDefecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroCarteraDefecto = new JButtonMe();
		//this.jButtonSiguientesParametroCarteraDefecto.setText(">>");
        this.jButtonSiguientesParametroCarteraDefecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroCarteraDefecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroCarteraDefecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroCarteraDefecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroCarteraDefecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroCarteraDefecto,"nuevoguardarcambios_button","Nue",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroCarteraDefecto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroCarteraDefecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroCarteraDefecto";
		inputMap = this.jButtonRecargarInformacionParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroCarteraDefecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroCarteraDefecto";
		inputMap = this.jButtonSiguientesParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroCarteraDefecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroCarteraDefecto";
		inputMap = this.jButtonAnterioresParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroCarteraDefecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroCarteraDefecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroCarteraDefecto.setMinimumSize(new Dimension(this.getWidth(),ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCarteraDefecto.setMaximumSize(new Dimension(this.getWidth(),ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCarteraDefecto.setPreferredSize(new Dimension(this.getWidth(),ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroCarteraDefecto = new GridBagLayout();

			this.jPanelPaginacionParametroCarteraDefecto.setLayout(gridaBagLayoutPaginacionParametroCarteraDefecto);						
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonAnterioresParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					
						
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
			
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonNuevoGuardarCambiosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
						
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonSiguientesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonNuevoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
						
			
			
			if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
				this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonGuardarCambiosTablaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			}
			
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonDuplicarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonCopiarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonVerFormParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 1;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroCarteraDefecto.add(this.jButtonCerrarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
		
		
		this.jButtonRecargarInformacionParametroCarteraDefecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCarteraDefecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCarteraDefecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCarteraDefecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroCarteraDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCarteraDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCarteraDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCarteraDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroCarteraDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCarteraDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCarteraDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroCarteraDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCarteraDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCarteraDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCarteraDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCarteraDefecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroCarteraDefecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCarteraDefecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCarteraDefecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroCarteraDefecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCarteraDefecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCarteraDefecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroCarteraDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroCarteraDefecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroCarteraDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroCarteraDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroCarteraDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroCarteraDefecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroCarteraDefecto.setLayout(gridaBagParametrosReportesParametroCarteraDefecto);
			this.jPanelParametrosReportesAccionesParametroCarteraDefecto.setLayout(gridaBagParametrosReportesAccionesParametroCarteraDefecto);
			
			
			this.jPanelParametrosAuxiliar1ParametroCarteraDefecto.setLayout(gridaBagParametrosAuxiliar1ParametroCarteraDefecto);
			this.jPanelParametrosAuxiliar2ParametroCarteraDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroCarteraDefecto);
			this.jPanelParametrosAuxiliar3ParametroCarteraDefecto.setLayout(gridaBagParametrosAuxiliar3ParametroCarteraDefecto);
			this.jPanelParametrosAuxiliar4ParametroCarteraDefecto.setLayout(gridaBagParametrosAuxiliar4ParametroCarteraDefecto);
			//this.jPanelParametrosAuxiliar5ParametroCarteraDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroCarteraDefecto);			
			
			
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jButtonRecargarInformacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCarteraDefecto.add(this.jComboBoxTiposPaginacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCarteraDefecto.add(this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCarteraDefecto.add(this.jComboBoxTiposArchivosReportesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jPanelParametrosAuxiliar1ParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroCarteraDefecto.add(this.jComboBoxTiposReportesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jPanelParametrosAuxiliar4ParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jComboBoxTiposReportesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jCheckBoxGenerarReporteParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jPanelParametrosAuxiliar2ParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jLabelAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jButtonAbrirOrderByParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jComboBoxTiposSeleccionarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			
			
			/*
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jCheckBoxSeleccionarTodosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCarteraDefecto.add(this.jCheckBoxSeleccionarTodosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);															
				
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCarteraDefecto.add(this.jCheckBoxSeleccionadosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jPanelParametrosAuxiliar3ParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jComboBoxTiposAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
	
				
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCarteraDefecto.add(this.jTextFieldValorCampoGeneralParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposInicioubicacionParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setLayout(gridaBagLayoutCamposInicioubicacionParametroCarteraDefecto);

		GridBagLayout gridaBagLayoutCamposInicioproveedorParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setLayout(gridaBagLayoutCamposInicioproveedorParametroCarteraDefecto);

		GridBagLayout gridaBagLayoutCamposIniciocontableParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposIniciocontableParametroCarteraDefecto.setLayout(gridaBagLayoutCamposIniciocontableParametroCarteraDefecto);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroCarteraDefecto = new GridBagLayout();

			this.jScrollPanelDatosParametroCarteraDefecto.setLayout(gridaBagLayoutDatosParametroCarteraDefecto);
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
			
			this.jScrollPanelDatosParametroCarteraDefecto.add(this.jTableDatosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroCarteraDefecto.setViewportView(this.jTableDatosParametroCarteraDefecto);
		this.jTableDatosParametroCarteraDefecto.setFillsViewportHeight(true);
		this.jTableDatosParametroCarteraDefecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroCarteraDefecto= new GridBagLayout();
		this.jPanelAccionesParametroCarteraDefecto.setLayout(gridaBagLayoutAccionesParametroCarteraDefecto);
		
		
		/*	
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
			
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonNuevoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCarteraDefecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroCarteraDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCarteraDefecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;		
		//this.gridBagConstraintsParametroCarteraDefecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroCarteraDefecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);								
		
		
		/*
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		*/		
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx =0;
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCarteraDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
				
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroCarteraDefectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroCarteraDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCarteraDefecto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroCarteraDefecto.setLayout(gridaBagLayoutBusquedasParametrosParametroCarteraDefecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroCarteraDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroCarteraDefecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroCarteraDefecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroCarteraDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroCarteraDefecto.setName("jPanelReporteDinamicoParametroCarteraDefecto"); 
		
		this.jPanelReporteDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroCarteraDefecto.setLayout(gridaBagLayoutReporteDinamicoParametroCarteraDefecto);
		
		
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCarteraDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroCarteraDefecto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroCarteraDefecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jLabelColumnasSelectReporteParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroCarteraDefecto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroCarteraDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroCarteraDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroCarteraDefecto=new JScrollPane(this.jListColumnasSelectReporteParametroCarteraDefecto);
			
			this.jScrollColumnasSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jListColumnasSelectReporteParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jScrollColumnasSelectReporteParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroCarteraDefecto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroCarteraDefecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroCarteraDefecto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroCarteraDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroCarteraDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroCarteraDefecto=new JScrollPane(this.jListRelacionesSelectReporteParametroCarteraDefecto);
			
			this.jScrollRelacionesSelectReporteParametroCarteraDefecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCarteraDefecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCarteraDefecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroCarteraDefecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroCarteraDefecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroCarteraDefecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jLabelGenerarExcelReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto.setToolTipText("Generar EXCEL"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jButtonGenerarExcelReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jComboBoxTiposReportesDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jLabelTiposArchivoReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroCarteraDefecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroCarteraDefecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroCarteraDefecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroCarteraDefecto.setToolTipText("Generar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jButtonGenerarReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroCarteraDefecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroCarteraDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroCarteraDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroCarteraDefecto.setToolTipText("Cancelar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCarteraDefecto.add(this.jButtonCerrarReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroCarteraDefecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto= new JScrollPane(jPanelReporteDinamicoParametroCarteraDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroCarteraDefecto);
		this.jInternalFrameReporteDinamicoParametroCarteraDefecto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroCarteraDefecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroCarteraDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroCarteraDefecto.setName("jPanelImportacionParametroCarteraDefecto"); 
		
		this.jPanelImportacionParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroCarteraDefecto.setLayout(gridaBagLayoutImportacionParametroCarteraDefecto);
		
		
		this.jInternalFrameImportacionParametroCarteraDefecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroCarteraDefecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroCarteraDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCarteraDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroCarteraDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCarteraDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroCarteraDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCarteraDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCarteraDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroCarteraDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCarteraDefecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroCarteraDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCarteraDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCarteraDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroCarteraDefecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroCarteraDefecto = new JLabelMe();

		this.jLabelArchivoImportacionParametroCarteraDefecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCarteraDefecto.add(this.jLabelArchivoImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroCarteraDefecto = new JFileChooser();		
		this.jFileChooserImportacionParametroCarteraDefecto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroCarteraDefecto = new JButtonMe();
		this.jButtonAbrirImportacionParametroCarteraDefecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroCarteraDefecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroCarteraDefecto.setToolTipText("Generar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCarteraDefecto.add(this.jButtonAbrirImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroCarteraDefecto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroCarteraDefecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCarteraDefecto.add(this.jLabelPathArchivoImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroCarteraDefecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroCarteraDefecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCarteraDefecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCarteraDefecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCarteraDefecto.add(this.jTextFieldPathArchivoImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroCarteraDefecto = new JButtonMe();
		this.jButtonGenerarImportacionParametroCarteraDefecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroCarteraDefecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroCarteraDefecto.setToolTipText("Generar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCarteraDefecto.add(this.jButtonGenerarImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroCarteraDefecto = new JButtonMe();
		this.jButtonCerrarImportacionParametroCarteraDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroCarteraDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroCarteraDefecto.setToolTipText("Cancelar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCarteraDefecto.add(this.jButtonCerrarImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroCarteraDefecto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroCarteraDefecto= new JScrollPane(jPanelImportacionParametroCarteraDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroCarteraDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroCarteraDefecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroCarteraDefecto);
		this.jInternalFrameImportacionParametroCarteraDefecto.getContentPane().add(this.jScrollPanelImportacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroCarteraDefecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroCarteraDefecto = new JButtonMe();
			this.jButtonAbrirOrderByParametroCarteraDefecto.setText("Orden");
			this.jButtonAbrirOrderByParametroCarteraDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCarteraDefecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroCarteraDefecto";
			inputMap = this.jButtonAbrirOrderByParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroCarteraDefecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroCarteraDefecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroCarteraDefecto.setName("jPanelOrderByParametroCarteraDefecto"); 
			
			this.jPanelOrderByParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroCarteraDefecto.setLayout(gridaBagLayoutOrderByParametroCarteraDefecto);
			
			
			this.jTableDatosParametroCarteraDefectoOrderBy = new JTableMe();        
			this.jTableDatosParametroCarteraDefectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroCarteraDefectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroCarteraDefectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroCarteraDefectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroCarteraDefectoOrderBy.setViewportView(this.jTableDatosParametroCarteraDefectoOrderBy);
			this.jTableDatosParametroCarteraDefectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroCarteraDefectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroCarteraDefecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroCarteraDefecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroCarteraDefecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroCarteraDefecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroCarteraDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroCarteraDefecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroCarteraDefecto.setTitle("Orden");
			this.jInternalFrameOrderByParametroCarteraDefecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroCarteraDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroCarteraDefecto.setResizable(true);
			this.jInternalFrameOrderByParametroCarteraDefecto.setClosable(true);
			this.jInternalFrameOrderByParametroCarteraDefecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroCarteraDefecto.ipady =150;
				
			this.jPanelOrderByParametroCarteraDefecto.add(jScrollPanelDatosParametroCarteraDefectoOrderBy, this.gridBagConstraintsParametroCarteraDefecto);//this.jTableDatosParametroCarteraDefectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroCarteraDefecto = new JButtonMe();
			this.jButtonCerrarOrderByParametroCarteraDefecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroCarteraDefecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroCarteraDefecto.setToolTipText("Cancelar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroCarteraDefecto.add(this.jButtonCerrarOrderByParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroCarteraDefecto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroCarteraDefecto= new JScrollPane(jPanelOrderByParametroCarteraDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroCarteraDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroCarteraDefecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroCarteraDefecto);
			
			this.jInternalFrameOrderByParametroCarteraDefecto.getContentPane().add(this.jScrollPanelOrderByParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
		
		} else {
			this.jButtonAbrirOrderByParametroCarteraDefecto = new JButtonMe();
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
		int iWidthTableCalculado=0;//3930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocarteradefectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroCarteraDefecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroCarteraDefecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroCarteraDefecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroCarteraDefecto.getRowHeight();//ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.isSelected()) {
					iHeightTable=ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCarteraDefecto.isSelected()) {
					iHeightTable=ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCarteraDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroCarteraDefecto!=null && this.jInternalFrameOrderByParametroCarteraDefecto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroCarteraDefecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroCarteraDefecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroCarteraDefecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroCarteraDefecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroCarteraDefecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroCarteraDefecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroCarteraDefecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrocarteradefectoLogic.getParametroCarteraDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocarteradefectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroCarteraDefecto> TraerParametroCarteraDefectoBeans(List<ParametroCarteraDefecto> parametrocarteradefectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroCarteraDefecto parametrocarteradefecto:parametrocarteradefectos) {
					
				if(!(ParametroCarteraDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroCarteraDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrocarteradefecto.setsDetalleGeneralEntityReporte(ParametroCarteraDefectoConstantesFunciones.getParametroCarteraDefectoDescripcion(parametrocarteradefecto));
										
						
					
						
					
				} else  {
							
					//parametrocarteradefecto.setsDetalleGeneralEntityReporte(parametrocarteradefecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocarteradefectobeans.add(parametrocarteradefectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocarteradefectos;
    }
	//PARA REPORTES FIN
}
